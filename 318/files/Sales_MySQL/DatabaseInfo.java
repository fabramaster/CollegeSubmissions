/* Illustrate DatabaseMetaData, ResultSetMetaData
 * and SQL aggregate functions.
 */

import java.sql.*;
import java.io.*;
import java.text.*;

class DatabaseInfo {
 public static void main (String args[]) {
  try{
      ResultSet rs;
      Class.forName( "com.mysql.cj.jdbc.Driver" );
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sales",
                                               "root", "letmein");
      DatabaseMetaData dbMetaData = con.getMetaData();
      System.out.println("Supports entry level SQL: " +
                         dbMetaData.supportsANSI92EntryLevelSQL());
      System.out.println("Supports intermediate SQL: " +
                         dbMetaData.supportsANSI92IntermediateSQL());
      System.out.println("Supports full SQL: " +
                         dbMetaData.supportsANSI92FullSQL());
      System.out.println("Supports stored procedures: "+
                         dbMetaData.supportsStoredProcedures());
      System.out.println("Quote string: "
                       + dbMetaData.getIdentifierQuoteString());
      System.out.println("Types used in the database:");
      System.out.print('\t');

      rs = dbMetaData.getTypeInfo();
      while (rs.next())
        System.out.print(rs.getString("TYPE_NAME") + " ");
      System.out.println();

      String[] tables ={"TABLE"};
      rs = dbMetaData.getTables(null,null,"%",tables);
      System.out.println("Tables in the Sales database:");
      System.out.print('\t');
      while(rs.next())
        System.out.print(rs.getString("TABLE_NAME") + " ");
      System.out.println();
      rs = dbMetaData.getColumns(null,null,"Customer","%");
      System.out.println("Columns in the Customer table");
      while(rs.next())
        System.out.println('\t'+rs.getString("COLUMN_NAME")+" "
           + rs.getString("TYPE_NAME"));
      displayStrings("Fields describing each column",
         colNamesTypes(rs));
      String query;
      query = "SELECT * FROM Item";
      Statement stmt = con.createStatement();
      rs = stmt.executeQuery(query);
      displayStrings("Item Columns",colNamesTypes(rs));
      query = "SELECT SUM(BalanceDue),AVG(BalanceDue),MAX(BalanceDue) "
        + "FROM Customer";
      rs = stmt.executeQuery(query);
      displayStrings("Function columns",colNamesTypes(rs));
      System.out.println("Sum, average, and maximum balance due");
      while(rs.next())
         System.out.println("$" + rs.getBigDecimal(1) + " $"
            + rs.getBigDecimal(2) + " $" + rs.getBigDecimal(3));
      query = "SELECT COUNT(*), MIN(Quantity) FROM OrderItem "
            + "WHERE ItemNumber = '222222'";
      rs = stmt.executeQuery(query);
      while(rs.next()){
         System.out.println
            ("Number of radio order items: " + rs.getInt(1));
         System.out.println
           ("Minimum quantity of radios ordered in any order item: "
                             + rs.getInt(2));
      }
      stmt.close();
  }catch (Exception e) {e.printStackTrace();}
 }

 public static String[] colNamesTypes(ResultSet rs) throws SQLException {
      ResultSetMetaData rsMetaData = rs.getMetaData();
      int cols = rsMetaData.getColumnCount();
      String[] s = new String[cols];
      String label, tab;
      for (int i=1; i<=cols; i++) {
        label = rsMetaData.getColumnLabel(i);
        if (label.length() < 8) tab = "\t\t"; else tab = "\t";
        s[i-1] = '\t' + label + tab + rsMetaData.getColumnTypeName(i);
      }
      return s;
 }
 public static void displayStrings(String description, String[]s) {
      System.out.println(description);
      for(int i=0; i<s.length; i++)
         System.out.println(s[i]);
 }
}
