/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Rectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class MyPassWord2 extends JPasswordField {

    public String getLableText() {
        return lableText;
    }

    public void setLableText(String lableText) {
        this.lableText = lableText;
    }

    public Color getLineColor() {
        return lineColor;
    }

    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }
       
   
    private boolean show;
    private String lableText ="Label";
    private boolean animateHintText = true;
    private float location;
    private boolean over = false;
    private Color lineColor = new Color(145,242,181);
    
    private final Image eye_show;
    private final Image eye_hide;
    private boolean  hide = true;
    
    public MyPassWord2() {
        setBorder(new EmptyBorder(20, 3, 10, 30)); // thiết lập 1 đường viền trống 
        setSelectionColor(new Color(145,242,181)); // thiết lập màu sắc cho vùng được chọn.Cụ thể bài này là khi chọn nội dung textfield
        addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e) {
                over = true;
                repaint(); // gọi lại phương thức paint()
            }

            @Override
            public void mouseExited(MouseEvent e) {
                over = false;
                repaint();
            }   

            @Override
            public void mousePressed(MouseEvent e) {
                int x = getWidth() - 30;
                if(new Rectangle(x, 0, 30,30).contains(e.getPoint())){
                    hide = ! hide;
                    if(hide){
                        setEchoChar('*');
                    }
                    else{
                        setEchoChar((char)0);
                    }
                    repaint();
                }
               
            }

            
        });
       
        addMouseMotionListener(new MouseMotionAdapter(){
            @Override
            public void mouseMoved(MouseEvent e) {
                int x = getWidth() - 30;
                if(new Rectangle(x, 0, 30,30).contains(e.getPoint())){
                    setCursor(new Cursor(Cursor.HAND_CURSOR));
                }
                else{
                    setCursor(new Cursor(Cursor.HAND_CURSOR));
                }
            }
            
        
        
        
        
        
        });
       
        eye_show = new ImageIcon(getClass().getResource("/Hinh/show.png")).getImage();
        eye_hide = new ImageIcon(getClass().getResource("/Hinh/hide.png")).getImage();
        
    }
   
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
        if(over){
            g2.setColor(lineColor);
        }
        else{
            g2.setColor(new Color(150, 150, 150));
        }
        g2.fillRect(2, getHeight() - 1, getWidth() - 4, 1); // vẽ đường gạch dưới
        createShowHide(g2);
        g2.dispose();      
    }
    private void createShowHide(Graphics2D g2){
        int x =  getWidth() - 30 + 5;
        int y = (getHeight() - 20) / 2;
        g2.drawImage(hide ? eye_hide : eye_show, x, y, null);
    }
}