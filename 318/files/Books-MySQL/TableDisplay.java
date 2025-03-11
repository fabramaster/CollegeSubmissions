// TableDisplay.java
// This program displays the contents of the Authors table
// in the Books database.

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TableDisplay extends JFrame {
   private Connection con;
   private JTable table;

   public TableDisplay()
   {

      // Load the driver to allow connection to the database
      try {
            Class.forName( "com.mysql.cj.jdbc.Driver" );
      		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Books",
                                               "root", "letmein");
      }
      catch ( ClassNotFoundException cnfex ) {
         System.err.println(
            "Failed to load JDBC/ODBC driver." );
         cnfex.printStackTrace();
         System.exit( 1 );  // terminate program
      }
      catch ( SQLException sqlex ) {
         System.err.println( "Unable to connect" );
         sqlex.printStackTrace();
      }
      getTable();
      setSize( 450, 150 );
      show();
   }

   private void getTable()
   {
      Statement statement;
      ResultSet resultSet;
      try {
         String query = "SELECT * FROM Authors";
         statement = con.createStatement();
         resultSet = statement.executeQuery( query );
         displayResultSet( resultSet );
         statement.close();
      }
      catch ( SQLException sqlex ) {
         sqlex.printStackTrace();
      }
   }

   private void displayResultSet( ResultSet rs )
      throws SQLException
   {
      // position to first record
      boolean moreRecords = rs.next();

      // If there are no records, display a message
      if ( ! moreRecords ) {
         JOptionPane.showMessageDialog( this,
            "ResultSet contained no records" );
         setTitle( "No records to display" );
         return;
      }

      setTitle( "Authors table from Books" );
      Vector columnHeads = new Vector();
      Vector rows = new Vector();

      try {
         // get column heads
         ResultSetMetaData rsmd = rs.getMetaData();
         for ( int i = 1; i <= rsmd.getColumnCount(); ++i )
            columnHeads.addElement( rsmd.getColumnName( i ) );

         // get row data
         do {
            rows.addElement( getNextRow( rs, rsmd ) );
         } while ( rs.next() );

         // display table with ResultSet contents
         table = new JTable( rows, columnHeads );
         JScrollPane scroller = new JScrollPane( table );
         getContentPane().add(
            scroller, BorderLayout.CENTER );
         validate();
      }
      catch ( SQLException sqlex ) {
         sqlex.printStackTrace();
      }
   }

   private Vector getNextRow( ResultSet rs, ResultSetMetaData rsmd )
                             throws SQLException
   {
      Vector currentRow = new Vector();
      for ( int i = 1; i <= rsmd.getColumnCount(); ++i )
         switch( rsmd.getColumnType( i ) ) {
            case Types.VARCHAR:
                  currentRow.addElement( rs.getString( i ) );
               break;
            case Types.BIGINT:
                  currentRow.addElement(
                     new Long( rs.getLong( i ) ) );
               break;
            default:
               System.out.println( "Type was: " +
                  rsmd.getColumnTypeName( i ) );
         }

      return currentRow;
   }

   public void shutDown()
   {
      try {
         con.close();
      }
      catch ( SQLException sqlex ) {
         System.err.println( "Unable to disconnect" );
         sqlex.printStackTrace();
      }
   }

   public static void main( String args[] )
   {
      final TableDisplay app = new TableDisplay();
      app.addWindowListener(
         new WindowAdapter() {
            public void windowClosing( WindowEvent e )
            {
               app.shutDown();
               System.exit( 0 );
            }
         }
      );
   }
}