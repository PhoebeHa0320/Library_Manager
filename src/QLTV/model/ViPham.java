/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLTV.model;

/**
 *
 * @author ngohien
 */
public class ViPham {
    private String HoTenDG;
    private int SoTienThu,TienPhatKyNay,TienNoKyNay,TongNo,TienConLai;

    public ViPham() {
    }

    public ViPham(String HoTenDG, int SoTienThu, int TienPhatKyNay, int TienNoKyNay, int TongNo, int TienConLai) {
        this.HoTenDG = HoTenDG;
        this.SoTienThu = SoTienThu;
        this.TienPhatKyNay = TienPhatKyNay;
        this.TienNoKyNay = TienNoKyNay;
        this.TongNo = TongNo;
        this.TienConLai = TienConLai;
    }

    public String getHoTenDG() {
        return HoTenDG;
    }

    public void setHoTenDG(String HoTenDG) {
        this.HoTenDG = HoTenDG;
    }

    public int getSoTienThu() {
        return SoTienThu;
    }

    public void setSoTienThu(int SoTienThu) {
        this.SoTienThu = SoTienThu;
    }

    public int getTienPhatKyNay() {
        return TienPhatKyNay;
    }

    public void setTienPhatKyNay(int TienPhatKyNay) {
        this.TienPhatKyNay = TienPhatKyNay;
    }

    public int getTienNoKyNay() {
        return TienNoKyNay;
    }

    public void setTienNoKyNay(int TienNoKyNay) {
        this.TienNoKyNay = TienNoKyNay;
    }

    public int getTongNo() {
        return TongNo;
    }

    public void setTongNo(int TongNo) {
        this.TongNo = TongNo;
    }

    public int getTienConLai() {
        return TienConLai;
    }

    public void setTienConLai(int TienConLai) {
        this.TienConLai = TienConLai;
    }
    
    
}
