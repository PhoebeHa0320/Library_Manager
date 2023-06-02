/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLTV.controller;

import QLTV.helpers.DatabaseHelper;
import QLTV.model.ThongTinSach;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;


/**
 *
 * @author ngohien
 */
public class ThongTinSachControl {
    public boolean insert(ThongTinSach ts)throws Exception{
        String sql = "INSERT INTO dbo.THONGTINSACH(MaSach,TenSach,TheLoai,TacGia,NamXuatBan,NhaXuatBan,NgayNhap,GiaTri,TinhTrang,SoLuongSach)"+
                " values(?,?,?,?,?,?,?,?,?,?)";    
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        pstmt.setString(1, ts.getMaSach());
        pstmt.setString(2,ts.getTenSach());
        pstmt.setString(3, ts.getTheLoai());
        pstmt.setString(4, ts.getTacGia());
        pstmt.setInt(5, ts.getNamXuatBan());
        pstmt.setString(6, ts.getNhaXuatBan());
        pstmt.setString(7, ts.getNgayNhap());
        pstmt.setInt(8, ts.getGiaTri());
        pstmt.setInt(9, ts.getTinhTrang());
        pstmt.setInt(10, ts.getSoLuongSach());

        
        return pstmt.executeUpdate()>0;
        }
    }       
    public static boolean update(ThongTinSach ts)throws Exception{
        String sql = "UPDATE dbo.THONGTINSACH"+
                " SET TenSach=?,TheLoai=?,TacGia=?,NamXuatBan=?,NhaXuatBan=?,NgayNhap=?,GiaTri=?,TinhTrang=?,SoLuongSach=?"+
                " WHERE MaSach=?";    
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        pstmt.setString(10, ts.getMaSach());
        pstmt.setString(1, ts.getTenSach());
        pstmt.setString(2, ts.getTheLoai());
        pstmt.setString(3, ts.getTacGia());
        pstmt.setInt(4, ts.getNamXuatBan());
        pstmt.setString(5, ts.getNhaXuatBan());
        pstmt.setString(6, ts.getNgayNhap());
        pstmt.setInt(7, ts.getGiaTri());
        pstmt.setInt(8, ts.getTinhTrang());
        pstmt.setInt(9, ts.getSoLuongSach());

        return pstmt.executeUpdate()>0;
        }
    }  

    public boolean deleteByMaSach(String MaSach)throws Exception{
        String sql = "delete from thongtinsach"+
                    " WHERE MaSach=?";    
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        pstmt.setString(1,MaSach);
        
        return pstmt.executeUpdate()>0;
        }
    }     

    private ThongTinSach createThongTinSach(final ResultSet rs) throws SQLException {
        ThongTinSach ts = new ThongTinSach();
        ts.setMaSach(rs.getString("masach"));
        ts.setTenSach(rs.getString("tensach"));
        ts.setTheLoai(rs.getString("theloai"));
        ts.setNamXuatBan(rs.getInt("namxuatban"));
        ts.setNhaXuatBan(rs.getString("nhaxuatban"));
        ts.setNgayNhap(rs.getString("ngaynhap"));
        ts.setTacGia(rs.getString("tacgia"));
        ts.setGiaTri(rs.getInt("giatri"));
        ts.setTinhTrang(rs.getInt("tinhtrang"));
        ts.setSoLuongSach(rs.getInt("soluongsach"));
        

        return ts;
    }    
    public ThongTinSach findByMaSach(String MaSach)throws Exception{
        String sql = "select* from thongtinsach where MaSach=?";    
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        pstmt.setString(1, MaSach);
        try(ResultSet rs = pstmt.executeQuery();){
            if(rs.next()){
                ThongTinSach ts = createThongTinSach(rs);
                return ts;
                }
            }
        return null;
        }
    }  
    public static void updatePhieuMuon(ThongTinSach ts){

        try {
        String sql = "UPDATE dbo.THONGTINSACH SET TenSach=?,TheLoai=?,TacGia=?,SoLuongSach=?,NamXuatBan=?,NhaXuatBan=?,NgayNhap=?,GiaTri=?,TinhTrang=? WHERE MaSach=?";              
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pst = con.prepareCall(sql);
            pst.setString(1, ts.getTenSach());
            pst.setString(2, ts.getTheLoai());
            pst.setString(3, ts.getTacGia());
            pst.setInt(4, ts.getSoLuongSach());            
            pst.setInt(5, ts.getNamXuatBan());
            pst.setString(6, ts.getNhaXuatBan());
            pst.setString(7, ts.getNgayNhap());
            pst.setInt(8, ts.getGiaTri());
            pst.setInt(9, ts.getTinhTrang());
            pst.setString(10, ts.getMaSach());
            
            pst.execute();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public List<ThongTinSach> findAll()throws Exception{
        String sql = "select* from thongtinsach ";    
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        try(ResultSet rs = pstmt.executeQuery();){
            List<ThongTinSach> list = new ArrayList<>();
            while(rs.next()){
                ThongTinSach ts = createThongTinSach(rs);
                list.add(ts);
                }
            return list;
            }
        }
    }      
    
}
