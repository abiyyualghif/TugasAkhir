/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.cetak;

import java.io.File;
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
public class CetakPenjualan extends javax.swing.JFrame {

    /**
     * Creates new form CetakPenjualan
     */
    public CetakPenjualan() {
        initComponents();
tampilDataPen();
this.setResizable(false);
    }
 void tampilDataPen() {
        DefaultTableModel table = new DefaultTableModel();

        table.addColumn("teransaksi");
        table.addColumn("tanggal");
        table.addColumn("kodebarang");
        table.addColumn("namabarang");
        table.addColumn("harga");
        table.addColumn("jumlahbeli");
        table.addColumn("total");
        table.addColumn("bayar");
        table.addColumn("kembalian");

        jTable1.setModel(table);

        try {
            koneksi kk = new koneksi();
            kk.koneksiDatabase();
            String querytampil = "select * from tbl_penjualan";

            ResultSet res = kk.state.executeQuery(querytampil);

            while (res.next()) {
                table.addRow(new Object[]{
                    res.getString("teransaksi"), res.getString("tanggal"), res.getString("kodebarang"), res.getString("namabarang"), res.getString("harga"), res.getString("jumlahbeli"), res.getString("total"), res.getString("bayar"), res.getString("kembalian")
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
     * regenerat try{ String NamaFile = "./src/laporan/reportPenjualan.jasper";
     * ed by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        BTN_CET2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        BTN_CET = new javax.swing.JButton();
        JT_Kode = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form Cetak Penjualan");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 880, 210));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DATA PENJUALAN");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 930, -1));

        jPanel3.setBackground(java.awt.Color.darkGray);
        jPanel3.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.setToolTipText("");
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTN_CET2.setText("CETAK");
        BTN_CET2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CET2ActionPerformed(evt);
            }
        });
        jPanel3.add(BTN_CET2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 172, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 240, 80));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CETAK SEMUA LAPORAN PENJUALAN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CETAK BERDASARKAN KODE BARANG");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, -1, -1));

        jPanel2.setBackground(java.awt.Color.darkGray);
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.setToolTipText("");
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("INPUT KODE BARANG :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        BTN_CET.setText("CETAK");
        BTN_CET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CETActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_CET, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 172, 40));
        jPanel2.add(JT_Kode, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 170, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 440, 110));

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_CETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CETActionPerformed
        // TODO add your handling code here:

        try {
            String NamaFile = "C:\\Users\\Mr.Al\\Documents\\NetBeansProjects\\glic\\TugasAkhir\\src\\laporan\\BrgJual.jasper";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/db_tugas", "pma", "");
            HashMap param = new HashMap();

            param.put("tgl", JT_Kode.getText());
            File file = new File(NamaFile);
            
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(file);
            JasperPrint JPrint = JasperFillManager.fillReport(jasperReport, param, koneksi);
            JasperViewer.viewReport(JPrint, false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
            System.out.println(ex);
        }
    }//GEN-LAST:event_BTN_CETActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_formWindowClosed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jTable1MouseClicked

    private void BTN_CET2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CET2ActionPerformed
        // TODO add your handling code here:
         try {
            String NamaFile = "C:\\Users\\Mr.Al\\Documents\\NetBeansProjects\\glic\\TugasAkhir\\src\\laporan\\LapPenjualan.jasper";
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
    private javax.swing.JButton BTN_CET2;
    private javax.swing.JTextField JT_Kode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
