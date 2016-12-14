package userscreen;

import java.awt.GraphicsDevice;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import javax.swing.JFrame;

public class UserScreen extends JFrame {
    
    Rectangle bounds;

    public UserScreen(GraphicsDevice screen) {
        setUndecorated(true);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        bounds = screen.getDefaultConfiguration().getBounds();
        setSize(bounds.getSize());
        setLocation(bounds.getLocation());
    }
    
    
}
