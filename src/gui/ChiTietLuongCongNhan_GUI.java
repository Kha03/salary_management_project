package gui;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class ChiTietLuongCongNhan_GUI extends javax.swing.JInternalFrame {

    /**
     * Creates new form demo
     */
    public ChiTietLuongCongNhan_GUI() {
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

        jButton13 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton14 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Chi Tiết Lương Sản Phẩm");
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setPreferredSize(new java.awt.Dimension(1200, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton13.setBackground(new java.awt.Color(152, 249, 152));
        jButton13.setText("Đóng");
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 40, -1, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 99, 0));
        jLabel23.setText("Phi Anh Đạt");
        jLabel23.setToolTipText("");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 140, 20));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 99, 0));
        jLabel24.setText("123");
        jLabel24.setToolTipText("");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 140, 20));

        jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 96, 59), 2), "Danh Sách Lương", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 99, 0))); // NOI18N
        jScrollPane4.setMinimumSize(new java.awt.Dimension(1200, 600));
        jScrollPane4.setPreferredSize(new java.awt.Dimension(1200, 600));

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

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1190, 490));

        jButton14.setBackground(new java.awt.Color(152, 249, 152));
        jButton14.setText("Xuất Pdf");
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 40, -1, 30));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 99, 0));
        jLabel25.setText("12/2023");
        jLabel25.setToolTipText("");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 70, 20));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Tháng:");
        jLabel16.setToolTipText("");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 60, -1));
        jLabel16.getAccessibleContext().setAccessibleName("Tổng Lương:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Mã Nhân Viên:");
        jLabel17.setToolTipText("");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Tên Nhân Viên:");
        jLabel20.setToolTipText("");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 120, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Tiền Thực Lãnh:");
        jLabel21.setToolTipText("");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 120, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 99, 0));
        jLabel29.setText("123");
        jLabel29.setToolTipText("");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 140, 20));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Tiền Phụ Cấp:");
        jLabel22.setToolTipText("");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 100, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 99, 0));
        jLabel30.setText("123");
        jLabel30.setToolTipText("");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 140, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed
    private void setTable() {
        modelChiTietLuong = new DefaultTableModel(
                new Object[][]{
                    {"1","1/9", "Điện thoại", "Kiểm tra", "100","10","10"},},
                new String[]{
                    "STT", "Ngày", "Sản phẩm", "Công đoạn","Đơn giá","Số lượng","Tiền lương"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class,
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
        jTable4.setModel(modelChiTietLuong);
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
    private DefaultTableModel modelChiTietLuong;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable4;
    // End of variables declaration//GEN-END:variables
}
