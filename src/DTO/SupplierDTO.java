
package DTO;


public class SupplierDTO {
    public String MaNCC, TenNCC, DienThoai, DiaChi, Sofax;

    public SupplierDTO() {
    }

    public SupplierDTO(String MaNCC, String TenNCC, String DienThoai, String DiaChi, String Sofax) {
        this.MaNCC = MaNCC;
        this.TenNCC = TenNCC;
        this.DienThoai = DienThoai;
        this.DiaChi = DiaChi;
        this.Sofax = Sofax;
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }

    public String getTenNCC() {
        return TenNCC;
    }

    public void setTenNCC(String TenNCC) {
        this.TenNCC = TenNCC;
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

    public String getSofax() {
        return Sofax;
    }

    public void setSofax(String Sofax) {
        this.Sofax = Sofax;
    }
    
}
