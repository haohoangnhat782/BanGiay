/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.NhaCungCapBUS;
import BUS.ProductBUS;
import BUS.SupplierBUS;
import DTO.NhaCungCapDTO;
import DTO.ProductDTO;
import DTO.SupplierDTO;
import Design.TableCustom;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class DialogProductNH extends javax.swing.JDialog {   
    DefaultTableModel modelProduct;
    private ArrayList<ProductDTO> listProduct;
    private ProductBUS prodBUS = new ProductBUS();
    private String MaNCC;
    public DialogProductNH(String MaNCC) {
        setUndecorated(true);
        initComponents();
        this.setModal(true);       
        this.setResizable(false);    
        setLocationRelativeTo(null);
        lbExit.setImage_Icon(new ImageIcon(getClass().getResource("/Hinh/exit.png")));
        TableCustom.apply(jScrollPane6, TableCustom.TableType.DEFAULT);
        modelProduct = (DefaultTableModel) tbTableProduct.getModel();
        prodBUS.readList();
        this.MaNCC = MaNCC;
        loadDataProduct();
     
        
    }
    public void loadDataProduct(){
        listProduct = prodBUS.getListTheoMaNCC(MaNCC);
        showAllProduct(listProduct);
    }
    public void loadSearch(String sql){
        listProduct = prodBUS.getSearch(sql);
        showAllProduct(listProduct);
    }
    public void showAllProduct(ArrayList<ProductDTO> listProd){
        modelProduct.setRowCount(0);
        for(int i = 0; i < listProd.size();i++){
            modelProduct.addRow(new String []{
            listProd.get(i).getMaSP(),
            listProd.get(i).getTenSP(),
            listProd.get(i).getGiaNhapHang(),
            listProd.get(i).getSoLuong()
            });
            System.out.println(  listProd.get(i).getGiaNhapHang());
        }
    }
    public String getMaSanPham(){
        return txtMaSP.getText();
    }
    public String getTenSanPham(){
        return txtTenSP.getText();
    }
    public String getGiaNhapHang(){
        return txtGiaNH.getText();
    }
    public String getSoLuong(){
        return txtSoLuong.getText();
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
        pnHeader1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lbExit = new Design.MyLabel_Icon();
        panelBorder18 = new Design.PanelBorder();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbTableProduct = new javax.swing.JTable();
        panelBorder16 = new Design.PanelBorder();
        attribute52 = new Design.Attribute();
        txtMaSP = new Design.Text();
        attribute53 = new Design.Attribute();
        txtGiaNH = new Design.Text();
        attribute55 = new Design.Attribute();
        txtTenSP = new Design.Text();
        attribute56 = new Design.Attribute();
        txtSoLuong = new Design.Text();
        panelBorder17 = new Design.PanelBorder();
        ckMaSP = new javax.swing.JCheckBox();
        ckGiaNH = new javax.swing.JCheckBox();
        ckSoLuong = new javax.swing.JCheckBox();
        btSearch = new Design.MyButtonIcon();
        ckTenSP = new javax.swing.JCheckBox();
        btChon = new Design.MyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pnHeader1.setBackground(new java.awt.Color(0, 0, 0));
        pnHeader1.setPreferredSize(new java.awt.Dimension(102, 40));

        jLabel9.setFont(new java.awt.Font("Baloo 2 ExtraBold", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Product");

        lbExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbExitMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout pnHeader1Layout = new javax.swing.GroupLayout(pnHeader1);
        pnHeader1.setLayout(pnHeader1Layout);
        pnHeader1Layout.setHorizontalGroup(
            pnHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnHeader1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnHeader1Layout.setVerticalGroup(
            pnHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnHeader1Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnHeader1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelBorder18.setBackground(new java.awt.Color(230, 230, 230));

        tbTableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm ", "Tên sản phẩm", "Giá nhập hàng", "Số lượng"
            }
        ));
        tbTableProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTableProductMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tbTableProduct);

        javax.swing.GroupLayout panelBorder18Layout = new javax.swing.GroupLayout(panelBorder18);
        panelBorder18.setLayout(panelBorder18Layout);
        panelBorder18Layout.setHorizontalGroup(
            panelBorder18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 901, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBorder18Layout.setVerticalGroup(
            panelBorder18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBorder16.setBackground(new java.awt.Color(230, 230, 230));

        attribute52.setText("Mã sản phẩm");

        txtMaSP.setFont(new java.awt.Font("Dosis ExtraBold", 0, 15)); // NOI18N

        attribute53.setText("Giá nhập hàng");

        txtGiaNH.setFont(new java.awt.Font("Dosis ExtraBold", 0, 15)); // NOI18N

        attribute55.setText("Tên sản phẩm");

        txtTenSP.setFont(new java.awt.Font("Dosis ExtraBold", 0, 15)); // NOI18N

        attribute56.setText("Số lượng");

        txtSoLuong.setFont(new java.awt.Font("Dosis ExtraBold", 0, 15)); // NOI18N

        panelBorder17.setBackground(new java.awt.Color(255, 255, 255));

        ckMaSP.setFont(new java.awt.Font("Dosis ExtraBold", 0, 13)); // NOI18N
        ckMaSP.setForeground(new java.awt.Color(0, 0, 0));
        ckMaSP.setText("Mã sản phẩm");

        ckGiaNH.setFont(new java.awt.Font("Dosis ExtraBold", 0, 13)); // NOI18N
        ckGiaNH.setForeground(new java.awt.Color(0, 0, 0));
        ckGiaNH.setText("Giá nhập hàng");

        ckSoLuong.setFont(new java.awt.Font("Dosis ExtraBold", 0, 13)); // NOI18N
        ckSoLuong.setForeground(new java.awt.Color(0, 0, 0));
        ckSoLuong.setText("Số lượng");

        btSearch.setText("Search");
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });

        ckTenSP.setFont(new java.awt.Font("Dosis ExtraBold", 0, 12)); // NOI18N
        ckTenSP.setForeground(new java.awt.Color(0, 0, 0));
        ckTenSP.setText("Tên sản phẩm");

        btChon.setText("Chọn");
        btChon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder17Layout = new javax.swing.GroupLayout(panelBorder17);
        panelBorder17.setLayout(panelBorder17Layout);
        panelBorder17Layout.setHorizontalGroup(
            panelBorder17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder17Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelBorder17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBorder17Layout.createSequentialGroup()
                        .addGroup(panelBorder17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ckMaSP)
                            .addComponent(ckGiaNH))
                        .addGap(24, 24, 24)
                        .addGroup(panelBorder17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ckSoLuong)
                            .addComponent(ckTenSP))
                        .addGap(26, 26, 26)
                        .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btChon, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panelBorder17Layout.setVerticalGroup(
            panelBorder17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder17Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelBorder17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckTenSP)
                    .addComponent(ckMaSP))
                .addGap(11, 11, 11)
                .addGroup(panelBorder17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckSoLuong)
                    .addComponent(ckGiaNH)
                    .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(btChon, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBorder16Layout = new javax.swing.GroupLayout(panelBorder16);
        panelBorder16.setLayout(panelBorder16Layout);
        panelBorder16Layout.setHorizontalGroup(
            panelBorder16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(attribute52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(attribute53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaSP, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(txtGiaNH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(panelBorder16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder16Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(attribute55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder16Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelBorder16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(attribute56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenSP, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addComponent(panelBorder17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        panelBorder16Layout.setVerticalGroup(
            panelBorder16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder16Layout.createSequentialGroup()
                        .addGroup(panelBorder16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(attribute52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attribute55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(attribute53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attribute56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGiaNH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelBorder17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelBorder18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(pnHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBorder18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBorder16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private int SoLuong;
    private void tbTableProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTableProductMouseClicked
        int k = tbTableProduct.getSelectedRow();
        
        int SoLuongConLai = Integer.parseInt(tbTableProduct.getModel().getValueAt(k, 3).toString());
        if (SoLuongConLai < 1) {
            JOptionPane.showMessageDialog(this, "Sản phẩm đã hết hàng", "THÔNG BÁO", JOptionPane.ERROR_MESSAGE);
            return;
        }
        txtMaSP.setText(tbTableProduct.getModel().getValueAt(k, 0).toString());
        txtTenSP.setText(tbTableProduct.getModel().getValueAt(k, 1).toString());
        txtGiaNH.setText(tbTableProduct.getModel().getValueAt(k, 2).toString());
        SoLuong = Integer.parseInt(tbTableProduct.getModel().getValueAt(k, 3).toString());
    }//GEN-LAST:event_tbTableProductMouseClicked

    private void lbExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseClicked
        dispose();
    }//GEN-LAST:event_lbExitMouseClicked

    private void lbExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseEntered

    }//GEN-LAST:event_lbExitMouseEntered

    private void btChonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChonActionPerformed
        dispose();
    }//GEN-LAST:event_btChonActionPerformed

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        String sql = "SELECT * FROM SANPHAM WHERE isDelete = 0"; 
        try{
            String MaSP = txtMaSP.getText();
            String TenSP = txtTenSP.getText();
            String SoLuong = txtSoLuong.getText();
            String GiaNH = txtGiaNH.getText();
             if(ckMaSP.isSelected()){
                if(MaSP.trim().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Chưa nhập mã sản phẩm cần tìm");
                    return;
                }
                    sql +=" AND MASP LIKE '%" + MaSP+ "%'";
            }
            if(ckTenSP.isSelected()){
                if(TenSP.trim().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Chưa nhập tên sản phẩm cần tìm");
                    return;
                }
                    sql +=" AND TENSP LIKE '%" + TenSP + "%'";
            }
            if(ckSoLuong.isSelected()){
                if(SoLuong.trim().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Chưa nhập số lượng thấp nhất cần lọc");
                    return;
                }
                    sql +=" AND SOLUONG >= " + SoLuong + " AND SOLUONG <= 1000000000";  
            }
            if(ckGiaNH.isSelected()){
                 if(GiaNH.trim().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Chưa giá sản phẩm thấp nhất cần lọc");
                    return;
                }
                    sql +=" AND GIANH >= " + GiaNH + " AND GIANH <= 1000000000";    
            }
            loadSearch(sql);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btSearchActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Design.Attribute attribute52;
    private Design.Attribute attribute53;
    private Design.Attribute attribute55;
    private Design.Attribute attribute56;
    private Design.MyButton btChon;
    private Design.MyButtonIcon btSearch;
    private javax.swing.JCheckBox ckGiaNH;
    private javax.swing.JCheckBox ckMaSP;
    private javax.swing.JCheckBox ckSoLuong;
    private javax.swing.JCheckBox ckTenSP;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane6;
    private Design.MyLabel_Icon lbExit;
    private Design.PanelBorder panelBorder16;
    private Design.PanelBorder panelBorder17;
    private Design.PanelBorder panelBorder18;
    private javax.swing.JPanel pnHeader1;
    private javax.swing.JTable tbTableProduct;
    private Design.Text txtGiaNH;
    private Design.Text txtMaSP;
    private Design.Text txtSoLuong;
    private Design.Text txtTenSP;
    // End of variables declaration//GEN-END:variables
}