    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package popup;

import config.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class DataBarjas extends javax.swing.JDialog {

   private final Connection conn;
    public DataBarjas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        conn = koneksi.getConnection();
        setTabelModel();
        loadData();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        pnMain = new javax.swing.JPanel();
        pnUtama = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabData = new Palette.JTable_Custom();
        pnSembunyi = new javax.swing.JPanel();
        tId = new javax.swing.JTextField();
        tNama = new javax.swing.JTextField();
        tHarga = new javax.swing.JTextField();
        tQty = new javax.swing.JTextField();
        tJenis = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(2, 131, 145));

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATA BARANG DAN JASA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.CardLayout());

        pnMain.setBackground(new java.awt.Color(255, 255, 255));
        pnMain.setLayout(new java.awt.CardLayout());

        pnUtama.setBackground(new java.awt.Color(255, 255, 255));

        tabData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NAMA", "HARGA", "JENIS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabDataMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabData);

        javax.swing.GroupLayout pnUtamaLayout = new javax.swing.GroupLayout(pnUtama);
        pnUtama.setLayout(pnUtamaLayout);
        pnUtamaLayout.setHorizontalGroup(
            pnUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUtamaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnUtamaLayout.setVerticalGroup(
            pnUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUtamaLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pnMain.add(pnUtama, "card2");

        pnSembunyi.setBackground(new java.awt.Color(255, 255, 255));

        tJenis.setText("jTextField1");

        javax.swing.GroupLayout pnSembunyiLayout = new javax.swing.GroupLayout(pnSembunyi);
        pnSembunyi.setLayout(pnSembunyiLayout);
        pnSembunyiLayout.setHorizontalGroup(
            pnSembunyiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSembunyiLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnSembunyiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tId, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(tNama, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(tHarga, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(tQty)
                    .addComponent(tJenis))
                .addContainerGap(354, Short.MAX_VALUE))
        );
        pnSembunyiLayout.setVerticalGroup(
            pnSembunyiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSembunyiLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(tId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(tHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        pnMain.add(pnSembunyi, "card3");

        jPanel6.add(pnMain, "card2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabDataMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabDataMousePressed
        insertData();
    }//GEN-LAST:event_tabDataMousePressed

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
            java.util.logging.Logger.getLogger(DataBarjas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataBarjas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataBarjas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataBarjas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DataBarjas dialog = new DataBarjas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel6;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JPanel pnMain;
    public javax.swing.JPanel pnSembunyi;
    public javax.swing.JPanel pnUtama;
    public javax.swing.JTextField tHarga;
    public javax.swing.JTextField tId;
    public javax.swing.JTextField tJenis;
    public javax.swing.JTextField tNama;
    public javax.swing.JTextField tQty;
    public Palette.JTable_Custom tabData;
    // End of variables declaration//GEN-END:variables

    private void setTabelModel() {
        DefaultTableModel model = (DefaultTableModel) tabData.getModel();
    }

    private void loadData() {
      getData((DefaultTableModel) tabData.getModel());
    }

    private void getData(DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
            String sql = "SELECT * FROM barang_jasa ORDER BY id_barjas DESC";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                ResultSet rs = st.executeQuery();
                
                while (rs.next()){
                    String idBJ = rs.getString("id_barjas");
                    String namaBJ = rs.getString("nama_barjas");
                    int harga = rs.getInt("harga");
                    String jenis = rs.getString("jenis_barjas");
                            
                    Object[] rowdata = {idBJ, namaBJ, harga,jenis};
                    model.addRow(rowdata);
                }
            } 
        } catch (SQLException e) {
            Logger.getLogger(DataBarjas.class.getName()).log(Level.SEVERE, null, e);
        }
    }
   
        
        
        
    
        private void insertData() {
        int i = tabData.getSelectedRow();
        String id = tabData.getValueAt(i, 0).toString();
        String nama = tabData.getValueAt(i, 1).toString();
        String Harga = tabData.getValueAt(i, 2).toString();
        String Jenis = tabData.getValueAt(i, 3).toString();
        String Qty = JOptionPane.showInputDialog("Masukkan jumlah: ");
        int harga = Integer.parseInt(Harga);
        int qty = Integer.parseInt(Qty);
        int subtotal = harga*qty;
        
        try {
            String sql = "INSERT INTO trans_sementara (id_barang, nama_brg, qty, harga, subtotal, jenis) VALUES (?,?,?,?,?,?)";
            try(PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, id);
                st.setString(2, nama);
                st.setInt(3, qty);
                st.setInt(4, harga);
                st.setInt(5, subtotal);
                st.setString(6, Jenis);
                
                int rowInserted = st.executeUpdate();
                if (rowInserted > 0){
                    resetForm();
                    loadData();
                    dispose();
                }
            } 
        } catch (SQLException e) {
            Logger.getLogger(DataBarjas.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    private void resetForm() {
        tId.setText(null);
        tNama.setText(null);
        tHarga.setText(null);
    }

}
