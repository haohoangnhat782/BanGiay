
package DAO;

import Conection.Database;
import DTO.CTSupplyDTO;
import java.util.ArrayList;
import java.sql.*;

public class CTSupplyDAO {
    private ArrayList<CTSupplyDTO> listCTSupply = new ArrayList<>();
    public ArrayList<CTSupplyDTO> getListCTSupply(){
        String sql = "SELECT c.MANH, c.MASP,c.TENSP,s.GiaNH,c.SOLUONG\n" +
                     "FROM SANPHAM s join CHITIETNH c on s.MASP = c.MASP";
        try{
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                CTSupplyDTO cs = new CTSupplyDTO(
                        rs.getString("MANH"),   
                        rs.getString("MASP"),
                        rs.getString("TENSP"),
                        rs.getString("GIANH"),
                        rs.getString("SOLUONG"));
                listCTSupply.add(cs);
            }
            return listCTSupply;
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return null;
    }
    public void InsertCTSupply(CTSupplyDTO su){
        String sql = "INSERT INTO CHITIETNH VALUES(?,?,?,?)";
        try{
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, su.getMaNH());
            ps.setString(2,su.getMaSP());
            ps.setString(3,su.getTenSP());
            ps.setString(4, su.getSoLuong());
            ps.executeUpdate();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}
