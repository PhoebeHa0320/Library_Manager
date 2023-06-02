/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLTV;

import QLTV.controller.DocGiaControl;
import QLTV.helpers.DataValidator;
import QLTV.helpers.MessageDialogHelper;
import QLTV.model.DocGia;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.*;

/**
 *
 * @author ngohien
 */
public class QuanLyDocGia extends javax.swing.JPanel {
    private MainForm parentForm;
    private DefaultTableModel tblModel;

    /**
     * Creates new form QuanLyDocGia
     */
    public QuanLyDocGia() {
        initComponents();
        
        initTable();
        
        loadDatatoTable();
    }

    private void initTable(){
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"Họ tên DG", "Loại DG", 
            "Ngày sinh", "Địa chỉ", "Email", "Ngày lập thẻ"});
        tblDocGia.setModel(tblModel);
    }
    
    private void loadDatatoTable(){
        try {
            DocGiaControl control = new DocGiaControl();
            List<DocGia> list = control.findAll();
            tblModel.setRowCount(0);
            for (DocGia it : list) {
                tblModel.addRow(new Object[]{
                    it.getHoTenDG(),it.getLoaiDG(),it.getNgaySinh(),
                    it.getDiaChi(),it.getEmail(), it.getNgayLapThe()
                });
            }
            tblModel.fireTableDataChanged();
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(),"Lỗi");
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDocGia = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnTaoMoi = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDocGia = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtNgayLapThe = new javax.swing.JTextField();
        cmbLoaiDG = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản Lý Độc Giả");

        tblDocGia.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDocGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDocGiaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDocGia);

        btnTaoMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/new-icon16.png"))); // NOI18N
        btnTaoMoi.setText("Tạo Mới");
        btnTaoMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoMoiActionPerformed(evt);
            }
        });

        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/luu16.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Actions-document-edit-icon-16.png"))); // NOI18N
        btnCapNhat.setText("Cập Nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Actions-edit-delete-icon-16.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTaoMoi)
                .addGap(28, 28, 28)
                .addComponent(btnLuu)
                .addGap(32, 32, 32)
                .addComponent(btnCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(btnXoa)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTaoMoi)
                    .addComponent(btnLuu)
                    .addComponent(btnCapNhat)
                    .addComponent(btnXoa))
                .addContainerGap())
        );

        jLabel2.setText("Tên Độc Giả:");

        jLabel3.setText("Loại Độc Giả:");

        jLabel4.setText("Ngày Sinh:");

        jLabel5.setText("Địa Chỉ:");

        jLabel6.setText("Email:");

        jLabel7.setText("Ngày Lập Thẻ:");

        txtNgayLapThe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayLapTheActionPerformed(evt);
            }
        });

        cmbLoaiDG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Y", "X" }));
        cmbLoaiDG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLoaiDGActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(11, 11, 11))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgayLapThe)
                            .addComponent(txtEmail)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cmbLoaiDG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtNgaySinh))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtDiaChi)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(cmbLoaiDG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNgayLapThe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE))
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator1))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNgayLapTheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayLapTheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayLapTheActionPerformed

    private void btnTaoMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoMoiActionPerformed
        txtDocGia.setText("");
        txtDiaChi.setText("");
        txtEmail.setText("");
        txtNgaySinh.setText("");
        txtNgayLapThe.setText("");
    }//GEN-LAST:event_btnTaoMoiActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.ValidateEmty(txtDocGia, sb,"Tên độc giả không được để trống");
        DataValidator.ValidateEmty(txtNgaySinh, sb,"Ngày sinh không được để trống");
        DataValidator.ValidateEmty(txtDiaChi, sb,"Địa chỉ không được để trống");
        DataValidator.ValidateEmty(txtEmail, sb,"Email không được để trống");
        DataValidator.ValidateEmty(txtNgayLapThe, sb,"Ngày lập thẻ không được để trống");
        
        if(sb.length() >0){
            MessageDialogHelper.showErrorDialog(parentForm,sb.toString(), "Lỗi");
            return;
        }
        try {
            DocGia dg = new DocGia();
            dg.setHoTenDG(txtDocGia.getText());
            dg.setNgaySinh(txtNgaySinh.getText());
            dg.setDiaChi(txtDiaChi.getText());
            dg.setEmail(txtEmail.getText());
            dg.setNgayLapThe(txtNgayLapThe.getText());
            dg.setLoaiDG(cmbLoaiDG.getSelectedItem().toString());

           
            DocGiaControl control = new DocGiaControl();
            if(control.insert(dg)){
                MessageDialogHelper.showMessageDialog(parentForm, "Độc giả đã được lưu", "Thông báo");
                loadDatatoTable();
            }else{
                MessageDialogHelper.showConfirmDialog(parentForm, "Độc giả không được lưu do lỗi", "Cảnh báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, 
                    e.getMessage(),"Lỗi");
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void cmbLoaiDGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLoaiDGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbLoaiDGActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.ValidateEmty(txtDocGia, sb,"Tên độc giả không được để trống");
        DataValidator.ValidateEmty(txtNgaySinh, sb,"Ngày sinh không được để trống");
        DataValidator.ValidateEmty(txtDiaChi, sb,"Địa chỉ không được để trống");
        DataValidator.ValidateEmty(txtEmail, sb,"Emailkhông được để trống");
        DataValidator.ValidateEmty(txtNgayLapThe, sb,"Ngày lập thẻ không được để trống");
        
        if(sb.length() >0){
            MessageDialogHelper.showErrorDialog(parentForm,sb.toString(), "Lỗi");
            return;
        }
        if(MessageDialogHelper.showConfirmDialog(parentForm, 
                "Bạn có muốn cập nhật thông tin độc giả không?", "Hỏi")==JOptionPane.NO_OPTION){
            return;
        }
        try {
            DocGia dg = new DocGia();
            dg.setHoTenDG(txtDocGia.getText());
            dg.setNgaySinh(txtNgaySinh.getText());
            dg.setDiaChi(txtDiaChi.getText());
            dg.setEmail(txtEmail.getText());
            dg.setNgayLapThe(txtNgayLapThe.getText());
            dg.setLoaiDG(cmbLoaiDG.getSelectedItem().toString());

            DocGiaControl control = new DocGiaControl();
            if(control.update(dg)){
                MessageDialogHelper.showMessageDialog(parentForm, "Độc giả đã được cập nhật", "Thông báo");
                loadDatatoTable();
            }else{
                MessageDialogHelper.showConfirmDialog(parentForm, "Độc giả không được cập nhật do lỗi", "Cảnh báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, 
                    e.getMessage(),"Lỗi");
        }        
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.ValidateEmty(txtDocGia, sb,"Tên độc giả không được để trống");
        if(sb.length() >0){
            MessageDialogHelper.showErrorDialog(parentForm,sb.toString(), "Lỗi");
            return;
        }
        if(MessageDialogHelper.showConfirmDialog(parentForm, 
                "Bạn có muốn xóa thông tin độc giả không?", "Hỏi")==JOptionPane.NO_OPTION){
            return;
        }
        try {
            DocGiaControl control = new DocGiaControl();
            if(control.delete(txtDocGia.getText())){
                MessageDialogHelper.showMessageDialog(parentForm, "Độc giả đã được xóa", "Thông báo");
                btnTaoMoiActionPerformed(evt);
                loadDatatoTable();
            }else{
                MessageDialogHelper.showConfirmDialog(parentForm, "Độc giả không được xóa do lỗi", "Cảnh báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, 
                    e.getMessage(),"Lỗi");
        } 
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblDocGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDocGiaMouseClicked
        try {
            int row = tblDocGia.getSelectedRow();
            
            if(row>=0){
                String id = (String) tblDocGia.getValueAt(row,0);
                DocGiaControl control= new DocGiaControl();
                DocGia dg = control.findById(id);
                
                if(dg!=null){
                    txtDocGia.setText(dg.getHoTenDG());
                    txtNgaySinh.setText(dg.getNgaySinh());
                    txtEmail.setText(dg.getEmail());
                    txtDiaChi.setText(dg.getDiaChi());
                    txtNgayLapThe.setText(dg.getNgayLapThe());
                    cmbLoaiDG.setSelectedItem(dg.getLoaiDG());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, 
                    e.getMessage(),"Lỗi");            
        }
    }//GEN-LAST:event_tblDocGiaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnTaoMoi;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbLoaiDG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblDocGia;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtDocGia;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNgayLapThe;
    private javax.swing.JTextField txtNgaySinh;
    // End of variables declaration//GEN-END:variables
}