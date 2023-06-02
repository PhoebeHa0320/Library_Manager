/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLTV;

import QLTV.controller.MuonTraControl;
import QLTV.helpers.DataValidator;
import QLTV.helpers.MessageDialogHelper;
import QLTV.model.MuonTraSach;
import java.awt.event.ActionEvent;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ngohien
 */
public class QLMuonTraSach extends javax.swing.JPanel {
    private MainForm parentForm;
    private DefaultTableModel tblModel;
    /**
     * Creates new form QLMuonTraSach
     */
    public QLMuonTraSach() {
        initComponents();
        
        initTable();
        
        loadDatatoTable();        
    }

        private void initTable(){
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"Ngày mượn", "Ngày trả", 
            "Họ tên DG", "Mã sách", "Tên sách", "Số ngày mượn", 
            "Số lượt mượn", "Số ngày trả trễ"});
        tblQLMuonTra.setModel(tblModel);
    }
    
    private void loadDatatoTable(){
        try {
            MuonTraControl control = new MuonTraControl();
            List<MuonTraSach> list = control.findAll();
            tblModel.setRowCount(0);
            for (MuonTraSach it : list) {
                tblModel.addRow(new Object[]{
                    it.getNgayMuon(),it.getNgayTra(),it.getHoTenDG(),
                    it.getMaSach(),it.getTenSach(), it.getSoNgayMuon(),
                    it.getSoLuotMuon(),it.getSoNgayTraTre()
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNgayMuon = new javax.swing.JTextField();
        txtNgayTra = new javax.swing.JTextField();
        txtHoTenDG = new javax.swing.JTextField();
        txtMaSach = new javax.swing.JTextField();
        txtTenSach = new javax.swing.JTextField();
        txtSoNgayMuon = new javax.swing.JTextField();
        txtSoLuotMuon = new javax.swing.JTextField();
        txtSoNgayTraTre = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnNhapMoi = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQLMuonTra = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Quản Lý Mượn Trả Sách");

        jLabel2.setText("Ngày Mượn:");

        jLabel3.setText("Ngày Trả:");

        jLabel4.setText("Họ Tên Độc Giả:");

        jLabel5.setText("Mã Sách:");

        jLabel6.setText("Tên Sách:");

        jLabel7.setText("Số Ngày Mượn:");

        jLabel8.setText("Số Lượt Mượn:");

        jLabel9.setText("Số Ngày Trả Trễ:");

        txtSoNgayMuon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSoNgayMuonKeyPressed(evt);
            }
        });

        txtSoNgayTraTre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoNgayTraTreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNgayMuon)
                    .addComponent(txtNgayTra)
                    .addComponent(txtHoTenDG)
                    .addComponent(txtMaSach)
                    .addComponent(txtTenSach)
                    .addComponent(txtSoNgayMuon)
                    .addComponent(txtSoLuotMuon)
                    .addComponent(txtSoNgayTraTre, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNgayMuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNgayTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHoTenDG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSoNgayMuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSoLuotMuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoNgayTraTre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnNhapMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/new-icon16.png"))); // NOI18N
        btnNhapMoi.setText("Nhập Mới");
        btnNhapMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapMoiActionPerformed(evt);
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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/book1.png"))); // NOI18N
        jButton1.setText("Cho mượn");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNhapMoi)
                .addGap(27, 27, 27)
                .addComponent(btnLuu)
                .addGap(27, 27, 27)
                .addComponent(btnCapNhat)
                .addGap(18, 18, 18)
                .addComponent(btnXoa)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNhapMoi)
                    .addComponent(btnLuu)
                    .addComponent(btnCapNhat)
                    .addComponent(btnXoa)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblQLMuonTra.setModel(new javax.swing.table.DefaultTableModel(
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
        tblQLMuonTra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQLMuonTraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblQLMuonTra);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNhapMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapMoiActionPerformed
        txtNgayMuon.setText("");
        txtNgayTra.setText("");
        txtHoTenDG.setText("");
        txtMaSach.setText("");
        txtTenSach.setText("");
        txtSoNgayMuon.setText("");
        txtSoLuotMuon.setText("");
        txtSoNgayTraTre.setText("");
        
    }//GEN-LAST:event_btnNhapMoiActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.ValidateEmty(txtNgayMuon, sb,"Ngày mượn không được để trống");
        DataValidator.ValidateEmty(txtNgayTra, sb,"Ngày trả không được để trống");
        DataValidator.ValidateEmty(txtHoTenDG, sb,"Họ tên độc giả không được để trống");
        DataValidator.ValidateEmty(txtMaSach, sb,"Mã sách không được để trống");
        DataValidator.ValidateEmty(txtTenSach, sb,"Tên sách không được để trống");
        DataValidator.ValidateEmty(txtSoNgayMuon, sb,"Số ngày mượn không được để trống");
        DataValidator.ValidateEmty(txtSoLuotMuon, sb,"Số lượt mượn không được để trống");
        DataValidator.ValidateEmty(txtSoNgayTraTre, sb,"Số ngày trả trễ không được để trống");
        
        if(sb.length() >0){
            MessageDialogHelper.showErrorDialog(parentForm,sb.toString(), "Lỗi");
            return;
        }
        try {
            MuonTraSach mt = new MuonTraSach();
            mt.setNgayMuon(txtNgayMuon.getText());
            mt.setNgayTra(txtNgayTra.getText());
            mt.setHoTenDG(txtHoTenDG.getText());
            mt.setMaSach(txtMaSach.getText());
            mt.setTenSach(txtTenSach.getText());
            mt.setNgayMuon(txtSoNgayMuon.getText());
            mt.setSoLuotMuon(Integer.parseInt(txtSoLuotMuon.getText()));
            mt.setSoNgayTraTre(Integer.parseInt(txtSoNgayTraTre.getText()));

            MuonTraControl control = new MuonTraControl();
            if(control.insert(mt)){
                MessageDialogHelper.showMessageDialog(parentForm, "Thông tin mượn trả đã được lưu", "Thông báo");
                loadDatatoTable();
            }else{
                MessageDialogHelper.showConfirmDialog(parentForm, "Thông tin mượn trả không được lưu do lỗi", "Cảnh báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, 
                    e.getMessage(),"Lỗi");
        }        
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.ValidateEmty(txtNgayMuon, sb,"Ngày mượn không được để trống");
        DataValidator.ValidateEmty(txtNgayTra, sb,"Ngày trả không được để trống");
        DataValidator.ValidateEmty(txtHoTenDG, sb,"Họ tên độc giả không được để trống");
        DataValidator.ValidateEmty(txtMaSach, sb,"Mã sách không được để trống");
        DataValidator.ValidateEmty(txtTenSach, sb,"Tên sách không được để trống");
        DataValidator.ValidateEmty(txtSoNgayMuon, sb,"Số ngày mượn không được để trống");
        DataValidator.ValidateEmty(txtSoLuotMuon, sb,"Số lượt mượn không được để trống");
        DataValidator.ValidateEmty(txtSoNgayTraTre, sb,"Số ngày trả trễ không được để trống");
    
        if(sb.length() >0){
            MessageDialogHelper.showErrorDialog(parentForm,sb.toString(), "Lỗi");
            return;
        }
        if(MessageDialogHelper.showConfirmDialog(parentForm, 
                "Bạn có muốn cập nhật thông tin mượn trả sách không?", "Hỏi")==JOptionPane.NO_OPTION){
            return;
        }
        try {
            MuonTraSach mt = new MuonTraSach();
            mt.setNgayMuon(txtNgayMuon.getText());
            mt.setNgayTra(txtNgayTra.getText());
            mt.setHoTenDG(txtHoTenDG.getText());
            mt.setMaSach(txtMaSach.getText());
            mt.setTenSach(txtTenSach.getText());
            mt.setNgayMuon(txtSoNgayMuon.getText());
            mt.setSoLuotMuon(Integer.parseInt(txtSoLuotMuon.getText()));
            mt.setSoNgayTraTre(Integer.parseInt(txtSoNgayTraTre.getText()));

            MuonTraControl control = new MuonTraControl();
            if(control.update(mt)){
                MessageDialogHelper.showMessageDialog(parentForm, "Thông tin mượn trả đã được cập nhật!", "Thông báo");
                loadDatatoTable();
            }else{
                MessageDialogHelper.showConfirmDialog(parentForm, "Thông tin mượn trả không được cập nhật do lỗi", "Cảnh báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, 
                    e.getMessage(),"Lỗi");
        }  
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.ValidateEmty(txtNgayMuon, sb,"Ngày mượn không được để trống!");
        if(sb.length() >0){
            MessageDialogHelper.showErrorDialog(parentForm,sb.toString(), "Lỗi");
            return;
        }
        if(MessageDialogHelper.showConfirmDialog(parentForm, 
                "Bạn có chắc muốn xóa thông tin mượn trả sách không?", "Hỏi")==JOptionPane.NO_OPTION){
            return;
        }
        try {
            MuonTraControl control = new MuonTraControl();
            if(control.delete(txtNgayMuon.getText())){
                MessageDialogHelper.showMessageDialog(parentForm, "Thông tin mượn trả sách được xóa", "Thông báo");
                btnTaoMoiActionPerformed(evt);
                loadDatatoTable();
            }else{
                MessageDialogHelper.showConfirmDialog(parentForm, "Thông tin mượn trả sách không được xóa do lỗi", "Cảnh báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, 
                    e.getMessage(),"Lỗi");
        } 
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblQLMuonTraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQLMuonTraMouseClicked
        try {
            int row = tblQLMuonTra.getSelectedRow();
            
            if(row>=0){
                String id = (String) tblQLMuonTra.getValueAt(row,0);
                MuonTraControl control = new MuonTraControl();
                MuonTraSach mt = control.findByNgayMuon(id);
                
                if(mt!=null){
                    txtNgayMuon.setText(mt.getNgayMuon());
                    txtNgayTra.setText(mt.getNgayTra());
                    txtHoTenDG.setText(mt.getHoTenDG());
                    txtMaSach.setText(mt.getMaSach());
                    txtTenSach.setText(mt.getTenSach());
                    txtSoNgayMuon.setText(Integer.toString(mt.getSoNgayMuon()));
                    txtSoLuotMuon.setText(Integer.toString(mt.getSoLuotMuon()));
                    txtSoNgayTraTre.setText(Integer.toString(mt.getSoNgayTraTre()));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
           MessageDialogHelper.showErrorDialog(parentForm, 
                    e.getMessage(),"Lỗi");            
        }
    }//GEN-LAST:event_tblQLMuonTraMouseClicked

    private void txtSoNgayTraTreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoNgayTraTreActionPerformed
        
    }//GEN-LAST:event_txtSoNgayTraTreActionPerformed

    private void txtSoNgayMuonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoNgayMuonKeyPressed
        
    }//GEN-LAST:event_txtSoNgayMuonKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ChoMuon cm = new ChoMuon();
        cm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnNhapMoi;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblQLMuonTra;
    private javax.swing.JTextField txtHoTenDG;
    private javax.swing.JTextField txtMaSach;
    private javax.swing.JTextField txtNgayMuon;
    private javax.swing.JTextField txtNgayTra;
    private javax.swing.JTextField txtSoLuotMuon;
    private javax.swing.JTextField txtSoNgayMuon;
    private javax.swing.JTextField txtSoNgayTraTre;
    private javax.swing.JTextField txtTenSach;
    // End of variables declaration//GEN-END:variables

    private void btnTaoMoiActionPerformed(ActionEvent evt) {
    }
}
