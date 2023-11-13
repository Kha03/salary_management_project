package gui;


import handle.borderselected.Border_Selected;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import connect.ConnectDB;
import dao.NhanVienHanhChanh_Dao;
import dao.NhanVienSanXuat_Dao;
import entity.CapBac;
import java.sql.SQLException;
import entity.NhanVien;
import entity.NhanVienHanhChanh;
import entity.NhanVienSanXuat;
import entity.PhanXuong;
import entity.TrinhDo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 *
 * @author ADMIN
 */
public class TimKiemNhanVien_GUI extends javax.swing.JPanel {

    private SimpleDateFormat dinhDangNgay;
    private ArrayList<NhanVien> ds;

    
    /**
     * Creates new form NhanVienHanhChinh
     * @throws java.sql.SQLException
     */
    public TimKiemNhanVien_GUI() throws SQLException {
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
        cmbCapBac = new javax.swing.JComboBox<>();
        cmbGioiTinh = new javax.swing.JComboBox<>();
        btnTim = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        txtMa = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblPhongBan = new javax.swing.JLabel();
        lblNgoaiNgu = new javax.swing.JLabel();
        lblCapBac = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cmbPhongBan = new javax.swing.JComboBox<>();
        cmbTrinhDo = new javax.swing.JComboBox<>();
        cmbPhanXuong = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        dchNgaySinh = new com.toedter.calendar.JDateChooser();
        lblPhongBan1 = new javax.swing.JLabel();
        dchNgayVaoLam = new com.toedter.calendar.JDateChooser();
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

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 1300, 465));

        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbCapBac.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbCapBac.setForeground(new java.awt.Color(0, 99, 0));
        cmbCapBac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân viên Hành Chính", "Quản Lý", "Trưởng Phòng", "Nhân Viên Phân Xưởng", "Tổ trưởng" }));
        jPanel1.add(cmbCapBac, new org.netbeans.lib.awtextra.AbsoluteConstraints(835, 50, 190, -1));

        cmbGioiTinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbGioiTinh.setForeground(new java.awt.Color(0, 99, 0));
        cmbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        cmbGioiTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGioiTinhActionPerformed(evt);
            }
        });
        jPanel1.add(cmbGioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

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
        jPanel1.add(btnTim, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 190, 130, 30));

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
        jPanel1.add(btnLamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 190, 120, 30));

        txtMa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMa.setForeground(new java.awt.Color(0, 96, 0));
        txtMa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMaFocusLost(evt);
            }
        });
        txtMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaActionPerformed(evt);
            }
        });
        jPanel1.add(txtMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 6, 190, 30));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 190, -1));

        txtTen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTen.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(txtTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 190, -1));

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

        txtSDT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSDT.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 190, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Mã Nhân Viên:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 120, -1));

        cmbPhongBan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbPhongBan.setForeground(new java.awt.Color(0, 99, 0));
        cmbPhongBan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Phòng Tài Chính Kế Toán", "Phòng Nhân Sự" }));
        cmbPhongBan.setToolTipText("");
        jPanel1.add(cmbPhongBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 190, -1));

        cmbTrinhDo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbTrinhDo.setForeground(new java.awt.Color(0, 99, 0));
        cmbTrinhDo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trung học cơ sở", "Trung học phổ thông", "Cao Đẳng", "Đại Học" }));
        cmbTrinhDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTrinhDoActionPerformed(evt);
            }
        });
        jPanel1.add(cmbTrinhDo, new org.netbeans.lib.awtextra.AbsoluteConstraints(835, 10, 190, -1));

        cmbPhanXuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbPhanXuong.setForeground(new java.awt.Color(0, 99, 0));
        cmbPhanXuong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Xưởng Lắp Ráp", "Xưởng Chế Tác" }));
        jPanel1.add(cmbPhanXuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 190, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Ngày Vào Làm:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 120, -1));

        dchNgaySinh.setDateFormatString("dd/MM/yyyy");
        jPanel1.add(dchNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 190, -1));

        lblPhongBan1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPhongBan1.setText("Phòng Ban:");
        jPanel1.add(lblPhongBan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 120, -1));

        dchNgayVaoLam.setDateFormatString("dd/MM/yyyy");
        jPanel1.add(dchNgayVaoLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 90, 190, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1294, 230));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tìm Kiếm Nhân Viên");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1294, 50));
    }// </editor-fold>//GEN-END:initComponents
// </editor-fold>                        
    private void setTable() {
        //setTable ở đây
        modelNhanvien = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Mã nhân viên", "Họ và tên", "Giới tính", "Ngày sinh", "Số điện thoại", "Địa chỉ", "Mail", "Đơn vị", "Cấp bậc", "Ngày vào làm" ,"Trình độ"
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
        jTable1.setModel(modelNhanvien);

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

//        model sản xuất
        cmbGioiTinh.setSelectedIndex(-1);
        cmbPhanXuong.setSelectedIndex(-1);
        cmbPhongBan.setSelectedIndex(-1);
        cmbCapBac.setSelectedIndex(-1);
        cmbTrinhDo.setSelectedIndex(-1);      
    }
    
    private void txtMaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaFocusGained
        // TODO add your handling code here:
        txtMa.setBorder(Border_Selected.getFocuBofocusBorder());
    }//GEN-LAST:event_txtMaFocusGained

    private void txtMaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaFocusLost
        // TODO add your handling code here:
        txtMa.setBorder(Border_Selected.getOriginalBorder());
    }//GEN-LAST:event_txtMaFocusLost

    private void txtMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaActionPerformed
        // System.out.println(jTextField2.getBorder());        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaActionPerformed

    private void cmbGioiTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGioiTinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbGioiTinhActionPerformed

    private void cmbTrinhDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTrinhDoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTrinhDoActionPerformed

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1FocusGained

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
        timKiem();
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
        lamMoiDong();
        lamMoiBang();
        doDuLieu();
    }//GEN-LAST:event_btnLamMoiActionPerformed
    private void initCommon() throws SQLException {
        ConnectDB.getInstance();
        ConnectDB.connect();
        dinhDangNgay = new SimpleDateFormat("dd/MM/yyyy");
        nhanVienHanhChanh_Dao = new NhanVienHanhChanh_Dao();
        nhanVienSanXuat_Dao = new NhanVienSanXuat_Dao();
        doDuLieu();
        
    }
    
    private void timKiem(){
        modelNhanvien.setRowCount(0); // Xóa dữ liệu hiện tại trong bảng để hiển thị kết quả tìm kiếm mới
        
        for (NhanVienHanhChanh nVien : nhanVienHanhChanh_Dao.getDanhSachNhanVienHanhChanh()) {
              boolean thoaMan = false; 
            if (!txtMa.getText().isEmpty()) {
                if (nVien.getMaNhanVienHanhChanh().equalsIgnoreCase(txtMa.getText())) {
                    thoaMan = true;
                }
            }
            if (!txtTen.getText().isEmpty()) {
                if (nVien.getHoVaTen().toLowerCase().contains(txtTen.getText().toLowerCase())) {
                    thoaMan = true;
                }
            }
            if (cmbGioiTinh.getSelectedIndex() != -1) {
                if ((nVien.isGioiTinh()? "Nam": "Nữ").toLowerCase().contains(cmbGioiTinh.getSelectedItem().toString().toLowerCase())) {
                    thoaMan = true;
                }
            }
            if (dchNgaySinh.getDate() != null) {
                if(dinhDangNgay.format(nVien.getNgaySinh()).equalsIgnoreCase(dinhDangNgay.format(dchNgaySinh.getDate()))) {
                    thoaMan = true;
                }
            }
            if (dchNgayVaoLam.getDate() != null) {
                if(dinhDangNgay.format(nVien.getNgayVaoLam()).equalsIgnoreCase(dinhDangNgay.format(dchNgayVaoLam.getDate()))) {
                    thoaMan = true;
                }
            }

            if (!txtSDT.getText().isEmpty()) {
                if (nVien.getDienThoai().toLowerCase().contains(txtSDT.getText().toLowerCase())) {
                    thoaMan = true;
                }
            }
            if (!txtEmail.getText().isEmpty()) {
                if (nVien.getEmail().toLowerCase().contains(txtEmail.getText().toLowerCase())) {
                    thoaMan = true;
                }
            }
            if (cmbPhongBan.getSelectedIndex() != -1) {
                if (nVien.getPhongBan().getTenPhongBan().toLowerCase().contains(cmbPhongBan.getSelectedItem().toString().toLowerCase())) {
                    thoaMan = true;
                }
            }
            if (cmbCapBac.getSelectedIndex() != -1) {
                if (nVien.getCapBac().toLowerCase().contains(cmbCapBac.getSelectedItem().toString().toLowerCase())) {
                    thoaMan = true;
                }
            }
        
        // If the employee satisfies all criteria, add it to the table
            if (thoaMan) {
                Object[] rowData = {
                    nVien.getMaNhanVienHanhChanh(),
                    nVien.getHoVaTen(),
                    nVien.isGioiTinh()? "Nam": "Nữ",
                    dinhDangNgay.format(nVien.getNgaySinh()),
                    nVien.getDienThoai(),
                    nVien.getDiaChi(),
                    nVien.getEmail(),
                    nVien.getPhongBan().getTenPhongBan(),
                    nVien.getCapBac(),
                    dinhDangNgay.format(nVien.getNgayVaoLam()),
                  ""  
                };
                modelNhanvien.addRow(rowData);
            }
        } 
        
        //NhanVienSanXuat
        for (NhanVienSanXuat nVien : nhanVienSanXuat_Dao.getDanhSachNhanVienSanXuat()) {
              boolean thoaMan = false; 
        
            if (!txtMa.getText().isEmpty()) {
                if (nVien.getMaNhanVienSanXuat().equalsIgnoreCase(txtMa.getText())) {
                    thoaMan = true;
                }
            }
            if (!txtTen.getText().isEmpty()) {
                if (nVien.getHoVaTen().toLowerCase().contains(txtTen.getText().toLowerCase())) {
                    thoaMan = true;
                }
            }
            if (cmbGioiTinh.getSelectedIndex() != -1) {
                if ((nVien.isGioiTinh()? "Nam": "Nữ").toLowerCase().contains(cmbGioiTinh.getSelectedItem().toString().toLowerCase())) {
                    thoaMan = true;
                }
            }
            if (dchNgaySinh.getDate() != null) {
                if(dinhDangNgay.format(nVien.getNgaySinh()).equalsIgnoreCase(dinhDangNgay.format(dchNgaySinh.getDate()))) {
                    thoaMan = true;
                }
            }
            if (dchNgayVaoLam.getDate() != null) {
                if(dinhDangNgay.format(nVien.getNgayVaoLam()).equalsIgnoreCase(dinhDangNgay.format(dchNgayVaoLam.getDate()))) {
                    thoaMan = true;
                }
            }
            if (!txtSDT.getText().isEmpty()) {
                if (nVien.getDienThoai().toLowerCase().contains(txtSDT.getText().toLowerCase())) {
                    thoaMan = true;
                }
            }
            if (!txtEmail.getText().isEmpty()) {
                if (nVien.getEmail().toLowerCase().contains(txtEmail.getText().toLowerCase())) {
                    thoaMan = true;
                }
            }
            if (cmbPhanXuong.getSelectedIndex() != -1) {
                if (nVien.getPhanXuong().getTenPhanXuong().toLowerCase().contains(cmbPhanXuong.getSelectedItem().toString().toLowerCase())) {
                    thoaMan = true;
                }
            }
            if (cmbTrinhDo.getSelectedIndex() != -1) {
                if (nVien.getTrinhDo().toLowerCase().contains(cmbTrinhDo.getSelectedItem().toString().toLowerCase())) {
                    thoaMan = true;
                }
            }
        
        // If the employee satisfies all criteria, add it to the table
            if (thoaMan) {
                Object[] rowData = {
                    nVien.getMaNhanVienSanXuat(),
                    nVien.getHoVaTen(),
                    nVien.isGioiTinh() ? "Nam" : "Nữ",
                    dinhDangNgay.format(nVien.getNgaySinh()),
                    nVien.getDienThoai(),
                    nVien.getDiaChi(),
                    nVien.getEmail(),
                    nVien.getPhanXuong().getTenPhanXuong(),
                    nVien.getcapBac(),
                    dinhDangNgay.format(nVien.getNgayVaoLam()),
                    nVien.getTrinhDo()
                };
                modelNhanvien.addRow(rowData);
            }
        } 
          
         
    }
    
    public void lamMoiDong() {
        txtMa.setText("");
        txtTen.setText("");
        dchNgaySinh.setDate(null);
        dchNgayVaoLam.setDate(null);
        txtSDT.setText("");
        txtEmail.setText("");
        cmbPhongBan.setSelectedIndex(-1);
        cmbPhanXuong.setSelectedIndex(-1);
        cmbTrinhDo.setSelectedIndex(-1);
        cmbCapBac.setSelectedIndex(-1);
    }
    
    public void lamMoiBang() {
        modelNhanvien.setRowCount(0);
    }
    private void doDuLieu(){
        doDuLieuNhanVien();
    }
    private void doDuLieuNhanVien() {
        for (NhanVienHanhChanh nVien : nhanVienHanhChanh_Dao.getDanhSachNhanVienHanhChanh()) {
          Object[] objects = {
              nVien.getMaNhanVienHanhChanh(),
              nVien.getHoVaTen(),
              nVien.isGioiTinh()? "Nam": "Nữ",
              dinhDangNgay.format(nVien.getNgaySinh()),
              nVien.getDienThoai(),
              nVien.getDiaChi(),
              nVien.getEmail(),
              nVien.getPhongBan().getTenPhongBan(),
              nVien.getCapBac(),
              dinhDangNgay.format(nVien.getNgayVaoLam()),
              ""        
          };
          modelNhanvien.addRow(objects);
        }
        //do table đang lấy của nhân viên hành chính nên chỗ này bị lỗi
        // Lấy danh sách nhân viên sản xuất từ cơ sở dữ liệu

        for (NhanVienSanXuat nVien : nhanVienSanXuat_Dao.getDanhSachNhanVienSanXuat()) {
          Object[] objects = {
                nVien.getMaNhanVienSanXuat(),
                nVien.getHoVaTen(),
                nVien.isGioiTinh() ? "Nam" : "Nữ",
                dinhDangNgay.format(nVien.getNgaySinh()),
                nVien.getDienThoai(),
                nVien.getDiaChi(),
                nVien.getEmail(),
                nVien.getPhanXuong().getTenPhanXuong(),
                nVien.getcapBac(),
                dinhDangNgay.format(nVien.getNgayVaoLam()),
                nVien.getTrinhDo()
            };
            modelNhanvien.addRow(objects);
        }

    }
    
    
    // private Border_Selected border;
    private DefaultTableModel modelNhanvien;
    private NhanVienSanXuat_Dao nhanVienSanXuat_Dao;
    private NhanVienHanhChanh_Dao nhanVienHanhChanh_Dao;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnTim;
    private javax.swing.JComboBox<String> cmbCapBac;
    private javax.swing.JComboBox<String> cmbGioiTinh;
    private javax.swing.JComboBox<String> cmbPhanXuong;
    private javax.swing.JComboBox<String> cmbPhongBan;
    private javax.swing.JComboBox<String> cmbTrinhDo;
    private com.toedter.calendar.JDateChooser dchNgaySinh;
    private com.toedter.calendar.JDateChooser dchNgayVaoLam;
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
    private javax.swing.JLabel lblCapBac;
    private javax.swing.JLabel lblNgoaiNgu;
    private javax.swing.JLabel lblPhongBan;
    private javax.swing.JLabel lblPhongBan1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables

    

    
}

