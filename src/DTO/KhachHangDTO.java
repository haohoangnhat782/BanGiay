/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Administrator
 */
public class KhachHangDTO {
    private String MaKH;
    private String Ho;
    private String Ten;
    private String GioiTinh;
     private String SoDT;
    private String DiaChi;

    public KhachHangDTO() {
    }

    public KhachHangDTO(String MaKH, String Ho, String Ten, String GioiTinh, String DiaChi, String SoDT) {
        this.MaKH = MaKH;
        this.Ho = Ho;
        this.Ten = Ten;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
        this.SoDT = SoDT;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getHo() {
        return Ho;
    }

    public void setHo(String Ho) {
        this.Ho = Ho;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }
    
      public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

}
