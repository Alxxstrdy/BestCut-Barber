/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package apkbarber;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import javax.swing.UIManager;

/**
 *
 * @author Alxxstrdy
 */
public class MenuUtama extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
        initComponents();
        wkt();
        showHome();
    }

        Timer t ;
        SimpleDateFormat st; 
         
    public void wkt(){

        t = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            Date dt = new Date();
            st = new SimpleDateFormat("HH:mm:ss" + " " + " " + "dd-MM-yyyy");
            String tt = st.format(dt);
            lJam.setText(tt);   
            
            }
        });
        
        t.start();
        
    }
    
    public void showHome(){
        pnKonten.removeAll();
        pnKonten.add(new Menu());
        pnKonten.repaint();
        pnKonten.revalidate();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnBelakang = new javax.swing.JPanel();
        pnSamping = new Palette.Panel();
        home = new Palette.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        list = new Palette.Panel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        reservasi = new Palette.Panel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kasir = new Palette.Panel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        transaksi = new Palette.Panel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        report = new Palette.Panel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Logout = new Palette.Panel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pnAtas = new javax.swing.JPanel();
        lJam = new javax.swing.JLabel();
        pnKonten = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/icon/Barbericn.png")).getImage());

        pnBelakang.setBackground(new java.awt.Color(255, 255, 255));
        pnBelakang.setPreferredSize(new java.awt.Dimension(971, 650));

        pnSamping.setBackground(new java.awt.Color(2, 131, 145));

        home.setBackground(new java.awt.Color(2, 131, 145));
        home.setRoundBottomLeft(20);
        home.setRoundBottomRight(20);
        home.setRoundTopLeft(20);
        home.setRoundTopRight(20);
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homeMousePressed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(2, 131, 145));
        jLabel2.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("HOME");

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        list.setBackground(new java.awt.Color(2, 131, 145));
        list.setRoundBottomLeft(20);
        list.setRoundBottomRight(20);
        list.setRoundTopLeft(20);
        list.setRoundTopRight(20);
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listMousePressed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/List.png"))); // NOI18N

        jLabel4.setBackground(new java.awt.Color(2, 131, 145));
        jLabel4.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("LIST");

        javax.swing.GroupLayout listLayout = new javax.swing.GroupLayout(list);
        list.setLayout(listLayout);
        listLayout.setHorizontalGroup(
            listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
        );
        listLayout.setVerticalGroup(
            listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        reservasi.setBackground(new java.awt.Color(2, 131, 145));
        reservasi.setRoundBottomLeft(20);
        reservasi.setRoundBottomRight(20);
        reservasi.setRoundTopLeft(20);
        reservasi.setRoundTopRight(20);
        reservasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reservasiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reservasiMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                reservasiMousePressed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Reservasi.png"))); // NOI18N

        jLabel6.setBackground(new java.awt.Color(2, 131, 145));
        jLabel6.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("RESERVASI");

        javax.swing.GroupLayout reservasiLayout = new javax.swing.GroupLayout(reservasi);
        reservasi.setLayout(reservasiLayout);
        reservasiLayout.setHorizontalGroup(
            reservasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reservasiLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
        );
        reservasiLayout.setVerticalGroup(
            reservasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reservasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kasir.setBackground(new java.awt.Color(2, 131, 145));
        kasir.setRoundBottomLeft(20);
        kasir.setRoundBottomRight(20);
        kasir.setRoundTopLeft(20);
        kasir.setRoundTopRight(20);
        kasir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kasirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kasirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kasirMousePressed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Kasir.png"))); // NOI18N

        jLabel8.setBackground(new java.awt.Color(2, 131, 145));
        jLabel8.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("KASIR");

        javax.swing.GroupLayout kasirLayout = new javax.swing.GroupLayout(kasir);
        kasir.setLayout(kasirLayout);
        kasirLayout.setHorizontalGroup(
            kasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kasirLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
        );
        kasirLayout.setVerticalGroup(
            kasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        transaksi.setBackground(new java.awt.Color(2, 131, 145));
        transaksi.setRoundBottomLeft(20);
        transaksi.setRoundBottomRight(20);
        transaksi.setRoundTopLeft(20);
        transaksi.setRoundTopRight(20);
        transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                transaksiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                transaksiMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                transaksiMousePressed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home.png"))); // NOI18N

        jLabel10.setBackground(new java.awt.Color(2, 131, 145));
        jLabel10.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("TRANSAKSI");

        javax.swing.GroupLayout transaksiLayout = new javax.swing.GroupLayout(transaksi);
        transaksi.setLayout(transaksiLayout);
        transaksiLayout.setHorizontalGroup(
            transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transaksiLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
        );
        transaksiLayout.setVerticalGroup(
            transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        report.setBackground(new java.awt.Color(2, 131, 145));
        report.setRoundBottomLeft(20);
        report.setRoundBottomRight(20);
        report.setRoundTopLeft(20);
        report.setRoundTopRight(20);
        report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                reportMousePressed(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Report_1.png"))); // NOI18N

        jLabel12.setBackground(new java.awt.Color(2, 131, 145));
        jLabel12.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("REPORT");

        javax.swing.GroupLayout reportLayout = new javax.swing.GroupLayout(report);
        report.setLayout(reportLayout);
        reportLayout.setHorizontalGroup(
            reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportLayout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
        );
        reportLayout.setVerticalGroup(
            reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Logout.setBackground(new java.awt.Color(2, 131, 145));
        Logout.setRoundBottomLeft(20);
        Logout.setRoundBottomRight(20);
        Logout.setRoundTopLeft(20);
        Logout.setRoundTopRight(20);
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoutMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LogoutMousePressed(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/LogOut.png"))); // NOI18N

        jLabel14.setBackground(new java.awt.Color(2, 131, 145));
        jLabel14.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("LOGOUT");

        javax.swing.GroupLayout LogoutLayout = new javax.swing.GroupLayout(Logout);
        Logout.setLayout(LogoutLayout);
        LogoutLayout.setHorizontalGroup(
            LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoutLayout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
        );
        LogoutLayout.setVerticalGroup(
            LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnSampingLayout = new javax.swing.GroupLayout(pnSamping);
        pnSamping.setLayout(pnSampingLayout);
        pnSampingLayout.setHorizontalGroup(
            pnSampingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSampingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnSampingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(list, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reservasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kasir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(report, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnSampingLayout.setVerticalGroup(
            pnSampingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSampingLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(list, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(reservasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(kasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(report, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnAtas.setBackground(new java.awt.Color(238, 238, 239));
        pnAtas.setPreferredSize(new java.awt.Dimension(754, 62));

        lJam.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        lJam.setText("jLabel1");

        javax.swing.GroupLayout pnAtasLayout = new javax.swing.GroupLayout(pnAtas);
        pnAtas.setLayout(pnAtasLayout);
        pnAtasLayout.setHorizontalGroup(
            pnAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAtasLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lJam)
                .addContainerGap(691, Short.MAX_VALUE))
        );
        pnAtasLayout.setVerticalGroup(
            pnAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAtasLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lJam)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pnKonten.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout pnBelakangLayout = new javax.swing.GroupLayout(pnBelakang);
        pnBelakang.setLayout(pnBelakangLayout);
        pnBelakangLayout.setHorizontalGroup(
            pnBelakangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBelakangLayout.createSequentialGroup()
                .addComponent(pnSamping, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnBelakangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnBelakangLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(pnKonten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addComponent(pnAtas, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)))
        );
        pnBelakangLayout.setVerticalGroup(
            pnBelakangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnSamping, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnBelakangLayout.createSequentialGroup()
                .addComponent(pnAtas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnKonten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        getContentPane().add(pnBelakang, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMousePressed
        home.setBackground(new Color (3,176,195));
        
        pnKonten.removeAll();
        pnKonten.add(new Menu());
        pnKonten.repaint();
        pnKonten.revalidate();
    }//GEN-LAST:event_homeMousePressed

    private void listMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMousePressed
        list.setBackground(new Color(3,176,195));
        
        pnKonten.removeAll();
        pnKonten.add(new PriceList());
        pnKonten.repaint();
        pnKonten.revalidate();
    }//GEN-LAST:event_listMousePressed

    private void reservasiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservasiMousePressed
        reservasi.setBackground(new Color(3,176,195));
        
        pnKonten.removeAll();
        pnKonten.add(new Reservasi());
        pnKonten.repaint();
        pnKonten.revalidate();
    }//GEN-LAST:event_reservasiMousePressed

    private void kasirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kasirMousePressed
        kasir.setBackground(new Color(3,176,195));
        
        pnKonten.removeAll();
        pnKonten.add(new Kasir());
        pnKonten.repaint();
        pnKonten.revalidate();
    }//GEN-LAST:event_kasirMousePressed

    private void transaksiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transaksiMousePressed
        transaksi.setBackground(new Color(3,176,195));
        
        pnKonten.removeAll();
        pnKonten.add(new PriceList());
        pnKonten.repaint();
        pnKonten.revalidate();
    }//GEN-LAST:event_transaksiMousePressed

    private void LogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMousePressed
        list.setBackground(new Color(3,176,195));
        
        new Loginsite().setVisible(true);    
        dispose();
   
    }//GEN-LAST:event_LogoutMousePressed

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
        home.setBackground(new Color (4,221,245));
    }//GEN-LAST:event_homeMouseEntered

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
        home.setBackground(new Color (2,131,145));
    }//GEN-LAST:event_homeMouseExited

    private void listMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseEntered
        list.setBackground(new Color (4,221,245));
    }//GEN-LAST:event_listMouseEntered

    private void listMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseExited
        list.setBackground(new Color (2,131,145));
    }//GEN-LAST:event_listMouseExited

    private void reservasiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservasiMouseEntered
        reservasi.setBackground(new Color (4,221,245));
    }//GEN-LAST:event_reservasiMouseEntered

    private void reservasiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservasiMouseExited
        reservasi.setBackground(new Color (2,131,145));
    }//GEN-LAST:event_reservasiMouseExited

    private void kasirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kasirMouseEntered
        kasir.setBackground(new Color (4,221,245));
    }//GEN-LAST:event_kasirMouseEntered

    private void kasirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kasirMouseExited
        kasir.setBackground(new Color (2,131,145));
    }//GEN-LAST:event_kasirMouseExited

    private void transaksiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transaksiMouseEntered
        transaksi.setBackground(new Color (4,221,245));
    }//GEN-LAST:event_transaksiMouseEntered

    private void transaksiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transaksiMouseExited
        transaksi.setBackground(new Color (2,131,145));
    }//GEN-LAST:event_transaksiMouseExited

    private void reportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseEntered
        report.setBackground(new Color (4,221,245));
    }//GEN-LAST:event_reportMouseEntered

    private void reportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseExited
        report.setBackground(new Color (2,131,145));
    }//GEN-LAST:event_reportMouseExited

    private void reportMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_reportMousePressed

    private void LogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseEntered
       Logout.setBackground(new Color (4,221,245));
    }//GEN-LAST:event_LogoutMouseEntered

    private void LogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseExited
       Logout.setBackground(new Color (2,131,145));
    }//GEN-LAST:event_LogoutMouseExited

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
         UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Palette.Panel Logout;
    private Palette.Panel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private Palette.Panel kasir;
    private javax.swing.JLabel lJam;
    private Palette.Panel list;
    private javax.swing.JPanel pnAtas;
    private javax.swing.JPanel pnBelakang;
    private javax.swing.JPanel pnKonten;
    private Palette.Panel pnSamping;
    private Palette.Panel report;
    private Palette.Panel reservasi;
    private Palette.Panel transaksi;
    // End of variables declaration//GEN-END:variables
}
