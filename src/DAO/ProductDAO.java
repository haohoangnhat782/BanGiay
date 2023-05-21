
package DAO;

import Conection.Database;
import DTO.ProductDTO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
public class ProductDAO {
    private ArrayList<ProductDTO> listProd = new ArrayList<>();
    public ArrayList<ProductDTO> getListProduct(){
        String sql = "SELECT * FROM SANPHAM where isDelete = 0";
        try{
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ProductDTO pro = new ProductDTO(
                        rs.getString("MASP"), 
                        rs.getString("TENSP"),
                        rs.getString("SOLUONG"), 
                        rs.getString("GIANH"),
                        rs.getString("GIASP"),
                        rs.getString("MALOAI"),
                        rs.getString("MANSX"), 
                        rs.getString("IMG")
                );
                listProd.add(pro);
            }
            return listProd;
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return null;
    }
     public ArrayList<ProductDTO> getListProductTheoMaNCC(String MaNCC){
        String sql = "SELECT s.MASP,s.TENSP,s.GiaNH,s.SOLUONG\n" +
                     "FROM CHITIETNH c join NHAPHANG n on c.MANH = n.MANH\n" +
                     "			     join SANPHAM s on c.MASP = s.MASP\n" +
                     "WHERE s.isDelete = 0 and n.MANCC = ?";
        try{
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, MaNCC);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ProductDTO pro = new ProductDTO(
                        rs.getString("MASP"), 
                        rs.getString("TENSP"),
                        rs.getString("GIANH"),
                        rs.getString("SOLUONG") 
                        
                );
                listProd.add(pro);
            }
            return listProd;
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return null;
    }
    public void InsertProduct( ProductDTO product){
    String sql = "INSERT INTO SANPHAM VALUES(?,?,?,?,?,?,?,?,0)";
    try{
        Connection conn = new Database().getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,product.getMaSP());
        ps.setString(2,product.getTenSP());
        ps.setString(3, product.getSoLuong());
        ps.setString(4, product.getGiaNhapHang());
        ps.setString(5,product.getGiaSanPham());
        ps.setString(6,product.getMaLoai());
        ps.setString(7, product.getMaNSX());
        ps.setString(8,product.getIMG());

        ps.executeUpdate();
    }
    catch(Exception ex){
         
            JOptionPane.showMessageDialog(null, "Mã sản phẩm bị trùng hoặc chưa có mã loại hoặc chưa có mã nhà sản xuất", "Warning", JOptionPane.ERROR_MESSAGE);
    }   
}
    public void DeleteProduct(String MaSP){
        String sql = "UPDATE SANPHAM SET isDelete = 1 where MASP = ?";
        try {
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, MaSP);
            ps.executeUpdate();
        } 
        catch(Exception ex) {
           System.out.println(ex);
        }
    }
    public void UpdateProduct(ProductDTO product){
        String sql = "UPDATE SANPHAM SET TENSP = ?,SOLUONG = ?,GIANH = ?, GIASP = ?, MALOAI = ?, MANSX = ?, IMG = ?  WHERE MASP = ?";
        try{
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,product.getTenSP());
            ps.setString(2,product.getSoLuong());
            ps.setString(3, product.getGiaNhapHang());
            ps.setString(4,product.getGiaSanPham());
            ps.setString(5,product.getMaLoai());
            ps.setString(6,product.getMaNSX());
            ps.setString(7,product.getIMG());
            ps.setString(8,product.getMaSP());
            ps.executeUpdate();

        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
     public void UpdateSoLuong(ProductDTO product){
        String sql = "UPDATE SANPHAM SET SOLUONG = ? WHERE MASP = ?";
        try{
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,product.getSoLuong());
            ps.setString(2,product.getMaSP());
            
            ps.executeUpdate();

        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    public ArrayList<ProductDTO> Search(String sql){
        try{
            listProd.clear();
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ProductDTO pro = new ProductDTO(
                        rs.getString("MASP"), 
                        rs.getString("TENSP"),
                        rs.getString("SOLUONG"), 
                        rs.getString("GIANH"),
                        rs.getString("GIASP"),
                        rs.getString("MALOAI"),
                        rs.getString("MANSX"), 
                        rs.getString("IMG")
                );
                listProd.add(pro);
            }
            for(ProductDTO x: listProd){
                System.out.println(x.getMaSP());
            }
            return listProd;
        }
        catch(Exception ex){
             ex.printStackTrace();
        }
        return null;
    }
    public void ExportExcel(){
        try {
            String sql = "SELECT * FROM SANPHAM WHERE ISDELETE = 0";
             
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet("Product");

            HSSFFont font = workbook.createFont();
            font.setFontHeightInPoints((short) 14);
            font.setBold(true);

            HSSFCellStyle style = workbook.createCellStyle();
            style.setFont(font);
            
            HSSFRow row = sheet.createRow(0);
            HSSFCell cell;
            
            cell = row.createCell(0);
            cell.setCellValue("MASP");
            cell.setCellStyle(style);
            cell = row.createCell(1);
            cell.setCellValue("TENSP");
            cell.setCellStyle(style);
            cell = row.createCell(2);
            cell.setCellValue("SOLUONG");
            cell.setCellStyle(style);
            cell = row.createCell(3);
            cell.setCellValue("GIANH");
            cell.setCellStyle(style);
            cell = row.createCell(4);
            cell.setCellValue("GIASP");
            cell.setCellStyle(style);
            cell = row.createCell(5);
            cell.setCellValue("MALOAI");
            cell.setCellStyle(style);
            cell = row.createCell(6);
            cell.setCellValue("MANSX");
            cell.setCellStyle(style);
            cell = row.createCell(7);
            cell.setCellValue("IMG");
            cell.setCellStyle(style);
            
            int i = 1;

            while (rs.next()) {
                row = sheet.createRow(i);
                cell = row.createCell(0);
                cell.setCellValue(rs.getString("MASP"));
                cell = row.createCell(1);
                cell.setCellValue(rs.getString("TENSP"));
                cell = row.createCell(2);
                cell.setCellValue(rs.getString("SOLUONG"));
                cell = row.createCell(3);
                cell.setCellValue(rs.getString("GIANH"));
                cell = row.createCell(4);
                cell.setCellValue(rs.getString("GIASP"));
                cell = row.createCell(5);
                cell.setCellValue(rs.getString("MALOAI"));
                cell = row.createCell(6);
                cell.setCellValue(rs.getString("MANSX"));
                cell = row.createCell(7);
                cell.setCellValue(rs.getString("IMG"));
                i++;
            }
            for (int colNum = 0; colNum < row.getLastCellNum(); colNum++) {
                sheet.autoSizeColumn((short) (colNum));
            }

            FileOutputStream out = new FileOutputStream(new File(System.getProperty("user.dir") + "\\Report\\Product.xls"));
            workbook.write(out);
            out.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
   
}
