/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package apkbarber;

import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author Alxxstrdy
 */
public class Kasir extends javax.swing.JPanel {

    /**
     * Creates new form Kasir
     */
    private int total = 0;
    public Kasir() {
        initComponents();
        Barber();
    }
    public void Barber(){
        disHarga.setText("============BARBER============"+ "\n" + "\n" + "===============================" + "\n");
       }
    public void reset(){
        vTotal.setText("Rp.0");
        qtyCuker.setValue(1);
        qtyCukum.setValue(1);
        qtyCukur.setValue(1);
        total = 0;
        disHarga.setText("============BARBER============"+ "\n" + "\n" + "===============================" + "\n");
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
        jPanel2 = new javax.swing.JPanel();
        disHarga = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        vTotal = new javax.swing.JLabel();
        bTotal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bReset = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bCetak = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        bCukur = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cukur = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        qtyCukur = new javax.swing.JSpinner();
        qtyCuker = new javax.swing.JSpinner();
        bCuker = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cuker = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bCukum = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cukum = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        qtyCukum = new javax.swing.JSpinner();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(223, 230, 233));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        disHarga.setColumns(20);
        disHarga.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        disHarga.setRows(5);
        disHarga.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        vTotal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        vTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vTotal.setText("Rp.0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        bTotal.setBackground(new java.awt.Color(51, 255, 51));
        bTotal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bTotalMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TOTAL");

        javax.swing.GroupLayout bTotalLayout = new javax.swing.GroupLayout(bTotal);
        bTotal.setLayout(bTotalLayout);
        bTotalLayout.setHorizontalGroup(
            bTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );
        bTotalLayout.setVerticalGroup(
            bTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        bReset.setBackground(new java.awt.Color(255, 0, 0));
        bReset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bResetMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RESET");

        javax.swing.GroupLayout bResetLayout = new javax.swing.GroupLayout(bReset);
        bReset.setLayout(bResetLayout);
        bResetLayout.setHorizontalGroup(
            bResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );
        bResetLayout.setVerticalGroup(
            bResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        bCetak.setBackground(new java.awt.Color(153, 0, 153));
        bCetak.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bCetak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bCetakMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CETAK");

        javax.swing.GroupLayout bCetakLayout = new javax.swing.GroupLayout(bCetak);
        bCetak.setLayout(bCetakLayout);
        bCetakLayout.setHorizontalGroup(
            bCetakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );
        bCetakLayout.setVerticalGroup(
            bCetakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(disHarga, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bCetak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(13, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(disHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCetak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bCukur.setBackground(new java.awt.Color(255, 255, 255));
        bCukur.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bCukur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bCukurMouseClicked(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/scisors.png"))); // NOI18N

        cukur.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cukur.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cukur.setText("CUKUR");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("25.000");

        javax.swing.GroupLayout bCukurLayout = new javax.swing.GroupLayout(bCukur);
        bCukur.setLayout(bCukurLayout);
        bCukurLayout.setHorizontalGroup(
            bCukurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cukur, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bCukurLayout.setVerticalGroup(
            bCukurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bCukurLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cukur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        qtyCukur.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        qtyCukur.setEditor(new javax.swing.JSpinner.NumberEditor(qtyCukur, ""));

        qtyCuker.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        qtyCuker.setEditor(new javax.swing.JSpinner.NumberEditor(qtyCuker, ""));

        bCuker.setBackground(new java.awt.Color(255, 255, 255));
        bCuker.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bCuker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bCukerMouseClicked(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/scisors.png"))); // NOI18N

        cuker.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        cuker.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuker.setText("CUKUR & KERAMAS");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("30.000");

        javax.swing.GroupLayout bCukerLayout = new javax.swing.GroupLayout(bCuker);
        bCuker.setLayout(bCukerLayout);
        bCukerLayout.setHorizontalGroup(
            bCukerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cuker, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bCukerLayout.setVerticalGroup(
            bCukerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bCukerLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cuker)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );

        bCukum.setBackground(new java.awt.Color(255, 255, 255));
        bCukum.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bCukum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bCukumMouseClicked(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/mustache-curled-tip-variant.png"))); // NOI18N

        cukum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cukum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cukum.setText("KUMIS");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("5.000");

        javax.swing.GroupLayout bCukumLayout = new javax.swing.GroupLayout(bCukum);
        bCukum.setLayout(bCukumLayout);
        bCukumLayout.setHorizontalGroup(
            bCukumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cukum, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bCukumLayout.setVerticalGroup(
            bCukumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bCukumLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cukum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8))
        );

        qtyCukum.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        qtyCukum.setEditor(new javax.swing.JSpinner.NumberEditor(qtyCukum, ""));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(bCuker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(qtyCukum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(bCukur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(bCukum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(qtyCukur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(qtyCuker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 189, Short.MAX_VALUE)))
                .addGap(152, 152, 152))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(bCukur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qtyCukur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(bCuker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qtyCuker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(bCukum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qtyCukum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(784, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bCukurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCukurMouseClicked
        int qty = Integer.parseInt(qtyCukur.getValue().toString());
        int harga = qty*25000;
        total +=harga;
        disHarga.setText(disHarga.getText()+cukur.getText()+"\t"+harga+"\n");
    }//GEN-LAST:event_bCukurMouseClicked

    private void bCukerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCukerMouseClicked
        int qty = Integer.parseInt(qtyCuker.getValue().toString());
        int harga = qty*30000;
        total +=harga;
        disHarga.setText(disHarga.getText()+cuker.getText()+"\t"+harga+"\n");
    }//GEN-LAST:event_bCukerMouseClicked

    private void bCukumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCukumMouseClicked
        int qty = Integer.parseInt(qtyCukum.getValue().toString());
        int harga = qty*5000;
        total +=harga;
        disHarga.setText(disHarga.getText()+cukum.getText()+"\t"+harga+"\n");
    }//GEN-LAST:event_bCukumMouseClicked

    private void bTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bTotalMouseClicked
        disHarga.setText(disHarga.getText()
                +"\n===============================\n"
                +"\n"+"TOTAL = "+total);        
                
        vTotal.setText(String.format("Rp." + total));
    }//GEN-LAST:event_bTotalMouseClicked

    private void bResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bResetMouseClicked
        reset();
    }//GEN-LAST:event_bResetMouseClicked

    private void bCetakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCetakMouseClicked
        try {
            disHarga.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Kasir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bCetakMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bCetak;
    private javax.swing.JPanel bCuker;
    private javax.swing.JPanel bCukum;
    private javax.swing.JPanel bCukur;
    private javax.swing.JPanel bReset;
    private javax.swing.JPanel bTotal;
    private javax.swing.JLabel cuker;
    private javax.swing.JLabel cukum;
    private javax.swing.JLabel cukur;
    private javax.swing.JTextArea disHarga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner qtyCuker;
    private javax.swing.JSpinner qtyCukum;
    private javax.swing.JSpinner qtyCukur;
    private javax.swing.JLabel vTotal;
    // End of variables declaration//GEN-END:variables
}
