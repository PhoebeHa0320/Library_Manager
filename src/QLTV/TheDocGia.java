/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLTV;

import QLTV.controller.DocGiaControl;
import QLTV.helpers.MessageDialogHelper;
import QLTV.model.DocGia;
import java.util.List;

/**
 *
 * @author ngohien
 */
public class TheDocGia extends javax.swing.JPanel {
    private MainForm parentForm;
    /**
     * Creates new form TheDocGia
     */
    public TheDocGia() {
        initComponents();
        initComBoBox();
        
    }
       
    private void initComBoBox(){
        try {
            DocGiaControl control = new DocGiaControl();
            List<DocGia> list = control.findAll();            
            cbxTenDG.removeAllItems();
            for(DocGia it : list){
                cbxTenDG.addItem(it.getHoTenDG());
            }
                
        } catch (Exception e) {
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(),"Lỗi");
            e.printStackTrace();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbxTenDG = new javax.swing.JComboBox<>();
        btnxemchitiet = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Xem thông tin thẻ độc giả");

        jLabel2.setText("Tên Độc Giả: ");

        cbxTenDG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTenDGActionPerformed(evt);
            }
        });

        btnxemchitiet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/open-file-icon-16.png"))); // NOI18N
        btnxemchitiet.setText("Xem chi tiết");
        btnxemchitiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxemchitietActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbxTenDG, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnxemchitiet)
                        .addGap(0, 36, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxTenDG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnxemchitiet))
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnxemchitietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxemchitietActionPerformed
        String HoTenDG = cbxTenDG.getSelectedItem().toString();

        ViewTheDG vt = new ViewTheDG(HoTenDG);
        vt.setVisible(true);
    }//GEN-LAST:event_btnxemchitietActionPerformed

    private void cbxTenDGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTenDGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTenDGActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnxemchitiet;
    private javax.swing.JComboBox<String> cbxTenDG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
