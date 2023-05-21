
package Design;

import java.awt.*;
import java.awt.Graphics2D;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class Text extends JTextField {  
    private Color lineColor = new Color(145,242,181);
    
    public Text(){
        setBorder(new EmptyBorder(20, 3, 10, 3)); // thiết lập 1 đường viền trống 
        setFont(new Font("Dosis ExtraBold", Font.PLAIN,12));
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
        g2.fillRect(2, getHeight() - 1, getWidth() - 4, 1); // vẽ đường gạch dưới
        g2.dispose();      
    }  
}
