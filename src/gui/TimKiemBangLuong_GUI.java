package gui;

import handle.borderselected.Border_Selected;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import entity.LuongHanhChanh;
import dao.TinhLuongHanhChanh_Dao;
import entity.LuongCongNhan;
import java.sql.SQLException;
import connect.ConnectDB;
import dao.BacLuong_Dao;
import dao.CapBac_Dao;
import dao.NhanVienHanhChanh_Dao;
import dao.NhanVienSanXuat_Dao;
import dao.PhanXuong_Dao;
import dao.PhongBan_Dao;
import dao.TinhLuongCongNhan_Dao;
import entity.BacLuong;
import entity.CapBac;
import entity.NhanVienHanhChanh;
import entity.NhanVienSanXuat;
import entity.PhanXuong;
import entity.PhongBan;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class TimKiemBangLuong_GUI extends javax.swing.JPanel {

    

    /**
     * Creates new form NhanVienHanhChinh
     * @throws java.sql.SQLException
     */
    public TimKiemBangLuong_GUI() throws SQLException {
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
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        txtMa = new javax.swing.JTextField();
        txtChucVu = new javax.swing.JTextField();
        lblChucVu = new javax.swing.JLabel();
        lblPhongBan = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmbPhongBan = new javax.swing.JComboBox<>();
        radNVSX = new javax.swing.JRadioButton();
        cmbPhanXuong = new javax.swing.JComboBox<>();
        radNVHC = new javax.swing.JRadioButton();
        cmbThang = new javax.swing.JComboBox<>();
        ychNam = new com.toedter.calendar.JYearChooser();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        lblHeSoLuong = new javax.swing.JLabel();
        cmbHeSoLuong = new javax.swing.JComboBox<>();
        txtNgayCongThucTe = new javax.swing.JTextField();
        lblNgayCongThucTe = new javax.swing.JLabel();
        txtLuongCoBan = new javax.swing.JTextField();
        lblLuongCoBan = new javax.swing.JLabel();
        lblNgayCongChuan = new javax.swing.JLabel();
        txtNgayCongChuan = new javax.swing.JTextField();
        lblTienPhuCap = new javax.swing.JLabel();
        txtLuongSanPham = new javax.swing.JTextField();
        txtTienTangCa = new javax.swing.JTextField();
        lblTienTangCa = new javax.swing.JLabel();
        btnTim = new javax.swing.JButton();
        txtTienPhuCapSx = new javax.swing.JTextField();
        txtTienPhuCapHc = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(1300, 741));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tìm Kiếm Bảng Lương");
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(0, 0, 1304, 50);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 96, 59), 2), "Danh Sách Lương", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 99, 0))); // NOI18N

        jTable1.setBackground(new java.awt.Color(184, 206, 224));
        jTable1.setToolTipText("");
        jTable1.setSelectionBackground(new java.awt.Color(144, 237, 144));
        jTable1.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);

        jDesktopPane1.add(jScrollPane2);
        jScrollPane2.setBounds(0, 280, 1300, 460);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton15.setBackground(new java.awt.Color(152, 249, 152));
        jButton15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton15.setText("Xem Chi Tiết");
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 190, 130, 30));

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
        jPanel1.add(btnLamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 190, 120, 30));

        txtMa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMa.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(txtMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 190, -1));

        txtChucVu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtChucVu.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(txtChucVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 190, -1));

        lblChucVu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblChucVu.setText("Chức Vụ:");
        jPanel1.add(lblChucVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 120, -1));

        lblPhongBan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPhongBan.setText("Phòng Ban:");
        jPanel1.add(lblPhongBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 120, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Mã Nhân Viên:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, -1));

        cmbPhongBan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbPhongBan.setForeground(new java.awt.Color(0, 99, 0));
        cmbPhongBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPhongBanActionPerformed(evt);
            }
        });
        jPanel1.add(cmbPhongBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 190, -1));

        btnThayDoiTim.add(radNVSX);
        radNVSX.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radNVSX.setForeground(new java.awt.Color(0, 96, 0));
        radNVSX.setText("Nhân Viên Sản Xuất");
        radNVSX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radNVSXActionPerformed(evt);
            }
        });
        jPanel1.add(radNVSX, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 190, -1));

        cmbPhanXuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbPhanXuong.setForeground(new java.awt.Color(0, 99, 0));
        jPanel1.add(cmbPhanXuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 60, 190, -1));

        btnThayDoiTim.add(radNVHC);
        radNVHC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radNVHC.setForeground(new java.awt.Color(0, 96, 0));
        radNVHC.setSelected(true);
        radNVHC.setText("Nhân Viên Hành Chính");
        radNVHC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radNVHCActionPerformed(evt);
            }
        });
        jPanel1.add(radNVHC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 190, -1));

        cmbThang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jPanel1.add(cmbThang, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 50, -1));

        ychNam.setDayChooser(null);
        jPanel1.add(ychNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 65, 20));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Năm:");
        jLabel15.setToolTipText("");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 60, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Tháng:");
        jLabel17.setToolTipText("");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 60, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Họ Và Tên:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 120, -1));

        txtTen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTen.setForeground(new java.awt.Color(0, 96, 0));
        txtTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenActionPerformed(evt);
            }
        });
        jPanel1.add(txtTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 190, -1));

        lblHeSoLuong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHeSoLuong.setText("Hệ Số Lương:");
        jPanel1.add(lblHeSoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 120, -1));

        cmbHeSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbHeSoLuong.setForeground(new java.awt.Color(0, 99, 0));
        jPanel1.add(cmbHeSoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 80, -1));

        txtNgayCongThucTe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNgayCongThucTe.setForeground(new java.awt.Color(0, 96, 0));
        txtNgayCongThucTe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayCongThucTeActionPerformed(evt);
            }
        });
        jPanel1.add(txtNgayCongThucTe, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 100, 50, -1));

        lblNgayCongThucTe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNgayCongThucTe.setText("Ngày Công Thực Tế:");
        jPanel1.add(lblNgayCongThucTe, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 150, -1));

        txtLuongCoBan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtLuongCoBan.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(txtLuongCoBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(815, 20, 190, -1));

        lblLuongCoBan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblLuongCoBan.setText("Lương Cơ Bản:");
        jPanel1.add(lblLuongCoBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 20, 120, -1));

        lblNgayCongChuan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNgayCongChuan.setText("Ngày Công Chuẩn:");
        jPanel1.add(lblNgayCongChuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 150, -1));

        txtNgayCongChuan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNgayCongChuan.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(txtNgayCongChuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(855, 60, 50, -1));

        lblTienPhuCap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTienPhuCap.setText("Tiền Phụ Cấp:");
        jPanel1.add(lblTienPhuCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 60, 120, -1));

        txtLuongSanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtLuongSanPham.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(txtLuongSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 190, -1));

        txtTienTangCa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTienTangCa.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(txtTienTangCa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 100, 190, -1));

        lblTienTangCa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTienTangCa.setText("Tiền Tăng Ca:");
        jPanel1.add(lblTienTangCa, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 100, 120, -1));

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
        jPanel1.add(btnTim, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 190, 130, 30));

        txtTienPhuCapSx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTienPhuCapSx.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(txtTienPhuCapSx, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 60, 190, -1));

        txtTienPhuCapHc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTienPhuCapHc.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(txtTienPhuCapHc, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 60, 190, -1));

        jDesktopPane1.add(jPanel1);
        jPanel1.setBounds(0, 60, 1304, 230);

        add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 741));
    }// </editor-fold>//GEN-END:initComponents

    private void radNVSXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radNVSXActionPerformed
        cmbPhanXuong.setVisible(true);
        txtLuongSanPham.setVisible(true);
//        LblLuongThucLanhSxV.setVisible(true);
        txtTienPhuCapSx.setVisible(true);
        
        lblChucVu.setVisible(false);
        txtChucVu.setVisible(false);
        lblHeSoLuong.setText("Lương Sản Phẩm:");
        lblPhongBan.setText("Phân Xưởng:");
        cmbPhongBan.setVisible(false);
        cmbHeSoLuong.setVisible(false);
        lblLuongCoBan.setVisible(false);
        txtLuongCoBan.setVisible(false);
        lblNgayCongChuan.setText("Tiền Phụ Cấp:");
        txtNgayCongChuan.setVisible(false);
        lblNgayCongThucTe.setText("Lương Thực Lãnh:");
        txtNgayCongThucTe.setVisible(false);
        lblTienPhuCap.setVisible(false);
        txtTienPhuCapHc.setVisible(false);
        lblTienTangCa.setVisible(false);
        txtTienTangCa.setVisible(false);
//        lblLuongThucLanhHc.setVisible(false);
//        lblLuongThucLanhHcV.setVisible(false);
        jTable1.setModel(modelLuongSx);
        // TODO add your handling code here:
    }//GEN-LAST:event_radNVSXActionPerformed

    private void radNVHCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radNVHCActionPerformed
        // TODO add your handling code here:
        cmbPhanXuong.setVisible(false);
        txtLuongSanPham.setVisible(false);
//        LblLuongThucLanhSxV.setVisible(false);
        txtTienPhuCapSx.setVisible(false);

        lblHeSoLuong.setText("Hệ Số Lương:");
        lblPhongBan.setText("Phòng Ban:");
        cmbPhongBan.setVisible(true);
        cmbHeSoLuong.setVisible(true);
        lblLuongCoBan.setVisible(true);
        txtLuongCoBan.setVisible(true);
        lblNgayCongChuan.setText("Ngày Công Chuẩn:");
        txtNgayCongChuan.setVisible(true);
        lblNgayCongThucTe.setText("Ngày Công Thực Tế:");
        txtNgayCongThucTe.setVisible(true);
        lblTienPhuCap.setVisible(true);
        txtTienPhuCapHc.setVisible(true);
        lblTienTangCa.setVisible(true);
        txtTienTangCa.setVisible(true);
//        lblLuongThucLanhHc.setVisible(true);
//        lblLuongThucLanhHcV.setVisible(true);
        jTable1.setModel(modelLuongHc);
    }//GEN-LAST:event_radNVHCActionPerformed

    private void txtNgayCongThucTeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayCongThucTeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayCongThucTeActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
     //   ChiTietLuongCongNhan_GUI chiTietLuongCongNhan_GUI = new ChiTietLuongCongNhan_GUI();
//        jDesktopPane1.add(chiTietLuongCongNhan_GUI);
//        chiTietLuongCongNhan_GUI.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void txtTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenActionPerformed

    private void cmbPhongBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPhongBanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPhongBanActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
        
        if(radNVHC.isSelected()){
            timKiemHC();
        }
        else{
            timKiemSX();
        }
        
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
        lamMoiDong();
        lamMoiBang();
        doDuLieu();
    }//GEN-LAST:event_btnLamMoiActionPerformed
    private void setTable() {
        //setTable ở đây
        //table chấm công
        modelLuongHc = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "STT", "Mã nhân viên", "Họ và tên", "Chức vụ", "Hệ số lương", "Lương cơ bản", "Số ngày công chuẩn", "Phụ cấp", "Ngày công thực tế", "Tiền tăng ca", "Lương thực lãnh"
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
        //model san pham
       modelLuongSx = new DefaultTableModel(
                new Object[][]{},
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
        jTable1.setModel(modelLuongHc);

        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        jTable1.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));
        jTable1.getColumnModel().getColumn(0).setCellRenderer(center);
        jTable1.getColumnModel().getColumn(1).setCellRenderer(center);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(center);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(center);
        jTable1.getColumnModel().getColumn(4).setCellRenderer(center);
        jTable1.getColumnModel().getColumn(5).setCellRenderer(center);
        jTable1.getColumnModel().getColumn(6).setCellRenderer(center);
        jTable1.getColumnModel().getColumn(7).setCellRenderer(center);
        jTable1.getColumnModel().getColumn(8).setCellRenderer(center);
        jTable1.getColumnModel().getColumn(9).setCellRenderer(center);
        jTable1.getColumnModel().getColumn(10).setCellRenderer(center);
        
        
        
        jTable1.setModel(modelLuongSx);

        
        center.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        jTable1.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));
        jTable1.getColumnModel().getColumn(0).setCellRenderer(center);
        jTable1.getColumnModel().getColumn(1).setCellRenderer(center);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(center);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(center);
        jTable1.getColumnModel().getColumn(4).setCellRenderer(center);
        jTable1.getColumnModel().getColumn(5).setCellRenderer(center);
    }

    private void initCommon() throws SQLException {
        ConnectDB.getInstance();
        ConnectDB.connect();
        df = new DecimalFormat("#,##0"); // Số lẻ số # để hiển thị đủ chữ số thập phân
        tinhLuongHanhChanh_Dao = new TinhLuongHanhChanh_Dao();
        tinhLuongCongNhan_Dao  = new TinhLuongCongNhan_Dao();
        phongBan_Dao = new PhongBan_Dao();
        border_Selected = new Border_Selected();
        cmbPhanXuong.setVisible(false);
        txtLuongSanPham.setVisible(false);
//        LblLuongThucLanhSxV.setVisible(false);
        txtTienPhuCapSx.setVisible(false);
        phongBan_Dao = new PhongBan_Dao();
        phanXuong_Dao = new PhanXuong_Dao();
        nhanVienHanhChanh_Dao = new NhanVienHanhChanh_Dao();
        nhanVienSanXuat_Dao = new NhanVienSanXuat_Dao();
        List<String> heSoLuongList = new ArrayList<>();
        doDuLieu();
        doDulieucmb();
        cmbPhongBan.setSelectedIndex(-1);
        cmbHeSoLuong.setSelectedIndex(-1);
        cmbThang.setSelectedIndex(-1);
        cmbPhanXuong.setSelectedIndex(-1);
    }
    
    private void doDulieucmb(){
        for (PhanXuong px : phanXuong_Dao.getDanhSachPhanXuong()) {
            cmbPhanXuong.addItem(px.getTenPhanXuong());
        }
        for (PhongBan pb : phongBan_Dao.getDanhSachPhongBan()) {
            cmbPhongBan.addItem(pb.getTenPhongBan());
        }
        for(LuongHanhChanh lg : tinhLuongHanhChanh_Dao.getDanhSachLuong()) {
            String heSoLuongString = String.valueOf(lg.getHeSoLuong());
            // Kiểm tra xem giá trị đã tồn tại trong combobox chưa
            boolean t = false;
            for (int i = 0; i < cmbHeSoLuong.getItemCount(); i++) {
                if (heSoLuongString.equals( cmbHeSoLuong.getItemAt(i))) {
                    t = true;
                    break;
                }
            }
            // Nếu giá trị không tồn tại, thêm vào combobox
            if (!t) {
                cmbHeSoLuong.addItem(heSoLuongString);
            }
        }
    }
    
    private void timKiemHC(){
        modelLuongHc.setRowCount(0); // Xóa dữ liệu hiện tại trong bảng để hiển thị kết quả tìm kiếm mới
        int t=0;
        int i=1;
        
        for(LuongHanhChanh lg : tinhLuongHanhChanh_Dao.getDanhSachLuong()) {
            t++;
            int l=0;
            boolean thoaMan = false; 
            if (!txtMa.getText().isEmpty()) {
                if (lg.getNhanVienHanhChanh().getMaNhanVienHanhChanh().equalsIgnoreCase(txtMa.getText())) {
                    thoaMan = true;
                }
            }
            if (!txtTen.getText().isEmpty()) {
                if (lg.getNhanVienHanhChanh().getHoVaTen().toLowerCase().contains(txtTen.getText().toLowerCase())) {
                    thoaMan = true;
                }
            }
            if (cmbThang.getSelectedIndex() != -1 && ychNam != null) {
                String formattedDate = String.format("%02d-%s", cmbThang.getSelectedIndex() + 1, ychNam.getYear());
                System.out.println("thang:" +formattedDate);
                if (lg.getThangLap().toLowerCase().equalsIgnoreCase(formattedDate.toLowerCase())) {
                    thoaMan = true;
                }
            }

            if (!txtChucVu.getText().isEmpty()) {
                if (lg.getChucVu().toLowerCase().contains(txtChucVu.getText().toLowerCase())) {
                    thoaMan = true;
                }
            }
//            fix
            if (cmbPhongBan.getSelectedIndex() != -1) {
                for (NhanVienHanhChanh nVien : nhanVienHanhChanh_Dao.getDanhSachNhanVienHanhChanh()) {
                    l++;
                    if (nVien.getPhongBan().getTenPhongBan().toLowerCase().equalsIgnoreCase(cmbPhongBan.getSelectedItem().toString().toLowerCase())) {
                        if(t == l){
                            thoaMan = true;
                        }       
                    }
                }  
            }
            if (cmbHeSoLuong.getSelectedIndex() != -1) {
                if(String.valueOf(lg.getHeSoLuong()).toLowerCase().equalsIgnoreCase(cmbHeSoLuong.getSelectedItem().toString())) {
                    thoaMan = true;
                }
            }
            
            if (!txtLuongCoBan.getText().isEmpty()) {
                if (String.valueOf(lg.getLuongCoBan()).toLowerCase().equalsIgnoreCase(txtLuongCoBan.getText().toLowerCase())) {
                    thoaMan = true;
                }
            }
            if (!txtNgayCongChuan.getText().isEmpty()) {
                if (String.valueOf(lg.getSoNgayCongChuan()).toLowerCase().equalsIgnoreCase(txtNgayCongChuan.getText().toLowerCase())) {
                    thoaMan = true;
                }
            }
            if (!txtTienPhuCapHc.getText().isEmpty()) {
                if (String.valueOf(lg.getTienPhuCap()).toLowerCase().equalsIgnoreCase(txtTienPhuCapHc.getText().toLowerCase())) {
                    thoaMan = true;
                }
            }
            if (!txtNgayCongThucTe.getText().isEmpty()) {
                if (String.valueOf(lg.getNgayCongThucTe()).toLowerCase().equalsIgnoreCase(txtNgayCongThucTe.getText().toLowerCase())) {
                    thoaMan = true;
                }
            }
            if (!txtTienTangCa.getText().isEmpty()) {
                if (String.valueOf(lg.getTienTangCa()).toLowerCase().equalsIgnoreCase(txtTienTangCa.getText().toLowerCase())) {
                    thoaMan = true;
                }
            }
            if (thoaMan) {
                Object[] rowData = {
                    i++,
                    lg.getNhanVienHanhChanh().getMaNhanVienHanhChanh(),
                    lg.getNhanVienHanhChanh().getHoVaTen(),
                    lg.getChucVu(),
                    lg.getHeSoLuong(),
                    lg.getLuongCoBan(),
                    lg.getSoNgayCongChuan(),
                    df.format(lg.getTienPhuCap())+"VND",
                    lg.getNgayCongThucTe(),
                    df.format(lg.getTienTangCa())+"VND",
                    df.format(lg.getTongLuong())+"VND"
                };
                modelLuongHc.addRow(rowData);
            }
        }
    }
    private void timKiemSX(){
        modelLuongSx.setRowCount(0); // Xóa dữ liệu hiện tại trong bảng để hiển thị kết quả tìm kiếm mới
        int t=0;
        int i=1;
        
        for(LuongCongNhan lg : tinhLuongCongNhan_Dao.getDanhSachLuong()) {
            t++;
            int l=0;
            boolean thoaMan = false; 
            if (!txtMa.getText().isEmpty()) {
                if (lg.getNhanVienSanXuat().getMaNhanVienSanXuat().equalsIgnoreCase(txtMa.getText())) {
                    thoaMan = true;
                }
            }
            if (!txtTen.getText().isEmpty()) {
                if (lg.getNhanVienSanXuat().getHoVaTen().toLowerCase().contains(txtTen.getText().toLowerCase())) {
                    thoaMan = true;
                }
            }
            if (cmbThang.getSelectedIndex() != -1 && ychNam != null) {
                String formattedDate = String.format("%02d-%s", cmbThang.getSelectedIndex() + 1, ychNam.getYear());
                System.out.println("thang:" +formattedDate);
                if (lg.getThangLap().toLowerCase().equalsIgnoreCase(formattedDate.toLowerCase())) {
                    thoaMan = true;
                }
            }
            if (cmbPhanXuong.getSelectedIndex() != -1) {
                for (NhanVienSanXuat nVien : nhanVienSanXuat_Dao.getDanhSachNhanVienSanXuat()) {
                    l++;
                    System.out.println(nVien.getPhanXuong().getTenPhanXuong()+  "  l "+l);
                    System.out.println(cmbPhanXuong.getSelectedItem().toString()+"  t "+ t);
                    if (nVien.getPhanXuong().getTenPhanXuong().toLowerCase().equalsIgnoreCase(cmbPhanXuong.getSelectedItem().toString().toLowerCase())) {
                        if(t == l){
                            thoaMan = true;
                        }       
                    }
                }  
            }
                
            if (!txtLuongSanPham.getText().isEmpty()) {
                if (String.valueOf(lg.getTongLuongSanPham()).toLowerCase().equalsIgnoreCase(txtLuongSanPham.getText().toLowerCase())) {
                    thoaMan = true;
                }
            }
            if (!txtTienPhuCapHc.getText().isEmpty()) {
                if (String.valueOf(lg.getTienPhuCap()).toLowerCase().equalsIgnoreCase(txtTienPhuCapHc.getText().toLowerCase())) {
                    thoaMan = true;
                }
            }
            
            if (thoaMan) {
                Object[] rowData = {
                    i++,
                    lg.getNhanVienSanXuat().getMaNhanVienSanXuat(),
                    lg.getNhanVienSanXuat().getHoVaTen(),
                    df.format(lg.getTongLuongSanPham())+ "VND",
                    df.format(lg.getTienPhuCap())+ "VND",
                    df.format(lg.getTongLuong())+ "VND",
                };
                modelLuongSx.addRow(rowData);
            }
        }
    }
    public void doDuLieu() {
        doDuLieuLuongHanhChanh();
        doDuLieuLuongSanXuat();
    }
    public void lamMoiBang() {
        modelLuongHc.setRowCount(0);
        modelLuongSx.setRowCount(0);
    }
    public void lamMoiDong() {
        txtMa.setText("");
        txtTen.setText("");
        cmbThang.setSelectedIndex(-1);
        cmbPhanXuong.setSelectedIndex(-1);
        cmbPhongBan.setSelectedIndex(-1);
        ychNam.setValue(2023);
        txtLuongSanPham.setText("");
        txtTienPhuCapHc.setText("");
        txtTienPhuCapSx.setText("");
        cmbHeSoLuong.setSelectedIndex(-1);
        txtLuongCoBan.setText("");
        txtNgayCongChuan.setText("");
        txtNgayCongThucTe.setText("");
        txtTienTangCa.setText("");
    }
    public void doDuLieuLuongHanhChanh() {
        int i=1;
        for(LuongHanhChanh lg : tinhLuongHanhChanh_Dao.getDanhSachLuong()) {
            Object[] objects = {
                i++,
                lg.getNhanVienHanhChanh().getMaNhanVienHanhChanh(),
                lg.getNhanVienHanhChanh().getHoVaTen(),
                lg.getChucVu(),
                lg.getHeSoLuong(),
                lg.getLuongCoBan(),
                lg.getSoNgayCongChuan(),
                df.format(lg.getTienPhuCap())+"VND",
                lg.getNgayCongThucTe(),
                df.format(lg.getTienTangCa())+"VND",
                df.format(lg.getTongLuong())+"VND"
                
            };
            modelLuongHc.addRow(objects);
        }
    }
    public void doDuLieuLuongSanXuat() {
        int i = 1;
        for(LuongCongNhan lg : tinhLuongCongNhan_Dao.getDanhSachLuong()) {
            Object[] objects = {
                i++,
                lg.getNhanVienSanXuat().getMaNhanVienSanXuat(),
                lg.getNhanVienSanXuat().getHoVaTen(),
                df.format(lg.getTongLuongSanPham())+ "VND",
                df.format(lg.getTienPhuCap())+ "VND",
                df.format(lg.getTongLuong())+ "VND",
            };
            modelLuongSx.addRow(objects);
        }
    }
    
    // private Border_Selected border;
    private List<CapBac> capBacs;
    private CapBac_Dao capBac_Dao;
    private BacLuong_Dao bacLuong_Dao;
    private PhanXuong_Dao phanXuong_Dao;
    private DecimalFormat df;
    private DefaultTableModel modelLuongHc;
    private DefaultTableModel modelLuongSx;
    private Border_Selected border_Selected;
    private PhongBan_Dao phongBan_Dao;
    private NhanVienSanXuat_Dao nhanVienSanXuat_Dao;
    private NhanVienHanhChanh_Dao nhanVienHanhChanh_Dao;
    private TinhLuongHanhChanh_Dao tinhLuongHanhChanh_Dao;
    private TinhLuongCongNhan_Dao tinhLuongCongNhan_Dao;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.ButtonGroup btnThayDoiTim;
    private javax.swing.JButton btnTim;
    private javax.swing.JComboBox<String> cmbHeSoLuong;
    private javax.swing.JComboBox<String> cmbPhanXuong;
    private javax.swing.JComboBox<String> cmbPhongBan;
    private javax.swing.JComboBox<String> cmbThang;
    private javax.swing.JButton jButton15;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblChucVu;
    private javax.swing.JLabel lblHeSoLuong;
    private javax.swing.JLabel lblLuongCoBan;
    private javax.swing.JLabel lblNgayCongChuan;
    private javax.swing.JLabel lblNgayCongThucTe;
    private javax.swing.JLabel lblPhongBan;
    private javax.swing.JLabel lblTienPhuCap;
    private javax.swing.JLabel lblTienTangCa;
    private javax.swing.JRadioButton radNVHC;
    private javax.swing.JRadioButton radNVSX;
    private javax.swing.JTextField txtChucVu;
    private javax.swing.JTextField txtLuongCoBan;
    private javax.swing.JTextField txtLuongSanPham;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtNgayCongChuan;
    private javax.swing.JTextField txtNgayCongThucTe;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTienPhuCapHc;
    private javax.swing.JTextField txtTienPhuCapSx;
    private javax.swing.JTextField txtTienTangCa;
    private com.toedter.calendar.JYearChooser ychNam;
    // End of variables declaration//GEN-END:variables
}
