
package DAO;

import Conection.Database;
import DTO.SupplierDTO;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class SupplierDAO {
    private ArrayList<SupplierDTO> listSup = new ArrayList<>();
    public ArrayList<SupplierDTO> getListSupplier(){
        String sql = "SELECT * FROM NHACUNGCAP where isDelete = 0";
        try{
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                SupplierDTO sup = new SupplierDTO(
                        rs.getString("MANCC"), 
                        rs.getString("TENNCC"), 
                        rs.getString("DIENTHOAI"), 
                        rs.getString("DIACHI"), 
                        rs.getString("SOFAX"));
                listSup.add(sup);
            }
            return listSup;
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return null;
    }  
       public void InsertSupplier( SupplierDTO supplier){
        String sql = "INSERT INTO NHACUNGCAP VALUES(?,?,?,?,?,0)";
        try{
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,supplier.getMaNCC());
            ps.setString(2,supplier.getTenNCC());
            ps.setString(3, supplier.getDiaChi());
            ps.setString(4,supplier.getDienThoai());
            ps.setString(5,supplier.getSofax());
            ps.executeUpdate();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Do not enter the same supplier code", "Warning", JOptionPane.ERROR_MESSAGE);
        }   
    }
    public void DeleteSupplier(String MaNCC){
        String sql = "UPDATE NHACUNGCAP SET isdelete = 1 where MANCC = ?";
        try {
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, MaNCC);
            ps.executeUpdate();
        } 
        catch(Exception ex) {
           System.out.println(ex);
        }
    }
    public void UpdateSupplier(SupplierDTO supplier){
        String sql = "UPDATE NHACUNGCAP SET TENNCC = ?,DIACHI = ?, DIENTHOAI = ?, SOFAX = ?  WHERE MANCC = ?";
        try{
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,supplier.getTenNCC());
            ps.setString(2, supplier.getDiaChi());
            ps.setString(3, supplier.getDienThoai());
            ps.setString(4, supplier.getSofax());
            ps.setString(5, supplier.getMaNCC());
            ps.executeUpdate();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
     public ArrayList<SupplierDTO> Search(String sql){
        try{
            listSup.clear();
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                SupplierDTO sup = new SupplierDTO(
                        rs.getString("MANCC"), 
                        rs.getString("TENNCC"), 
                        rs.getString("DIENTHOAI"), 
                        rs.getString("DIACHI"), 
                        rs.getString("SOFAX")
                );
                listSup.add(sup);
            }
           
          
            return listSup;
        }
        catch(Exception ex){
             ex.printStackTrace();
        }
        return null;
    }
    public void ExportExcel(){
        try {
            String sql = "SELECT * FROM NHACUNGCAP WHERE ISDELETE = 0";
            
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
        
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet("Supplier");

            HSSFFont font = workbook.createFont();
            font.setFontHeightInPoints((short) 14);
            font.setBold(true);

            HSSFCellStyle style = workbook.createCellStyle();
            style.setFont(font);

            HSSFRow row = sheet.createRow(0);
            HSSFCell cell;

            cell = row.createCell(0);
            cell.setCellValue("MANCC");
            cell.setCellStyle(style);
            cell = row.createCell(1);
            cell.setCellValue("TENNCC");
            cell.setCellStyle(style);
            cell = row.createCell(2);
            cell.setCellValue("DIACHI");
            cell.setCellStyle(style);
            cell = row.createCell(3);
            cell.setCellValue("DIENTHOAI");
            cell.setCellStyle(style);
            cell = row.createCell(4);
            cell.setCellValue("SOFAX");
            cell.setCellStyle(style);

            int i = 1;

            while (rs.next()) {
                row = sheet.createRow(i);
                cell = row.createCell(0);
                cell.setCellValue(rs.getString("MANCC"));
                cell = row.createCell(1);
                cell.setCellValue(rs.getString("TENNCC"));
                cell = row.createCell(2);
                cell.setCellValue(rs.getString("DIACHI"));
                cell = row.createCell(3);
                cell.setCellValue(rs.getString("DIENTHOAI"));
                cell = row.createCell(4);
                cell.setCellValue(rs.getString("SOFAX"));

                i++;
            }
            for (int colNum = 0; colNum < row.getLastCellNum(); colNum++) {
                sheet.autoSizeColumn((short) (colNum));
            }

            FileOutputStream out = new FileOutputStream(new File(System.getProperty("user.dir") + "\\Report\\Supplier.xls"));
            workbook.write(out);
            out.close();

        } 

        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
