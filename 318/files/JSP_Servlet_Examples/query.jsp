<%-- 
    Document   : query
    Created on : Jan. 15, 2023, 10:45:01 a.m.
    Author     : danling
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
         Cookie cookie = null;
         Cookie[] cookies = null;

         // Get an array of Cookies associated with the this domain
         cookies = request.getCookies();
         boolean authorized = false;

         if( cookies != null ) {
            out.println("<h2> Found Cookies Name and Value</h2>");
            for (int i = 0; i < cookies.length; i++) {
               cookie = cookies[i];
               if ((cookie.getName().equals ("current_session"))&&
                  (cookie.getValue().equals (session.getId()))) {
                          authorized = true;
                   }
            }
          }
          
         if (authorized) {
      %>
<html>
<head>
  <title>Book Query</title>
</head>
<body style="background-color: bisque">
  <h1>Another E-Bookstore</h1>
  <h3>Choose Author(s):</h3>
  <form method="get">
    <input type="checkbox" name="author" value="Rick Smith">Rick Smith
    <input type="checkbox" name="author" value="Mary Johnson">Mary Johnson
    <input type="checkbox" name="author" value="Kevin Jones">Kevin Jones
    <input type="submit" value="Query">
  </form>
 
  <%
    String[] authors = request.getParameterValues("author");
    if (authors != null) {
  %>
  <%@ page import = "java.sql.*" %>
  <%
      Class.forName( "com.mysql.cj.jdbc.Driver" );
      Connection conn = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/ebookshop", "cs318", "cs318@OKC"); // <== Check!
      // Connection conn =
      //    DriverManager.getConnection("jdbc:odbc:eshopODBC");  // Access
      Statement stmt = conn.createStatement();
 
      String sqlStr = "SELECT * FROM books WHERE author IN (";
      sqlStr += "'" + authors[0] + "'";  // First author
      for (int i = 1; i < authors.length; ++i) {
         sqlStr += ", '" + authors[i] + "'";  // Subsequent authors need a leading commas
      }
      sqlStr += ") AND qty > 0 ORDER BY author ASC, title ASC";
 
      // for debugging
      System.out.println("Query statement is " + sqlStr);
      ResultSet rset = stmt.executeQuery(sqlStr);
  %>
      <hr>
      <form method="get" action="order.jsp">
        <table border=1 cellpadding=5>
          <tr>
            <th>Order</th>
            <th>Author</th>
            <th>Title</th>
            <th>Price</th>
            <th>Qty</th>
          </tr>
  <%
      while (rset.next()) {
        int id = rset.getInt("id");
  %>
          <tr>
            <td><input type="checkbox" name="id" value="<%= id %>"></td>
            <td><%= rset.getString("author") %></td>
            <td><%= rset.getString("title") %></td>
            <td>$<%= rset.getInt("price") %></td>
            <td><%= rset.getInt("qty") %></td>
          </tr>
  <%
      }
  %>
        </table>
        <br>
        <input type="submit" value="Order">
        <input type="reset" value="Clear">
      </form>
      <a href="<%= request.getRequestURI() %>"><h3>Back</h3></a>
  <%
      rset.close();
      stmt.close();
      conn.close();
    }
}
  %>
</body>
</html>
