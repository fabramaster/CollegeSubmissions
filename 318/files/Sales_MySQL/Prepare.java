/* Illustrates prepared statements
 * and transaction processing
 */

import java.sql.*;
import java.io.*;

class Prepare {
  public static void main (String args[]) {
    try {

      ResultSet rs;
      Class.forName( "com.mysql.cj.jdbc.Driver" );
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sales",
                                               "root", "letmein");
      String query;
      query =  "SELECT Quantity FROM Item "
             + "WHERE Description = ?";
      PreparedStatement pStmt = con.prepareStatement(query);
      pStmt.setString(1, "radio");
      rs = pStmt.executeQuery();
      System.out.println
         ("   Using a prepared statement to find quantity of radios");
      while(rs.next())
        System.out.println(rs.getInt("Quantity"));
      rs.close();
      pStmt.setString(1, "computer");
      rs = pStmt.executeQuery();
      System.out.println
       ("   Using a prepared statement to find quantity of computers");
      while(rs.next())
        System.out.println(rs.getInt("Quantity"));
      rs.close();
      query = "SELECT OrderNumber FROM Orders "
            + "WHERE OrderDate BETWEEN ? AND ?";
      pStmt =con.prepareStatement(query);
      pStmt.setDate(1, Date.valueOf("1999-04-01"));
      pStmt.setDate(2, Date.valueOf("1999-04-30"));
      rs = pStmt.executeQuery();
      System.out.println
        ("   Using a prepared statement to find orders in April");
      while(rs.next())
        System.out.println(rs.getInt("OrderNumber"));
      rs.close();
      query = "SELECT CustomerName FROM Customer "
            + "WHERE BalanceDue > ?";
      pStmt =con.prepareStatement(query);
      pStmt.setDouble(1, 0.0);
      rs = pStmt.executeQuery();
      System.out.println("   Using a prepared statement to find "
            + "customers with zero balance");
      while(rs.next())
        System.out.println(rs.getString("CustomerName"));
      pStmt.close();
    }catch (Exception e) {e.printStackTrace();}
  }
}