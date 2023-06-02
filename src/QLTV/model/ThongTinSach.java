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
public class ThongTinSach {
    private String MaSach,TenSach,TheLoai,TacGia,NhaXuatBan,NgayNhap;
    private int SoLuongSach,NamXuatBan,GiaTri,TinhTrang;

    public ThongTinSach() {
    }

    public ThongTinSach(String MaSach, String TenSach, String TheLoai, String TacGia, int SoLuongSach, int NamXuatBan, String NhaXuatBan, String NgayNhap, int GiaTri, int TinhTrang) {
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.TheLoai = TheLoai;
        this.TacGia = TacGia;
        this.NhaXuatBan = NhaXuatBan;
        this.NgayNhap = NgayNhap;
        this.SoLuongSach = SoLuongSach;
        this.NamXuatBan = NamXuatBan;
        this.GiaTri = GiaTri;
        this.TinhTrang = TinhTrang;
    }

    public ThongTinSach(String MaSach, String TenSach, String TheLoai, String TacGia) {
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.TheLoai = TheLoai;
        this.TacGia = TacGia;
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

    public String getTheLoai() {
        return TheLoai;
    }

    public void setTheLoai(String TheLoai) {
        this.TheLoai = TheLoai;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String TacGia) {
        this.TacGia = TacGia;
    }

    public String getNhaXuatBan() {
        return NhaXuatBan;
    }

    public void setNhaXuatBan(String NhaXuatBan) {
        this.NhaXuatBan = NhaXuatBan;
    }

    public String getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(String NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    public int getSoLuongSach() {
        return SoLuongSach;
    }

    public void setSoLuongSach(int SoLuongSach) {
        this.SoLuongSach = SoLuongSach;
    }

    public int getNamXuatBan() {
        return NamXuatBan;
    }

    public void setNamXuatBan(int NamXuatBan) {
        this.NamXuatBan = NamXuatBan;
    }

    public int getGiaTri() {
        return GiaTri;
    }

    public void setGiaTri(int GiaTri) {
        this.GiaTri = GiaTri;
    }

    public int getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(int TinhTrang) {
        this.TinhTrang = TinhTrang;
    }


    
}
