package adminscreen;

import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JFrame;
import eatsa.*;

public class AdminScreen extends JFrame {

    public static AdminScreen instance;
    public static Rectangle bounds;
    public static ScreenSwitchPage scp;
    
    public static AdminScreen getInstance(){
        if(instance == null)
            instance = new AdminScreen();
        return instance;
    }
    
    
    
    public AdminScreen() {
        
        bounds = Eatsa.GraphicScreens[0].getDefaultConfiguration().getBounds();
        setSize(bounds.getSize());
        setLocation(bounds.getLocation());
        setUndecorated(true);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        scp = new ScreenSwitchPage();
        add(scp);
        
        
        
        
    }
    
}
