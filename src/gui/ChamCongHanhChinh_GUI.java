package gui;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class ChamCongHanhChinh_GUI extends javax.swing.JPanel {

    /**
     * Creates new form ChamCongHanhChinh
     */
    public ChamCongHanhChinh_GUI() {
        initComponents();
        setTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jComboBox2 = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jComboBox3 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jCheckBox2 = new javax.swing.JCheckBox();
        jSpinner1 = new javax.swing.JSpinner();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jCheckBox3 = new javax.swing.JCheckBox();
        jButton11 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1200, 674));
        setPreferredSize(new java.awt.Dimension(1200, 674));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 96, 59)));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable3.setToolTipText("");
        jTable3.setSelectionBackground(new java.awt.Color(144, 237, 144));
        jTable3.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane3.setViewportView(jTable3);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 210, 340));

        jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 96, 59), 2), "Danh Sách Chấm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 99, 0))); // NOI18N

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable4.setToolTipText("");
        jTable4.setSelectionBackground(new java.awt.Color(144, 237, 144));
        jTable4.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane4.setViewportView(jTable4);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 1155, 570));

        jScrollPane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 96, 59)));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable5.setToolTipText("");
        jTable5.setSelectionBackground(new java.awt.Color(144, 237, 144));
        jTable5.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane5.setViewportView(jTable5);

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 397));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(0, 99, 0));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Kinh Nghiệm" }));
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 150, -1));

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(0, 96, 0));
        jCheckBox1.setAlignmentX(CENTER_ALIGNMENT);
        jCheckBox1.setText("Làm việc");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 140, 90, 30));

        jComboBox3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(0, 99, 0));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Kinh Nghiệm" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 180, -1));

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser1.setForeground(new java.awt.Color(0, 96, 0));
        jDateChooser1.setDateFormatString("dd/mm/yyyy");
        jDateChooser1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 130, -1));

        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(0, 96, 0));
        jCheckBox2.setText("Từ");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 50, 20));
        add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 140, 60, -1));

        jButton6.setBackground(new java.awt.Color(152, 249, 152));
        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton6.setText("Xuất Bảng Chấm Công");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 60, 180, 30));

        jButton5.setBackground(new java.awt.Color(152, 249, 152));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setText("Lọc");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, 60, -1));

        jDateChooser2.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser2.setForeground(new java.awt.Color(0, 96, 0));
        jDateChooser2.setDateFormatString("dd/mm/yyyy");
        jDateChooser2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 130, -1));

        jCheckBox3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(0, 96, 0));
        jCheckBox3.setText("Toàn bộ nhân viên");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 110, 180, 20));

        jButton11.setBackground(new java.awt.Color(152, 249, 152));
        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 50, 30));

        jButton14.setBackground(new java.awt.Color(152, 249, 152));
        jButton14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/plus.png"))); // NOI18N
        jButton14.setText("Tạo");
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.setDisabledIcon(null);
        add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 100, 120, 30));

        jButton15.setBackground(new java.awt.Color(152, 249, 152));
        jButton15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/update.png"))); // NOI18N
        jButton15.setText("Cập Nhật");
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 100, 130, 30));

        jButton13.setBackground(new java.awt.Color(152, 249, 152));
        jButton13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
        jButton13.setText("Làm Mới");
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 60, 120, 30));

        jButton16.setBackground(new java.awt.Color(152, 249, 152));
        jButton16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete.png"))); // NOI18N
        jButton16.setText("Xóa");
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 100, 90, 30));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 99, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Kinh Nghiệm" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 130, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Ngày Chấm Công:");
        jLabel14.setToolTipText("");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 130, -1));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 96, 0));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 140, 110, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Tìm:");
        jLabel15.setToolTipText("");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 120, -1));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 96, 0));
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 230, -1));

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 96, 0));
        add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 150, -1));

        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(0, 96, 0));
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 150, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Chấm Công Hành Chính");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 1160, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed
     private void setTable() {
        //setTable ở đây
        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        modelNhanVien = new DefaultTableModel(
                new Object[][]{
                    {"1", "Kha"},
                    {"2", "Thành"},
                    {"3", "Vân"},
                    {"4", "Dha"},},
                new String[]{
                    "STT", "Họ và tên"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false
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
        jTable5.setModel(modelNhanVien);
        jTable5.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTable5.getColumnModel().getColumn(1).setPreferredWidth(174);
        jTable5.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));
        //set table don vi
        modelDonVi = new DefaultTableModel(
                new Object[][]{
                    {"1", "Kế Toán"},
                    {"2", "Cả công ty"},
                    {"3", "Nhân sự"},
                    {"4", "Bán hàng"},},
                new String[]{
                    "STT", "Phòng ban"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false
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
        jTable3.setModel(modelDonVi);
        jTable3.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTable3.getColumnModel().getColumn(1).setPreferredWidth(174);
        jTable3.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));
        //table chấm công
        modelChamCong = new DefaultTableModel(
                new Object[][]{
                    {"1", "Kế toán", "Trịnh Minh Kha", "123", "12/2/2023", true, "0.5", "1.5"},
                    {"2", "Kế toán", "Trịnh Minh Kha", "123", "12/2/2023", false, "0", "0"},
                    {"3", "Kế toán", "Trịnh Minh Kha", "123", "12/2/2023", true, "0.2", "1.2"},},
                new String[]{
                    "STT", "Phòng ban", "Họ và tên", "Mã nhân viên", "Ngày chấm", "Trạng thái", "Tăng ca", "Số công"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false
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
        jTable4.setModel(modelChamCong);
        jTable4.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable4.getColumnModel().getColumn(1).setPreferredWidth(110);
        jTable4.getColumnModel().getColumn(2).setPreferredWidth(130);
        jTable4.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTable4.getColumnModel().getColumn(4).setPreferredWidth(100);
        jTable4.getColumnModel().getColumn(5).setPreferredWidth(100);
        jTable4.getColumnModel().getColumn(6).setPreferredWidth(100);
        jTable4.getColumnModel().getColumn(7).setPreferredWidth(80);
        jTable4.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));

    }

    private DefaultTableModel modelDonVi;
    private DefaultTableModel modelNhanVien;
    private DefaultTableModel modelChamCong;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
