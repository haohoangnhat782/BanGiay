
package DTO;

public class CustomerDTO {
    private String MaKH, HoKH,TenKH, GioiTinh, DienThoai, DiaChi;

    public CustomerDTO() {
    }

    public CustomerDTO(String MaKH, String HoKH, String TenKH, String GioiTinh, String DienThoai, String DiaChi) {
        this.MaKH = MaKH;
        this.HoKH = HoKH;
        this.TenKH = TenKH;
        this.GioiTinh = GioiTinh;
        this.DienThoai = DienThoai;
        this.DiaChi = DiaChi;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getHoKH() {
        return HoKH;
    }

    public void setHoKH(String HoKH) {
        this.HoKH = HoKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
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
    
   
}
