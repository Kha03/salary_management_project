package gui;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author ADMIN
 */
public class Border_Selected {
    static Border originalBorder;
    static Border focuBofocusBorder;

    public static Border getOriginalBorder() {
        return originalBorder;
    }

    public static Border getFocuBofocusBorder() {
        return focuBofocusBorder;
    }

    public Border_Selected() {
        originalBorder = BorderFactory.createLineBorder(Color.white, 1);
        focuBofocusBorder = BorderFactory.createLineBorder(new Color(144, 237, 144), 2);
    }
    
}
