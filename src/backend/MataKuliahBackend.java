/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import frontend.MataKuliah;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author unix
 */
public class MataKuliahBackend {
    private String Strukur;

    public String getStrukur() {
        return Strukur;
    }

    public void setStrukur(String Strukur) {
        this.Strukur = Strukur;
    }
//    mata kuliah button
    public void addMKbtn(String namaMK, String username) throws SQLException{
        
        Sqlconnection1841720105Hafidh sqlite = new Sqlconnection1841720105Hafidh();
        sqlite.connection();
        String sql ="INSERT INTO 'MataKuliah' ('namaMK', 'username') VALUES ('"+namaMK+"','"+username+"');";
        try {
            sqlite.connection().execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MataKuliahBackend.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void deleteMKbtn(String id) throws SQLException{

     Sqlconnection1841720105Hafidh sqlite = new Sqlconnection1841720105Hafidh();
     sqlite.connection();
//     String sql ="DELETE FROM 'MataKuliah' where 'idMK' ="+id+";";
     String sql = "DELETE FROM \"MataKuliah\" WHERE \"idMK\" = "+id;
        System.out.println(sql);
        sqlite.connection().execute(sql);
//        frontent.updateHashMap();
        
        
//     rsatu(sql);
    }
//    subab button
    public void addSubabMKbtn(String namaSubab, String namaMK, String username) throws SQLException{
        Sqlconnection1841720105Hafidh sqlite = new Sqlconnection1841720105Hafidh();
        sqlite.connection();
        String sql ="INSERT INTO 'Subab' ('namaSubab', 'namaMK', 'username') VALUES ('"+namaSubab+"', '"+namaMK+"', '"+username+"');";
        System.out.println(sql);
        try {
            sqlite.connection().execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MataKuliahBackend.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//        sqlite.connection().execute(sql);
        
    }
    
    public void deleteSubabMKbtn(String id) throws SQLException{

     Sqlconnection1841720105Hafidh sqlite = new Sqlconnection1841720105Hafidh();
     sqlite.connection();
//     String sql ="DELETE FROM 'MataKuliah' where 'idMK' ="+id+";";
     String sql = "DELETE FROM \"Subab\" WHERE \"idSubab\" = "+id;
        System.out.println(sql);
        sqlite.connection().execute(sql);
//        frontent.updateHashMap();
        
        
//     rsatu(sql);
    }
    
    public void addStrukturMKbtn(String namaSubab, String namaMK, String username, String namaStruktur) throws SQLException{
        Sqlconnection1841720105Hafidh sqlite = new Sqlconnection1841720105Hafidh();
        sqlite.connection();
        String sql ="INSERT INTO 'Struktur' ('namaStruktur', 'namaMK', 'username', 'namaSubab') VALUES ('"+namaSubab+"', '"+namaMK+"', '"+username+"', '"+namaStruktur+"');";
        System.out.println(sql);
        try {
            sqlite.connection().execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MataKuliahBackend.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//        sqlite.connection().execute(sql);
        
    }
    
    public void btnDeleteStrukturMK(String id) throws SQLException{

     Sqlconnection1841720105Hafidh sqlite = new Sqlconnection1841720105Hafidh();
     sqlite.connection();
//     String sql ="DELETE FROM 'MataKuliah' where 'idMK' ="+id+";";
     String sql = "DELETE FROM \"Struktur\" WHERE \"idStruktur\" = "+id;
        System.out.println(sql);
        sqlite.connection().execute(sql);
//        frontent.updateHashMap();
        
        
//     rsatu(sql);
    }
    
    
//    Struktur Button
 
        private ResultSet rsatu(String sql){
        ResultSet rs = Sqlconnection1841720105Hafidh.selectQuery(sql);
        return rs;    
        }
    
    
     public ArrayList<MataKuliahBackend> getAll()
    {
        ArrayList<MataKuliahBackend> ListStrukur = new ArrayList();
        Sqlconnection1841720105Hafidh sqlite = new Sqlconnection1841720105Hafidh();
        MataKuliah mk = new MataKuliah();
        String sql ="SELECT * FROM MataKuliah";
        ResultSet rs = Sqlconnection1841720105Hafidh.selectQuery(sql);

        try {
            while (rs.next()){
                MataKuliah kat = new MataKuliah();
//                kat.setStrukur(rs.getString("namaStruktur"));
//                ListStrukur.
//                ListStrukur.add(kat);
            }
        }
        catch (Exception e ){
            JOptionPane.showMessageDialog(null, e);
        }
        return ListStrukur;
    }
    
     
}
