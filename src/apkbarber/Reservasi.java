/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package apkbarber;


import config.koneksi;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import popup.Berhasil;
import popup.BerhasilHapus;
import popup.BerhasilSelesai;
import popup.BerhasilUpdate;
import popup.PeringatanKosong;
import popup.YesNo;
import raven.datetime.component.time.TimeEvent;
import raven.datetime.component.time.TimeSelectionListener;

/**
 *
 * @author Alxxstrdy
 */
    public class Reservasi extends javax.swing.JPanel {

        /**
         * Creates new form Menu
         */
        private int halamanSaatIni = 1;
        private int dataPerHalaman = 10;
        private int totalPages;

        private Connection conn;

        public Reservasi() {
            initComponents();
            conn = (Connection) koneksi.getConnection();
            listBarang();
            loadData();
            setTabelModel();

            Jam.now();


            Jam.set24HourView(true);
            // timePicker1.setSelectedTime(LocalTime.of(1, 45));
            Jam.setOrientation(SwingConstants.HORIZONTAL);
            Jam.addTimeSelectionListener(new TimeSelectionListener() {
                @Override
                public void timeSelected(TimeEvent te) {
                    if (Jam.isTimeSelected()) {
                        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss a");

                    }

                }
            });
            Jam.setEditor(vWaktu);



            tNama.addKeyListener(new KeyAdapter() {
                public void keyTyped(KeyEvent e) {
                    char c = e.getKeyChar();
                    if (!Character.isLetter(c) && c != ' ') {
                        e.consume();
                    }
                }
            });
            tNoTelp.addKeyListener(new KeyAdapter() {
                public void keyTyped(KeyEvent e) {
                    char c = e.getKeyChar();
                    if (!Character.isDigit(c)) {
                        e.consume();
                    }
                }
            });
        }

        private void setTabelModel() {
            DefaultTableModel model = (DefaultTableModel) vtabel.getModel();
        }

            private void loadData() {
            calculateTotalPages();
            int totalData = getTotalData();
            lb_Halaman.setText(String.valueOf("Halaman" + halamanSaatIni + " dari Total Data " + totalData));

            int startIndex = (halamanSaatIni - 1) * dataPerHalaman;
            getData(startIndex, dataPerHalaman, (DefaultTableModel) vtabel.getModel());
            btnDelete.setVisible(false);
            bSelesai.setVisible(false);

        }

        private void getData(int startIndex, int entriesPage, DefaultTableModel model) {
            model.setRowCount(0);

            try {
                String sql = "SELECT * FROM reservasi ORDER BY CASE WHEN status = 'Belum Selesai' THEN 0 ELSE 1 END,waktu ASC LIMIT ?,?";
                try (PreparedStatement st = conn.prepareStatement(sql)) {
                    st.setInt(1, startIndex);
                    st.setInt(2, entriesPage);
                    ResultSet rs = st.executeQuery();

                    while (rs.next()) {
                        String id = rs.getString("id_reservasi");
                        String nama = rs.getString("nama");
                        String telepon = rs.getString("no_Telp");
                        String waktu = rs.getString("Waktu");
                        String Layanan = rs.getString("layanan");
                        String Status = rs.getString("status");

                        Object[] rowData = {id, nama, telepon, waktu, Layanan, Status};
                        model.addRow(rowData);

                    }
                }
            } catch (SQLException e) {
                Logger.getLogger(Reservasi.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        private void listBarang() {
            try {
                String sql = "SELECT nama_barjas FROM barang_jasa";
                try (PreparedStatement st = conn.prepareStatement(sql)) {
                    ResultSet rs = st.executeQuery();

                    while (rs.next()) {
                        String namabarang = rs.getString("nama_barjas");
                        listbarang.addItem(namabarang);

                    }
                }
            } catch (SQLException e) {
                Logger.getLogger(Reservasi.class.getName()).log(Level.SEVERE, null, e);
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

        jLabel8 = new javax.swing.JLabel();
        Jam = new raven.datetime.component.time.TimePicker();
        pnMain = new javax.swing.JPanel();
        pnView = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        vtabel = new Palette.JTable_Custom();
        btnDelete = new Palette.Panel();
        jLabel15 = new javax.swing.JLabel();
        tSearch = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lb_Halaman = new javax.swing.JLabel();
        bFirst = new Palette.Panel();
        jLabel1 = new javax.swing.JLabel();
        bLast = new Palette.Panel();
        jLabel2 = new javax.swing.JLabel();
        bBefore = new Palette.Panel();
        jLabel6 = new javax.swing.JLabel();
        bNext = new Palette.Panel();
        jLabel5 = new javax.swing.JLabel();
        btnAdd = new Palette.Panel();
        lTambah = new javax.swing.JLabel();
        bSelesai = new Palette.Panel();
        jLabel7 = new javax.swing.JLabel();
        pnAdd = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        WAKTU = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tNoTelp = new javax.swing.JTextField();
        tNama = new javax.swing.JTextField();
        listbarang = new javax.swing.JComboBox<>();
        id_barjas = new javax.swing.JLabel();
        vWaktu = new javax.swing.JFormattedTextField();
        bBatal = new Palette.Panel();
        lbatal = new javax.swing.JLabel();
        bSave = new Palette.Panel();
        lsave = new javax.swing.JLabel();

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SELESAI");

        setBackground(new java.awt.Color(214, 48, 49));
        setLayout(new java.awt.CardLayout());

        pnMain.setLayout(new java.awt.CardLayout());

        pnView.setBackground(new java.awt.Color(255, 255, 255));

        vtabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Pelanggan", "Nama Pelanggan", "NO Telp.", "Waktu", "Layanan", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        vtabel.setRowHeight(20);
        vtabel.setShowVerticalLines(true);
        vtabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtabelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                vtabelMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(vtabel);

        btnDelete.setBackground(new java.awt.Color(214, 48, 49));
        btnDelete.setFocusCycleRoot(true);
        btnDelete.setRoundBottomLeft(10);
        btnDelete.setRoundBottomRight(10);
        btnDelete.setRoundTopLeft(10);
        btnDelete.setRoundTopRight(10);
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDeleteMousePressed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("NEXT ART", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("HAPUS");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnDeleteLayout = new javax.swing.GroupLayout(btnDelete);
        btnDelete.setLayout(btnDeleteLayout);
        btnDeleteLayout.setHorizontalGroup(
            btnDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );
        btnDeleteLayout.setVerticalGroup(
            btnDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        tSearch.setText("Search");
        tSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tSearchFocusLost(evt);
            }
        });
        tSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tSearchKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("NEXT ART", 1, 14)); // NOI18N
        jLabel12.setText("LIST DATA RESERVASI");

        jLabel14.setFont(new java.awt.Font("NEXT ART", 1, 14)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Reservasi1.png"))); // NOI18N

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

        jLabel1.setFont(new java.awt.Font("NEXT ART", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FIRST PAGE");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout bFirstLayout = new javax.swing.GroupLayout(bFirst);
        bFirst.setLayout(bFirstLayout);
        bFirstLayout.setHorizontalGroup(
            bFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );
        bFirstLayout.setVerticalGroup(
            bFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jLabel2.setFont(new java.awt.Font("NEXT ART", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LAST PAGE");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout bLastLayout = new javax.swing.GroupLayout(bLast);
        bLast.setLayout(bLastLayout);
        bLastLayout.setHorizontalGroup(
            bLastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );
        bLastLayout.setVerticalGroup(
            bLastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );
        bBeforeLayout.setVerticalGroup(
            bBeforeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );
        bNextLayout.setVerticalGroup(
            bNextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        btnAdd.setBackground(new java.awt.Color(2, 131, 145));
        btnAdd.setFocusCycleRoot(true);
        btnAdd.setRoundBottomLeft(10);
        btnAdd.setRoundBottomRight(10);
        btnAdd.setRoundTopLeft(10);
        btnAdd.setRoundTopRight(10);
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddMousePressed(evt);
            }
        });

        lTambah.setFont(new java.awt.Font("NEXT ART", 0, 14)); // NOI18N
        lTambah.setForeground(new java.awt.Color(255, 255, 255));
        lTambah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTambah.setText("TAMBAH");
        lTambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnAddLayout = new javax.swing.GroupLayout(btnAdd);
        btnAdd.setLayout(btnAddLayout);
        btnAddLayout.setHorizontalGroup(
            btnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lTambah, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );
        btnAddLayout.setVerticalGroup(
            btnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lTambah, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        bSelesai.setBackground(new java.awt.Color(46, 204, 113));
        bSelesai.setFocusCycleRoot(true);
        bSelesai.setRoundBottomLeft(10);
        bSelesai.setRoundBottomRight(10);
        bSelesai.setRoundTopLeft(10);
        bSelesai.setRoundTopRight(10);
        bSelesai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bSelesaiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bSelesaiMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bSelesaiMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("NEXT ART", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("SELESAI");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout bSelesaiLayout = new javax.swing.GroupLayout(bSelesai);
        bSelesai.setLayout(bSelesaiLayout);
        bSelesaiLayout.setHorizontalGroup(
            bSelesaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );
        bSelesaiLayout.setVerticalGroup(
            bSelesaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnViewLayout = new javax.swing.GroupLayout(pnView);
        pnView.setLayout(pnViewLayout);
        pnViewLayout.setHorizontalGroup(
            pnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnViewLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addGroup(pnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_Halaman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnViewLayout.createSequentialGroup()
                        .addComponent(bFirst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bBefore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bLast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(250, 250, 250))
            .addGroup(pnViewLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnViewLayout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnViewLayout.createSequentialGroup()
                        .addGroup(pnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bSelesai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnViewLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(20, 20, 20))))
        );
        pnViewLayout.setVerticalGroup(
            pnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnViewLayout.createSequentialGroup()
                .addGroup(pnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnViewLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(tSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnViewLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23)
                .addGroup(pnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bSelesai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(lb_Halaman)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bNext, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bBefore, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bFirst, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bLast, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );

        pnMain.add(pnView, "card3");

        pnAdd.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("RESERVASI");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("INPUT PELANGGAN");

        tID.setText("ID Pelanggan");
        tID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tIDFocusLost(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("ID PELANGGAN");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("NAMA PELANGGAN");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("NO TELP.");

        WAKTU.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        WAKTU.setText("WAKTU");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("LAYANAN");

        tNoTelp.setText("No Telp");
        tNoTelp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tNoTelpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tNoTelpFocusLost(evt);
            }
        });

        tNama.setText("Nama Pelanggan");
        tNama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tNamaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tNamaFocusLost(evt);
            }
        });
        tNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNamaActionPerformed(evt);
            }
        });

        listbarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        id_barjas.setBackground(new java.awt.Color(255, 102, 102));
        id_barjas.setForeground(new java.awt.Color(255, 255, 255));
        id_barjas.setText("jLabel1");

        bBatal.setBackground(new java.awt.Color(214, 48, 49));
        bBatal.setFocusCycleRoot(true);
        bBatal.setRoundBottomLeft(10);
        bBatal.setRoundBottomRight(10);
        bBatal.setRoundTopLeft(10);
        bBatal.setRoundTopRight(10);
        bBatal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bBatalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bBatalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bBatalMousePressed(evt);
            }
        });

        lbatal.setFont(new java.awt.Font("NEXT ART", 0, 14)); // NOI18N
        lbatal.setForeground(new java.awt.Color(255, 255, 255));
        lbatal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbatal.setText("BATAl");
        lbatal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout bBatalLayout = new javax.swing.GroupLayout(bBatal);
        bBatal.setLayout(bBatalLayout);
        bBatalLayout.setHorizontalGroup(
            bBatalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbatal, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );
        bBatalLayout.setVerticalGroup(
            bBatalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbatal, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        bSave.setBackground(new java.awt.Color(2, 131, 145));
        bSave.setFocusCycleRoot(true);
        bSave.setRoundBottomLeft(10);
        bSave.setRoundBottomRight(10);
        bSave.setRoundTopLeft(10);
        bSave.setRoundTopRight(10);
        bSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bSaveMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bSaveMousePressed(evt);
            }
        });

        lsave.setFont(new java.awt.Font("NEXT ART", 0, 14)); // NOI18N
        lsave.setForeground(new java.awt.Color(255, 255, 255));
        lsave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lsave.setText("SIMPAN");
        lsave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout bSaveLayout = new javax.swing.GroupLayout(bSave);
        bSave.setLayout(bSaveLayout);
        bSaveLayout.setHorizontalGroup(
            bSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lsave, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );
        bSaveLayout.setVerticalGroup(
            bSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lsave, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnAddLayout = new javax.swing.GroupLayout(pnAdd);
        pnAdd.setLayout(pnAddLayout);
        pnAddLayout.setHorizontalGroup(
            pnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAddLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnAddLayout.createSequentialGroup()
                        .addComponent(vWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnAddLayout.createSequentialGroup()
                        .addGroup(pnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnAddLayout.createSequentialGroup()
                                .addGroup(pnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(WAKTU)
                                    .addComponent(jLabel13)
                                    .addComponent(tNama, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                                    .addComponent(tID)
                                    .addComponent(tNoTelp))
                                .addGap(0, 196, Short.MAX_VALUE))
                            .addGroup(pnAddLayout.createSequentialGroup()
                                .addGroup(pnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(listbarang, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(196, 196, 196)))
                        .addComponent(id_barjas, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnAddLayout.createSequentialGroup()
                .addContainerGap(500, Short.MAX_VALUE)
                .addGroup(pnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnAddLayout.createSequentialGroup()
                        .addComponent(bSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bBatal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(26, 26, 26))
        );
        pnAddLayout.setVerticalGroup(
            pnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnAddLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(42, 42, 42)
                .addComponent(jLabel9)
                .addGroup(pnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnAddLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnAddLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(id_barjas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(WAKTU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addGroup(pnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBatal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pnMain.add(pnAdd, "card4");

        add(pnMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void tIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tIDFocusGained
        if (tID.getText().equals("ID Pelanggan")) {
            tID.setText("");
        }
    }//GEN-LAST:event_tIDFocusGained

    private void tIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tIDFocusLost
        if (tID.getText().equals("")) {
            tID.setText("ID Pelanggan");
        }
    }//GEN-LAST:event_tIDFocusLost

    private void tNamaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tNamaFocusGained
        if (tNama.getText().equals("Nama Pelanggan")) {
            tNama.setText("");
        }
    }//GEN-LAST:event_tNamaFocusGained

    private void tNamaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tNamaFocusLost
        if (tNama.getText().equals("")) {
            tNama.setText("Nama Pelanggan");
        }
    }//GEN-LAST:event_tNamaFocusLost

    private void tNoTelpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tNoTelpFocusGained
        if (tNoTelp.getText().equals("No Telp")) {
            tNoTelp.setText("");
        }
    }//GEN-LAST:event_tNoTelpFocusGained

    private void tNoTelpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tNoTelpFocusLost
        if (tNoTelp.getText().equals("")) {
            tNoTelp.setText("No Telp");
        }
    }//GEN-LAST:event_tNoTelpFocusLost

    private void vtabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtabelMouseClicked
        if (lTambah.getText().equals("TAMBAH")) {
            lTambah.setText("UBAH");
            btnDelete.setVisible(true);
            bSelesai.setVisible(true);

        }
    }//GEN-LAST:event_vtabelMouseClicked

    private void tSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tSearchKeyTyped
        searchData();
    }//GEN-LAST:event_tSearchKeyTyped

    private void vtabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtabelMousePressed
        if (lTambah.getText().equals("TAMBAH")) {
            lTambah.setText("UBAH");

            btnDelete.setVisible(true);
            bSelesai.setVisible(true);

        }
    }//GEN-LAST:event_vtabelMousePressed

    private void tSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tSearchFocusGained
        if (tSearch.getText().equals("Search")) {
            tSearch.setText("");
        }
    }//GEN-LAST:event_tSearchFocusGained

    private void tSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tSearchFocusLost
        if (tSearch.getText().equals("")) {
            tSearch.setText("Search");
        }
    }//GEN-LAST:event_tSearchFocusLost

    private void tNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNamaActionPerformed

    private void bLastMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bLastMouseClicked
                halamanSaatIni = totalPages;

                loadData();
                if (lTambah.getText().equals("UBAH")) {
                    lTambah.setText("TAMBAH");
                }
    }//GEN-LAST:event_bLastMouseClicked

    private void bFirstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bFirstMouseClicked
                halamanSaatIni = 1;

                loadData();
                if (lTambah.getText().equals("UBAH")) {
                    lTambah.setText("TAMBAH");
                }
    }//GEN-LAST:event_bFirstMouseClicked

    private void bNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bNextMouseClicked
                if (halamanSaatIni < totalPages) {
                    halamanSaatIni++;

                    loadData();
                    if (lTambah.getText().equals("UBAH")) {
                        lTambah.setText("TAMBAH");
                    }
}
    }//GEN-LAST:event_bNextMouseClicked

    private void bBeforeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bBeforeMouseClicked
                if (halamanSaatIni > 1) {
                    halamanSaatIni--;

                    loadData();
                    if (lTambah.getText().equals("UBAH")) {
                        lTambah.setText("TAMBAH");
                    }
    }
    }//GEN-LAST:event_bBeforeMouseClicked

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        btnDelete.setBackground(new Color(218,69,70));
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        btnDelete.setBackground(new Color(214,48,49));
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnDeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMousePressed
        boolean closable = true;
        YesNo data = new YesNo(null, closable, this);
        data.setVisible(true);
        
        
        if (lTambah.getText().equals("UBAH")) {
            lTambah.setText("TAMBAH");
        }
    }//GEN-LAST:event_btnDeleteMousePressed

    private void btnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseEntered
        btnAdd.setBackground(new Color (2,154,170));
    }//GEN-LAST:event_btnAddMouseEntered

    private void btnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseExited
        btnAdd.setBackground(new Color (2,131,145));
    }//GEN-LAST:event_btnAddMouseExited

    private void btnAddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMousePressed
        invoiceid();
        tID.setEnabled(false);
        tNama.setText("Nama Pelanggan");
        tNoTelp.setText("No Telp");
        pnMain.removeAll();
        pnMain.add(pnAdd);
        pnMain.repaint();
        pnMain.revalidate();

        if (lTambah.getText().equals("UBAH")) {
            dataTabel();
            lsave.setText("PERBARUI");
        }
    }//GEN-LAST:event_btnAddMousePressed

    private void bSelesaiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSelesaiMouseEntered
        bSelesai.setBackground(new Color(41,183,101));
    }//GEN-LAST:event_bSelesaiMouseEntered

    private void bSelesaiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSelesaiMouseExited
        bSelesai.setBackground(new Color(46,204,113));
    }//GEN-LAST:event_bSelesaiMouseExited

    private void bSelesaiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSelesaiMousePressed
        int row = vtabel.getSelectedRow();
        String id = vtabel.getValueAt(row, 0).toString();
        String selesai = "Selesai";
        String status = vtabel.getValueAt(row, 5).toString();
        
        if(status.equals("Belum Selesai")){
            
        try {
            // Perbaiki query SQL: nama kolom 'NO_Telp.' tidak boleh mengandung karakter khusus dan pastikan jumlah placeholder (?) sesuai dengan jumlah parameter
            String sql = "UPDATE reservasi SET status =? WHERE id_reservasi=?";
            // ,id_barjas=?      

            // Persiapan statement dengan connection
            PreparedStatement st = conn.prepareStatement(sql);

            st.setString(1, selesai);
            st.setString(2, id);

            int rowUpdated = st.executeUpdate();
            if (rowUpdated > 0) {

            boolean closable = true;
            BerhasilSelesai data = new BerhasilSelesai(null, closable);
            data.setVisible(true);
            tNama.setText(null);

                resetForm();
                loadData();
                showtable();
            if (lTambah.getText().equals("UBAH")) {
            lTambah.setText("TAMBAH");
        }
            }

        } catch (SQLException e) {
            Logger.getLogger(Reservasi.class.getName()).log(Level.SEVERE, null, e);
        }
        
        }else if (status.equals("Selesai")){
            boolean closable = true;
            PeringatanKosong data = new PeringatanKosong(null, closable);
            data.setVisible(true);
            tNama.setText(null);
        }
        
    }//GEN-LAST:event_bSelesaiMousePressed

    private void bBatalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bBatalMouseEntered
        bBatal.setBackground(new Color(218,69,70));
    }//GEN-LAST:event_bBatalMouseEntered

    private void bBatalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bBatalMouseExited
        bBatal.setBackground(new Color(214,48,49));
    }//GEN-LAST:event_bBatalMouseExited

    private void bBatalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bBatalMousePressed
        showtable();
        loadData();
        if (lTambah.getText().equals("UBAH")) {
            lTambah.setText("TAMBAH");
            lsave.setText("SIMPAN");
        }
    }//GEN-LAST:event_bBatalMousePressed

    private void bSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSaveMouseEntered
        bSave.setBackground(new Color (2,154,170));
    }//GEN-LAST:event_bSaveMouseEntered

    private void bSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSaveMouseExited
        bSave.setBackground(new Color (2,131,145));
    }//GEN-LAST:event_bSaveMouseExited

    private void bSaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSaveMousePressed
                
        if (tNama.getText().equals("Nama Pelanggan")){
            boolean closable = true;
            PeringatanKosong data = new PeringatanKosong(null, closable);
            data.setVisible(true);
            tNama.setText(null);
        } else if(tNoTelp.getText().equals("No Telp")){
            boolean closable = true;
            PeringatanKosong data = new PeringatanKosong(null, closable);
            data.setVisible(true);
            tNama.setText(null);
        }else if(listbarang.getSelectedItem().equals(null)){
            boolean closable = true;
            PeringatanKosong data = new PeringatanKosong(null, closable);
            data.setVisible(true);
            tNama.setText(null);
        }
        
                getId();
                if (lsave.getText().equals("SIMPAN")) {
            insertData();
        } else if (lsave.getText().equals("PERBARUI")) {
            updateData();
            lsave.setText("SIMPAN");
            if (lTambah.getText().equals("UBAH")) {
            lTambah.setText("TAMBAH");

            btnDelete.setVisible(false);
            bSelesai.setVisible(false);

        }
        }

    }//GEN-LAST:event_bSaveMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private raven.datetime.component.time.TimePicker Jam;
    private javax.swing.JLabel WAKTU;
    private Palette.Panel bBatal;
    private Palette.Panel bBefore;
    private Palette.Panel bFirst;
    private Palette.Panel bLast;
    private Palette.Panel bNext;
    private Palette.Panel bSave;
    private Palette.Panel bSelesai;
    private Palette.Panel btnAdd;
    private Palette.Panel btnDelete;
    private javax.swing.JLabel id_barjas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lTambah;
    private javax.swing.JLabel lb_Halaman;
    private javax.swing.JLabel lbatal;
    private javax.swing.JComboBox<String> listbarang;
    private javax.swing.JLabel lsave;
    private javax.swing.JPanel pnAdd;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnView;
    private javax.swing.JTextField tID;
    private javax.swing.JTextField tNama;
    private javax.swing.JTextField tNoTelp;
    private javax.swing.JTextField tSearch;
    private javax.swing.JFormattedTextField vWaktu;
    private Palette.JTable_Custom vtabel;
    // End of variables declaration//GEN-END:variables

    private int getTotalData() {

        int totalData = 0;

        try {
            String sql = "SELECT COUNT(*) AS total FROM reservasi";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    totalData = rs.getInt("total");
                }
            }

        } catch (Exception e) {
            Logger.getLogger(Reservasi.class.getName()).log(Level.SEVERE, null, e);
        }

        return totalData;

    }

    private void calculateTotalPages() {
        int totalData = getTotalData();
        totalPages = (int) Math.ceil((double) totalData / dataPerHalaman);
    }

    private void insertData() {

        String id = tID.getText();
        String nama = tNama.getText();
        String telepon = tNoTelp.getText();
        String waktu = vWaktu.getText();
        String Layanan = listbarang.getSelectedItem().toString();
        String idbarjas = id_barjas.getText();
        
     
        try {

            String sql = "INSERT INTO reservasi (id_reservasi, nama, no_Telp, waktu, layanan, id_barjas, status) VALUES (?, ?, ?, ?, ?, ?, ?)";

       
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, id);
            st.setString(2, nama);
            st.setString(3, telepon);
            st.setString(4, waktu);
            st.setString(5, Layanan);
            st.setString(6, idbarjas);
            st.setString(7, "Belum Selesai");

            int rowInserted = st.executeUpdate();
            if (rowInserted > 0) {
                
            boolean closable = true;
            Berhasil data = new Berhasil(null, closable);
            data.setVisible(true);
            tNama.setText(null);
                resetForm();
                loadData();
                showtable();
            }

        } catch (SQLException e) {
            Logger.getLogger(Reservasi.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void resetForm() {

        tNama.setText(null);
        tNoTelp.setText(null);
        vWaktu.setText(null);
        listbarang.setSelectedItem(null);
    }

    private void showtable() {
        pnMain.removeAll();
        pnMain.add(pnView);
        pnMain.repaint();
        pnMain.revalidate();

    }

    private void getId() {
        String nama = listbarang.getSelectedItem().toString();

        try {
            String sql = "SELECT id_barjas FROM barang_jasa WHERE nama_barjas =?";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, nama);
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    String idbarjas = rs.getString("id_barjas");
                    id_barjas.setText(idbarjas);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(Reservasi.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void invoiceid() {
        SimpleDateFormat wkt;
        Date dt = new Date();
        wkt = new SimpleDateFormat("yyyyMM");
        String w = wkt.format(dt);
        try {

            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("SELECT MAX(id_reservasi) FROM reservasi");
            rs.next();
            rs.getString("MAX(id_reservasi)");
            if (rs.getString("MAX(id_reservasi)") == null) {
                tID.setText(w + "000001");
            } else {
                long id = Long.parseLong(rs.getString("MAX(id_reservasi)").substring(6, rs.getString("MAX(id_reservasi)").length()));
                id++;
                tID.setText(w + String.format("%06d", id));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void dataTabel() {
        pnView.setVisible(false);
        pnAdd.setVisible(true);

        int row = vtabel.getSelectedRow();

        tID.setEnabled(false);

        tID.setText(vtabel.getValueAt(row, 0).toString());
        tNama.setText(vtabel.getValueAt(row, 1).toString());
        tNoTelp.setText(vtabel.getValueAt(row, 2).toString());
        vWaktu.setText(vtabel.getValueAt(row, 3).toString());
        listbarang.setSelectedItem(vtabel.getValueAt(row, 4));
        id_barjas.setText("");
        getId();

    }

    private void updateData() {

        String namaa = listbarang.getSelectedItem().toString();

        try {
            String sql = "SELECT id_barjas FROM barang_jasa WHERE nama_barjas =?";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, namaa);
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    String idbarjas = rs.getString("id_barjas");
                    id_barjas.setText(idbarjas);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(Reservasi.class.getName()).log(Level.SEVERE, null, e);
        }

        String id = tID.getText();
        String nama = tNama.getText();
        String telepon = tNoTelp.getText();
        String waktu = vWaktu.getText();
        String Layanan = listbarang.getSelectedItem().toString();
        String idbarjas = id_barjas.getText();

        try {

            String sql = "UPDATE reservasi SET nama=?, no_telp=?, waktu=?, layanan=?, id_barjas=? WHERE id_reservasi=?";

            PreparedStatement st = conn.prepareStatement(sql);

            st.setString(1, nama);
            st.setString(2, telepon);
            st.setString(3, waktu);
            st.setString(4, Layanan);
            st.setString(5, idbarjas);
            st.setString(6, id);

            int rowUpdated = st.executeUpdate();
            if (rowUpdated > 0) {

            boolean closable = true;
            BerhasilUpdate data = new BerhasilUpdate(null, closable);
            data.setVisible(true);
            tNama.setText(null);

                resetForm();
                loadData();
                showtable();
                lTambah.setText("SIMPAN");
            }

        } catch (SQLException e) {
            Logger.getLogger(Reservasi.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void deleteData() {
        int selectedRow = vtabel.getSelectedRow();
        
            String id = vtabel.getValueAt(selectedRow, 0).toString();
            try {
                String sql = "DELETE FROM reservasi WHERE id_reservasi=?";
                try (PreparedStatement st = conn.prepareStatement(sql)) {
                    st.setString(1, id);

                    int rowDeleted = st.executeUpdate();
                    if (rowDeleted > 0) {
                        boolean closable = true;
                        BerhasilHapus data = new BerhasilHapus(null, closable);
                        data.setVisible(true);

                    } else {
                        JOptionPane.showMessageDialog(this, "Data Gagal Dihapus");
                    }
                }
            } catch (SQLException e) {
                Logger.getLogger(Reservasi.class.getName()).log(Level.SEVERE, null, e);
            }
         
        resetForm();
        loadData();
        showtable();
        
    }

    private void searchData() {
        String kataKunci = tSearch.getText();
        DefaultTableModel model = (DefaultTableModel) vtabel.getModel();
        model.setRowCount(0);

        try {
            String sql = "SELECT * FROM reservasi WHERE nama LIKE ? OR no_telp LIKE ?";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, "%" + kataKunci + "%");
                st.setString(2, "%" + kataKunci + "%");
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    String id = rs.getString("id_reservasi");
                    String nama = rs.getString("nama");
                    String telepon = rs.getString("no_Telp");
                    String waktu = rs.getString("waktu");
                    String Layanan = rs.getString("layanan");

                    Object[] rowData = {id, nama, telepon, waktu, Layanan};
                    model.addRow(rowData);

                }
            }
        } catch (SQLException e) {
            Logger.getLogger(Reservasi.class.getName()).log(Level.SEVERE, null, e);
        }

    }
    
    public void kosong(){
        btnDelete.setVisible(false);
        bSelesai.setVisible(false);
    }

}
