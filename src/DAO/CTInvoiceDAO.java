
package DAO;

import Conection.Database;
import DTO.CTInvoiceDTO;
import java.util.ArrayList;
import java.sql.*;

public class CTInvoiceDAO {
    private ArrayList<CTInvoiceDTO> listCTInvoice = new ArrayList<>();
    public ArrayList<CTInvoiceDTO> getListCTInvoice(){
        String sql = "SELECT c.MAHD, c.MASP,c.TEN,s.GIASP,c.SOLUONG\n" +
                     "FROM SANPHAM s join CT_HD c on s.MASP = c.MASP";
        try{
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                CTInvoiceDTO ct = new CTInvoiceDTO(
                        rs.getString("MAHD"),   
                        rs.getString("MASP"),
                        rs.getString("TEN"),
                        rs.getString("GIASP"),
                        rs.getString("SOLUONG"));
                listCTInvoice.add(ct);
            }
            return listCTInvoice;
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return null;
    }
     public void InsertCTInvoice(CTInvoiceDTO in){
        String sql = "INSERT INTO CT_HD VALUES(?,?,?,?)";
        try{
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, in.getMaHD());
            ps.setString(2,in.getMaSP());
            ps.setString(3,in.getTenSP());
            ps.setString(4, in.getSoLuong());
            ps.executeUpdate();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
     
}
