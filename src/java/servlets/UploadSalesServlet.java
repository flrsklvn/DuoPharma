/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import DB.ReportDB;
import DB.SalesDB;
import Entities.Report;
import Entities.Sales;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Blob;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author Klvn Flrs
 */
@MultipartConfig(maxFileSize = 16177215)
public class UploadSalesServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
          
    }
}
    

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
                System.out.println("TEST");

       InputStream inputStream = null;
        Part filePart = request.getPart("file");
       
        inputStream  = filePart.getInputStream();
       
        
        POIFSFileSystem fs = new POIFSFileSystem(inputStream);

//       FileInputStream fichier = new FileInputStream(new File("countries.xls"));
       //create workbook instance that refers to xlsx file
       HSSFWorkbook wb = new HSSFWorkbook(fs);
       HSSFSheet sheet = wb.getSheetAt(0);
  
       FormulaEvaluator formulaEvaluator = 
                     wb.getCreationHelper().createFormulaEvaluator();
   ArrayList<Sales> arrSales = new ArrayList<>();
        ReportDB reportDB = new ReportDB();
        reportDB.addReport(new Report("Sales","Pending"));
        ArrayList<Report> reportList = new ArrayList();
        reportList = reportDB.getAllReports();
        int ReportRef = reportList.size();
       for (Row ligne : sheet) {//iterate rows
          Sales sales = new Sales();
         for (Cell cell : ligne) {//iterate columns
           //cell type
           /* Sales sales;
           (lagay sa sys out)
           sales.setSalesID(cell.getNumericCellValue());
           --- WALA TO */         

           switch (formulaEvaluator.evaluateInCell(cell).getCellType())
           {
                 case Cell.CELL_TYPE_NUMERIC:
                  //   sales.setName(cell.getNumericCellValue());
                     System.out.print("cell 1  " + cell.getNumericCellValue() + " \t");
                     if(cell.getColumnIndex()==0){
                         
                     sales.setSalesAmmount(cell.getNumericCellValue());
                     }if(cell.getColumnIndex()==1){
                         
                     sales.setCreatedBy((int)cell.getNumericCellValue());
                     }if(cell.getColumnIndex()==2){
                         
                     sales.setLocation((int)cell.getNumericCellValue());
                     }

                     break;
                 case Cell.CELL_TYPE_STRING:
                     System.out.print("cell 2  " + cell.getStringCellValue() + " \t");
                     break;
           }
         }
         sales.setReportRef(ReportRef);
         arrSales.add(sales);
         System.out.println();
       }
         System.out.println("\t");
       System.out.println("Size: "+arrSales.size());
       System.out.println("\t");
       for(int i=0; i<arrSales.size(); i++){
       System.out.println("Amount: " +arrSales.get(i).getSalesAmmount());
       System.out.println("Created By: " +arrSales.get(i).getCreatedBy());
       System.out.println("Location: " +arrSales.get(i).getLocation());
       System.out.println("ReportRef: "+arrSales.get(i).getReportRef());
       System.out.println("\t");
       }
      request.setAttribute("arrSales",arrSales);
    SalesDB salesdb = new SalesDB();
    request.setAttribute("arrSales",arrSales);
    for(int j=0; j<arrSales.size(); j++){
        salesdb.addSales(arrSales.get(j));
    }
         ServletContext context= getServletContext();
                    RequestDispatcher rd= context.getRequestDispatcher("/isrAfteruploadSales.jsp");
                    
                    rd.forward(request, response);
                 
        processRequest(request, response);
    }
    

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
