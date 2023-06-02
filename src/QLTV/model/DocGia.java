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
public class DocGia {
    private String HoTenDG,LoaiDG,NgaySinh,DiaChi,Email,NgayLapThe;

    public DocGia() {
    }

    public DocGia(String HoTenDG, String LoaiDG, String NgaySinh, String DiaChi, String Email, String NgayLapThe) {
        this.HoTenDG = HoTenDG;
        this.LoaiDG = LoaiDG;
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
        this.Email = Email;
        this.NgayLapThe = NgayLapThe;
    }

    public String getHoTenDG() {
        return HoTenDG;
    }

    public void setHoTenDG(String HoTenDG) {
        this.HoTenDG = HoTenDG;
    }

    public String getLoaiDG() {
        return LoaiDG;
    }

    public void setLoaiDG(String LoaiDG) {
        this.LoaiDG = LoaiDG;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNgayLapThe() {
        return NgayLapThe;
    }

    public void setNgayLapThe(String NgayLapThe) {
        this.NgayLapThe = NgayLapThe;
    }
    
    
}
