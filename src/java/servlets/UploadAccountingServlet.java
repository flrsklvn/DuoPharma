/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import DB.InventoryDB;
import DB.SalesDB;
import Entities.Inventory;
import Entities.Sales;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
public class UploadAccountingServlet extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
         
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("TEST");

       InputStream inputStream = null;
        Part filePart = request.getPart("file");
       
        inputStream  =filePart.getInputStream();
        
        POIFSFileSystem fs = new POIFSFileSystem(inputStream);

//       FileInputStream fichier = new FileInputStream(new File("countries.xls"));
       //create workbook instance that refers to xlsx file
       HSSFWorkbook wb = new HSSFWorkbook(fs);
       HSSFSheet sheet = wb.getSheetAt(0);
  
       FormulaEvaluator formulaEvaluator = 
                     wb.getCreationHelper().createFormulaEvaluator();
   ArrayList<Inventory> arrInventory = new ArrayList<>();
  
       for (Row ligne : sheet) {//iterate rows
          Inventory inventory = new Inventory();
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
                     
                     if(cell.getColumnIndex()==1){
                         
                     inventory.setQuantityOnHand((int)cell.getNumericCellValue());
                     }
                     
                     if(cell.getColumnIndex()==2){
                         
                     inventory.setGrandTotal((int)cell.getNumericCellValue());
                     }
                     
                     if(cell.getColumnIndex()==3){
                         
                     inventory.setBatchNo((int)cell.getNumericCellValue());
                     }
                     if(cell.getColumnIndex()==6){
                         
                     inventory.setAvemonTO(cell.getNumericCellValue());
                     }
                     break;
                 case Cell.CELL_TYPE_STRING:
                     System.out.print("cell 2  " + cell.getStringCellValue() + " \t");
                     if(cell.getColumnIndex()==0){
                         
                     inventory.setBrandName(cell.getStringCellValue());
                     }
                     if(cell.getColumnIndex()==4){
                         
                     inventory.setExpDate(cell.getStringCellValue());
                     }
                     if(cell.getColumnIndex()==5){
                         
                     inventory.setShelfLife(cell.getStringCellValue());
                     }
                     
                     if(cell.getColumnIndex()==7){
                         
                     inventory.setInventoryMonths(cell.getStringCellValue());
                     }
                     break;
           }
         }
         
         arrInventory.add(inventory);
         System.out.println();
       }
//         System.out.println("\t");
//       System.out.println("Size: "+arrInventory.size());
//       System.out.println("\t");
//       for(int i=0; i<arrInventory.size(); i++){
//       System.out.println("Amount: " +arrInventory.get(i).getSalesAmmount());
//       System.out.println("Created By: " +arrInventory.get(i).getCreatedBy());
//       System.out.println("Location: " +arrInventory.get(i).getLocation());
//       System.out.println("\t");
//       }
      request.setAttribute("arrInventory",arrInventory);
    InventoryDB inventoryDB = new InventoryDB();
        request.setAttribute("arrInventory",arrInventory);
    for(int j=0; j<arrInventory.size(); j++){
        inventoryDB.addInventory(arrInventory.get(j));
    }
         ServletContext context= getServletContext();
                    RequestDispatcher rd= context.getRequestDispatcher("/isrAfteruploadInventory.jsp");
                    rd.forward(request, response);
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
