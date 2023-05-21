
package GUI;

import BUS.CTInvoiceBUS;
import BUS.InvoiceBUS;
import BUS.ProductBUS;
import DTO.CTInvoiceDTO;
import DTO.InformationDTO;
import DTO.InvoiceDTO;
import DTO.ProductDTO;
import Design.TableCustom;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InvoiceGUI extends javax.swing.JPanel {
    DefaultTableModel modelInvoice;
    DefaultTableModel modelCTInvoice;
    private InvoiceBUS inBUS = new InvoiceBUS();
    private CTInvoiceBUS ctinBUS = new CTInvoiceBUS();
    private ProductBUS proBUS = new ProductBUS();
    private ArrayList<InvoiceDTO> listInvoice;
    private ArrayList<CTInvoiceDTO> listCTInvoice;
    private ArrayList<ProductDTO> listProduct;
    private Date date;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private int Sum = 0;
    private int SL;
    public InvoiceGUI() {
        initComponents();
        
        TableCustom.apply(jScrollPane4, TableCustom.TableType.DEFAULT);
        TableCustom.apply(jScrollPane6, TableCustom.TableType.DEFAULT);
        modelInvoice = (DefaultTableModel) tbTableInvoice.getModel();
        modelCTInvoice = (DefaultTableModel) tbTableCTInvoice.getModel();
        inBUS.readList();
        ctinBUS.readList();
         proBUS.readList();
        loadDataInvoice();
        btXemHD.setSelected(true);
        loadDataCTInTheoMa("1");
        txtMaSP.setEnabled(false);
        txtTenSP.setEnabled(false);
        txtGiaSP.setEnabled(false);
        txtSoLuong.setEnabled(false);
        btAdd.setEnabled(false);
        btDelete.setEnabled(false);
        loadDataProduct();
        
    }
    public void loadDataInvoice(){
        listInvoice = inBUS.getListInvoice();
        showAllInvoice(listInvoice);
    }
    public void loadDataCTInTheoMa(String MaHD){
        listCTInvoice = ctinBUS.getListCTInvoiceTheoMaHD(MaHD);     
        showCTInvoiceTheoMa(listCTInvoice);
    }
    public void loadDataProduct(){
        listProduct = proBUS.getListProduct();
    }
    public void loadSearch(String sql){
        listInvoice = inBUS.getSearch(sql);
        showAllInvoice(listInvoice);
    }
    public void showCTInvoiceTheoMa(ArrayList<CTInvoiceDTO> listCTInv){
        modelCTInvoice.setRowCount(0);
        for(int i = 0; i < listCTInv.size();i++){
            modelCTInvoice.addRow(new String []{
            listCTInv.get(i).getMaHD(),
            listCTInv.get(i).getMaSP(),
            listCTInv.get(i).getTenSP(),
            listCTInv.get(i).getGiaSP(),
            listCTInv.get(i).getSoLuong()

            });
        }
    }
    public void showAllInvoice(ArrayList<InvoiceDTO> listInv){
        modelInvoice.setRowCount(0);
        for(int i = 0; i < listInv.size();i++){
            modelInvoice.addRow(new String[]{
            listInv.get(i).getMaHD(),
            dateFormat.format(listInv.get(i).getNgayLap()),
            listInv.get(i).getMaNV(),
            listInv.get(i).getMaKH(),
            listInv.get(i).getTongTien()
            
            });
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder12 = new Design.PanelBorder();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        panelBorder19 = new Design.PanelBorder();
        panelBorder21 = new Design.PanelBorder();
        attribute61 = new Design.Attribute();
        txtMaHD = new Design.Text();
        attribute62 = new Design.Attribute();
        attribute63 = new Design.Attribute();
        txtMaNV = new Design.Text();
        attribute64 = new Design.Attribute();
        txtMaKH = new Design.Text();
        btKH = new Design.MyButton();
        attribute65 = new Design.Attribute();
        txtTongTien = new Design.Text();
        txtNgayLap = new com.toedter.calendar.JDateChooser();
        panelBorder23 = new Design.PanelBorder();
        attribute70 = new Design.Attribute();
        attribute71 = new Design.Attribute();
        attribute72 = new Design.Attribute();
        attribute73 = new Design.Attribute();
        txtMaSP = new Design.Text();
        txtTenSP = new Design.Text();
        txtGiaSP = new Design.Text();
        txtSoLuong = new Design.Text();
        btSP = new Design.MyButton();
        panelBorder20 = new Design.PanelBorder();
        btAdd = new Design.MyButtonIcon();
        btNew = new Design.MyButtonIcon();
        Print = new Design.MyButtonIcon();
        btDelete = new Design.MyButtonIcon();
        ckMaNV = new javax.swing.JCheckBox();
        ckMaKH = new javax.swing.JCheckBox();
        ckMaHD = new javax.swing.JCheckBox();
        ckTongTien = new javax.swing.JCheckBox();
        CkTimNgayTheoKhoang = new javax.swing.JCheckBox();
        btSearch = new Design.MyButtonIcon();
        btTaoHD = new javax.swing.JRadioButton();
        btXemHD = new javax.swing.JRadioButton();
        ckNgayLap = new javax.swing.JCheckBox();
        txtNgayBatDau = new com.toedter.calendar.JDateChooser();
        attribute1 = new Design.Attribute();
        txtNgayKetThuc = new com.toedter.calendar.JDateChooser();
        btClear = new Design.MyButtonIcon();
        panelBorder22 = new Design.PanelBorder();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbTableInvoice = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbTableCTInvoice = new javax.swing.JTable();

        panelBorder12.setBackground(new java.awt.Color(230, 230, 230));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Recod ID", "Account ID", "Distributor", "Date of record", "Total cost"
            }
        ));
        jScrollPane5.setViewportView(jTable2);

        javax.swing.GroupLayout panelBorder12Layout = new javax.swing.GroupLayout(panelBorder12);
        panelBorder12.setLayout(panelBorder12Layout);
        panelBorder12Layout.setHorizontalGroup(
            panelBorder12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1098, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorder12Layout.setVerticalGroup(
            panelBorder12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBackground(new java.awt.Color(255, 255, 255));

        panelBorder19.setBackground(new java.awt.Color(230, 230, 230));

        panelBorder21.setBackground(new java.awt.Color(153, 153, 153));

        attribute61.setText("Mã hóa đơn");

        attribute62.setText("Ngày lập");

        attribute63.setText("Mã nhân viên");

        attribute64.setText("Mã khách hàng");

        btKH.setText("...");
        btKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKHActionPerformed(evt);
            }
        });

        attribute65.setText("Tổng tiền");

        javax.swing.GroupLayout panelBorder21Layout = new javax.swing.GroupLayout(panelBorder21);
        panelBorder21.setLayout(panelBorder21Layout);
        panelBorder21Layout.setHorizontalGroup(
            panelBorder21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder21Layout.createSequentialGroup()
                        .addComponent(txtMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panelBorder21Layout.createSequentialGroup()
                        .addComponent(txtTongTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder21Layout.createSequentialGroup()
                        .addGroup(panelBorder21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder21Layout.createSequentialGroup()
                                .addGroup(panelBorder21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(attribute61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelBorder21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelBorder21Layout.createSequentialGroup()
                                        .addComponent(attribute62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(121, 121, 121))
                                    .addComponent(txtNgayLap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(panelBorder21Layout.createSequentialGroup()
                                .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(6, 6, 6))
                    .addGroup(panelBorder21Layout.createSequentialGroup()
                        .addGroup(panelBorder21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(attribute63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attribute64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attribute65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelBorder21Layout.setVerticalGroup(
            panelBorder21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(attribute61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(attribute62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorder21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNgayLap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMaHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(attribute63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(attribute64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorder21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(attribute65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBorder23.setBackground(new java.awt.Color(153, 153, 153));

        attribute70.setText("Mã sản phẩm");

        attribute71.setText("Tên sản phẩm");

        attribute72.setText("Giá sản phẩm");

        attribute73.setText("Số lượng");

        btSP.setText("...");
        btSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder23Layout = new javax.swing.GroupLayout(panelBorder23);
        panelBorder23.setLayout(panelBorder23Layout);
        panelBorder23Layout.setHorizontalGroup(
            panelBorder23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder23Layout.createSequentialGroup()
                        .addGroup(panelBorder23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(attribute73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attribute72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attribute71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attribute70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder23Layout.createSequentialGroup()
                        .addGroup(panelBorder23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTenSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelBorder23Layout.createSequentialGroup()
                                .addComponent(txtMaSP, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtGiaSP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(16, 16, 16))))
        );
        panelBorder23Layout.setVerticalGroup(
            panelBorder23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder23Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(attribute70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorder23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(attribute71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(attribute72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGiaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(attribute73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelBorder19Layout = new javax.swing.GroupLayout(panelBorder19);
        panelBorder19.setLayout(panelBorder19Layout);
        panelBorder19Layout.setHorizontalGroup(
            panelBorder19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBorder23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        panelBorder19Layout.setVerticalGroup(
            panelBorder19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder19Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(panelBorder19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBorder21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBorder23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        panelBorder20.setBackground(new java.awt.Color(153, 153, 153));

        btAdd.setText("Add");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btNew.setText("New");
        btNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewActionPerformed(evt);
            }
        });

        Print.setText("Print");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });

        btDelete.setText("Delete");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        ckMaNV.setFont(new java.awt.Font("Dosis ExtraBold", 0, 13)); // NOI18N
        ckMaNV.setForeground(new java.awt.Color(0, 0, 0));
        ckMaNV.setText("Mã nhân viên");

        ckMaKH.setFont(new java.awt.Font("Dosis ExtraBold", 0, 13)); // NOI18N
        ckMaKH.setForeground(new java.awt.Color(0, 0, 0));
        ckMaKH.setText("Mã khách hàng");

        ckMaHD.setFont(new java.awt.Font("Dosis ExtraBold", 0, 13)); // NOI18N
        ckMaHD.setForeground(new java.awt.Color(0, 0, 0));
        ckMaHD.setText("Mã hóa đơn");

        ckTongTien.setFont(new java.awt.Font("Dosis ExtraBold", 0, 13)); // NOI18N
        ckTongTien.setForeground(new java.awt.Color(0, 0, 0));
        ckTongTien.setText("Tổng tiền");

        CkTimNgayTheoKhoang.setFont(new java.awt.Font("Dosis ExtraBold", 0, 13)); // NOI18N
        CkTimNgayTheoKhoang.setForeground(new java.awt.Color(0, 0, 0));
        CkTimNgayTheoKhoang.setText("Tìm ngày theo khoảng");

        btSearch.setText("Search");
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });

        buttonGroup1.add(btTaoHD);
        btTaoHD.setFont(new java.awt.Font("Dosis ExtraBold", 0, 13)); // NOI18N
        btTaoHD.setForeground(new java.awt.Color(0, 0, 0));
        btTaoHD.setText("Tạo hóa đơn");
        btTaoHD.setContentAreaFilled(false);
        btTaoHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTaoHDActionPerformed(evt);
            }
        });

        buttonGroup1.add(btXemHD);
        btXemHD.setFont(new java.awt.Font("Dosis ExtraBold", 0, 13)); // NOI18N
        btXemHD.setForeground(new java.awt.Color(0, 0, 0));
        btXemHD.setText("Xem hóa đơn");
        btXemHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXemHDActionPerformed(evt);
            }
        });

        ckNgayLap.setFont(new java.awt.Font("Dosis ExtraBold", 0, 13)); // NOI18N
        ckNgayLap.setForeground(new java.awt.Color(0, 0, 0));
        ckNgayLap.setText("Ngày lập");

        attribute1.setText("đến");

        btClear.setText("Clear");
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder20Layout = new javax.swing.GroupLayout(panelBorder20);
        panelBorder20.setLayout(panelBorder20Layout);
        panelBorder20Layout.setHorizontalGroup(
            panelBorder20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder20Layout.createSequentialGroup()
                        .addGroup(panelBorder20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelBorder20Layout.createSequentialGroup()
                                .addComponent(txtNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(attribute1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorder20Layout.createSequentialGroup()
                                .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(panelBorder20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelBorder20Layout.createSequentialGroup()
                                        .addComponent(btXemHD)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                        .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelBorder20Layout.createSequentialGroup()
                                        .addComponent(btTaoHD)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btClear, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btNew, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(12, 12, 12))
                    .addGroup(panelBorder20Layout.createSequentialGroup()
                        .addGroup(panelBorder20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ckMaHD)
                            .addComponent(ckMaKH)
                            .addComponent(ckMaNV))
                        .addGap(55, 55, 55)
                        .addGroup(panelBorder20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CkTimNgayTheoKhoang)
                            .addComponent(ckNgayLap)
                            .addComponent(ckTongTien))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelBorder20Layout.setVerticalGroup(
            panelBorder20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder20Layout.createSequentialGroup()
                .addGroup(panelBorder20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder20Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelBorder20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btTaoHD))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btNew, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btClear, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btXemHD))
                    .addGroup(panelBorder20Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(panelBorder20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(panelBorder20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder20Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder20Layout.createSequentialGroup()
                        .addGroup(panelBorder20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ckMaHD)
                            .addComponent(ckNgayLap))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ckTongTien)
                            .addComponent(ckMaKH))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CkTimNgayTheoKhoang)
                            .addComponent(ckMaNV))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelBorder20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNgayBatDau, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(attribute1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(42, 42, 42))
        );

        panelBorder22.setBackground(new java.awt.Color(153, 153, 153));

        tbTableInvoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã hóa đơn", "Ngày lập", "Mã nhân viên", "Mã khách hàng", "Tổng tiền"
            }
        ));
        tbTableInvoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTableInvoiceMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbTableInvoice);

        tbTableCTInvoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã hóa đơn", "Mã sản phẩm", "Tên sản phẩm", "Giá sản phẩm", "Số lượng"
            }
        ));
        tbTableCTInvoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTableCTInvoiceMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tbTableCTInvoice);

        javax.swing.GroupLayout panelBorder22Layout = new javax.swing.GroupLayout(panelBorder22);
        panelBorder22.setLayout(panelBorder22Layout);
        panelBorder22Layout.setHorizontalGroup(
            panelBorder22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                    .addComponent(jScrollPane6))
                .addContainerGap())
        );
        panelBorder22Layout.setVerticalGroup(
            panelBorder22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBorder19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBorder20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelBorder22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelBorder19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelBorder20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panelBorder22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
  
    private void tbTableCTInvoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTableCTInvoiceMouseClicked
        
        int k = tbTableCTInvoice.getSelectedRow();
        txtMaSP.setText(tbTableCTInvoice.getModel().getValueAt(k, 1).toString());
        txtTenSP.setText(tbTableCTInvoice.getModel().getValueAt(k, 2).toString());
        txtGiaSP.setText(tbTableCTInvoice.getModel().getValueAt(k, 3).toString());       
        txtSoLuong.setText(tbTableCTInvoice.getModel().getValueAt(k, 4).toString());
    }//GEN-LAST:event_tbTableCTInvoiceMouseClicked

    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed
        InformationDTO io = new InformationDTO();
        loadDataInvoice();
        int MaHD = Integer.parseInt(listInvoice.get(listInvoice.size() -1).getMaHD()) + 1;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
       
        txtMaHD.setText(String.valueOf(MaHD));
        txtMaNV.setText(io.getMaNV());
        txtMaKH.setText("");
        txtTongTien.setText("");
        txtMaSP.setText("");
        txtTenSP.setText("");
        txtGiaSP.setText("");
        txtSoLuong.setText("");
        modelCTInvoice.setRowCount(0);
        listCTInvoice.clear();
        Sum = 0;
        
    }//GEN-LAST:event_btNewActionPerformed

    private void btKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKHActionPerformed
        DialogCustomer dc = new DialogCustomer();
        dc.setVisible(true);
        String s = dc.getMaKhachHang();
        txtMaKH.setText(s);
        
    }//GEN-LAST:event_btKHActionPerformed
    public void setSoLuong(CTInvoiceDTO ct){
        for(ProductDTO pro : listProduct){
            if(pro.getMaSP().equals(ct.getMaSP())){
                SL = Integer.parseInt(pro.getSoLuong()) - Integer.parseInt(ct.getSoLuong());
                ProductDTO p = new ProductDTO(
                        pro.getMaSP(), 
                        pro.getTenSP(), 
                        String.valueOf(SL), 
                        pro.getGiaNhapHang(), 
                        pro.getGiaSanPham(), 
                        pro.getMaLoai(), 
                        pro.getMaNSX(), 
                        pro.getIMG());
                proBUS.update(p);
            }
        }
    }
    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        try{
            String MaHD = txtMaHD.getText();
            String MaKH = txtMaKH.getText();
            String MaNV = txtMaNV.getText();
            Date NgayLap = txtNgayLap.getDate();
            String TongTien = txtTongTien.getText();
            InvoiceDTO in = new InvoiceDTO(MaHD, MaKH, MaNV, NgayLap, TongTien);
            inBUS.insert(in);
            loadDataInvoice();

            for(CTInvoiceDTO x : listCTInvoice){
                ctinBUS.insert(x);
                setSoLuong(x);
            }
            modelCTInvoice.setRowCount(0);
            JOptionPane.showMessageDialog(this, "Tạo hóa đơn thành công");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_PrintActionPerformed
    public CTInvoiceDTO KT_CT(){
        for(CTInvoiceDTO ct : listCTInvoice){
            if(ct.getMaSP().equals(txtMaSP.getText())){
               return ct;
            }
       }
        return null;
    }
    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        listCTInvoice.remove(KT_CT());
        showCTInvoiceTheoMa(listCTInvoice);
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btTaoHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTaoHDActionPerformed
        tbTableInvoice.setEnabled(false);
        tbTableInvoice.getSelectionModel().clearSelection(); //bỏ chọn Row trong JTable
        btAdd.setEnabled(true);
        btDelete.setEnabled(true);
    
       
    }//GEN-LAST:event_btTaoHDActionPerformed

    private void btXemHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXemHDActionPerformed
       tbTableInvoice.setEnabled(true);
       btAdd.setEnabled(false);
       btDelete.setEnabled(false);
       
    }//GEN-LAST:event_btXemHDActionPerformed

    private void btSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSPActionPerformed
        DialogProductHD dp = new DialogProductHD();
        dp.setVisible(true);
        String m = dp.getMaSanPham();
        txtMaSP.setText(m);
        String t = dp.getTenSanPham();
        txtTenSP.setText(t);
        String g = dp.getGiaSanPham();
        txtGiaSP.setText(g);
        String s = dp.getSoLuong();
        txtSoLuong.setText(s);
        
    }//GEN-LAST:event_btSPActionPerformed
    
    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        if(txtMaHD.getText().trim().isEmpty()
           ||txtMaSP.getText().trim().isEmpty()
           || txtTenSP.getText().trim().isEmpty()
           || txtGiaSP.getText().trim().isEmpty()
           || txtSoLuong.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill in product information!");
            return;
        }
        String MaHD = txtMaHD.getText();
        String MaSP = txtMaSP.getText();
        String TenSP = txtTenSP.getText();
        String GiaSP = txtGiaSP.getText();
        String SoLuong = txtSoLuong.getText();
        CTInvoiceDTO ct = new CTInvoiceDTO(MaHD, MaSP, TenSP, GiaSP, SoLuong);

        listCTInvoice.add(ct);
        showCTInvoiceTheoMa(listCTInvoice);
        Sum += Integer.parseInt(GiaSP) * Integer.parseInt(SoLuong);
        txtTongTien.setText(String.valueOf(Sum));
    }//GEN-LAST:event_btAddActionPerformed

    private void tbTableInvoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTableInvoiceMouseClicked

        int k = tbTableInvoice.getSelectedRow();
        txtMaHD.setText(tbTableInvoice.getModel().getValueAt(k, 0).toString());
        txtMaKH.setText(tbTableInvoice.getModel().getValueAt(k, 3).toString());
        txtMaNV.setText(tbTableInvoice.getModel().getValueAt(k, 2).toString());
        txtTongTien.setText(tbTableInvoice.getModel().getValueAt(k, 4).toString());
        String dateString = tbTableInvoice.getModel().getValueAt(k,1).toString();
        try {
            Date d = dateFormat.parse(dateString);
            txtNgayLap.setDate(d);
        } catch (ParseException ex) {
            Logger.getLogger(InvoiceGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        String MaHD = txtMaHD.getText();
        loadDataCTInTheoMa(MaHD);

    }//GEN-LAST:event_tbTableInvoiceMouseClicked

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        String sql ="SELECT * FROM HOADON WHERE 1 = 1";
        try{
            String MaHD = txtMaHD.getText();
            String MaKH = txtMaKH.getText();
            String MaNV = txtMaNV.getText();
            Date dateNgayLap = txtNgayLap.getDate();
            Date dateNgayBatDau = txtNgayBatDau.getDate();
            Date dateNgayKetThuc = txtNgayKetThuc.getDate();
            String NgayLap = "";
            String NgayBatDau ="";
            String NgayKetThuc = "";
            String TongTien = txtTongTien.getText();
            if(ckMaHD.isSelected()){
                if(MaHD.trim().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Chưa nhập mã hóa đơn cần tìm");
                    return;
                }
                    sql +=" AND MAHD LIKE " + MaHD ;
            }
            if(ckMaKH.isSelected()){
                if(MaKH.trim().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Chưa nhập mã khách hàng cần tìm");
                    return;
                }
                    sql +=" AND MAKH LIKE '%" + MaKH + "%'";
            }
            if(ckMaNV.isSelected()){
                if(MaNV.trim().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Chưa nhập mã nhân viên cần tìm");
                    return;
                }
                    sql +=" AND MANV LIKE '%" + MaNV + "%'";
            }
            if(ckNgayLap.isSelected() && dateNgayLap != null){
                    NgayLap = dateFormat.format(dateNgayLap);
                    sql +=" AND NGAYLAP = '" + NgayLap + "'";
            }
            if(CkTimNgayTheoKhoang.isSelected() && dateNgayBatDau != null && dateNgayKetThuc != null){
                    NgayBatDau = dateFormat.format(dateNgayBatDau);
                    NgayKetThuc = dateFormat.format(dateNgayKetThuc);
                    sql +=" AND NGAYLAP BETWEEN '" + NgayBatDau +"' AND '" + NgayKetThuc +"'";
            }
            if(ckTongTien.isSelected()){
                if(TongTien.trim().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Chưa nhập tổng tiền thấp nhất cần lọc");
                    return;
                }
                    sql +=" AND TONGTIEN >= " + TongTien + " AND TONGTIEN <= 1000000000";  
            }
            loadSearch(sql);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_btSearchActionPerformed

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
       txtMaHD.setText("");
       txtMaKH.setText("");
       txtMaSP.setText("");
       txtTongTien.setText("");
    }//GEN-LAST:event_btClearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CkTimNgayTheoKhoang;
    private Design.MyButtonIcon Print;
    private Design.Attribute attribute1;
    private Design.Attribute attribute61;
    private Design.Attribute attribute62;
    private Design.Attribute attribute63;
    private Design.Attribute attribute64;
    private Design.Attribute attribute65;
    private Design.Attribute attribute70;
    private Design.Attribute attribute71;
    private Design.Attribute attribute72;
    private Design.Attribute attribute73;
    private Design.MyButtonIcon btAdd;
    private Design.MyButtonIcon btClear;
    private Design.MyButtonIcon btDelete;
    private Design.MyButton btKH;
    private Design.MyButtonIcon btNew;
    private Design.MyButton btSP;
    private Design.MyButtonIcon btSearch;
    private javax.swing.JRadioButton btTaoHD;
    private javax.swing.JRadioButton btXemHD;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox ckMaHD;
    private javax.swing.JCheckBox ckMaKH;
    private javax.swing.JCheckBox ckMaNV;
    private javax.swing.JCheckBox ckNgayLap;
    private javax.swing.JCheckBox ckTongTien;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable2;
    private Design.PanelBorder panelBorder12;
    private Design.PanelBorder panelBorder19;
    private Design.PanelBorder panelBorder20;
    private Design.PanelBorder panelBorder21;
    private Design.PanelBorder panelBorder22;
    private Design.PanelBorder panelBorder23;
    private javax.swing.JTable tbTableCTInvoice;
    private javax.swing.JTable tbTableInvoice;
    private Design.Text txtGiaSP;
    private Design.Text txtMaHD;
    private Design.Text txtMaKH;
    private Design.Text txtMaNV;
    private Design.Text txtMaSP;
    private com.toedter.calendar.JDateChooser txtNgayBatDau;
    private com.toedter.calendar.JDateChooser txtNgayKetThuc;
    private com.toedter.calendar.JDateChooser txtNgayLap;
    private Design.Text txtSoLuong;
    private Design.Text txtTenSP;
    private Design.Text txtTongTien;
    // End of variables declaration//GEN-END:variables
}
