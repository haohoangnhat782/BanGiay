

package Design;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MyLabel_IconRight extends JLabel{
    private ImageIcon image_Icon = new ImageIcon(getClass().getResource("/Hinh/supply_records.png"));
    private String labelText  = "";
    private Color textColor =  Color.BLACK;
    public MyLabel_IconRight() {
        setOpaque(false);
        setPreferredSize(new Dimension(image_Icon.getIconWidth(), image_Icon.getIconHeight()));
        setBackground(Color.WHITE);
        addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(new Cursor(Cursor.HAND_CURSOR));
                setBackground(new Color(224, 224, 224));
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
               setBackground(new Color(255, 255, 255));
               repaint();
            }   
        });
    }

    public String getLabelText() {
        return labelText;
    }

    public void setLabelText(String labelText) {
        this.labelText = labelText;
    }

    public ImageIcon getImage_Icon() {
        return image_Icon;
    }

    public void setImage_Icon(ImageIcon imageIcon) {
        this.image_Icon = imageIcon;
    }

    public Color getTextColor() {
        return textColor;
    }

    public void setTextColor(Color textColor) {
        this.textColor = textColor;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.setColor(getBackground());
        g2.fillRect(0, 0, getWidth(), getHeight());
//        Tạo label với icon và đoạn text
        JLabel label = new JLabel(getLabelText(), getImage_Icon(), JLabel.LEFT); 
        label.setForeground(getTextColor());
        label.setBounds(0, 0, getWidth(), getHeight());
        
        // Vẽ label
        Font font =  new Font("Dosis ExtraBold", Font.PLAIN,18);
        g2.setFont(font);
        String text = getLabelText();
        int textWidth = g2.getFontMetrics().stringWidth(text);
        int iconWidth = getImage_Icon().getIconWidth();
        int gap = 5; // khoảng cách giữa icon và text
        int x = getWidth() - textWidth - gap - iconWidth;
        int y = getHeight() / 2 + font.getSize() / 2 - 1; 
        g2.setColor(getTextColor());
        g2.drawString(text, 0, g2.getFontMetrics().getAscent()) ;
        ImageIcon icon = getImage_Icon();
        int iconX = x + textWidth + gap;
        int iconY = getHeight() / 2 - icon.getIconHeight() / 2;
        icon.paintIcon(this, g2, iconX, iconY);
          
        super.paintComponent(g); 
    } 
}
