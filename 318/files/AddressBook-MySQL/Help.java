// Help.java
// Class Help definition

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Help implements ActionListener {
   private JTextArea output;

   public Help( JTextArea o )
   {
      output = o;
   }

   public void actionPerformed( ActionEvent e )
   {
      output.append( "\nClick Find to locate a record.\n" +
                     "Click Add to insert a new record.\n" +
                     "Click Update to update " +
                     "the information in a record.\n" +
                     "Click Clear to empty" +
                     " the textfields.\n" );
   }
}