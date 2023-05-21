
package DTO;

public class CTSupplyDTO {
    private String MaNH, SoLuong;
    private String MaSP, TenSP, GiaSP;

    public CTSupplyDTO() {
    }

    public CTSupplyDTO(String MaNH, String MaSP, String TenSP, String GiaSP, String SoLuong) {
        this.MaNH = MaNH;
        this.SoLuong = SoLuong;
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.GiaSP = GiaSP;
    }

    public String getMaNH() {
        return MaNH;
    }

    public void setMaNH(String MaNH) {
        this.MaNH = MaNH;
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

    public String getGiaSP() {
        return GiaSP;
    }

    public void setGiaSP(String GiaSP) {
        this.GiaSP = GiaSP;
    }
    
}
