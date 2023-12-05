package gui;

import connect.ConnectDB;
import dao.NhanVienHanhChanh_Dao;
import dao.NhanVienSanXuat_Dao;
import dao.PhanXuong_Dao;
import dao.PhongBan_Dao;
import dao.PhuCap_Dao;
import entity.NhanVien;
import entity.NhanVienHanhChanh;
import entity.NhanVienSanXuat;
import entity.PhanXuong;
import entity.PhongBan;
import entity.PhuCap;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class CapNhatPhuCap_GUI extends javax.swing.JPanel {

    /**
     * Creates new form ChamCongHanhChinh
     */
    public CapNhatPhuCap_GUI() throws SQLException {
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

        jScrollPane3 = new javax.swing.JScrollPane();
        tblDonVi = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        chkCoDinh = new javax.swing.JCheckBox();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        chkToanBo = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        lblTenPhuCap = new javax.swing.JLabel();
        lblMaPhuCap = new javax.swing.JLabel();
        lblSoTien = new javax.swing.JLabel();
        lblThangHuong = new javax.swing.JLabel();
        btnLamMoi = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblNhanVienCoPc = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        cmbDonVi = new javax.swing.JComboBox<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblPhuCap = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(1366, 741));
        setPreferredSize(new java.awt.Dimension(1366, 741));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 96, 59)));

        tblDonVi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblDonVi.setToolTipText("");
        tblDonVi.setSelectionBackground(new java.awt.Color(144, 237, 144));
        tblDonVi.setSelectionForeground(new java.awt.Color(51, 51, 51));
        tblDonVi.getTableHeader().setReorderingAllowed(false);
        tblDonVi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDonViMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblDonVi);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 472, 200, 265));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chkCoDinh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chkCoDinh.setForeground(new java.awt.Color(0, 96, 0));
        chkCoDinh.setText("Cố Định");
        chkCoDinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCoDinhActionPerformed(evt);
            }
        });
        jPanel1.add(chkCoDinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 170, 20));

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
        jPanel1.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 190, 120, 30));

        btnXoa.setBackground(new java.awt.Color(152, 249, 152));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel1.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 190, 90, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Số Tiền:");
        jLabel14.setToolTipText("");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 110, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Tên Phụ Cấp:");
        jLabel17.setToolTipText("");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 90, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Mã Phụ Cấp:");
        jLabel21.setToolTipText("");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 100, -1));

        chkToanBo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chkToanBo.setForeground(new java.awt.Color(0, 96, 0));
        chkToanBo.setText("Toàn bộ Nhân Viên");
        chkToanBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkToanBoActionPerformed(evt);
            }
        });
        jPanel1.add(chkToanBo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 170, 20));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Tháng Hưởng:");
        jLabel15.setToolTipText("");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 110, -1));

        lblTenPhuCap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTenPhuCap.setForeground(new java.awt.Color(0, 99, 0));
        lblTenPhuCap.setToolTipText("");
        jPanel1.add(lblTenPhuCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 180, 20));

        lblMaPhuCap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMaPhuCap.setForeground(new java.awt.Color(0, 99, 0));
        lblMaPhuCap.setToolTipText("");
        jPanel1.add(lblMaPhuCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 180, 20));

        lblSoTien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSoTien.setForeground(new java.awt.Color(0, 99, 0));
        lblSoTien.setToolTipText("");
        jPanel1.add(lblSoTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 180, 20));

        lblThangHuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblThangHuong.setForeground(new java.awt.Color(0, 99, 0));
        lblThangHuong.setToolTipText("");
        jPanel1.add(lblThangHuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 180, 20));

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
        jPanel1.add(btnLamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, 120, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 1094, 230));

        jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 96, 59), 2), "Nhân Viên Được Hưởng Phụ Cấp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 99, 0))); // NOI18N
        jScrollPane4.setPreferredSize(new java.awt.Dimension(462, 430));

        tblNhanVienCoPc.setBackground(new java.awt.Color(184, 206, 224));
        tblNhanVienCoPc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblNhanVienCoPc.setToolTipText("");
        tblNhanVienCoPc.setSelectionBackground(new java.awt.Color(144, 237, 144));
        tblNhanVienCoPc.setSelectionForeground(new java.awt.Color(51, 51, 51));
        tblNhanVienCoPc.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tblNhanVienCoPc);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, 550, 460));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cập Nhật Phụ Cấp Nhân Viên");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 1290, 50));

        cmbDonVi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbDonVi.setForeground(new java.awt.Color(0, 99, 0));
        cmbDonVi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Phòng Ban", "Phân Xưởng" }));
        cmbDonVi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDonViItemStateChanged(evt);
            }
        });
        add(cmbDonVi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 200, -1));

        jScrollPane7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 96, 59)));

        tblPhuCap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblPhuCap.setToolTipText("");
        tblPhuCap.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblPhuCap.setSelectionBackground(new java.awt.Color(144, 237, 144));
        tblPhuCap.setSelectionForeground(new java.awt.Color(51, 51, 51));
        tblPhuCap.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tblPhuCap.getTableHeader().setReorderingAllowed(false);
        tblPhuCap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhuCapMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblPhuCap);

        add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 200, 433));

        jScrollPane5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 96, 59), 2), "Danh Sách Nhân Viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 99, 0))); // NOI18N
        jScrollPane5.setPreferredSize(new java.awt.Dimension(462, 430));

        tblNhanVien.setBackground(new java.awt.Color(184, 206, 224));
        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblNhanVien.setToolTipText("");
        tblNhanVien.setSelectionBackground(new java.awt.Color(144, 237, 144));
        tblNhanVien.setSelectionForeground(new java.awt.Color(51, 51, 51));
        tblNhanVien.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tblNhanVien);

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 550, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void chkCoDinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCoDinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCoDinhActionPerformed

    private void chkToanBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkToanBoActionPerformed
        xuLyChkToanBo();
    }//GEN-LAST:event_chkToanBoActionPerformed

    private void cmbDonViItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDonViItemStateChanged
        xuLyThayDoiCmbDonVi();
    }//GEN-LAST:event_cmbDonViItemStateChanged

    private void tblDonViMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDonViMouseClicked
        xuLyThayDoiTblDonVi();
    }//GEN-LAST:event_tblDonViMouseClicked

    private void tblPhuCapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhuCapMouseClicked
        xuLyThayDoiTblPhuCap();
        layDuLieu();
    }//GEN-LAST:event_tblPhuCapMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        xuLyThem();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        xuLyLamMoi();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        xuLyXoa();
    }//GEN-LAST:event_btnXoaActionPerformed
    private void initCommon() throws SQLException {
        ConnectDB.getInstance();
        ConnectDB.connect();
        df = new DecimalFormat("#,##0"); // Số lẻ số # để hiển thị đủ chữ số thập phân
        phuCap_Dao = new PhuCap_Dao();
        phongBan_Dao = new PhongBan_Dao();
        phanXuong_Dao = new PhanXuong_Dao();
        nhanVienHanhChanh_Dao = new NhanVienHanhChanh_Dao();
        nhanVienSanXuat_Dao = new NhanVienSanXuat_Dao();
        doDuLieuPhongBan(phongBan_Dao.getDanhSachPhongBan());
        doDuLieuPhuCap(phuCap_Dao.getDanhSachPhuCap());
    }

    private void doDuLieuPhongBan(List<PhongBan> phongBans) {
        int i = 0;
        for (PhongBan phongBan : phongBans) {
            phongBans.get(i).setNhanVien(nhanVienHanhChanh_Dao.getDanhSachNhanVienHanhChanhTheoPhongBan(phongBan.getMaPhongBan()));
            Object[] objects = {i + 1, phongBan.getTenPhongBan()};
            i++;
            dtmDonVi.addRow(objects);
        }
        this.phongBans = phongBans;
    }

    private void doDuLieuPhanXuong(List<PhanXuong> phanXuongs) {
        int i = 0;
        for (PhanXuong phanXuong : phanXuongs) {
            phanXuongs.get(i).setNhanVien(nhanVienSanXuat_Dao.getDanhSachNhanVienSanXuatTheoPhanXuong(phanXuong.getMaPhanXuong()));
            Object[] objects = {i + 1, phanXuong.getTenPhanXuong()};
            i++;
            dtmDonVi.addRow(objects);
        }
        this.phanXuongs = phanXuongs;
    }

    private void doDuLieuNhanVien(List<NhanVien> nhanViens) {
        int i = 1;
        for (NhanVien nv : nhanViens) {
            if (nv instanceof NhanVienHanhChanh) {
                Object[] objects = {i, ((NhanVienHanhChanh) nv).getMaNhanVienHanhChanh(),
                    nv.getHoVaTen(), ((NhanVienHanhChanh) nv).getPhongBan().getTenPhongBan()
                };
                dtmNhanVien.addRow(objects);
            } else {
                Object[] objects = {i, ((NhanVienSanXuat) nv).getMaNhanVienSanXuat(),
                    nv.getHoVaTen(), ((NhanVienSanXuat) nv).getPhanXuong().getTenPhanXuong()
                };
                dtmNhanVien.addRow(objects);
            }
            i++;
        }
        this.nhanViens = nhanViens;
    }

    private void doDuLieuNhanVienCoPc(List<NhanVien> nhanViens) {
        int i = 1;
        for (NhanVien nv : nhanViens) {
            if (nv instanceof NhanVienHanhChanh) {
                Object[] objects = {i, ((NhanVienHanhChanh) nv).getMaNhanVienHanhChanh(),
                    nv.getHoVaTen(), ((NhanVienHanhChanh) nv).getPhongBan().getTenPhongBan()
                };
                dtmNhanVienCoPc.addRow(objects);
            } else {
                Object[] objects = {i, ((NhanVienSanXuat) nv).getMaNhanVienSanXuat(),
                    nv.getHoVaTen(), ((NhanVienSanXuat) nv).getPhanXuong().getTenPhanXuong()
                };
                dtmNhanVienCoPc.addRow(objects);
            }
            i++;
        }
        this.nhanVienPcs = nhanViens;
    }

    private void doDuLieuPhuCap(List<PhuCap> phuCaps) {
        int i = 1;
        for (PhuCap phuCap : phuCaps) {
            Object[] objects = {i, phuCap.getMaPhuCap(), phuCap.getTenPhuCap()};
            i++;
            dtmPhuCap.addRow(objects);
        }
        this.phuCaps = phuCaps;
    }

    private void setTable() {
        //khoi tạo phụ cấp compnent
        dtmNhanVien = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "STT", "Mã nhân viên", "Họ và tên", "Đơn vị"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false
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
        tblNhanVien.getColumnModel().getColumn(0).setPreferredWidth(40);
        tblNhanVien.getColumnModel().getColumn(1).setPreferredWidth(130);
        tblNhanVien.getColumnModel().getColumn(2).setPreferredWidth(150);
        tblNhanVien.getColumnModel().getColumn(3).setPreferredWidth(130);
        tblNhanVien.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));
        //set table don vi
        dtmNhanVienCoPc = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "STT", "Mã nhân viên", "Họ và tên", "Đơn vị"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false
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
        tblNhanVienCoPc.setModel(dtmNhanVienCoPc);
        tblNhanVienCoPc.getColumnModel().getColumn(0).setPreferredWidth(40);
        tblNhanVienCoPc.getColumnModel().getColumn(1).setPreferredWidth(130);
        tblNhanVienCoPc.getColumnModel().getColumn(2).setPreferredWidth(150);
        tblNhanVienCoPc.getColumnModel().getColumn(3).setPreferredWidth(130);
        tblNhanVienCoPc.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));
        //setTable ở đây
        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        //set table don vi
        dtmDonVi = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "STT", "Đơn vị"
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
        tblDonVi.setModel(dtmDonVi);
        tblDonVi.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblDonVi.getColumnModel().getColumn(1).setPreferredWidth(174);
        tblDonVi.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));
        //table chấm công
        dtmPhuCap = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "STT", "Mã phụ cấp", "Tên phụ cấp"}
        ) {
            Class[] types = new Class[]{
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,};
            boolean[] canEdit = new boolean[]{
                false, false, false,};

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        tblPhuCap.setModel(dtmPhuCap);
        tblPhuCap.getColumnModel().getColumn(0).setPreferredWidth(40);
        tblPhuCap.getColumnModel().getColumn(1).setPreferredWidth(130);
        tblPhuCap.getColumnModel().getColumn(2).setPreferredWidth(150);
        tblPhuCap.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));
    }

    private void xuLyThayDoiCmbDonVi() {
        dtmNhanVien.setRowCount(0);
        if (cmbDonVi.getSelectedItem().equals("Phòng Ban")) {
            dtmDonVi.setRowCount(0);
            doDuLieuPhongBan(phongBan_Dao.getDanhSachPhongBan());
        } else {
            dtmDonVi.setRowCount(0);
            doDuLieuPhanXuong(phanXuong_Dao.getDanhSachPhanXuong());
        }
    }

    private void xuLyThayDoiTblDonVi() {
        int hang = tblDonVi.getSelectedRow();
        int hangPc = tblPhuCap.getSelectedRow();
        if (hang != -1) {
            if (cmbDonVi.getSelectedItem().equals("Phòng Ban")) {
                dtmNhanVien.setRowCount(0);
                List<NhanVien> nv = new ArrayList<>(nhanVienHanhChanh_Dao.getDanhSachNhanVienHanhChanhTheoPhongBan(phongBans.get(hang).getMaPhongBan()));
                doDuLieuNhanVien(nv);
                if (hangPc != -1) {
                    dtmNhanVienCoPc.setRowCount(0);
                    List<NhanVien> nvPc = new ArrayList<>(phuCap_Dao.getDanhSachNhanVienPhuCapHc(phuCaps.get(hangPc).getMaPhuCap(), phongBans.get(hang).getMaPhongBan()));
                    doDuLieuNhanVienCoPc(nvPc);
                }
            } else {
                dtmNhanVien.setRowCount(0);
                List<NhanVien> nv = new ArrayList<>(nhanVienSanXuat_Dao.getDanhSachNhanVienSanXuatTheoPhanXuong(phanXuongs.get(hang).getMaPhanXuong()));
                doDuLieuNhanVien(nv);
                if (hangPc != -1) {
                    dtmNhanVienCoPc.setRowCount(0);
                    List<NhanVien> nvPc = new ArrayList<>(phuCap_Dao.getDanhSachNhanVienPhuCapSx(phuCaps.get(hangPc).getMaPhuCap(), phanXuongs.get(hang).getMaPhanXuong()));
                    doDuLieuNhanVienCoPc(nvPc);
                }
            }
        }
    }

    private void xuLyThayDoiTblPhuCap() {
        int hang = tblDonVi.getSelectedRow();
        int hangPc = tblPhuCap.getSelectedRow();
        if (hangPc != -1 && hang != -1) {
            if (cmbDonVi.getSelectedItem().equals("Phòng Ban")) {
                dtmNhanVienCoPc.setRowCount(0);
                List<NhanVien> nvPc = new ArrayList<>(phuCap_Dao.getDanhSachNhanVienPhuCapHc(phuCaps.get(hangPc).getMaPhuCap(), phongBans.get(hang).getMaPhongBan()));
                doDuLieuNhanVienCoPc(nvPc);
            } else {
                dtmNhanVienCoPc.setRowCount(0);
                List<NhanVien> nvPc = new ArrayList<>(phuCap_Dao.getDanhSachNhanVienPhuCapSx(phuCaps.get(hangPc).getMaPhuCap(), phanXuongs.get(hang).getMaPhanXuong()));
                doDuLieuNhanVienCoPc(nvPc);
            }
        }
    }

    private void xuLyThem() {
        int[] hang = tblNhanVien.getSelectedRows();
        if (JOptionPane.showConfirmDialog(this, "Xác nhận thêm nhân viên", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if (hang.length != 0) {
                int soLuong = hang.length;
                int hangPc = tblPhuCap.getSelectedRow();
                int soLuongThem = 0;
                if (hangPc != -1) {
                    for (int i = 0; i < soLuong; i++) {
                        if (phuCap_Dao.themNhanVien(nhanViens.get(hang[i]).getMaSo(), phuCaps.get(hangPc).getMaPhuCap())) {
                            soLuongThem++;
                        }
                    }
                    JOptionPane.showMessageDialog(this, soLuongThem + " Nhân viên được thêm");
                    xuLyThayDoiTblPhuCap();
                } else {
                    JOptionPane.showMessageDialog(this, "Bạn chưa chọn phụ cấp để thêm!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn nhân viên để thêm!");
            }
        }
    }

    private void xuLyXoa() {
        int[] hang = tblNhanVienCoPc.getSelectedRows();
        if (JOptionPane.showConfirmDialog(this, "Xác nhận xóa nhân viên khỏi phụ cấp", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if (hang.length != 0) {
                int soLuong = hang.length;
                int hangPc = tblPhuCap.getSelectedRow();
                int soLuongXoa = 0;
                if (hangPc != -1) {
                    for (int i = 0; i < soLuong; i++) {
                        if (phuCap_Dao.xoaNhanVien(nhanVienPcs.get(hang[i]).getMaSo(), phuCaps.get(hangPc).getMaPhuCap())) {
                            soLuongXoa++;
                        }
                    }
                    JOptionPane.showMessageDialog(this, soLuongXoa + " Nhân viên được xóa khỏi phụ cấp");
                    xuLyThayDoiTblPhuCap();
                } else {
                    JOptionPane.showMessageDialog(this, "Bạn chưa chọn phụ cấp để xóa!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn nhân viên để xóa!");
            }
        }
    }

    private void xuLyChkToanBo() {
        if (chkToanBo.isSelected()) {
            tblNhanVien.selectAll();
        } else {
            tblNhanVien.clearSelection();
        }
    }

    private void xuLyLamMoi() {
        lblMaPhuCap.setText("");
        lblTenPhuCap.setText("");
        lblThangHuong.setText("");
        lblSoTien.setText("");
        chkToanBo.setSelected(false);
        chkCoDinh.setSelected(false);
        dtmNhanVien.setRowCount(0);
        dtmNhanVienCoPc.setRowCount(0);
        tblPhuCap.clearSelection();
        tblDonVi.clearSelection();
    }

    private void layDuLieu() {
        int hangPc = tblPhuCap.getSelectedRow();
        if (hangPc != -1) {
            lblMaPhuCap.setText(phuCaps.get(hangPc).getMaPhuCap());
            lblTenPhuCap.setText(phuCaps.get(hangPc).getTenPhuCap());
            lblSoTien.setText(df.format(phuCaps.get(hangPc).getSoTien()) + "VND");
            lblThangHuong.setText(phuCaps.get(hangPc).getThangHuong());
            chkCoDinh.setSelected(phuCaps.get(hangPc).getCoDinh());
        }
    }
    private DefaultTableModel dtmDonVi;
    private DefaultTableModel dtmNhanVienCoPc;
    private DefaultTableModel dtmNhanVien;
    private DefaultTableModel dtmPhuCap;
    private DecimalFormat df;
    private List<PhuCap> phuCaps;
    private List<PhongBan> phongBans;
    private List<PhanXuong> phanXuongs;
    private List<NhanVien> nhanViens;
    private List<NhanVien> nhanVienPcs;
    private PhuCap_Dao phuCap_Dao;
    private PhongBan_Dao phongBan_Dao;
    private PhanXuong_Dao phanXuong_Dao;
    private NhanVienHanhChanh_Dao nhanVienHanhChanh_Dao;
    private NhanVienSanXuat_Dao nhanVienSanXuat_Dao;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JCheckBox chkCoDinh;
    private javax.swing.JCheckBox chkToanBo;
    private javax.swing.JComboBox<String> cmbDonVi;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lblMaPhuCap;
    private javax.swing.JLabel lblSoTien;
    private javax.swing.JLabel lblTenPhuCap;
    private javax.swing.JLabel lblThangHuong;
    private javax.swing.JTable tblDonVi;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTable tblNhanVienCoPc;
    private javax.swing.JTable tblPhuCap;
    // End of variables declaration//GEN-END:variables
}
