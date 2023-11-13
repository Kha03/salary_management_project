package gui;

import connect.ConnectDB;
import dao.CongDoan_Dao;
import entity.PhanCongSanXuat;
import java.sql.SQLException;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import dao.PhanCong_Dao;
import dao.PhanXuong_Dao;
import dao.SanPham_Dao;
import entity.CongDoan;
import entity.PhanXuong;
import entity.SanPham;
import java.text.SimpleDateFormat;


/**
 *
 * @author ADMIN
 */
public class TimKiemPhanCong_GUI extends javax.swing.JPanel {

    

    /**
     * Creates new form ChamCongHanhChinh
     * @throws java.sql.SQLException
     */
    public TimKiemPhanCong_GUI() throws SQLException{
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
        cmbSanPham = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        cmbPhanXuong = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btnLamMoi = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtMaSanPham = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        cmbCongDoan = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        txtSoNhanVien = new javax.swing.JTextField();
        chkTu = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        dchNgayPhanCong = new com.toedter.calendar.JDateChooser();
        dchTu = new com.toedter.calendar.JDateChooser();

        setMinimumSize(new java.awt.Dimension(1200, 674));
        setPreferredSize(new java.awt.Dimension(1366, 741));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setOpaque(false);

        cmbSanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbSanPham.setForeground(new java.awt.Color(0, 99, 0));
        cmbSanPham.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ống nhựa", "Bao bì nhựa", "Gỗ nhựa" }));
        jDesktopPane1.add(cmbSanPham);
        cmbSanPham.setBounds(370, 180, 170, 26);

        jButton7.setBackground(new java.awt.Color(152, 249, 152));
        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton7.setText("Xem Chi Tiết");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton7);
        jButton7.setBounds(1170, 220, 120, 30);

        cmbPhanXuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbPhanXuong.setForeground(new java.awt.Color(0, 99, 0));
        cmbPhanXuong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Xưởng Lắp Ráp", "Xưởng Chế Tác" }));
        cmbPhanXuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPhanXuongActionPerformed(evt);
            }
        });
        jDesktopPane1.add(cmbPhanXuong);
        cmbPhanXuong.setBounds(370, 130, 170, 26);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tìm Kiếm Phân Công Sản Xuất");
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(0, 0, 1304, 50);

        btnLamMoi.setBackground(new java.awt.Color(152, 249, 152));
        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
        btnLamMoi.setText("Làm Mới");
        btnLamMoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnLamMoi);
        btnLamMoi.setBounds(1040, 220, 120, 30);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Mã Sản Phẩm:");
        jLabel18.setToolTipText("");
        jDesktopPane1.add(jLabel18);
        jLabel18.setBounds(560, 130, 120, 20);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Ngày Phân Công:");
        jLabel15.setToolTipText("");
        jDesktopPane1.add(jLabel15);
        jLabel15.setBounds(240, 80, 120, 20);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Số Nhân Viên:");
        jLabel14.setToolTipText("");
        jDesktopPane1.add(jLabel14);
        jLabel14.setBounds(240, 230, 120, 20);

        txtMaSanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaSanPham.setForeground(new java.awt.Color(0, 96, 0));
        txtMaSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaSanPhamActionPerformed(evt);
            }
        });
        jDesktopPane1.add(txtMaSanPham);
        txtMaSanPham.setBounds(670, 130, 170, 26);

        btnTim.setBackground(new java.awt.Color(152, 249, 152));
        btnTim.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        btnTim.setText("Tìm Kiếm");
        btnTim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnTim);
        btnTim.setBounds(900, 220, 130, 31);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Sản Phẩm:");
        jLabel19.setToolTipText("");
        jDesktopPane1.add(jLabel19);
        jLabel19.setBounds(240, 180, 120, 20);

        cmbCongDoan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbCongDoan.setForeground(new java.awt.Color(0, 99, 0));
        cmbCongDoan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trộn Nguyên Liệu", "Tạo Hình", "Lắp Ráp", "Làm Nguội", "Ép đùn" }));
        jDesktopPane1.add(cmbCongDoan);
        cmbCongDoan.setBounds(670, 180, 170, 26);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Phân Xưởng:");
        jLabel16.setToolTipText("");
        jDesktopPane1.add(jLabel16);
        jLabel16.setBounds(240, 130, 120, 20);

        txtSoNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSoNhanVien.setForeground(new java.awt.Color(0, 96, 0));
        jDesktopPane1.add(txtSoNhanVien);
        txtSoNhanVien.setBounds(370, 230, 70, 26);

        chkTu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chkTu.setForeground(new java.awt.Color(0, 96, 0));
        chkTu.setText("Từ");
        chkTu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTuActionPerformed(evt);
            }
        });
        jDesktopPane1.add(chkTu);
        chkTu.setBounds(510, 80, 50, 20);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Công Đoạn:");
        jLabel17.setToolTipText("");
        jDesktopPane1.add(jLabel17);
        jLabel17.setBounds(560, 180, 120, 20);

        jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 96, 59), 2), "Danh Sách Phân Công", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 99, 0))); // NOI18N
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
        jScrollPane4.setBounds(0, 270, 1300, 470);

        jButton9.setBackground(new java.awt.Color(152, 249, 152));
        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton9.setText("Xuất Bảng Phân Công");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton9);
        jButton9.setBounds(1110, 180, 180, 30);

        dchNgayPhanCong.setDateFormatString("dd/MM/yyyy");
        jDesktopPane1.add(dchNgayPhanCong);
        dchNgayPhanCong.setBounds(370, 80, 130, 22);

        dchTu.setDateFormatString("dd/MM/yyyy");
        jDesktopPane1.add(dchTu);
        dchTu.setBounds(560, 80, 120, 22);

        add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 741));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        //ChiTietPhanCong_GUI chiTietPhanCong_GUI = new ChiTietPhanCong_GUI();
       // jDesktopPane1.add(chiTietPhanCong_GUI).setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void cmbPhanXuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPhanXuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPhanXuongActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
        timkiem();
    }//GEN-LAST:event_btnTimActionPerformed

    private void chkTuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTuActionPerformed
        // TODO add your handling code here:
        if (chkTu.isSelected()) {
            dchTu.setVisible(true);
        }
        else{
            dchTu.setVisible(false);
        }
    }//GEN-LAST:event_chkTuActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void txtMaSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaSanPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaSanPhamActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
        lamMoiDong();
        lamMoiBang();
        doDuLieu();
    }//GEN-LAST:event_btnLamMoiActionPerformed
    private void setTable() {
        //setTable ở đây
        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        //table chấm công
        modelChamCong = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "STT", "Phân xưởng", "Sản phẩm", "Mã sản phẩm", "Công đoạn", "Ngày phân công", "Số nhân viên"}
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jTable4.setModel(modelChamCong);
        jTable4.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTable4.getColumnModel().getColumn(1).setPreferredWidth(130);
        jTable4.getColumnModel().getColumn(2).setPreferredWidth(150);
        jTable4.getColumnModel().getColumn(3).setPreferredWidth(130);
        jTable4.getColumnModel().getColumn(4).setPreferredWidth(130);
        jTable4.getColumnModel().getColumn(5).setPreferredWidth(130);
        jTable4.getColumnModel().getColumn(6).setPreferredWidth(60);
        jTable4.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));
        
        
        dchTu.setVisible(false);
    }

    private void initCommon()throws SQLException {
        ConnectDB.getInstance();
        ConnectDB.connect();
        phanXuong_Dao = new PhanXuong_Dao();
        congDoan_Dao = new CongDoan_Dao();
        sanPham_Dao = new SanPham_Dao();
        
        dinhDangNgay = new SimpleDateFormat("dd/MM/yyyy");
        phanCong_Dao = new PhanCong_Dao();
        doDuLieu();
        doDulieucmb();
        cmbCongDoan.setSelectedIndex(-1);
        cmbPhanXuong.setSelectedIndex(-1);
        cmbSanPham.setSelectedIndex(-1);
    } 
    
    
    private void doDulieucmb(){
        for (PhanXuong px : phanXuong_Dao.getDanhSachPhanXuong()) {
            cmbPhanXuong.addItem(px.getTenPhanXuong());
        }
        for (CongDoan cd : congDoan_Dao.getDanhSachCongDoan()) {
            cmbPhanXuong.addItem(cd.getTenCongDoan());
        }
        for (SanPham sp : sanPham_Dao.getDanhSachSanPham()) {
            cmbPhanXuong.addItem(sp.getTenSanPham());
        }
    }
    private void timkiem() {
        modelChamCong.setRowCount(0); // Xóa dữ liệu hiện tại trong bảng để hiển thị kết quả tìm kiếm mới
        
        int i=1;
        for(PhanCongSanXuat pcsx :phanCong_Dao.getDanhSachPhanCong()){
            boolean thoaMan = false; 
            if (chkTu.isSelected()) {
                System.out.println(dinhDangNgay.format(dchNgayPhanCong.getDate()));
                 System.out.println(dinhDangNgay.format(dchTu.getDate()));
                System.out.println(dinhDangNgay.format(pcsx.getNgayPhanCong()));
                if (dchTu.getDate() != null && dchNgayPhanCong.getDate() != null) {
                    if (!pcsx.getNgayPhanCong().before(dchTu.getDate()) &&
                        pcsx.getNgayPhanCong().before(dchNgayPhanCong.getDate())) {
                        thoaMan = true;
                    }
                }
            }   else{
                if (dchNgayPhanCong.getDate() != null) {
                    if(dinhDangNgay.format(pcsx.getNgayPhanCong()).equalsIgnoreCase(dinhDangNgay.format(dchNgayPhanCong.getDate()))) {
                        thoaMan = true;
                    }
                }
            }
            if (!txtMaSanPham.getText().isEmpty()) {
                if (pcsx.getSanPham().getMaSanPham().equalsIgnoreCase(txtMaSanPham.getText())) {
                    thoaMan = true;
                }
            }
            if (cmbCongDoan.getSelectedIndex() != -1) {
                if(pcsx.getCongDoan().getTenCongDoan().toLowerCase().equalsIgnoreCase(cmbCongDoan.getSelectedItem().toString())) {
                    thoaMan = true;
                }
            }
            if (cmbPhanXuong.getSelectedIndex() != -1) {
                if(pcsx.getPhanXuong().getTenPhanXuong().toLowerCase().equalsIgnoreCase(cmbPhanXuong.getSelectedItem().toString())) {
                    thoaMan = true;
                }
            }
            if (cmbSanPham.getSelectedIndex() != -1) {
                if(pcsx.getSanPham().getTenSanPham().toLowerCase().equalsIgnoreCase(cmbSanPham.getSelectedItem().toString())) {
                    thoaMan = true;
                }
            }
            if (!txtSoNhanVien.getText().isEmpty()) {
                if (String.valueOf(pcsx.getNhanVienSanXuat().size()).equalsIgnoreCase(txtSoNhanVien.getText())) {
                    thoaMan = true;
                }
            }
            if (thoaMan) {
                Object[] rowData = {
                    i++,
                    pcsx.getPhanXuong().getTenPhanXuong(),
                    pcsx.getSanPham().getTenSanPham(),
                    pcsx.getSanPham().getMaSanPham(),
                    pcsx.getCongDoan().getTenCongDoan(),
                    dinhDangNgay.format(pcsx.getNgayPhanCong()),
                    pcsx.getNhanVienSanXuat().size()
                };
                modelChamCong.addRow(rowData);
            }
        }
    }
    public void lamMoiBang() {
        modelChamCong.setRowCount(0);
    }
    public void lamMoiDong() {
        txtMaSanPham.setText("");
        txtSoNhanVien.setText("");
        dchNgayPhanCong.setDate(null);
        dchTu.setDate(null);
        chkTu.setSelected(false);
        cmbCongDoan.setSelectedIndex(-1);
        cmbPhanXuong.setSelectedIndex(-1);
        cmbSanPham.setSelectedIndex(-1);
        dchTu.setVisible(false);
    }
    
    private void doDuLieu() {
        doDuLieuPhanCongSanXuat();
    }
    
    private void doDuLieuPhanCongSanXuat() {
        int i=1;
        for(PhanCongSanXuat pcsx :phanCong_Dao.getDanhSachPhanCong()){
            Object[] objects = {
                i++,
                pcsx.getPhanXuong().getTenPhanXuong(),
                pcsx.getSanPham().getTenSanPham(),
                pcsx.getSanPham().getMaSanPham(),
                pcsx.getCongDoan().getTenCongDoan(),
                dinhDangNgay.format(pcsx.getNgayPhanCong()),
                pcsx.getNhanVienSanXuat().size()
            };
            modelChamCong.addRow(objects);
        }
    }
    
    
    
    
    
    private SanPham_Dao sanPham_Dao;
    private CongDoan_Dao congDoan_Dao;
    private PhanXuong_Dao phanXuong_Dao;
    private SimpleDateFormat dinhDangNgay;
    private PhanCong_Dao phanCong_Dao;
    private DefaultTableModel modelChamCong;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnTim;
    private javax.swing.JCheckBox chkTu;
    private javax.swing.JComboBox<String> cmbCongDoan;
    private javax.swing.JComboBox<String> cmbPhanXuong;
    private javax.swing.JComboBox<String> cmbSanPham;
    private com.toedter.calendar.JDateChooser dchNgayPhanCong;
    private com.toedter.calendar.JDateChooser dchTu;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField txtMaSanPham;
    private javax.swing.JTextField txtSoNhanVien;
    // End of variables declaration//GEN-END:variables

    
}
