
package DAO;

import Conection.Database;
import DTO.SupplyDTO;
import java.util.ArrayList;
import java.sql.*;


public class SupplyDAO {
    private ArrayList<SupplyDTO> listSup = new ArrayList<>();
    public ArrayList<SupplyDTO> getListSupply(){
        String sql = "SELECT * FROM NHAPHANG";
        try{
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                SupplyDTO su = new SupplyDTO(
                        rs.getString("MANH"), 
                        rs.getString("MANCC"), 
                        rs.getString("MANV"), 
                        rs.getDate("NGAYNHAP"), 
                        rs.getString("TONGTIEN"));
                listSup.add(su);
            }
            return listSup;
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return null;
    }
    public void InsertSupply(SupplyDTO su){
        String sql = "INSERT INTO NHAPHANG VALUES(?,?,?,?,?)";
        try{
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,su.getMaNH());
            ps.setString(2,su.getMaNCC());
            ps.setString(3,su.getMaNV());
            ps.setDate(4,new Date(su.getNgayNhap().getTime()));
            ps.setString(5,su.getTongTien());
            ps.executeUpdate();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    public ArrayList<SupplyDTO> Search(String sql){
        try{
            listSup.clear();
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                SupplyDTO su = new SupplyDTO(
                        rs.getString("MANH"), 
                        rs.getString("MANCC"), 
                        rs.getString("MANV"), 
                        rs.getDate("NGAYNHAP"), 
                        rs.getString("TONGTIEN"));
                listSup.add(su);
            }
            return listSup;
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return null;
    }
}
