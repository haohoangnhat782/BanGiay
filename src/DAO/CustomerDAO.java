
package DAO;

import Conection.Database;
import DTO.CustomerDTO;
import java.io.File;
import java.io.FileOutputStream;
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

public class CustomerDAO {
    private ArrayList<CustomerDTO> listCus = new ArrayList<>();
    public ArrayList<CustomerDTO> getListCustomer(){
        String sql = "SELECT * FROM KHACHHANG where isDelete=0";
        try{
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                CustomerDTO cus = new CustomerDTO(
                        rs.getString("MAKH"), 
                        rs.getString("HOKH"), 
                        rs.getString("TENKH"), 
                        rs.getString("GIOITINH"), 
                        rs.getString("DIENTHOAI"), 
                        rs.getString("DIACHI")
                );
                listCus.add(cus);
            }
            return listCus;
        }  
        catch(Exception ex){
            System.out.println(ex);
        }
        return null;
    }
    public ArrayList<String> getListMaKH(){
        String sql = "SELECT MAKH FROM KHACHHANG";
        ArrayList<String> listMaKH = new ArrayList<>();
        try{
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String Value = rs.getString("MAKH");
                listMaKH.add(Value);
            }
            return listMaKH;
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return null;
    }
    public void InsertCustomer( CustomerDTO customer){
        String sql = "INSERT INTO KHACHHANG VALUES(?,?,?,?,?,?,?)";
        try{
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,customer.getMaKH());
            ps.setString(2,customer.getHoKH());
            ps.setString(3, customer.getTenKH());
            ps.setString(4,customer.getGioiTinh());
            ps.setString(5,customer.getDienThoai());
            ps.setString(6, customer.getDiaChi());
            ps.setInt(7, 0);
            ps.executeUpdate();
        }
        catch(Exception ex){
             Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Do not enter the same customer code", "Warning", JOptionPane.ERROR_MESSAGE);
        }   
    }
    public void DeleteCustomer(String MaKH){
        String sql = "UPDATE KHACHHANG SET isdelete = ? where MAKH= ?";
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
    public void UpdateCustomer(CustomerDTO customer){
        String sql = "UPDATE KHACHHANG SET HOKH = ?,TENKH = ?, GIOITINH = ?, DIENTHOAI = ?, DIACHI = ?  WHERE MAKH = ?";
        try{
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, customer.getHoKH());
            ps.setString(2, customer.getTenKH());
            ps.setString(3, customer.getGioiTinh());
            ps.setString(4, customer.getDienThoai());
            ps.setString(5, customer.getDiaChi());
            ps.setString(6, customer.getMaKH());
            ps.executeUpdate();

        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    public ArrayList<CustomerDTO> Search(String sql){
        try{
            listCus.clear();
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               CustomerDTO cus = new CustomerDTO(
                        rs.getString("MAKH"), 
                        rs.getString("HOKH"), 
                        rs.getString("TENKH"), 
                        rs.getString("GIOITINH"), 
                        rs.getString("DIENTHOAI"), 
                        rs.getString("DIACHI")
                );
                listCus.add(cus);
            }
            return listCus;
        }
        catch(Exception ex){
             ex.printStackTrace();
        }
        return null;
    }
    public void ExportExcel(){
        try{
            String sql = "SELECT * FROM KHACHHANG WHERE ISDELETE = 0";
            
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet("Customer");

            HSSFFont font = workbook.createFont();
            font.setFontHeightInPoints((short) 14);
            font.setBold(true);

            HSSFCellStyle style = workbook.createCellStyle();
            style.setFont(font);
            
            HSSFRow row = sheet.createRow(0);
            HSSFCell cell;
            
            cell = row.createCell(0);
            cell.setCellValue("MAKH");
            cell.setCellStyle(style);
            cell = row.createCell(1);
            cell.setCellValue("HOKH");
            cell.setCellStyle(style);
            cell = row.createCell(2);
            cell.setCellValue("TENKH");
            cell.setCellStyle(style);
            cell = row.createCell(3);
            cell.setCellValue("GIOITINH");
            cell.setCellStyle(style);
            cell = row.createCell(4);
            cell.setCellValue("DIENTHOAI");
            cell.setCellStyle(style);
            cell = row.createCell(5);
            cell.setCellValue("DIACHI");
            cell.setCellStyle(style);
            
            int i = 1;

            while (rs.next()) {
                row = sheet.createRow(i);
                cell = row.createCell(0);
                cell.setCellValue(rs.getString("MAKH"));
                cell = row.createCell(1);
                cell.setCellValue(rs.getString("HOKH"));
                cell = row.createCell(2);
                cell.setCellValue(rs.getString("TENKH"));
                cell = row.createCell(3);
                cell.setCellValue(rs.getString("GIOITINH"));
                cell = row.createCell(4);
                cell.setCellValue(rs.getString("DIENTHOAI"));
                cell = row.createCell(5);
                cell.setCellValue(rs.getString("DIACHI"));
                i++;
            }
            for (int colNum = 0; colNum < row.getLastCellNum(); colNum++) {
                sheet.autoSizeColumn((short) (colNum));
            }

            FileOutputStream out = new FileOutputStream(new File(System.getProperty("user.dir") + "\\Report\\Customer.xls"));
            workbook.write(out);
            out.close();

             
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
