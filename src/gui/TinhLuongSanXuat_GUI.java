package gui;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class TinhLuongSanXuat_GUI extends javax.swing.JPanel {

    /**
     * Creates new form ChamCongHanhChinh
     */
    public TinhLuongSanXuat_GUI() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton15 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jButton5 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1200, 674));
        setPreferredSize(new java.awt.Dimension(1366, 741));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setBackground(new java.awt.Color(242, 242, 242));
        jDesktopPane1.setOpaque(false);

        jButton15.setBackground(new java.awt.Color(152, 249, 152));
        jButton15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
        jButton15.setText("Làm Mới");
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jDesktopPane1.add(jButton15);
        jButton15.setBounds(1070, 210, 120, 30);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 99, 0));
        jLabel23.setText("Kế toán");
        jLabel23.setToolTipText("");
        jDesktopPane1.add(jLabel23);
        jLabel23.setBounds(340, 130, 170, 20);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Mã Nhân Viên:");
        jLabel17.setToolTipText("");
        jDesktopPane1.add(jLabel17);
        jLabel17.setBounds(220, 130, 120, 20);

        jButton7.setBackground(new java.awt.Color(152, 249, 152));
        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton7.setText("Xuất Excell");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton7);
        jButton7.setBounds(1180, 170, 110, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Bảng Lương Nhân Viên Sản Xuất");
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(4, 0, 1300, 40);

        jButton16.setBackground(new java.awt.Color(152, 249, 152));
        jButton16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete.png"))); // NOI18N
        jButton16.setText("Xóa");
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jDesktopPane1.add(jButton16);
        jButton16.setBounds(1200, 210, 90, 30);

        jButton13.setBackground(new java.awt.Color(152, 249, 152));
        jButton13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton13.setText("Xem Chi Tiết");
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton13);
        jButton13.setBounds(940, 210, 120, 30);

        jButton14.setBackground(new java.awt.Color(152, 249, 152));
        jButton14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/plus.png"))); // NOI18N
        jButton14.setText("Tạo Bảng Lương");
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.setDisabledIcon(null);
        jDesktopPane1.add(jButton14);
        jButton14.setBounds(750, 210, 180, 30);

        jButton6.setBackground(new java.awt.Color(152, 249, 152));
        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton6.setText("Xuất Pdf");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton6);
        jButton6.setBounds(1070, 170, 100, 30);

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
        jTable5.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(jTable5);

        jDesktopPane1.add(jScrollPane5);
        jScrollPane5.setBounds(0, 0, 190, 240);

        jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 96, 59), 2), "Danh Sách Lương", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 99, 0))); // NOI18N

        jTable4.setBackground(new java.awt.Color(184, 206, 224));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable4.setToolTipText("");
        jTable4.setSelectionBackground(new java.awt.Color(144, 237, 144));
        jTable4.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jTable4.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jTable4);

        jDesktopPane1.add(jScrollPane4);
        jScrollPane4.setBounds(0, 240, 1300, 500);

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(0, 99, 0));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kế toán ", "hành chính", " " }));
        jDesktopPane1.add(jComboBox2);
        jComboBox2.setBounds(340, 90, 170, 26);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Phân Xưởng:");
        jLabel18.setToolTipText("");
        jDesktopPane1.add(jLabel18);
        jLabel18.setBounds(220, 90, 100, 20);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Tên Nhân Viên:");
        jLabel19.setToolTipText("");
        jDesktopPane1.add(jLabel19);
        jLabel19.setBounds(220, 170, 120, 20);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 99, 0));
        jLabel24.setText("Kế toán");
        jLabel24.setToolTipText("");
        jDesktopPane1.add(jLabel24);
        jLabel24.setBounds(340, 170, 170, 20);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Tiền Phụ Cấp:");
        jLabel20.setToolTipText("");
        jDesktopPane1.add(jLabel20);
        jLabel20.setBounds(550, 170, 120, 20);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 99, 0));
        jLabel25.setText("Kế toán");
        jLabel25.setToolTipText("");
        jDesktopPane1.add(jLabel25);
        jLabel25.setBounds(680, 170, 170, 20);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Lương Sản Phẩm:");
        jLabel21.setToolTipText("");
        jDesktopPane1.add(jLabel21);
        jLabel21.setBounds(550, 130, 120, 20);

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 99, 0));
        jLabel26.setText("Kế toán");
        jLabel26.setToolTipText("");
        jDesktopPane1.add(jLabel26);
        jLabel26.setBounds(680, 130, 170, 20);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Lương Thực Lãnh:");
        jLabel22.setToolTipText("");
        jDesktopPane1.add(jLabel22);
        jLabel22.setBounds(220, 210, 130, 20);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 99, 0));
        jLabel27.setText("Kế toán");
        jLabel27.setToolTipText("");
        jDesktopPane1.add(jLabel27);
        jLabel27.setBounds(350, 210, 180, 20);

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setText("Tháng:");
        jLabel28.setToolTipText("");
        jDesktopPane1.add(jLabel28);
        jLabel28.setBounds(220, 50, 60, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));
        jDesktopPane1.add(jComboBox1);
        jComboBox1.setBounds(280, 50, 50, 22);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Năm:");
        jLabel14.setToolTipText("");
        jDesktopPane1.add(jLabel14);
        jLabel14.setBounds(340, 50, 60, 20);
        jDesktopPane1.add(jYearChooser1);
        jYearChooser1.setBounds(390, 50, 65, 20);

        jButton5.setBackground(new java.awt.Color(152, 249, 152));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setText("Lọc");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jDesktopPane1.add(jButton5);
        jButton5.setBounds(470, 50, 60, 30);

        add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 741));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        ChiTietLuongCongNhan_GUI chiTietLuongCongNhan_GUI = new ChiTietLuongCongNhan_GUI();
        jDesktopPane1.add(chiTietLuongCongNhan_GUI);
        chiTietLuongCongNhan_GUI.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed
    private void setTable() {
        //setTable ở đây
        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        //set table don vi
        modelDonVi = new DefaultTableModel(
                new Object[][]{
                    {"1", "Kế Toán"},
                    {"2", "Cả công ty"},
                    {"3", "Nhân sự"},
                    {"4", "Bán hàng"},},
                new String[]{
                    "STT", "Phân xưởng"
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
        jTable5.setModel(modelDonVi);
        jTable5.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTable5.getColumnModel().getColumn(1).setPreferredWidth(174);
        jTable5.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));
        //table chấm công
        modelChamCong = new DefaultTableModel(
                new Object[][]{
                    {"1", "123", "Trịnh Minh Kha", "10000",
                        "100",
                        "10000",},},
                new String[]{
                    "STT", "Mã nhân viên", "Họ và tên", "Tổng lương theo sản phẩm",
                    "Phụ cấp",
                    "Lương thực lãnh"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,};
            boolean[] canEdit = new boolean[]{
                false,
                false,
                false,
                false,
                false,
                false,};

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
//        jTable4.getColumnModel().getColumn(0).setPreferredWidth(30);
//        jTable4.getColumnModel().getColumn(1).setPreferredWidth(110);
//        jTable4.getColumnModel().getColumn(2).setPreferredWidth(130);
//        jTable4.getColumnModel().getColumn(3).setPreferredWidth(100);
//        jTable4.getColumnModel().getColumn(4).setPreferredWidth(100);
//        jTable4.getColumnModel().getColumn(5).setPreferredWidth(100);
//        jTable4.getColumnModel().getColumn(6).setPreferredWidth(100);
//        jTable4.getColumnModel().getColumn(7).setPreferredWidth(80);
//        jTable4.getColumnModel().getColumn(8).setPreferredWidth(80);
        jTable4.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));

    }

    private DefaultTableModel modelDonVi;
    private DefaultTableModel modelChamCong;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    // End of variables declaration//GEN-END:variables
}
