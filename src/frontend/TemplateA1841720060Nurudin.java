/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.AsetSelector1841720060Nurudin;
import backend.FormatText1841720060Nurudin;
import backend.InputTextTemplate1841720060Nurudin;
import backend.Sqlconnection1841720105Hafidh;
import java.util.HashMap;
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 *
 * @author personal
 */
public class TemplateA1841720060Nurudin extends javax.swing.JFrame {

    /**
     * Creates new form CustomTemplateNurudin
     */
    public TemplateA1841720060Nurudin() {
        initComponents();
//        jButtonNavJudul.setVisible(false);
//        jButtonNavKomp.setVisible(false);
//        jButtonNavPerc.setVisible(false);
//        jButtonNavPernyataan.setVisible(false);
//        jButtonNavRangkuman.setVisible(false);
//        jButtonNavRingk.setVisible(false);
//        jButtonNavTugas.setVisible(false);

        navigasiMenu(jLabel5);

        hiddenPercobaanAll();
        System.out.print(jTextAreaTgsSoal.getText());
        System.out.print(jTextArea4.getText());

    }

    InputTextTemplate1841720060Nurudin data = new InputTextTemplate1841720060Nurudin();
    Sqlconnection1841720105Hafidh sql = new Sqlconnection1841720105Hafidh();
    AsetSelector1841720060Nurudin aset = new AsetSelector1841720060Nurudin();
    FormatText1841720060Nurudin menu = new FormatText1841720060Nurudin();
    HashMap<String, String> input = new HashMap<>();

    public void navigasiMenu(JComponent panel) {
        jPanelMain.removeAll();
        jPanelMain.repaint();
        jPanelMain.revalidate();
        //add
        jPanelMain.add(panel);
        jPanelMain.repaint();
        jPanelMain.revalidate();
    }

    public void hiddenPercobaanAll() {
        jTabbedPane1.removeAll();
        jTabbedPane1.repaint();
        jTabbedPane1.revalidate();
        jTabbedPane1.add(jPanelPercobaan1);
        jTabbedPane1.setTitleAt(0, "Percobaan1");
        jTabbedPane1.repaint();
        jTabbedPane1.revalidate();
    }

    public void addPercobaan(JPanel panel, int i, String title) {
        jTabbedPane1.add(panel);
        jTabbedPane1.setTitleAt(i, title);
    }

    public void addPertanyaanPercobaan(JPanel panel, JPanel perc) {
        panel.add(perc);
        panel.repaint();
        panel.revalidate();
    }

    public void manipulasiText() {
        menu.setJtextAreaInputanNurudin(jTextAreaJudul);
        menu.setJtextAreaInputanNurudin(jTextAreaKompetensi);
        menu.setJtextAreaInputanNurudin(jTextAreaRingkasan);
        menu.setJtextAreaInputanNurudin(jTextAreaPercobaan1Deskripsi);
        menu.setJtextAreaInputanNurudin(jTextAreaPercobaan1Langkah);
        menu.setJtextAreaInputanNurudin(jTextAreaPertanyaan);
        menu.setJtextAreaInputanNurudin(jTextAreaPertanyaanJwb);

        if (jTextAreaPercobaan1Deskripsi1.getText().isEmpty()) {//percobaan 2
            System.out.println("Perc 2 kosong");
        } else {
            menu.setJtextAreaInputanNurudin(jTextAreaPercobaan1Deskripsi1);
            menu.setJtextAreaInputanNurudin(jTextAreaPercobaan1Langkah1);
        }

        if (jTextAreaPercobaan1Deskripsi2.getText().isEmpty()) {//percobaan 3
            System.out.println("Perc 3 kosong");
        } else {
            menu.setJtextAreaInputanNurudin(jTextAreaPercobaan1Deskripsi2);
            menu.setJtextAreaInputanNurudin(jTextAreaPercobaan1Langkah2);
        }

        if (jTextAreaPercobaan1Deskripsi3.getText().isEmpty()) {//perc 4
            System.out.println("Perc 4 kosong");
        } else {
            menu.setJtextAreaInputanNurudin(jTextAreaPercobaan1Deskripsi3);
            menu.setJtextAreaInputanNurudin(jTextAreaPercobaan1Langkah3);
        }

        if (jTextAreaPercobaan1Deskripsi4.getText().isEmpty()) {//perc 5
            System.out.println("perc 5 kosong");
        } else {
            menu.setJtextAreaInputanNurudin(jTextAreaPercobaan1Deskripsi4);
            menu.setJtextAreaInputanNurudin(jTextAreaPercobaan1Langkah4);
        }

        if (jTextAreaPercobaan1Deskripsi5.getText().isEmpty()) {//perc 6
            System.out.println("Perc 6 kosong");
        } else {
            menu.setJtextAreaInputanNurudin(jTextAreaPercobaan1Deskripsi5);
            menu.setJtextAreaInputanNurudin(jTextAreaPercobaan1Langkah5);
        }

        if (jTextAreaPercobaan1Deskripsi6.getText().isEmpty()) {//perc 7
            System.out.println("perc 7 kosong");
        } else {
            menu.setJtextAreaInputanNurudin(jTextAreaPercobaan1Deskripsi6);
            menu.setJtextAreaInputanNurudin(jTextAreaPercobaan1Langkah6);
        }

        if (jTextAreaPercobaan1Deskripsi7.getText().isEmpty()) {//percobaan 8
            System.out.println("perc 8 kosong");
        } else {
            menu.setJtextAreaInputanNurudin(jTextAreaPercobaan1Deskripsi7);
            menu.setJtextAreaInputanNurudin(jTextAreaPercobaan1Langkah7);
        }

        if (jTextAreaTgsSoal.getText().isEmpty()) {//tugas 
            System.out.println("Tugas kosong");
        } else {
            menu.setJtextAreaInputanNurudin(jTextAreaTgsJwb);
            menu.setJtextAreaInputanNurudin(jTextAreaTgsSoal);
        }

        menu.setJtextAreaInputanNurudin(jTextArea4);
        menu.setJtextAreaInputanNurudin(jTextAreaRangkuman);
        menu.setJtextAreaInputanNurudin(jTextAreaPernyataan);
    }

    public void inputData() {
        input.put("judul", jTextAreaJudul.getText());
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
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanelSideBar = new javax.swing.JPanel();
        jButtonNavJudul = new javax.swing.JButton();
        jButtonNavKomp = new javax.swing.JButton();
        jButtonNavRingk = new javax.swing.JButton();
        jButtonNavPerc = new javax.swing.JButton();
        jButtonNavTugas = new javax.swing.JButton();
        jButtonNavRangkuman = new javax.swing.JButton();
        jButtonNavPernyataan = new javax.swing.JButton();
        btnDashboard = new javax.swing.JLabel();
        jButtonNavPerc1 = new javax.swing.JButton();
        jPanelMain = new javax.swing.JPanel();
        jPanelJudul = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaJudul = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jPanelKompetensi = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaKompetensi = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jPanelRingkasan = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaRingkasan = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jPanelPercobaan = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelPercobaan1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextAreaPercobaan1Deskripsi = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextAreaPercobaan1Langkah = new javax.swing.JTextArea();
        jButton13 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanelPercobaan2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextAreaPercobaan1Deskripsi1 = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextAreaPercobaan1Langkah1 = new javax.swing.JTextArea();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jPanelPercobaan3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextAreaPercobaan1Deskripsi2 = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTextAreaPercobaan1Langkah2 = new javax.swing.JTextArea();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jPanelPercobaan4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTextAreaPercobaan1Deskripsi3 = new javax.swing.JTextArea();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTextAreaPercobaan1Langkah3 = new javax.swing.JTextArea();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jPanelPercobaan5 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        jTextAreaPercobaan1Deskripsi4 = new javax.swing.JTextArea();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        jTextAreaPercobaan1Langkah4 = new javax.swing.JTextArea();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jPanelPercobaan6 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane26 = new javax.swing.JScrollPane();
        jTextAreaPercobaan1Deskripsi5 = new javax.swing.JTextArea();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane27 = new javax.swing.JScrollPane();
        jTextAreaPercobaan1Langkah5 = new javax.swing.JTextArea();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jPanelPercobaan7 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane30 = new javax.swing.JScrollPane();
        jTextAreaPercobaan1Deskripsi6 = new javax.swing.JTextArea();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane31 = new javax.swing.JScrollPane();
        jTextAreaPercobaan1Langkah6 = new javax.swing.JTextArea();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jPanelPercobaan8 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane34 = new javax.swing.JScrollPane();
        jTextAreaPercobaan1Deskripsi7 = new javax.swing.JTextArea();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane35 = new javax.swing.JScrollPane();
        jTextAreaPercobaan1Langkah7 = new javax.swing.JTextArea();
        jButton27 = new javax.swing.JButton();
        jPanelTugas = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jScrollPane46 = new javax.swing.JScrollPane();
        jTextAreaTgsSoal = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jScrollPane47 = new javax.swing.JScrollPane();
        jTextAreaTgsJwb = new javax.swing.JTextArea();
        jPanelRangkuman = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaRangkuman = new javax.swing.JTextArea();
        jButton7 = new javax.swing.JButton();
        jPanelPernyataan = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaPernyataan = new javax.swing.JTextArea();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane38 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jPanelPertanyaan = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jScrollPane48 = new javax.swing.JScrollPane();
        jTextAreaPertanyaan = new javax.swing.JTextArea();
        jButton8 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jScrollPane49 = new javax.swing.JScrollPane();
        jTextAreaPertanyaanJwb = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(733, 690));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MarkCreator");

        jLabel2.setFont(new java.awt.Font("Adobe Gothic Std B", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 89));
        jLabel2.setText(" Pembuat Template Format Laporan ");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/images/icons8_markdown_48px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel2)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanelSideBar.setBackground(new java.awt.Color(153, 204, 255));
        jPanelSideBar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        jPanelSideBar.setMaximumSize(new java.awt.Dimension(167, 500));
        jPanelSideBar.setMinimumSize(new java.awt.Dimension(167, 0));
        jPanelSideBar.setPreferredSize(new java.awt.Dimension(167, 500));

        jButtonNavJudul.setBackground(new java.awt.Color(204, 204, 255));
        jButtonNavJudul.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonNavJudul.setText("Judul");
        jButtonNavJudul.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButtonNavJudul.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNavJudul.setSelected(true);
        jButtonNavJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNavJudulActionPerformed(evt);
            }
        });

        jButtonNavKomp.setBackground(new java.awt.Color(204, 204, 255));
        jButtonNavKomp.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonNavKomp.setText("Kompetensi");
        jButtonNavKomp.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButtonNavKomp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNavKomp.setSelected(true);
        jButtonNavKomp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNavKompActionPerformed(evt);
            }
        });

        jButtonNavRingk.setBackground(new java.awt.Color(204, 204, 255));
        jButtonNavRingk.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonNavRingk.setText("Ringkasan Materi");
        jButtonNavRingk.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButtonNavRingk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNavRingk.setSelected(true);
        jButtonNavRingk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNavRingkActionPerformed(evt);
            }
        });

        jButtonNavPerc.setBackground(new java.awt.Color(204, 204, 255));
        jButtonNavPerc.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonNavPerc.setText("Percobaan");
        jButtonNavPerc.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButtonNavPerc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNavPerc.setSelected(true);
        jButtonNavPerc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNavPercActionPerformed(evt);
            }
        });

        jButtonNavTugas.setBackground(new java.awt.Color(204, 204, 255));
        jButtonNavTugas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonNavTugas.setText("Tugas");
        jButtonNavTugas.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButtonNavTugas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNavTugas.setSelected(true);
        jButtonNavTugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNavTugasActionPerformed(evt);
            }
        });

        jButtonNavRangkuman.setBackground(new java.awt.Color(204, 204, 255));
        jButtonNavRangkuman.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonNavRangkuman.setText("Rangkuman");
        jButtonNavRangkuman.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButtonNavRangkuman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNavRangkuman.setSelected(true);
        jButtonNavRangkuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNavRangkumanActionPerformed(evt);
            }
        });

        jButtonNavPernyataan.setBackground(new java.awt.Color(204, 204, 255));
        jButtonNavPernyataan.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonNavPernyataan.setText("Pernyataan Diri");
        jButtonNavPernyataan.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButtonNavPernyataan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNavPernyataan.setSelected(true);
        jButtonNavPernyataan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNavPernyataanActionPerformed(evt);
            }
        });

        btnDashboard.setBackground(new java.awt.Color(0, 0, 0));
        btnDashboard.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnDashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/images/icons8_go_back_26px_3.png"))); // NOI18N
        btnDashboard.setText("Dashboard");
        btnDashboard.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        btnDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDashboardMouseClicked(evt);
            }
        });

        jButtonNavPerc1.setBackground(new java.awt.Color(204, 204, 255));
        jButtonNavPerc1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonNavPerc1.setText("Pertanyaan");
        jButtonNavPerc1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButtonNavPerc1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNavPerc1.setSelected(true);
        jButtonNavPerc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNavPerc1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSideBarLayout = new javax.swing.GroupLayout(jPanelSideBar);
        jPanelSideBar.setLayout(jPanelSideBarLayout);
        jPanelSideBarLayout.setHorizontalGroup(
            jPanelSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonNavJudul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNavKomp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNavRingk, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(jButtonNavPerc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNavTugas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNavRangkuman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNavPernyataan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNavPerc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelSideBarLayout.setVerticalGroup(
            jPanelSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonNavJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonNavKomp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonNavRingk, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonNavPerc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonNavPerc1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonNavTugas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonNavRangkuman, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonNavPernyataan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDashboard)
                .addGap(61, 61, 61))
        );

        jPanelMain.setBackground(new java.awt.Color(153, 153, 153));
        jPanelMain.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanelMain.setMinimumSize(new java.awt.Dimension(555, 626));
        jPanelMain.setLayout(new java.awt.CardLayout());

        jPanelJudul.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Judul Laporan");

        jTextAreaJudul.setColumns(20);
        jTextAreaJudul.setLineWrap(true);
        jTextAreaJudul.setRows(5);
        jTextAreaJudul.setWrapStyleWord(true);
        jTextAreaJudul.setName("Judul"); // NOI18N
        jScrollPane1.setViewportView(jTextAreaJudul);

        jButton1.setBackground(new java.awt.Color(0, 102, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelJudulLayout = new javax.swing.GroupLayout(jPanelJudul);
        jPanelJudul.setLayout(jPanelJudulLayout);
        jPanelJudulLayout.setHorizontalGroup(
            jPanelJudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJudulLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelJudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                    .addGroup(jPanelJudulLayout.createSequentialGroup()
                        .addGroup(jPanelJudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelJudulLayout.setVerticalGroup(
            jPanelJudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJudulLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(425, Short.MAX_VALUE))
        );

        jPanelMain.add(jPanelJudul, "card2");

        jPanelKompetensi.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Standar Kompetensi");

        jTextAreaKompetensi.setColumns(20);
        jTextAreaKompetensi.setLineWrap(true);
        jTextAreaKompetensi.setRows(5);
        jTextAreaKompetensi.setWrapStyleWord(true);
        jTextAreaKompetensi.setName("Kompetensi"); // NOI18N
        jScrollPane2.setViewportView(jTextAreaKompetensi);

        jButton3.setBackground(new java.awt.Color(0, 102, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelKompetensiLayout = new javax.swing.GroupLayout(jPanelKompetensi);
        jPanelKompetensi.setLayout(jPanelKompetensiLayout);
        jPanelKompetensiLayout.setHorizontalGroup(
            jPanelKompetensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKompetensiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelKompetensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                    .addGroup(jPanelKompetensiLayout.createSequentialGroup()
                        .addGroup(jPanelKompetensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 392, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelKompetensiLayout.setVerticalGroup(
            jPanelKompetensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKompetensiLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(260, Short.MAX_VALUE))
        );

        jPanelMain.add(jPanelKompetensi, "card2");

        jPanelRingkasan.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Ringkasan Materi");

        jTextAreaRingkasan.setColumns(20);
        jTextAreaRingkasan.setLineWrap(true);
        jTextAreaRingkasan.setRows(5);
        jTextAreaRingkasan.setWrapStyleWord(true);
        jTextAreaRingkasan.setName("Materi"); // NOI18N
        jScrollPane3.setViewportView(jTextAreaRingkasan);

        jButton5.setBackground(new java.awt.Color(0, 102, 153));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRingkasanLayout = new javax.swing.GroupLayout(jPanelRingkasan);
        jPanelRingkasan.setLayout(jPanelRingkasanLayout);
        jPanelRingkasanLayout.setHorizontalGroup(
            jPanelRingkasanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRingkasanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRingkasanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                    .addGroup(jPanelRingkasanLayout.createSequentialGroup()
                        .addGroup(jPanelRingkasanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelRingkasanLayout.setVerticalGroup(
            jPanelRingkasanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRingkasanLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(260, Short.MAX_VALUE))
        );

        jPanelMain.add(jPanelRingkasan, "card2");

        jPanelPercobaan.setBackground(new java.awt.Color(204, 204, 204));

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 204));

        jPanelPercobaan1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Deskripsi percobaan");

        jTextAreaPercobaan1Deskripsi.setColumns(20);
        jTextAreaPercobaan1Deskripsi.setLineWrap(true);
        jTextAreaPercobaan1Deskripsi.setRows(5);
        jTextAreaPercobaan1Deskripsi.setWrapStyleWord(true);
        jTextAreaPercobaan1Deskripsi.setName("Percobaan1"); // NOI18N
        jScrollPane6.setViewportView(jTextAreaPercobaan1Deskripsi);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Langkah percobaan");

        jTextAreaPercobaan1Langkah.setColumns(20);
        jTextAreaPercobaan1Langkah.setLineWrap(true);
        jTextAreaPercobaan1Langkah.setRows(5);
        jTextAreaPercobaan1Langkah.setWrapStyleWord(true);
        jTextAreaPercobaan1Langkah.setName("Langkah percobaan"); // NOI18N
        jScrollPane7.setViewportView(jTextAreaPercobaan1Langkah);

        jButton13.setBackground(new java.awt.Color(0, 102, 153));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/images/icons8_add_new_26px_6.png"))); // NOI18N
        jButton13.setText("Percobaan");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(0, 102, 153));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Clear");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPercobaan1Layout = new javax.swing.GroupLayout(jPanelPercobaan1);
        jPanelPercobaan1.setLayout(jPanelPercobaan1Layout);
        jPanelPercobaan1Layout.setHorizontalGroup(
            jPanelPercobaan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPercobaan1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPercobaan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addGroup(jPanelPercobaan1Layout.createSequentialGroup()
                        .addGroup(jPanelPercobaan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addGroup(jPanelPercobaan1Layout.createSequentialGroup()
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton13)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelPercobaan1Layout.setVerticalGroup(
            jPanelPercobaan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPercobaan1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPercobaan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(272, 272, 272))
        );

        jTabbedPane1.addTab("Percobaan1", jPanelPercobaan1);

        jPanelPercobaan2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("Deskripsi percobaan");

        jTextAreaPercobaan1Deskripsi1.setColumns(20);
        jTextAreaPercobaan1Deskripsi1.setLineWrap(true);
        jTextAreaPercobaan1Deskripsi1.setRows(5);
        jTextAreaPercobaan1Deskripsi1.setWrapStyleWord(true);
        jTextAreaPercobaan1Deskripsi1.setName("Percobaan2"); // NOI18N
        jScrollPane10.setViewportView(jTextAreaPercobaan1Deskripsi1);

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("Langkah percobaan");

        jTextAreaPercobaan1Langkah1.setColumns(20);
        jTextAreaPercobaan1Langkah1.setLineWrap(true);
        jTextAreaPercobaan1Langkah1.setRows(5);
        jTextAreaPercobaan1Langkah1.setWrapStyleWord(true);
        jTextAreaPercobaan1Langkah1.setName("Langkah percobaan"); // NOI18N
        jScrollPane11.setViewportView(jTextAreaPercobaan1Langkah1);

        jButton14.setBackground(new java.awt.Color(0, 102, 153));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/images/icons8_add_new_26px_6.png"))); // NOI18N
        jButton14.setText("Percobaan");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(0, 102, 153));
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Clear");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPercobaan2Layout = new javax.swing.GroupLayout(jPanelPercobaan2);
        jPanelPercobaan2.setLayout(jPanelPercobaan2Layout);
        jPanelPercobaan2Layout.setHorizontalGroup(
            jPanelPercobaan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPercobaan2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPercobaan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addGroup(jPanelPercobaan2Layout.createSequentialGroup()
                        .addGroup(jPanelPercobaan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addGroup(jPanelPercobaan2Layout.createSequentialGroup()
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton14)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelPercobaan2Layout.setVerticalGroup(
            jPanelPercobaan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPercobaan2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelPercobaan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(265, 265, 265))
        );

        jTabbedPane1.addTab("Percobaan2", jPanelPercobaan2);

        jPanelPercobaan3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setText("Deskripsi percobaan");

        jTextAreaPercobaan1Deskripsi2.setColumns(20);
        jTextAreaPercobaan1Deskripsi2.setLineWrap(true);
        jTextAreaPercobaan1Deskripsi2.setRows(5);
        jTextAreaPercobaan1Deskripsi2.setWrapStyleWord(true);
        jTextAreaPercobaan1Deskripsi2.setName("Percobaan3"); // NOI18N
        jScrollPane14.setViewportView(jTextAreaPercobaan1Deskripsi2);

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setText("Langkah percobaan");

        jTextAreaPercobaan1Langkah2.setColumns(20);
        jTextAreaPercobaan1Langkah2.setLineWrap(true);
        jTextAreaPercobaan1Langkah2.setRows(5);
        jTextAreaPercobaan1Langkah2.setWrapStyleWord(true);
        jTextAreaPercobaan1Langkah2.setName("Langkah percobaan"); // NOI18N
        jScrollPane15.setViewportView(jTextAreaPercobaan1Langkah2);

        jButton16.setBackground(new java.awt.Color(0, 102, 153));
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/images/icons8_add_new_26px_6.png"))); // NOI18N
        jButton16.setText("Percobaan");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(0, 102, 153));
        jButton17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Clear");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPercobaan3Layout = new javax.swing.GroupLayout(jPanelPercobaan3);
        jPanelPercobaan3.setLayout(jPanelPercobaan3Layout);
        jPanelPercobaan3Layout.setHorizontalGroup(
            jPanelPercobaan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPercobaan3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPercobaan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addGroup(jPanelPercobaan3Layout.createSequentialGroup()
                        .addGroup(jPanelPercobaan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addGroup(jPanelPercobaan3Layout.createSequentialGroup()
                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton16)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelPercobaan3Layout.setVerticalGroup(
            jPanelPercobaan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPercobaan3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelPercobaan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(265, 265, 265))
        );

        jTabbedPane1.addTab("Percobaan2", jPanelPercobaan3);

        jPanelPercobaan4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setText("Deskripsi percobaan");

        jTextAreaPercobaan1Deskripsi3.setColumns(20);
        jTextAreaPercobaan1Deskripsi3.setLineWrap(true);
        jTextAreaPercobaan1Deskripsi3.setRows(5);
        jTextAreaPercobaan1Deskripsi3.setWrapStyleWord(true);
        jTextAreaPercobaan1Deskripsi3.setName("Percobaan4"); // NOI18N
        jScrollPane18.setViewportView(jTextAreaPercobaan1Deskripsi3);

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel24.setText("Langkah percobaan");

        jTextAreaPercobaan1Langkah3.setColumns(20);
        jTextAreaPercobaan1Langkah3.setLineWrap(true);
        jTextAreaPercobaan1Langkah3.setRows(5);
        jTextAreaPercobaan1Langkah3.setWrapStyleWord(true);
        jTextAreaPercobaan1Langkah3.setName("Langkah percobaan"); // NOI18N
        jScrollPane19.setViewportView(jTextAreaPercobaan1Langkah3);

        jButton18.setBackground(new java.awt.Color(0, 102, 153));
        jButton18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/images/icons8_add_new_26px_6.png"))); // NOI18N
        jButton18.setText("Percobaan");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(0, 102, 153));
        jButton19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("Clear");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPercobaan4Layout = new javax.swing.GroupLayout(jPanelPercobaan4);
        jPanelPercobaan4.setLayout(jPanelPercobaan4Layout);
        jPanelPercobaan4Layout.setHorizontalGroup(
            jPanelPercobaan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPercobaan4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPercobaan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addGroup(jPanelPercobaan4Layout.createSequentialGroup()
                        .addGroup(jPanelPercobaan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addGroup(jPanelPercobaan4Layout.createSequentialGroup()
                                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton18)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelPercobaan4Layout.setVerticalGroup(
            jPanelPercobaan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPercobaan4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelPercobaan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(265, 265, 265))
        );

        jTabbedPane1.addTab("Percobaan2", jPanelPercobaan4);

        jPanelPercobaan5.setBackground(new java.awt.Color(204, 204, 204));

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setText("Deskripsi percobaan");

        jTextAreaPercobaan1Deskripsi4.setColumns(20);
        jTextAreaPercobaan1Deskripsi4.setLineWrap(true);
        jTextAreaPercobaan1Deskripsi4.setRows(5);
        jTextAreaPercobaan1Deskripsi4.setWrapStyleWord(true);
        jTextAreaPercobaan1Deskripsi4.setName("Percobaan5"); // NOI18N
        jScrollPane22.setViewportView(jTextAreaPercobaan1Deskripsi4);

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setText("Langkah percobaan");

        jTextAreaPercobaan1Langkah4.setColumns(20);
        jTextAreaPercobaan1Langkah4.setLineWrap(true);
        jTextAreaPercobaan1Langkah4.setRows(5);
        jTextAreaPercobaan1Langkah4.setWrapStyleWord(true);
        jTextAreaPercobaan1Langkah4.setName("Langkah percobaan"); // NOI18N
        jScrollPane23.setViewportView(jTextAreaPercobaan1Langkah4);

        jButton20.setBackground(new java.awt.Color(0, 102, 153));
        jButton20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/images/icons8_add_new_26px_6.png"))); // NOI18N
        jButton20.setText("Percobaan");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(0, 102, 153));
        jButton21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setText("Clear");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPercobaan5Layout = new javax.swing.GroupLayout(jPanelPercobaan5);
        jPanelPercobaan5.setLayout(jPanelPercobaan5Layout);
        jPanelPercobaan5Layout.setHorizontalGroup(
            jPanelPercobaan5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPercobaan5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPercobaan5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addComponent(jScrollPane23, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addGroup(jPanelPercobaan5Layout.createSequentialGroup()
                        .addGroup(jPanelPercobaan5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28)
                            .addGroup(jPanelPercobaan5Layout.createSequentialGroup()
                                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton20)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelPercobaan5Layout.setVerticalGroup(
            jPanelPercobaan5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPercobaan5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelPercobaan5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(265, 265, 265))
        );

        jTabbedPane1.addTab("Percobaan2", jPanelPercobaan5);

        jPanelPercobaan6.setBackground(new java.awt.Color(204, 204, 204));

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel31.setText("Deskripsi percobaan");

        jTextAreaPercobaan1Deskripsi5.setColumns(20);
        jTextAreaPercobaan1Deskripsi5.setLineWrap(true);
        jTextAreaPercobaan1Deskripsi5.setRows(5);
        jTextAreaPercobaan1Deskripsi5.setWrapStyleWord(true);
        jTextAreaPercobaan1Deskripsi5.setName("Percobaan6"); // NOI18N
        jScrollPane26.setViewportView(jTextAreaPercobaan1Deskripsi5);

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel32.setText("Langkah percobaan");

        jTextAreaPercobaan1Langkah5.setColumns(20);
        jTextAreaPercobaan1Langkah5.setLineWrap(true);
        jTextAreaPercobaan1Langkah5.setRows(5);
        jTextAreaPercobaan1Langkah5.setWrapStyleWord(true);
        jTextAreaPercobaan1Langkah5.setName("Langkah percobaan"); // NOI18N
        jScrollPane27.setViewportView(jTextAreaPercobaan1Langkah5);

        jButton22.setBackground(new java.awt.Color(0, 102, 153));
        jButton22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/images/icons8_add_new_26px_6.png"))); // NOI18N
        jButton22.setText("Percobaan");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setBackground(new java.awt.Color(0, 102, 153));
        jButton23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("Clear");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPercobaan6Layout = new javax.swing.GroupLayout(jPanelPercobaan6);
        jPanelPercobaan6.setLayout(jPanelPercobaan6Layout);
        jPanelPercobaan6Layout.setHorizontalGroup(
            jPanelPercobaan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPercobaan6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPercobaan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane26, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addComponent(jScrollPane27, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addGroup(jPanelPercobaan6Layout.createSequentialGroup()
                        .addGroup(jPanelPercobaan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32)
                            .addGroup(jPanelPercobaan6Layout.createSequentialGroup()
                                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton22)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelPercobaan6Layout.setVerticalGroup(
            jPanelPercobaan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPercobaan6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelPercobaan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(265, 265, 265))
        );

        jTabbedPane1.addTab("Percobaan2", jPanelPercobaan6);

        jPanelPercobaan7.setBackground(new java.awt.Color(204, 204, 204));

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel35.setText("Deskripsi percobaan");

        jTextAreaPercobaan1Deskripsi6.setColumns(20);
        jTextAreaPercobaan1Deskripsi6.setLineWrap(true);
        jTextAreaPercobaan1Deskripsi6.setRows(5);
        jTextAreaPercobaan1Deskripsi6.setWrapStyleWord(true);
        jTextAreaPercobaan1Deskripsi6.setName("Percobaan7"); // NOI18N
        jScrollPane30.setViewportView(jTextAreaPercobaan1Deskripsi6);

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel36.setText("Langkah percobaan");

        jTextAreaPercobaan1Langkah6.setColumns(20);
        jTextAreaPercobaan1Langkah6.setLineWrap(true);
        jTextAreaPercobaan1Langkah6.setRows(5);
        jTextAreaPercobaan1Langkah6.setWrapStyleWord(true);
        jTextAreaPercobaan1Langkah6.setName("Langkah percobaan"); // NOI18N
        jScrollPane31.setViewportView(jTextAreaPercobaan1Langkah6);

        jButton24.setBackground(new java.awt.Color(0, 102, 153));
        jButton24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/images/icons8_add_new_26px_6.png"))); // NOI18N
        jButton24.setText("Percobaan");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setBackground(new java.awt.Color(0, 102, 153));
        jButton25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("Clear");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPercobaan7Layout = new javax.swing.GroupLayout(jPanelPercobaan7);
        jPanelPercobaan7.setLayout(jPanelPercobaan7Layout);
        jPanelPercobaan7Layout.setHorizontalGroup(
            jPanelPercobaan7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPercobaan7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPercobaan7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane30, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addComponent(jScrollPane31, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addGroup(jPanelPercobaan7Layout.createSequentialGroup()
                        .addGroup(jPanelPercobaan7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(jLabel36)
                            .addGroup(jPanelPercobaan7Layout.createSequentialGroup()
                                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton24)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelPercobaan7Layout.setVerticalGroup(
            jPanelPercobaan7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPercobaan7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelPercobaan7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(265, 265, 265))
        );

        jTabbedPane1.addTab("Percobaan2", jPanelPercobaan7);

        jPanelPercobaan8.setBackground(new java.awt.Color(204, 204, 204));

        jLabel39.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel39.setText("Deskripsi percobaan");

        jTextAreaPercobaan1Deskripsi7.setColumns(20);
        jTextAreaPercobaan1Deskripsi7.setLineWrap(true);
        jTextAreaPercobaan1Deskripsi7.setRows(5);
        jTextAreaPercobaan1Deskripsi7.setWrapStyleWord(true);
        jTextAreaPercobaan1Deskripsi7.setName("Percobaan8"); // NOI18N
        jScrollPane34.setViewportView(jTextAreaPercobaan1Deskripsi7);

        jLabel40.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel40.setText("Langkah percobaan");

        jTextAreaPercobaan1Langkah7.setColumns(20);
        jTextAreaPercobaan1Langkah7.setLineWrap(true);
        jTextAreaPercobaan1Langkah7.setRows(5);
        jTextAreaPercobaan1Langkah7.setWrapStyleWord(true);
        jTextAreaPercobaan1Langkah7.setName("Langkah percobaan"); // NOI18N
        jScrollPane35.setViewportView(jTextAreaPercobaan1Langkah7);

        jButton27.setBackground(new java.awt.Color(0, 102, 153));
        jButton27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton27.setForeground(new java.awt.Color(255, 255, 255));
        jButton27.setText("Clear");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPercobaan8Layout = new javax.swing.GroupLayout(jPanelPercobaan8);
        jPanelPercobaan8.setLayout(jPanelPercobaan8Layout);
        jPanelPercobaan8Layout.setHorizontalGroup(
            jPanelPercobaan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPercobaan8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPercobaan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane34, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addComponent(jScrollPane35, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addGroup(jPanelPercobaan8Layout.createSequentialGroup()
                        .addGroup(jPanelPercobaan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39)
                            .addComponent(jLabel40)
                            .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelPercobaan8Layout.setVerticalGroup(
            jPanelPercobaan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPercobaan8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(347, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Percobaan2", jPanelPercobaan8);

        javax.swing.GroupLayout jPanelPercobaanLayout = new javax.swing.GroupLayout(jPanelPercobaan);
        jPanelPercobaan.setLayout(jPanelPercobaanLayout);
        jPanelPercobaanLayout.setHorizontalGroup(
            jPanelPercobaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanelPercobaanLayout.setVerticalGroup(
            jPanelPercobaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
        );

        jPanelMain.add(jPanelPercobaan, "card2");

        jPanelTugas.setBackground(new java.awt.Color(255, 255, 255));

        jLabel51.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel51.setText("Soal");

        jTextAreaTgsSoal.setColumns(20);
        jTextAreaTgsSoal.setLineWrap(true);
        jTextAreaTgsSoal.setRows(5);
        jTextAreaTgsSoal.setWrapStyleWord(true);
        jTextAreaTgsSoal.setName("Tugas"); // NOI18N
        jScrollPane46.setViewportView(jTextAreaTgsSoal);

        jButton4.setBackground(new java.awt.Color(0, 102, 153));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Clear");

        jLabel52.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel52.setText("Jawab");

        jTextAreaTgsJwb.setColumns(20);
        jTextAreaTgsJwb.setLineWrap(true);
        jTextAreaTgsJwb.setRows(5);
        jTextAreaTgsJwb.setWrapStyleWord(true);
        jTextAreaTgsJwb.setName("Jawab"); // NOI18N
        jScrollPane47.setViewportView(jTextAreaTgsJwb);

        javax.swing.GroupLayout jPanelTugasLayout = new javax.swing.GroupLayout(jPanelTugas);
        jPanelTugas.setLayout(jPanelTugasLayout);
        jPanelTugasLayout.setHorizontalGroup(
            jPanelTugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTugasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane46, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                    .addGroup(jPanelTugasLayout.createSequentialGroup()
                        .addGroup(jPanelTugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane47, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelTugasLayout.setVerticalGroup(
            jPanelTugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTugasLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane46, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane47, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jPanelMain.add(jPanelTugas, "card2");

        jPanelRangkuman.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Rangkuman");

        jTextAreaRangkuman.setColumns(20);
        jTextAreaRangkuman.setLineWrap(true);
        jTextAreaRangkuman.setRows(5);
        jTextAreaRangkuman.setWrapStyleWord(true);
        jTextAreaRangkuman.setName("Rangkuman"); // NOI18N
        jScrollPane4.setViewportView(jTextAreaRangkuman);

        jButton7.setBackground(new java.awt.Color(0, 102, 153));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Clear");

        javax.swing.GroupLayout jPanelRangkumanLayout = new javax.swing.GroupLayout(jPanelRangkuman);
        jPanelRangkuman.setLayout(jPanelRangkumanLayout);
        jPanelRangkumanLayout.setHorizontalGroup(
            jPanelRangkumanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRangkumanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRangkumanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanelRangkumanLayout.createSequentialGroup()
                        .addGroup(jPanelRangkumanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 442, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelRangkumanLayout.setVerticalGroup(
            jPanelRangkumanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRangkumanLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(260, Short.MAX_VALUE))
        );

        jPanelMain.add(jPanelRangkuman, "card2");

        jPanelPernyataan.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Pernyataan Diri");

        jTextAreaPernyataan.setColumns(20);
        jTextAreaPernyataan.setLineWrap(true);
        jTextAreaPernyataan.setRows(5);
        jTextAreaPernyataan.setText("Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.\n\nJika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.\n\nTtd,");
        jTextAreaPernyataan.setWrapStyleWord(true);
        jTextAreaPernyataan.setEnabled(false);
        jTextAreaPernyataan.setName("Pernyataan"); // NOI18N
        jScrollPane5.setViewportView(jTextAreaPernyataan);

        jButton9.setBackground(new java.awt.Color(0, 102, 153));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Submit");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Clear");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Nama");

        jTextArea4.setColumns(20);
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jTextArea4.setWrapStyleWord(true);
        jTextArea4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextArea4.setName("nama"); // NOI18N
        jScrollPane38.setViewportView(jTextArea4);

        javax.swing.GroupLayout jPanelPernyataanLayout = new javax.swing.GroupLayout(jPanelPernyataan);
        jPanelPernyataan.setLayout(jPanelPernyataanLayout);
        jPanelPernyataanLayout.setHorizontalGroup(
            jPanelPernyataanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPernyataanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPernyataanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane38)
                    .addGroup(jPanelPernyataanLayout.createSequentialGroup()
                        .addGroup(jPanelPernyataanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addGroup(jPanelPernyataanLayout.createSequentialGroup()
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 344, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelPernyataanLayout.setVerticalGroup(
            jPanelPernyataanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPernyataanLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanelPernyataanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(276, Short.MAX_VALUE))
        );

        jPanelMain.add(jPanelPernyataan, "card2");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Dokumen Kosong");
        jPanelMain.add(jLabel5, "card9");

        jPanelPertanyaan.setBackground(new java.awt.Color(255, 255, 255));

        jLabel53.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel53.setText("Pertanyaan");

        jTextAreaPertanyaan.setColumns(20);
        jTextAreaPertanyaan.setLineWrap(true);
        jTextAreaPertanyaan.setRows(5);
        jTextAreaPertanyaan.setWrapStyleWord(true);
        jTextAreaPertanyaan.setName("Pertanyaan :"); // NOI18N
        jScrollPane48.setViewportView(jTextAreaPertanyaan);

        jButton8.setBackground(new java.awt.Color(0, 102, 153));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Clear");

        jLabel54.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel54.setText("Jawab");

        jTextAreaPertanyaanJwb.setColumns(20);
        jTextAreaPertanyaanJwb.setLineWrap(true);
        jTextAreaPertanyaanJwb.setRows(5);
        jTextAreaPertanyaanJwb.setWrapStyleWord(true);
        jTextAreaPertanyaanJwb.setName("Jawab"); // NOI18N
        jScrollPane49.setViewportView(jTextAreaPertanyaanJwb);

        javax.swing.GroupLayout jPanelPertanyaanLayout = new javax.swing.GroupLayout(jPanelPertanyaan);
        jPanelPertanyaan.setLayout(jPanelPertanyaanLayout);
        jPanelPertanyaanLayout.setHorizontalGroup(
            jPanelPertanyaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPertanyaanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPertanyaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane48, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                    .addGroup(jPanelPertanyaanLayout.createSequentialGroup()
                        .addGroup(jPanelPertanyaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel53)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel54))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane49, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelPertanyaanLayout.setVerticalGroup(
            jPanelPertanyaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPertanyaanLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane48, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane49, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jPanelMain.add(jPanelPertanyaan, "card2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanelSideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(247, 247, 247))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelSideBar, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                    .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNavJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNavJudulActionPerformed
        // TODO add your handling code here:
        navigasiMenu(jPanelJudul);
    }//GEN-LAST:event_jButtonNavJudulActionPerformed

    private void jButtonNavKompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNavKompActionPerformed
        // TODO add your handling code here:
        navigasiMenu(jPanelKompetensi);
    }//GEN-LAST:event_jButtonNavKompActionPerformed

    private void jButtonNavRingkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNavRingkActionPerformed
        // TODO add your handling code here:
        navigasiMenu(jPanelRingkasan);
    }//GEN-LAST:event_jButtonNavRingkActionPerformed

    private void jButtonNavPercActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNavPercActionPerformed
        // TODO add your handling code here:
        navigasiMenu(jPanelPercobaan);
    }//GEN-LAST:event_jButtonNavPercActionPerformed

    private void jButtonNavTugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNavTugasActionPerformed
        // TODO add your handling code here:
        navigasiMenu(jPanelTugas);

    }//GEN-LAST:event_jButtonNavTugasActionPerformed

    private void jButtonNavRangkumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNavRangkumanActionPerformed
        // TODO add your handling code here:
        navigasiMenu(jPanelRangkuman);

    }//GEN-LAST:event_jButtonNavRangkumanActionPerformed

    private void jButtonNavPernyataanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNavPernyataanActionPerformed
        // TODO add your handling code here:
        navigasiMenu(jPanelPernyataan);
    }//GEN-LAST:event_jButtonNavPernyataanActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        jButton13.setVisible(false);
        addPercobaan(jPanelPercobaan2, 1, "Percobaan2");

    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        jButton14.setVisible(false);
        addPercobaan(jPanelPercobaan3, 2, "Percobaan3");
    }//GEN-LAST:event_jButton14ActionPerformed

    private void btnDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseClicked
        // TODO add your handling code here:
        DashboardUas1841720060Nurudin dash = new DashboardUas1841720060Nurudin();
        dash.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDashboardMouseClicked

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        jButton16.setVisible(false);
        addPercobaan(jPanelPercobaan4, 3, "Percobaan4");
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        jButton18.setVisible(false);
        addPercobaan(jPanelPercobaan5, 4, "Percobaan5");
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        jButton20.setVisible(false);
        addPercobaan(jPanelPercobaan6, 5, "Percobaan6");
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        jButton22.setVisible(false);
        addPercobaan(jPanelPercobaan7, 6, "Percobaan7");
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        jButton24.setVisible(false);
        addPercobaan(jPanelPercobaan8, 7, "Percobaan8");
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTextAreaJudul.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        manipulasiText();
        data.ambilInputForm(jTextAreaTgsSoal, jTextAreaTgsJwb);
        data.ambilInputForm(jTextAreaJudul);
        data.ambilInputForm(jTextAreaKompetensi);
        data.ambilInputForm(jTextAreaRingkasan);
        data.ambilInputForm(jTextAreaRangkuman);
        data.ambilInputForm(jTextAreaPernyataan, jTextArea4);
        data.ambilInputForm(jTextAreaPercobaan1Deskripsi, jTextAreaPercobaan1Langkah);
        data.ambilInputForm(jTextAreaPertanyaan, jTextAreaPertanyaanJwb);
        data.ambilInputForm(jTextAreaPercobaan1Deskripsi1, jTextAreaPercobaan1Langkah1);
        data.ambilInputForm(jTextAreaPercobaan1Deskripsi2, jTextAreaPercobaan1Langkah2);
        data.ambilInputForm(jTextAreaPercobaan1Deskripsi3, jTextAreaPercobaan1Langkah3);
        data.ambilInputForm(jTextAreaPercobaan1Deskripsi4, jTextAreaPercobaan1Langkah4);
        data.ambilInputForm(jTextAreaPercobaan1Deskripsi5, jTextAreaPercobaan1Langkah5);
        data.ambilInputForm(jTextAreaPercobaan1Deskripsi6, jTextAreaPercobaan1Langkah6);
        data.ambilInputForm(jTextAreaPercobaan1Deskripsi7, jTextAreaPercobaan1Langkah7);
        data.gabungInputanPercobaan();

        data.saveNurudin();
        DashboardUas1841720060Nurudin dash = new DashboardUas1841720060Nurudin();
        dash.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        jTextAreaPercobaan1Deskripsi1.setText("");
        jTextAreaPercobaan1Langkah1.setText("");
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButtonNavPerc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNavPerc1ActionPerformed
        // TODO add your handling code here:
        navigasiMenu(jPanelPertanyaan);
    }//GEN-LAST:event_jButtonNavPerc1ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        jTextAreaPercobaan1Deskripsi7.setText("");
        jTextAreaPercobaan1Langkah7.setText("");
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTextAreaKompetensi.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jTextAreaRingkasan.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        jTextAreaPercobaan1Deskripsi.setText("");
        jTextAreaPercobaan1Langkah.setText("");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        jTextAreaPercobaan1Deskripsi2.setText("");
        jTextAreaPercobaan1Langkah2.setText("");
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        jTextAreaPercobaan1Deskripsi3.setText("");
        jTextAreaPercobaan1Langkah3.setText("");
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        jTextAreaPercobaan1Deskripsi4.setText("");
        jTextAreaPercobaan1Langkah4.setText("");
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        jTextAreaPercobaan1Deskripsi5.setText("");
        jTextAreaPercobaan1Langkah5.setText("");
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        jTextAreaPercobaan1Deskripsi6.setText("");
        jTextAreaPercobaan1Langkah6.setText("");
    }//GEN-LAST:event_jButton25ActionPerformed

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
            java.util.logging.Logger.getLogger(TemplateA1841720060Nurudin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TemplateA1841720060Nurudin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TemplateA1841720060Nurudin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TemplateA1841720060Nurudin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TemplateA1841720060Nurudin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnDashboard;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonNavJudul;
    private javax.swing.JButton jButtonNavKomp;
    private javax.swing.JButton jButtonNavPerc;
    private javax.swing.JButton jButtonNavPerc1;
    private javax.swing.JButton jButtonNavPernyataan;
    private javax.swing.JButton jButtonNavRangkuman;
    private javax.swing.JButton jButtonNavRingk;
    private javax.swing.JButton jButtonNavTugas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelJudul;
    private javax.swing.JPanel jPanelKompetensi;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelPercobaan;
    private javax.swing.JPanel jPanelPercobaan1;
    private javax.swing.JPanel jPanelPercobaan2;
    private javax.swing.JPanel jPanelPercobaan3;
    private javax.swing.JPanel jPanelPercobaan4;
    private javax.swing.JPanel jPanelPercobaan5;
    private javax.swing.JPanel jPanelPercobaan6;
    private javax.swing.JPanel jPanelPercobaan7;
    private javax.swing.JPanel jPanelPercobaan8;
    private javax.swing.JPanel jPanelPernyataan;
    private javax.swing.JPanel jPanelPertanyaan;
    private javax.swing.JPanel jPanelRangkuman;
    private javax.swing.JPanel jPanelRingkasan;
    private javax.swing.JPanel jPanelSideBar;
    private javax.swing.JPanel jPanelTugas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane46;
    private javax.swing.JScrollPane jScrollPane47;
    private javax.swing.JScrollPane jScrollPane48;
    private javax.swing.JScrollPane jScrollPane49;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextAreaJudul;
    private javax.swing.JTextArea jTextAreaKompetensi;
    private javax.swing.JTextArea jTextAreaPercobaan1Deskripsi;
    private javax.swing.JTextArea jTextAreaPercobaan1Deskripsi1;
    private javax.swing.JTextArea jTextAreaPercobaan1Deskripsi2;
    private javax.swing.JTextArea jTextAreaPercobaan1Deskripsi3;
    private javax.swing.JTextArea jTextAreaPercobaan1Deskripsi4;
    private javax.swing.JTextArea jTextAreaPercobaan1Deskripsi5;
    private javax.swing.JTextArea jTextAreaPercobaan1Deskripsi6;
    private javax.swing.JTextArea jTextAreaPercobaan1Deskripsi7;
    private javax.swing.JTextArea jTextAreaPercobaan1Langkah;
    private javax.swing.JTextArea jTextAreaPercobaan1Langkah1;
    private javax.swing.JTextArea jTextAreaPercobaan1Langkah2;
    private javax.swing.JTextArea jTextAreaPercobaan1Langkah3;
    private javax.swing.JTextArea jTextAreaPercobaan1Langkah4;
    private javax.swing.JTextArea jTextAreaPercobaan1Langkah5;
    private javax.swing.JTextArea jTextAreaPercobaan1Langkah6;
    private javax.swing.JTextArea jTextAreaPercobaan1Langkah7;
    private javax.swing.JTextArea jTextAreaPernyataan;
    private javax.swing.JTextArea jTextAreaPertanyaan;
    private javax.swing.JTextArea jTextAreaPertanyaanJwb;
    private javax.swing.JTextArea jTextAreaRangkuman;
    private javax.swing.JTextArea jTextAreaRingkasan;
    private javax.swing.JTextArea jTextAreaTgsJwb;
    private javax.swing.JTextArea jTextAreaTgsSoal;
    // End of variables declaration//GEN-END:variables
}
