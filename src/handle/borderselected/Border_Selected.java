package handle.borderselected;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author ADMIN
 */
public class Border_Selected {
    static Border originalBorder;
    static Border focuBofocusBorder;
    static JTextField mainTextField;

    public static Border getOriginalBorder() {
        return originalBorder;
    }

    public static Border getFocuBofocusBorder() {
        return focuBofocusBorder;
    }

    public Border_Selected() {
        mainTextField = new JTextField();
        originalBorder = mainTextField.getBorder();
        focuBofocusBorder = BorderFactory.createLineBorder(new Color(144, 237, 144), 2);
    }
    
}
