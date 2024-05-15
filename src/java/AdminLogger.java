/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Resource.MyFunctions;
import Encryption.EncrptDecrypt;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
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
public class AdminLogger extends HttpServlet {

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
//            out.println("<title>Servlet AgentLogger</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Loading...</h1>");
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
        //out.println("<h1>Loading...</h1>");
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
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        int n = rnd_gen.rand__();
        final String secretKey = String.valueOf(n)+"ssshhh__";
        String encrypted = EncrptDecrypt.encrypt(username, secretKey) ;
        session.setAttribute("nzRQV", encrypted);
        session.setAttribute("id", secretKey);
        Cookie c = new Cookie("nzRQV", username);
        c.setMaxAge(60 * 60 * 24);
        response.addCookie(c);
        LocalDate tDate = LocalDate.now();
//                    LocalTime tTime = LocalTime.now();
//                    DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm");
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("yyyy-M-dd");
//                    String formattedTime = tTime.format(formatTime);
        String formattedDate = tDate.format(formatDate);
        
       
        if(MyFunctions.CheckAdminExist(username, password)){
                out.print("<script>\n" +
    "  setTimeout(function() {window.location.href='View.jsp'}, 10);</script>");
            }else{ 
                out.print("<script>alert('Login Unsuccessfull...');\n" +
    "  setTimeout(function() {window.history.back()}, 10);</script>");
            
        }
        
        //New-Admin-Home_2
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
