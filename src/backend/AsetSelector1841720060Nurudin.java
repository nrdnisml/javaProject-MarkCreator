/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author personal
 */
import java.io.BufferedReader;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.io.FileReader;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class AsetSelector1841720060Nurudin extends FormatText1841720060Nurudin {
    private String imgPath,filesPath;
    private static String img, files;
    String sysPath = System.getProperty("user.home");

    public String getImgPath() {
        ResultSet rs2 = Sqlconnection1841720105Hafidh.selectQuery("Select * from path");
        try {
            while (rs2.next()) {
                String imgpath = rs2.getString("imgpath");
                this.imgPath = imgpath;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.imgPath;
    }
    
    public String getFilesPath() {
        ResultSet rs2 = Sqlconnection1841720105Hafidh.selectQuery("Select * from path");
        try {
            while (rs2.next()) {
                String files = rs2.getString("filepath");
                this.filesPath = files;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.filesPath;
    }

    
    public void setImgPathNurudin(JTextArea t) {//Mengambil path dari sebuah img
        JFileChooser file = new JFileChooser(FileSystemView.getFileSystemView());
        file.setDialogTitle("Select an image");
        file.setCurrentDirectory(new File(sysPath + "\\Pictures"));
        file.setAcceptAllFileFilterUsed(false);
        //filter tipe file yg bisa di pilih
        FileNameExtensionFilter filter = new FileNameExtensionFilter("images", "png", "gif", "jpg");
        file.addChoosableFileFilter(filter);

        int returnValue = file.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            img = file.getSelectedFile().getName();
            
        }
        t.insert(setImagePath(getImgPath()+img), t.getCaretPosition());
    }

    public void setDocumentPathNurudin(JTextArea t) {//Mengambil path dari sebuah img
        JFileChooser file = new JFileChooser(FileSystemView.getFileSystemView());
        file.setDialogTitle("Select a Markdown document");
        file.setCurrentDirectory(new File(sysPath + "\\Documents"));
        file.setAcceptAllFileFilterUsed(false);
        //filter tipe file yg bisa di pilih
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Markdown documents", "md", "txt");
        file.addChoosableFileFilter(filter);

        int returnValue = file.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            files = file.getSelectedFile().getName();
        }
        t.insert(setFilePath(getFilesPath()+files), t.getCaretPosition());
    }

    public void setTextHafid(JTextArea textArea) {//Membuka file md ke dalam jTextArea
        JFileChooser file = new JFileChooser(FileSystemView.getFileSystemView());
        file.setDialogTitle("Select a Markdown document");
        file.setCurrentDirectory(new File(sysPath + "\\Documents"));
        file.setAcceptAllFileFilterUsed(false);
        //filter tipe file yg bisa di pilih
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Markdown documents", "md", "txt");
        file.addChoosableFileFilter(filter);

        int returnValue = file.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            files = file.getSelectedFile().getPath().toString();
        }
        try {
            FileReader reader = new FileReader(files);
            BufferedReader br = new BufferedReader(reader);
            textArea.read(br, null);
            br.close();
            textArea.requestFocus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
