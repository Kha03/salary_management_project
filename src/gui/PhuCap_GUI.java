package gui;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class PhuCap_GUI extends javax.swing.JPanel {

    /**
     * Creates new form ChamCongHanhChinh
     */
    public PhuCap_GUI() {
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

        jPanel1 = new javax.swing.JPanel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1366, 741));
        setPreferredSize(new java.awt.Dimension(1366, 741));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(0, 96, 0));
        jCheckBox3.setText("Cố Định");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 170, 20));

        jButton14.setBackground(new java.awt.Color(152, 249, 152));
        jButton14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/plus.png"))); // NOI18N
        jButton14.setText("Thêm");
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.setDisabledIcon(null);
        jPanel1.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 120, 30));

        jButton15.setBackground(new java.awt.Color(152, 249, 152));
        jButton15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/update.png"))); // NOI18N
        jButton15.setText("Cập Nhật");
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 130, 30));

        jButton8.setBackground(new java.awt.Color(152, 249, 152));
        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
        jButton8.setText("Làm Mới");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 190, 120, 30));

        jButton11.setBackground(new java.awt.Color(152, 249, 152));
        jButton11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete.png"))); // NOI18N
        jButton11.setText("Xóa");
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 190, 90, 30));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 150, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Số Tiền:");
        jLabel14.setToolTipText("");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 110, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Tên Phụ Cấp:");
        jLabel17.setToolTipText("");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 110, -1));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 150, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Mã Phụ Cấp:");
        jLabel21.setToolTipText("");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 120, -1));

        jTextField8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 150, -1));

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 150, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Tháng Hưởng:");
        jLabel15.setToolTipText("");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 110, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1360, 230));

        jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 96, 59), 2), "Thông Tin Khoản Lương", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 99, 0))); // NOI18N
        jScrollPane4.setPreferredSize(new java.awt.Dimension(462, 430));

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

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 1365, 460));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Thông Tin Phụ Cấp");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed
    private void setTable() {
        //khoi tạo phụ cấp compnent
        //table chấm công
        modelChamCong = new DefaultTableModel(
                new Object[][]{
                    {"1", "123", "Xăng xe", "", true, " 10000"},
                    {"1", "124", "Tiền điện thoại", "", true, " 10000"},
                    {"1", "125", "Ăn uống", "1/2023", false, " 10000"}},
                new String[]{
                    "STT", "Mã phụ cấp", "Tên phụ cấp", "Tháng hưởng", "Cố định", "Số Tiền"}
        ) {
            Class[] types = new Class[]{
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.Boolean.class,
                java.lang.String.class,};
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false
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
        jTable4.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTable4.getColumnModel().getColumn(1).setPreferredWidth(130);
        jTable4.getColumnModel().getColumn(2).setPreferredWidth(150);
        jTable4.getColumnModel().getColumn(3).setPreferredWidth(130);
        jTable4.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));
    }
    private DefaultTableModel modelChamCong;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
