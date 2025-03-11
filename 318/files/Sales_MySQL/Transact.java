/* Illustrates prepared statements
 * and transaction processing
 */

import java.sql.*;
import java.io.*;

class Transact {
  public static void main (String args[]) {
    try {

      ResultSet rs;
      Class.forName( "com.mysql.cj.jdbc.Driver" );
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sales",
                                               "root", "letmein");
      String query;
      Statement stmt = con.createStatement();
      con.setAutoCommit(false);
      String sql;
      sql = "INSERT INTO Item VALUES (555555,'CD player',10)";
      stmt.executeUpdate(sql);
      sql = "UPDATE Item SET Quantity = 12 "
          + "WHERE Description = 'CD player'";
      stmt.executeUpdate(sql);
      System.out.println();
      System.out.println("   Before commit or rollback"
        + " -- table changed, but can rollback");
      System.out.println("Description");
      query = "SELECT Description FROM Item";
      rs = stmt.executeQuery(query);
      while(rs.next())
        System.out.println(rs.getString(1));
      con.rollback();
      System.out.println();
      System.out.println
         ("   Rolled back insert and update -- table unchanged");
      System.out.println("Description");
      query = "SELECT Description FROM Item";
      rs = stmt.executeQuery(query);
      while(rs.next())
        System.out.println(rs.getString(1));
      sql = "INSERT INTO Item VALUES (555555,'CD player',10)";
      stmt.executeUpdate(sql);
      sql = "UPDATE Item SET Quantity = 12 "
          + "WHERE Description = 'CD player'";
      stmt.executeUpdate(sql);
      con.commit();
      System.out.println();
      System.out.println
         ("   Committed insert and update -- table changed");
      System.out.println("Description");
      query = "SELECT Description FROM Item";
      rs = stmt.executeQuery(query);
      while(rs.next())
        System.out.println(rs.getString(1));
      sql = "DELETE FROM Item WHERE Description = 'CD player'";
      stmt.executeUpdate(sql);
      con.commit();
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