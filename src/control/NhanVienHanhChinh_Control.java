package control;

import java.awt.event.ActionListener;
import gui.NhanVienHanhChinh_GUI;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author ADMIN
 */
public class NhanVienHanhChinh_Control implements ActionListener, ListSelectionListener{
    private NhanVienHanhChinh_GUI nhanVienHanhChinh_GUI;

    public NhanVienHanhChinh_Control(NhanVienHanhChinh_GUI nhanVienHanhChinh_GUI) {
        this.nhanVienHanhChinh_GUI = nhanVienHanhChinh_GUI;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if(src.equals("Thêm")){
            System.out.println(123);
        }
        
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        
    }
    
}
