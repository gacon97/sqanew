/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.CaculateInterest;

/**
 *
 * @author nam
 */
public class JFrameCaculateRegister extends javax.swing.JFrame {

    private ArrayList<CaculateInterest> list;
    DefaultTableModel model;
    private int size = 0;
    /**
     * Creates new form JFrameCaculateRegister
     */
    public JFrameCaculateRegister() {
        initComponents();
        this.setLocationRelativeTo(null);
        list = new ArrayList();
        
        model = (DefaultTableModel) jTable1.getModel();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbHinhThucVay = new javax.swing.JComboBox<>();
        btnKetQua = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtSoTienVay = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtThoiGianVay = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtLaiXuat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lbTienGocTraHangThang = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbTienLaiTraThangDauTien = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbTongSoTienTraThangDauTien = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tính Lãi");

        jLabel2.setText("Chọn hình thức vay");

        cbHinhThucVay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vay Tín Chấp", "Vay Thế Chấp" }));
        cbHinhThucVay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHinhThucVayActionPerformed(evt);
            }
        });

        btnKetQua.setText("Kết quả");
        btnKetQua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetQuaActionPerformed(evt);
            }
        });

        jLabel3.setText("Số tiền bạn cần vay");

        txtSoTienVay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoTienVayActionPerformed(evt);
            }
        });

        jLabel4.setText("VND");

        jLabel5.setText("Thời gian vay");

        jLabel6.setText("Tháng");

        jLabel7.setText("Lãi xuất theo dự nợ giảm dần");

        jLabel8.setText("Tiền gốc phải trả hàng tháng");

        lbTienGocTraHangThang.setText("tiền gốc");

        jLabel10.setText("VND");

        jLabel11.setText("Tiền lãi phải trả tháng đầu tiên");

        lbTienLaiTraThangDauTien.setText("tiền lãi");

        jLabel13.setText("VND");

        jLabel14.setText("Tổng tố tiền phải trả tháng đầu tiên");

        lbTongSoTienTraThangDauTien.setText("tổng ");

        jLabel16.setText("VND");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tháng", "Tiền vay còn lại", "Tiền vay trả hàng tháng", "Lãi trả hàng tháng", "Tổng tiền trả hàng tháng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel17.setText("Số tiền thanh toán hàng tháng");

        jLabel18.setText("%/năm");

        jButton1.setText("Tạo lại");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtLaiXuat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                .addComponent(txtThoiGianVay, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSoTienVay, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(lbTienGocTraHangThang, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTienLaiTraThangDauTien)
                            .addComponent(lbTongSoTienTraThangDauTien)
                            .addComponent(cbHinhThucVay, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13)
                            .addComponent(jLabel18)))
                    .addComponent(jLabel14)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnKetQua))
                    .addComponent(jLabel8)
                    .addComponent(jLabel2)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(173, 173, 173))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(476, 476, 476)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbHinhThucVay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSoTienVay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtThoiGianVay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtLaiXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTienGocTraHangThang, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel11)
                        .addGap(10, 10, 10)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTienLaiTraThangDauTien)
                    .addComponent(jLabel13))
                .addGap(20, 20, 20)
                .addComponent(jLabel14)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTongSoTienTraThangDauTien)
                    .addComponent(jLabel16))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKetQua)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbHinhThucVayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHinhThucVayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbHinhThucVayActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        cbHinhThucVay.setSelectedIndex(0);
        txtSoTienVay.setText("");
        txtThoiGianVay.setText("");
        txtLaiXuat.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtSoTienVayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoTienVayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoTienVayActionPerformed

    private void btnKetQuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetQuaActionPerformed
        // TODO add your handling code here:
        Double soTienVay = Double.parseDouble(txtSoTienVay.getText());
        int thoiGianVay = Integer.parseInt(txtThoiGianVay.getText());
        Double laiXuat = Double.parseDouble(txtLaiXuat.getText());

        size = thoiGianVay;
        
        // Số tiền gốc phải trả hàng tháng
        Double soTienGocTraHangThang = (Double) soTienVay / thoiGianVay;
        // lãi xuất tính trên tháng 
        Double laiXuatTrenThang = (Double) laiXuat / 12 / 100;
        // Số tiền lãi phải trả tháng đầu tiên 
        Double tienLaiTraThangDauTien = (Double) soTienVay * laiXuatTrenThang;
        
        // Mảng tiền gốc còn lại sau khi đã trừ tiền trả từng tháng một 
        ArrayList<Double> MangTienGocConLai = new ArrayList<>();
        // Mảng tiền lãi hàng tháng 
        ArrayList<Double> MangTienLai = new ArrayList<>();
        // Mảng tổng tiền phải trả hàng tháng 
        ArrayList<Double> MangTong = new ArrayList<>();
        for (int i = 1; i <= thoiGianVay; i++) {
            // Số tiền lãi phải trả tháng i 
            Double soTienLaiHangThang = (Double) soTienVay*laiXuatTrenThang;
            MangTienLai.add(soTienLaiHangThang);
            // Tổng số tiền phải trả tháng i 
            Double tong = (Double) soTienLaiHangThang + soTienGocTraHangThang;
            MangTong.add(tong);
            // Tổng số tiền gôc còn lại sau khi trừ số tiền gốc phải trả hàng tháng 
            soTienVay = (Double) (soTienVay - soTienGocTraHangThang);
            MangTienGocConLai.add(soTienVay);    
        }

        Double tong = soTienGocTraHangThang + tienLaiTraThangDauTien;
        lbTienGocTraHangThang.setText(soTienGocTraHangThang + "");
        lbTienLaiTraThangDauTien.setText(tienLaiTraThangDauTien + "");
        lbTongSoTienTraThangDauTien.setText(tong + "");

        CaculateInterest caculate = new CaculateInterest();
        caculate.setTienGocConLai(MangTienGocConLai);
        caculate.setTienLaiTraHangThang(MangTienLai);
        caculate.setGocTraHangThang(soTienGocTraHangThang);
        caculate.setTongTienTraHangThang(MangTong);
        list.add(caculate);
        showResult();
    }//GEN-LAST:event_btnKetQuaActionPerformed

    int j = 1;
    public void showResult() {
        CaculateInterest c = list.get(0);
        for(int i = 0; i < size; i++) {
            model.addRow(new Object[] {
                i+1, c.getTienGocConLai().get(i), c.getGocTraHangThang(), c.getTienLaiTraHangThang().get(i), c.getTongTienTraHangThang().get(i)
            });     
        }
    }
    
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
            java.util.logging.Logger.getLogger(JFrameCaculateRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCaculateRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCaculateRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCaculateRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCaculateRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKetQua;
    private javax.swing.JComboBox<String> cbHinhThucVay;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbTienGocTraHangThang;
    private javax.swing.JLabel lbTienLaiTraThangDauTien;
    private javax.swing.JLabel lbTongSoTienTraThangDauTien;
    private javax.swing.JTextField txtLaiXuat;
    private javax.swing.JTextField txtSoTienVay;
    private javax.swing.JTextField txtThoiGianVay;
    // End of variables declaration//GEN-END:variables
}
