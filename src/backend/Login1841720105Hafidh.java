/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author unix
 */
public class Login1841720105Hafidh {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public Login1841720105Hafidh login(String username, String password) throws SQLException{
        Login1841720105Hafidh obj = new Login1841720105Hafidh();
        Sqlconnection1841720105Hafidh sql = new Sqlconnection1841720105Hafidh();
        this.username = username; this.password = password;
        System.out.println(this.username+this.password);
        ResultSet rs = Sqlconnection1841720105Hafidh.selectQuery("select * from user where \"username\" = \""+this.username+"\" and  password = \""+this.username+"\";");
        
//        
//        while (rs.next()) {            
//            obj = new Login1841720105Hafidh();
//            obj.setUsername(rs.getString("username"));
//            obj.setPassword(rs.getString("password"));
//            
//        }
        String query = "select * from user where \"username\" = \""+this.username+"\" and  password = \""+this.username+"\";";
        System.out.println(query);
        PreparedStatement ps = sql.ps;
//        PreparedStatement ps = sql.con.prepareStatement(query);
//        ps.setString(1, username);
//        ps.setString(2, password);
//        System.out.println(query);
        
//        ResultSet set = ps.executeQuery();
//        if (set.next()) {
//            JOptionPane.showMessageDialog(null, "Berhasil login");
//        }else{
//            JOptionPane.showMessageDialog(null, "Koneksi Gagal");
//        }
        
        return obj;
    }
    
}
