/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

/**
 *
 * @author personal
 */
public class FormatText1841720060Nurudin {
    public String text;
    public static String setHeading(String h, JTextArea t) {
        switch (h) {
            case "h1":
                h = "# ";
                break;
            case "h2":
                h = "## ";
                break;
            case "h3":
                h = "### ";
                break;
            case "h4":
                h = "#### ";
                break;
            case "h5":
                h = "##### ";
                break;
            case "h6":
                h = "###### ";
                break;
        }
        return h;
    }

    public static String setNewLine(JTextArea txt) {
        String n = "\n";
        return n;
    }

    public void setOrderedList(JTextArea txt, JTextField fld) {
        int i = Integer.parseInt(fld.getText());
        for (int j = 1; j <= i; j++) {
            txt.insert(j + ". \n",txt.getCaretPosition());
        }
    }

    public void setUnorderesList(JTextArea txt, JTextField fld) {
        int i = Integer.parseInt(fld.getText());
        for (int j = 1; j <= i; j++) {
            txt.insert("- \n",txt.getCaretPosition());
        }
    }

    public void setBold(JTextComponent b) {
        b.replaceSelection("**" + b.getSelectedText() + "**");
    }

    public void setItalic(JTextComponent b) {
        b.replaceSelection("*" + b.getSelectedText() + "*");
    }

    public void setBoldItalic(JTextComponent b) {
        b.replaceSelection("***" + b.getSelectedText() + "***");
    }
    

    public void setBlockquotes(JTextArea t) {
        t.insert("\n> ",t.getCaretPosition());
    }

    public String setImagePath(String dir) {
        return "![judul gambar](" + dir + ")\n\n";
    }

    public String setFilePath(String link) {
        return "[Keterangan](" + link + ")\n";
    }

    public void setCodeBlock(JTextArea c) {
        c.insert("```java\n //tulisKodeProgram\n\n```\n\n", c.getCaretPosition());
    }

    public void setHR(JTextArea t) {
        t.insert("\n---\n",t.getCaretPosition());
    }

    public void setOnlyNumbersNurudin(JTextField tf, JFrame frame) {
        tf.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = tf.getText();
                int l = value.length();
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
                    tf.setEditable(true);
                } else {
                    tf.setEditable(false);
                    tf.setText("0");
                }
            }
        });
    }
    
    public void setJtextAreaInputanNurudin(JTextArea jt){
        jt.append(setNewLine(jt));
        if (jt.getName().equalsIgnoreCase("judul")) {//text judul
            jt.insert(setHeading("h1", jt)+jt.getName().trim()+" : ", 0);
        }else if (jt.getName().equalsIgnoreCase("Materi")||jt.getName().equalsIgnoreCase("kompetensi")||jt.getName().equalsIgnoreCase("rangkuman")||jt.getName().equalsIgnoreCase("pernyataan")   ) {
            if (jt.getName().equalsIgnoreCase("Kompetensi")) {
                jt.insert(setHeading("h2", jt)+" Standar Kompetensi\n\n", 0);
            }else if (jt.getName().equalsIgnoreCase("materi")) {
                jt.insert(setHeading("h2", jt)+"Ringkasan Materi\n\n", 0);
            }else if (jt.getName().equalsIgnoreCase("pernyataan")) {
                jt.insert(setHeading("h2", jt)+" Pernyataan Diri\n\n", 0);
            }else{
                jt.insert(setHeading("h2", jt)+jt.getName()+"\n\n", 0);
            }
            jt.append(setNewLine(jt));
        }else if (jt.getName().equalsIgnoreCase("percobaan1")) {//text percobaan
            jt.insert(setHeading("h2", jt)+" Percobaan\n"+setHeading("h3", jt)+jt.getName()+"\n\n", 0);
            jt.append(setNewLine(jt));
        }else if (jt.getName().equalsIgnoreCase("Percobaan2")||jt.getName().equalsIgnoreCase("percobaan3")||jt.getName().equalsIgnoreCase("percobaan4")||jt.getName().equalsIgnoreCase("percobaan5")||jt.getName().equalsIgnoreCase("percobaan6")||jt.getName().equalsIgnoreCase("percobaan7")||jt.getName().equalsIgnoreCase("percobaan8")) {//percobaan 2 dst
            jt.insert(setHeading("h3", jt)+jt.getName()+"\n\n", 0);
        }else if (jt.getName().equalsIgnoreCase("Tugas")) {//text tugas
            jt.insert(setHeading("h2", jt)+jt.getName()+" \n"+setHeading("h3", jt)+"Soal\n\n", 0);
            jt.append(setNewLine(jt));
        }else if (jt.getName().equalsIgnoreCase("Jawab")) {//text jwab tugas
            jt.insert(setHeading("h3", jt)+jt.getName()+"\n", 0);
        }else if (jt.getName().equalsIgnoreCase("nama")) {//text nama pernyataan diri
            String x = jt.getText().trim();
            jt.setText("");
            jt.insert("***("+x+")***", 0);
        }else if (jt.getName().equalsIgnoreCase("Pertanyaan :")){
             jt.insert(setHeading("h2", jt)+jt.getName()+"\n\n", 0);
        }else {//other
            jt.insert(setHeading("h4", jt)+jt.getName()+"\n\n", 0);
        }
    }
}
