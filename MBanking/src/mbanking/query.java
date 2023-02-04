/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mbanking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author wahyu
 */
public class query extends abstrak{    
    
    Connection con;
    Statement stat;
    ResultSet rs;
    PreparedStatement psmt;
    String sql;
    
    public query(){
        try { 
            koneksi connection = new koneksi();
            con = connection.config();
        } catch (SQLException ex){
            System.out.println(ex);
        }
    }
    
    //Data User
    public ResultSet data(){
        try {
            sql = "SELECT * FROM `tbl_user`";
            stat = con.createStatement();
            rs = stat.executeQuery(sql);
        } catch (Exception e){
            System.out.println(e);
        }
        return rs;
    }
    
    public ResultSet cariData(){
        try {
            sql = "SELECT * FROM `tbl_user` WHERE no_rek LIKE'%" + cari + "%' OR nama LIKE'%" + cari + "%' OR username LIKE'%" + cari+"%'";
            stat = con.createStatement();
            rs = stat.executeQuery(sql);
        } catch (Exception e){
            System.out.println(e);
        }
        return rs;
    }
    
    public ResultSet ambilDataTransaksi(){
        try {
            sql = "SELECT * FROM tbl_transaksi WHERE no_rek='"+ getNoRek()+"'";
            stat = con.createStatement();
            rs = stat.executeQuery(sql);
        } catch (Exception e){
            System.out.println(e);
        }
        return rs;
    }
    
    public void simpanAkun(){
        sql = "INSERT INTO tbl_user VALUES ('"+noRek+"','"+nama+"','"+DoB+"','"+alamat+"','"+gender+"','"+user+"','"+pass+"','"+pin+"','"+sld+"','"+tp+"')";
        try {
            psmt = con.prepareStatement(sql);
            psmt.executeUpdate();
            psmt.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void deleteAkun(){
        sql = "DELETE FROM tbl_user WHERE no_rek = " + noRek;
        try {
            psmt = con.prepareStatement(sql);
            psmt.executeUpdate();
            psmt.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void updateAkun(){
        sql = "UPDATE `tbl_user` SET `nama`='"+nama+"',`DoB`='"+DoB+"',`alamat`='"+alamat+"',`gender`='"+gender+"',`username`='"+user+"',`password`='"+pass+"',`pin`='"+pin+"',`tipe_akun`='"+tp+"' WHERE no_rek = " + noRek;
        try {
            psmt = con.prepareStatement(sql);
            psmt.executeUpdate();
            psmt.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void Transaksi(){
        sql = "INSERT INTO tbl_transaksi VALUES (NULL,'" + noRek + "', '"+ tgl +"', '"+ waktu +"', '"+ jk +"', '"+debit+"', '"+ kredit +"', '"+ saldoT +"', '"+ket+"')";
        try {
            psmt = con.prepareStatement(sql);
            psmt.executeUpdate();
            psmt.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    //ambil Data User
    public ResultSet ambilData(){
        try {
            sql = "SELECT * FROM tbl_user WHERE no_rek='" + noRek + "'";
            stat = con.createStatement();
            rs = stat.executeQuery(sql);
        } catch (Exception e){
            System.out.println(e);
        }
        return rs;
    }
    
    public void ubahSaldo(){
        sql = "UPDATE `tbl_user` SET `saldo` = '"+ saldoT +"' WHERE `tbl_user`.`no_rek` = '"+ noRek+"'";
        try {
            psmt = con.prepareStatement(sql);
            psmt.executeUpdate();
            psmt.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void ubahSaldoPen(){
        sldPenn = sldPen + kredit;
        sql = "UPDATE `tbl_user` SET `saldo` = '"+ sldPenn + "' WHERE `tbl_user`.`no_rek` = '"+ rekPen +"'";
        try {
            psmt = con.prepareStatement(sql);
            psmt.executeUpdate();
            psmt.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public ResultSet rekPenerima(String rekPen){
        sql = "SELECT * FROM tbl_user WHERE no_rek='"+ rekPen +"'";
        try {
            stat = con.createStatement();
            rs = stat.executeQuery(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    
    public ResultSet login(){
        try {
            sql = "SELECT * FROM tbl_user WHERE no_rek='"+ getNoRek()+"'";
            stat = con.createStatement();
            rs = stat.executeQuery(sql);
        } catch (Exception e){
            System.out.println(e);
        }
        return rs;
    }
}
