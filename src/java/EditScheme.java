/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
public class EditScheme extends HttpServlet {

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
//            out.println("<title>Servlet EditScheme</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet EditScheme at " + request.getContextPath() + "</h1>");
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
//        processRequest(request, response);
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
//        processRequest(request, response);
        String srno = request.getParameter("id");
        String Region = request.getParameter("Region");
        String Division = request.getParameter("Division");
        String SchemeLetterReceivedDate = request.getParameter("SchemeLetterReceivedDate");
        String SchemeLetterReceivedTime = request.getParameter("SchemeLetterReceivedTime");
        String SchemeLetterName = request.getParameter("SchemeLetterName");
        String SchemeType = request.getParameter("SchemeType");
        String Component = request.getParameter("Component");
        String SchemeID = request.getParameter("SchemeID");
        String AdditionalRequirementDetails = request.getParameter("AdditionalRequirementDetails");
        String RequestDate = request.getParameter("RequestDate");
        String ChangesDate = request.getParameter("ChangesDate");
        String DifferentRequirementFromUnit = request.getParameter("DifferentRequirementFromUnit");
        String DefineBy = request.getParameter("DefineBy");
        String ReasonForNotDefine = request.getParameter("ReasonForNotDefine");
        String Status = request.getParameter("Status");
        String DefineTime = request.getParameter("DefineTime");
        String StartTime = request.getParameter("StartTime");
        String EndTime = request.getParameter("EndTime");
        String Ageing = request.getParameter("Ageing");
        String Day = request.getParameter("Day");
        String SchemeDate = request.getParameter("SchemeDate");
        String Days = request.getParameter("Days");
        String TAT = request.getParameter("TAT");
        String SchemeDeployed = request.getParameter("SchemeDeployed");
        String Checker1Date = request.getParameter("Checker1Date");
        String Checker1Name = request.getParameter("Checker1Name");
        String Error = request.getParameter("Error");
        String Error_ = request.getParameter("Error_");
        String Solved = request.getParameter("Solved");
        String ErrorHighlightedByRegion = request.getParameter("ErrorHighlightedByRegion");
        String RegionName = request.getParameter("RegionName");
        String ErrorAccepted = request.getParameter("ErrorAccepted");
        String ErrorDescription = request.getParameter("ErrorDescription");
        String HighlightedByOfficerName = request.getParameter("HighlightedByOfficerName");
        String HighlightedDate = request.getParameter("HighlightedDate");
        String Rectified = request.getParameter("Rectified");
        String RectificationDate = request.getParameter("RectificationDate");
        String ResolvingTime = request.getParameter("ResolvingTime");
        
        LocalDate tDate = LocalDate.now();
//                    LocalTime tTime = LocalTime.now();
//                    DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm");
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//                    String formattedTime = tTime.format(formatTime);
        String formattedDate = tDate.format(formatDate);

        System.out.println(Region);
        System.out.println(Division);
        System.out.println(SchemeLetterReceivedDate);
        System.out.println(SchemeLetterReceivedTime);
        System.out.println(SchemeLetterName);
        System.out.println(SchemeType);
        System.out.println(Component);
        System.out.println(SchemeID);
        System.out.println(AdditionalRequirementDetails);
        System.out.println(RequestDate);
        System.out.println(ChangesDate);
        System.out.println(DifferentRequirementFromUnit);
        System.out.println(DefineBy);
        System.out.println(ReasonForNotDefine);
        System.out.println(Status);
        System.out.println(DefineTime);
        System.out.println(StartTime);
        System.out.println(EndTime);
        System.out.println(Ageing);
        System.out.println(Day);
        System.out.println(SchemeDate);
        System.out.println(Days);
        System.out.println(TAT);
        System.out.println(SchemeDeployed);
        System.out.println(Checker1Date);
        System.out.println(Checker1Name);
        System.out.println(Error);
        System.out.println(Error_);
        System.out.println(Solved);
        System.out.println(ErrorHighlightedByRegion);
        System.out.println(RegionName);
        System.out.println(ErrorAccepted);
        System.out.println(ErrorDescription);
        System.out.println(HighlightedByOfficerName);
        System.out.println(HighlightedDate);
        System.out.println(Rectified);
        System.out.println(RectificationDate);
        System.out.println(ResolvingTime);

        String columns = "Region,Division,SchemeLetterReceivedDate,SchemeLetterReceivedTime,SchemeLetterName,SchemeType,Component,SchemeID,AdditionalRequirementDetails,RequestDate,ChangesDate,DifferentRequirementFromUnit,DefineBy,ReasonForNotDefine,Status,DefineTime,StartTime,EndTime,Ageing,Day,SchemeDate,Days,TAT,SchemeDeployed,Checker1Date,Checker1Name,Error,Error_,Solved,ErrorHighlightedByRegion,RegionName,ErrorAccepted,ErrorDescription,HighlightedByOfficerName,HighlightedDate,Rectified,RectificationDate,ResolvingTime,actiondate";
        String[] columnsArray = Resource.MyFunctions.createArrayFromCommaSeparatedString(columns);

        String[] valuesArray = new String[]{Region, Division, SchemeLetterReceivedDate, SchemeLetterReceivedTime, SchemeLetterName, SchemeType, Component, SchemeID, AdditionalRequirementDetails, RequestDate, ChangesDate, DifferentRequirementFromUnit, DefineBy, ReasonForNotDefine, Status, DefineTime, StartTime, EndTime, Ageing, Day, SchemeDate, Days, TAT, SchemeDeployed, Checker1Date, Checker1Name, Error, Error_, Solved, ErrorHighlightedByRegion, RegionName, ErrorAccepted, ErrorDescription, HighlightedByOfficerName, HighlightedDate, Rectified, RectificationDate, ResolvingTime, formattedDate};

        int s = Resource.MyFunctions.universalUpdate("Scheme", columnsArray, valuesArray, "srno", srno);

        PrintWriter out = response.getWriter();

        if (s > 0) {
            out.print("<script>\n"
                    + "  setTimeout(function() {window.location.href='View.jsp'}, 1);</script>");
        } else {
            out.print("<script>alert('Insert Failure...');\n"
                    + "  setTimeout(function() {window.history.back()}, 1);</script>");
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
