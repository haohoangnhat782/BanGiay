
package DTO;

import java.util.Date;

public class SupplyDTO {
    private String MaNH;
    private String MaNCC, MaNV;
    private Date NgayNhap;
    private String TongTien;

    public SupplyDTO(String MaNH, String MaNCC, String MaNV, Date NgayNhap, String TongTien) {
        this.MaNH = MaNH;
        this.MaNCC = MaNCC;
        this.MaNV = MaNV;
        this.NgayNhap = NgayNhap;
        this.TongTien = TongTien;
    }

    public String getMaNH() {
        return MaNH;
    }

    public void setMaNH(String MaNH) {
        this.MaNH = MaNH;
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public Date getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(Date NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    public String getTongTien() {
        return TongTien;
    }

    public void setTongTien(String TongTien) {
        this.TongTien = TongTien;
    }
    
}
