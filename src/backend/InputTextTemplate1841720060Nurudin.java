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
import frontend.CustomTemplateNurudin;
import java.util.HashMap;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class InputTextTemplate1841720060Nurudin extends InputDataToDB1841720060Nurudin{

    int idStruktur;
    Sqlconnection1841720105Hafidh sql = new Sqlconnection1841720105Hafidh();
    FormatText1841720060Nurudin menu = new FormatText1841720060Nurudin();
    HashMap<String, String> data = new HashMap<>();
    ArrayList<JTextArea> list = new ArrayList<>();

    public void saveNurudin() {
        String query = "INSERT INTO struktur (judul,kompetensi,materi,percobaan,tugas,rangkuman,pernyataan) VALUES "
                + "('"
                + data.get("Judul") + "','"
                + data.get("Kompetensi") + "','"
                + data.get("Materi") + "','"
                + data.get("Percobaan") + "','"
                + data.get("Tugas") + "','"
                + data.get("Rangkuman") + "','"
                + data.get("Pernyataan") + "'"
                + ")";
        sql.dbUpdate(query);
    }

    public String gabungInputanPercobaan(){
        return data.put("Percobaan",data.get("Percobaan1")+data.get("Percobaan2")+data.get("Percobaan3")+data.get("Percobaan4")+data.get("Percobaan5")+data.get("Percobaan6")+data.get("Percobaan7")+data.get("Percobaan8")+data.get("Pertanyaan :"));
    }

    @Override
    public String ambilInputForm(JTextArea jt) {
        return data.put(jt.getName(), jt.getText()); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String ambilInputForm(JTextComponent jt, JTextComponent val){
        return data.put(jt.getName(), jt.getText() + val.getText());
    }
    
    public String ambilInputForm(JTextArea per,JTextArea step,JTextArea pert,JTextArea jwb){
        return data.put(per.getName(), per.getText()+step.getText()+pert.getText()+jwb.getText());
    }
}
