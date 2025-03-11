// FindRecord.java
// Class FindRecord defintion

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class FindRecord implements ActionListener {
   private ScrollingPanel fields;
   private JTextArea output;
   private Connection connection;

   public FindRecord( Connection c, ScrollingPanel f,
                      JTextArea o )
   {
      connection = c;
      fields = f;
      output = o;
   }

   public void actionPerformed( ActionEvent e )
   {
      try {
         if ( !fields.last.getText().equals( "" ) ) {
            Statement statement =connection.createStatement();
            String query = "SELECT * FROM addresses " +
                           "WHERE lastname = '" +
                           fields.last.getText() + "'";
            output.append( "\nSending query: " +
                           connection.nativeSQL( query )
                           + "\n" );
            ResultSet rs = statement.executeQuery( query );
            display( rs );
            output.append( "\nQuery successful\n" );
            statement.close();
         }
         else
            fields.last.setText(
               "Enter last name here then press Find" );
      }
      catch ( SQLException sqlex ) {
         sqlex.printStackTrace();
         output.append( sqlex.toString() );
      }
   }

   // Display results of query. If rs is null
   public void display( ResultSet rs )
   {
      try {
         rs.next();

         int recordNumber = rs.getInt( 1 );

         if ( recordNumber != 0 ) {
            fields.id.setText( String.valueOf( recordNumber));
            fields.first.setText( rs.getString( 2 ) );
            fields.last.setText( rs.getString( 3 ) );
            fields.address.setText( rs.getString( 4 ) );
            fields.city.setText( rs.getString( 5 ) );
            fields.state.setText( rs.getString( 6 ) );
            fields.zip.setText( rs.getString( 7 ) );
            fields.country.setText( rs.getString( 8 ) );
            fields.email.setText( rs.getString( 9 ) );
            fields.home.setText( rs.getString( 10 ) );
            fields.fax.setText( rs.getString( 11 ) );
         }
         else
            output.append( "\nNo record found\n" );
      }
      catch ( SQLException sqlex ) {
         sqlex.printStackTrace();
         output.append( sqlex.toString() );
      }
   }
}