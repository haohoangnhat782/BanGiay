
package Design;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class MyButtonIcon extends JButton {
    private ImageIcon image_Icon = new ImageIcon(getClass().getResource("/Hinh/supply_records.png"));

    public ImageIcon getImage_Icon() {
        return image_Icon;
    }

    public void setImage_Icon(ImageIcon image_Icon) {
        this.image_Icon = image_Icon;
    }
          
    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        setBackground(color);
    }

    public Color getColorOver() {
        return colorOver;
    }

    public void setColorOver(Color colorOver) {
        this.colorOver = colorOver;
    }

    public Color getColorClick() {
        return colorClick;
    }

    public void setColorClick(Color colorClick) {
        this.colorClick = colorClick;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyButtonIcon() {
        //  Init Color
        setForeground(Color.BLACK);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setColor(new Color(255, 255, 255));
        colorOver = new Color(224, 224, 224);
        colorClick = new Color(150, 150, 150);
        borderOver =  new Color(120, 120, 120);
        borderColor = new Color(50, 50, 50);
        setContentAreaFilled(false);
        //  Add event mouse
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                setBackground(colorOver);
          
                over = true;
            }

            @Override
            public void mouseExited(MouseEvent me) {
                setBackground(color);
                over = false;

            }

            @Override
            public void mousePressed(MouseEvent me) {
                setBackground(colorClick);
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                if (over) {
                    setBackground(colorOver);
                } else {
                    setBackground(color);
                }
            }
            
        });
    }
    private Color borderOver;
    private boolean over;
    private Color color;
    private Color colorOver;
    private Color colorClick;
    private Color borderColor;
    private int radius = 0;

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;       
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
         g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        if(!over){
            g2.setColor(borderColor);
        }
        else{
             g2.setColor(borderOver);
        }
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        g2.setColor(getBackground());
        g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, radius, radius);
        
//        JButton button = new JButton(getText(), getImage_Icon());
//        button.setBounds(0, 0, getWidth(), getHeight());
        Font font =  new Font("Dosis ExtraBold", Font.PLAIN,18);  
        g2.setFont(font);
    
        FontMetrics fm = g2.getFontMetrics(font);
        int textWidth = fm.stringWidth(getText());

        // Draw the text
        g2.setColor(getForeground());
        g2.drawString(getText(), (getWidth() - textWidth) / 2, (getHeight() + fm.getAscent() - fm.getDescent()) / 2);

        // Draw the icon
        ImageIcon icon = getImage_Icon();
        int iconWidth = icon.getIconWidth();
        int iconHeight = icon.getIconHeight();
        int Padding = 5;
        int x = getWidth() - iconWidth - Padding; // add some padding between text and icon
        int y = (getHeight() - iconHeight) / 2;
        icon.paintIcon(this, g2, x, y);
    }
}
