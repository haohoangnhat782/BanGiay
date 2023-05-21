
package DAO;

import Conection.Database;
import DTO.ProducerDTO;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;

public class ProducerDAO {
    private ArrayList<ProducerDTO> listPro = new ArrayList<>();
    public ArrayList<ProducerDTO> getListProducer(){
        String sql ="SELECT * FROM NHASANXUAT where isDelete = 0";
        try{
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ProducerDTO pro = new ProducerDTO(
                        rs.getString("MANSX"), 
                        rs.getString("TENNSX"));
                listPro.add(pro);
            }
            return listPro;
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return null;
    }
    public void InsertProducer( ProducerDTO producer){
        String sql = "INSERT INTO NHASANXUAT VALUES(?,?,0)";
        try{
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,producer.getMaNSX());
            ps.setString(2,producer.getTenNSX());
            ps.executeUpdate();
        }
        catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Do not enter the same producer code", "Warning", JOptionPane.ERROR_MESSAGE);
        }   
    }
    public void DeleteProducer(String MaNSX){
        String sql = "UPDATE NHASANXUAT SET isdelete = 1 where MANSX = ?";
        try {
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, MaNSX);
            ps.executeUpdate();
        } 
        catch(Exception ex) {
           System.out.println(ex);
        }
    }
    public void UpdateProducer(ProducerDTO producer){
        String sql = "UPDATE NHASANXUAT SET TENNSX = ? WHERE MANSX = ?";
        try{
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, producer.getTenNSX());
            ps.setString(2, producer.getMaNSX());
            ps.executeUpdate();

        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}
