
package DAO;

import Conection.Database;
import DTO.InvoiceDTO;
import java.util.ArrayList;
import java.sql.*;

public class InvoiceDAO {
    private ArrayList<InvoiceDTO> listInv = new ArrayList<>();
    public ArrayList<InvoiceDTO> getListInvoice(){
        String sql = "SELECT * FROM HOADON";
        try{
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                InvoiceDTO in = new InvoiceDTO(
                        rs.getString("MAHD"), 
                        rs.getString("MAKH"), 
                        rs.getString("MANV"), 
                        rs.getDate("NGAYLAP") ,
                        rs.getString("TONGTIEN")
                        );
                listInv.add(in);
            }
            return listInv;
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return null;
    }
    public void InsertInvoice(InvoiceDTO in){
        String sql = "INSERT INTO HOADON VALUES(?,?,?,?,?)";
        try{
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, in.getMaHD());
            ps.setString(2,in.getMaKH());
            ps.setString(3,in.getMaNV());
            ps.setDate(4,new Date(in.getNgayLap().getTime()));
            ps.setString(5,in.getTongTien());
            ps.executeUpdate();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
     public ArrayList<InvoiceDTO> Search(String sql){
        try{
            listInv.clear();
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                InvoiceDTO in = new InvoiceDTO(
                        rs.getString("MAHD"), 
                        rs.getString("MAKH"), 
                        rs.getString("MANV"), 
                        rs.getDate("NGAYLAP") ,
                        rs.getString("TONGTIEN")
                        );
                listInv.add(in);
            }
            return listInv;
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return null;
    }
}
