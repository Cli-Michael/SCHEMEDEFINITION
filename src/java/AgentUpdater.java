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
 * @author DELL
 */
public class AgentUpdater extends HttpServlet {

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
//            out.println("<title>Servlet AgentUpdater</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet AgentUpdater at " + request.getContextPath() + "</h1>");
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
       // processRequest(request, response);
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
       // processRequest(request, response);
       PrintWriter out = response.getWriter();
       out.println("<!DOCTYPE html>\n" +
"<html lang=\"en\">\n" +
"<head>\n" +
"    <meta charset=\"UTF-8\">\n" +
"    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS\\loader.css\" /> \n" +
"    <title>Document</title>\n" +
"</head>\n" +
"<body>\n" +
"    <div class=\"loading\">\n" +
"        <div class=\"loadingio-spinner-pulse-hh47q3xyrz\">\n" +
"          <div class=\"ldio-4419sy8kct5\">\n" +
"            <div></div>\n" +
"            <div></div>\n" +
"            <div></div>\n" +
"          </div>\n" +
"        </div>\n" +
"        </div>\n" +
"</body>\n" +
"</html>");
       try{
            String info = request.getParameter("info");
            String username = request.getParameter("username");
            String npass = request.getParameter("npass");
            String cpass = request.getParameter("cpass");

//            out.println("Username: "+username);
//            out.println("pass: "+npass);
//            out.println("languages: "+langs);
//            out.println("APT Type: "+aptType);
            String generatedSecuredPasswordHash = BCrypt.hashpw(npass, BCrypt.gensalt(12));
            if(npass.equals(cpass)){
                int status = Resource.MyFunctions.UpdateAgent(username, generatedSecuredPasswordHash, info);
                if(status>0){
                     out.print("<script>alert('Success...');\n" +
"  setTimeout(function() {window.location.href='Users.jsp'}, 1);</script>");
                     
                }else{
                    out.print("<script>alert('Record not added....');\n" +
"  setTimeout(function() {window.location.href='EditUser.jsp'}, 1);</script>");
                }
                
            }else{
                 out.print("<script type='text/javascript'>alert('Password does not match...');\n" +
"  setTimeout(function() {window.history.back()}, 1);</script>");
             }

        }catch(NullPointerException e){
             out.print("<script>alert('Exception...');\n" +
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
