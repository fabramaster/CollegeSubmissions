package NetworkFileAccessClient;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CreateSequentialFile extends JFrame {
   private ObjectOutputStream output;
   private BankUI userInterface;
   private JButton enterButton, openButton;

   public CreateSequentialFile() {
      super("Creating a Sequential File of Objects");

      userInterface = new BankUI(7);
      getContentPane().add(userInterface, BorderLayout.CENTER);

      openButton = userInterface.getDoTask1Button();
      openButton.setText("Save into File ...");

      openButton.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent event) {
               openFile();
            }
         }
      );

      enterButton = userInterface.getDoTask2Button();
      enterButton.setText("Enter");
      enterButton.setEnabled(false);

      enterButton.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent event) {
               addRecord();
            }
         }
      );

      addWindowListener(
         new WindowAdapter() {
            public void windowClosing(WindowEvent event) {
               if (output != null)
                  addRecord();
               closeFile();
            }
         }
      );

      setBounds(400, 400, 400, 300);
      setVisible(true);
   }

   private void openFile() {
      JFileChooser fileChooser = new JFileChooser();
      fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

      int result = fileChooser.showSaveDialog(this);

      if (result == JFileChooser.CANCEL_OPTION)
         return;

      File fileName = fileChooser.getSelectedFile();

      if (fileName == null || fileName.getName().equals(""))
         JOptionPane.showMessageDialog(this, "Invalid File Name",
            "Invalid File Name", JOptionPane.ERROR_MESSAGE);
      else {
         try {
            output = new ObjectOutputStream(new FileOutputStream(fileName));
            openButton.setEnabled(false);
            enterButton.setEnabled(true);
         }
         catch (IOException ioException) {
            JOptionPane.showMessageDialog(this, "Error Opening File",
               "Error", JOptionPane.ERROR_MESSAGE);
         }
      }
   }

   private void closeFile() {
      try {
         if (output != null)
            output.close();
         System.exit(0);
      }
      catch (IOException ioException) {
         JOptionPane.showMessageDialog(this, "Error closing file",
            "Error", JOptionPane.ERROR_MESSAGE);
         System.exit(1);
      }
   }

   public void addRecord() {
      String fieldValues[] = userInterface.getFieldValues();

      if (!fieldValues[BankUI.TITLE].equals("")) {
         try {
            String title = fieldValues[BankUI.TITLE].trim();
            String author = fieldValues[BankUI.AUTHOR].trim();
            String isbn = fieldValues[BankUI.ISBN].trim();
            
            int edition = Integer.parseInt(fieldValues[BankUI.EDITION].trim());
            int year = Integer.parseInt(fieldValues[BankUI.YEAR].trim());
            double price = Double.parseDouble(fieldValues[BankUI.PRICE].trim());
            int quantity = Integer.parseInt(fieldValues[BankUI.QUANTITY].trim());

            Book book = new Book(title, author, isbn, edition, year, price, quantity);
            output.writeObject(book);
            output.flush();
            userInterface.clearFields();
         }
         catch (NumberFormatException formatException) {
            JOptionPane.showMessageDialog(this,
               "Please check:\nEdition must be whole number\n" +
               "Year must be whole number\n" +
               "Price must be decimal number\n" +
               "Quantity must be whole number",
               "Invalid Number Format",
               JOptionPane.ERROR_MESSAGE);
         }
         catch (IOException ioException) {
            JOptionPane.showMessageDialog(this, "Error writing to file",
               "IO Exception", JOptionPane.ERROR_MESSAGE);
            closeFile();
         }
      }
   }

   public static void main(String args[]) {
      new CreateSequentialFile();
   }
}