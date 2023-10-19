package gui;

import handle.borderselected.Border_Selected;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class TimKiemChamCong_GUI extends javax.swing.JPanel {

    /**
     * Creates new form NhanVienHanhChinh
     */
    public TimKiemChamCong_GUI() {
        initComponents();
        setTable();
        initCommon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnThayDoiTim = new javax.swing.ButtonGroup();
        btnGroupTrangThai = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblPhongBan = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblSoLuong = new javax.swing.JLabel();
        lblTangCa = new javax.swing.JLabel();
        cbPhongBan = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        cbPhanXuong = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jCheckBox2 = new javax.swing.JCheckBox();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        spnTangCa = new javax.swing.JSpinner();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        lblCongDoan = new javax.swing.JLabel();
        cbCongDoan = new javax.swing.JComboBox<>();
        cbSanPham = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 96, 59), 2), "Danh Sách Nhân Viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 99, 0))); // NOI18N

        jTable1.setBackground(new java.awt.Color(184, 206, 224));
        jTable1.setToolTipText("");
        jTable1.setSelectionBackground(new java.awt.Color(144, 237, 144));
        jTable1.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 277, 1300, 465));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton15.setBackground(new java.awt.Color(152, 249, 152));
        jButton15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        jButton15.setText("Tìm Kiếm");
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 190, 130, 30));

        jButton10.setBackground(new java.awt.Color(152, 249, 152));
        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
        jButton10.setText("Làm Mới");
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 190, 120, 30));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 96, 0));
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 190, -1));

        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 190, -1));

        txtSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSoLuong.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(txtSoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 130, 70, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Họ Và Tên:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 120, -1));

        lblPhongBan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPhongBan.setText("Phòng Ban:");
        jPanel1.add(lblPhongBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 120, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Mã Nhân Viên:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 120, -1));

        lblSoLuong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSoLuong.setText("Số Lượng:");
        jPanel1.add(lblSoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, 120, -1));

        lblTangCa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTangCa.setText("Giờ Tăng Ca:");
        jPanel1.add(lblTangCa, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 120, -1));

        cbPhongBan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbPhongBan.setForeground(new java.awt.Color(0, 99, 0));
        cbPhongBan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kế toán ", "nhân sự", "giám đốc", "kĩ thuật", "phát triển", " ", " " }));
        jPanel1.add(cbPhongBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 190, -1));

        btnThayDoiTim.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(0, 96, 0));
        jRadioButton1.setText("Nhân Viên Sản Xuất");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 190, -1));

        btnGroupTrangThai.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(0, 96, 0));
        jRadioButton2.setText("Nghỉ");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 90, 80, -1));

        cbPhanXuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbPhanXuong.setForeground(new java.awt.Color(0, 99, 0));
        cbPhanXuong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chế Tạo", "Gia Công", "Sơn", " " }));
        jPanel1.add(cbPhanXuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 190, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Ngày Chấm Công:");
        jLabel14.setToolTipText("");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 130, -1));

        jDateChooser2.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser2.setForeground(new java.awt.Color(0, 96, 0));
        jDateChooser2.setDateFormatString("dd/mm/yyyy");
        jDateChooser2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 170, -1));

        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(0, 96, 0));
        jCheckBox2.setText("Từ");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 50, 20));

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser1.setForeground(new java.awt.Color(0, 96, 0));
        jDateChooser1.setDateFormatString("dd/mm/yyyy");
        jDateChooser1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 170, -1));
        jPanel1.add(spnTangCa, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 90, -1));

        btnThayDoiTim.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(0, 96, 0));
        jRadioButton3.setSelected(true);
        jRadioButton3.setText("Nhân Viên Hành Chính");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 190, -1));

        btnGroupTrangThai.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(0, 96, 0));
        jRadioButton4.setSelected(true);
        jRadioButton4.setText("Tất Cả");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 80, -1));

        btnGroupTrangThai.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(0, 96, 0));
        jRadioButton5.setText("Đi Làm");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 90, 80, -1));

        lblCongDoan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCongDoan.setText("Công Đoạn:");
        jPanel1.add(lblCongDoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 120, -1));

        cbCongDoan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbCongDoan.setForeground(new java.awt.Color(0, 99, 0));
        cbCongDoan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Kế toán ", "nhân sự", "giám đốc", "kĩ thuật", "phát triển", " ", " " }));
        jPanel1.add(cbCongDoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 90, 190, -1));

        cbSanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbSanPham.setForeground(new java.awt.Color(0, 99, 0));
        cbSanPham.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Kế toán ", "nhân sự", "giám đốc", "kĩ thuật", "phát triển", " ", " " }));
        jPanel1.add(cbSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 190, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1294, 230));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tìm Kiếm Chấm Công");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1294, 50));
    }// </editor-fold>//GEN-END:initComponents
    private void setTable() {
        //setTable ở đây
        modelChamCongHanhChinh = new DefaultTableModel(
                new Object[][]{
                    {"1", "Kế toán", "Trịnh Minh Kha", "123", "12/2/2023", true, "5"},
                    {"2", "Kế toán", "Trịnh Minh Kha", "123", "12/2/2023", false, "0"},
                    {"3", "Kế toán", "Trịnh Minh Kha", "123", "12/2/2023", true, "2"},},
                new String[]{
                    "STT", "Phòng ban", "Họ và tên", "Mã nhân viên", "Ngày chấm", "Trạng thái", "Tăng ca"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        //model san pham
        modelChamCongSanPham = new DefaultTableModel(
                new Object[][]{
                    {"1", "Gia công", "Trịnh Minh Kha", "123", "12/2/2023", "Điện thoại", "Cắt giấy", "1000", "2", "100.000"},
                    {"2", "Gia công", "Trịnh Minh Kha", "123", "12/2/2023", "Điện thoại", "Luộc rau", "1000", "50", "100.000"},
                    {"3", "Điêu khắc", "Trịnh Minh Kha", "123", "12/2/2023", "máy tính", "Cắt giấy", "1000", "21", "100.000"},},
                new String[]{
                    "STT", "Phòng ban", "Họ và tên", "Mã nhân viên", "Ngày làm", "Sản phẩm", "Công đoạn", "Đơn giá", "Số lượng", "Tiền lương"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class

            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false, false, false
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        jTable1.setModel(modelChamCongHanhChinh);

//        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
//        center.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        jTable1.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));

    }
    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        // TODO add your handling code here:
        jTextField2.setBorder(Border_Selected.getFocuBofocusBorder());
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        // TODO add your handling code here:
        jTextField2.setBorder(Border_Selected.getOriginalBorder());
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // System.out.println(jTextField2.getBorder());        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed

    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        cbPhanXuong.setVisible(true);
        cbSanPham.setVisible(true);
        lblCongDoan.setVisible(true);
        cbCongDoan.setVisible(true);
        lblSoLuong.setVisible(true);
        txtSoLuong.setVisible(true);

        lblTangCa.setText("Sản Phẩm:");
        lblPhongBan.setText("Phân Xưởng:");
        cbPhongBan.setVisible(false);
        jRadioButton2.setVisible(false);
        jRadioButton4.setVisible(false);
        jRadioButton5.setVisible(false);
        spnTangCa.setVisible(false);
        jTable1.setModel(modelChamCongSanPham);
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        cbPhanXuong.setVisible(false);
        cbSanPham.setVisible(false);
        lblCongDoan.setVisible(false);
        cbCongDoan.setVisible(false);
        lblSoLuong.setVisible(false);
        txtSoLuong.setVisible(false);

        lblTangCa.setText("Giờ Tăng Ca:");
        lblPhongBan.setText("Phòng Ban:");
        cbPhongBan.setVisible(true);
        jRadioButton2.setVisible(true);
        jRadioButton4.setVisible(true);
        jRadioButton5.setVisible(true);
        spnTangCa.setVisible(true);
        jTable1.setModel(modelChamCongHanhChinh);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed
    private void initCommon() {
        border_Selected = new Border_Selected();
        cbPhanXuong.setVisible(false);
        cbSanPham.setVisible(false);
        lblCongDoan.setVisible(false);
        cbCongDoan.setVisible(false);
        lblSoLuong.setVisible(false);
        txtSoLuong.setVisible(false);
    }

    // private Border_Selected border;
    private DefaultTableModel modelChamCongHanhChinh;
    private DefaultTableModel modelChamCongSanPham;
    private Border_Selected border_Selected;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupTrangThai;
    private javax.swing.ButtonGroup btnThayDoiTim;
    private javax.swing.JComboBox<String> cbCongDoan;
    private javax.swing.JComboBox<String> cbPhanXuong;
    private javax.swing.JComboBox<String> cbPhongBan;
    private javax.swing.JComboBox<String> cbSanPham;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton15;
    private javax.swing.JCheckBox jCheckBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel lblCongDoan;
    private javax.swing.JLabel lblPhongBan;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblTangCa;
    private javax.swing.JSpinner spnTangCa;
    private javax.swing.JTextField txtSoLuong;
    // End of variables declaration//GEN-END:variables
}
