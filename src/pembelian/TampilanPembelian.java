/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pembelian;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import menu.cetak.CetakPembelian;

/**
 *
 * @author Anri
 */
public final class TampilanPembelian extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public TampilanPembelian() {
        initComponents();
        tampildata();
        JT_Stok.setText("0");
        this.setResizable(false);
    }
    
    private void baru() {
        BTN_Trs.setText("BATAL");
        BTN_SIM.setEnabled(true);
        BTN_UB.setEnabled(false);
        BTN_HAP.setEnabled(false);
        BTN_CET.setEnabled(false);
        
        BTN_BER.setEnabled(true);
        CB_KODE.setEnabled(true);
        CB_TGL.setEnabled(true);
        bersih();
    }
    
    private void batalbaru() {
        BTN_Trs.setText("Transaksi Baru");
        BTN_SIM.setEnabled(false);
        tomboloff();
        
    }
    
    void tomboloff() {
        BTN_UB.setEnabled(false);
        BTN_UB.setEnabled(false);
        BTN_BER.setEnabled(false);
        BTN_CET.setEnabled(false);
        BTN_HAP.setEnabled(false);
        CB_KODE.setEnabled(false);
        CB_TGL.setEnabled(false);
        
    }
    
    void tombolon() {
        BTN_UB.setEnabled(true);
        BTN_UB.setEnabled(true);
        BTN_BER.setEnabled(true);
        BTN_CET.setEnabled(true);
        BTN_HAP.setEnabled(true);
        CB_KODE.setEnabled(true);
        CB_TGL.setEnabled(true);
    }
    
    void bersih() {
        JT_JUMLAHBELI.setText("");
        JT_HARGABARANG.setText("");
        JT_KODE.setText("");
        JT_TGL.setText("");
        JT_SUBTOTAL.setText("");
        JT_TRANSAKSI.setText("");
        JT_NAMABARANG.setText("");
        JT_Stok.setText("0");
    }
    
    void tampildata() {
        DefaultTableModel table = new DefaultTableModel();
        
        table.addColumn("teransaksi");
        table.addColumn("tanggal");
        table.addColumn("kodebarang");
        table.addColumn("namabarang");
        table.addColumn("stok");
        table.addColumn("harga");
        table.addColumn("jumlahbeli");
        table.addColumn("total");
        
        jTable1.setModel(table);
        
        try {
            koneksi kk = new koneksi();
            kk.koneksiDatabase();
            String querytampil = "select * from tbl_pembelian";
            
            ResultSet res = kk.state.executeQuery(querytampil);
            
            while (res.next()) {
                table.addRow(new Object[]{
                    res.getString("teransaksi"), res.getString("tanggal"), res.getString("kodebarang"), res.getString("namabarang"), res.getString("stok"), res.getString("harga"), res.getString("jumlahbeli"), res.getString("total")
                });
                jTable1.setModel(table);
            }
        } catch (SQLException e) {
            System.err.println("" + e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTN_BER = new javax.swing.JButton();
        BTN_UB = new javax.swing.JButton();
        BTN_SIM = new javax.swing.JButton();
        BTN_KEL = new javax.swing.JButton();
        BTN_HAP = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        BTN_Trs = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        JT_TGL = new javax.swing.JTextField();
        CB_TGL = new org.freixas.jcalendar.JCalendarCombo();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BTN_CET = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        JT_HARGABARANG = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        JT_JUMLAHBELI = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        JT_SUBTOTAL = new javax.swing.JTextField();
        JT_NAMABARANG = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JT_Stok = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JT_TRANSAKSI = new javax.swing.JTextField();
        CB_KODE = new javax.swing.JComboBox<>();
        JT_KODE = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form Pembelian");
        setBackground(new java.awt.Color(0, 153, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTN_BER.setText("Bersih");
        BTN_BER.setEnabled(false);
        BTN_BER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BERActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_BER, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 80, 30));

        BTN_UB.setText("Ubah");
        BTN_UB.setEnabled(false);
        BTN_UB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_UBActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_UB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 90, 30));

        BTN_SIM.setText("Simpan");
        BTN_SIM.setEnabled(false);
        BTN_SIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SIMActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_SIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 90, 30));

        BTN_KEL.setText("Keluar");
        BTN_KEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_KELActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_KEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, 100, 30));

        BTN_HAP.setText("Hapus");
        BTN_HAP.setEnabled(false);
        BTN_HAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_HAPActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_HAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 90, 30));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTN_Trs.setText("Transaksi Baru");
        BTN_Trs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_TrsActionPerformed(evt);
            }
        });
        jPanel1.add(BTN_Trs, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 130, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tgl.Transaksi");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("TRANSAKSI PEMBELIAN");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        JT_TGL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_TGLActionPerformed(evt);
            }
        });
        jPanel1.add(JT_TGL, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 130, 30));

        CB_TGL.setEnabled(false);
        CB_TGL.addDateListener(new org.freixas.jcalendar.DateListener() {
            public void dateChanged(org.freixas.jcalendar.DateEvent evt) {
                CB_TGLDateChanged(evt);
            }
        });
        CB_TGL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CB_TGLMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CB_TGLMousePressed(evt);
            }
        });
        CB_TGL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_TGLActionPerformed(evt);
            }
        });
        jPanel1.add(CB_TGL, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 40, 40, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 800, 160));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 260));

        BTN_CET.setText("CETAK");
        BTN_CET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CETActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_CET, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 90, 30));

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, -10, -1, 270));

        JT_HARGABARANG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_HARGABARANGActionPerformed(evt);
            }
        });
        jPanel3.add(JT_HARGABARANG, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 120, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Harga");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("jumlah beli");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));

        JT_JUMLAHBELI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JT_JUMLAHBELIKeyReleased(evt);
            }
        });
        jPanel3.add(JT_JUMLAHBELI, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 110, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Total");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 70, -1));

        JT_SUBTOTAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_SUBTOTALActionPerformed(evt);
            }
        });
        jPanel3.add(JT_SUBTOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 120, 30));
        jPanel3.add(JT_NAMABARANG, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 120, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nama Barang");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        JT_Stok.setEnabled(false);
        JT_Stok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_StokActionPerformed(evt);
            }
        });
        jPanel3.add(JT_Stok, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 100, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Stok");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Rp.");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, -1, -1));

        JT_TRANSAKSI.setEnabled(false);
        jPanel3.add(JT_TRANSAKSI, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 120, -1));

        CB_KODE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pilih kode barang", "1", "2", "3", "4", "5" }));
        CB_KODE.setFocusable(false);
        CB_KODE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_KODEActionPerformed(evt);
            }
        });
        jPanel3.add(CB_KODE, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 100, 30));
        jPanel3.add(JT_KODE, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 30, 30));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Kode barang");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("No.Transaksi");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 820, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_BERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BERActionPerformed
        // TODO add your handling code here:
        bersih();
    }//GEN-LAST:event_BTN_BERActionPerformed

    private void BTN_UBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_UBActionPerformed
        // TODO add your handling code here:
        String tanggal = JT_TGL.getText();
        String kodebarang = JT_KODE.getText();
        String namabarang = JT_NAMABARANG.getText();
        String stok = JT_Stok.getText();
        String harga = JT_HARGABARANG.getText();
        String jumlahbeli = JT_JUMLAHBELI.getText();
        String total = JT_SUBTOTAL.getText();
        
        try {
            String queryUpdate = "Update tbl_pembelian set "
                    + "tanggal = ('" + tanggal + "'), "
                    + "kodebarang = ('" + kodebarang + "'), "
                    + "namabarang  = ('" + namabarang + "'), "
                    + "stok  = ('" + stok + "'), "
                    + "harga = ('" + harga + "'), "
                    + "jumlahbeli = ('" + jumlahbeli + "') "
                    + "where total= ('" + total + "') ";
            koneksi cc = new koneksi();
            cc.koneksiDatabase();
            cc.state.executeUpdate(queryUpdate);
            
            JOptionPane.showMessageDialog(null, "Data Terupdate");
            tampildata();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Anda salah memasukan nilai");
        }
    }//GEN-LAST:event_BTN_UBActionPerformed

    private void BTN_SIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SIMActionPerformed
        // TODO add your handling code here:
        String tanggal = JT_TGL.getText();
        String kodebarang = JT_KODE.getText();
        String namabarang = JT_NAMABARANG.getText();
        String harga = JT_HARGABARANG.getText();
        String stok = JT_Stok.getText();
        String jumlahbeli = JT_JUMLAHBELI.getText();
        String total = JT_SUBTOTAL.getText();
        koneksi kk = new koneksi();
        kk.koneksiDatabase();
        try {
            String query = "insert into tbl_pembelian (tanggal, kodebarang, namabarang, stok, harga, jumlahbeli, total) Values "
                    + "('" + tanggal + "','" + kodebarang + "','" + namabarang + "','" + stok + "','" + harga + "','" + jumlahbeli + "','" + total + "')";
            kk.state.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
            kk.connect.close();
            tampildata();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Anda salah memasukan nilai");
        }
        tampildata();

    }//GEN-LAST:event_BTN_SIMActionPerformed

    private void BTN_KELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_KELActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BTN_KELActionPerformed

    private void BTN_HAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_HAPActionPerformed
        // TODO add your handling code here:
        try {
            int pilih = JOptionPane.showConfirmDialog(null, "Apakah anda ingin menghapus data ini ? ");
            if (pilih == JOptionPane.OK_OPTION) {
                
                String teransaksi = JT_TRANSAKSI.getText();
                String queryhapus
                        = "delete from tbl_pembelian where teransaksi =('" + teransaksi + "')";
                koneksi cc = new koneksi();
                cc.koneksiDatabase();
                cc.state.executeUpdate(queryhapus);
                JOptionPane.showMessageDialog(null, "Data Terhapus");
                tampildata();
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Anda salah memasukan nilai");
        }
    }//GEN-LAST:event_BTN_HAPActionPerformed

    private void CB_KODEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_KODEActionPerformed
        // TODO add your handling code here:
        if (CB_KODE.getSelectedItem().equals("Pilih Kode Barang")) {
            JT_KODE.setText("");
        } else if (CB_KODE.getSelectedItem().equals("1")) {
            JT_KODE.setText("1");
            JT_NAMABARANG.setText("Baju Kaos");
            JT_HARGABARANG.setText("65000");
            JT_Stok.setText("20");
        } else if (CB_KODE.getSelectedItem().equals("2")) {
            JT_KODE.setText("2");
            JT_NAMABARANG.setText(" Baju Kemeja");
            JT_Stok.setText("25");
            JT_HARGABARANG.setText("125000");
        } else if (CB_KODE.getSelectedItem().equals("3")) {
            JT_Stok.setText("250");
            JT_KODE.setText("3");
            JT_NAMABARANG.setText("Sweater");
            JT_HARGABARANG.setText("125000");
        } else if (CB_KODE.getSelectedItem().equals("4")) {
            JT_Stok.setText("90");
            JT_KODE.setText("4");
            JT_NAMABARANG.setText(" Jaket ");
            JT_HARGABARANG.setText("185000");
        } else if (CB_KODE.getSelectedItem().equals("5")) {
            JT_Stok.setText("100");
            JT_KODE.setText("5");
            JT_NAMABARANG.setText(" Topi");
            JT_HARGABARANG.setText("35000");
        }
    }//GEN-LAST:event_CB_KODEActionPerformed

    private void BTN_TrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_TrsActionPerformed
        // TODO add your handling code here:
        String logic = BTN_Trs.getText();
        if (logic.equals("Transaksi Baru")) {
            baru();
        } else {
            batalbaru();
        }
        bersih();
    }//GEN-LAST:event_BTN_TrsActionPerformed

    private void JT_TGLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_TGLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_TGLActionPerformed

    private void CB_TGLDateChanged(org.freixas.jcalendar.DateEvent evt) {//GEN-FIRST:event_CB_TGLDateChanged
        // TODO add your handling code here:
        String tampilan = "dd-MM-yyy";
        SimpleDateFormat format = new SimpleDateFormat(tampilan);
        String tanggal = String.valueOf(format.format(CB_TGL.getDate()));
        JT_TGL.setText(tanggal);
    }//GEN-LAST:event_CB_TGLDateChanged

    private void CB_TGLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CB_TGLMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_TGLMouseClicked

    private void CB_TGLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CB_TGLMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_TGLMousePressed

    private void CB_TGLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_TGLActionPerformed
        // TODO add your handling code here:
        String tampilan = "dd-MM-yyy";
        SimpleDateFormat format = new SimpleDateFormat(tampilan);
        String tanggal = String.valueOf(format.format(CB_TGL.getDate()));
        JT_TGL.setText(tanggal);
    }//GEN-LAST:event_CB_TGLActionPerformed

    private void JT_HARGABARANGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_HARGABARANGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_HARGABARANGActionPerformed

    private void JT_JUMLAHBELIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JT_JUMLAHBELIKeyReleased
        // TODO add your handling code here:

        try {
            int harga = Integer.parseInt(JT_HARGABARANG.getText().trim());
            int jumlah = Integer.parseInt(JT_JUMLAHBELI.getText().trim());
            int q = Integer.parseInt(JT_Stok.getText().trim());
            
            int total = harga * jumlah;
            int stok = q + jumlah;
            
            JT_SUBTOTAL.setText("" + total);
            JT_Stok.setText("" + stok);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Anda salah memasukan");
        }
    }//GEN-LAST:event_JT_JUMLAHBELIKeyReleased

    private void JT_SUBTOTALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_SUBTOTALActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_SUBTOTALActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        try {
            int baris = jTable1.getSelectedRow();//mengambil urutan baris dari table yang ada
            JT_TRANSAKSI.setText(jTable1.getValueAt(baris, 0).toString());
            JT_TGL.setText(jTable1.getValueAt(baris, 1).toString());
            JT_KODE.setText(jTable1.getValueAt(baris, 2).toString());
            JT_NAMABARANG.setText(jTable1.getValueAt(baris, 3).toString());
            JT_Stok.setText(jTable1.getValueAt(baris, 4).toString());
            JT_HARGABARANG.setText(jTable1.getValueAt(baris, 5).toString());
            JT_JUMLAHBELI.setText(jTable1.getValueAt(baris, 6).toString());
            JT_SUBTOTAL.setText(jTable1.getValueAt(baris, 7).toString());
            
            tombolon();
        } catch (Exception e) {
            System.err.println("Error : " + e);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void JT_StokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_StokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_StokActionPerformed

    private void BTN_CETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CETActionPerformed
        // TODO add your handling code here:
        CetakPembelian a = new CetakPembelian();
        a.setVisible(true);
    }//GEN-LAST:event_BTN_CETActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_BER;
    private javax.swing.JButton BTN_CET;
    private javax.swing.JButton BTN_HAP;
    private javax.swing.JButton BTN_KEL;
    private javax.swing.JButton BTN_SIM;
    private javax.swing.JButton BTN_Trs;
    private javax.swing.JButton BTN_UB;
    private javax.swing.JComboBox<String> CB_KODE;
    private org.freixas.jcalendar.JCalendarCombo CB_TGL;
    private javax.swing.JTextField JT_HARGABARANG;
    private javax.swing.JTextField JT_JUMLAHBELI;
    private javax.swing.JTextField JT_KODE;
    private javax.swing.JTextField JT_NAMABARANG;
    private javax.swing.JTextField JT_SUBTOTAL;
    private javax.swing.JTextField JT_Stok;
    private javax.swing.JTextField JT_TGL;
    private javax.swing.JTextField JT_TRANSAKSI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private Object lectedItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
