
package GUI;

import BUS.ProducerBUS;
import BUS.SupplierBUS;
import DTO.ProducerDTO;
import DTO.SupplierDTO;
import Design.TableCustom;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class SupplierGUI extends javax.swing.JPanel {DefaultTableModel modelSupplier;
    DefaultTableModel modelProducer;
    private ArrayList<SupplierDTO> listSupplier;
    private SupplierBUS supBUS = new SupplierBUS();
    
    private ArrayList<ProducerDTO> listProducer;
    private ProducerBUS proBUS = new ProducerBUS();
    public SupplierGUI() {
        initComponents();
        TableCustom.apply(jScrollPane6, TableCustom.TableType.DEFAULT);
        TableCustom.apply(jScrollPane7, TableCustom.TableType.DEFAULT);
        modelSupplier = (DefaultTableModel) tbTableSupplier.getModel();
        modelProducer = (DefaultTableModel) tbTableProducer.getModel();
        supBUS.readList();
        proBUS.readList();
        loadDataSupplier();
        loadDataProducer();
    }
    public void loadDataSupplier(){
        listSupplier = supBUS.getListSupplier();
        showAllSupplier(listSupplier);
    }
    public void loadDataProducer(){
        listProducer = proBUS.getListProducer();
        showALLProducer(listProducer);
    }
    public void loadSearch(String sql){
        listSupplier = supBUS.getSearch(sql);
        showAllSupplier(listSupplier);
    }
    public void showAllSupplier(ArrayList<SupplierDTO> listSup){
        modelSupplier.setRowCount(0);
        for(int i = 0; i < listSup.size();i++){
            modelSupplier.addRow(new String []{
            listSup.get(i).getMaNCC(),
            listSup.get(i).getTenNCC(),
            listSup.get(i).getDienThoai(),
            listSup.get(i).getDiaChi(),
            listSup.get(i).getSofax()
        
            });
        }
    }  
    public void showALLProducer(ArrayList<ProducerDTO> listPro){
        modelProducer.setRowCount(0);
        for(int i = 0; i < listPro.size();i++){
            modelProducer.addRow(new String []{
            listPro.get(i).getMaNSX(),
            listPro.get(i).getTenNSX()
            });
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myTabBedPane1 = new Design.MyTabBedPane();
        jPanel1 = new javax.swing.JPanel();
        panelBorder16 = new Design.PanelBorder();
        attribute52 = new Design.Attribute();
        txtMaNCC = new Design.Text();
        attribute53 = new Design.Attribute();
        txtTenNCC = new Design.Text();
        attribute55 = new Design.Attribute();
        txtDienThoai = new Design.Text();
        attribute56 = new Design.Attribute();
        txtSofax = new Design.Text();
        attribute57 = new Design.Attribute();
        txtDiaChi = new Design.Text();
        panelBorder17 = new Design.PanelBorder();
        btDelete3 = new Design.MyButtonIcon();
        btAddSupplier = new Design.MyButtonIcon();
        btNewSupplier = new Design.MyButtonIcon();
        btUpdateSupplier = new Design.MyButtonIcon();
        ckMaNCC = new javax.swing.JCheckBox();
        ckTenNCC = new javax.swing.JCheckBox();
        btSearch = new Design.MyButtonIcon();
        ckDienThoai = new javax.swing.JCheckBox();
        ckDiaChi = new javax.swing.JCheckBox();
        panelBorder18 = new Design.PanelBorder();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbTableSupplier = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        panelBorder21 = new Design.PanelBorder();
        attribute60 = new Design.Attribute();
        txtMaNSX = new Design.Text();
        attribute61 = new Design.Attribute();
        txtTenNSX = new Design.Text();
        panelBorder22 = new Design.PanelBorder();
        btDeleteProducer = new Design.MyButtonIcon();
        btAddProducer = new Design.MyButtonIcon();
        btUpdateProducer = new Design.MyButtonIcon();
        btNewProducer = new Design.MyButtonIcon();
        myButtonIcon2 = new Design.MyButtonIcon();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        panelBorder23 = new Design.PanelBorder();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbTableProducer = new javax.swing.JTable();

        myTabBedPane1.setForeground(new java.awt.Color(0, 0, 0));
        myTabBedPane1.setFont(new java.awt.Font("Dosis ExtraBold", 0, 12)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBorder16.setBackground(new java.awt.Color(230, 230, 230));

        attribute52.setText("Mã nhà cung cấp");

        txtMaNCC.setFont(new java.awt.Font("Dosis ExtraBold", 0, 15)); // NOI18N

        attribute53.setText("Tên nhà cung cấp");

        txtTenNCC.setFont(new java.awt.Font("Dosis ExtraBold", 0, 15)); // NOI18N

        attribute55.setText("Điện thoại");

        txtDienThoai.setFont(new java.awt.Font("Dosis ExtraBold", 0, 15)); // NOI18N

        attribute56.setText("Sofax");

        txtSofax.setFont(new java.awt.Font("Dosis ExtraBold", 0, 15)); // NOI18N

        attribute57.setText("Địa chỉ");

        txtDiaChi.setFont(new java.awt.Font("Dosis ExtraBold", 0, 15)); // NOI18N

        panelBorder17.setBackground(new java.awt.Color(255, 255, 255));

        btDelete3.setText("Delete");
        btDelete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelete3ActionPerformed(evt);
            }
        });

        btAddSupplier.setText("Add");
        btAddSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddSupplierActionPerformed(evt);
            }
        });

        btNewSupplier.setText("Clear");
        btNewSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewSupplierActionPerformed(evt);
            }
        });

        btUpdateSupplier.setText("Update");
        btUpdateSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateSupplierActionPerformed(evt);
            }
        });

        ckMaNCC.setFont(new java.awt.Font("Dosis ExtraBold", 0, 13)); // NOI18N
        ckMaNCC.setForeground(new java.awt.Color(0, 0, 0));
        ckMaNCC.setText("Mã nhà cung cấp");

        ckTenNCC.setFont(new java.awt.Font("Dosis ExtraBold", 0, 13)); // NOI18N
        ckTenNCC.setForeground(new java.awt.Color(0, 0, 0));
        ckTenNCC.setText("Tên nhà cung cấp");

        btSearch.setText("Search");
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });

        ckDienThoai.setFont(new java.awt.Font("Dosis ExtraBold", 0, 12)); // NOI18N
        ckDienThoai.setForeground(new java.awt.Color(0, 0, 0));
        ckDienThoai.setText("Số điện thoại");

        ckDiaChi.setFont(new java.awt.Font("Dosis ExtraBold", 0, 13)); // NOI18N
        ckDiaChi.setForeground(new java.awt.Color(0, 0, 0));
        ckDiaChi.setText("Địa chỉ");
        ckDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckDiaChiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder17Layout = new javax.swing.GroupLayout(panelBorder17);
        panelBorder17.setLayout(panelBorder17Layout);
        panelBorder17Layout.setHorizontalGroup(
            panelBorder17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder17Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelBorder17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckMaNCC)
                    .addComponent(ckTenNCC))
                .addGap(24, 24, 24)
                .addGroup(panelBorder17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckDienThoai)
                    .addComponent(ckDiaChi))
                .addGap(26, 26, 26)
                .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelBorder17Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelBorder17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder17Layout.createSequentialGroup()
                        .addComponent(btNewSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelBorder17Layout.createSequentialGroup()
                        .addComponent(btAddSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(btDelete3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btUpdateSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        panelBorder17Layout.setVerticalGroup(
            panelBorder17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder17Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelBorder17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckDienThoai)
                    .addComponent(ckMaNCC))
                .addGap(11, 11, 11)
                .addGroup(panelBorder17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckTenNCC)
                    .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckDiaChi))
                .addGap(46, 46, 46)
                .addComponent(btNewSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(panelBorder17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btUpdateSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAddSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDelete3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelBorder16Layout = new javax.swing.GroupLayout(panelBorder16);
        panelBorder16.setLayout(panelBorder16Layout);
        panelBorder16Layout.setHorizontalGroup(
            panelBorder16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder16Layout.createSequentialGroup()
                        .addGroup(panelBorder16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(attribute52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attribute53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaNCC, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(txtTenNCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addGroup(panelBorder16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder16Layout.createSequentialGroup()
                                .addGroup(panelBorder16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelBorder16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(attribute56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSofax, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(91, 91, 91))
                            .addComponent(attribute55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelBorder16Layout.createSequentialGroup()
                        .addGroup(panelBorder16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(attribute57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)))
                .addComponent(panelBorder17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                            .addComponent(txtMaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(attribute53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attribute56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSofax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(attribute57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelBorder17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(panelBorder16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1130, 260));

        panelBorder18.setBackground(new java.awt.Color(230, 230, 230));

        tbTableSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã nhà cung cấp", "Tên nhà cung cấp", "Điện thoại", "Địa chỉ", "Số fax"
            }
        ));
        tbTableSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTableSupplierMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tbTableSupplier);

        javax.swing.GroupLayout panelBorder18Layout = new javax.swing.GroupLayout(panelBorder18);
        panelBorder18.setLayout(panelBorder18Layout);
        panelBorder18Layout.setHorizontalGroup(
            panelBorder18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1128, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBorder18Layout.setVerticalGroup(
            panelBorder18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelBorder18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 1140, 320));

        myTabBedPane1.addTab("Supplier", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBorder21.setBackground(new java.awt.Color(200, 200, 200));

        attribute60.setText("Mã nhà sản xuất");

        txtMaNSX.setFont(new java.awt.Font("Dosis ExtraBold", 0, 15)); // NOI18N

        attribute61.setText("Tên nhà sản xuất");

        txtTenNSX.setFont(new java.awt.Font("Dosis ExtraBold", 0, 15)); // NOI18N

        panelBorder22.setBackground(new java.awt.Color(255, 255, 255));

        btDeleteProducer.setText("Delete");
        btDeleteProducer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteProducerActionPerformed(evt);
            }
        });

        btAddProducer.setText("Add");
        btAddProducer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddProducerActionPerformed(evt);
            }
        });

        btUpdateProducer.setText("Update");
        btUpdateProducer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateProducerActionPerformed(evt);
            }
        });

        btNewProducer.setText("Clear");
        btNewProducer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewProducerActionPerformed(evt);
            }
        });

        myButtonIcon2.setText("Search");

        jCheckBox6.setFont(new java.awt.Font("Dosis ExtraBold", 0, 13)); // NOI18N
        jCheckBox6.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox6.setText("Tên nhà sản xuất");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jCheckBox7.setFont(new java.awt.Font("Dosis ExtraBold", 0, 13)); // NOI18N
        jCheckBox7.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox7.setText("Mã nhà sản xuất");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder22Layout = new javax.swing.GroupLayout(panelBorder22);
        panelBorder22.setLayout(panelBorder22Layout);
        panelBorder22Layout.setHorizontalGroup(
            panelBorder22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btAddProducer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btNewProducer, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBorder22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myButtonIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBorder22Layout.createSequentialGroup()
                        .addComponent(btDeleteProducer, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btUpdateProducer, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
        );
        panelBorder22Layout.setVerticalGroup(
            panelBorder22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder22Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(panelBorder22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBorder22Layout.createSequentialGroup()
                        .addComponent(jCheckBox7)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(myButtonIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(btNewProducer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelBorder22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBorder22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btDeleteProducer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btAddProducer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btUpdateProducer, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelBorder21Layout = new javax.swing.GroupLayout(panelBorder21);
        panelBorder21.setLayout(panelBorder21Layout);
        panelBorder21Layout.setHorizontalGroup(
            panelBorder21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(attribute60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(attribute61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaNSX, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(txtTenNSX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(panelBorder22, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelBorder21Layout.setVerticalGroup(
            panelBorder21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelBorder22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBorder21Layout.createSequentialGroup()
                        .addComponent(attribute60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaNSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(attribute61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenNSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel3.add(panelBorder21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 730, 260));

        panelBorder23.setBackground(new java.awt.Color(230, 230, 230));

        tbTableProducer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhà sản xuất", "Tên nhà sản xuất"
            }
        ));
        tbTableProducer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTableProducerMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tbTableProducer);

        javax.swing.GroupLayout panelBorder23Layout = new javax.swing.GroupLayout(panelBorder23);
        panelBorder23.setLayout(panelBorder23Layout);
        panelBorder23Layout.setHorizontalGroup(
            panelBorder23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBorder23Layout.setVerticalGroup(
            panelBorder23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel3.add(panelBorder23, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 840, 320));

        myTabBedPane1.addTab("Nhà sản xuất", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myTabBedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(myTabBedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbTableSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTableSupplierMouseClicked
        int k = tbTableSupplier.getSelectedRow();
        txtMaNCC.setText(tbTableSupplier.getModel().getValueAt(k, 0).toString());
        txtTenNCC.setText(tbTableSupplier.getModel().getValueAt(k, 1).toString());
        txtDienThoai.setText(tbTableSupplier.getModel().getValueAt(k, 2).toString());
        txtDiaChi.setText(tbTableSupplier.getModel().getValueAt(k, 3).toString());
        txtSofax.setText(tbTableSupplier.getModel().getValueAt(k, 4).toString());
    }//GEN-LAST:event_tbTableSupplierMouseClicked

    private void tbTableProducerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTableProducerMouseClicked
        int k = tbTableProducer.getSelectedRow();
        txtMaNSX.setText(tbTableProducer.getModel().getValueAt(k, 0).toString());
        txtTenNSX.setText(tbTableProducer.getModel().getValueAt(k, 1).toString());
    }//GEN-LAST:event_tbTableProducerMouseClicked

    private void btNewSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewSupplierActionPerformed
        txtMaNCC.setText("");
        txtTenNCC.setText("");
        txtDiaChi.setText("");
        txtDienThoai.setText("");
        txtSofax.setText("");
        txtMaNCC.setEnabled(true);
        tbTableSupplier.getSelectionModel().clearSelection(); //bỏ chọn Row trong JTable
    }//GEN-LAST:event_btNewSupplierActionPerformed

    private void btAddSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddSupplierActionPerformed
         if (txtMaNCC.getText().trim().isEmpty() 
                || txtTenNCC.getText().trim().isEmpty() 
                || txtDiaChi.getText().trim().isEmpty()
                || txtDienThoai.getText().trim().isEmpty()
                || txtSofax.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in customer information!");
            return;
        }
        String MaNCC = txtMaNCC.getText();
        String TenNCC = txtTenNCC.getText();
        String DiaChi = txtDiaChi.getText();
        String DienThoai = txtDienThoai.getText();
        String Sofax = txtSofax.getText();
        SupplierDTO supplier = new SupplierDTO(MaNCC, TenNCC, DienThoai, DiaChi, Sofax);
        supBUS.insert(supplier);
        loadDataSupplier();
    }//GEN-LAST:event_btAddSupplierActionPerformed

    private void btDelete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDelete3ActionPerformed
        supBUS.delete(txtMaNCC.getText());
        loadDataSupplier();
    }//GEN-LAST:event_btDelete3ActionPerformed

    private void btUpdateSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateSupplierActionPerformed
        String MaNCC = txtMaNCC.getText();
        String TenNCC = txtTenNCC.getText();
        String DiaChi = txtDiaChi.getText();
        String DienThoai = txtDienThoai.getText();
        String Sofax = txtSofax.getText();
        SupplierDTO supplier = new SupplierDTO(MaNCC, TenNCC, DienThoai, DiaChi, Sofax);
        supBUS.update(supplier);
        loadDataSupplier();
    }//GEN-LAST:event_btUpdateSupplierActionPerformed

    private void ckDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckDiaChiActionPerformed

    private void btNewProducerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewProducerActionPerformed
        txtMaNSX.setText("");
        txtTenNSX.setText("");
        txtMaNSX.setEnabled(true);
        tbTableProducer.getSelectionModel().clearSelection(); //bỏ chọn Row trong JTable
    }//GEN-LAST:event_btNewProducerActionPerformed

    private void btUpdateProducerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateProducerActionPerformed
        String MaNSX = txtMaNSX.getText();
        String TenNSX = txtTenNSX.getText();
        ProducerDTO producer = new ProducerDTO(MaNSX, TenNSX);
        proBUS.update(producer);
        loadDataProducer();
    }//GEN-LAST:event_btUpdateProducerActionPerformed

    private void btAddProducerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddProducerActionPerformed
        if (txtMaNSX.getText().trim().isEmpty() || txtTenNSX.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in customer information!");
            return;
        }
        String MaNSX = txtMaNSX.getText();
        String TenNSX = txtTenNSX.getText();
        ProducerDTO producer = new ProducerDTO(MaNSX, TenNSX);
        proBUS.insert(producer);
        loadDataProducer();
    }//GEN-LAST:event_btAddProducerActionPerformed

    private void btDeleteProducerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteProducerActionPerformed
        proBUS.delete(txtMaNSX.getText());
        loadDataProducer();
    }//GEN-LAST:event_btDeleteProducerActionPerformed
    
    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        String sql = "SELECT * FROM NHACUNGCAP WHERE isDelete = 0"; 
        try{
            String MaNCC = txtMaNCC.getText();
            String TenNCC = txtTenNCC.getText();
            String DienThoai = txtDienThoai.getText();
            String DiaChi = txtDiaChi.getText();
             if(ckMaNCC.isSelected()){
                if(MaNCC.trim().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Chưa nhập mã nhà cung cấp cần tìm");
                    return;
                }
                    sql +=" AND MANCC LIKE '%" + MaNCC+ "%'";
            }
            if(ckTenNCC.isSelected()){
                if(TenNCC.trim().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Chưa nhập tên nhà cung cấp cần tìm");
                    return;
                }
                    sql +=" AND TENNCC LIKE '%" + TenNCC + "%'";
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
                    sql +=" AND DIACHI LIKE '%" + DiaChi + "%'";
            }
            loadSearch(sql);
        } 
        catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Design.Attribute attribute52;
    private Design.Attribute attribute53;
    private Design.Attribute attribute55;
    private Design.Attribute attribute56;
    private Design.Attribute attribute57;
    private Design.Attribute attribute60;
    private Design.Attribute attribute61;
    private Design.MyButtonIcon btAddProducer;
    private Design.MyButtonIcon btAddSupplier;
    private Design.MyButtonIcon btDelete3;
    private Design.MyButtonIcon btDeleteProducer;
    private Design.MyButtonIcon btNewProducer;
    private Design.MyButtonIcon btNewSupplier;
    private Design.MyButtonIcon btSearch;
    private Design.MyButtonIcon btUpdateProducer;
    private Design.MyButtonIcon btUpdateSupplier;
    private javax.swing.JCheckBox ckDiaChi;
    private javax.swing.JCheckBox ckDienThoai;
    private javax.swing.JCheckBox ckMaNCC;
    private javax.swing.JCheckBox ckTenNCC;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private Design.MyButtonIcon myButtonIcon2;
    private Design.MyTabBedPane myTabBedPane1;
    private Design.PanelBorder panelBorder16;
    private Design.PanelBorder panelBorder17;
    private Design.PanelBorder panelBorder18;
    private Design.PanelBorder panelBorder21;
    private Design.PanelBorder panelBorder22;
    private Design.PanelBorder panelBorder23;
    private javax.swing.JTable tbTableProducer;
    private javax.swing.JTable tbTableSupplier;
    private Design.Text txtDiaChi;
    private Design.Text txtDienThoai;
    private Design.Text txtMaNCC;
    private Design.Text txtMaNSX;
    private Design.Text txtSofax;
    private Design.Text txtTenNCC;
    private Design.Text txtTenNSX;
    // End of variables declaration//GEN-END:variables
}
