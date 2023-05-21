
package DAO;

import Conection.Database;
import DTO.TypeDTO;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;

public class TypeDAO {
    private ArrayList<TypeDTO> listType = new ArrayList<>();
    public ArrayList<TypeDTO> getListType(){
        String sql ="SELECT * FROM PHANLOAI where isDelete = 0";
        try{
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                TypeDTO pro = new TypeDTO(
                        rs.getString("MALOAI"), 
                        rs.getString("TENLOAI"));
                listType.add(pro);
            }
            return listType;
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return null;
    }
     public void InsertType( TypeDTO type){
        String sql = "INSERT INTO PHANLOAI VALUES(?,?,0)";
        try{
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,type.getMaLoai());
            ps.setString(2,type.getTenLoai());
            ps.executeUpdate();
        }
        catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Do not enter the same type code", "Warning", JOptionPane.ERROR_MESSAGE);
        }   
    }
    public void DeleteType(String MaLoai){
        String sql = "UPDATE PHANLOAI SET isdelete = 1 where MALOAI = ?";
        try {
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, MaLoai);
            ps.executeUpdate();
        } 
        catch(Exception ex) {
           System.out.println(ex);
        }
    }
    public void UpdateType(TypeDTO type){
        String sql = "UPDATE PHANLOAI SET TENLOAI = ? WHERE MALOAI = ?";
        try{
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, type.getTenLoai());
            ps.setString(2, type.getMaLoai());
            ps.executeUpdate();

        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}
