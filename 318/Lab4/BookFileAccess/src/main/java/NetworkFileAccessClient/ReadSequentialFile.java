package NetworkFileAccessClient;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReadSequentialFile extends JFrame {
   private ObjectInputStream input;
   private BankUI userInterface;
   private JButton nextButton, openButton;

   public ReadSequentialFile() {
      super("Reading a Sequential File of Objects");

      userInterface = new BankUI(7);
      getContentPane().add(userInterface, BorderLayout.CENTER);

      openButton = userInterface.getDoTask1Button();
      openButton.setText("Open File");

      openButton.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent event) {
               openFile();
            }
         }
      );

      addWindowListener(
         new WindowAdapter() {
            public void windowClosing(WindowEvent event) {
               if (input != null)
                  closeFile();
               System.exit(0);
            }
         }
      );

      nextButton = userInterface.getDoTask2Button();
      nextButton.setText("Next Record");
      nextButton.setEnabled(false);

      nextButton.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent event) {
               readRecord();
            }
         }
      );

      pack();
      setBounds(150, 350, 400, 300);
      setVisible(true);
   }

   private void openFile() {
      JFileChooser fileChooser = new JFileChooser();
      fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

      int result = fileChooser.showOpenDialog(this);

      if (result == JFileChooser.CANCEL_OPTION)
         return;

      File fileName = fileChooser.getSelectedFile();

      if (fileName == null || fileName.getName().equals(""))
         JOptionPane.showMessageDialog(this, "Invalid File Name",
            "Invalid File Name", JOptionPane.ERROR_MESSAGE);
      else {
         try {
            input = new ObjectInputStream(new FileInputStream(fileName));
            openButton.setEnabled(false);
            nextButton.setEnabled(true);
         }
         catch (IOException ioException) {
            JOptionPane.showMessageDialog(this, "Error Opening File",
               "Error", JOptionPane.ERROR_MESSAGE);
         }
      }
   }

   public void readRecord() {
      Book record;

      try {
         record = (Book) input.readObject();

         String values[] = {
            record.getBookTitle(),
            record.getAuthor(),
            record.getIsbn(),
            String.valueOf(record.getEdition()),
            String.valueOf(record.getCopyrightYear()),
            String.valueOf(record.getPrice()),
            String.valueOf(record.getQuantityInStock())
         };

         userInterface.setFieldValues(values);
      }
      catch (EOFException endOfFileException) {
         nextButton.setEnabled(false);
         JOptionPane.showMessageDialog(this, "No more records in file",
            "End of File", JOptionPane.ERROR_MESSAGE);
      }
      catch (ClassNotFoundException classNotFoundException) {
         JOptionPane.showMessageDialog(this, "Unable to create object",
            "Class Not Found", JOptionPane.ERROR_MESSAGE);
      }
      catch (IOException ioException) {
         JOptionPane.showMessageDialog(this,
            "Error during read from file",
            "Read Error", JOptionPane.ERROR_MESSAGE);
      }
   }

   private void closeFile() {
      try {
         input.close();
         System.exit(0);
      }
      catch (IOException ioException) {
         JOptionPane.showMessageDialog(this, "Error closing file",
            "Error", JOptionPane.ERROR_MESSAGE);
         System.exit(1);
      }
   }

   public static void main(String args[]) {
      new ReadSequentialFile();
   }
}