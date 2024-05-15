/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Encryption.BCrypt;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Michael Maria Deny
 */
public class AgentCreator extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet AgentCreator</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet AgentCreator at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
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
        //processRequest(request, response);
       PrintWriter out = response.getWriter();
       try{
            String username = request.getParameter("username");
            String npass = request.getParameter("npass");
            String cpass = request.getParameter("cpass");
//            String lob = request.getParameter("lob");
            
            String generatedSecuredPasswordHash = BCrypt.hashpw(npass, BCrypt.gensalt(12));
            boolean ExistStatus = Resource.MyFunctions.CheckAgentNameExist(username);
            if(npass.equals(cpass)){
                if(ExistStatus){
                    out.print("<script>alert('Username Already Exists....');\n" +
        "  setTimeout(function() {window.location.href='CreateAgent.jsp'}, 1);</script>");
                }else{
                   int status = Resource.MyFunctions.CreateAgent(username, generatedSecuredPasswordHash);
                        if(status>0){
                             out.print("<script>alert('Success...');\n" +
        "  setTimeout(function() {window.location.href='CreateUser.jsp'}, 1);</script>");

                        }else{
                            out.print("<script>alert('Record not added....');\n" +
        "  setTimeout(function() {window.location.href='CreateUser.jsp'}, 1);</script>");
                        } 
                }
            }else{
                 out.print("<script type='text/javascript'>alert('Password does not match...');\n" +
"  setTimeout(function() {window.history.back()}, 10);</script>");
             }

        }catch(NullPointerException e){
             out.print("<script>alert('Please select Languages...');\n" +
"  setTimeout(function() {window.history.back()}, 10);</script>");
        }
       
       
       
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}