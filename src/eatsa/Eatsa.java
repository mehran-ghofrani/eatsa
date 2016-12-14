package eatsa;

import adminscreen.AdminScreen;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import static java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment;
import userscreen.UserScreen;


public class Eatsa {
    
    public static GraphicsDevice[] GraphicScreens;
    public static UserScreen[] userScreens;
    public static int numberOfUserScreens;
    public static final int expectedGraphicalScreens = 10;
    public static final int rowsOfButtons = 3;
    public static final int columnOfButtons = 4;
    
    
    public static void main(String[] args) {
        GraphicScreens = getLocalGraphicsEnvironment().getScreenDevices();
        numberOfUserScreens = GraphicScreens.length;
        userScreens = new UserScreen[numberOfUserScreens];
        for(int i=1; i<=numberOfUserScreens-1; i++){
            userScreens[i] = new UserScreen(GraphicScreens[i]);
        }
        new AdminScreen();
        
        
    }
    
}
