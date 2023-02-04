/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mbanking;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author wahyu
 */
public class koneksi {
    Connection con;
    Statement stm;
    
    public Connection config() throws SQLException{
        if (con == null){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Class Driver Ditemukan");
                
                try{
                    con = DriverManager.getConnection("jdbc:mysql://localhost/banking", "root", "");
                    System.out.println("Koneksi Database Sukses");
                }
                
                catch (SQLException se){
                    System.out.println("Koneksi Database Gagal : " + se);
                    System.exit(0);
                }
            
            } catch (ClassNotFoundException cnfe){
                System.out.println("Class Driver Database Tidak Ditemukan, Terjadi Kesalahan Pada : " + cnfe);
                System.exit(0);
            }
        }
        return con;
    }
}
