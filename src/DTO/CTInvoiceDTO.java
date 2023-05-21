
package DTO;

public class CTInvoiceDTO {
    private String MaHD, SoLuong;
    private String MaSP, TenSP, GiaSP;

    public CTInvoiceDTO() {
    }

    public CTInvoiceDTO(String MaHD, String MaSP, String TenSP, String GiaSP,String SoLuong) {
        this.MaHD = MaHD;
        this.SoLuong = SoLuong;
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.GiaSP = GiaSP;
    }

    public String getGiaSP() {
        return GiaSP;
    }

    public void setGiaSP(String GiaSP) {
        this.GiaSP = GiaSP;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(String SoLuong) {
        this.SoLuong = SoLuong;
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
    
}
