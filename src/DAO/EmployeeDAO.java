
package DAO;

import Conection.Database;
import DTO.EmployeeDTO;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;



public class EmployeeDAO {
    private ArrayList<EmployeeDTO> listNV = new ArrayList<>();
    public ArrayList<EmployeeDTO> getListEmployee(){
        try{
            String sql = "SELECT * FROM NHANVIEN where isDelete=0";
            Connection conn =  new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                EmployeeDTO e = new EmployeeDTO(
                        rs.getString("MANV"),
                        rs.getString("HONV"),
                        rs.getString("TENNV"), 
                        rs.getString("NAMSINH"),
                        rs.getString("GIOITINH"), 
                        rs.getString("DIENTHOAI"),
                        rs.getString("DIACHI"),
                        String.valueOf(rs.getInt("LUONG")),
                        rs.getString("IMG")
                );        
                listNV.add(e);
            }      
            return listNV;
        }
        catch(Exception ex){
            System.out.println(ex);
        }     
        return null;
    }
     public ArrayList<String> getListMaNV(){
        String sql = "SELECT MANV FROM NHANVIEN";
        ArrayList<String> listMaNV = new ArrayList<>();
        try{
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String Value = rs.getString("MANV");
                listMaNV.add(Value);
            }
            return listMaNV;
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return null;
    }
    public void InsertEmployee(EmployeeDTO employee){
        String sql = "INSERT INTO NHANVIEN VALUES(?,?,?,?,?,?,?,?,?,?)";
        try{
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,employee.getMaNV());
            ps.setString(2,employee.getHoNV());
            ps.setString(3, employee.getTenNV());
            ps.setString(4,employee.getNamSinh());
            ps.setString(5,employee.getGioiTinh());
            ps.setString(6, employee.getDienThoai());
            ps.setString(7,employee.getDiaChi());
            ps.setString(8,employee.getLuong());
            ps.setString(9, employee.getIMG());
            ps.setInt(10,0);
            ps.executeUpdate();
        }
        catch(Exception ex){
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Do not enter the same customer code", "Warning", JOptionPane.ERROR_MESSAGE);
        }   
    }
    public void DeleteEmployee(String MaKH){
        String sql = "UPDATE NHANVIEN SET isdelete = ? where MANV= ?;";
                   
        try {
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "1");
            ps.setString(2, MaKH);
            ps.executeUpdate();
        } 
        catch(Exception ex) {
           System.out.println(ex);
        }
    }
    public void UpdateCustomer(EmployeeDTO employee){
        String sql = "UPDATE NHANVIEN SET HONV = ?,TENNV = ?,NAMSINH = ?, GIOITINH = ?, DIENTHOAI = ?, DIACHI = ?, LUONG = ?, IMG = ?  WHERE MANV = ?";
        try{
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,employee.getHoNV());
            ps.setString(2, employee.getTenNV());
            ps.setString(3,employee.getNamSinh() );
            ps.setString(4, employee.getGioiTinh());
            ps.setString(5,employee.getDienThoai());
            ps.setString(6, employee.getDiaChi());
            ps.setString(7, employee.getLuong());
            ps.setString(8,employee.getIMG());
            ps.setString(9, employee.getMaNV());

            ps.executeUpdate();

        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    public void ExportExcel(){
        try{
            String sql = " SELECT * FROM NHANVIEN WHERE isDELETE = 0";
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet("Employee");  
            
            HSSFFont font = workbook.createFont();
            font.setFontHeightInPoints((short) 14);
            font.setBold(true);
            
            HSSFCellStyle style = workbook.createCellStyle();
            style.setFont(font);

            HSSFRow row = sheet.createRow(0);
            HSSFCell cell;
            
            cell = row.createCell(0);
            cell.setCellValue("MANV");
            cell.setCellStyle(style);
            cell = row.createCell(1);
            cell.setCellValue("HONV");
            cell.setCellStyle(style);
            cell = row.createCell(2);
            cell.setCellValue("TENNV");
            cell.setCellStyle(style);
            cell = row.createCell(3);
            cell.setCellValue("NAMSINH");
            cell.setCellStyle(style);
            cell = row.createCell(4);
            cell.setCellValue("GIOITINH");
            cell.setCellStyle(style);
            cell = row.createCell(5);
            cell.setCellValue("DIENTHOAI");
            cell.setCellStyle(style);
            cell = row.createCell(6);
            cell.setCellValue("DIACHI");
            cell.setCellStyle(style);
            cell = row.createCell(7);
            cell.setCellValue("LUONG");
            cell.setCellStyle(style);
            cell = row.createCell(8);
            cell.setCellValue("IMG");
            cell.setCellStyle(style);
            
             int i = 1;

            while (rs.next()) {
                row = sheet.createRow(i);
                cell = row.createCell(0);
                cell.setCellValue(rs.getString("MANV"));
                cell = row.createCell(1);
                cell.setCellValue(rs.getString("HONV"));
                cell = row.createCell(2);
                cell.setCellValue(rs.getString("TENNV"));
                cell = row.createCell(3);
                cell.setCellValue(rs.getString("NAMSINH"));
                cell = row.createCell(4);
                cell.setCellValue(rs.getString("GIOITINH"));
                cell = row.createCell(5);
                cell.setCellValue(rs.getString("DIENTHOAI"));
                cell = row.createCell(6);
                cell.setCellValue(rs.getString("DIACHI"));
                cell = row.createCell(7);
                cell.setCellValue(rs.getString("LUONG"));
                cell = row.createCell(8);
                cell.setCellValue(rs.getString("IMG"));
                i++;
            }
            for (int colNum = 0; colNum < row.getLastCellNum(); colNum++) {
                sheet.autoSizeColumn((short) (colNum));
            }

            FileOutputStream out = new FileOutputStream(new File(System.getProperty("user.dir") + "\\Report\\Employee.xls"));
            workbook.write(out);
            out.close();       

        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
