/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author SYN
 */
public class StatisticDTO {
    private String maSP,soLuong,chiTieu,doanhThu;

    public StatisticDTO() {
    }

    public StatisticDTO(String maSP, String soLuong, String chiTieu, String doanhThu) {
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.chiTieu = chiTieu;
        this.doanhThu = doanhThu;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public String getChiTieu() {
        return chiTieu;
    }

    public void setChiTieu(String chiTieu) {
        this.chiTieu = chiTieu;
    }

    public String getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(String doanhThu) {
        this.doanhThu = doanhThu;
    }
    
}
