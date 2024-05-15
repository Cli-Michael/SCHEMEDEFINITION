

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Michael Maria Deny
 */
public final class Logouter extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
 
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
//        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet AjaxServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<spand class=\"show1\" />");
//            out.println("<h1>Loading...</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
        //HttpSession session = request.getSession();
       // processRequest(request, response);
        out.println("<h1>Loading....</h1>");
        try{
            Cookie ck[]=request.getCookies(); 
            Cookie cookie = ck[1];
            cookie.setMaxAge(0);
            response.addCookie(cookie);
        }catch(Exception e){
            request.getRequestDispatcher("error.html").include(request, response); 
        }
//        for(int i=0;i<ck.length;i++){  
//             System.out.print("\n Cookie"+i+" "+ck[i].getName()+" "+ck[i].getValue());//printing name and value of cookie  
//            } 
        try{
            out.print("<script type='text/javascript'>\n" +
"  setTimeout(function() {window.location.href='AgentLogin.jsp'}, 1);</script>"); 
        }catch(Exception e){
            out.print("<script type='text/javascript'>alert('Some Exception...');\n" +
"  setTimeout(function() {window.location.href='AgentLogin.jsp'}, 1);</script>"); 
        }
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
