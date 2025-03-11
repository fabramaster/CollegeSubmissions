<%-- 
    Document   : validate.jsp
    Created on : Jan. 16, 2023, 5:02:10 p.m.
    Author     : danling
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import ="java.sql.*" %>
<%@ page import ="java.security.MessageDigest" %>
<%
    try{
        String username = request.getParameter("username");   
        String password = request.getParameter("password");
        MessageDigest sha1 = java.security.MessageDigest.getInstance("SHA-1");
        sha1.reset();
        sha1.update(password.getBytes());
        // Get the hash's bytes
        byte[] bytes = sha1.digest();

      // This bytes[] has bytes in decimal format. Convert it to hexadecimal format
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < bytes.length; i++) {
        sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
      }

     
        Class.forName("com.mysql.cj.jdbc.Driver");  // MySQL database connection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindemo?" + "user=cs318&password=cs318@OKC");    
        PreparedStatement pst = conn.prepareStatement("Select user,pass from login where user=? and pass=?");
        pst.setString(1, username);
        pst.setString(2, sb.toString());
        ResultSet rs = pst.executeQuery();                        
        if(rs.next())     {    
           Cookie currentsession = new Cookie("current_session", session.getId());
           currentsession.setMaxAge(30*60); //30 minutes
           response.addCookie(currentsession);
           
           response.sendRedirect("query.jsp"); 
    }
        else
           response.sendRedirect("Login.jsp");
   }
   catch(Exception e){       
       out.println("Something went wrong !! Please try again");       
   }      
%>
