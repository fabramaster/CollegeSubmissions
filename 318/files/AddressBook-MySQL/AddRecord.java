// AddRecord.java
// Class AddRecord definition

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class AddRecord implements ActionListener {
   private ScrollingPanel fields;
   private JTextArea output;
   private Connection connection;

   public AddRecord( Connection c, ScrollingPanel f, JTextArea o )
   {
      connection = c;
      fields = f;
      output = o;
   }

   public void actionPerformed( ActionEvent e )
   {
      try {
         Statement statement = connection.createStatement();

         if ( !fields.last.getText().equals( "" ) &&
              !fields.first.getText().equals( "" ) ) {
            String query = "INSERT INTO addresses (" +
               "firstname, lastname, address, city, " +
               "stateorprovince, postalcode, country, " +
               "emailaddress, homephone, faxnumber" +
               ") VALUES ('" +
               fields.first.getText() + "', '" +
               fields.last.getText() + "', '" +
               fields.address.getText() + "', '" +
               fields.city.getText() + "', '" +
               fields.state.getText() + "', '" +
               fields.zip.getText() + "', '" +
               fields.country.getText() + "', '" +
               fields.email.getText() + "', '" +
               fields.home.getText() + "', '" +
               fields.fax.getText() + "')";
            output.append( "\nSending query: " +
                           connection.nativeSQL( query )
                           + "\n" );
            int result = statement.executeUpdate( query );

            if ( result == 1 )
               output.append( "\nInsertion successful\n" );
            else {
               output.append( "\nInsertion failed\n" );
               fields.first.setText( "" );
               fields.last.setText( "" );
               fields.address.setText( "" );
               fields.city.setText( "" );
               fields.state.setText( "" );
               fields.zip.setText( "" );
               fields.country.setText( "" );
               fields.email.setText( "" );
               fields.home.setText( "" );
               fields.fax.setText( "" );
            }
         }
         else
            output.append( "\nEnter at least first and " +
                           "last name then press Add\n" );

         statement.close();
      }
      catch ( SQLException sqlex ) {
         sqlex.printStackTrace();
         output.append( sqlex.toString() );
      }
   }
}