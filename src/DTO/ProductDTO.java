
package DTO;

public class ProductDTO {
    private String MaSP, TenSP, SoLuong,GiaNhapHang, GiaSanPham, MaLoai, MaNSX, IMG;

    public ProductDTO() {
    }

    public ProductDTO(String MaSP, String TenSP, String SoLuong, String GiaNhapHang, String GiaSanPham, String MaLoai, String MaNSX, String IMG) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.SoLuong = SoLuong;
        this.GiaNhapHang = GiaNhapHang;
        this.GiaSanPham = GiaSanPham;
        this.MaLoai = MaLoai;
        this.MaNSX = MaNSX;
        this.IMG = IMG;
    }

    public ProductDTO(String MaSP, String TenSP,  String GiaNhapHang ,String SoLuong) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.SoLuong = SoLuong;
        this.GiaNhapHang = GiaNhapHang;
    }
    
    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(String SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getGiaSanPham() {
        return GiaSanPham;
    }

    public void setGiaSanPham(String GiaSanPham) {
        this.GiaSanPham = GiaSanPham;
    }

    public String getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(String MaLoai) {
        this.MaLoai = MaLoai;
    }

    public String getMaNSX() {
        return MaNSX;
    }

    public void setMaNSX(String MaNSX) {
        this.MaNSX = MaNSX;
    }

    public String getIMG() {
        return IMG;
    }

    public void setIMG(String IMG) {
        this.IMG = IMG;
    }

    public String getGiaNhapHang() {
        return GiaNhapHang;
    }

    public void setGiaNhapHang(String GiaNhapHang) {
        this.GiaNhapHang = GiaNhapHang;
    }
    
}
