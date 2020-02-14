/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextField;

/**
 *
 * @author personal
 */
public class GetDataFromDB1841720060Nurudin {

    private int idStruktur;
    private String judul;
    private String kompetensi;
    private String materi;
    private String percobaan;
    private String tugas;
    private String rangkuman;
    private String pernyataan,imgpath,filepath;

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public GetDataFromDB1841720060Nurudin(int idStruktur, String judul, String kompetensi, String materi, String percobaan, String tugas, String rangkuman, String pernyataan) {
        this.idStruktur = idStruktur;
        this.judul = judul;
        this.kompetensi = kompetensi;
        this.materi = materi;
        this.percobaan = percobaan;
        this.tugas = tugas;
        this.rangkuman = rangkuman;
        this.pernyataan = pernyataan;
    }

    public GetDataFromDB1841720060Nurudin() {
    }

    public int getIdStruktur() {
        return idStruktur;
    }

    public void setIdStruktur(int idStruktur) {
        this.idStruktur = idStruktur;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getKompetensi() {
        return kompetensi;
    }

    public void setKompetensi(String kompetensi) {
        this.kompetensi = kompetensi;
    }

    public String getMateri() {
        return materi;
    }

    public void setMateri(String materi) {
        this.materi = materi;
    }

    public String getPercobaan() {
        return percobaan;
    }

    public void setPercobaan(String percobaan) {
        this.percobaan = percobaan;
    }

    public String getTugas() {
        return tugas;
    }

    public void setTugas(String tugas) {
        this.tugas = tugas;
    }

    public String getRangkuman() {
        return rangkuman;
    }

    public void setRangkuman(String rangkuman) {
        this.rangkuman = rangkuman;
    }

    public String getPernyataan() {
        return pernyataan;
    }

    public void setPernyataan(String pernyataan) {
        this.pernyataan = pernyataan;
    }

    public GetDataFromDB1841720060Nurudin getByIdNurudin(int id) {
        ArrayList<GetDataFromDB1841720060Nurudin> list = new ArrayList();
        GetDataFromDB1841720060Nurudin dt = new GetDataFromDB1841720060Nurudin();
        ResultSet rs2 = Sqlconnection1841720105Hafidh.selectQuery("Select * from struktur " + " where idStruktur = " + id + "");
        try {
            while (rs2.next()) {
                dt = new GetDataFromDB1841720060Nurudin();
                dt.setIdStruktur(rs2.getInt("idStruktur"));
                dt.setJudul(rs2.getString("judul"));
                dt.setKompetensi(rs2.getString("kompetensi"));
                dt.setMateri(rs2.getString("materi"));
                dt.setPercobaan(rs2.getString("percobaan"));
                dt.setTugas(rs2.getString("tugas"));
                dt.setRangkuman(rs2.getString("rangkuman"));
                dt.setPernyataan(rs2.getString("pernyataan"));
                list.add(dt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dt;
    }

    public ArrayList<GetDataFromDB1841720060Nurudin> getAllNurudin() {
        ArrayList<GetDataFromDB1841720060Nurudin> List = new ArrayList();
        ResultSet rs2 = Sqlconnection1841720105Hafidh.selectQuery("Select * from struktur");

        try {
            while (rs2.next()) {
                GetDataFromDB1841720060Nurudin dt = new GetDataFromDB1841720060Nurudin();
                dt.setIdStruktur(rs2.getInt("idStruktur"));
                dt.setJudul(rs2.getString("judul"));
                dt.setKompetensi(rs2.getString("kompetensi"));
                dt.setMateri(rs2.getString("materi"));
                dt.setPercobaan(rs2.getString("percobaan"));
                dt.setTugas(rs2.getString("tugas"));
                dt.setRangkuman(rs2.getString("rangkuman"));
                dt.setPernyataan(rs2.getString("pernyataan"));

                List.add(dt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return List;
    }

    public ArrayList<GetDataFromDB1841720060Nurudin> getJudulNurudin() {
        ArrayList<GetDataFromDB1841720060Nurudin> List = new ArrayList();
        ResultSet rs2 = Sqlconnection1841720105Hafidh.selectQuery("Select judul from struktur");

        try {
            while (rs2.next()) {
                GetDataFromDB1841720060Nurudin dt = new GetDataFromDB1841720060Nurudin();
                dt.setJudul(rs2.getString("judul"));
                System.out.println(getJudul());
                List.add(dt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return List;
    }

    public static void tampilkanPath(JTextField img, JTextField file) {
        ResultSet rs2 = Sqlconnection1841720105Hafidh.selectQuery("Select * from path");
        try {
            while (rs2.next()) {
                String imgpath = rs2.getString("imgpath");
                String filepath = rs2.getString("filepath");
                img.setText(imgpath);
                file.setText(filepath);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
   
    

    public void saveNurudin() {
        if (getByIdNurudin(idStruktur).getIdStruktur() == 0) {
            String SQL = "INSERT INTO struktur (judul,kompetensi,materi,percobaan,tugas,rangkuman,pernyataan) VALUES"
                    + " '" + this.judul + "', "
                    + " '" + this.kompetensi + "', "
                    + " '" + this.materi + "', "
                    + " '" + this.percobaan + "', "
                    + " '" + this.tugas + "', "
                    + " '" + this.rangkuman + "', "
                    + " '" + this.pernyataan + "' "
                    + " )";
            this.idStruktur = Sqlconnection1841720105Hafidh.insertQueryGetId(SQL);
            System.out.println("Data di insert Baru");
        } else {
            String SQL = "Update struktur set judul ="
                    + " '" + getJudul() + "', kompetensi ="
                    + " '" + getKompetensi() + "', materi ="
                    + " '" + getMateri() + "', percobaan ="
                    + " '" + getPercobaan() + "', tugas ="
                    + " '" + getTugas() + "', rangkuman ="
                    + " '" + getRangkuman() + "', pernyataan ="
                    + " '" + getPernyataan() + "' "
                    + " WHERE idStruktur = " + this.idStruktur + ";";
            Sqlconnection1841720105Hafidh.executeQuery(SQL);
            System.out.println("Data di update");

        }
    }
    
    public void savePathNurudin() {
            String SQL = "Update path set imgpath ="
                    + " '" + getImgpath()+ "', filepath = "
                    + " '" + getFilepath()+ "' "
                    + " WHERE id = " + 1 + ";";
            Sqlconnection1841720105Hafidh.executeQuery(SQL);
            System.out.println("Data di update");
    }

    public ArrayList<GetDataFromDB1841720060Nurudin> searchNurudin(String id) {
        ArrayList<GetDataFromDB1841720060Nurudin> ListAnggota = new ArrayList();

        String sql = "SELECT * FROM struktur where " + " idStruktur = '" + id + "' ";

        ResultSet rs2 = Sqlconnection1841720105Hafidh.selectQuery(sql);

        try {
            while (rs2.next()) {
                GetDataFromDB1841720060Nurudin ang = new GetDataFromDB1841720060Nurudin();
                ang.setIdStruktur(rs2.getInt("idStruktur"));
                ang.setJudul(rs2.getString("judul"));
                ang.setKompetensi(rs2.getString("kompetensi"));
                ang.setMateri(rs2.getString("materi"));
                ang.setPercobaan(rs2.getString("percobaan"));
                ang.setTugas(rs2.getString("tugas"));
                ang.setRangkuman(rs2.getString("rangkuman"));
                ang.setPernyataan(rs2.getString("pernyataan"));
                ListAnggota.add(ang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListAnggota;
    }
    
    public void deleteNurudin() {
        String SQL = "DELETE FROM struktur WHERE idStruktur = '" + this.idStruktur + "'";
        Sqlconnection1841720105Hafidh.executeQuery(SQL);
        System.out.println("Data dihapus");
    }

    public static void main(String[] args) {
        GetDataFromDB1841720060Nurudin data = new GetDataFromDB1841720060Nurudin();
        
    }
}
