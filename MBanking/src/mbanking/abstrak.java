/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mbanking;

/**
 *
 * @author wahyu
 */
public class abstrak {
    static String noRek;
    String user,pass,nama,DoB,alamat,gender,pin, cari,tp, norekk;
    String tgl, waktu, jk, ket, sld, namaPen, rekPen;
    int saldoT, saldo, debit, kredit,sldPen,sldPenn;
    
    //Username
    public void setUsername(String user){
        this.user = user;
    } 
    
    public String getUsername(){
        return user;
    }
    
    //Password
    public void setPassword(String pass){
        this.pass = pass;
    } 
    
    public String getPassword(){
        return pass;
    }
    
    //Nomor Rekening
    public void setNoRek(String noRek){
        this.noRek = noRek;
    } 
    
    public String getNoRek(){
        return noRek;
    }
    
    //Nomor Rekening
    public void setNama(String nama){
        this.nama = nama;
    } 
    
    public String getNama(){
        return nama;
    }
    
    public void setDoB(String DoB){
        this.DoB = DoB;
    } 
    
    public String getDoB(){
        return DoB;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    } 
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setGender(String gender){
        if (gender.equals("Laki - Laki")){
            this.gender = "L";
        } else if (gender.equals("Perempuan")){
            this.gender = "P";
        }
    } 
    
    public String getGender(){
        return gender;
    }
    
    public void setPIN(String pin){
        this.pin = pin;
    } 
    
    public String getPIN(){
        return pin;
    }
    
    public void setTP(String tp){
        if (tp.equals("Admin")){
            this.tp = "1";
        } else if (tp.equals("Nasabah")){
            this.tp = "0";
        }
    } 
    
    public String getTP(){
        return tp;
    }
    
    public void setTgl(String tgl){
        this.tgl = tgl;
    } 
    
    public String getTgl(){
        return tgl;
    }
    
    public void setWaktu(String waktu){
        this.waktu = waktu;
    } 
    
    public String getWaktu(){
        return waktu;
    }
    
    public void setJk(String jk){
        this.jk = jk;
    } 
    
    public String getJk(){
        return jk;
    }
    
    public void setDebit(String debit){
        this.debit = Integer.parseInt(debit);
    } 
    
    public String getDebit(){
        return Integer.toString(debit);
    }
    
    public void setKredit(String kredit){
        this.kredit = Integer.parseInt(kredit);
    } 
    
    public String getKredit(){
        return Integer.toString(kredit);
    }
    
    public void setSaldoT(String sld){
        this.sld = sld;
    }
    
    public String getSaldoT(){
        return sld;
    }
    
    public int getSaldoTarik(String saldo){
        return saldoT = Integer.parseInt(saldo) - kredit;
    }
    
    public int getSaldoSetor(int saldo){
        return saldoT = saldo + debit ;
    }
    
    public void setKet(String ket){
        this.ket = ket;
    } 
    
    public String getKet(){
        return ket;
    }
    
    public void setSaldoPenerima(int sldPen){
        this.sldPen = sldPen;
    }
    
    public int getSaldoPenerima (){
        return sldPen;
    }
    
    public void setNamaPenerima(String namaPen){
        this.namaPen = namaPen;
    }
    
    public String getNamaPenerima(){
        return namaPen;
    }
    
    public void setRelPenerima(String rekPen){
        this.rekPen = rekPen;
    }
    
    public String getRelPenerima(){
        return rekPen;
    }
    
    public void setCari (String cari){
        this.cari = cari;
    }
    
    public String tipeAkun(String tipe){
        String akun = null;
        if (tipe.equals("1")){
            akun =  "Admin";
        } else if (tipe.equals("0")){
            akun =  "Nasabah";
        }
        return akun;
    }
    
    public String gender(String sex){
        String jk = null;
        if (sex.equals("L")){
            jk =  "Laki-Laki";
        } else if (sex.equals("P")){
            jk =  "Perempuan";
        }
        return jk;
    }
}
