
package DTO;

public class EmployeeDTO {
    private String MaNV, HoNV, TenNV, NamSinh, GioiTinh, DienThoai, DiaChi, IMG, Luong;

    public EmployeeDTO() {
        
    }

    public EmployeeDTO(String MaNV, String HoNV, String TenNV, String NamSinh, String GioiTinh, String DienThoai, String DiaChi, String Luong, String IMG) {
        this.MaNV = MaNV;
        this.HoNV = HoNV;
        this.TenNV = TenNV;
        this.NamSinh = NamSinh;
        this.GioiTinh = GioiTinh;
        this.DienThoai = DienThoai;
        this.DiaChi = DiaChi;
        this.IMG = IMG;
        this.Luong = Luong;
    }
    

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getHoNV() {
        return HoNV;
    }

    public void setHoNV(String HoNV) {
        this.HoNV = HoNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(String NamSinh) {
        this.NamSinh = NamSinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDienThoai() {
        return DienThoai;
    }

    public void setDienThoai(String DienThoai) {
        this.DienThoai = DienThoai;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getIMG() {
        return IMG;
    }

    public void setIMG(String IMG) {
        this.IMG = IMG;
    }

    public String getLuong() {
        return Luong;
    }

    public void setLuong(String Luong) {
        this.Luong = Luong;
    }   
}
