/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLTV.controller;

import QLTV.helpers.DatabaseHelper;
import QLTV.model.ViPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 *
 * @author ngohien
 */
public class ViPhamControl {
    public boolean insert(ViPham vp)throws Exception{
        String sql = "INSERT INTO [dbo].[VIPHAM]([HoTenDG],[TienPhatKyNay],[TienNoKyNay],[TongNo],[SoTienThu],[TienConLai])"+
                " values(?,?,?,?,?,?)";    
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        
        pstmt.setString(1,vp.getHoTenDG());
        pstmt.setInt(2, vp.getTienPhatKyNay());
        pstmt.setInt(3, vp.getTienNoKyNay());
        pstmt.setInt(4, vp.getTongNo());
        pstmt.setInt(5, vp.getSoTienThu());
        pstmt.setInt(6, vp.getTienConLai());

        return pstmt.executeUpdate()>0;
        }
    } 

    public boolean update(ViPham vp)throws Exception{
        String sql = "UPDATE [dbo].[VIPHAM]" +
                " SET[SoTienThu]=?,[TienPhatKyNay]=?,[TienNoKyNay]=?,[TongNo]=?,[TienConLai]=?" +
                " WHERE [HoTenDG]=?";    
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        pstmt.setInt(1, vp.getSoTienThu());
        pstmt.setString(6, vp.getHoTenDG());
        pstmt.setInt(2, vp.getTienPhatKyNay());
        pstmt.setInt(3, vp.getTienNoKyNay());
        pstmt.setInt(4, vp.getTongNo());
        pstmt.setInt(5, vp.getTienConLai());

        return pstmt.executeUpdate()>0;
        }
    } 
    
    public boolean delete(String HoTenDG)throws Exception{
        String sql = "delete from vipham" +
                " WHERE HoTenDG = ?";    
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        pstmt.setString(1, HoTenDG);
       
        return pstmt.executeUpdate()>0;
        }
    }
    public ViPham findByHoTenDG(String HoTenDG) throws Exception{
        String sql = "select * from vipham WHERE HoTenDG = ?";    
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        pstmt.setString(1, HoTenDG);
        try(ResultSet rs = pstmt.executeQuery();){
            if(rs.next()){
                ViPham vp = createViPham(rs);
                return vp;
                }
            }
        return null;
        }       
    } 
    
    public List<ViPham> findAll() throws Exception{
        String sql = "select * from vipham ";    
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        try(ResultSet rs = pstmt.executeQuery();){
            List<ViPham> list = new ArrayList<>();
            while(rs.next()){
                ViPham vp = createViPham(rs);
                list.add(vp);
                }
            return list;
            }
        }       
    }    
    
    private ViPham createViPham(final ResultSet rs) throws SQLException {
        ViPham vp = new ViPham();
        vp.setHoTenDG(rs.getString("hotenDG"));
        vp.setSoTienThu(rs.getInt("sotienthu"));
        vp.setTienConLai(rs.getInt("tienconlai"));
        vp.setTienNoKyNay(rs.getInt("tiennokynay"));
        vp.setTienPhatKyNay(rs.getInt("tienphatkynay"));
        vp.setTongNo(rs.getInt("tongno"));

        return vp;
    }    
}
