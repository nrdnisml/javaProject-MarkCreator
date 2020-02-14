/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import java.sql.*;
import backend.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asus
 */
public class MataKuliah extends javax.swing.JFrame {

    String matakuliah;
    String subabName;
    String struktur;
    int id;
    int idSubab;
    int idStruktur;
    int indexJCbox;
    String username;
    String hasil;

    MataKuliah(String text) {
        initComponents();
        this.username = text;
        this.setLocationRelativeTo(null);
        jCbox.addItem("");
        model.addElement("");
        sqlite.connection();
        
        this.updateHashMapMK();
        this.updateStruktur();
    }

    MataKuliah(int id, String matakuliah, int idSubab, String subab, int indexJCbox, int idStrukur, String struktur, String username) {
        this.id = id;this.matakuliah = matakuliah;this.idSubab = idSubab;this.subabName = subab;this.indexJCbox = indexJCbox;this.idStruktur = idStrukur;this.struktur = struktur;this.username = username;
        initComponents();
        this.setLocationRelativeTo(null);
        jCbox.addItem("");
        model.addElement("");
        sqlite.connection();
        
        this.updateHashMapMK();
        this.updateStruktur();
        
        System.out.println(id);
        System.out.println(matakuliah);
        System.out.println(subabName);
        System.out.println(struktur);
        System.out.println(username);
        JFidMK.setText(Integer.toString(id));
        JFMKname.setText(matakuliah);
        jCbox.setSelectedIndex(indexJCbox);
        JFidSubab.setText(Integer.toString(idSubab));
        JFSubabName.setText(subab);
        JFidStrukturId.setText(Integer.toString(idStrukur));
        JFStrukturName.setText(struktur);
        
    }

    
    public void setInput(int id, String matakuliah, int idSubab, String subab, int indexJCbox, int idStrukur, String struktur, String username){
        this.id = id;this.matakuliah = matakuliah;this.idSubab = idSubab;this.subabName = subab;this.indexJCbox = indexJCbox;this.idStruktur = idStrukur;this.struktur = struktur;this.username = username;
        
        System.out.println(id);
        System.out.println(matakuliah);
        System.out.println(subabName);
        System.out.println(struktur);
        System.out.println(username);
        JFidMK.setText(Integer.toString(id));
        JFMKname.setText(matakuliah);
        jCbox.setSelectedIndex(indexJCbox);
        JFidSubab.setText(Integer.toString(idSubab));
        JFSubabName.setText(subab);
        JFidStrukturId.setText(Integer.toString(idStrukur));
        JFStrukturName.setText(struktur);
        
        
        
    }
    /**
     * Creates new form MataKuliah
     */
    Sqlconnection1841720105Hafidh sqlite = new Sqlconnection1841720105Hafidh();
    HashMap<Integer, String> MK = new HashMap<Integer, String>();
    public MataKuliah() {
        initComponents();
        this.setLocationRelativeTo(null);
        jCbox.addItem("");
        model.addElement("");
        sqlite.connection();
        
        this.updateHashMapMK();
        this.updateStruktur();
//        try {
//            this.updateHashMapListStruktur();
//            this.updateHashMapStrukturMK();
//            this.updateHashMapSubabMK();
//        } catch (SQLException ex) {
//            Logger.getLogger(MataKuliah.class.getName()).log(Level.SEVERE, null, ex);
//        }
        //btnPBO.setVisible(false);
        //btnJarkom.setVisible(false);
        //btnBasdat.setVisible(false);
       // btnKB.setVisible(false);
       // btnWeb.setVisible(false);
    }
    public void updateHashMapMK(){
         try {
        String sql ="SELECT * FROM MataKuliah where \"username\" = \"";sql+=this.username;sql+="\";";
        ResultSet rs = Sqlconnection1841720105Hafidh.selectQuery(sql);
        MK = new HashMap<>();
            while (rs.next()) {
                String name = rs.getString("namaMK");
                int id = rs.getInt("idMK");
                MK.put(id, name);
//                System.out.println(MK);
                jCbox.addItem(name);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MataKuliah.class.getName()).log(Level.SEVERE, null, ex);
        }
//         jCbox.addItem("");
//        model.addElement("");
    }
    
    public void updateStruktur(){
//        this.subabName= (String) jListPilihanSubab.getSelectedValue();

        //        System.out.println(this.subabName);
//        JFSubabName.setText(this.subabName);
//        String convertidSubab; int testing;

        //        convertidSubab = testing.toString

        //        JFidSubab.setText(this.idSubab);
//        for (Integer i : StrukturHashmap.keySet()) {
//            System.out.println(this.struktur);
////                  System.out.println("key: " + i + " value: " + SubabHashmap.get(i));
////            if (StrukturHashmap.get(i)==this.struktur) {
////                this.i = i;
//////                                System.out.println(this.idSubab);
////                JFidSubab.setText(i.toString());
////                //            System.out.println(i);
////
////            }
//
//        }
        try {
            updateHashMapListStruktur();
//        jListPilihanStruktur
        } catch (SQLException ex) {
            Logger.getLogger(MataKuliah.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    HashMap<Integer, String> SubabHashmap = new HashMap<>();
    public void updateHashMapSubabMK() throws SQLException{
        jListPilihanSubab.removeAll();
        String sql = "select * from Subab where \"namaMK\" = \"";sql+=JFMKname.getText();sql+="\" and \"username\" = \"";sql+=this.username;sql+="\";";
//        System.out.println("dalam updat"+sql);
        ResultSet rs = Sqlconnection1841720105Hafidh.selectQuery(sql);
        SubabHashmap = new HashMap<>();
         DefaultListModel subab = new DefaultListModel();
//        System.out.println(jCbox.getSelectedItem());
        
            String nama = null;
            int id;
//            for (Integer keys : SubabHashmap.keySet())  
//                {
//                   System.out.println(keys + ":"+ SubabHashmap.get(keys));
//                }
//            System.out.println("testing"+nama);
        while (rs.next()) {            
            nama = rs.getString("namaSubab");
//            System.out.println(nama);
            id = rs.getInt("idSubab");
            if (rs.getString("namaSubab")!=null ) {
//                System.out.println("rs"+id);
                SubabHashmap.put(id, nama); this.idSubab = id;
                subab.addElement(nama);
                jListPilihanSubab.setModel(subab);
            } else {
                System.out.println("null");
                subab.removeAllElements();
                jListPilihanSubab.setModel(subab);
            }
        }
        for (Integer namaa : SubabHashmap.keySet()) {
            System.out.println(SubabHashmap.get(nama));
        }
        
    }
    
    HashMap<Integer, String> StrukturHashmap = new HashMap<>();
    public void updateHashMapStrukturMK() throws SQLException{
        jListPilihanStruktur.removeAll();
        String sql = "select * from Struktur where \"namaMK\" = \"";sql+=JFMKname.getText();sql+="\" and \"username\" = \"";sql+=this.username;sql+="\" and \"namaSubab\" = \"";sql+=this.subabName;sql+="\";";
//        System.out.println("dalam struk"+sql);
        ResultSet rs = Sqlconnection1841720105Hafidh.selectQuery(sql);
//        StrukturHashmap = new HashMap<>();
         DefaultListModel struktur = new DefaultListModel();
//        System.out.println(jCbox.getSelectedItem());
        
            String nama = null;
            int id;
            for (Integer keys : StrukturHashmap.keySet())  
                {
                   System.out.println(keys + ":"+ StrukturHashmap.get(keys));
                }
//            System.out.println("testing"+nama);
        while (rs.next()) {            
            nama = rs.getString("namaStruktur");
            System.out.println(nama);
            id = rs.getInt("idStruktur");
            if (rs.getString("namaStruktur")!=null ) {
                System.out.println("rs"+id);
                StrukturHashmap.put(id, nama); this.idSubab = id;
                struktur.addElement(nama);
                jListPilihanStruktur.setModel(struktur);
            } else if(rs.getString("namaStruktur")==null) {
                System.out.println("null");
                struktur.removeAllElements();
                jListPilihanStruktur.setModel(struktur);
            }
        }
        for (Integer namaa : StrukturHashmap.keySet()) {
            System.out.println(StrukturHashmap.get(nama));
        }
        
    }
    
     public void setMouseHover(JPanel panel) {
        panel.setBackground(new java.awt.Color(115, 163, 239));
    }

    public void setMouseOut(JPanel panel) {
        panel.setBackground(new java.awt.Color(51, 51, 255));
    }
    

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelAll = new javax.swing.JPanel();
        jPanelTema = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Message = new javax.swing.JLabel();
        OpenButton = new java.awt.Button();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        JFidMK = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JFMKname = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jCbox = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        JFidSubab = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListPilihanSubab = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        JFSubabName = new javax.swing.JTextField();
        btnAddSubabMK = new javax.swing.JButton();
        btnDeleteSubabMK = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListPilihanStruktur = new javax.swing.JList<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        JFidStrukturId = new javax.swing.JTextField();
        JFStrukturName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnAddStrukturMK = new javax.swing.JButton();
        btnDeleteStrukturMK = new javax.swing.JButton();
        btnSave = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelAll.setBackground(new java.awt.Color(153, 153, 153));

        jPanelTema.setBackground(new java.awt.Color(0, 102, 153));
        jPanelTema.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MarkCreator");

        jLabel2.setFont(new java.awt.Font("Adobe Gothic Std B", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 89));
        jLabel2.setText(" Pembuat Template Format Laporan ");

        javax.swing.GroupLayout jPanelTemaLayout = new javax.swing.GroupLayout(jPanelTema);
        jPanelTema.setLayout(jPanelTemaLayout);
        jPanelTemaLayout.setHorizontalGroup(
            jPanelTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTemaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanelTemaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTemaLayout.setVerticalGroup(
            jPanelTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTemaLayout.createSequentialGroup()
                .addGroup(jPanelTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTemaLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanelTemaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel2)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));

        jLabel4.setFont(new java.awt.Font("Adobe Gothic Std B", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Setting");

        OpenButton.setLabel("Input");
        OpenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Id Mata Kuliah");

        JFidMK.setEnabled(false);
        JFidMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFidMKActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nama Mata Kuliah");

        JFMKname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFMKnameActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jCbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCboxMouseClicked(evt);
            }
        });
        jCbox.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jCboxInputMethodTextChanged(evt);
            }
        });
        jCbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnAdd)
                        .addGap(63, 63, 63)
                        .addComponent(btnDelete))
                    .addComponent(jCbox, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JFidMK, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3)
                            .addComponent(JFMKname, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(827, 827, 827))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jCbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JFidMK, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JFMKname, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Mata Kuliah", jPanel3);

        JFidSubab.setEnabled(false);
        JFidSubab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFidSubabActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Id");

        jListPilihanSubab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListPilihanSubabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListPilihanSubab);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Nama");

        JFSubabName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFSubabNameActionPerformed(evt);
            }
        });

        btnAddSubabMK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddSubabMK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/images/icons8_add_new_26px_4.png"))); // NOI18N
        btnAddSubabMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSubabMKActionPerformed(evt);
            }
        });

        btnDeleteSubabMK.setText("Delete");
        btnDeleteSubabMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSubabMKActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(60, 63, 65));
        jLabel16.setText("List Subab");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnAddSubabMK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeleteSubabMK))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JFidSubab, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel14)))
                            .addGap(143, 143, 143)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(JFSubabName)))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel16))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JFidSubab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JFSubabName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteSubabMK)
                    .addComponent(btnAddSubabMK)))
        );

        jTabbedPane1.addTab("Subab", jPanel4);

        jListPilihanStruktur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListPilihanStrukturMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jListPilihanStruktur);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("List Struktur");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Id");

        JFidStrukturId.setEnabled(false);
        JFidStrukturId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFidStrukturIdActionPerformed(evt);
            }
        });

        JFStrukturName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFStrukturNameActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nama");

        btnAddStrukturMK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddStrukturMK.setText("Add");
        btnAddStrukturMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStrukturMKActionPerformed(evt);
            }
        });

        btnDeleteStrukturMK.setText("Delete");
        btnDeleteStrukturMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteStrukturMKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(JFidStrukturId, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(JFStrukturName, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btnAddStrukturMK)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDeleteStrukturMK))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addGap(150, 150, 150)
                                    .addComponent(jLabel13))
                                .addComponent(jLabel15)))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JFidStrukturId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JFStrukturName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddStrukturMK)
                    .addComponent(btnDeleteStrukturMK)))
        );

        jTabbedPane1.addTab("Struktur", jPanel5);

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/images/icons8_save_26px.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/images/icons8_about_48px.png"))); // NOI18N
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(465, 465, 465)
                .addComponent(OpenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addComponent(jTabbedPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(OpenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout jPanelAllLayout = new javax.swing.GroupLayout(jPanelAll);
        jPanelAll.setLayout(jPanelAllLayout);
        jPanelAllLayout.setHorizontalGroup(
            jPanelAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAllLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelAllLayout.setVerticalGroup(
            jPanelAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAllLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteSubabMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSubabMKActionPerformed
        // TODO add your handling code here:

        MataKuliahBackend mk = new MataKuliahBackend();
        try {
            mk.deleteSubabMKbtn(JFidSubab.getText().toString());
            //            jCbox.removeItemAt(jCbox.getSelectedIndex());
        } catch (SQLException ex) {
            Logger.getLogger(MataKuliah.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.updateHashMapSubabMK();
        } catch (SQLException ex) {
            Logger.getLogger(MataKuliah.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteSubabMKActionPerformed

    private void btnAddSubabMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSubabMKActionPerformed
        // TODO add your handling code here:
        MataKuliahBackend mk = new MataKuliahBackend();
        try {
            mk.addSubabMKbtn(JFSubabName.getText().toString(), JFMKname.getText().toString(), this.username);
            System.out.println("add"+this.username);
        } catch (SQLException ex) {
            Logger.getLogger(MataKuliah.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            //        jCbox.addItem(JFname.getText().toString());
            //        model.addElement(JFname.getText().toString());
            this.updateHashMapSubabMK();
            //        MK.put(id, JFname.getText().toString());
            //        System.out.println(id);
        } catch (SQLException ex) {
            Logger.getLogger(MataKuliah.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnAddSubabMKActionPerformed

    private void JFSubabNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFSubabNameActionPerformed
        // TODO add your handling code here:
        JFSubabName.setName(this.matakuliah);
    }//GEN-LAST:event_JFSubabNameActionPerformed

    private void JFidSubabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFidSubabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JFidSubabActionPerformed

    private void OpenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenButtonActionPerformed
        // TODO add your handling code here:
        System.out.println(this.id);
        System.out.println(this.matakuliah);
        System.out.println(this.idSubab);
        System.out.println(this.subabName);
        System.out.println(this.idStruktur);
        System.out.println(this.struktur);
        InputISI input =new InputISI();
        input.setInput(this.id, this.matakuliah, this.idSubab, this.subabName, this.indexJCbox, this.idStruktur, this.struktur, this.username);
        input.setVisible(true);
//        input.setLocationRelativeTo(null);
        //        System.out.println(this.id+this.matakuliah+this.idSubab+this.subabName);
        this.dispose();

        //        DefaultListModel test = new DefaultListModel();
        //        System.out.println(jCbox.getSelectedItem());
        //
        //        test.addElement("testing");
        //
        //        jListPilihan.setModel(test);
        //        jListPilihan.addElement();
        //        String tes = (String) jListPilihan.getSelectedValue();
        //        System.out.println(tes);
    }//GEN-LAST:event_OpenButtonActionPerformed

    private void jListPilihanSubabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListPilihanSubabMouseClicked
        // TODO add your handling code here:
        //        String tes;
        this.subabName= (String) jListPilihanSubab.getSelectedValue();

        //        System.out.println(this.subabName);
        JFSubabName.setText(this.subabName);
        String convertidSubab; int testing;

        //        convertidSubab = testing.toString

        //        JFidSubab.setText(this.idSubab);
        for (Integer i : SubabHashmap.keySet()) {
            System.out.println(this.subabName);
//                  System.out.println("key: " + i + " value: " + SubabHashmap.get(i));
            if (SubabHashmap.get(i)==this.subabName) {
                this.idSubab = i;
//                                System.out.println(this.idSubab);
                JFidSubab.setText(i.toString());
                //            System.out.println(i);

            }

        }
        try {
            updateHashMapListStruktur();
//        jListPilihanStruktur
        } catch (SQLException ex) {
            Logger.getLogger(MataKuliah.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jListPilihanSubabMouseClicked

    public void updateHashMapListStruktur() throws SQLException{
//        jListPilihanSubab.removeAll();
        System.out.println(this.subabName);
//        String sql = "select * from Struktur where \"namaMK\" = \"";sql+=JFMKname.getText();sql+="\" and \"username\" = \"";sql+=this.username;sql+="\"";
//        sql+=" and \"namaSubab\" = \"";sql+=this.subabName;sql+="\"";
        String sql = "select * from Struktur where \"namaMK\" = \"";sql+=this.matakuliah;sql+="\" and \"username\" = \"";sql+=this.username;sql+="\"";
        sql+=" and \"namaSubab\" = \"";sql+=this.subabName;sql+="\"";
        System.out.println("dalam struktur"+sql);
        ResultSet rs = Sqlconnection1841720105Hafidh.selectQuery(sql);
        StrukturHashmap = new HashMap<>();
         DefaultListModel struktur = new DefaultListModel();
//        System.out.println(jCbox.getSelectedItem());
        
            String nama = null;
            int id;
//            for (Integer keys : SubabHashmap.keySet())  
//                {
//                   System.out.println(keys + ":"+ SubabHashmap.get(keys));
//                }
//            System.out.println("testing"+nama);
        while (rs.next()) {            
            nama = rs.getString("namaStruktur");
//            System.out.println(nama);
            id = rs.getInt("idStruktur");
            if (rs.getString("namaStruktur")!=null ) {
//                System.out.println("rs"+id);
                StrukturHashmap.put(id, nama); this.idSubab = id;
                struktur.addElement(nama);
                jListPilihanStruktur.setModel(struktur);
            } else if(rs.getString("namaStruktur")==null) {
                System.out.println("null");
                struktur.removeAllElements();
                jListPilihanStruktur.setModel(struktur);
            }
        }
    }
//        for (Integer nama : SubabHashmap.keySet()) {
//            System.out.println(SubabHashmap.get(nama));
//        }
    private void jListPilihanStrukturMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListPilihanStrukturMouseClicked
        // TODO add your handling code here:
        this.struktur= (String) jListPilihanStruktur.getSelectedValue();

        //        System.out.println(this.subabName);
        JFStrukturName.setText(this.struktur);
        String convertidSubab; int testing;

        //        convertidSubab = testing.toString

        //        JFidSubab.setText(this.idSubab);
        for (Integer i : StrukturHashmap.keySet()) {
            System.out.println(i);
            //      System.out.println("key: " + i + " value: " + SubabHashmap.get(i));
            if (StrukturHashmap.get(i)==this.struktur) {
                this.idStruktur = i;
                //                System.out.println(this.idSubab);
                JFidStrukturId.setText(i.toString());
                //            System.out.println(i);

            }

        }
    }//GEN-LAST:event_jListPilihanStrukturMouseClicked

    private void JFidStrukturIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFidStrukturIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JFidStrukturIdActionPerformed

    private void JFStrukturNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFStrukturNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JFStrukturNameActionPerformed

    private void btnAddStrukturMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStrukturMKActionPerformed
        // TODO add your handling code here:
        MataKuliahBackend mk = new MataKuliahBackend();
        try {
            mk.addStrukturMKbtn(JFStrukturName.getText().toString(), JFMKname.getText().toString(), this.username, this.subabName);
//            System.out.println("add"+this.username);
        } catch (SQLException ex) {
            Logger.getLogger(MataKuliah.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            //        jCbox.addItem(JFname.getText().toString());
            //        model.addElement(JFname.getText().toString());
            this.updateHashMapStrukturMK();
            //        MK.put(id, JFname.getText().toString());
            //        System.out.println(id);
        } catch (SQLException ex) {
            Logger.getLogger(MataKuliah.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddStrukturMKActionPerformed

    private void btnDeleteStrukturMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteStrukturMKActionPerformed
        // TODO add your handling code here:
        MataKuliahBackend mk = new MataKuliahBackend();
        try {
            mk.btnDeleteStrukturMK(JFidStrukturId.getText().toString());
            //            jCbox.removeItemAt(jCbox.getSelectedIndex());
        } catch (SQLException ex) {
            Logger.getLogger(MataKuliah.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.updateHashMapStrukturMK();
        } catch (SQLException ex) {
            Logger.getLogger(MataKuliah.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteStrukturMKActionPerformed

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        // TODO add your handling code here:
        SaveToMarkdown1841720060Nurudin save = new SaveToMarkdown1841720060Nurudin();
        save.saveAsMarkdown(this.hasil);
    }//GEN-LAST:event_btnSaveMouseClicked

    private void jCboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboxActionPerformed
        // TODO add your handling code here:

        //        System.out.println(jCbox.getSelectedItem().toString());
        this.matakuliah = jCbox.getSelectedItem().toString();
        JFMKname.setText(this.matakuliah);
        //        System.out.println(jCbox.getSelectedIndex());
        this.indexJCbox = jCbox.getSelectedIndex();
        //        System.out.println(this.matakuliah);
        for (Integer i : MK.keySet()) {
            //            System.out.println(i);
            //      System.out.println("key: " + i + " value: " + MK.get(i));
            if (MK.get(i)==this.matakuliah) {
                this.id = i;
                //            System.out.println(this.id);
                JFidMK.setText(i.toString());
                //            System.out.println(i);

            }

        }
        try {
            updateHashMapSubabMK();
            //         DefaultListModel test = new DefaultListModel();
            //        System.out.println(jCbox.getSelectedItem());
            //
            //        test.addElement(jCbox.getSelectedItem());
            //
            //        jListPilihan.setModel(test);
        } catch (SQLException ex) {
            Logger.getLogger(MataKuliah.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jCboxActionPerformed

    private void jCboxInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jCboxInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboxInputMethodTextChanged

    private void jCboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCboxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboxMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        //        try{
            //        if(jCbox.getItemCount() != 0 && !model.isEmpty()){
                //           jCbox.removeItemAt(jCbox.getSelectedIndex());
                //           model.removeElementAt(jListPilihan.getSelectedIndex());
                //        }else{
                //            Message.setText("Mata Kuliah should not be empty");
                //        }
            //        }catch(ArrayIndexOutOfBoundsException ex){
            //            Message.setText("You must choose an item to delete");
            //        }

        MataKuliahBackend mk = new MataKuliahBackend();
        try {
            mk.deleteMKbtn(JFidMK.getText().toString());
            jCbox.removeItemAt(jCbox.getSelectedIndex());
        } catch (SQLException ex) {
            Logger.getLogger(MataKuliah.class.getName()).log(Level.SEVERE, null, ex);
        }
        //        this.updateHashMap();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        //        jCbox.addItem(JFname.getText());
        //        model.addElement(JFname.getText());

        //        System.out.println(jCbox.getSelectedItem().toString());
        //        jListPilihan.setModel(model);

        MataKuliahBackend mk = new MataKuliahBackend();
        try {
            mk.addMKbtn(JFMKname.getText().toString(), this.username);
        } catch (SQLException ex) {
            Logger.getLogger(MataKuliah.class.getName()).log(Level.SEVERE, null, ex);
        }
        //        jCbox.addItem(JFname.getText().toString());
        //        model.addElement(JFname.getText().toString());
        this.updateHashMapMK();
        //        MK.put(id, JFname.getText().toString());
        System.out.println(id);
    }//GEN-LAST:event_btnAddActionPerformed

    private void JFMKnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFMKnameActionPerformed
        // TODO add your handling code here:
        JFMKname.setName(this.matakuliah);
    }//GEN-LAST:event_JFMKnameActionPerformed

    private void JFidMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFidMKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JFidMKActionPerformed
    DefaultListModel model = new DefaultListModel();        
    
    public void tampilkanData()
    {
//        String [] kolom = {"Nama File", "Directory File"};
        ArrayList<MataKuliahBackend> list = new MataKuliahBackend().getAll();
        Object rowData[] = new Object[1];
        
//        jListPilihan.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        
        for (MataKuliahBackend kat : list) {
//            rowData[0] = kat.getStrukur();
//            jCbox.addItem(matakuliah);
            ((DefaultTableModel) jListPilihanSubab.getModel()).addRow(rowData);
        }
    } 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MataKuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MataKuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MataKuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MataKuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MataKuliah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JFMKname;
    private javax.swing.JTextField JFStrukturName;
    private javax.swing.JTextField JFSubabName;
    private javax.swing.JTextField JFidMK;
    private javax.swing.JTextField JFidStrukturId;
    private javax.swing.JTextField JFidSubab;
    private javax.swing.JLabel Message;
    private java.awt.Button OpenButton;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddStrukturMK;
    private javax.swing.JButton btnAddSubabMK;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteStrukturMK;
    private javax.swing.JButton btnDeleteSubabMK;
    private javax.swing.JLabel btnSave;
    private javax.swing.JComboBox<String> jCbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListPilihanStruktur;
    private javax.swing.JList<String> jListPilihanSubab;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelAll;
    private javax.swing.JPanel jPanelTema;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
