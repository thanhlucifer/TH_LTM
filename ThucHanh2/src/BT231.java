
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thanh
 */
public class BT231 extends javax.swing.JFrame {

    /**
     * Creates new form BT321
     */
    public BT231() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        psngaunhien = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        textMSNT = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        textMKSNT = new javax.swing.JTextArea();
        mauSNT = new javax.swing.JButton();
        maukSNT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Phan so ngau nhien");

        psngaunhien.setColumns(20);
        psngaunhien.setRows(5);
        jScrollPane1.setViewportView(psngaunhien);

        jButton1.setText("ngau nhien");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        textMSNT.setColumns(20);
        textMSNT.setRows(5);
        jScrollPane3.setViewportView(textMSNT);

        textMKSNT.setColumns(20);
        textMKSNT.setRows(5);
        jScrollPane4.setViewportView(textMKSNT);

        mauSNT.setText("PS mẫu là SNT");
        mauSNT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mauSNTActionPerformed(evt);
            }
        });

        maukSNT.setText("PS mẫu K là SNT");
        maukSNT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maukSNTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton1)
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(mauSNT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(maukSNT)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mauSNT)
                    .addComponent(maukSNT))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Random random = new Random();
                PhanSo[] phanSoArr = new PhanSo[20];
                for (int i = 0; i < 20; i++) {
                    int tuSo = random.nextInt(10) + 1;
                    int mauSo = random.nextInt(10) + 1;
                    PhanSo phanSo = new PhanSo(tuSo, mauSo);
                    phanSoArr[i] = phanSo;
                }
                savePhanSoToFile(phanSoArr);
                StringBuilder result = new StringBuilder();
                 for (PhanSo phanSo : phanSoArr) {
                    result.append(phanSo).append("\n");
                 }
                psngaunhien.setText(result.toString());

    JOptionPane.showMessageDialog(null, "Đã tạo và lưu phân số ngẫu nhiên vào file.");
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mauSNTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mauSNTActionPerformed
        // TODO add your handling code here:
                PhanSo[] phanSoArr = readPhanSoFromFile();
                StringBuilder result = new StringBuilder();
                for (PhanSo phanSo : phanSoArr) {
                    if (phanSo.isMauSoNguyenTo()) {
                        result.append(phanSo).append("\n");
                    }
                }
                textMSNT.setText(result.toString());
    }//GEN-LAST:event_mauSNTActionPerformed

    private void maukSNTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maukSNTActionPerformed
        // TODO add your handling code here:
                PhanSo[] phanSoArr = readPhanSoFromFile();
                StringBuilder result = new StringBuilder();
                for (PhanSo phanSo : phanSoArr) {
                    if (!phanSo.isMauSoNguyenTo()) {
                        result.append(phanSo).append("\n");
                    }
                }
                textMKSNT.setText(result.toString());
    }//GEN-LAST:event_maukSNTActionPerformed

    private static final String FILE_PATH = "D:\\phanso.dat";

    private static void savePhanSoToFile(PhanSo[] phanSoArr) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
            outputStream.writeObject(phanSoArr);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static PhanSo[] readPhanSoFromFile() {
        PhanSo[] phanSoArr = null;
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE_PATH));
            phanSoArr = (PhanSo[]) inputStream.readObject();
            inputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return phanSoArr;
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
            java.util.logging.Logger.getLogger(BT231.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BT231.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BT231.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BT231.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BT231().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton mauSNT;
    private javax.swing.JButton maukSNT;
    private javax.swing.JTextArea psngaunhien;
    private javax.swing.JTextArea textMKSNT;
    private javax.swing.JTextArea textMSNT;
    // End of variables declaration//GEN-END:variables
}
