
package DTO;

public class AccountDTO {
    private String MaNV, TenDangNhap, MatKhau, Email, RoleID;

    public AccountDTO() {
        
    }

    public AccountDTO(String MaNV, String TenDangNhap, String MatKhau, String Email, String RoleID) {
        this.MaNV = MaNV;
        this.TenDangNhap = TenDangNhap;
        this.MatKhau = MatKhau;
        this.Email = Email;
        this.RoleID = RoleID;
    }

    public String getRoleID() {
        return RoleID;
    }

    public void setRoleID(String RoleID) {
        this.RoleID = RoleID;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenDangNhap() {
        return TenDangNhap;
    }

    public void setTenDangNhap(String TenDangNhap) {
        this.TenDangNhap = TenDangNhap;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
}
