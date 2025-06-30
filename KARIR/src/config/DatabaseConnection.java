/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;
import java.sql.*;
/**
 *
 * @author adityanugraha
 */
public class DatabaseConnection {
    public static Connection connect() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sempol", "root", "");
            System.out.println("Koneksi Berhasil");
        } catch (Exception e) {
            System.out.println("Koneksi Gagal: " + e.getMessage());
        }
        return conn;
    }
}
