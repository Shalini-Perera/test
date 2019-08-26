<%-- 
    Document   : display3
    Created on : Aug 25, 2019, 1:22:51 PM
    Author     : Shalini
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="stylesheet.css"/>
<link rel="stylesheet" type="text/css" href="style1.css"/>


<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ"
  crossorigin="anonymous">
    
    
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
      <body background="1.jpg">
       
     
      <!--<center>    
              <img src="ll.png" alt="Admin" />    
                </center>
    -->
  <!--<h2>Plant Stock</h2> -->



<table>
  <tr>
      
                        <th>plantcode</th>
			<th>plantname</th>
			<th>quantity</th>
			<th>price</th>
                        <th>date</th>
                        <th>Update</th>
                        <th>Delete</th>
                         <th>Total</th>
                       <!-- <th>Re-order items</th> --> 
  </tr>
 
  
 



<tbody>
    
    
	<%   Connection con;
	    Statement st;
	    ResultSet rs;
	   %>
           
	   <% 
	   String url,user,pass;
	   
	   
	       url="jdbc:mysql://localhost/ruvinidb";//dbname
	       user="root";
	       pass="";
               
	      try {
	            Class.forName("com.mysql.jdbc.Driver");
	            con=DriverManager.getConnection(url,user,pass);
	             
	                String data="select * from d1 ";
			st=con.createStatement();
			rs= st.executeQuery(data);
			while (rs.next()){
			out.print("<tr>");
			out.print("<td>"+rs.getString("plantcode")+"</td>");
			out.print("<td>"+rs.getString("plantname")+"</td>");
			out.print("<td>"+rs.getString("quantity")+"</td>");
			out.print("<td>"+rs.getString("price")+"</td>");
			out.print("<td>"+rs.getString("date")+"</td>");
			
                        
			out.print("<td class=\"text-center\"><a href =\"updatedata?u="+rs.getString("plantcode")+"\" class = \"btn btn-warning\"> Edit </a></td><td><a href =\"delete?u=" +rs.getString("plantcode")+" \"class =\"btn btn-danger \"> Delete </a></td><td><a href =\"reorder.jsp?u=" +rs.getString("plantcode")+" \"class =\"btn btn-danger \"> Total </a></td>");
			out.print("</tr>");
			
			}
                        
		}catch(Exception ex){
                    
			out.print(""+ex);
                        
		}
		
		%>


 

 
</table> 

  <br>
    <br>
      <br>
      
      
      
      
  
 

        
                     
      <!--               
                   
                     <center>
  <form method="post" name="resetform" action="insertplantdata">
      
      
       
      Plant Code :<input type="number" name="pid" placeholder="***" required>
		<br />
  
           Plant Name: <input type="text" name="pname" placeholder="****" required>
		<br />
               
		
            Quantity: <input type="text" name="quant" placeholder="***" required>
                <br/>
		
		Price: <input type="text" name="price" placeholder="***" required>
		<br />

                  <br/>
                 Date : <input type="date" id="start" name="trip-start"
       value=""
       min="2018-01-01" max="">
                 <br/>
		<br/>
	        <br/>
                
             
		
		<input type="submit" name="name" value="UPDATE">
                 <br>
                 
                 
                
                  
               
 
                
                
           </form>
  
    
	</center>
      
      <center>
      
          -->
          <center>
           <form method="post" name="resetform" action="index.jsp">	
				
				
				<input type="submit" name="name" value="Back to main page">


           </form>
              
               <form method="post" name="resetform" action="index1.jsp">	
				
				
				<input type="submit" name="name" value="Submit">


           </form>
</center>

    </body>
</html>
