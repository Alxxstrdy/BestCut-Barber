/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package apkbarber;

import com.formdev.flatlaf.FlatLightLaf;
import config.koneksi;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;
import popup.AboutUs;
import popup.PeringatanTutup;

/**
 *
 * @author Alxxstrdy
 */
public class MenuUtama extends javax.swing.JFrame {



    private String userID;
    
    private Connection conn;
    public MenuUtama(String userID) {
        initComponents();
        conn = (Connection) koneksi.getConnection();
        wkt();
        showHome();
        this.userID = userID;
        showUser();
    }
    public String getUserID() {
        return userID;
    }
        Timer t ;
        SimpleDateFormat st; 

    public void wkt(){

        t = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
    
    public void showUser(){
        lId.setText(getUserID());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnBelakang = new javax.swing.JPanel();
        pnSamping = new Palette.Panel();
        home = new Palette.Panel();
        jLabel2 = new javax.swing.JLabel();
        list = new Palette.Panel();
        jLabel4 = new javax.swing.JLabel();
        reservasi = new Palette.Panel();
        jLabel6 = new javax.swing.JLabel();
        kasir = new Palette.Panel();
        jLabel8 = new javax.swing.JLabel();
        report = new Palette.Panel();
        jLabel12 = new javax.swing.JLabel();
        transaksi = new Palette.Panel();
        jLabel10 = new javax.swing.JLabel();
        logout = new Palette.Panel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pnKonten = new javax.swing.JPanel();
        pnAtas = new javax.swing.JPanel();
        lJam = new javax.swing.JLabel();
        lId = new javax.swing.JLabel();
        profile = new Palette.Panel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/icon/Barbericn.png")).getImage());

        pnBelakang.setBackground(new java.awt.Color(255, 255, 255));
        pnBelakang.setPreferredSize(new java.awt.Dimension(971, 650));

        pnSamping.setBackground(new java.awt.Color(2, 131, 145));

        home.setBackground(new java.awt.Color(2, 131, 145));
        home.setRoundBottomLeft(15);
        home.setRoundBottomRight(15);
        home.setRoundTopLeft(15);
        home.setRoundTopRight(15);
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

        jLabel2.setBackground(new java.awt.Color(2, 131, 145));
        jLabel2.setFont(new java.awt.Font("NEXT ART", 0, 19)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home.png"))); // NOI18N
        jLabel2.setText("   HOME");

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        list.setBackground(new java.awt.Color(2, 131, 145));
        list.setPreferredSize(new java.awt.Dimension(157, 37));
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

        jLabel4.setBackground(new java.awt.Color(2, 131, 145));
        jLabel4.setFont(new java.awt.Font("NEXT ART", 0, 19)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/List.png"))); // NOI18N
        jLabel4.setText("     LIST");

        javax.swing.GroupLayout listLayout = new javax.swing.GroupLayout(list);
        list.setLayout(listLayout);
        listLayout.setHorizontalGroup(
            listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        listLayout.setVerticalGroup(
            listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        reservasi.setBackground(new java.awt.Color(2, 131, 145));
        reservasi.setPreferredSize(new java.awt.Dimension(160, 37));
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

        jLabel6.setBackground(new java.awt.Color(2, 131, 145));
        jLabel6.setFont(new java.awt.Font("NEXT ART", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Reservasi.png"))); // NOI18N
        jLabel6.setText("    RESERVASI");

        javax.swing.GroupLayout reservasiLayout = new javax.swing.GroupLayout(reservasi);
        reservasi.setLayout(reservasiLayout);
        reservasiLayout.setHorizontalGroup(
            reservasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reservasiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        reservasiLayout.setVerticalGroup(
            reservasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        kasir.setBackground(new java.awt.Color(2, 131, 145));
        kasir.setPreferredSize(new java.awt.Dimension(157, 37));
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

        jLabel8.setBackground(new java.awt.Color(2, 131, 145));
        jLabel8.setFont(new java.awt.Font("NEXT ART", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Kasir.png"))); // NOI18N
        jLabel8.setText("   KASIR");

        javax.swing.GroupLayout kasirLayout = new javax.swing.GroupLayout(kasir);
        kasir.setLayout(kasirLayout);
        kasirLayout.setHorizontalGroup(
            kasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kasirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kasirLayout.setVerticalGroup(
            kasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        report.setBackground(new java.awt.Color(2, 131, 145));
        report.setPreferredSize(new java.awt.Dimension(157, 37));
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

        jLabel12.setBackground(new java.awt.Color(2, 131, 145));
        jLabel12.setFont(new java.awt.Font("NEXT ART", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Report.png"))); // NOI18N
        jLabel12.setText("   REPORT");

        javax.swing.GroupLayout reportLayout = new javax.swing.GroupLayout(report);
        report.setLayout(reportLayout);
        reportLayout.setHorizontalGroup(
            reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        reportLayout.setVerticalGroup(
            reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        transaksi.setBackground(new java.awt.Color(2, 131, 145));
        transaksi.setPreferredSize(new java.awt.Dimension(157, 37));
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

        jLabel10.setBackground(new java.awt.Color(2, 131, 145));
        jLabel10.setFont(new java.awt.Font("NEXT ART", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transaksi.png"))); // NOI18N
        jLabel10.setText("   TRANSAKSI");

        javax.swing.GroupLayout transaksiLayout = new javax.swing.GroupLayout(transaksi);
        transaksi.setLayout(transaksiLayout);
        transaksiLayout.setHorizontalGroup(
            transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        transaksiLayout.setVerticalGroup(
            transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        logout.setBackground(new java.awt.Color(2, 131, 145));
        logout.setPreferredSize(new java.awt.Dimension(157, 37));
        logout.setRoundBottomLeft(20);
        logout.setRoundBottomRight(20);
        logout.setRoundTopLeft(20);
        logout.setRoundTopRight(20);
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutMousePressed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(2, 131, 145));
        jLabel13.setFont(new java.awt.Font("NEXT ART", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/LogOut.png"))); // NOI18N
        jLabel13.setText("   LOG OUT");

        javax.swing.GroupLayout logoutLayout = new javax.swing.GroupLayout(logout);
        logout.setLayout(logoutLayout);
        logoutLayout.setHorizontalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logoutLayout.setVerticalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("_________________________________________");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("_________________________________________");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Logo.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Barber apk 0.1.0-beta1");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnSampingLayout = new javax.swing.GroupLayout(pnSamping);
        pnSamping.setLayout(pnSampingLayout);
        pnSampingLayout.setHorizontalGroup(
            pnSampingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSampingLayout.createSequentialGroup()
                .addGroup(pnSampingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnSampingLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                    .addGroup(pnSampingLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnSampingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(report, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(transaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(kasir, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(reservasi, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(list, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnSampingLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnSampingLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnSampingLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnSampingLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnSampingLayout.setVerticalGroup(
            pnSampingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSampingLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(list, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(reservasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(report, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pnKonten.setLayout(new java.awt.BorderLayout());

        pnAtas.setBackground(new java.awt.Color(223, 230, 233));
        pnAtas.setPreferredSize(new java.awt.Dimension(754, 62));

        lJam.setFont(new java.awt.Font("Lucida Fax", 0, 10)); // NOI18N
        lJam.setText("jLabel1");

        lId.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        lId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lId.setText("jLabel15");

        profile.setBackground(new java.awt.Color(2, 131, 145));
        profile.setRoundBottomLeft(20);
        profile.setRoundBottomRight(20);
        profile.setRoundTopLeft(20);
        profile.setRoundTopRight(20);
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profileMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                profileMousePressed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout profileLayout = new javax.swing.GroupLayout(profile);
        profile.setLayout(profileLayout);
        profileLayout.setHorizontalGroup(
            profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        profileLayout.setVerticalGroup(
            profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnAtasLayout = new javax.swing.GroupLayout(pnAtas);
        pnAtas.setLayout(pnAtasLayout);
        pnAtasLayout.setHorizontalGroup(
            pnAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAtasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lJam, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnAtasLayout.setVerticalGroup(
            pnAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnAtasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnAtasLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lJam))
                    .addComponent(profile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnBelakangLayout = new javax.swing.GroupLayout(pnBelakang);
        pnBelakang.setLayout(pnBelakangLayout);
        pnBelakangLayout.setHorizontalGroup(
            pnBelakangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBelakangLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnSamping, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnBelakangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnBelakangLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(pnKonten, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addComponent(pnAtas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnBelakangLayout.setVerticalGroup(
            pnBelakangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBelakangLayout.createSequentialGroup()
                .addComponent(pnAtas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(pnKonten, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addComponent(pnSamping, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        
            try {
            String sql = "SELECT status, substatus FROM opclo";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    String status = rs.getString("status");
                    String substatus = rs.getString("substatus");
                
                if(status.equals("OPEN")){
                pnKonten.removeAll();
                pnKonten.add(new Kasir(getUserID()));
                pnKonten.repaint();
                pnKonten.revalidate();
                } else if(status.equals("CLOSE")){
                        boolean closable = true;
                        PeringatanTutup data = new PeringatanTutup(null, closable);
                        data.setVisible(true);
                }
                }
                
            }
                    } catch (SQLException e) {
            Logger.getLogger(Reservasi.class.getName()).log(Level.SEVERE, null, e);
        }
            

    }//GEN-LAST:event_kasirMousePressed

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
        home.setBackground(new Color (2,154,170));
    }//GEN-LAST:event_homeMouseEntered

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
        home.setBackground(new Color (2,131,145));
    }//GEN-LAST:event_homeMouseExited

    private void listMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseEntered
        list.setBackground(new Color (2,154,170));
    }//GEN-LAST:event_listMouseEntered

    private void listMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseExited
        list.setBackground(new Color (2,131,145));
    }//GEN-LAST:event_listMouseExited

    private void reservasiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservasiMouseEntered
        reservasi.setBackground(new Color (2,154,170));
    }//GEN-LAST:event_reservasiMouseEntered

    private void reservasiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservasiMouseExited
        reservasi.setBackground(new Color (2,131,145));
    }//GEN-LAST:event_reservasiMouseExited

    private void kasirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kasirMouseEntered
        kasir.setBackground(new Color (2,154,170));
    }//GEN-LAST:event_kasirMouseEntered

    private void kasirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kasirMouseExited
        kasir.setBackground(new Color (2,131,145));
    }//GEN-LAST:event_kasirMouseExited

    private void profileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_profileMouseEntered

    private void profileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_profileMouseExited

    private void profileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMousePressed
        pnKonten.removeAll();
        pnKonten.add(new PergantianPass(getUserID()));
        pnKonten.repaint();
        pnKonten.revalidate();
    }//GEN-LAST:event_profileMousePressed

    private void transaksiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transaksiMousePressed
        transaksi.setBackground(new Color(3,176,195));

        pnKonten.removeAll();
        pnKonten.add(new Transaksi());
        pnKonten.repaint();
        pnKonten.revalidate();
    }//GEN-LAST:event_transaksiMousePressed

    private void transaksiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transaksiMouseExited
        transaksi.setBackground(new Color (2,131,145));
    }//GEN-LAST:event_transaksiMouseExited

    private void transaksiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transaksiMouseEntered
        transaksi.setBackground(new Color (2,154,170));
    }//GEN-LAST:event_transaksiMouseEntered

    private void reportMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_reportMousePressed

    private void reportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseExited
        report.setBackground(new Color (2,131,145));
    }//GEN-LAST:event_reportMouseExited

    private void reportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseEntered
        report.setBackground(new Color (2,154,170));
    }//GEN-LAST:event_reportMouseEntered

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        logout.setBackground(new Color (2,154,170));
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        logout.setBackground(new Color (2,131,145));
    }//GEN-LAST:event_logoutMouseExited

    private void logoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMousePressed
        new Loginsite().setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutMousePressed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        boolean closable = true;
        AboutUs data = new AboutUs(null, closable);
        data.setVisible(true);
    }//GEN-LAST:event_jLabel9MousePressed

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
         FlatLightLaf.setup();
         
        } catch (Exception e) {
            e.printStackTrace();
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String userID = "ID";
                new MenuUtama(userID).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Palette.Panel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private Palette.Panel kasir;
    private javax.swing.JLabel lId;
    private javax.swing.JLabel lJam;
    private Palette.Panel list;
    private Palette.Panel logout;
    private javax.swing.JPanel pnAtas;
    private javax.swing.JPanel pnBelakang;
    private javax.swing.JPanel pnKonten;
    private Palette.Panel pnSamping;
    private Palette.Panel profile;
    private Palette.Panel report;
    private Palette.Panel reservasi;
    private Palette.Panel transaksi;
    // End of variables declaration//GEN-END:variables
}
