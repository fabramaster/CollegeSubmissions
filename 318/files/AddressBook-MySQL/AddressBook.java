// AddressBook.java
// Inserting into, updating and searching through a database

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AddressBook extends JFrame {
   private ControlPanel controls;
   private ScrollingPanel scrollArea;
   private JTextArea output;
   private String url;
   private Connection connect;
   private JScrollPane textpane;

   public AddressBook()
   {
      super( "Address Book Database Application" );

      Container c = getContentPane();

      // Start screen layout
      scrollArea = new ScrollingPanel();
      output = new JTextArea( 6, 30 );
      c.setLayout( new BorderLayout() );
      c.add( new JScrollPane( scrollArea ),
             BorderLayout.CENTER );
      textpane = new JScrollPane( output );
      c.add( textpane, BorderLayout.SOUTH );

      // Set up database connection
      try {
         Class.forName( "com.mysql.cj.jdbc.Driver" );
         connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/AddressList",
                                               "root", "letmein");
         output.append( "Connection successful\n" );
      }
      catch ( ClassNotFoundException cnfex ) {
         // process ClassNotFoundExceptions here
         cnfex.printStackTrace();
         output.append( "Connection unsuccessful\n" +
                        cnfex.toString() );
      }
      catch ( SQLException sqlex ) {
         // process SQLExceptions here
         sqlex.printStackTrace();
         output.append( "Connection unsuccessful\n" +
                        sqlex.toString() );
      }
      catch ( Exception ex ) {
         // process remaining Exceptions here
         ex.printStackTrace();
         output.append( ex.toString() );
      }

      // Complete screen layout
      controls =
         new ControlPanel( connect, scrollArea, output);
      c.add( controls, BorderLayout.NORTH );

      setSize( 500, 500 );
      show();
   }

   public static void main( String args[] )
   {
      AddressBook app = new AddressBook();

      app.addWindowListener(
         new WindowAdapter() {
            public void windowClosing( WindowEvent e )
            {
               System.exit( 0 );
            }
         }
      );
   }
}