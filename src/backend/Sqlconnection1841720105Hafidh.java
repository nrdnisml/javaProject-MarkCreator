/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.sql.*;

/**
 *
 * @author unix
 */
public class Sqlconnection1841720105Hafidh {

    private static Connection con;

    public Connection getCon() {
        return con;
    }

    public static void dbConnectx() {//Memeriksa koneksi db
        if (con == null) {
            try {
                String url = "jdbc:sqlite:temp.sqlite";
                con = DriverManager.getConnection(url);
                System.out.println("Sukses");
            } catch (Exception e) {
                System.out.println("Koneksinya gagal bro" + e.getMessage());
            } 
        }
    }

    public static void dbConnect() {
        if (con==null) {
            try {
            String url = "jdbc:sqlite:temp.sqlite";
            con = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Koneksi error");
        }
        }
//         finally {
//            try {
//                if (con != null) {
//                    con.close();
//                }
//            } catch (SQLException ex) {
//                System.out.println(ex.getMessage());
//            }
//        }
    }

    public void dbUpdate(String sql) {
        dbConnect();
        try {
            Statement st = con.createStatement();
            st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            con.commit();
            con.close();
            System.out.println("Data berhasil diupdate");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int insertQueryGetId(String query) {
        dbConnect();
        int num = 0;
        int result = -1;
        try {
            Statement stmt = con.createStatement();
            num = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                result = rs.getInt(1);
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            result = -1;
        }
        return result;
    }

    public static boolean executeQuery(String query) {
        dbConnect();
        boolean result = false;
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate(query);
            result = true;
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static ResultSet selectQuery(String query) {
        dbConnect();
        ResultSet rs = null;
        try {
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public static void setKoneksi(Connection koneksi) {
        Sqlconnection1841720105Hafidh.con = koneksi;
    }
    public static void main(String[] args) {
        dbConnect();
    }
}
