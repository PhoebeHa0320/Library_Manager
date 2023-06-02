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
public class BaoCao {
    String TheLoai, TenSach,NgayMuon, Ngay, Thang;
    int SoLuotMuon, SoNgayTraTre;

    public BaoCao() {
    }

    public BaoCao(String TheLoai, String Thang, int SoLuotMuon) {
        this.TheLoai = TheLoai;
        this.Thang = Thang;
        this.SoLuotMuon = SoLuotMuon;
    }

    public BaoCao(String TenSach, String NgayMuon, String Ngay, int SoNgayTraTre) {
        this.TenSach = TenSach;
        this.NgayMuon = NgayMuon;
        this.Ngay = Ngay;
        this.SoNgayTraTre = SoNgayTraTre;
    }

    public String getTheLoai() {
        return TheLoai;
    }

    public void setTheLoai(String TheLoai) {
        this.TheLoai = TheLoai;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public String getNgayMuon() {
        return NgayMuon;
    }

    public void setNgayMuon(String NgayMuon) {
        this.NgayMuon = NgayMuon;
    }

    public String getNgay() {
        return Ngay;
    }

    public void setNgay(String Ngay) {
        this.Ngay = Ngay;
    }

    public String getThang() {
        return Thang;
    }

    public void setThang(String Thang) {
        this.Thang = Thang;
    }

    public int getSoLuotMuon() {
        return SoLuotMuon;
    }

    public void setSoLuotMuon(int SoLuotMuon) {
        this.SoLuotMuon = SoLuotMuon;
    }

    public int getSoNgayTraTre() {
        return SoNgayTraTre;
    }

    public void setSoNgayTraTre(int SoNgayTraTre) {
        this.SoNgayTraTre = SoNgayTraTre;
    }



    
}
