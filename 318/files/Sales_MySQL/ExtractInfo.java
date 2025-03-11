/* Demonstrates the use of SQL queries from
 * a Java program.
 */

import java.sql.*;
import java.io.*;

public class ExtractInfo {
 public static void main (String args[]) {
  try{

      Class.forName( "com.mysql.cj.jdbc.Driver" );
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sales",
                                               "root", "letmein");
      Statement stmt = con.createStatement();
      String query = "SELECT CustomerName, Address FROM Customer ORDER BY CustomerName";
      ResultSet rs = stmt.executeQuery(query);
      System.out.println("   Names and Addresses of Customers");
      System.out.println("Name\t\tAddress");
      while (rs.next())
         System.out.println(rs.getString("CustomerName") + '\t' + rs.getString(2));
      query =   "SELECT * FROM OrderItem "
              + "WHERE ItemNumber = '222222'";
      rs = stmt.executeQuery(query);
      System.out.println();
      System.out.println("   Order items for radios");
      System.out.println("OrderNumber\tQuantity\tUnitPrice");
      while (rs.next())
         System.out.println(rs.getString(1) + "\t\t" + rs.getInt(3)
                                + "\t\t$" + rs.getBigDecimal(4));
      query =  "SELECT CustomerName FROM Customer, Orders "
             + "WHERE Customer.CustomerID = Orders.CustomerID "
             + "AND  OrderDate = {d '1999-03-22'}";
      rs = stmt.executeQuery(query);
      System.out.println();
      System.out.println("   Customer placing orders on Mar 22, 1999");
      while(rs.next())
         System.out.println(rs.getString("CustomerName"));
      query = "SELECT DISTINCT CustomerName "
            + "FROM Customer, Item, Orders, OrderItem "
            + "WHERE Customer.CustomerID = Orders.CustomerID "
            + "AND Orders.OrderNumber = OrderItem.OrderNumber "
            + "AND OrderItem.ItemNumber = Item.ItemNumber "
            + "AND Description = 'computer'";
      rs = stmt.executeQuery(query);
      System.out.println();
      System.out.println("   Customers ordering computers");
      while(rs.next())
         System.out.println(rs.getString(1));
      query =  "SELECT OrderNumber FROM Orders "
             + "WHERE OrderDate BETWEEN {d '1999-04-01'} AND {d '1999-04-30'}";
      rs = stmt.executeQuery(query);
      System.out.println();
      System.out.println("   Order numbers of orders from 4/1/99 to 4/30/99");
      while(rs.next())
         System.out.println(rs.getString("OrderNumber"));
      String sql;
      sql = "INSERT INTO Item VALUES ('555555','CD player',10)";
      stmt.executeUpdate(sql);
      sql = "UPDATE Item SET Quantity = 12 "
          + "WHERE Description = 'CD player'";
      stmt.executeUpdate(sql);
      System.out.println();
      System.out.println("   Added and updated a new item");
      System.out.println("Description");
      query = "SELECT Description FROM Item";
      rs = stmt.executeQuery(query);
      while(rs.next())
        System.out.println(rs.getString(1));
      sql = "DELETE FROM Item WHERE Description = 'CD player'";
      stmt.executeUpdate(sql);
      query = "SELECT Description FROM Item";
      rs = stmt.executeQuery(query);
      System.out.println();
      System.out.println("   Deleted the new item");
      System.out.println("Description");
      while(rs.next())
        System.out.println(rs.getString(1));
      stmt.close();
  }catch (Exception e) {e.printStackTrace();}
 }
}
