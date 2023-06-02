/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLTV.helpers;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author ngohien
 */
public class DatabaseHelper {
    public static Connection openConnection() throws Exception{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://localhost:1433;database=QuanLyThuVien";
        String username = "sa";
        String pasaword = "123123";
        Connection con = DriverManager.getConnection(connectionUrl, username, pasaword);
        return con;
    }
    
}
