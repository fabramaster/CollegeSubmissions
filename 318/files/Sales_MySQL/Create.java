/* Creates and populates the Sales database
 */

import java.sql.*;
import java.io.*;

public class Create {
 public static void main (String args[]) {
  try{

      Class.forName( "com.mysql.cj.jdbc.Driver" );
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sales",
                                               "root", "letmein");
      Statement stmt = con.createStatement();
      stmt.executeUpdate("CREATE TABLE Customer (CustomerID VARCHAR(4), CustomerName"
          + " VARCHAR(25), Address VARCHAR(25), BalanceDue DOUBLE)");
      stmt.executeUpdate
          ("INSERT INTO Customer VALUES (1234, 'Fred Jones','22 First St.',1667.00)");
      stmt.executeUpdate
          ("INSERT INTO Customer VALUES (5678,'Darnell Davis','33 Second St.',130.95)");
      stmt.executeUpdate
          ("INSERT INTO Customer VALUES (4321,'Marla Martinez','44 Third St.',0)");
      stmt.executeUpdate
          ("INSERT INTO Customer VALUES (8765,'Carla Kahn','55 Fourth St.', 0)");
      stmt.executeUpdate("CREATE TABLE Salesperson (SalespersonID VARCHAR(2),"
                + "SalespersonName VARCHAR(25), Address VARCHAR(25))");
      stmt.executeUpdate
          ("INSERT INTO Salesperson VALUES (12,'Peter Patterson','66 Fifth St.')");
      stmt.executeUpdate
          ("INSERT INTO Salesperson VALUES (98,'Donna Dubarian','77 Sixth St.')");
      stmt.executeUpdate("CREATE TABLE Item (ItemNumber VARCHAR(6),"
            + "Description VARCHAR(20), Quantity INTEGER)");
      stmt.executeUpdate("INSERT INTO Item VALUES (222222,'radio',32)");
      stmt.executeUpdate("INSERT INTO Item VALUES (333333,'television',14)");
      stmt.executeUpdate("INSERT INTO Item VALUES (444444,'computer',9)");
      stmt.executeUpdate("CREATE TABLE Orders (OrderNumber VARCHAR(4),"
          + " CustomerID VARCHAR(4), SalespersonID VARCHAR(2), OrderDate DATE)");
      stmt.executeUpdate("INSERT INTO Orders VALUES (1,1234,12,STR_TO_DATE('04/03/1999','%m/%d/%Y'))");
      stmt.executeUpdate("INSERT INTO Orders VALUES (2,5678,12,STR_TO_DATE('03/22/1999','%m/%d/%Y'))");
      stmt.executeUpdate("INSERT INTO Orders VALUES (3,8765,98,STR_TO_DATE('02/19/1999','%m/%d/%Y'))");
      stmt.executeUpdate("INSERT INTO Orders VALUES (4,1234,12,STR_TO_DATE('04/05/1999','%m/%d/%Y'))");
      stmt.executeUpdate("INSERT INTO Orders VALUES (5,8765,98,STR_TO_DATE('02/28/1999','%m/%d/%Y'))");
      stmt.executeUpdate("CREATE TABLE OrderItem (OrderNumber CHAR(4),"
            + " ItemNumber CHAR(6), Quantity INTEGER, UnitPrice DOUBLE)");
      stmt.executeUpdate("INSERT INTO OrderItem VALUES (1,222222,4,27.00)");
      stmt.executeUpdate("INSERT INTO OrderItem VALUES (1,333333,2,210.50)");
      stmt.executeUpdate("INSERT INTO OrderItem VALUES (1,444444,1,569.00)");
      stmt.executeUpdate("INSERT INTO OrderItem VALUES (2,333333,2,230.95)");
      stmt.executeUpdate("INSERT INTO OrderItem VALUES (3,222222,3,27.00)");
      stmt.executeUpdate("INSERT INTO OrderItem VALUES (3,333333,1,230.95)");
      stmt.executeUpdate("INSERT INTO OrderItem VALUES (4,444444,1,569.00)");
      stmt.executeUpdate("INSERT INTO OrderItem VALUES (5,222222,2,27.00)");
      stmt.executeUpdate("INSERT INTO OrderItem VALUES (5,444444,1,725.00)");
      stmt.close();
      con.close();
  }catch (Exception e) {e.printStackTrace();}
 }
}
