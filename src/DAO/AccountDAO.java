
package DAO;

import Conection.Database;
import DTO.AccountDTO;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;
public class AccountDAO {
    private ArrayList<AccountDTO> listAcc = new ArrayList<>();
    public ArrayList<AccountDTO> getListAccount(){
        String sql = "SELECT * FROM NGUOIDUNG where isDelete=0";
        try{
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                AccountDTO acc = new AccountDTO(
                        rs.getString("NGUOIDUNGID"),
                        rs.getString("TENDANGNHAP"),
                        rs.getString("MATKHAU"),
                        rs.getString("EMAIL"),
                        rs.getString("ROLEID") 
                );
                listAcc.add(acc);
            }
            return listAcc;
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return null;
    }
    public void InsertAccount( AccountDTO account){
    String sql = "INSERT INTO NGUOIDUNG VALUES(?,?,?,?,?,?)";
    try{
        Connection conn = new Database().getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,account.getMaNV());
        ps.setString(2,account.getTenDangNhap());
        ps.setString(3, account.getMatKhau());
        ps.setString(4,account.getEmail());
        ps.setString(5,account.getRoleID());
        ps.setInt(6, 0);
        ps.executeUpdate();
    }
    catch(Exception ex){
        System.out.println(ex);
    }   
}
    public void DeleteAccount(String MaNV){
        String sql = "UPDATE NGUOIDUNG SET isDelete = 1 WHERE NGUOIDUNGID = ?";
        try {
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, MaNV);
            ps.executeUpdate();
        } 
        catch(Exception ex) {
           System.out.println(ex);
        }
    }
    public void UpdateAccount(AccountDTO account){
        String sql = "UPDATE NGUOIDUNG SET TENDANGNHAP = ?,MATKHAU = ?, EMAIL = ? WHERE NGUOIDUNGID = ?";
        try{
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, account.getTenDangNhap());
            ps.setString(2, account.getMatKhau());
            ps.setString(3, account.getEmail());
            ps.setString(4, account.getMaNV());
            ps.executeUpdate();

        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}
