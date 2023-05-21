
package Design;

import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

public class MyTabBedPane extends JTabbedPane {
    public MyTabBedPane(){
        setBackground(Color.WHITE);
        setBorder(new EmptyBorder(10, 3,10, 3));
        
    }
}
