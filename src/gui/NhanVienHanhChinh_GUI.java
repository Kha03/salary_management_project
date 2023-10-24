package gui;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import dao.NhanVienHanhChanh_Dao;
import dao.PhongBan_Dao;
import dao.CapBac_Dao;
import entity.PhongBan;
import entity.BacLuong;
import entity.CapBac;
import entity.NhanVienHanhChanh;
import connect.ConnectDB;
import entity.NhanVien;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class NhanVienHanhChinh_GUI extends javax.swing.JPanel {

    /**
     * Creates new form NhanVienHanhChinh
     */
    public NhanVienHanhChinh_GUI() throws SQLException {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        lstPhongBan = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        cmbCapBac = new javax.swing.JComboBox<>();
        cmbGioiTinh = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        txtDiaChi = new javax.swing.JTextField();
        txtMa = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtChucVu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDienThoai = new javax.swing.JTextField();
        txtNgoaiNgu = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cmbHeSoLuong = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        lblLuongCoSo = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblLuongCoBan = new javax.swing.JLabel();
        cmbPhongBan = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        dchNgaySinh = new com.toedter.calendar.JDateChooser();
        dchNgayVaoLam = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1366, 741));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 96, 59)));

        lstPhongBan.setForeground(new java.awt.Color(51, 51, 51));
        lstPhongBan.setSelectionBackground(new java.awt.Color(144, 237, 144));
        lstPhongBan.setSelectionForeground(new java.awt.Color(51, 51, 51));
        lstPhongBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstPhongBanMouseClicked(evt);
            }
        });
        lstPhongBan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lstPhongBanKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(lstPhongBan);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 43, 150, 250));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 96, 59), 2), "Danh Sách Nhân Viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 99, 0))); // NOI18N

        tblNhanVien.setBackground(new java.awt.Color(184, 206, 224));
        tblNhanVien.setToolTipText("");
        tblNhanVien.setSelectionBackground(new java.awt.Color(144, 237, 144));
        tblNhanVien.setSelectionForeground(new java.awt.Color(51, 51, 51));
        tblNhanVien.getTableHeader().setReorderingAllowed(false);
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        tblNhanVien.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblNhanVienKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblNhanVien);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 292, 1300, 450));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbCapBac.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbCapBac.setForeground(new java.awt.Color(0, 99, 0));
        cmbCapBac.setEnabled(false);
        cmbCapBac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCapBacActionPerformed(evt);
            }
        });
        jPanel1.add(cmbCapBac, new org.netbeans.lib.awtextra.AbsoluteConstraints(835, 90, 190, -1));

        cmbGioiTinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbGioiTinh.setForeground(new java.awt.Color(0, 99, 0));
        cmbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        cmbGioiTinh.setSelectedIndex(-1);
        cmbGioiTinh.setEnabled(false);
        jPanel1.add(cmbGioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        btnThem.setBackground(new java.awt.Color(152, 249, 152));
        btnThem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/plus.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThem.setDisabledIcon(null);
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel1.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 205, 130, 30));

        btnCapNhat.setBackground(new java.awt.Color(152, 249, 152));
        btnCapNhat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/update.png"))); // NOI18N
        btnCapNhat.setText("Cập Nhật");
        btnCapNhat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnCapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 205, 130, 30));

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
        jPanel1.add(btnLamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 205, 120, 30));

        btnXoa.setBackground(new java.awt.Color(152, 249, 152));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 205, 90, 30));

        txtDiaChi.setEditable(false);
        txtDiaChi.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(txtDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 530, -1));

        txtMa.setEditable(false);
        txtMa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMa.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(txtMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 190, -1));

        txtMail.setEditable(false);
        txtMail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMail.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 190, -1));

        txtTen.setEditable(false);
        txtTen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTen.setForeground(new java.awt.Color(0, 96, 0));
        txtTen.setEditable(false);
        jPanel1.add(txtTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 190, -1));

        txtChucVu.setEditable(false);
        txtChucVu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtChucVu.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(txtChucVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(835, 50, 190, -1));

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
        jLabel7.setText("Ngày Vào Làm:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 120, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Phòng Ban:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 120, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Ngoại Ngữ:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 120, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Cấp Bậc:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 100, -1));

        txtDienThoai.setEditable(false);
        txtDienThoai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDienThoai.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(txtDienThoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 190, -1));

        txtNgoaiNgu.setEditable(false);
        txtNgoaiNgu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNgoaiNgu.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(txtNgoaiNgu, new org.netbeans.lib.awtextra.AbsoluteConstraints(835, 10, 190, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Chức Vụ:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 100, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Mã Nhân Viên:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 120, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Lương Cơ Sở Áp Dụng:");
        jLabel13.setToolTipText("");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 205, 170, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Lương Cơ Bản:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 205, 120, -1));

        cmbHeSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbHeSoLuong.setForeground(new java.awt.Color(0, 99, 0));
        cmbHeSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHeSoLuongActionPerformed(evt);
            }
        });
        jPanel1.add(cmbHeSoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 130, 80, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Hệ Số Lương:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, 120, -1));

        lblLuongCoSo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLuongCoSo.setForeground(new java.awt.Color(0, 99, 0));
        lblLuongCoSo.setText("0");
        lblLuongCoSo.setToolTipText("");
        jPanel1.add(lblLuongCoSo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 205, 190, 20));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Địa chỉ:");
        jLabel14.setToolTipText("");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 120, -1));

        lblLuongCoBan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLuongCoBan.setForeground(new java.awt.Color(0, 99, 0));
        lblLuongCoBan.setText("0");
        lblLuongCoBan.setToolTipText("");
        jPanel1.add(lblLuongCoBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 205, 150, 20));

        cmbPhongBan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbPhongBan.setForeground(new java.awt.Color(0, 99, 0));
        cmbPhongBan.setEnabled(false);
        jPanel1.add(cmbPhongBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 190, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Email:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 120, -1));

        dchNgaySinh.setDateFormatString("dd/MM/yyyy");
        dchNgaySinh.setEnabled(false);
        jPanel1.add(dchNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 190, -1));

        dchNgayVaoLam.setDateFormatString("dd/MM/yyyy");
        dchNgayVaoLam.setEnabled(false);
        jPanel1.add(dchNgayVaoLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 190, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 50, 1150, 250));

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Thông Tin Nhân Viên");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 1300, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 99, 0));
        jLabel1.setText("Danh sách phòng ban:");
        jLabel1.setToolTipText("");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 150, -1));
    }// </editor-fold>//GEN-END:initComponents
    private void setTable() {
        //setTable ở đây
        dtmNhanVien = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Mã nhân viên", "Họ và tên", "Giới tính", "Ngày sinh", "Ngày vào làm", "Số điện thoại", "Địa chỉ", "Mail", "Ngoại ngữ", "Phòng ban", "Cấp bậc", "Chức vụ", "Hệ số lương", "Lương cơ bản"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
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
        tblNhanVien.setModel(dtmNhanVien);

        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        tblNhanVien.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));
        tblNhanVien.getColumnModel().getColumn(0).setCellRenderer(center);
        tblNhanVien.getColumnModel().getColumn(1).setCellRenderer(center);
        tblNhanVien.getColumnModel().getColumn(2).setCellRenderer(center);
        tblNhanVien.getColumnModel().getColumn(3).setCellRenderer(center);
        tblNhanVien.getColumnModel().getColumn(4).setCellRenderer(center);
        tblNhanVien.getColumnModel().getColumn(5).setCellRenderer(center);
        tblNhanVien.getColumnModel().getColumn(6).setCellRenderer(center);
        tblNhanVien.getColumnModel().getColumn(7).setCellRenderer(center);
        tblNhanVien.getColumnModel().getColumn(8).setCellRenderer(center);
        tblNhanVien.getColumnModel().getColumn(9).setCellRenderer(center);
        tblNhanVien.getColumnModel().getColumn(10).setCellRenderer(center);
        tblNhanVien.getColumnModel().getColumn(11).setCellRenderer(center);
        tblNhanVien.getColumnModel().getColumn(12).setCellRenderer(center);
        tblNhanVien.getColumnModel().getColumn(13).setCellRenderer(center);

        //set Jlist
        dlmPhongBan = new DefaultListModel();
        lstPhongBan.setModel(dlmPhongBan);
    }
    private void cmbCapBacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCapBacActionPerformed
        cmbHeSoLuong.removeAllItems();
        if (cmbCapBac.getSelectedIndex() != -1 && btnThem.getText().equalsIgnoreCase("Xác Nhận")) {
            CapBac cBac = capBacs.get(cmbCapBac.getSelectedIndex());
            for (BacLuong bLuong : cBac.getBacLuongs()) {
                cmbHeSoLuong.addItem(String.valueOf(bLuong.getHeSoLuong()));
            }
        }
    }//GEN-LAST:event_cmbCapBacActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        lamMoiDong();
        lamMoiBang();
        doDuLieu();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        layDuLieuLenText();
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void tblNhanVienKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblNhanVienKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            layDuLieuLenText();
        }
    }//GEN-LAST:event_tblNhanVienKeyReleased

    private void lstPhongBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstPhongBanMouseClicked
        int hang = lstPhongBan.getSelectedIndex();
        layDuLieuNhanVienTheoMaPhong(phongBans.get(hang).getMaPhongBan());
    }//GEN-LAST:event_lstPhongBanMouseClicked

    private void lstPhongBanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lstPhongBanKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            int hang = lstPhongBan.getSelectedIndex();
            layDuLieuNhanVienTheoMaPhong(phongBans.get(hang).getMaPhongBan());
        }
    }//GEN-LAST:event_lstPhongBanKeyReleased

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        themNhanVien();
    }//GEN-LAST:event_btnThemActionPerformed

    private void cmbHeSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHeSoLuongActionPerformed
        tinhLuongCoBan();
    }//GEN-LAST:event_cmbHeSoLuongActionPerformed
    private void initCommon() throws SQLException {
        ConnectDB.getInstance();
        ConnectDB.connect();
        df = new DecimalFormat("#,##0"); // Số lẻ số # để hiển thị đủ chữ số thập phân
        dinhDangNgay = new SimpleDateFormat("dd/MM/yyyy");
        nhanVienHanhChanh_Dao = new NhanVienHanhChanh_Dao();
        phongBan_Dao = new PhongBan_Dao();
        capBac_Dao = new CapBac_Dao();
        capBacs = capBac_Dao.getDanhSachCapBac();
        phongBans = phongBan_Dao.getDanhSachPhongBan();
        lblLuongCoSo.setText(df.format(capBacs.get(0).getBacLuongs().get(0).getLuongCoSo()) + "VND");
        doDuLieu();
    }

    public void layDuLieuNhanVienTheoMaPhong(String maPhongBan) {
        dtmNhanVien.setRowCount(0);
        for (NhanVienHanhChanh nVien : nhanVienHanhChanh_Dao.getDanhSachNhanVienHanhChanhTheoPhongBan(maPhongBan)) {
            Object[] objects = {nVien.getMaNhanVienHanhChanh(), nVien.getHoVaTen(),
                nVien.isGioiTinh() ? "Nam" : "Nữ",
                dinhDangNgay.format(nVien.getNgaySinh()),
                dinhDangNgay.format(nVien.getNgayVaoLam()),
                nVien.getDienThoai(),
                nVien.getDiaChi(),
                nVien.getEmail(),
                nVien.getNgoaiNgu(),
                nVien.getPhongBan().getTenPhongBan(),
                nVien.getCapBac(),
                nVien.getChucVu(),
                nVien.getHeSoLuong(),
                df.format(nVien.getLuongCoBan()) + "VND"

            };
            dtmNhanVien.addRow(objects);
        }
    }

    public void doDuLieuNhanVien() {
        for (NhanVienHanhChanh nVien : nhanVienHanhChanh_Dao.getDanhSachNhanVienHanhChanh()) {
            Object[] objects = {nVien.getMaNhanVienHanhChanh(), nVien.getHoVaTen(),
                nVien.isGioiTinh() ? "Nam" : "Nữ",
                dinhDangNgay.format(nVien.getNgaySinh()),
                dinhDangNgay.format(nVien.getNgayVaoLam()),
                nVien.getDienThoai(),
                nVien.getDiaChi(),
                nVien.getEmail(),
                nVien.getNgoaiNgu(),
                nVien.getPhongBan().getTenPhongBan(),
                nVien.getCapBac(),
                nVien.getChucVu(),
                nVien.getHeSoLuong(),
                df.format(nVien.getLuongCoBan()) + "VND"
            };
            dtmNhanVien.addRow(objects);
        }
    }

    public void doDuLieuPhongBan() {
        for (PhongBan pBan : phongBans) {
            String tenPhongBan = pBan.getTenPhongBan();
            dlmPhongBan.addElement(tenPhongBan);
            cmbPhongBan.addItem(tenPhongBan);
        }
        cmbPhongBan.setSelectedIndex(-1);
    }

    public void lamMoiDong() {
        txtMa.setText("");
        txtTen.setText("");
        dchNgaySinh.setDate(null);
        dchNgayVaoLam.setDate(null);
        txtChucVu.setText("");
        txtDiaChi.setText("");
        txtDienThoai.setText("");
        txtMail.setText("");
        txtNgoaiNgu.setText("");
    }

    public void lamMoiBang() {
        dtmNhanVien.setRowCount(0);
        dlmPhongBan.clear();
        cmbPhongBan.removeAllItems();
        cmbCapBac.removeAllItems();
    }

    public void doDuLieuCapBac() {
        for (CapBac cBac : capBacs) {
            String tenCapBac = cBac.getTenCapBac();
            cmbCapBac.addItem(tenCapBac);
        }
        cmbCapBac.setSelectedIndex(-1);
    }

    public void layDuLieuLenText() {
        try {
            // Lấy vị trí hàng được chọn trong bảng và cho dữ liệu lên textfield
            int hang = tblNhanVien.getSelectedRow();
            txtMa.setText((String) tblNhanVien.getValueAt(hang, 0));
            txtTen.setText((String) tblNhanVien.getValueAt(hang, 1));
            cmbGioiTinh.setSelectedItem((String) tblNhanVien.getValueAt(hang, 2));
            dchNgaySinh.setDate(dinhDangNgay.parse((String) tblNhanVien.getValueAt(hang, 3)));
            dchNgayVaoLam.setDate(dinhDangNgay.parse((String) tblNhanVien.getValueAt(hang, 4)));
            txtDienThoai.setText((String) tblNhanVien.getValueAt(hang, 5));
            txtDiaChi.setText((String) tblNhanVien.getValueAt(hang, 6));
            txtMail.setText((String) tblNhanVien.getValueAt(hang, 7));
            txtNgoaiNgu.setText((String) tblNhanVien.getValueAt(hang, 8));
            cmbPhongBan.setSelectedItem((String) tblNhanVien.getValueAt(hang, 9));
            cmbCapBac.setSelectedItem((String) tblNhanVien.getValueAt(hang, 10));
            txtChucVu.setText((String) tblNhanVien.getValueAt(hang, 11));
            cmbHeSoLuong.addItem((String.valueOf(tblNhanVien.getValueAt(hang, 12))));
            lblLuongCoBan.setText(String.valueOf(tblNhanVien.getValueAt(hang, 13)));
        } catch (ParseException ex) {
            Logger.getLogger(NhanVienHanhChinh_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void doDuLieu() {
        doDuLieuNhanVien();
        doDuLieuPhongBan();
        doDuLieuCapBac();
    }

    private void tinhLuongCoBan() {
        if (btnThem.getText().equalsIgnoreCase("Xác Nhận")) {
            if (cmbCapBac.getSelectedIndex() != -1 && cmbHeSoLuong.getSelectedIndex() != -1) {
                CapBac cBac = capBacs.get(cmbCapBac.getSelectedIndex());
                BacLuong bLuong = cBac.getBacLuongs().get(cmbHeSoLuong.getSelectedIndex());
                luongCoBan = bLuong.getLuongCoSo() * bLuong.getHeSoLuong();
                lblLuongCoBan.setText(df.format(luongCoBan) + "VND");
            } else {
                lblLuongCoBan.setText("");
            }
        }
    }

    private void themNhanVien() {
        if (btnThem.getText().equalsIgnoreCase("Thêm")) {
            btnThem.setText("Xác Nhận");
            txtMa.setEditable(true);
            txtTen.setEditable(true);
            cmbGioiTinh.setEnabled(true);
            dchNgaySinh.setEnabled(true);
            dchNgayVaoLam.setEnabled(true);
            txtDienThoai.setEditable(true);
            txtDiaChi.setEditable(true);
            txtMail.setEditable(true);
            txtNgoaiNgu.setEditable(true);
            cmbPhongBan.setEnabled(true);
            cmbCapBac.setEnabled(true);
            txtChucVu.setEditable(true);
            cmbHeSoLuong.setEnabled(true);
        }else{
            int i = JOptionPane.showConfirmDialog(this, "Xác Nhận Thêm Nhân Viên", "Xác nhận", JOptionPane.YES_NO_OPTION);
            if(i == JOptionPane.YES_OPTION){
                NhanVienHanhChanh nVien = new NhanVienHanhChanh("NV911", txtTen.getText(),
                        dchNgaySinh.getDate(), 
                        ((String) cmbGioiTinh.getSelectedItem()).equals("Nam"),
                        txtDiaChi.getText(),
                        txtDienThoai.getText(), 
                        txtMail.getText(),
                        dchNgayVaoLam.getDate(), txtMa.getText(), 
                        txtChucVu.getText(), 
                        txtNgoaiNgu.getText(), 
                        capBacs.get(cmbCapBac.getSelectedIndex()).getMaCapBac(), 
                        phongBans.get(cmbPhongBan.getSelectedIndex()),
                        luongCoBan,
                        Float.parseFloat((String) cmbHeSoLuong.getSelectedItem()));
                
                nhanVienHanhChanh_Dao.setThemNhanVien(nVien);
            }
        }
    }
    private DefaultTableModel dtmNhanVien;
    private DefaultListModel dlmPhongBan;
    SimpleDateFormat dinhDangNgay;
    DecimalFormat df;
    private float luongCoBan;
    private List<CapBac> capBacs;
    private List<PhongBan> phongBans;
    private CapBac_Dao capBac_Dao;
    private PhongBan_Dao phongBan_Dao;
    private NhanVienHanhChanh_Dao nhanVienHanhChanh_Dao;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cmbCapBac;
    private javax.swing.JComboBox<String> cmbGioiTinh;
    private javax.swing.JComboBox<String> cmbHeSoLuong;
    private javax.swing.JComboBox<String> cmbPhongBan;
    private com.toedter.calendar.JDateChooser dchNgaySinh;
    private com.toedter.calendar.JDateChooser dchNgayVaoLam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblLuongCoBan;
    private javax.swing.JLabel lblLuongCoSo;
    private javax.swing.JList<String> lstPhongBan;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtChucVu;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtDienThoai;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNgoaiNgu;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables

}
