/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.LoanController;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Customer;
import model.Loan_asset;
import model.Loan_none_asset;
import model.User;

/**
 *
 * @author phamt
 */
public class RegistryLoanview extends javax.swing.JFrame {

    private LoanController loan;
    private Loan_asset loan_aset;
    private Loan_none_asset loan_none_asset;
    public static Customer customerRegister;
    private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date now = new Date();
    String strDate = sdf.format(now);

    /**
     * Creates new form RegistryLoanview
     */
    public RegistryLoanview(Customer customer) {
        initComponents();
        loan = new LoanController();
        ngan_han.setEnabled(false);
        dai_han.setEnabled(false);
        tieu_dung.setEnabled(false);
        vay_ngay.setEnabled(false);
        ban_dau.setEnabled(false);
        giam_dan.setEnabled(false);
        customerRegister = customer;
        //SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");//dd/MM/yyyy
    }

    public void RegisLoanCustomer() {

        int idText = customerRegister.getId();
        String tongtien = jTextField2.getText();
        LocalDate localDate = LocalDate.now();
        String ngaybd = DateTimeFormatter.ofPattern("yyy-MM-dd").format(localDate);
        Date date = new Date();
        String type = "";
        if (tai_san.isSelected() == false && ko_tai_san.isSelected() == false) {
            JOptionPane.showMessageDialog(this, "Chưa chọn gói vay.");
            return;
        }
        if (tai_san.isSelected() == true && ngan_han.isSelected() == false && dai_han.isSelected() == false) {
            JOptionPane.showMessageDialog(this, "Chưa chọn thời hạn vay.");
            return;
        }
        if (tongtien.equals("") == true) {
            JOptionPane.showMessageDialog(this, "Không để trống tổng tiền");
            return;
        }
        if (ngaybd.equals("") == true) {
            JOptionPane.showMessageDialog(this, "Không để trống ngày bắt đầu");
            return;
        }
        if (day_du.isSelected() == false && chua_day_du.isSelected() == false) {
            JOptionPane.showMessageDialog(this, "Chưa xác nhận hồ sơ");
            return;
        }
        if (checkNum(tongtien) == false) {
            JOptionPane.showMessageDialog(this, "Nhập sai tiền hoặc dưới 1000.000 vnd");
            return;
        }
        if (tai_san.isSelected()) {
                loan_aset = new Loan_asset();
            if(ngan_han.isSelected())
            {
                loan_aset.setTerm("ngắn hạn");
            }
            if(dai_han.isSelected())
            {
                loan_aset.setTerm("dài hạn");
            }
            ngan_han.setEnabled(true);
            dai_han.setEnabled(true);
            if (day_du.isSelected()) {
                loan_aset.setCustomer_id(customerRegister.getId());
                loan_aset.setAmount(Integer.parseInt(tongtien));
                loan_aset.setStart_date(date);
                loan_aset.setStatus("continue");

                loan.RegisCustomerAsetLoan(loan_aset);
                JOptionPane.showMessageDialog(this, "Đăng ký thành công");
            } else {
                JOptionPane.showMessageDialog(this, "Hoàn thành và xác nhận hồ sơ để tiếp tục");
            }
        } else {
            loan_none_asset = new Loan_none_asset();
            if (tieu_dung.isSelected()) {
                loan_none_asset.setType_purpose("vay tiêu dùng");
            }
            if (vay_ngay.isSelected()) {
                loan_none_asset.setType_purpose("vay ngày");
            }
            if (ban_dau.isSelected()) {
                loan_none_asset.setType_loan("dư nợ ban đầu");
            }
            if (giam_dan.isSelected()) {
                loan_none_asset.setType_loan("dư nợ giảm dần");
            }
            if (day_du.isSelected()) {
                loan_none_asset.setCustomer_id(customerRegister.getId());
                loan_none_asset.setAmount(Integer.parseInt(tongtien));
                loan_none_asset.setStart_date(date);
                loan_none_asset.setStatus("continue");

                loan.RegisCustomerNoneAsetLoan(loan_none_asset);
                JOptionPane.showMessageDialog(this, "Đăng ký thành công");
            }
        }

    }

    public boolean checkNumInterger(String s) {
        double x;
        try {
            x = Double.parseDouble(s);
            if (x <= 0) {
                return false;
            }
            if (x % 1 == 0) {
                return true;
            } else {
                return false;
            }
        } catch (NumberFormatException e) {

            return false;
        }
    }

    public boolean checkNum(String s) {
        double x;
        try {
            x = Double.parseDouble(s);
            if (x <= 1000000) {
                JOptionPane.showMessageDialog(this, "Tiền phải lớn hơn 1000.000 VND");
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, s + "- Không phải số");
            return false;
        }
    }

    public boolean isThisDateValid(String dateToValidate) {

        if (dateToValidate == null) {
            return false;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setLenient(false);

        try {

            //if not valid, it will throw ParseException
            Date date = sdf.parse(dateToValidate);
            System.out.println(date);

        } catch (ParseException e) {

            e.printStackTrace();
            JOptionPane.showMessageDialog(this, dateToValidate + " - Không nhập đúng định dạng yyyy-MM-dd HH:mm:ss");
            return false;
        }
        JOptionPane.showMessageDialog(this, dateToValidate + " - Không nhập đúng định dạng yyyy-MM-dd HH:mm:ss");
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tai_san = new javax.swing.JRadioButton();
        ko_tai_san = new javax.swing.JRadioButton();
        ngan_han = new javax.swing.JRadioButton();
        dai_han = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        day_du = new javax.swing.JRadioButton();
        chua_day_du = new javax.swing.JRadioButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        tieu_dung = new javax.swing.JRadioButton();
        vay_ngay = new javax.swing.JRadioButton();
        ban_dau = new javax.swing.JRadioButton();
        giam_dan = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng ký gói vay");
        setAlwaysOnTop(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Đăng ký gói vay");

        jLabel3.setText("Chọn gói vay:");

        tai_san.setText("Có tài sản đảm bảo");
        tai_san.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tai_sanMouseClicked(evt);
            }
        });

        ko_tai_san.setText("Không tài sản đảm bảo");
        ko_tai_san.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ko_tai_sanMouseClicked(evt);
            }
        });
        ko_tai_san.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ko_tai_sanActionPerformed(evt);
            }
        });

        ngan_han.setText("Ngắn hạn");
        ngan_han.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ngan_hanMouseClicked(evt);
            }
        });
        ngan_han.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ngan_hanActionPerformed(evt);
            }
        });

        dai_han.setText("Dài hạn");
        dai_han.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dai_hanMouseClicked(evt);
            }
        });

        jLabel4.setText("Tổng tiền vay:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Hạn cho vay:");

        jLabel7.setText("Xác nhận hồ hơ:");

        day_du.setText("Đã đầy đủ");
        day_du.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                day_duMouseClicked(evt);
            }
        });

        chua_day_du.setText("Chưa đầy đủ");
        chua_day_du.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chua_day_duMouseClicked(evt);
            }
        });

        jToggleButton1.setText("Đăng ký cho vay");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jButton1.setText("Quay lại");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tieu_dung.setText("Vay tiêu dùng");
        tieu_dung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tieu_dungMouseClicked(evt);
            }
        });
        tieu_dung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tieu_dungActionPerformed(evt);
            }
        });

        vay_ngay.setText("Vay ngày");
        vay_ngay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vay_ngayMouseClicked(evt);
            }
        });

        ban_dau.setText("Dư nợ ban đầu");
        ban_dau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ban_dauMouseClicked(evt);
            }
        });
        ban_dau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ban_dauActionPerformed(evt);
            }
        });

        giam_dan.setText("Dư nợ giảm dần");
        giam_dan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                giam_danMouseClicked(evt);
            }
        });
        giam_dan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giam_danActionPerformed(evt);
            }
        });

        jLabel2.setText("Khoản vay");

        jLabel5.setText("Cách tính lãi");

        jLabel8.setText("Kỳ hạn");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jToggleButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(day_du)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chua_day_du))
                            .addComponent(jTextField2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ban_dau)
                                    .addComponent(tieu_dung))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vay_ngay)
                                    .addComponent(giam_dan))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(ngan_han)
                                .addGap(43, 43, 43)
                                .addComponent(dai_han)
                                .addGap(114, 114, 114))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ko_tai_san)
                                    .addComponent(tai_san)
                                    .addComponent(jLabel1))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tai_san))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ngan_han)
                    .addComponent(dai_han)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(ko_tai_san)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tieu_dung)
                            .addComponent(vay_ngay))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ban_dau)
                            .addComponent(giam_dan))))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(day_du)
                    .addComponent(chua_day_du))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(jButton1))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        RegisLoanCustomer();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void tai_sanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tai_sanMouseClicked
        // TODO add your handling code here:
        if (tai_san.isSelected()) {
            ngan_han.setEnabled(true);
            dai_han.setEnabled(true);
            ngan_han.setVisible(true);
            dai_han.setVisible(true);

            ko_tai_san.setVisible(false);
            tieu_dung.setVisible(false);
            vay_ngay.setVisible(false);
            ban_dau.setVisible(false);
            giam_dan.setVisible(false);
        } else {
            ngan_han.setEnabled(false);
            dai_han.setEnabled(false);
            ko_tai_san.setVisible(true);
        }
    }//GEN-LAST:event_tai_sanMouseClicked

    private void ko_tai_sanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ko_tai_sanMouseClicked
        // TODO add your handling code here:
        if (ko_tai_san.isSelected()) {
            tai_san.setVisible(false);
            tieu_dung.setVisible(true);
            vay_ngay.setVisible(true);
            ban_dau.setVisible(true);
            giam_dan.setVisible(true);
            tieu_dung.setEnabled(true);
            vay_ngay.setEnabled(true);
            ban_dau.setEnabled(true);
            giam_dan.setEnabled(true);

            ngan_han.setVisible(false);
            dai_han.setVisible(false);
        } else {
            tai_san.setVisible(true);
        }
    }//GEN-LAST:event_ko_tai_sanMouseClicked

    private void ngan_hanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ngan_hanMouseClicked
        // TODO add your handling code here:
        if (ngan_han.isSelected()) {
            dai_han.setVisible(false);

        } else {
            dai_han.setVisible(true);
        }
    }//GEN-LAST:event_ngan_hanMouseClicked

    private void dai_hanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dai_hanMouseClicked
        // TODO add your handling code here:
        if (dai_han.isSelected()) {
            ngan_han.setVisible(false);
        } else {
            ngan_han.setVisible(true);
        }
    }//GEN-LAST:event_dai_hanMouseClicked

    private void day_duMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_day_duMouseClicked
        // TODO add your handling code here:
        if (day_du.isSelected()) {
            chua_day_du.setVisible(false);
        } else {
            chua_day_du.setVisible(true);
        }
    }//GEN-LAST:event_day_duMouseClicked

    private void chua_day_duMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chua_day_duMouseClicked
        // TODO add your handling code here:
        if (chua_day_du.isSelected()) {
            day_du.setVisible(false);
        } else {
            day_du.setVisible(true);
        }
    }//GEN-LAST:event_chua_day_duMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        InformationLoan info = new InformationLoan();
        info.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ban_dauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ban_dauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ban_dauActionPerformed

    private void giam_danActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giam_danActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_giam_danActionPerformed

    private void ko_tai_sanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ko_tai_sanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ko_tai_sanActionPerformed

    private void tieu_dungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tieu_dungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tieu_dungActionPerformed

    private void ngan_hanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ngan_hanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ngan_hanActionPerformed

    private void tieu_dungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tieu_dungMouseClicked
        if(tieu_dung.isSelected())
        {
            vay_ngay.setVisible(false);
        }
        else
        {
            vay_ngay.setVisible(true);
        }
    }//GEN-LAST:event_tieu_dungMouseClicked

    private void vay_ngayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vay_ngayMouseClicked
        if(vay_ngay.isSelected())
        {
            tieu_dung.setVisible(false);
        }
        else
        {
            tieu_dung.setVisible(true);
        }
    }//GEN-LAST:event_vay_ngayMouseClicked

    private void ban_dauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ban_dauMouseClicked
        if(ban_dau.isSelected())
        {
            giam_dan.setVisible(false);
        }
        else
        {
            giam_dan.setVisible(true);
        }
    }//GEN-LAST:event_ban_dauMouseClicked

    private void giam_danMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_giam_danMouseClicked
        if(giam_dan.isSelected())
        {
            ban_dau.setVisible(false);
        }
        else
        {
            ban_dau.setVisible(true);
        }
    }//GEN-LAST:event_giam_danMouseClicked

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
            java.util.logging.Logger.getLogger(RegistryLoanview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistryLoanview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistryLoanview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistryLoanview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistryLoanview(customerRegister).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ban_dau;
    private javax.swing.JRadioButton chua_day_du;
    private javax.swing.JRadioButton dai_han;
    private javax.swing.JRadioButton day_du;
    private javax.swing.JRadioButton giam_dan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JRadioButton ko_tai_san;
    private javax.swing.JRadioButton ngan_han;
    private javax.swing.JRadioButton tai_san;
    private javax.swing.JRadioButton tieu_dung;
    private javax.swing.JRadioButton vay_ngay;
    // End of variables declaration//GEN-END:variables
}
