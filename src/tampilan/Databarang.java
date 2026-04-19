
package tampilan;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import koneksi.koneksi;
import java.sql.Connection;

 
    

public class Databarang extends javax.swing.JFrame {
    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode; 
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Databarang.class.getName());

    public Databarang() {
        initComponents();
        kosong();
        aktif();
        datatable();
    }

    protected void aktif() {
        txtid.requestFocus();
    }
    
    protected void kosong() {
        txtid.setText("");
        txtnm.setText("");
        txtbeli.setText("");
        txtjual.setText("");
        txtcari.setText("");
        cbjenis.setSelectedIndex(0);
    }
  protected void datatable() {
        Object[] Baris={"ID Barang","Nama","Jenis Barang","Harga Beli","Harga Jual"};
        tabmode = new DefaultTableModel(null, Baris);
        String cariitem=txtcari.getText();
        
        try{
            String sql = "SELECT * FROM barang WHERE id LIKE '%"+cariitem+"%' OR nmbrg LIKE '%"+cariitem+"%' ORDER BY id ASC";
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                tabmode.addRow(new Object[]{
                    hasil.getString(1),
                    hasil.getString(2),
                    hasil.getString(3),
                    hasil.getString(4),
                    hasil.getString(5),
                });
            }
            tblbrg.setModel(tabmode);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "data gagal dipanggil"+e);
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbjenis = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtbeli = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtjual = new javax.swing.JTextField();
        bsimpan = new javax.swing.JButton();
        bubah = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        bbatal = new javax.swing.JButton();
        txtnm = new javax.swing.JTextField();
        bkeluar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtcari = new javax.swing.JTextField();
        bcari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblbrg = new javax.swing.JTable();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DATA BARANG");

        jLabel2.setText("ID Barang");

        jLabel3.setText("Nama Barang");

        jLabel4.setText("Jenis");

        cbjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Minuman" }));

        jLabel5.setText("Harag beli");

        jLabel6.setText("Harga jual");

        txtjual.addActionListener(this::txtjualActionPerformed);

        bsimpan.setText("Simpan");
        bsimpan.addActionListener(this::bsimpanActionPerformed);

        bubah.setText("Ubah");
        bubah.addActionListener(this::bubahActionPerformed);

        bhapus.setText("Hapus");
        bhapus.addActionListener(this::bhapusActionPerformed);

        bbatal.setText("Batal");
        bbatal.addActionListener(this::bbatalActionPerformed);

        bkeluar.setText("Keluar");
        bkeluar.addActionListener(this::bkeluarActionPerformed);

        jLabel8.setText("Data Barang");

        txtcari.addActionListener(this::txtcariActionPerformed);

        bcari.setText("Cari");
        bcari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bcariMouseClicked(evt);
            }
        });
        bcari.addActionListener(this::bcariActionPerformed);

        tblbrg.setModel(new javax.swing.table.DefaultTableModel(
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
        tblbrg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblbrgMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblbrg);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bsimpan)
                            .addGap(18, 18, 18)
                            .addComponent(bubah)
                            .addGap(18, 18, 18)
                            .addComponent(bhapus)
                            .addGap(18, 18, 18)
                            .addComponent(bbatal)
                            .addGap(18, 18, 18)
                            .addComponent(bkeluar))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel8)
                                        .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtbeli)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(6, 6, 6)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(cbjenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(txtjual)))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(40, 40, 40)
                                                    .addComponent(txtnm, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addComponent(bcari)))
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(59, 59, 59)
                                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 14, Short.MAX_VALUE))))))
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbjenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtbeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtjual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bsimpan)
                    .addComponent(bubah)
                    .addComponent(bhapus)
                    .addComponent(bbatal)
                    .addComponent(bkeluar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcari, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtjualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjualActionPerformed

    private void bubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bubahActionPerformed
                                      
        String jenis = cbjenis.getSelectedItem().toString();
        try {
            String sql = "UPDATE barang SET nmbrg=?, jenis=?, hrgbeli=?, hrgjual=? WHERE id=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtnm.getText());
            stat.setString(2, jenis);
            stat.setString(3, txtbeli.getText());
            stat.setString(4, txtjual.getText());
            stat.setString(5, txtid.getText());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Barang Berhasil Diubah");
            kosong();
            txtid.requestFocus();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah: " + e);
        }
        datatable(); 
 
    }//GEN-LAST:event_bubahActionPerformed

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
     
  String jenis = cbjenis.getSelectedItem().toString();
        String sql = "INSERT INTO barang VALUES (?,?,?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtid.getText());
            stat.setString(2, txtnm.getText());
            stat.setString(3, jenis);
            stat.setString(4, txtbeli.getText());
            stat.setString(5, txtjual.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Barang Berhasil Disimpan");
            kosong();
            txtid.requestFocus();
            datatable();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan: " + e);
        }
    }//GEN-LAST:event_bsimpanActionPerformed

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
                                           
    int ok = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus data barang ini?", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
    
    if (ok == 0) { // 0 berarti tombol YES diklik
        // Sesuaikan nama tabel menjadi 'barang'
        String sql = "DELETE FROM barang WHERE id = '" + txtid.getText() + "'";
        
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Barang Berhasil Dihapus");
            
            kosong();             // Mengosongkan field setelah hapus
            txtid.requestFocus(); // Fokus kembali ke ID
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus: " + e);
        }
        datatable(); // Refresh tampilan tabel agar data yang dihapus hilang
    }
    }//GEN-LAST:event_bhapusActionPerformed

    private void bbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbatalActionPerformed
        kosong();
    }//GEN-LAST:event_bbatalActionPerformed

    private void bkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkeluarActionPerformed
     dispose();
    }//GEN-LAST:event_bkeluarActionPerformed

    private void bcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcariActionPerformed
      datatable();
    }//GEN-LAST:event_bcariActionPerformed

    private void bcariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bcariMouseClicked
     
  
    }//GEN-LAST:event_bcariMouseClicked
private void txtcariKeyPressed(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            datatable();
}
    }
    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed
       
    }//GEN-LAST:event_txtcariActionPerformed

    private void tblbrgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblbrgMouseClicked
       int bar = tblbrg.getSelectedRow();
txtid.setText(tabmode.getValueAt(bar, 0).toString());
txtnm.setText(tabmode.getValueAt(bar, 1).toString());
cbjenis.setSelectedItem(tabmode.getValueAt(bar, 2).toString());
txtbeli.setText(tabmode.getValueAt(bar, 3).toString());
txtjual.setText(tabmode.getValueAt(bar, 4).toString());
    }//GEN-LAST:event_tblbrgMouseClicked

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Databarang().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbatal;
    private javax.swing.JButton bcari;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bkeluar;
    private javax.swing.JButton bsimpan;
    private javax.swing.JButton bubah;
    private javax.swing.JComboBox<String> cbjenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblbrg;
    private javax.swing.JTextField txtbeli;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtjual;
    private javax.swing.JTextField txtnm;
    // End of variables declaration//GEN-END:variables
}
