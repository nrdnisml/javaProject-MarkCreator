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
import java.io.*;
import java.util.HashMap;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

@SuppressWarnings("serial")
public class SaveToMarkdown1841720060Nurudin extends JFrame implements IGenerateMarkdown {

    HashMap<String, String> data = new HashMap<>();

    //final JFileChooser fc = new JFileChooser();
    private void setFileDirectoryNurudin() { //memilih direktori penyimpanan file dan set deskripsi file "Markdown File"
        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("Markdown File", "md");
        fc.setApproveButtonText("Save");
        fc.setFileFilter(extensionFilter);
        int actionDialog = fc.showOpenDialog(this);
        if (actionDialog != JFileChooser.APPROVE_OPTION) {
            return;
        }
    }

    private File setFileEkstensiNurudin() { //Mengatur agar file yang disimpan hanya dapat berformat .md
        File file = fc.getSelectedFile();
        if (!file.getName().endsWith(".md")) {
            return file = new File(file.getAbsolutePath() + ".md");
        }
        return file;
    }

    @Override
    public void saveAsMarkdown(JTextArea textArea) {
        setFileDirectoryNurudin();
        BufferedWriter outFile = null;
        try {
            outFile = new BufferedWriter(new FileWriter(setFileEkstensiNurudin()));
            textArea.write(outFile);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (outFile != null) {
                try {
                    outFile.close();
                } catch (IOException e) {
                }
            }
        }
    }
}
