
package GUI;

import BUS.CustomerBUS;
import BUS.KhachHangBUS;
import DTO.CustomerDTO;
import DTO.KhachHangDTO;
import Design.TableCustom;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CustomerGUI extends javax.swing.JPanel {
    DefaultTableModel model;
    private CustomerBUS cusBUS = new CustomerBUS();
    private ArrayList<CustomerDTO> listCustomer;
    public CustomerGUI() {
        initComponents();
        TableCustom.apply(jScrollPane3, TableCustom.TableType.DEFAULT);
        model = (DefaultTableModel) tbTableCustomer.getModel();
        cusBUS.readList(); 
        loadData();
        loadMaKH();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder8 = new Design.PanelBorder();
        attribute32 = new Design.Attribute();
        attribute33 = new Design.Attribute();
        txtHoKH = new Design.Text();
        attribute34 = new Design.Attribute();
        txtTenKH = new Design.Text();
        attribute35 = new Design.Attribute();
        attribute36 = new Design.Attribute();
        txtDienThoai = new Design.Text();
        attribute37 = new Design.Attribute();
        txtDiaChi = new Design.Text();
        panelBorder9 = new Design.PanelBorder();
        btDelete2 = new Design.MyButtonIcon();
        btUpdate = new Design.MyButtonIcon();
        btNew = new Design.MyButtonIcon();
        btAdd = new Design.MyButtonIcon();
        btSearch = new Design.MyButtonIcon();
        ckDiaChi = new javax.swing.JCheckBox();
        ckMaKH = new javax.swing.JCheckBox();
        ckTenKH = new javax.swing.JCheckBox();
        ckDienThoai = new javax.swing.JCheckBox();
        ckHoKH = new javax.swing.JCheckBox();
        cbxMaKH = new Design.MyComboBox();
        txtMaKH = new Design.Text();
        cbxGioiTinh = new Design.MyComboBox();
        pnTable = new Design.PanelBorder();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbTableCustomer = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBorder8.setBackground(new java.awt.Color(230, 230, 230));

        attribute32.setText("Mã khách hàng");

        attribute33.setText("Họ khách hàng");

        txtHoKH.setFont(new java.awt.Font("Dosis ExtraBold", 0, 15)); // NOI18N

        attribute34.setText("Tên khách hàng");

        txtTenKH.setFont(new java.awt.Font("Dosis ExtraBold", 0, 15)); // NOI18N

        attribute35.setText("Giới tính");

        attribute36.setText("Số điện thoại");

        txtDienThoai.setFont(new java.awt.Font("Dosis ExtraBold", 0, 15)); // NOI18N

        attribute37.setText("Địa chỉ");

        txtDiaChi.setFont(new java.awt.Font("Dosis ExtraBold", 0, 15)); // NOI18N

        panelBorder9.setBackground(new java.awt.Color(255, 255, 255));

        btDelete2.setText("Delete");
        btDelete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelete2ActionPerformed(evt);
            }
        });

        btUpdate.setText("Update");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        btNew.setText("Clear");
        btNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewActionPerformed(evt);
            }
        });

        btAdd.setText("Add");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btSearch.setText("Search");
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });

        ckDiaChi.setFont(new java.awt.Font("Dosis ExtraBold", 0, 13)); // NOI18N
        ckDiaChi.setForeground(new java.awt.Color(0, 0, 0));
        ckDiaChi.setText("Địa chỉ");
        ckDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckDiaChiActionPerformed(evt);
            }
        });

        ckMaKH.setFont(new java.awt.Font("Dosis ExtraBold", 0, 13)); // NOI18N
        ckMaKH.setForeground(new java.awt.Color(0, 0, 0));
        ckMaKH.setText("Mã khách hàng");

        ckTenKH.setFont(new java.awt.Font("Dosis ExtraBold", 0, 13)); // NOI18N
        ckTenKH.setForeground(new java.awt.Color(0, 0, 0));
        ckTenKH.setText("Tên khách hàng");

        ckDienThoai.setFont(new java.awt.Font("Dosis ExtraBold", 0, 13)); // NOI18N
        ckDienThoai.setForeground(new java.awt.Color(0, 0, 0));
        ckDienThoai.setText("Điện thoại");

        ckHoKH.setFont(new java.awt.Font("Dosis ExtraBold", 0, 13)); // NOI18N
        ckHoKH.setForeground(new java.awt.Color(0, 0, 0));
        ckHoKH.setText("Họ khách hàng");

        javax.swing.GroupLayout panelBorder9Layout = new javax.swing.GroupLayout(panelBorder9);
        panelBorder9.setLayout(panelBorder9Layout);
        panelBorder9Layout.setHorizontalGroup(
            panelBorder9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder9Layout.createSequentialGroup()
                        .addGroup(panelBorder9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ckMaKH)
                            .addComponent(ckHoKH))
                        .addGap(19, 19, 19)
                        .addGroup(panelBorder9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder9Layout.createSequentialGroup()
                                .addComponent(ckDienThoai)
                                .addGap(26, 26, 26)
                                .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ckDiaChi)))
                    .addGroup(panelBorder9Layout.createSequentialGroup()
                        .addGroup(panelBorder9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btNew, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addComponent(btDelete2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ckTenKH))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        panelBorder9Layout.setVerticalGroup(
            panelBorder9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelBorder9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckMaKH)
                    .addComponent(ckDiaChi))
                .addGap(11, 11, 11)
                .addGroup(panelBorder9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckDienThoai)
                    .addComponent(ckHoKH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckTenKH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btNew, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelBorder9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDelete2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        txtMaKH.setFont(new java.awt.Font("Dosis ExtraBold", 0, 15)); // NOI18N

        cbxGioiTinh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chọn giới tính", "nữ", "nam", " " }));

        javax.swing.GroupLayout panelBorder8Layout = new javax.swing.GroupLayout(panelBorder8);
        panelBorder8.setLayout(panelBorder8Layout);
        panelBorder8Layout.setHorizontalGroup(
            panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelBorder8Layout.createSequentialGroup()
                            .addGroup(panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtTenKH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtHoKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(103, 103, 103))
                        .addGroup(panelBorder8Layout.createSequentialGroup()
                            .addGroup(panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(attribute33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(attribute34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(attribute32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(277, 277, 277)))
                    .addGroup(panelBorder8Layout.createSequentialGroup()
                        .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)))
                .addGroup(panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBorder8Layout.createSequentialGroup()
                        .addGroup(panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(attribute35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attribute36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attribute37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cbxGioiTinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBorder9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        panelBorder8Layout.setVerticalGroup(
            panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder8Layout.createSequentialGroup()
                        .addGroup(panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(attribute32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attribute35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelBorder8Layout.createSequentialGroup()
                                .addGroup(panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbxMaKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1))
                            .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(attribute33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attribute36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHoKH, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(attribute34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attribute37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder8Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(panelBorder9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        add(panelBorder8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1150, 290));

        pnTable.setBackground(new java.awt.Color(230, 230, 230));

        tbTableCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khách hàng", "Họ khách hàng", "Tên khách hàng", "Giới tính", "Số điện thoại", "Địa chỉ"
            }
        ));
        tbTableCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTableCustomerMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbTableCustomer);

        javax.swing.GroupLayout pnTableLayout = new javax.swing.GroupLayout(pnTable);
        pnTable.setLayout(pnTableLayout);
        pnTableLayout.setHorizontalGroup(
            pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1138, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnTableLayout.setVerticalGroup(
            pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(pnTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 1150, 340));
    }// </editor-fold>//GEN-END:initComponents
    
    private void loadData(){
        listCustomer = cusBUS.getListCustomer();
        showAll(listCustomer);
    }
    private void loadMaKH(){       
        cusBUS.readMaKH();
        ArrayList<String> listMaKH = cusBUS.getListMaKH();
        Collections.sort(listMaKH, Collections.reverseOrder());
        cbxMaKH.removeAllItems();
        for(String x : listMaKH){
        cbxMaKH.addItem(x);
        }
    }
    public void loadSearch(String sql){
        listCustomer = cusBUS.getSearch(sql);
        showAll(listCustomer);
    }
    public void showAll(ArrayList<CustomerDTO> listCus) {      
        model.setRowCount(0);
        for (int i = 0; i < listCus.size(); i++) {
            model.addRow(new String[]{
                listCus.get(i).getMaKH(),
                listCus.get(i).getHoKH(),
                listCus.get(i).getTenKH(),
                listCus.get(i).getGioiTinh(),
                listCus.get(i).getDienThoai(), 
                listCus.get(i).getDiaChi(),
            });
        }
    }
    private void tbTableCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTableCustomerMouseClicked
        int k = tbTableCustomer.getSelectedRow();
        txtMaKH.setText(tbTableCustomer.getModel().getValueAt(k, 0).toString());
        txtHoKH.setText(tbTableCustomer.getModel().getValueAt(k, 1).toString());
        txtTenKH.setText(tbTableCustomer.getModel().getValueAt(k, 2).toString());
        cbxGioiTinh.setSelectedItem(tbTableCustomer.getModel().getValueAt(k, 3).toString());
        txtDiaChi.setText(tbTableCustomer.getModel().getValueAt(k, 4).toString());
        txtDienThoai.setText(tbTableCustomer.getModel().getValueAt(k, 5).toString());
        txtMaKH.setEnabled(false);
    }//GEN-LAST:event_tbTableCustomerMouseClicked

    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed
        txtMaKH.setText("");
        txtHoKH.setText("");
        txtTenKH.setText("");
        cbxGioiTinh.setSelectedIndex(0); 
        txtDiaChi.setText("");
        txtDienThoai.setText("");
        txtMaKH.setEnabled(true);
        tbTableCustomer.getSelectionModel().clearSelection(); //bỏ chọn Row trong JTable
    }//GEN-LAST:event_btNewActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        if (txtMaKH.getText().trim().isEmpty() 
                || txtHoKH.getText().trim().isEmpty() 
                || txtTenKH.getText().trim().isEmpty()
                || cbxGioiTinh.getSelectedItem().equals("Chọn giới tính")
                || txtDienThoai.getText().trim().isEmpty() 
                || txtDiaChi.getText().trim().isEmpty()) {
            
            JOptionPane.showMessageDialog(this, "Please fill in customer information!");
            return;
        }
        if (!txtDienThoai.getText().matches("\\d{10}")) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không hợp lệ. Vui lòng nhập đúng định dạng (10 chữ số).");
            return;
        }
        String MaKH = txtMaKH.getText();
        String HoKH = txtHoKH.getText();
        String TenKH = txtTenKH.getText();
        String DiaChi = txtDiaChi.getText();
        String DienThoai = txtDienThoai.getText();
        String GioiTinh = (String) cbxGioiTinh.getSelectedItem();
        CustomerDTO customer = new CustomerDTO(MaKH, HoKH, TenKH, GioiTinh, DienThoai, DiaChi);
        cusBUS.insert(customer);
        loadData();
        loadMaKH();
    }//GEN-LAST:event_btAddActionPerformed

    private void btDelete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDelete2ActionPerformed
        cusBUS.delete(txtMaKH.getText());
        loadData();
        loadMaKH();
    }//GEN-LAST:event_btDelete2ActionPerformed

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        String MaKH = txtMaKH.getText();
        String HoKH = txtHoKH.getText();
        String TenKH = txtTenKH.getText();
        String DiaChi = txtDiaChi.getText();
        String DienThoai = txtDienThoai.getText();
        String GioiTinh = cbxGioiTinh.getSelectedItem().toString();
        CustomerDTO customer = new CustomerDTO(MaKH, HoKH, TenKH, GioiTinh, DienThoai, DiaChi);
        cusBUS.update(customer);
        loadData();
    }//GEN-LAST:event_btUpdateActionPerformed

    private void ckDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckDiaChiActionPerformed

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        String sql = "SELECT * FROM KHACHHANG WHERE isDelete = 0"; 
        try{
            String MaKH = txtMaKH.getText();
            String HoKH = txtHoKH.getText();
            String TenKH = txtTenKH.getText();
            String DienThoai = txtDienThoai.getText();
            String DiaChi = txtDiaChi.getText();
            if(ckMaKH.isSelected()){
                if(MaKH.trim().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Chưa nhập mã khách hàng cần tìm");
                    return;
                }
                    sql +=" AND MAKH LIKE '%" + MaKH + "%'";
            }
            if(ckHoKH.isSelected()){
                if(HoKH.trim().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Chưa nhập họ khách hàng cần tìm");
                    return;
                }
                    sql +=" AND HOKH LIKE N'%" + HoKH + "%'";
            }
            if(ckTenKH.isSelected()){
                if(TenKH.trim().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Chưa nhập tên khách hàng cần tìm");
                    return;
                }
                    sql +=" AND TENKH LIKE N'%" + TenKH + "%'";
            }
            if(ckDienThoai.isSelected()){
                if(DienThoai.trim().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Chưa nhập số điện thoại cần tìm");
                    return;
                }
                if (!DienThoai.matches("\\d{10}")) {
                    JOptionPane.showMessageDialog(this, "Số điện thoại không hợp lệ. Vui lòng nhập đúng định dạng (10 chữ số).");
                    return;
                }
                sql +=" AND DIENTHOAI LIKE '%" + DienThoai+ "%'";
                
            }
            if(ckDiaChi.isSelected()){
                if(DiaChi.trim().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Chưa nhập dia chi cần tìm");
                    return;
                }
                    sql +=" AND DIACHI LIKE N'%" + DiaChi + "%'";
            }
            loadSearch(sql);
        } 
        catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btSearchActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Design.Attribute attribute32;
    private Design.Attribute attribute33;
    private Design.Attribute attribute34;
    private Design.Attribute attribute35;
    private Design.Attribute attribute36;
    private Design.Attribute attribute37;
    private Design.MyButtonIcon btAdd;
    private Design.MyButtonIcon btDelete2;
    private Design.MyButtonIcon btNew;
    private Design.MyButtonIcon btSearch;
    private Design.MyButtonIcon btUpdate;
    private Design.MyComboBox cbxGioiTinh;
    private Design.MyComboBox cbxMaKH;
    private javax.swing.JCheckBox ckDiaChi;
    private javax.swing.JCheckBox ckDienThoai;
    private javax.swing.JCheckBox ckHoKH;
    private javax.swing.JCheckBox ckMaKH;
    private javax.swing.JCheckBox ckTenKH;
    private javax.swing.JScrollPane jScrollPane3;
    private Design.PanelBorder panelBorder8;
    private Design.PanelBorder panelBorder9;
    private Design.PanelBorder pnTable;
    private javax.swing.JTable tbTableCustomer;
    private Design.Text txtDiaChi;
    private Design.Text txtDienThoai;
    private Design.Text txtHoKH;
    private Design.Text txtMaKH;
    private Design.Text txtTenKH;
    // End of variables declaration//GEN-END:variables
}
