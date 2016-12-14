package adminscreen;

import javax.swing.JButton;
import userscreen.UserScreen;


public class ScreenButton extends JButton{
    
    UserScreen attachedScreen;
    int screenIndex;
    
    public ScreenButton(UserScreen attachedScreen, int screenIndex) {
        this.attachedScreen = attachedScreen;
        this.screenIndex = screenIndex;
    }
    
    
    
    
    
    
}
