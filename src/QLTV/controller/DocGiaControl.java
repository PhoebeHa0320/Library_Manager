/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLTV.controller;

import QLTV.helpers.DatabaseHelper;
import QLTV.model.DocGia;
import QLTV.model.NguoiDung;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;


/**
 *
 * @author ngohien
 */
public class DocGiaControl {
    public boolean delete(String HoTenDG)
        throws Exception{
        String sql = "delete from docgia" +
                " WHERE HoTenDG = ?";    
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        pstmt.setString(1, HoTenDG);
    
        return pstmt.executeUpdate()>0;
        }    
    }
    public DocGia findById(String HoTenDG)throws Exception{
        String sql = "select * from docgia where HoTenDG=?";    
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        pstmt.setString(1, HoTenDG);
        try(ResultSet rs = pstmt.executeQuery();){
            if(rs.next()){
                DocGia dg = createDocGia(rs);
                return dg;
                }
            }
        return null;
        }  
    }
    
    public List< DocGia> findAll()throws Exception{
        String sql = "select * from docgia ";    
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        try(ResultSet rs = pstmt.executeQuery();){
            List<DocGia> list = new ArrayList<>();
            while(rs.next()){
                DocGia dg = createDocGia(rs);
                list.add(dg);
                }
            return list;
            }
        }  
    }

    private DocGia createDocGia(final ResultSet rs) throws SQLException {
        DocGia dg = new DocGia();
        dg.setHoTenDG(rs.getString("hotenDG"));
        dg.setLoaiDG(rs.getString("loaiDG"));
        dg.setNgaySinh(rs.getString("ngaysinh"));
        dg.setEmail(rs.getString("email"));
        dg.setDiaChi(rs.getString("diachi"));
        dg.setNgayLapThe(rs.getString("ngaylapthe"));
        return dg;
    }
    
    public boolean update(DocGia dg)
        throws Exception{
        String sql = "UPDATE dbo.DOCGIA" +
                " SET LoaiDG = ?,NgaySinh = ?,DiaChi = ?,Email = ?,NgayLapThe = ?" +
                " WHERE HoTenDG = ?";    
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        pstmt.setString(6, dg.getHoTenDG());
        pstmt.setString(1,dg.getLoaiDG());
        pstmt.setString(2, dg.getNgaySinh());
        pstmt.setString(3, dg.getDiaChi());
        pstmt.setString(4, dg.getEmail());
        pstmt.setString(5, dg.getNgayLapThe());
        
        return pstmt.executeUpdate()>0;
        }
    }

    public boolean insert(DocGia dg)
        throws Exception{
        String sql = "INSERT INTO dbo.DOCGIA(HoTenDG,LoaiDG,NgaySinh,DiaChi,Email,NgayLapThe)"+
                " values(?,?,?,?,?,?)";    
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        pstmt.setString(1, dg.getHoTenDG());
        pstmt.setString(2,dg.getLoaiDG());
        pstmt.setString(3, dg.getNgaySinh());
        pstmt.setString(4, dg.getDiaChi());
        pstmt.setString(5, dg.getEmail());
        pstmt.setString(6, dg.getNgayLapThe());
        
        return pstmt.executeUpdate()>0;
        }
    }    
}
