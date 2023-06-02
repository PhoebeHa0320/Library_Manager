/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLTV.controller;

import QLTV.helpers.DatabaseHelper;
import QLTV.model.BaoCao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ngohien
 */
public class BaoCaoCTr {
    
    private BaoCao createTheLoai(final ResultSet rs) throws SQLException {
        BaoCao bc = new BaoCao();
        bc.setNgay(rs.getString("ngay"));
        bc.setTheLoai(rs.getString("theloai"));
        bc.setSoLuotMuon(rs.getInt("soluotmuon"));
        return bc;
    } 
    
    private BaoCao createTenSach(final ResultSet rs) throws SQLException {
        BaoCao bc = new BaoCao();
        bc.setThang(rs.getString("thang"));
        bc.setTenSach(rs.getString("tensach"));
        bc.setNgayMuon(rs.getString("ngaymuon"));
        bc.setSoNgayTraTre(rs.getInt("songaytratre"));
        return bc;
    } 
    
    public BaoCao findByNgay(String TheLoai)throws Exception{
        String sql = "SELECT THONGTINSACH.TheLoai, MUONTRASACH.SoLuotMuon, THONGTINSACH.TenSach, MUONTRASACH.NgayMuon, MUONTRASACH.SoNgayTraTre" +
                        "  FROM MUONTRASACH" +
                        "  INNER JOIN THONGTINSACH ON MUONTRASACH.TenSach= THONGTINSACH.TenSach WHERE TheLoai=?";    
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        pstmt.setString(1, TheLoai);
        try(ResultSet rs = pstmt.executeQuery();){
            if(rs.next()){
                BaoCao bc = createTheLoai(rs);
                return bc;
                }
            }
        return null;
        }  
    }

    public BaoCao findByThang(String TenSach)throws Exception{
        String sql = "SELECT THONGTINSACH.TheLoai, MUONTRASACH.SoLuotMuon, THONGTINSACH.TenSach, MUONTRASACH.NgayMuon, MUONTRASACH.SoNgayTraTre" +
                        "  FROM MUONTRASACH" +
                        "  INNER JOIN THONGTINSACH ON MUONTRASACH.TenSach= THONGTINSACH.TenSach WHERE THONGTINSACH.TenSach=?";    
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        pstmt.setString(1, TenSach);
        try(ResultSet rs = pstmt.executeQuery();){
            if(rs.next()){
                BaoCao bc1 = createTenSach(rs);
                return bc1;
                }
            }
        return null;
        }  
    }    
 
     public List< BaoCao> findNgay()throws Exception{
        String sql = "SELECT THONGTINSACH.TheLoai, MUONTRASACH.SoLuotMuon, THONGTINSACH.TenSach, MUONTRASACH.NgayMuon, MUONTRASACH.SoNgayTraTre" +
                        "  FROM MUONTRASACH" +
                        "  INNER JOIN THONGTINSACH ON MUONTRASACH.TenSach= THONGTINSACH.TenSach";   
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        try(ResultSet rs = pstmt.executeQuery();){
            List<BaoCao> list = new ArrayList<>();
            while(rs.next()){
                BaoCao bc = createTheLoai(rs);
                list.add(bc);
                }
            return list;
            }
        }  
    } 

     public List< BaoCao> findThang()throws Exception{
        String sql = "SELECT THONGTINSACH.TheLoai, MUONTRASACH.SoLuotMuon, THONGTINSACH.TenSach, MUONTRASACH.NgayMuon, MUONTRASACH.SoNgayTraTre" +
                        "  FROM MUONTRASACH" +
                        "  INNER JOIN THONGTINSACH ON MUONTRASACH.TenSach= THONGTINSACH.TenSach";   
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        try(ResultSet rs = pstmt.executeQuery();){
            List<BaoCao> list = new ArrayList<>();
            while(rs.next()){
                BaoCao bc1 = createTenSach(rs);
                list.add(bc1);
                }
            return list;
            }
        }  
    }     
}
