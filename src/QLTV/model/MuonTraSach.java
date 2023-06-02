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
public class MuonTraSach {
    private String NgayMuon,NgayTra,HoTenDG,MaSach,TenSach;
    public int SoNgayMuon;
    public int SoLuotMuon,SoNgayTraTre;

    public MuonTraSach() {
    }

    public MuonTraSach(String NgayMuon, String NgayTra, String HoTenDG, String MaSach, String TenSach, int SoNgayMuon, int SoLuotMuon, int SoNgayTraTre) {
        this.NgayMuon = NgayMuon;
        this.NgayTra = NgayTra;
        this.HoTenDG = HoTenDG;
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.SoNgayMuon = SoNgayMuon;
        this.SoLuotMuon = SoLuotMuon;
        this.SoNgayTraTre = SoNgayTraTre;
    }

    public String getNgayMuon() {
        return NgayMuon;
    }

    public void setNgayMuon(String NgayMuon) {
        this.NgayMuon = NgayMuon;
    }

    public String getNgayTra() {
        return NgayTra;
    }

    public void setNgayTra(String NgayTra) {
        this.NgayTra = NgayTra;
    }

    public String getHoTenDG() {
        return HoTenDG;
    }

    public void setHoTenDG(String HoTenDG) {
        this.HoTenDG = HoTenDG;
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public int getSoNgayMuon() {
        return SoNgayMuon;
    }

    public void setSoNgayMuon(int SoNgayMuon) {
        this.SoNgayMuon = SoNgayMuon;
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
