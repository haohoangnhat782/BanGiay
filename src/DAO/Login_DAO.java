
package DAO;

import Conection.Database;
import DTO.InformationDTO;
import GUI.Home_Page;
import GUI.InformationGUI;
import GUI.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login_DAO {
    public int login(String UserName, String PassWord){
          try{
                String sql ="select nd.TENDANGNHAP,nd.MATKHAU,nv.*, nd.EMAIL,nd.ROLEID\n"
                        
                           +"from NHANVIEN nv join NGUOIDUNG nd on nv.MANV = nd.NGUOIDUNGID\n"
                           +"where TenDangNhap = ? and MatKhau = ?";
                Connection conn = new Database().getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, UserName);
                ps.setString(2, PassWord);
                ResultSet rs = ps.executeQuery();
                if(rs.next()){ // nếu đúng thì....
                    InformationDTO io = new InformationDTO();
                    io.setTenDangNhap(rs.getString(1));
                    io.setMatKhau(rs.getString(2));
                    io.setMaNV(rs.getString(3));
                    io.setHoNV(rs.getString(4));
                    io.setTenNV(rs.getString(5));
                    io.setNamSinh(rs.getString(6));
                    io.setGioiTinh(rs.getString(7));
                    io.setDienThoai(rs.getString(8));
                    io.setDiaChi(rs.getString(9));
                    io.setLuong(rs.getString(10));
                    io.setIMG(rs.getString(11));
                    io.setIsDelete(rs.getInt(12));
                    io.setEmail(rs.getString(13));
                    io.setRoleID(rs.getInt(14));
                    return 1;
                }
                else{  
                    return 0;
                }
            }catch(Exception ex){ 
                System.out.println(ex);
            }
          return 0;
    }
}
