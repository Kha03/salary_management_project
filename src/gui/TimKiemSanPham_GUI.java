package gui;

import connect.ConnectDB;
import dao.SanPham_Dao;
import java.sql.SQLException;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class TimKiemSanPham_GUI extends javax.swing.JPanel {

    /**
     * Creates new form ChamCongHanhChinh
     * @throws java.sql.SQLException
     */
    public TimKiemSanPham_GUI() throws SQLException{
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblHopDong = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        txtSoLuong = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtDonViTinh = new javax.swing.JTextField();
        txtMa = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cmbHopDong = new javax.swing.JComboBox<>();
        jButton15 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1300, 741));
        setPreferredSize(new java.awt.Dimension(1300, 741));

        jDesktopPane1.setBackground(new java.awt.Color(242, 242, 242));
        jDesktopPane1.setMinimumSize(new java.awt.Dimension(1300, 741));
        jDesktopPane1.setOpaque(false);

        jScrollPane6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 96, 59)));

        tblHopDong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblHopDong.setToolTipText("");
        tblHopDong.setSelectionBackground(new java.awt.Color(144, 237, 144));
        tblHopDong.setSelectionForeground(new java.awt.Color(51, 51, 51));
        tblHopDong.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(tblHopDong);

        jDesktopPane1.add(jScrollPane6);
        jScrollPane6.setBounds(0, 0, 180, 272);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton12.setBackground(new java.awt.Color(152, 249, 152));
        jButton12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton12.setText("Xem Chi Tiết Sản Phẩm");
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 140, 180, 30));

        txtSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSoLuong.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(txtSoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 70, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Hợp Đồng:");
        jLabel14.setToolTipText("");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 120, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Tên Sản Phẩm:");
        jLabel17.setToolTipText("");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 110, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Đơn Giá:");
        jLabel19.setToolTipText("");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 120, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Đơn Vị Tính:");
        jLabel20.setToolTipText("");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 110, -1));

        txtDonViTinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDonViTinh.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(txtDonViTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 160, -1));

        txtMa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMa.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(txtMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 160, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Mã Sản Phẩm:");
        jLabel21.setToolTipText("");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 120, -1));

        txtDonGia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDonGia.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(txtDonGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 160, -1));

        txtTen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTen.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(txtTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 160, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Số Lượng:");
        jLabel16.setToolTipText("");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 120, -1));

        cmbHopDong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbHopDong.setForeground(new java.awt.Color(0, 99, 0));
        cmbHopDong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Kinh Nghiệm" }));
        cmbHopDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHopDongActionPerformed(evt);
            }
        });
        jPanel1.add(cmbHopDong, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 160, 30));

        jButton15.setBackground(new java.awt.Color(152, 249, 152));
        jButton15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        jButton15.setText("Tìm Kiếm");
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 180, 130, 30));

        jButton10.setBackground(new java.awt.Color(152, 249, 152));
        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
        jButton10.setText("Làm Mới");
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 180, 120, 30));

        jDesktopPane1.add(jPanel1);
        jPanel1.setBounds(180, 52, 1114, 220);

        jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 96, 59), 2), "Danh Sách Sản Phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 99, 0))); // NOI18N
        jScrollPane4.setPreferredSize(new java.awt.Dimension(462, 430));

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
        jScrollPane4.setBounds(0, 278, 1300, 463);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tìm Kiếm Sản Phẩm");
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(4, 0, 1290, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbHopDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHopDongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbHopDongActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        ChiTietSanPham_GUI chiTietSanPham_GUI = new ChiTietSanPham_GUI();
        jDesktopPane1.add(chiTietSanPham_GUI);
        chiTietSanPham_GUI.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed
    private void setTable() {
        //khoi tạo phụ cấp compnent

        //setTable ở đây
        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        modelHopDong = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "STT", "Mã", "Hợp đồng"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false
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
        tblHopDong.setModel(modelHopDong);
        tblHopDong.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblHopDong.getColumnModel().getColumn(1).setPreferredWidth(70);
        tblHopDong.getColumnModel().getColumn(2).setPreferredWidth(174);
        tblHopDong.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));
        
        
        
        //table chấm công
        modelChamCong = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "STT", "Tên sản phẩm", "Mã sản phẩm", "Tên hợp đồng", "Số lượng", "Đơn giá", "Đơn vị tính"}
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
        jTable4.setModel(modelChamCong);
        jTable4.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTable4.getColumnModel().getColumn(1).setPreferredWidth(130);
        jTable4.getColumnModel().getColumn(2).setPreferredWidth(150);
        jTable4.getColumnModel().getColumn(3).setPreferredWidth(130);
        jTable4.getColumnModel().getColumn(4).setPreferredWidth(130);
        jTable4.getColumnModel().getColumn(5).setPreferredWidth(60);
        jTable4.getColumnModel().getColumn(6).setPreferredWidth(130);
        jTable4.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));

    }
    private void initCommon() throws SQLException {
        ConnectDB.getInstance();
        ConnectDB.connect();
        doDuLieu();
        
    }
    
    private void doDuLieu() {
        
    }
    
    private DefaultTableModel modelHopDong;
    private DefaultTableModel modelChamCong;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbHopDong;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton15;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable tblHopDong;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtDonViTinh;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables

    
}
