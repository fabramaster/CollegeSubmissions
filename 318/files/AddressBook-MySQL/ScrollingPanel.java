// ScrollingPanel.java
// Class ScrollingPanel

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ScrollingPanel extends JPanel {
   private JPanel labelPanel, fieldsPanel;
   private String labels[] =
                 { "ID number:", "First name:", "Last name:",
                   "Address:", "City:", "State/Province:",
                   "PostalCode:", "Country:", "Email:",
                   "Home phone:", "Fax Number:" };
   JTextField id, first, last, address,     // package access
              city, state, zip,
              country, email, home, fax;

   public ScrollingPanel()
   {
      // Label panel
      labelPanel = new JPanel();
      labelPanel.setLayout(
                       new GridLayout( labels.length, 1 ) );

      ImageIcon ii = new ImageIcon( "images/icon.jpg" );

      for ( int i = 0; i < labels.length; i++ )
         labelPanel.add( new JLabel( labels[ i ], ii, 0) );

      // TextField panel
      fieldsPanel = new JPanel();
      fieldsPanel.setLayout(
                        new GridLayout( labels.length, 1 ) );
      id = new JTextField( 20 );
      id.setEditable( false );
      fieldsPanel.add( id );
      first = new JTextField( 20 );
      fieldsPanel.add( first );
      last = new JTextField( 20 );
      fieldsPanel.add( last );
      address = new JTextField( 20 );
      fieldsPanel.add( address );
      city = new JTextField( 20 );
      fieldsPanel.add( city );
      state = new JTextField( 20 );
      fieldsPanel.add( state  );
      zip = new JTextField( 20 );
      fieldsPanel.add( zip );
      country = new JTextField( 20 );
      fieldsPanel.add( country );
      email = new JTextField( 20 );
      fieldsPanel.add( email );
      home = new JTextField( 20 );
      fieldsPanel.add( home );
      fax = new JTextField( 20 );
      fieldsPanel.add( fax );

      setLayout( new GridLayout( 1, 2 ) );
      add( labelPanel );
      add( fieldsPanel );
   }
}