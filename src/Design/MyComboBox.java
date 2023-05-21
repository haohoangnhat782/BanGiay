
package Design;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JComboBox;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicComboBoxUI;

public class MyComboBox<E> extends JComboBox<E>{
    public MyComboBox(){
        setBackground(Color.WHITE);
        setBorder(new EmptyBorder(10, 3,10, 3));
        setFont(new Font("Dosis ExtraBold",Font.PLAIN,14));
    }
   
    

}
 