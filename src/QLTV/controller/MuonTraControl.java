/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLTV.controller;

import QLTV.helpers.DatabaseHelper;
import QLTV.model.MuonTraSach;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;


/**
 *
 * @author ngohien
 */
public class MuonTraControl {
    public boolean insert(MuonTraSach mt)throws Exception{
        String sql = "INSERT INTO dbo.MUONTRASACH (NgayMuon,NgayTra,HoTenDG,MaSach,TenSach,SoNgayMuon,SoLuotMuon,SoNgayTraTre)"+
                " values(?,?,?,?,?,?,?,?)";    
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        pstmt.setString(1, mt.getNgayMuon());
        pstmt.setString(2,mt.getNgayTra());
        pstmt.setString(3, mt.getHoTenDG());
        pstmt.setString(4, mt.getMaSach());
        pstmt.setString(5, mt.getTenSach());
        pstmt.setInt(6, mt.getSoNgayMuon());
        pstmt.setInt(7, mt.getSoLuotMuon());
        pstmt.setInt(8, mt.getSoNgayTraTre());
       
        return pstmt.executeUpdate()>0;
        }
    }    

    public boolean update(MuonTraSach mt)throws Exception{
        String sql = "UPDATE dbo.MUONTRASACH" +
                " SET NgayTra=?,HoTenDG=?,MaSach=?,TenSach=?,SoNgayMuon=?,SoLuotMuon=?,SoNgayTraTre=?"+
                " WHERE NgayMuon = ?";    
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        pstmt.setString(1, mt.getNgayMuon());
        pstmt.setString(2,mt.getNgayTra());
        pstmt.setString(3, mt.getHoTenDG());
        pstmt.setString(4, mt.getMaSach());
        pstmt.setString(5, mt.getTenSach());
        pstmt.setInt(6, mt.getSoNgayMuon());
        pstmt.setInt(7, mt.getSoLuotMuon());
        pstmt.setInt(8, mt.getSoNgayTraTre());
       
        return pstmt.executeUpdate()>0;
        }
    } 

    public boolean delete(String NgayMuon)throws Exception{
        String sql = "delete from muontrasach" +
                " WHERE NgayMuon = ?";    
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        pstmt.setString(1, NgayMuon);
       
        return pstmt.executeUpdate()>0;
        }
    }   
    
    public MuonTraSach findByNgayMuon(String NgayMuon) throws Exception{
        String sql = "select * from muontrasach WHERE NgayMuon = ?";    
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        pstmt.setString(1, NgayMuon);
        try(ResultSet rs = pstmt.executeQuery();){
            if(rs.next()){
                MuonTraSach mt = createMuonTra(rs);
                return mt;
                }
            }
        return null;
        }       
    }
    
    public MuonTraSach findByHoTen(String HoTenDG) throws Exception{
        String sql = "select * from muontrasach WHERE HoTenDG = ?";    
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        pstmt.setString(1, HoTenDG);
        try(ResultSet rs = pstmt.executeQuery();){
            if(rs.next()){
                MuonTraSach mt = createMuonTra(rs);
                return mt;
                }
            }
        return null;
        }       
    }
    public List<MuonTraSach> findAll() throws Exception{
        String sql = "select * from muontrasach";    
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        try(ResultSet rs = pstmt.executeQuery();){
            List<MuonTraSach> list = new ArrayList<>();
            while(rs.next()){
                MuonTraSach mt = createMuonTra(rs);
                list.add(mt);
                }
            return list;
            }
        }       
    }
    
    private MuonTraSach createMuonTra(final ResultSet rs) throws SQLException {
        MuonTraSach mt = new MuonTraSach();
        mt.setHoTenDG(rs.getString("hotenDG"));
        mt.setMaSach(rs.getString("masach"));
        mt.setNgayMuon(rs.getString("ngaymuon"));
        mt.setNgayTra(rs.getString("ngaytra"));
        mt.setSoLuotMuon(rs.getInt("soluotmuon"));
        mt.setSoNgayMuon(rs.getInt("songaymuon"));
        mt.setSoNgayTraTre(rs.getInt("songaytratre"));
        mt.setTenSach(rs.getString("tensach"));

        return mt;
    }    
}
