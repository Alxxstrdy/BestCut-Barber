/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package apkbarber;

import config.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class Transaksi extends javax.swing.JPanel {
    
private final Connection conn;
private int dataPerHalaman = 10;
private int totalPages;
private int halamanSaatIni = 1;

    public Transaksi() {
        initComponents();
        conn = koneksi.getConnection();
        loadData();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMain = new javax.swing.JPanel();
        pnTransaksi = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabTrans = new Palette.JTable_Custom();
        cList = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lb_Halaman = new javax.swing.JLabel();
        bFirst = new Palette.Panel();
        jLabel2 = new javax.swing.JLabel();
        bLast = new Palette.Panel();
        jLabel3 = new javax.swing.JLabel();
        bBefore = new Palette.Panel();
        jLabel6 = new javax.swing.JLabel();
        bNext = new Palette.Panel();
        jLabel5 = new javax.swing.JLabel();
        pnDetail = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabDetail = new Palette.JTable_Custom();
        vTgltran = new javax.swing.JLabel();
        vNotran = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        vTotal = new javax.swing.JLabel();
        vKasir = new javax.swing.JLabel();
        bKembali = new Palette.Panel();
        jLabel7 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        pnMain.setLayout(new java.awt.CardLayout());

        pnTransaksi.setBackground(new java.awt.Color(255, 255, 255));

        tabTrans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Transaksi", "Tanggal", "Total "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabTrans.setRowHeight(20);
        tabTrans.setShowVerticalLines(true);
        tabTrans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabTransMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tabTrans);

        cList.setFont(new java.awt.Font("NEXT ART", 0, 12)); // NOI18N
        cList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua", "Hari ini", "Kemarin", "Bulan ini", "Bulan lalu" }));
        cList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cListActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("NEXT ART", 1, 14)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transaksi1.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("NEXT ART", 1, 14)); // NOI18N
        jLabel16.setText("LIST TRANSAKSI");

        lb_Halaman.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Halaman.setText("Halaman of Total Halaman");

        bFirst.setBackground(new java.awt.Color(2, 131, 145));
        bFirst.setRoundBottomLeft(10);
        bFirst.setRoundBottomRight(10);
        bFirst.setRoundTopLeft(10);
        bFirst.setRoundTopRight(10);
        bFirst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bFirstMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("NEXT ART", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("FIRST PAGE");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout bFirstLayout = new javax.swing.GroupLayout(bFirst);
        bFirst.setLayout(bFirstLayout);
        bFirstLayout.setHorizontalGroup(
            bFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bFirstLayout.setVerticalGroup(
            bFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        bLast.setBackground(new java.awt.Color(2, 131, 145));
        bLast.setRoundBottomLeft(10);
        bLast.setRoundBottomRight(10);
        bLast.setRoundTopLeft(10);
        bLast.setRoundTopRight(10);
        bLast.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bLastMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("NEXT ART", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LAST PAGE");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout bLastLayout = new javax.swing.GroupLayout(bLast);
        bLast.setLayout(bLastLayout);
        bLastLayout.setHorizontalGroup(
            bLastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bLastLayout.setVerticalGroup(
            bLastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        bBefore.setBackground(new java.awt.Color(2, 131, 145));
        bBefore.setRoundBottomLeft(10);
        bBefore.setRoundBottomRight(10);
        bBefore.setRoundTopLeft(10);
        bBefore.setRoundTopRight(10);
        bBefore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bBeforeMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("NEXT ART", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("<");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout bBeforeLayout = new javax.swing.GroupLayout(bBefore);
        bBefore.setLayout(bBeforeLayout);
        bBeforeLayout.setHorizontalGroup(
            bBeforeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bBeforeLayout.setVerticalGroup(
            bBeforeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        bNext.setBackground(new java.awt.Color(2, 131, 145));
        bNext.setRoundBottomLeft(10);
        bNext.setRoundBottomRight(10);
        bNext.setRoundTopLeft(10);
        bNext.setRoundTopRight(10);
        bNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bNextMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("NEXT ART", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(">");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout bNextLayout = new javax.swing.GroupLayout(bNext);
        bNext.setLayout(bNextLayout);
        bNextLayout.setHorizontalGroup(
            bNextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bNextLayout.setVerticalGroup(
            bNextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnTransaksiLayout = new javax.swing.GroupLayout(pnTransaksi);
        pnTransaksi.setLayout(pnTransaksiLayout);
        pnTransaksiLayout.setHorizontalGroup(
            pnTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTransaksiLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTransaksiLayout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(20, 20, 20))
                    .addGroup(pnTransaksiLayout.createSequentialGroup()
                        .addGroup(pnTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cList, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnTransaksiLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTransaksiLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addGroup(pnTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_Halaman, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addGroup(pnTransaksiLayout.createSequentialGroup()
                        .addComponent(bFirst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bBefore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(bNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(bLast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(250, 250, 250))
        );
        pnTransaksiLayout.setVerticalGroup(
            pnTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTransaksiLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(cList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(lb_Halaman, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bNext, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBefore, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bFirst, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bLast, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pnMain.add(pnTransaksi, "card3");

        pnDetail.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("DETAIL TRANSAKSI");

        tabDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID ", "Nama", "Harga", "Qty", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabDetail.setRowHeight(20);
        tabDetail.setShowVerticalLines(true);
        tabDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabDetailMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(tabDetail);

        vTgltran.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        vTgltran.setText("jLabel1");

        vNotran.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        vNotran.setText("jLabel1");

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel1.setText("TOTAL :");

        vTotal.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        vTotal.setText("TOTAL");

        vKasir.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        vKasir.setText("jLabel3");

        bKembali.setBackground(new java.awt.Color(2, 131, 145));
        bKembali.setRoundBottomLeft(15);
        bKembali.setRoundBottomRight(15);
        bKembali.setRoundTopLeft(15);
        bKembali.setRoundTopRight(15);
        bKembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bKembaliMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("NEXT ART", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("<- KEMBALI");

        javax.swing.GroupLayout bKembaliLayout = new javax.swing.GroupLayout(bKembali);
        bKembali.setLayout(bKembaliLayout);
        bKembaliLayout.setHorizontalGroup(
            bKembaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        bKembaliLayout.setVerticalGroup(
            bKembaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnDetailLayout = new javax.swing.GroupLayout(pnDetail);
        pnDetail.setLayout(pnDetailLayout);
        pnDetailLayout.setHorizontalGroup(
            pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDetailLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDetailLayout.createSequentialGroup()
                        .addComponent(bKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnDetailLayout.createSequentialGroup()
                        .addGroup(pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
                            .addGroup(pnDetailLayout.createSequentialGroup()
                                .addGroup(pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(vTgltran, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                        .addComponent(vNotran, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(vKasir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(pnDetailLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(vTotal)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(20, 20, 20))))
        );
        pnDetailLayout.setVerticalGroup(
            pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDetailLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vTgltran)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vNotran)
                .addGap(54, 54, 54)
                .addComponent(vKasir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(vTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(bKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pnMain.add(pnDetail, "card4");

        add(pnMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void tabDetailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabDetailMousePressed

    }//GEN-LAST:event_tabDetailMousePressed

    private void tabTransMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabTransMousePressed
        pnMain.removeAll();
        pnMain.add(pnDetail);
        pnMain.repaint();
        pnMain.revalidate();  
        
        int row = tabTrans.getSelectedRow();
        String id = tabTrans.getValueAt(row, 0).toString();
        getDataDetail((DefaultTableModel) tabDetail.getModel(), id);
    }//GEN-LAST:event_tabTransMousePressed

    private void bFirstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bFirstMouseClicked
        halamanSaatIni = 1;

        loadData();
    }//GEN-LAST:event_bFirstMouseClicked

    private void bLastMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bLastMouseClicked
        halamanSaatIni = totalPages;

        loadData();
    }//GEN-LAST:event_bLastMouseClicked

    private void bBeforeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bBeforeMouseClicked
        if (halamanSaatIni > 1) {
            halamanSaatIni--;

            loadData();
}
      
    }//GEN-LAST:event_bBeforeMouseClicked

    private void bNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bNextMouseClicked
        if (halamanSaatIni < totalPages) {
            halamanSaatIni++;

            loadData();
            }
    }//GEN-LAST:event_bNextMouseClicked

    private void bKembaliMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bKembaliMousePressed
        pnMain.removeAll();
        pnMain.add(pnTransaksi);
        pnMain.repaint();
        pnMain.revalidate();  
        
    }//GEN-LAST:event_bKembaliMousePressed

    private void cListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cListActionPerformed
        loadData();
    }//GEN-LAST:event_cListActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Palette.Panel bBefore;
    private Palette.Panel bFirst;
    private Palette.Panel bKembali;
    private Palette.Panel bLast;
    private Palette.Panel bNext;
    private javax.swing.JComboBox<String> cList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lb_Halaman;
    private javax.swing.JPanel pnDetail;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnTransaksi;
    private Palette.JTable_Custom tabDetail;
    private Palette.JTable_Custom tabTrans;
    private javax.swing.JLabel vKasir;
    private javax.swing.JLabel vNotran;
    private javax.swing.JLabel vTgltran;
    private javax.swing.JLabel vTotal;
    // End of variables declaration//GEN-END:variables
   private void setTabelModel() {
        DefaultTableModel model = (DefaultTableModel) tabTrans.getModel();
    }
   
   private int getTotalData() {

        int totalData = 0;

        try {
            String sql = "SELECT COUNT(*) AS total FROM transaksi";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    totalData = rs.getInt("total");
                }
            }

        } catch (Exception e) {
            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, e);
        }

        return totalData;

    }
   
       private void calculateTotalPages() {
        int totalData = getTotalData();
        totalPages = (int) Math.ceil((double) totalData / dataPerHalaman);
    }
       
    private void loadData() {
      int totalData = getTotalData();
      lb_Halaman.setText(String.valueOf("Halaman" + halamanSaatIni + " dari Total Data " + totalData));

      int startIndex = (halamanSaatIni - 1) * dataPerHalaman;
      getData(startIndex, dataPerHalaman, (DefaultTableModel) tabTrans.getModel());
    }
    
    private void getData(int startIndex, int entriespPage, DefaultTableModel model) {
        model.setRowCount(0);
        
        
        if(cList.getSelectedItem().equals("Semua")){
            try {
            String sql = "SELECT id_transaksi, tgl_transaksi, total_harga FROM transaksi ORDER BY id_transaksi DESC LIMIT ?,?";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                st.setInt(1,startIndex);
                st.setInt(2, entriespPage);
                
                ResultSet rs = st.executeQuery();
                
                while (rs.next()){
                    String id = rs.getString("id_transaksi");
                    String tgl = rs.getString("tgl_transaksi");
                    int total = rs.getInt("total_harga");
                            
                    Object[] rowdata = {id, tgl, total};
                    model.addRow(rowdata);
                    
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, e);
        }
        } else if(cList.getSelectedItem().equals("Hari ini")){
            try {
            String sql = "SELECT id_transaksi, tgl_transaksi, total_harga FROM transaksi WHERE DATE(tgl_transaksi) = CURDATE() ORDER BY id_transaksi DESC LIMIT ?,?";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                st.setInt(1,startIndex);
                st.setInt(2, entriespPage);
                
                ResultSet rs = st.executeQuery();
                
                while (rs.next()){
                    String id = rs.getString("id_transaksi");
                    String tgl = rs.getString("tgl_transaksi");
                    int total = rs.getInt("total_harga");
                            
                    Object[] rowdata = {id, tgl, total};
                    model.addRow(rowdata);
                    
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, e);
        }
        } else if(cList.getSelectedItem().equals("Kemarin")){
            try {
            String sql = "SELECT id_transaksi, tgl_transaksi, total_harga FROM transaksi WHERE DATE(tgl_transaksi) = CURDATE() - INTERVAL 1 DAY ORDER BY id_transaksi DESC LIMIT ?,?";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                st.setInt(1,startIndex);
                st.setInt(2, entriespPage);
                
                ResultSet rs = st.executeQuery();
                
                while (rs.next()){
                    String id = rs.getString("id_transaksi");
                    String tgl = rs.getString("tgl_transaksi");
                    int total = rs.getInt("total_harga");
                            
                    Object[] rowdata = {id, tgl, total};
                    model.addRow(rowdata);
                    
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, e);
        }
        } else if(cList.getSelectedItem().equals("Bulan ini")){
            try {
            String sql = "SELECT id_transaksi, tgl_transaksi, total_harga FROM transaksi WHERE YEAR(tgl_transaksi) = YEAR(CURDATE()) AND MONTH(tgl_transaksi) = MONTH(CURDATE()) ORDER BY id_transaksi DESC LIMIT ?,?";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                st.setInt(1,startIndex);
                st.setInt(2, entriespPage);
                
                ResultSet rs = st.executeQuery();
                
                while (rs.next()){
                    String id = rs.getString("id_transaksi");
                    String tgl = rs.getString("tgl_transaksi");
                    int total = rs.getInt("total_harga");
                            
                    Object[] rowdata = {id, tgl, total};
                    model.addRow(rowdata);
                    
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, e);
        }
        } else if (cList.getSelectedItem().equals("Bulan lalu")){
            try {
            String sql = "SELECT id_transaksi, tgl_transaksi, total_harga FROM transaksi WHERE YEAR(tgl_transaksi) = YEAR(CURDATE() - INTERVAL 1 MONTH) AND MONTH(tgl_transaksi) = MONTH(CURDATE() - INTERVAL 1 MONTH)  ORDER BY id_transaksi DESC LIMIT ?,?";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                st.setInt(1,startIndex);
                st.setInt(2, entriespPage);
                
                ResultSet rs = st.executeQuery();
                
                while (rs.next()){
                    String id = rs.getString("id_transaksi");
                    String tgl = rs.getString("tgl_transaksi");
                    int total = rs.getInt("total_harga");
                            
                    Object[] rowdata = {id, tgl, total};
                    model.addRow(rowdata);
                    
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, e);
        }
        }
        
    }
    
       private void setTabelDetail() {
        DefaultTableModel model = (DefaultTableModel) tabDetail.getModel();
    }

    
    public void getDataDetail(DefaultTableModel model, String id) {
        model.setRowCount(0);
        
       
        try {
            String sql = "SELECT dt.id_transaksi, t.tgl_transaksi, t.waktu_transaksi, t.total_harga, dt.id_barjas, bj.nama_barjas, bj.harga, dt.subtotal, dt.qty, u.username\n" +
                         "FROM detail_transaksi dt\n" +
                         "JOIN transaksi t ON dt.id_transaksi = t.id_transaksi\n" +
                         "JOIN barang_jasa bj ON dt.id_barjas = bj.id_barjas\n" +
                         "JOIN user u ON t.id_user = u.id_user\n" +
                         "WHERE dt.id_transaksi = '"+id+"'\n";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                
                ResultSet rs = st.executeQuery();
                while (rs.next()){
                    String idt = rs.getString("dt.id_transaksi");
                    String tgl = rs.getString("tgl_transaksi");
                    String waktu = rs.getString("t.waktu_transaksi");
                    String total = rs.getString("total_harga");
                    String idb = rs.getString("dt.id_barjas");
                    String nama = rs.getString("bj.nama_barjas");
                    String harga = rs.getString("bj.harga");
                    String subtotal = rs.getString("dt.subtotal");
                    String qty = rs.getString("dt.qty");
                    String idu = rs.getString("u.username");
                            
                    Object[] rowdata = {idb, nama, harga, qty, subtotal};
                    model.addRow(rowdata);
                    
                    vTgltran.setText("Tanggal dan Waktu Transaksi : " + tgl+"  "+waktu);
                    vNotran.setText("No Transaksi :" + idt);
                    vTotal.setText(total);
                    vKasir.setText(idu);
                    
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }
}
