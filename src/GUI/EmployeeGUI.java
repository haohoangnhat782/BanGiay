
package GUI;

import BUS.AccountBUS;
import BUS.EmployeeBUS;
import DTO.AccountDTO;
import DTO.EmployeeDTO;
import Design.TableCustom;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class EmployeeGUI extends javax.swing.JPanel {
    DefaultTableModel modelEmployee;
    DefaultTableModel modelAccount;
    private EmployeeBUS empBUS = new EmployeeBUS();
    private ArrayList<EmployeeDTO> listEmployee;
    private AccountBUS accBUS = new AccountBUS();
    private ArrayList<AccountDTO> listAccount;
    public EmployeeGUI() {
        initComponents();
        TableCustom.apply(jScrollPane2, TableCustom.TableType.DEFAULT);
        TableCustom.apply(jScrollPane3, TableCustom.TableType.DEFAULT);
        modelEmployee = (DefaultTableModel) tbTableEmployee.getModel();
        modelAccount = (DefaultTableModel) tbTableAccount.getModel();
        empBUS.readList(); 
        accBUS.readList();
        loadDataEmployee();
        loadMaNV();
        loadDataAccount();
    }
    public void loadDataEmployee(){
        listEmployee = empBUS.getListEmployee();
        showAllEmployee(listEmployee);
    }
    public void loadDataAccount(){
        listAccount = accBUS.getListAccount();
        showAllAccount(listAccount);
    }
    private void loadMaNV(){       
        empBUS.readMaNV();
        ArrayList<String> listMaKH = empBUS.getListMaKH();
        Collections.sort(listMaKH, Collections.reverseOrder());
        cbxMaNV.removeAllItems();
        for(String x : listMaKH){
        cbxMaNV.addItem(x);
        }
    }
    public void showAllEmployee(ArrayList<EmployeeDTO> listEmp){
        modelEmployee.setRowCount(0);
        for(int i = 0; i < listEmp.size(); i++) {
            modelEmployee.addRow(new String[]{
                listEmp.get(i).getMaNV(),
                listEmp.get(i).getHoNV(),
                listEmp.get(i).getTenNV(),
                listEmp.get(i).getNamSinh(),
                listEmp.get(i).getGioiTinh(),
                listEmp.get(i).getDienThoai(),
                listEmp.get(i).getDiaChi(),
                listEmp.get(i).getLuong(),
                listEmp.get(i).getIMG(),
            });
        }          
    }
    public void showAllAccount(ArrayList<AccountDTO> listAcc){
        modelAccount.setRowCount(0);
        for(int i = 0; i < listAcc.size();i++){
            modelAccount.addRow(new String[]{
                listAcc.get(i).getMaNV(),
                listAcc.get(i).getTenDangNhap(),
                listAcc.get(i).getMatKhau(),
                listAcc.get(i).getEmail(),
                listAcc.get(i).getRoleID()
                
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myTabBedPane1 = new Design.MyTabBedPane();
        jPanel1 = new javax.swing.JPanel();
        panelBorder6 = new Design.PanelBorder();
        attribute20 = new Design.Attribute();
        txtMaNV = new Design.Text();
        attribute21 = new Design.Attribute();
        txtHoNV = new Design.Text();
        attribute22 = new Design.Attribute();
        attribute23 = new Design.Attribute();
        attribute24 = new Design.Attribute();
        attribute25 = new Design.Attribute();
        panelBorder7 = new Design.PanelBorder();
        btDelete1 = new Design.MyButtonIcon();
        btAdd = new Design.MyButtonIcon();
        btNew = new Design.MyButtonIcon();
        btUpdate = new Design.MyButtonIcon();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        myButtonIcon1 = new Design.MyButtonIcon();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        txtDienThoai = new Design.Text();
        txtDiaChi = new Design.Text();
        txtTenNV = new Design.Text();
        txtLuong = new Design.Text();
        attribute28 = new Design.Attribute();
        cbxMaNV = new Design.MyComboBox();
        cbxGioiTinh = new Design.MyComboBox();
        txtNamSinh = new Design.Text();
        attribute1 = new Design.Attribute();
        lbIMG = new Design.MyLabel_Icon();
        attribute4 = new Design.Attribute();
        txtIMG = new Design.Text();
        panelBorder5 = new Design.PanelBorder();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbTableEmployee = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        panelBorder8 = new Design.PanelBorder();
        attribute26 = new Design.Attribute();
        txtNguoiDung = new Design.Text();
        attribute29 = new Design.Attribute();
        txtTenDangNhap = new Design.Text();
        attribute30 = new Design.Attribute();
        panelBorder9 = new Design.PanelBorder();
        btDeleteAcc = new Design.MyButtonIcon();
        btAddAcc = new Design.MyButtonIcon();
        btNewAcc = new Design.MyButtonIcon();
        btUpdateAcc = new Design.MyButtonIcon();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        myButtonIcon2 = new Design.MyButtonIcon();
        jCheckBox13 = new javax.swing.JCheckBox();
        txtMatKhau = new Design.Text();
        txtEmail = new Design.Text();
        attribute2 = new Design.Attribute();
        attribute3 = new Design.Attribute();
        txtRoleID = new Design.Text();
        panelBorder10 = new Design.PanelBorder();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbTableAccount = new javax.swing.JTable();

        myTabBedPane1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBorder6.setBackground(new java.awt.Color(153, 153, 153));

        attribute20.setText("Mã nhân viên");

        txtMaNV.setFont(new java.awt.Font("Dosis ExtraBold", 0, 15)); // NOI18N

        attribute21.setText("Họ nhân viên");

        txtHoNV.setFont(new java.awt.Font("Dosis ExtraBold", 0, 15)); // NOI18N

        attribute22.setText("Tên nhân viên");

        attribute23.setText("Giới tính");

        attribute24.setText("Điện thoại");

        attribute25.setText("Địa chỉ");

        panelBorder7.setBackground(new java.awt.Color(255, 255, 255));

        btDelete1.setText("Delete");
        btDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelete1ActionPerformed(evt);
            }
        });

        btAdd.setText("Add");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btNew.setText("Clear");
        btNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewActionPerformed(evt);
            }
        });

        btUpdate.setText("Update");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("Dosis ExtraBold", 0, 13)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox2.setText("Họ nhân viên");

        jCheckBox3.setFont(new java.awt.Font("Dosis ExtraBold", 0, 13)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox3.setText("Năm sinh");

        jCheckBox4.setFont(new java.awt.Font("Dosis ExtraBold", 0, 13)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox4.setText("Giới tính");

        jCheckBox5.setFont(new java.awt.Font("Dosis ExtraBold", 0, 13)); // NOI18N
        jCheckBox5.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox5.setText("Tên nhân viên");

        jCheckBox6.setFont(new java.awt.Font("Dosis ExtraBold", 0, 13)); // NOI18N
        jCheckBox6.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox6.setText("Địa chỉ");

        jCheckBox7.setFont(new java.awt.Font("Dosis ExtraBold", 0, 13)); // NOI18N
        jCheckBox7.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox7.setText("Lương");

        myButtonIcon1.setText("Search");
        myButtonIcon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButtonIcon1ActionPerformed(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Dosis ExtraBold", 0, 13)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setText("Mã nhân viên");

        jCheckBox8.setFont(new java.awt.Font("Dosis ExtraBold", 0, 13)); // NOI18N
        jCheckBox8.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox8.setText("Điện thoại");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder7Layout = new javax.swing.GroupLayout(panelBorder7);
        panelBorder7.setLayout(panelBorder7Layout);
        panelBorder7Layout.setHorizontalGroup(
            panelBorder7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder7Layout.createSequentialGroup()
                        .addGroup(panelBorder7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder7Layout.createSequentialGroup()
                                .addGroup(panelBorder7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelBorder7Layout.createSequentialGroup()
                                        .addComponent(jCheckBox1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox4))
                                    .addGroup(panelBorder7Layout.createSequentialGroup()
                                        .addComponent(jCheckBox2)
                                        .addGap(18, 18, 18)
                                        .addGroup(panelBorder7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox6)
                                            .addComponent(jCheckBox5))))
                                .addGroup(panelBorder7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelBorder7Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jCheckBox8))
                                    .addGroup(panelBorder7Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panelBorder7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(myButtonIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jCheckBox7)))))
                            .addComponent(jCheckBox3)
                            .addComponent(btNew, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(50, Short.MAX_VALUE))
                    .addGroup(panelBorder7Layout.createSequentialGroup()
                        .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addGap(10, 10, 10))))
        );
        panelBorder7Layout.setVerticalGroup(
            panelBorder7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBorder7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox8))
                .addGap(9, 9, 9)
                .addGroup(panelBorder7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox7))
                .addGroup(panelBorder7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder7Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelBorder7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btNew, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(myButtonIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelBorder7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder7Layout.createSequentialGroup()
                        .addComponent(btDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(panelBorder7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        txtDienThoai.setFont(new java.awt.Font("Dosis ExtraBold", 0, 15)); // NOI18N

        txtDiaChi.setFont(new java.awt.Font("Dosis ExtraBold", 0, 15)); // NOI18N
        txtDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiActionPerformed(evt);
            }
        });

        txtTenNV.setFont(new java.awt.Font("Dosis ExtraBold", 0, 15)); // NOI18N

        txtLuong.setFont(new java.awt.Font("Dosis ExtraBold", 0, 15)); // NOI18N

        attribute28.setText("Lương");

        cbxGioiTinh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chọn giới tính", "nam", "nữ", " " }));
        cbxGioiTinh.setFont(new java.awt.Font("Dosis ExtraBold", 0, 15)); // NOI18N

        txtNamSinh.setFont(new java.awt.Font("Dosis ExtraBold", 0, 15)); // NOI18N

        attribute1.setText("Năm sinh");

        attribute4.setText("IMG");

        txtIMG.setFont(new java.awt.Font("Dosis ExtraBold", 0, 15)); // NOI18N

        javax.swing.GroupLayout panelBorder6Layout = new javax.swing.GroupLayout(panelBorder6);
        panelBorder6.setLayout(panelBorder6Layout);
        panelBorder6Layout.setHorizontalGroup(
            panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder6Layout.createSequentialGroup()
                        .addGroup(panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(attribute20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attribute21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(220, 220, 220)
                        .addComponent(attribute23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder6Layout.createSequentialGroup()
                        .addGroup(panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtHoNV, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                .addComponent(txtNamSinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(attribute1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(attribute22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attribute25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelBorder6Layout.createSequentialGroup()
                                .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIMG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(panelBorder6Layout.createSequentialGroup()
                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(cbxMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbxGioiTinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBorder6Layout.createSequentialGroup()
                                .addGroup(panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(attribute24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(panelBorder6Layout.createSequentialGroup()
                                        .addGroup(panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(attribute4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(attribute28, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 45, Short.MAX_VALUE)))))))
                .addGap(18, 18, 18)
                .addComponent(lbIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBorder7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelBorder6Layout.setVerticalGroup(
            panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBorder7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBorder6Layout.createSequentialGroup()
                        .addGroup(panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(attribute20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attribute23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder6Layout.createSequentialGroup()
                                .addGroup(panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelBorder6Layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addGroup(panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(attribute21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(attribute22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtHoNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(panelBorder6Layout.createSequentialGroup()
                                        .addGroup(panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(cbxMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cbxGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(attribute28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(attribute25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(attribute1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(attribute4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNamSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIMG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelBorder6Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(attribute24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelBorder6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1150, 240));

        panelBorder5.setBackground(new java.awt.Color(255, 255, 255));

        tbTableEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Họ nhân viên", "Tên nhân viên", "Giới tính", "Năm Sinh", "Điện thoại", "Địa chỉ", "Lương", "IMG"
            }
        ));
        tbTableEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTableEmployeeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbTableEmployee);

        javax.swing.GroupLayout panelBorder5Layout = new javax.swing.GroupLayout(panelBorder5);
        panelBorder5.setLayout(panelBorder5Layout);
        panelBorder5Layout.setHorizontalGroup(
            panelBorder5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1158, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBorder5Layout.setVerticalGroup(
            panelBorder5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel1.add(panelBorder5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 1170, 390));

        myTabBedPane1.addTab("Staff", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBorder8.setBackground(new java.awt.Color(153, 153, 153));

        attribute26.setText("Mã nhân viên");

        txtNguoiDung.setFont(new java.awt.Font("Dosis ExtraBold", 0, 15)); // NOI18N

        attribute29.setText("Tên đăng nhập");

        txtTenDangNhap.setFont(new java.awt.Font("Dosis ExtraBold", 0, 15)); // NOI18N

        attribute30.setText("Mật khẩu");

        panelBorder9.setBackground(new java.awt.Color(255, 255, 255));

        btDeleteAcc.setText("Delete");
        btDeleteAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteAccActionPerformed(evt);
            }
        });

        btAddAcc.setText("Add");
        btAddAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddAccActionPerformed(evt);
            }
        });

        btNewAcc.setText("Clear");
        btNewAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewAccActionPerformed(evt);
            }
        });

        btUpdateAcc.setText("Update");
        btUpdateAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateAccActionPerformed(evt);
            }
        });

        jCheckBox9.setFont(new java.awt.Font("Dosis ExtraBold", 0, 13)); // NOI18N
        jCheckBox9.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox9.setText("Mã nhân viên");

        jCheckBox10.setFont(new java.awt.Font("Dosis ExtraBold", 0, 13)); // NOI18N
        jCheckBox10.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox10.setText("Tên đăng nhập");

        jCheckBox11.setFont(new java.awt.Font("Dosis ExtraBold", 0, 13)); // NOI18N
        jCheckBox11.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox11.setText("RoleID");

        jCheckBox12.setFont(new java.awt.Font("Dosis ExtraBold", 0, 13)); // NOI18N
        jCheckBox12.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox12.setText("Mật khẩu");

        myButtonIcon2.setText("Search");
        myButtonIcon2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButtonIcon2ActionPerformed(evt);
            }
        });

        jCheckBox13.setFont(new java.awt.Font("Dosis ExtraBold", 0, 13)); // NOI18N
        jCheckBox13.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox13.setText("Email");
        jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder9Layout = new javax.swing.GroupLayout(panelBorder9);
        panelBorder9.setLayout(panelBorder9Layout);
        panelBorder9Layout.setHorizontalGroup(
            panelBorder9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder9Layout.createSequentialGroup()
                        .addComponent(btAddAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btDeleteAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btUpdateAcc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder9Layout.createSequentialGroup()
                        .addGroup(panelBorder9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox9)
                            .addComponent(jCheckBox10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelBorder9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox13)
                            .addComponent(jCheckBox12))
                        .addGap(21, 21, 21)
                        .addGroup(panelBorder9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox11)
                            .addComponent(myButtonIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66))
                    .addGroup(panelBorder9Layout.createSequentialGroup()
                        .addComponent(btNewAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelBorder9Layout.setVerticalGroup(
            panelBorder9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder9Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(panelBorder9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox9)
                    .addComponent(jCheckBox13)
                    .addComponent(jCheckBox11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorder9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox10)
                    .addComponent(jCheckBox12)
                    .addComponent(myButtonIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btNewAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelBorder9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btUpdateAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAddAcc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btDeleteAcc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        txtMatKhau.setFont(new java.awt.Font("Dosis ExtraBold", 0, 15)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Dosis ExtraBold", 0, 15)); // NOI18N

        attribute2.setText("Email");

        attribute3.setText("RoleID");

        txtRoleID.setFont(new java.awt.Font("Dosis ExtraBold", 0, 15)); // NOI18N

        javax.swing.GroupLayout panelBorder8Layout = new javax.swing.GroupLayout(panelBorder8);
        panelBorder8.setLayout(panelBorder8Layout);
        panelBorder8Layout.setHorizontalGroup(
            panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(attribute2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBorder8Layout.createSequentialGroup()
                        .addGroup(panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNguoiDung, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(attribute29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTenDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(attribute26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(attribute3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(attribute30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRoleID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(panelBorder9, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelBorder8Layout.setVerticalGroup(
            panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelBorder9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBorder8Layout.createSequentialGroup()
                        .addGroup(panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(attribute26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attribute3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder8Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(attribute29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(attribute30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtRoleID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(attribute2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel2.add(panelBorder8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 790, 250));

        panelBorder10.setBackground(new java.awt.Color(255, 255, 255));

        tbTableAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Tên đăng nhập", "Mật khẩu", "Email", "RoleID"
            }
        ));
        tbTableAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTableAccountMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbTableAccount);

        javax.swing.GroupLayout panelBorder10Layout = new javax.swing.GroupLayout(panelBorder10);
        panelBorder10.setLayout(panelBorder10Layout);
        panelBorder10Layout.setHorizontalGroup(
            panelBorder10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder10Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1013, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        panelBorder10Layout.setVerticalGroup(
            panelBorder10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder10Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel2.add(panelBorder10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 1170, 370));

        myTabBedPane1.addTab("Account", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myTabBedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myTabBedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        myTabBedPane1.getAccessibleContext().setAccessibleName("\n\n");
    }// </editor-fold>//GEN-END:initComponents

    private void txtDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiActionPerformed

    private void tbTableEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTableEmployeeMouseClicked
        int k = tbTableEmployee.getSelectedRow();
        lbIMG.setImage_Icon(new ImageIcon(getClass().getResource("/HinhNV/"+ tbTableEmployee.getModel().getValueAt(k, 8).toString())));
        txtMaNV.setText(tbTableEmployee.getModel().getValueAt(k, 0).toString());
        txtHoNV.setText(tbTableEmployee.getModel().getValueAt(k, 1).toString());
        txtTenNV.setText(tbTableEmployee.getModel().getValueAt(k, 2).toString());
        txtNamSinh.setText(tbTableEmployee.getModel().getValueAt(k, 3).toString());
        cbxGioiTinh.setSelectedItem(tbTableEmployee.getModel().getValueAt(k, 4).toString());
        txtDienThoai.setText(tbTableEmployee.getModel().getValueAt(k, 5).toString());
        txtDiaChi.setText(tbTableEmployee.getModel().getValueAt(k, 6).toString());
        txtLuong.setText(tbTableEmployee.getModel().getValueAt(k, 7).toString());
        txtIMG.setText(tbTableEmployee.getModel().getValueAt(k, 8).toString());
        txtMaNV.setEnabled(false);
    }//GEN-LAST:event_tbTableEmployeeMouseClicked

    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed
       txtMaNV.setText("");
       txtHoNV.setText("");
       txtTenNV.setText("");
       txtNamSinh.setText("");
       cbxGioiTinh.setSelectedIndex(0);
       txtDienThoai.setText("");
       txtDiaChi.setText("");
       txtLuong.setText("");
       txtIMG.setText("");
       txtMaNV.setEnabled(true);
       tbTableEmployee.getSelectionModel().clearSelection(); //bỏ chọn Row trong JTable
      
    }//GEN-LAST:event_btNewActionPerformed

    private void btNewAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewAccActionPerformed
        txtNguoiDung.setText("");
        txtTenDangNhap.setText("");
        txtMatKhau.setText("");
        txtEmail.setText("");
        txtRoleID.setText("");
    }//GEN-LAST:event_btNewAccActionPerformed

    private void tbTableAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTableAccountMouseClicked
        int k = tbTableAccount.getSelectedRow();
        txtNguoiDung.setText(tbTableAccount.getModel().getValueAt(k, 0).toString());
        txtTenDangNhap.setText(tbTableAccount.getModel().getValueAt(k, 1).toString());
        txtMatKhau.setText(tbTableAccount.getModel().getValueAt(k, 2).toString());
        txtEmail.setText(tbTableAccount.getModel().getValueAt(k, 3).toString());
        txtRoleID.setText(tbTableAccount.getModel().getValueAt(k, 4).toString());
        
    }//GEN-LAST:event_tbTableAccountMouseClicked

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
            if (txtMaNV.getText().trim().isEmpty() 
                || txtHoNV.getText().trim().isEmpty() 
                || txtTenNV.getText().trim().isEmpty()
                || txtNamSinh.getText().trim().isEmpty()
                || cbxGioiTinh.getSelectedItem().equals("Chọn giới tính")
                || txtDienThoai.getText().trim().isEmpty()
                || txtLuong.getText().trim().isEmpty()
                || txtIMG.getText().trim().isEmpty()
                || txtDiaChi.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in employee information!");
            return;
            }
            String MaNV = txtMaNV.getText();
            String HoNV = txtHoNV.getText();
            String TenNV = txtTenNV.getText();
            String NamSinh = txtNamSinh.getText();
            String GioiTinh = (String) cbxGioiTinh.getSelectedItem();
            String DienThoai = txtDienThoai.getText();
            String DiaChi = txtDiaChi.getText();
            String Luong = txtLuong.getText();
            String IMG = txtIMG.getText();
            EmployeeDTO employee = new EmployeeDTO(MaNV, HoNV, TenNV, NamSinh, GioiTinh, DienThoai, DiaChi, Luong, IMG);
            empBUS.insert(employee);
            loadDataEmployee();
            loadMaNV();
            JOptionPane.showMessageDialog(this, "Successfully added employees!");
    }//GEN-LAST:event_btAddActionPerformed

    private void btDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDelete1ActionPerformed
        empBUS.delete(txtMaNV.getText());
        loadDataEmployee();
        loadMaNV();
        JOptionPane.showMessageDialog(this, "Employee deleted!");
        
    }//GEN-LAST:event_btDelete1ActionPerformed

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        String MaNV = txtMaNV.getText();
        String HoNV = txtHoNV.getText();
        String TenNV = txtTenNV.getText();
        String NamSinh = txtNamSinh.getText();
        String GioiTinh = (String) cbxGioiTinh.getSelectedItem();
        String DienThoai = txtDienThoai.getText();
        String DiaChi = txtDiaChi.getText();
        String Luong = txtLuong.getText();
        String IMG = txtIMG.getText();
        EmployeeDTO employee = new EmployeeDTO(MaNV, HoNV, TenNV, NamSinh, GioiTinh, DienThoai, DiaChi, Luong, IMG);
        empBUS.update(employee);
        loadDataEmployee();
    }//GEN-LAST:event_btUpdateActionPerformed

    private void btAddAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddAccActionPerformed
        if (txtNguoiDung.getText().trim().isEmpty() 
                || txtTenDangNhap.getText().trim().isEmpty() 
                || txtMatKhau.getText().trim().isEmpty()
                || txtEmail.getText().trim().isEmpty()
                || txtRoleID.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in account information!");
            return;
        }
        else{
            if(CheckEmployee(txtNguoiDung.getText()) == false){
                 JOptionPane.showMessageDialog(this, "No staff has the code is" + txtNguoiDung.getText() + " !");
                 return;
            }
            else{
                if(CheckAccount(txtNguoiDung.getText()) == true){
                     JOptionPane.showMessageDialog(this, "Employee already has an account");
                     return;
                }
                else{
                    String NguoiDung = txtNguoiDung.getText();
                    String TenDangNhap = txtTenDangNhap.getText();
                    String MatKhau = txtMatKhau.getText();
                    String Email = txtEmail.getText();    
                    String RoleID = txtRoleID.getText();
                    AccountDTO account = new AccountDTO(NguoiDung, TenDangNhap, MatKhau, Email, RoleID);
                    accBUS.insert(account);
                    loadDataAccount();
                }
            }
        }
    }//GEN-LAST:event_btAddAccActionPerformed
    public boolean CheckEmployee(String MaNguoiDung){
        for(EmployeeDTO employ : listEmployee){
            if(employ.getMaNV().equals(MaNguoiDung)){
                return true;
            }
        }
        return false;
    }
    public boolean CheckAccount(String MaNguoiDung){
        for(AccountDTO acc : listAccount){
            if(acc.getMaNV().endsWith(MaNguoiDung)){
                return true;
            }
        }
        return false;
    }
    private void btUpdateAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateAccActionPerformed
        String NguoiDung = txtNguoiDung.getText();
        String TenDangNhap = txtTenDangNhap.getText();
        String MatKhau = txtMatKhau.getText();
        String Email = txtEmail.getText();    
        String RoleID = txtRoleID.getText();
        AccountDTO account = new AccountDTO(NguoiDung, TenDangNhap, MatKhau, Email, RoleID);
        accBUS.update(account);
        loadDataAccount();
    }//GEN-LAST:event_btUpdateAccActionPerformed

    private void btDeleteAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteAccActionPerformed
        accBUS.delete(txtNguoiDung.getText());
        loadDataAccount();
        JOptionPane.showMessageDialog(this, "Account deleted!");
    }//GEN-LAST:event_btDeleteAccActionPerformed

    private void myButtonIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButtonIcon1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButtonIcon1ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void myButtonIcon2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButtonIcon2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButtonIcon2ActionPerformed

    private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox13ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Design.Attribute attribute1;
    private Design.Attribute attribute2;
    private Design.Attribute attribute20;
    private Design.Attribute attribute21;
    private Design.Attribute attribute22;
    private Design.Attribute attribute23;
    private Design.Attribute attribute24;
    private Design.Attribute attribute25;
    private Design.Attribute attribute26;
    private Design.Attribute attribute28;
    private Design.Attribute attribute29;
    private Design.Attribute attribute3;
    private Design.Attribute attribute30;
    private Design.Attribute attribute4;
    private Design.MyButtonIcon btAdd;
    private Design.MyButtonIcon btAddAcc;
    private Design.MyButtonIcon btDelete1;
    private Design.MyButtonIcon btDeleteAcc;
    private Design.MyButtonIcon btNew;
    private Design.MyButtonIcon btNewAcc;
    private Design.MyButtonIcon btUpdate;
    private Design.MyButtonIcon btUpdateAcc;
    private Design.MyComboBox cbxGioiTinh;
    private Design.MyComboBox cbxMaNV;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private Design.MyLabel_Icon lbIMG;
    private Design.MyButtonIcon myButtonIcon1;
    private Design.MyButtonIcon myButtonIcon2;
    private Design.MyTabBedPane myTabBedPane1;
    private Design.PanelBorder panelBorder10;
    private Design.PanelBorder panelBorder5;
    private Design.PanelBorder panelBorder6;
    private Design.PanelBorder panelBorder7;
    private Design.PanelBorder panelBorder8;
    private Design.PanelBorder panelBorder9;
    private javax.swing.JTable tbTableAccount;
    private javax.swing.JTable tbTableEmployee;
    private Design.Text txtDiaChi;
    private Design.Text txtDienThoai;
    private Design.Text txtEmail;
    private Design.Text txtHoNV;
    private Design.Text txtIMG;
    private Design.Text txtLuong;
    private Design.Text txtMaNV;
    private Design.Text txtMatKhau;
    private Design.Text txtNamSinh;
    private Design.Text txtNguoiDung;
    private Design.Text txtRoleID;
    private Design.Text txtTenDangNhap;
    private Design.Text txtTenNV;
    // End of variables declaration//GEN-END:variables
}
