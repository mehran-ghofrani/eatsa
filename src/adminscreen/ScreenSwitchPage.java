package adminscreen;

import eatsa.Eatsa;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class ScreenSwitchPage extends JPanel {
    
    ScreenButton[] screensButtons;
    
    public ScreenSwitchPage() {
        
        setLayout(null);
        setSize(AdminScreen.bounds.getSize());
        screensButtons = new ScreenButton[Eatsa.expectedGraphicalScreens];
        Dimension buttonCellSize = new Dimension(getWidth()/Eatsa.columnOfButtons, getHeight()/Eatsa.rowsOfButtons);
        for(int i=1; i<=Eatsa.expectedGraphicalScreens-1 ; i++){
            screensButtons[i] = new ScreenButton(i<Eatsa.numberOfUserScreens?Eatsa.userScreens[i]:null, i);
            screensButtons[i].setLocation(((i-1)%(Eatsa.columnOfButtons-1))*buttonCellSize.width , ((i-1)/(Eatsa.columnOfButtons-1))*buttonCellSize.height);
            screensButtons[i].setSize((int)((buttonCellSize.width*(2/3d))), (int)(buttonCellSize.height*(2/3d)));
            setBackground(Color.red);
            add(screensButtons[i]);
        }
    }
    
    
}
