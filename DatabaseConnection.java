/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author YOGI
 */
public class DatabaseConnection {
    private static Connection koneksi;

    public static Connection getConnection() throws SQLException {
        if (koneksi == null || koneksi.isClosed()) {
            String url = "jdbc:mysql://localhost:3306/hafasuyonam"; // sesuaikan nama database
            String user = "root"; // ganti kalau usermu bukan root
            String password = ""; // ganti kalau kamu pakai password di MySQL

            try {
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi ke database berhasil.");
            } catch (SQLException e) {
                System.err.println("Koneksi gagal: " + e.getMessage());
                throw e;
            }
        }
        return koneksi;
    }

    static Connection getKoneksi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static Connection connect() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
