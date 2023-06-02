/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLTV.controller;

import QLTV.helpers.DatabaseHelper;
import QLTV.model.NguoiDung;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ngohien
 */
public class NguoiDungControl {
    public NguoiDung checkLogin (String tenDangNhap, String matKhau)
            throws Exception{
        String sql = "select tenDangNhap, matKhau, vaiTro from nguoidung "
                + " where tendangnhap=? and matkhau=?";
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            
        ){
        pstmt.setString(1, tenDangNhap);
        pstmt.setString(2, matKhau);        
        
        try(ResultSet rs = pstmt.executeQuery();){
            if(rs.next()){
                NguoiDung nd = new NguoiDung();
                nd.setTenDangNhap(tenDangNhap);
                nd.setVaiTro(rs.getString("vaitro"));
                return nd;
                }
            }      
        }
        return null;
    }
    
}
