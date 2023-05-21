
package Design;

import java.awt.*;
import java.awt.Graphics2D;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Rectangle2D;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class MyPassword extends JPasswordField {

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
    private final Animator animator;
    private boolean animateHintText = true;
    private float location;
    private boolean over = false;
    private Color lineColor = new Color(145,242,181);
    
    private final Image eye_show;
    private final Image eye_hide;
    private boolean  hide = true;
    
    public MyPassword() {
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
        addFocusListener(new FocusAdapter(){
            @Override
            public void focusGained(FocusEvent e) {
              showing(false);
            }

            @Override
            public void focusLost(FocusEvent e) {
                showing(true);
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
        TimingTarget target = new TimingTargetAdapter(){
            @Override
            public void begin() {
                animateHintText = getText().equals("");
            }
            @Override
            public void timingEvent(float fraction) {
                location = fraction;
                repaint();
            }            
        };       
        eye_show = new ImageIcon(getClass().getResource("/Hinh/show.png")).getImage();
        eye_hide = new ImageIcon(getClass().getResource("/Hinh/hide.png")).getImage();
        animator = new Animator(300,target); // 300 mili giây9
        animator.setResolution(0); // thiết lập độ phân giải của màn hình động. 0 nghĩa là hoạt ảnh được cập nhật thường xuyên nhất có thể
        animator.setAcceleration(0.5f); // thiết lập gia tốc của ảnh động
        animator.setDeceleration(0.5f); // tốc độ hoạt ảnh nhanh chậm như nào khi gần kết thúc
    }
    private void showing(boolean action){
        if(animator.isRunning()){ // kiểm tra hoạt ảnh có chạy hay không
            animator.stop();
        }
        else{
            location = 1; // hoạt ảnh bắt đầu lại từ đầu
        }
        animator.setStartFraction(1f - location); // đặt điểm bắt đầu của hoạt ảnh
        show = action;
        location = 1f - location;
        animator.start();
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
        createHintText(g2);
        createLineStyle(g2);
        createShowHide(g2);
        g2.dispose();      
    }
    private void createShowHide(Graphics2D g2){
        int x =  getWidth() - 30 + 5;
        int y = (getHeight() - 20) / 2;
        g2.drawImage(hide ? eye_hide : eye_show, x, y, null);
    }
 
    
    
    private void createHintText(Graphics2D g2){
        Insets in = getInsets();
        g2.setColor(new Color(150, 150, 150));
        g2.setFont(new Font("Arial", Font.ITALIC, 13));
        FontMetrics ft = g2.getFontMetrics();
        Rectangle2D r2 = ft.getStringBounds(lableText,g2);
        double height = getHeight() - in.top - in.bottom; 
        double textY = (height - r2.getHeight()) / 2;
        double size;
        if(animateHintText){
            if(show){
                size = 18 *(1 - location);
            }
            else{
                size = 18 * location;
            }
        }
        else{
            size = 18;
        }
        g2.drawString(lableText, in.left, (int) (in.top + textY + ft.getAscent() - size));
    }

    @Override
    public void setText(String t) {
        if(!getText().equals(t)){
            showing(t.equals(""));
        }
        super.setText(t); 
    }

    private void createLineStyle(Graphics2D g2) {
        if (isFocusOwner()) {
            double width = getWidth() - 4;
            int height = getHeight();
            g2.setColor(lineColor);
            double size;
            if (show) {
                size = width * (1 - location);
            } else {
                size = width * location;
            }
            double x = (width - size) / 2;
            g2.fillRect((int) (x + 2), height - 2, (int) size, 2);
         }
    }
   
}



