package gui;

import handle.borderselected.Border_Selected;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class TimKiemNhanVien_GUI extends javax.swing.JPanel {

    /**
     * Creates new form NhanVienHanhChinh
     */
    public TimKiemNhanVien_GUI() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        cbCapBac = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jButton15 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblPhongBan = new javax.swing.JLabel();
        lblNgoaiNgu = new javax.swing.JLabel();
        lblCapBac = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cbPhongBan = new javax.swing.JComboBox<>();
        cbTrinhDo = new javax.swing.JComboBox<>();
        cbPhanXuong = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        lblPhongBan1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1300, 741));
        setPreferredSize(new java.awt.Dimension(1300, 741));
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

        cbCapBac.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbCapBac.setForeground(new java.awt.Color(0, 99, 0));
        cbCapBac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân Viên", "Trưởng Phòng", "Tổ Trưởng", "Quản Lí", " ", " " }));
        jPanel1.add(cbCapBac, new org.netbeans.lib.awtextra.AbsoluteConstraints(835, 50, 190, -1));

        jComboBox6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox6.setForeground(new java.awt.Color(0, 99, 0));
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

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
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 190, -1));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 190, -1));

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 190, -1));

        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 190, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Giới Tính:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 80, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Họ Và Tên:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 120, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Ngày Sinh:");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 120, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Số Điện Thoại:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 120, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Email:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 120, -1));

        lblPhongBan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPhongBan.setText("Phân Xưởng:");
        jPanel1.add(lblPhongBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 120, -1));

        lblNgoaiNgu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNgoaiNgu.setText("Trình Độ:");
        jPanel1.add(lblNgoaiNgu, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 120, -1));

        lblCapBac.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCapBac.setText("Cấp Bậc:");
        jPanel1.add(lblCapBac, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 100, -1));

        jTextField9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 190, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Mã Nhân Viên:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 120, -1));

        cbPhongBan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbPhongBan.setForeground(new java.awt.Color(0, 99, 0));
        cbPhongBan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Kế toán ", "nhân sự", "giám đốc", "kĩ thuật", "phát triển", " ", " " }));
        jPanel1.add(cbPhongBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 190, -1));

        cbTrinhDo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbTrinhDo.setForeground(new java.awt.Color(0, 99, 0));
        cbTrinhDo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trung học cơ sở", "Trung học phổ thông", "Cao Đẳng", "Đại Học" }));
        cbTrinhDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTrinhDoActionPerformed(evt);
            }
        });
        jPanel1.add(cbTrinhDo, new org.netbeans.lib.awtextra.AbsoluteConstraints(835, 10, 190, -1));

        cbPhanXuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbPhanXuong.setForeground(new java.awt.Color(0, 99, 0));
        cbPhanXuong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Kế toán ", "nhân sự", "giám đốc", "kĩ thuật", "phát triển", " ", " " }));
        jPanel1.add(cbPhanXuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 190, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Ngày Vào Làm:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 120, -1));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(835, 90, 190, -1));

        lblPhongBan1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPhongBan1.setText("Phòng Ban:");
        jPanel1.add(lblPhongBan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 120, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1294, 230));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tìm Kiếm Nhân Viên");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1294, 50));
    }// </editor-fold>//GEN-END:initComponents
    private void setTable() {
        //setTable ở đây
        modelHc = new DefaultTableModel(
                new Object[][]{
                    {"123", "Kha", "Nam", "12/20/2003", "123", "Gò vấp", "kha@gmail.com", "Tiếng anh", "kĩ thuật", "Nhân viên kĩ thuật", "Nhân Viên", "1.5", "5.000.000"},
                    {null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null}
                },
                new String[]{
                    "Mã nhân viên", "Họ và tên", "Giới tính", "Ngày sinh", "Số điện thoại", "Địa chỉ", "Mail", "Ngoại ngữ", "Phòng ban", "Cấp bậc", "Chức vụ", "Hệ số lương", "Lương cơ bản"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false, false, false, false, false, false
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
        jTable1.setModel(modelHc);

        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        jTable1.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));
        //model sản xuất
        modelSx = new DefaultTableModel(
                new Object[][]{
                    {"123", "Kha", "Nam", "12/20/2003", "123", "34", "43", "43", null, "43", "43"},
                    {null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null}
                },
                new String[]{
                    "Mã nhân viên", "Họ và tên", "Giới tính", "Ngày sinh", "Số điện thoại", "Địa chỉ", "Mail", "Phân Xưởng", "Chức Vụ", "Trình Độ", "Kinh Nghiệm"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false, false, false, false
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

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void cbTrinhDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTrinhDoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTrinhDoActionPerformed
    private void initCommon() {
        border_Selected = new Border_Selected();
    }

    // private Border_Selected border;
    private DefaultTableModel modelHc;
    private DefaultTableModel modelSx;
    private Border_Selected border_Selected;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbCapBac;
    private javax.swing.JComboBox<String> cbPhanXuong;
    private javax.swing.JComboBox<String> cbPhongBan;
    private javax.swing.JComboBox<String> cbTrinhDo;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton15;
    private javax.swing.JComboBox<String> jComboBox6;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblCapBac;
    private javax.swing.JLabel lblNgoaiNgu;
    private javax.swing.JLabel lblPhongBan;
    private javax.swing.JLabel lblPhongBan1;
    // End of variables declaration//GEN-END:variables
}
