/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.cetak;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Mr.Al
 */
public class CetakPembelian extends javax.swing.JFrame {

    /**
     * Creates new form CetakPembellian
     */
    public CetakPembelian() {
        initComponents();
        tampildataPem();
        this.setResizable(false);
        
    }
    void tampildataPem() {
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

        JT_Kode = new javax.swing.JTextField();
        BTN_CET = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JT_Kode1 = new javax.swing.JTextField();
        BTN_CET1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        BTN_CET3 = new javax.swing.JButton();
        JT_Kode3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        BTN_CET2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        BTN_CET.setText("CETAK");
        BTN_CET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CETActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("KODE BARANG");

        jPanel2.setBackground(java.awt.Color.darkGray);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CETAK BERDASARKAN KODE BARANG");

        BTN_CET1.setText("CETAK");
        BTN_CET1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CET1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("KODE BARANG");

        jPanel3.setBackground(java.awt.Color.darkGray);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CETAK BERDASARKAN KODE BARANG");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form Cetak Pembelian");
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTN_CET3.setText("CETAK");
        BTN_CET3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CET3ActionPerformed(evt);
            }
        });
        jPanel6.add(BTN_CET3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 172, 40));
        jPanel6.add(JT_Kode3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 170, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("INPUT KODE BARANG :");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 460, 90));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CETAK SEMUA LAPORAN PEMBELIAN");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));

        jPanel7.setBackground(new java.awt.Color(0, 102, 102));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTN_CET2.setText("CETAK");
        BTN_CET2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CET2ActionPerformed(evt);
            }
        });
        jPanel7.add(BTN_CET2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 172, 40));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 210, 70));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 950, 240));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DATA PEMBELIAN");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 990, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CETAK BERDASARKAN KODE BARANG");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, -1, -1));

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_CETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CETActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_BTN_CETActionPerformed

    private void BTN_CET1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CET1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_CET1ActionPerformed

    private void BTN_CET3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CET3ActionPerformed
        // TODO add your handling code here:

        try {
            String NamaFile = "C:\\Users\\Mr.Al\\Documents\\NetBeansProjects\\glic\\TugasAkhir\\src\\laporan\\LaporanBele.jasper";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/db_tugas", "pma", "");
            HashMap param = new HashMap();

            param.put("kb", JT_Kode3.getText());
            File file = new File(NamaFile);

            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(file);
            JasperPrint JPrint = JasperFillManager.fillReport(jasperReport, param, koneksi);
            JasperViewer.viewReport(JPrint, false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
            System.out.println(ex);
        }
    }//GEN-LAST:event_BTN_CET3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jTable1MouseClicked

    private void BTN_CET2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CET2ActionPerformed
        // TODO add your handling code here:
        try {
            String NamaFile = "C:\\Users\\Mr.Al\\Documents\\NetBeansProjects\\glic\\TugasAkhir\\src\\laporan\\LapPembelian.jasper";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/db_tugas", "pma", "");
            HashMap param = new HashMap();
            JasperPrint JPrint = JasperFillManager.fillReport(NamaFile, param, koneksi);
            JasperViewer.viewReport(JPrint, false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
            System.out.println(ex);
        }
    }//GEN-LAST:event_BTN_CET2ActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_CET;
    private javax.swing.JButton BTN_CET1;
    private javax.swing.JButton BTN_CET2;
    private javax.swing.JButton BTN_CET3;
    private javax.swing.JTextField JT_Kode;
    private javax.swing.JTextField JT_Kode1;
    private javax.swing.JTextField JT_Kode3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
