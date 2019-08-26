

<%@page contentType="text/html" pageEncoding="UTF-8"%>

 <%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}


a[type=submit] {
 width: 75%;
 background-color: rgb(243, 36, 71);
 color: white;
 padding: 8px 15px;
 margin: 20px 0;
 border: none;
 border-radius: 10px;
 cursor: pointer;
}

</style>


    </head>
    
    <body>
        
        <h2>Order </h2>

       <table>
  <tr>
      
                        <th>Number</th>
			<th>Plant Name</th>
			<th>quantity</th>
                        <th>Total Price</th>
                        <th>Update</th>
                        <th>Delete</th>

                     
  </tr>
   <%
   try
   {
       Class.forName("com.mysql.jdbc.Driver");
       String url="jdbc:mysql://localhost:3306/ruvinidb";
       String username="root";
       String password="";
       String query="select qty from orders";
       Connection conn=DriverManager.getConnection(url, username, password);
       Statement stmt=conn.createStatement();
       ResultSet rs=stmt.executeQuery(query);
       while(rs.next())
       {
                         
    <tr>
           
      <td><%=rs.getInt("Number")%></td>  
      <td><%=rs.getString("plantName") %></td>
      <td><%=rs.getString("qty") %></td>
      <td><%=rs.getDouble("Price") %> </td>
      <td><%=rs.getDouble("total_Price") %></td>
      
      
  </tr>
  
   %>                                                   
   <%
       }
   %>
   
    <%
        rs.close();
        stmt.close();
        conn.close();
   }
   catch(Exception e)
   {
        e.printStackTrace();
   }
   %>
       
  
  
 
  
 
        
        
    </body>
</html>
