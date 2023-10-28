/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanh2;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ADMIN
 */
public class ThaoTacVoiFile extends javax.swing.JFrame {

    /**
     * Creates new form ThaoTacVoiFile
     */
    public ThaoTacVoiFile() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTenTapTin = new javax.swing.JTextField();
        txtChuoi = new javax.swing.JTextField();
        txtNoiDung = new javax.swing.JTextField();
        btnDocNhiPhan = new javax.swing.JButton();
        btnGhiNhiPhan = new javax.swing.JButton();
        btnDocVanBan = new javax.swing.JButton();
        btnGhiVanBan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thao tác với file");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nhập tên tập tin");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nhập chuỗi");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nội dung file");

        txtTenTapTin.setText("D:\\a.txt");

        txtChuoi.setText("12345678");

        btnDocNhiPhan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDocNhiPhan.setText("Đọc file nhị phân");
        btnDocNhiPhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocNhiPhanActionPerformed(evt);
            }
        });

        btnGhiNhiPhan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGhiNhiPhan.setText("Ghi file nhị phân");
        btnGhiNhiPhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiNhiPhanActionPerformed(evt);
            }
        });

        btnDocVanBan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDocVanBan.setText("Đọc file văn bản");
        btnDocVanBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocVanBanActionPerformed(evt);
            }
        });

        btnGhiVanBan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGhiVanBan.setText("Ghi file văn bản");
        btnGhiVanBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiVanBanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtChuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenTapTin, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnDocVanBan)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGhiVanBan))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnDocNhiPhan)
                            .addGap(18, 18, 18)
                            .addComponent(btnGhiNhiPhan))))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTenTapTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtChuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDocNhiPhan)
                    .addComponent(btnGhiNhiPhan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDocVanBan)
                    .addComponent(btnGhiVanBan))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDocNhiPhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocNhiPhanActionPerformed
        // TODO add your handling code here:
        byte a[];
        File file;
        try{
            file = new File(txtTenTapTin.getText());
            FileInputStream fi = new FileInputStream(file);
            a = new byte[fi.available()];
            fi.read(a);
            fi.close();
            txtNoiDung.setText(new String(a));
        }catch(IOException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDocNhiPhanActionPerformed

    private void btnGhiNhiPhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiNhiPhanActionPerformed
        // TODO add your handling code here:
        byte a[] = new byte[20];
        File file;
        int i;
        char s[] = txtChuoi.getText().toCharArray();
        for(i = 0; i < s.length; i++){
            a[i] = (byte)s[i];
        }
        try{
            file = new File(txtTenTapTin.getText());
            FileOutputStream fo = new FileOutputStream(file);
            fo.write(a);
            fo.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnGhiNhiPhanActionPerformed

    private void btnDocVanBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocVanBanActionPerformed
        // TODO add your handling code here:
        
        try{
            FileReader fr = new FileReader(new File(txtTenTapTin.getText()));
            StringBuffer sb = new StringBuffer();
            char ca[] = new char[5];
            while(fr.ready()){
                int len = fr.read(ca);
                sb.append(ca,0,len);
            }
            fr.close();
            txtNoiDung.setText(sb+"");
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDocVanBanActionPerformed

    private void btnGhiVanBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiVanBanActionPerformed
        // TODO add your handling code here:
        try{
            FileWriter fw = new FileWriter(new File(txtTenTapTin.getText()));
            fw.write(txtChuoi.getText());
            fw.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnGhiVanBanActionPerformed

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
            java.util.logging.Logger.getLogger(ThaoTacVoiFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThaoTacVoiFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThaoTacVoiFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThaoTacVoiFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThaoTacVoiFile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDocNhiPhan;
    private javax.swing.JButton btnDocVanBan;
    private javax.swing.JButton btnGhiNhiPhan;
    private javax.swing.JButton btnGhiVanBan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtChuoi;
    private javax.swing.JTextField txtNoiDung;
    private javax.swing.JTextField txtTenTapTin;
    // End of variables declaration//GEN-END:variables
}
