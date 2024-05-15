/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author DELL
 */
public class Export extends HttpServlet {

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
//            out.println("<title>Servlet Export</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet Export at " + request.getContextPath() + "</h1>");
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
        try {
            LocalDate tDate = LocalDate.now();
            DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String formattedDate = tDate.format(formatDate);
            Connection conn = Resource.DB.getConnection();
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Exported");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT srno,Region,Division,SchemeLetterReceivedDate,SchemeLetterReceivedTime,SchemeLetterName,SchemeType,Component,SchemeID,AdditionalRequirementDetails,RequestDate,ChangesDate,DifferentRequirementFromUnit,DefineBy,ReasonForNotDefine,Status,DefineTime,StartTime,EndTime,Ageing,Day,SchemeDate,Days,TAT,SchemeDeployed,Checker1Date,Checker1Name,Error,Error_,Solved,ErrorHighlightedByRegion,RegionName,ErrorAccepted,ErrorDescription,HighlightedByOfficerName,HighlightedDate,Rectified,RectificationDate,ResolvingTime FROM scheme");
            int rowNum = 0;
            Row headerRow = sheet.createRow(0);
            String[] headers = {"Region","Division","SchemeLetterReceivedDate","SchemeLetterReceivedTime","SchemeLetterName","SchemeType","Component","SchemeID","AdditionalRequirementDetails","RequestDate","ChangesDate","DifferentRequirementFromUnit","DefineBy","ReasonForNotDefine","Status","DefineTime","StartTime","EndTime","Ageing","Day","SchemeDate","Days","TAT","SchemeDeployed","Checker1Date","Checker1Name","Error","Error_","Solved","ErrorHighlightedByRegion","RegionName","ErrorAccepted","ErrorDescription","HighlightedByOfficerName","HighlightedDate","Rectified","RectificationDate","ResolvingTime"};

            for (int i = 0; i < headers.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(headers[i]);
            }

            while (rs.next()) {
                Row row = sheet.createRow(++rowNum);

                int colNum = 0;
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    Cell cell = row.createCell(colNum++);
                    cell.setCellValue(rs.getString(i));
                }
            }

            String FileName = "Generated_Report_" + formattedDate + ".xlsx";
            response.setContentType("application/vnd.ms-excel");
            response.setHeader("Content-Disposition", "attachment; filename=" + FileName + "");

            try (ServletOutputStream out = response.getOutputStream()) {
                workbook.write(out);
                out.flush();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Export.class.getName()).log(Level.SEVERE, null, ex);
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
       // processRequest(request, response);
       String from = request.getParameter("from");
       String to = request.getParameter("to");
       try {
            LocalDate tDate = LocalDate.now();
            DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String formattedDate = tDate.format(formatDate);
            Connection conn = Resource.DB.getConnection();
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Exported");
            Statement stmt = conn.createStatement();
            String s="SELECT srno,Region,Division,SchemeLetterReceivedDate,SchemeLetterReceivedTime,SchemeLetterName,SchemeType,Component,SchemeID,AdditionalRequirementDetails,RequestDate,ChangesDate,DifferentRequirementFromUnit,DefineBy,ReasonForNotDefine,Status,DefineTime,StartTime,EndTime,Ageing,Day,SchemeDate,Days,TAT,SchemeDeployed,Checker1Date,Checker1Name,Error,Error_,Solved,ErrorHighlightedByRegion,RegionName,ErrorAccepted,ErrorDescription,HighlightedByOfficerName,HighlightedDate,Rectified,RectificationDate,ResolvingTime FROM scheme where actiondate between "+from+" and "+to+"";
            System.out.println("String :"+s);
            ResultSet rs = stmt.executeQuery("SELECT srno,Region,Division,SchemeLetterReceivedDate,SchemeLetterReceivedTime,SchemeLetterName,SchemeType,Component,SchemeID,AdditionalRequirementDetails,RequestDate,ChangesDate,DifferentRequirementFromUnit,DefineBy,ReasonForNotDefine,Status,DefineTime,StartTime,EndTime,Ageing,Day,SchemeDate,Days,TAT,SchemeDeployed,Checker1Date,Checker1Name,Error,Error_,Solved,ErrorHighlightedByRegion,RegionName,ErrorAccepted,ErrorDescription,HighlightedByOfficerName,HighlightedDate,Rectified,RectificationDate,ResolvingTime FROM scheme where actiondate between '"+from+"' and '"+to+"'");
            int rowNum = 0;
            Row headerRow = sheet.createRow(0);
            String[] headers = {"Region","Division","SchemeLetterReceivedDate","SchemeLetterReceivedTime","SchemeLetterName","SchemeType","Component","SchemeID","AdditionalRequirementDetails","RequestDate","ChangesDate","DifferentRequirementFromUnit","DefineBy","ReasonForNotDefine","Status","DefineTime","StartTime","EndTime","Ageing","Day","SchemeDate","Days","TAT","SchemeDeployed","Checker1Date","Checker1Name","Error","Error_","Solved","ErrorHighlightedByRegion","RegionName","ErrorAccepted","ErrorDescription","HighlightedByOfficerName","HighlightedDate","Rectified","RectificationDate","ResolvingTime"};

            for (int i = 0; i < headers.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(headers[i]);
            }

            while (rs.next()) {
                Row row = sheet.createRow(++rowNum);

                int colNum = 0;
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    Cell cell = row.createCell(colNum++);
                    cell.setCellValue(rs.getString(i));
                }
            }

            String FileName = "Generated_Report_" + formattedDate + ".xlsx";
            response.setContentType("application/vnd.ms-excel");
            response.setHeader("Content-Disposition", "attachment; filename=" + FileName + "");

            try (ServletOutputStream out = response.getOutputStream()) {
                workbook.write(out);
                out.flush();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Export.class.getName()).log(Level.SEVERE, null, ex);
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
