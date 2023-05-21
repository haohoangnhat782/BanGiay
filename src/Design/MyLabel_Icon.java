
package Design;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MyLabel_Icon extends JLabel{
    private ImageIcon image_Icon = new ImageIcon(getClass().getResource("/Hinh/nen.jpg"));
    private String labelText  = "";
    private Color textColor =  Color.BLACK;
    public MyLabel_Icon() {
         setPreferredSize(new Dimension(image_Icon.getIconWidth(), image_Icon.getIconHeight()));
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
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
//        ImageIcon img = getImage_Icon();
//        int iconWidth = img.getIconWidth();
//        int iconHeight = img.getIconHeight();
//        g2.drawImage(img.getImage(), 0, 0, iconWidth, iconHeight, null); 
//        Tạo label với icon và đoạn text
          JLabel label = new JLabel(getLabelText(), getImage_Icon(), JLabel.LEFT);       
        // Vẽ label
          label.setForeground(getTextColor());
          label.setBounds(0, 0, getWidth(), getHeight());
          label.paint(g2);
        super.paintComponent(g); 
    }  
}
