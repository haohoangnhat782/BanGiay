
package DAO;
import java.sql.*;
import Conection.Database;
import DTO.InformationDTO;
import java.sql.PreparedStatement;

public class InformationDAO {
    public void refreshInformation(String MANV){
         String sql = "select nd.TENDANGNHAP,nd.MATKHAU,nv.*, nd.EMAIL,nd.ROLEID\n"
                           +"from NHANVIEN nv join NGUOIDUNG nd on nv.MANV = nd.NGUOIDUNGID\n"
                           +"where MANV = ?";
        try{
             Connection conn = new Database().getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ps.setString(1, MANV);
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
               }
        }
         catch(Exception ex){
             System.out.println(ex);
         }
    }
    public void updateInformation(InformationDTO in){
        try{
            String sql = "update NHANVIEN\n" +
                    "set HONV = ?, TENNV = ?, NAMSINH = ?, GIOITINH = ?, DIACHI  = ?, DIENTHOAI = ? \n" +
                    "where MANV =?;"+
                    "update NGUOIDUNG\n" +
                    "set TENDANGNHAP = ?, MATKHAU = ?,EMAIL = ?\n" +
                    "where NGUOIDUNGID = ?;";
            Connection conn = new Database().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            System.out.println(in.getHoNV());
            ps.setString(1, in.getHoNV());
            ps.setString(2, in.getTenNV());
            ps.setString(3, in.getNamSinh());
            ps.setString(4,in.getGioiTinh());
            ps.setString(5,in.getDiaChi());
            ps.setString(6, in.getDienThoai());
            ps.setString(7, in.getMaNV()); 
            ps.setString(8,in.getTenDangNhap());
            ps.setString(9, in.getMatKhau());
            ps.setString(10, in.getEmail());
            ps.setString(11, in.getMaNV());
            ps.executeUpdate();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}
