/* Connects to a Microsoft Access database
 * using the JDBC-ODBC bridge
 */

import java.sql.*;
import java.io.*;

public class Connect {
 public static void main (String args[]) {
  try{
      Class.forName( "com.mysql.cj.jdbc.Driver" );
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sales",
                                               "root", "letmein");
      System.out.println("Made the connection to the Sales database");
  }catch (Exception e) {e.printStackTrace();}
 }
}
