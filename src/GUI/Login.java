
package GUI;

import Conection.Database;
import DAO.Login_DAO;
import java.awt.Color;
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
        lbAnhNen.setImage_Icon(new ImageIcon(getClass().getResource("/Hinh/nen.jpg")));
        lbThongBao.setImage_Icon(new ImageIcon(getClass().getResource("/Hinh/chamthan.png")));
        lbThongBao.setTextColor(Color.RED);
        btLogin.setForeground(Color.WHITE);
        lbThongBao.setVisible(false);
        btLogin.setColor(Color.BLACK);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbThongBao = new Design.MyLabel_Icon();
        txtUserName = new Design.MyTextField();
        pwPassWord = new Design.MyPassword();
        btLogin = new Design.MyButton();
        jSeparator1 = new javax.swing.JSeparator();
        lbQuenMatKhau = new javax.swing.JLabel();
        lbAnhNen = new Design.MyLabel_Icon();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbThongBao.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(lbThongBao, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 220, 20));

        txtUserName.setLableText("Username");
        getContentPane().add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 210, -1));

        pwPassWord.setLableText("Password");
        getContentPane().add(pwPassWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 210, -1));

        btLogin.setLabel("Login");
        btLogin.setRadius(30);
        btLogin.setRequestFocusEnabled(false);
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 90, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 150, 10));

        lbQuenMatKhau.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lbQuenMatKhau.setForeground(new java.awt.Color(51, 51, 51));
        lbQuenMatKhau.setText("Forgot password?");
        lbQuenMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbQuenMatKhauMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbQuenMatKhauMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbQuenMatKhauMouseExited(evt);
            }
        });
        getContentPane().add(lbQuenMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 130, 20));
        getContentPane().add(lbAnhNen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        Login_DAO ld = new Login_DAO();
        int i = -1;
        if(checkNull()){
           i = ld.login(txtUserName.getText(), pwPassWord.getText());
        }
        if(i == 1){
            openHomePage();
        }
        if(i == 0){
            Error();
        }
    }//GEN-LAST:event_btLoginActionPerformed
    public void openHomePage(){
        Home_Page t = new Home_Page();
        t.setVisible(true);
        t.setLocationRelativeTo(null);
        dispose();
    }
    public void Error(){
        lbThongBao.setLabelText("Wrong login information");
        lbThongBao.setVisible(true);
        txtUserName.setText("");
        pwPassWord.setText("");
        txtUserName.requestFocus();       
    }
    private void lbQuenMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbQuenMatKhauMouseClicked
           Find_AccountGUI fa = new Find_AccountGUI();
           fa.setVisible(true);
           fa.setLocationRelativeTo(null);
    }//GEN-LAST:event_lbQuenMatKhauMouseClicked

    private void lbQuenMatKhauMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbQuenMatKhauMouseEntered
        lbQuenMatKhau.setForeground(new Color(150,150,150));
        lbQuenMatKhau.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lbQuenMatKhauMouseEntered

    private void lbQuenMatKhauMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbQuenMatKhauMouseExited
        lbQuenMatKhau.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_lbQuenMatKhauMouseExited

    /**
     * @param args the command line arguments
     */
    public boolean checkNull(){
        if(txtUserName.getText().equals("")){ // kiểm tra điều kiện nếu text field rỗng
            JOptionPane.showMessageDialog(null, "You have not entered username!", "Hello", JOptionPane.OK_CANCEL_OPTION);
            txtUserName.requestFocus(); // di chuyển con trỏ đến ô textfield
            return false;
        }
        else if(pwPassWord.getText().equals("")){
            JOptionPane.showMessageDialog(null, "You have not entered password!", "Hello", JOptionPane.OK_CANCEL_OPTION);
            pwPassWord.requestFocus();
            return false;
        }
        else{
            return true;
        }
    }   
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login lg = new Login();
                lg.setVisible(true);
                lg.setLocationRelativeTo(null);
              
    
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Design.MyButton btLogin;
    private javax.swing.JSeparator jSeparator1;
    private Design.MyLabel_Icon lbAnhNen;
    private javax.swing.JLabel lbQuenMatKhau;
    private Design.MyLabel_Icon lbThongBao;
    private Design.MyPassword pwPassWord;
    private Design.MyTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
