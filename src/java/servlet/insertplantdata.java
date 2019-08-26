/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import order.Employee;
import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static javax.servlet.jsp.tagext.TagAttributeInfo.ID;
import javax.swing.JOptionPane;

/**
 *
 * @author maduranga
 */
@WebServlet(name = "insertplantdata", urlPatterns = {"/insertplantdata"})
public class insertplantdata extends HttpServlet {

    private String PID;
    private String PName;
    private String PQ;
    private String PP;
    private String DD;
 
    Employee emp = new Employee();
   
    
    public insertplantdata(){
      super();
    }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
          
      //insert employee details     
            
            
            if (request.getParameter("name").toString().trim().equals("ADD")) {
           String id = request.getParameter("pid");
               String name = request.getParameter("pname");
                   String qun = request.getParameter("quant");
                       String pric = request.getParameter("price");
                             String dat = request.getParameter("trip-start");
                                  
            
                  emp.setplantcode(id);
                  emp.setplantname(name);
                  emp.setquantity(qun);
                  emp.setprice(pric);
                  emp.setdate(dat);
                  
                
                
                String mess=emp.inserdb();
                  
                    
                 if(mess == "Success"){
                   
                response.sendRedirect("display1.jsp");
                System.out.println("successfully inserted modayoooooooooo") ;
        
                  System.out.print(mess);
                
                  }else{
                     
                  
                     System.out.print("jahdshoadhoiash") ;
                  
                 }    
                      
            }else if(request.getParameter("name").toString().trim().equals("Update")){
                
            String id = request.getParameter("eid");
                String name = request.getParameter("nic");
                    String qun = request.getParameter("ename");
                        String pric = request.getParameter("dep");
                             String dat = request.getParameter("contactnum");
                                  
            
                  emp.setplantcode(id);
                  emp.setplantname(name);
                  emp.setquantity(qun);
                  emp.setprice(pric);
                  emp.setdate(dat);
                  
                  
                  String mess=emp.updatedb();
                 
                 if(mess == "Success"){
                     
                    response.sendRedirect("display1.jsp");  
                     
                  
                 out.println("successfully Updated") ;
                  
                  }else{
                  
                      out.println(mess) ;
                  
                  }
                  
            
                  
            }
            
            else if(request.getParameter("name").toString().equals("Delete")){
            
            String id = request.getParameter("eid").trim();
            
            emp.setplantcode(id);
            
            
                String mess=emp.deletedb();
                  
                  
                  if(mess == "Success"){
                      
                      response.sendRedirect("display1.jsp");
                  
                 out.println("successfully Deleted") ;
                  
                  }else{
                  
                      out.println(mess) ;
                  
                  }
            
            
            
            }
            
             
            
                  
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet insertdata</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("i am kasun");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet responsejhlj
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        processRequest(request, response);
        
        
        
        
            }
        
	
        
        @Override
    public String getServletInfo() {
        return "Short description";
          

    
    
    
    }


}


