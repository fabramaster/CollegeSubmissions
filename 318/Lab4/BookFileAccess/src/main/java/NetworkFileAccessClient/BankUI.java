package NetworkFileAccessClient;

import java.awt.*;
import javax.swing.*;

public class BankUI extends JPanel {
   protected final static String names[] = { "Book Title", "Author", "ISBN", 
      "Edition", "Copyright Year", "Price", "Quantity in Stock" };

   protected JLabel labels[], label;
   protected JTextField fields[];
   protected JButton doTask1, doTask2;
   protected JPanel innerPanelCenter, innerPanelSouth;

   protected int size;

   public static final int TITLE = 0, AUTHOR = 1, ISBN = 2,
      EDITION = 3, YEAR = 4, PRICE = 5, QUANTITY = 6;

   public BankUI(int mySize) {
      size = mySize;
      labels = new JLabel[size];
      fields = new JTextField[size];

      for (int count = 0; count < labels.length; count++)
         labels[count] = new JLabel(names[count]);

      for (int count = 0; count < fields.length; count++)
         fields[count] = new JTextField();

      innerPanelCenter = new JPanel();
      innerPanelCenter.setLayout(new GridLayout(size, 2));

      for (int count = 0; count < size; count++) {
         innerPanelCenter.add(labels[count]);
         innerPanelCenter.add(fields[count]);
      }

      doTask1 = new JButton();
      doTask2 = new JButton();

      label = new JLabel();

      innerPanelSouth = new JPanel();
      innerPanelSouth.add(label);
      innerPanelSouth.add(doTask1);
      innerPanelSouth.add(doTask2);

      setLayout(new BorderLayout());
      add(innerPanelCenter, BorderLayout.CENTER);
      add(innerPanelSouth, BorderLayout.SOUTH);
   }

   public JButton getDoTask1Button() {
      return doTask1;
   }

   public JButton getDoTask2Button() {
      return doTask2;
   }

   public JLabel getLabel() {
      return label;
   }

   public JTextField[] getFields() {
      return fields;
   }

   public void clearFields() {
      for (int count = 0; count < size; count++)
         fields[count].setText("");
   }

   public void setFieldValues(String strings[]) throws IllegalArgumentException {
      if (strings.length != size)
         throw new IllegalArgumentException("There must be " + size + " Strings in the array");

      for (int count = 0; count < size; count++)
         fields[count].setText(strings[count]);
   }

   public String[] getFieldValues() {
      String values[] = new String[size];

      for (int count = 0; count < size; count++)
         values[count] = fields[count].getText();

      return values;
   }
}