package NetworkFileAccessClient;

import javax.net.ssl.*;
import java.io.*;
import java.net.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.security.cert.X509Certificate;

public class FileAccessClient extends JFrame {
   private ObjectOutputStream toServer;
   private ObjectInputStream fromServer;
   private String[] values;
   private File[] files;
   private InetAddress host;
   private String response;
   private JTextField ip;
   private JLabel iplabel, label;
   private JPanel ippane;
   private JList filelist;
   private SSLSocket sock;
   private BankUI userInterface;
   private JButton nextButton, connectButton, openButton;

   public FileAccessClient() {
      super("Reading a Sequential File across a secure network connection");

      userInterface = new BankUI(7);
      ip = new JTextField("localhost", 32);
      iplabel = new JLabel("Host IP ");
      filelist = new JList();
      ippane = new JPanel();
      ippane.setLayout(new GridLayout(1, 1));
      ippane.add(iplabel);
      ippane.add(ip);
      getContentPane().add(ippane, BorderLayout.NORTH);
      getContentPane().add(userInterface, BorderLayout.CENTER);
      getContentPane().add(new JScrollPane(filelist), BorderLayout.SOUTH);

      label = userInterface.getLabel();
      label.setText("");

      connectButton = userInterface.getDoTask1Button();
      connectButton.setText("Connect");

      connectButton.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent event) {
               try {
                  TrustManager[] trustAllCerts = new TrustManager[] {
                     new X509TrustManager() {
                        public X509Certificate[] getAcceptedIssuers() {
                           return null;
                        }
                        public void checkClientTrusted(X509Certificate[] certs, String authType) {
                        }
                        public void checkServerTrusted(X509Certificate[] certs, String authType) {
                        }
                     }
                  };

                  SSLContext sc = SSLContext.getInstance("SSL");
                  sc.init(null, trustAllCerts, new java.security.SecureRandom());

                  SSLSocketFactory factory = sc.getSocketFactory();

                  sock = (SSLSocket) factory.createSocket(
                     InetAddress.getByName(ip.getText()), 6868);

                  toServer = new ObjectOutputStream(sock.getOutputStream());
                  fromServer = new ObjectInputStream(sock.getInputStream());

                  files = (File[]) fromServer.readObject();
                  filelist.setListData(files);
                  connectButton.setEnabled(false);
                  nextButton.setEnabled(false);
                  label.setText("<html><Font Color=blue>" +
                     "Please double-click one of the data files below:" +
                     "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</Font></html>");
               }
               catch (Exception e) {
                  JOptionPane.showMessageDialog(null,
                     "Connection error: " + e.getMessage(),
                     "Error", JOptionPane.ERROR_MESSAGE);
               }
            }
         }
      );

      MouseListener mouseListener = new MouseAdapter() {
         public void mouseClicked(MouseEvent e) {
            if (e.getClickCount() == 2) {
               int i = filelist.locationToIndex(e.getPoint());
               try {
                  if (i < 0) return;

                  toServer.writeObject(files[i]);
                  response = (String) fromServer.readObject();

                  if (response.equals("directory")) {
                     toServer.writeObject("sendfiles");
                     files = (File[]) fromServer.readObject();
                     filelist.setListData(files);
                  }
                  else {
                     toServer.writeObject("openfile");
                     response = (String) fromServer.readObject();
                     if (response.equals("ready")) {
                        nextButton = userInterface.getDoTask2Button();
                        nextButton.setText("Next Record");
                        nextButton.setEnabled(true);
                        connectButton.setEnabled(false);
                        label.setText("");
                     }
                     else if (response.equals("invaliddatafile")) {
                        JOptionPane.showMessageDialog(null, "Invalid data file, try again!",
                           "Invalid data file", JOptionPane.ERROR_MESSAGE);
                     }
                  }
               }
               catch (IOException ioe) {
                  JOptionPane.showMessageDialog(null,
                     "Error processing file: " + ioe.getMessage(),
                     "Error", JOptionPane.ERROR_MESSAGE);
               }
               catch (ClassNotFoundException cnfe) {
                  JOptionPane.showMessageDialog(null,
                     "Error with data format: " + cnfe.getMessage(),
                     "Error", JOptionPane.ERROR_MESSAGE);
               }
            }
         }
      };

      filelist.addMouseListener(mouseListener);

      nextButton = userInterface.getDoTask2Button();
      nextButton.setText("Next Record");
      nextButton.setEnabled(false);

      nextButton.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent event) {
               try {
                  toServer.writeObject("nextrecord");
                  Book record = (Book) fromServer.readObject();

                  if (record != null) {
                     String[] values = {
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
                  else {
                     connectButton.setEnabled(true);
                     nextButton.setEnabled(false);
                     userInterface.clearFields();

                     Vector emptyfiles = new Vector();
                     filelist.setListData(emptyfiles);

                     JOptionPane.showMessageDialog(null, "No more records in file",
                        "End of File", JOptionPane.ERROR_MESSAGE);
                     toServer.close();
                     fromServer.close();
                     sock.close();
                  }
               }
               catch (IOException ioe) {}
               catch (ClassNotFoundException cnfe) {}
            }
         }
      );

      addWindowListener(
         new WindowAdapter() {
            public void windowClosing(WindowEvent event) {
               dispose();
               System.exit(0);
            }
         }
      );

      setBounds(350, 350, 500, 300);
      setVisible(true);
   }

   public static void main(String args[]) {
      FileAccessClient app = new FileAccessClient();
      app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}