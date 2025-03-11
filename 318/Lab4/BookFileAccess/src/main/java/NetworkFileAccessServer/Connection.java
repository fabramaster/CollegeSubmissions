package NetworkFileAccessServer;

/**
 * This is the separate thread that services each
 * incoming echo client request.
 */

import javax.net.ssl.*;
import java.net.*;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

public class Connection implements Runnable {
   private SSLSocket client;
   private FileSystemView fsview;
   private ObjectInputStream input;

   public Connection(SSLSocket client) {
      this.client = client;
   }

   public void run() {
      try {
         process(client);
      }
      catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void process(SSLSocket client) throws IOException {
      Book record;
      File[] allfiles = null;
      File[] files;
      File current, parent;
      String cmd;
      boolean validfile;
      ObjectInputStream fromClient = null;
      ObjectOutputStream toClient = null;
      boolean filefound = true;

      try {
         /**
          * get the input and output streams associated with the socket.
          */
         fromClient = new ObjectInputStream(client.getInputStream());
         toClient = new ObjectOutputStream(client.getOutputStream());

         try {
            fsview = FileSystemView.getFileSystemView();
            current = new File(new File(".").getAbsolutePath());
            files = fsview.getFiles(current, true);
            parent = fsview.getParentDirectory(current);
            allfiles = addparent(files, parent);
            toClient.writeObject(allfiles);

            filefound = false;
            while (!filefound) {
               current = (File) fromClient.readObject();
               if (current.isDirectory())
                  toClient.writeObject("directory");
               else
                  toClient.writeObject("file");

               cmd = (String) fromClient.readObject();

               while (cmd.equals("sendfiles")) {
                  files = fsview.getFiles(current, true);
                  parent = fsview.getParentDirectory(current);
                  allfiles = addparent(files, parent);
                  toClient.writeObject(allfiles);
                  current = (File) fromClient.readObject();

                  if (current.isDirectory())
                     toClient.writeObject("directory");
                  else
                     toClient.writeObject("file");

                  cmd = (String) fromClient.readObject();
               }

               validfile = isValidFile(current);
               if (validfile) {
                  input = new ObjectInputStream(new FileInputStream(current));
                  toClient.writeObject("ready");
                  filefound = true;
                  boolean done = false;
                  while (!done) {
                     cmd = (String) fromClient.readObject();
                     if (cmd.equals("nextrecord")) {
                        record = readRecord();
                        if (record != null)
                           toClient.writeObject(record);
                        else {
                           done = true;
                           toClient.writeObject(null);
                        }
                     }
                  }
                  input.close();
               }
               else {
                  toClient.writeObject("invaliddatafile");
                  filefound = false;
               }
            }

            fromClient.close();
            toClient.close();
         }
         catch (IOException ioException) {
            if (!filefound)
               JOptionPane.showMessageDialog(null, "Error Opening File",
                  "Error", JOptionPane.ERROR_MESSAGE);
         }
         catch (ClassNotFoundException e) {}

         toClient.close();
      }
      catch (IOException ioe) {
         System.err.println(ioe);
      }
      finally {
         if (fromClient != null)
            fromClient.close();
         if (toClient != null)
            toClient.close();
         if (client != null)
            client.close();
      }
   }

   public File[] addparent(File[] files, File parent) {
      File[] allfiles = new File[files.length + 1];
      allfiles[0] = parent;
      for (int i = 0; i < files.length; i++)
         allfiles[i + 1] = files[i];
      return allfiles;
   }

   public boolean isValidFile(File current) {
      Book record;
      try {
         ObjectInputStream input = new ObjectInputStream(new FileInputStream(current));
         record = (Book) input.readObject();
         input.close();
         return true;
      }
      catch (IOException e) {
         System.out.println("IO - file chosen: " + current.getAbsolutePath());
         return false;
      }
      catch (ClassNotFoundException e) {
         System.out.println("Class - file chosen: " + current.getAbsolutePath());
         return false;
      }
      catch (RuntimeException e) {
         System.out.println("Runtime -file chosen: " + e);
         return false;
      }
   }

   public Book readRecord() {
      Book record;

      try {
         record = (Book) input.readObject();
         return record;
      }
      catch (EOFException endOfFileException) {
      }
      catch (ClassNotFoundException classNotFoundException) {
         JOptionPane.showMessageDialog(null, "Unable to create object",
            "Class Not Found", JOptionPane.ERROR_MESSAGE);
      }
      catch (IOException ioException) {
         JOptionPane.showMessageDialog(null,
            "Error during read from file",
            "Read Error", JOptionPane.ERROR_MESSAGE);
      }
      return null;
   }
}