package gui;

import connect.ConnectDB;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import dao.ChamCongHanhChanh_Dao;
import dao.NhanVienHanhChanh_Dao;
import dao.PhongBan_Dao;
import entity.PhongBan;
import entity.NhanVienHanhChanh;
import entity.ChamCongNhanVien;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class ChamCongHanhChinh_GUI extends javax.swing.JPanel {

    /**
     * Creates new form ChamCongHanhChinh
     */
    public ChamCongHanhChinh_GUI() throws SQLException {
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
        tblPhongBan = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblChamCong = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        chkLamViec = new javax.swing.JCheckBox();
        spnGioTangCa = new javax.swing.JSpinner();
        btnXuat = new javax.swing.JButton();
        chkToanBo = new javax.swing.JCheckBox();
        btnTao = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dchNgayChamCong = new com.toedter.calendar.JDateChooser();
        chkTu = new javax.swing.JCheckBox();
        dchDenNgay = new com.toedter.calendar.JDateChooser();
        btnLoc = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblPhongBan = new javax.swing.JLabel();
        lblMa = new javax.swing.JLabel();
        lblTen = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1200, 674));
        setPreferredSize(new java.awt.Dimension(1200, 674));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 96, 59)));

        tblPhongBan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblPhongBan.setToolTipText("");
        tblPhongBan.setSelectionBackground(new java.awt.Color(144, 237, 144));
        tblPhongBan.setSelectionForeground(new java.awt.Color(51, 51, 51));
        tblPhongBan.getTableHeader().setReorderingAllowed(false);
        tblPhongBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhongBanMouseClicked(evt);
            }
        });
        tblPhongBan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblPhongBanKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tblPhongBan);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 210, 340));

        jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 96, 59), 2), "Danh Sách Chấm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 99, 0))); // NOI18N

        tblChamCong.setBackground(new java.awt.Color(184, 206, 224));
        tblChamCong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblChamCong.setToolTipText("");
        tblChamCong.setSelectionBackground(new java.awt.Color(144, 237, 144));
        tblChamCong.setSelectionForeground(new java.awt.Color(51, 51, 51));
        tblChamCong.getTableHeader().setReorderingAllowed(false);
        tblChamCong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChamCongMouseClicked(evt);
            }
        });
        tblChamCong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblChamCongKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(tblChamCong);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 1090, 520));

        jScrollPane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 96, 59)));

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
        jScrollPane5.setViewportView(tblNhanVien);

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 397));

        chkLamViec.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chkLamViec.setForeground(new java.awt.Color(0, 96, 0));
        chkLamViec.setAlignmentX(CENTER_ALIGNMENT);
        chkLamViec.setText("Làm việc");
        chkLamViec.setEnabled(false);
        add(chkLamViec, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 90, 20));

        spnGioTangCa.setModel(new javax.swing.SpinnerNumberModel(0, 0, 4, 1));
        spnGioTangCa.setEnabled(false);
        ((DefaultEditor) spnGioTangCa.getEditor()).getTextField().setEditable(false);
        add(spnGioTangCa, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, 90, -1));

        btnXuat.setBackground(new java.awt.Color(152, 249, 152));
        btnXuat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXuat.setText("Xuất Bảng Chấm Công");
        btnXuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatActionPerformed(evt);
            }
        });
        add(btnXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 140, 180, 30));

        chkToanBo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chkToanBo.setForeground(new java.awt.Color(0, 96, 0));
        chkToanBo.setText("Toàn bộ nhân viên");
        chkToanBo.setEnabled(false);
        chkToanBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkToanBoActionPerformed(evt);
            }
        });
        add(chkToanBo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 180, 20));

        btnTao.setBackground(new java.awt.Color(152, 249, 152));
        btnTao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/plus.png"))); // NOI18N
        btnTao.setText("Tạo");
        btnTao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTao.setDisabledIcon(null);
        btnTao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoActionPerformed(evt);
            }
        });
        add(btnTao, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 180, 130, 30));

        btnCapNhat.setBackground(new java.awt.Color(152, 249, 152));
        btnCapNhat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/update.png"))); // NOI18N
        btnCapNhat.setText("Cập Nhật");
        btnCapNhat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });
        add(btnCapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 180, 130, 30));

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
        add(btnLamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 180, 120, 30));

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
        add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 180, 90, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Trạng Thái:");
        jLabel14.setToolTipText("");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 100, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Chấm Công Hành Chính");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 40));

        dchNgayChamCong.setBackground(new java.awt.Color(255, 255, 255));
        dchNgayChamCong.setForeground(new java.awt.Color(0, 96, 0));
        dchNgayChamCong.setDateFormatString("dd/MM/yyyy");
        dchNgayChamCong.setEnabled(false);
        dchNgayChamCong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(dchNgayChamCong, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 170, -1));

        chkTu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chkTu.setForeground(new java.awt.Color(0, 96, 0));
        chkTu.setText("Từ");
        chkTu.setEnabled(false);
        chkTu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTuActionPerformed(evt);
            }
        });
        add(chkTu, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 50, 20));

        dchDenNgay.setBackground(new java.awt.Color(255, 255, 255));
        dchDenNgay.setForeground(new java.awt.Color(0, 96, 0));
        dchDenNgay.setDateFormatString("dd/MM/yyyy");
        dchDenNgay.setEnabled(false);
        dchDenNgay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(dchDenNgay, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 170, -1));

        btnLoc.setBackground(new java.awt.Color(152, 249, 152));
        btnLoc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLoc.setText("Lọc");
        btnLoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnLoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, 60, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Ngày Chấm Công:");
        jLabel15.setToolTipText("");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 130, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Phòng Ban:");
        jLabel16.setToolTipText("");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 130, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Tên Nhân Viên:");
        jLabel17.setToolTipText("");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 130, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Mã Nhân Viên:");
        jLabel18.setToolTipText("");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 130, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Giờ Tăng Ca:");
        jLabel19.setToolTipText("");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 100, -1));

        lblPhongBan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPhongBan.setForeground(new java.awt.Color(0, 99, 0));
        lblPhongBan.setToolTipText("");
        add(lblPhongBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 170, -1));

        lblMa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMa.setForeground(new java.awt.Color(0, 99, 0));
        lblMa.setToolTipText("");
        add(lblMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 170, -1));

        lblTen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTen.setForeground(new java.awt.Color(0, 99, 0));
        lblTen.setToolTipText("");
        add(lblTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXuatActionPerformed

    private void chkToanBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkToanBoActionPerformed
        xuLyChkToanBo();
    }//GEN-LAST:event_chkToanBoActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void chkTuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTuActionPerformed
        xuLyChkTu();
    }//GEN-LAST:event_chkTuActionPerformed

    private void tblPhongBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhongBanMouseClicked
        xuLyThayDoiTblPhongBan();
    }//GEN-LAST:event_tblPhongBanMouseClicked

    private void tblPhongBanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPhongBanKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            xuLyThayDoiTblPhongBan();
        }
    }//GEN-LAST:event_tblPhongBanKeyReleased

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        xuLyThayDoiTblNhanVien();
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void tblNhanVienKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblNhanVienKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            xuLyThayDoiTblNhanVien();
        }
    }//GEN-LAST:event_tblNhanVienKeyReleased

    private void btnTaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoActionPerformed
        xuLyTao();
    }//GEN-LAST:event_btnTaoActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        if (lamMoiBtn()) {
            lamMoiDong();
            lamMoiBang();
            doDuLieu();
        }
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void tblChamCongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChamCongMouseClicked
        layDuLieuLenText();
    }//GEN-LAST:event_tblChamCongMouseClicked

    private void tblChamCongKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblChamCongKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            layDuLieuLenText();
        }
    }//GEN-LAST:event_tblChamCongKeyReleased

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        xuLyXoa();
    }//GEN-LAST:event_btnXoaActionPerformed
    private void initCommon() throws SQLException {
        ConnectDB.getInstance();
        ConnectDB.connect();
        dinhDangNgay = new SimpleDateFormat("dd/MM/yyyy");
        phongBan_Dao = new PhongBan_Dao();
        nhanVienHanhChanh_Dao = new NhanVienHanhChanh_Dao();
        chamCongHanhChanh_Dao = new ChamCongHanhChanh_Dao();
        doDuLieu();
    }

    private void layNgayHienTai() {
        Calendar calendar = Calendar.getInstance();
        dchNgayChamCong.setDate(calendar.getTime());
    }

    private void doDuLieuPhongBan(List<PhongBan> phongBans) {
        int i = 2;
        dtmPhongBan.addRow(new Object[]{"1", "Toàn công ty"});
        for (PhongBan phongBan : phongBans) {
            Object[] object = {i, phongBan.getTenPhongBan()};
            i++;
            dtmPhongBan.addRow(object);
        }
        this.phongBans = phongBans;
        tblPhongBan.setRowSelectionInterval(0, 0);
    }

    private void doDuLieuNhanVien(List<NhanVienHanhChanh> nhanVienHanhChanhs) {
        int i = 1;
        for (NhanVienHanhChanh nVien : nhanVienHanhChanhs) {
            Object[] object = {i, nVien.getHoVaTen()};
            i++;
            dtmNhanVien.addRow(object);
        }
        this.nhanVienHanhChanhs = nhanVienHanhChanhs;
    }

    private void doDuLieuChamCong(List<ChamCongNhanVien> chamCongNhanViens) {
        int i = 1;
        for (ChamCongNhanVien chamCong : chamCongNhanViens) {
            Object[] object = {i, chamCong.getNhanVienHanhChanh().getPhongBan().getTenPhongBan(),
                chamCong.getNhanVienHanhChanh().getHoVaTen(),
                chamCong.getNhanVienHanhChanh().getMaNhanVienHanhChanh(),
                dinhDangNgay.format(chamCong.getNgayLamViec()),
                chamCong.getTrangThai(),
                chamCong.getGioTangCa()};
            i++;
            dtmChamCong.addRow(object);
        }
        this.chamCongNhanViens = chamCongNhanViens;
    }

    private void doDuLieu() {
        doDuLieuPhongBan(phongBan_Dao.getDanhSachPhongBan());
        doDuLieuNhanVien(nhanVienHanhChanh_Dao.getDanhSachNhanVienHanhChanh());
        doDuLieuChamCong(chamCongHanhChanh_Dao.getDanhSachChamCongNhanVien());
    }

    private void setTable() {
        //setTable ở đây
        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        dtmNhanVien = new DefaultTableModel(
                new Object[][]{},
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
        tblNhanVien.setModel(dtmNhanVien);
        tblNhanVien.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblNhanVien.getColumnModel().getColumn(1).setPreferredWidth(174);
        tblNhanVien.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));
        //set table don vi
        dtmPhongBan = new DefaultTableModel(
                new Object[][]{},
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
        tblPhongBan.setModel(dtmPhongBan);
        tblPhongBan.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblPhongBan.getColumnModel().getColumn(1).setPreferredWidth(174);
        tblPhongBan.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));
        //table chấm công
        dtmChamCong = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "STT", "Phòng ban", "Họ và tên", "Mã nhân viên", "Ngày chấm", "Trạng thái", "Tăng ca"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class
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
        tblChamCong.setModel(dtmChamCong);
        tblChamCong.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));
        tblChamCong.getColumnModel().getColumn(3).setCellRenderer(center);
        tblChamCong.getColumnModel().getColumn(4).setCellRenderer(center);
        tblChamCong.getColumnModel().getColumn(6).setCellRenderer(center);
    }

    public void layDuLieuLenText() {
        try {
            // Lấy vị trí hàng được chọn trong bảng và cho dữ liệu lên textfield
            int hang = tblChamCong.getSelectedRow();
            if (hang != -1 && btnTao.getText().equalsIgnoreCase("Tạo") && btnCapNhat.getText().equalsIgnoreCase("Cập Nhật")) {
                lblMa.setText((String) tblChamCong.getValueAt(hang, 3));
                lblTen.setText((String) tblChamCong.getValueAt(hang, 2));
                lblPhongBan.setText((String) tblChamCong.getValueAt(hang, 1));
                chkLamViec.setSelected((boolean) tblChamCong.getValueAt(hang, 5));
                spnGioTangCa.setValue(tblChamCong.getValueAt(hang, 6));
                dchNgayChamCong.setDate(dinhDangNgay.parse((String) tblChamCong.getValueAt(hang, 4)));
            }
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }

    private boolean taoChamCong() {
        int i = JOptionPane.showConfirmDialog(this, "Xác Nhận Chấm Công", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (i == JOptionPane.YES_OPTION) {
            int[] soNhanVienChams = tblNhanVien.getSelectedRows();
            int soNhanVien = soNhanVienChams.length;
            int soLuongDuocCham = soNhanVienChams.length;
            int soThuTu = dtmChamCong.getRowCount() + 1;
            for (int j = 0; j < soNhanVien; j++) {
                ChamCongNhanVien chamCongNhanVien = new ChamCongNhanVien(chamCongHanhChanh_Dao.layMaTuDongChamCong(),
                        nhanVienHanhChanhs.get(soNhanVienChams[j]), dchNgayChamCong.getDate(),
                        chkLamViec.isSelected(), (int) spnGioTangCa.getValue());
                if (!chamCongHanhChanh_Dao.themChamCong(chamCongNhanVien)) {
                    JOptionPane.showMessageDialog(this, "Lỗi chấm công nhân viên có mã "
                            + nhanVienHanhChanhs.get(soNhanVienChams[j]).getMaNhanVienHanhChanh());
                    soLuongDuocCham--;
                    continue;
                }
                Object[] object = {soThuTu, chamCongNhanVien.getNhanVienHanhChanh().getPhongBan().getTenPhongBan(),
                    chamCongNhanVien.getNhanVienHanhChanh().getHoVaTen(),
                    chamCongNhanVien.getNhanVienHanhChanh().getMaNhanVienHanhChanh(),
                    dinhDangNgay.format(dchNgayChamCong.getDate()),
                    chkLamViec.isSelected(),
                    spnGioTangCa.getValue()};
                soThuTu++;
                chamCongNhanViens.add(chamCongNhanVien);
                dtmChamCong.addRow(object);

            }
            JOptionPane.showMessageDialog(this, "Có " + soLuongDuocCham + " nhân viên được chấm");
            return true;
        }
        return false;
    }

    private boolean xoaChamCong(int[] hang) {
        int soNhanVien = hang.length;
        for (int i = 0; i < soNhanVien; i++) {
            String maChamCong = chamCongNhanViens.get(hang[i]).getMaNgayCong();
            if (!chamCongHanhChanh_Dao.xoaChamCong(maChamCong)) {
                JOptionPane.showConfirmDialog(this, "Xóa chấm công thất bại số " + hang[i]);
                return false;
            }
        }
        return true;
    }

    private void xuLyTao() {
        if (btnTao.getText().equalsIgnoreCase("Tạo")) {
            btnTao.setText("Xác Nhận");
            btnCapNhat.setEnabled(false);
            btnXoa.setEnabled(false);
            btnXuat.setEnabled(false);
            lamMoiDong();
            layNgayHienTai();
            moNhapDuLieu();

        } else {
            if (taoChamCong()) {
                dongNhapDuLieu();
                btnCapNhat.setEnabled(true);
                btnXoa.setEnabled(true);
                btnXuat.setEnabled(true);
                btnTao.setText("Tạo");
            }
        }
    }

    private void xuLyXoa() {
        int[] hang = tblChamCong.getSelectedRows();
        if (hang.length != 0) {
            int i = JOptionPane.showConfirmDialog(this, "Xác Nhận Xóa Chấm Công", "Xác nhận", JOptionPane.YES_NO_OPTION);
            if (i == JOptionPane.YES_OPTION) {
                if (xoaChamCong(hang)) {
                    JOptionPane.showMessageDialog(this, "Xóa thành công");
                }
                dtmChamCong.setRowCount(0);
                doDuLieuChamCong(chamCongHanhChanh_Dao.getDanhSachChamCongNhanVien());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn dòng cần xóa!");
        }
    }

    private void xuLyChkTu() {
        if (chkTu.isSelected()) {
            dchDenNgay.setEnabled(true);
        } else {
            dchDenNgay.setEnabled(false);
        }
    }

    private void xuLyChkToanBo() {
        if (chkToanBo.isSelected()) {
            tblNhanVien.setRowSelectionInterval(0, tblNhanVien.getRowCount() - 1);
        } else {
            tblNhanVien.clearSelection();
        }
    }

    private void xuLyThayDoiTblNhanVien() {
        int hang = tblNhanVien.getSelectedRow();
        if (hang != -1) {
            NhanVienHanhChanh nVien = nhanVienHanhChanhs.get(hang);
            lblTen.setText(nVien.getHoVaTen());
            lblMa.setText(nVien.getMaNhanVienHanhChanh());
        }
    }

    private void xuLyThayDoiTblPhongBan() {
        int hang = tblPhongBan.getSelectedRow();
        if (hang != -1) {
            dtmNhanVien.setRowCount(0);
            lblTen.setText("");
            lblMa.setText("");
            chkToanBo.setSelected(false);
            if (hang == 0) {
                doDuLieuNhanVien(nhanVienHanhChanh_Dao.getDanhSachNhanVienHanhChanh());
                lblPhongBan.setText("");
            } else {
                doDuLieuNhanVien(nhanVienHanhChanh_Dao.getDanhSachNhanVienHanhChanhTheoPhongBan(phongBans.get(hang - 1).getMaPhongBan()));
                lblPhongBan.setText((String) tblPhongBan.getValueAt(hang, 1));
            }
        }
    }

    public boolean lamMoiBtn() {
        if (btnCapNhat.getText().equalsIgnoreCase("Xác Nhận") || btnTao.getText().equalsIgnoreCase("Xác Nhận")) {
            int i = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát khỏi chỉnh sửa không", "Xác nhận", JOptionPane.YES_NO_OPTION);
            if (i == JOptionPane.YES_OPTION) {
                btnTao.setEnabled(true);
                btnCapNhat.setEnabled(true);
                btnXoa.setEnabled(true);
                btnXuat.setEnabled(true);
                btnTao.setText("Tạo");
                btnCapNhat.setText("Cập Nhật");
                dongNhapDuLieu();
                return true;
            }
            return false;
        }
        return true;
    }

    private void lamMoiDong() {
        dchNgayChamCong.setDate(null);
        dchDenNgay.setDate(null);
        chkLamViec.setSelected(false);
        chkToanBo.setSelected(false);
        chkTu.setSelected(false);
        lblPhongBan.setText("");
        lblMa.setText("");
        lblTen.setText("");
        spnGioTangCa.setValue(0);
    }

    private void lamMoiBang() {
        dtmChamCong.setRowCount(0);
        dtmNhanVien.setRowCount(0);
        dtmPhongBan.setRowCount(0);
    }

    private void moNhapDuLieu() {
        dchNgayChamCong.setEnabled(true);
        chkLamViec.setEnabled(true);
        chkToanBo.setEnabled(true);
        chkTu.setEnabled(true);
        spnGioTangCa.setEnabled(true);
    }

    private void dongNhapDuLieu() {
        dchNgayChamCong.setEnabled(false);
        dchDenNgay.setEnabled(false);
        chkLamViec.setEnabled(false);
        chkToanBo.setEnabled(false);
        chkTu.setEnabled(false);
        spnGioTangCa.setEnabled(false);
    }
    private DefaultTableModel dtmPhongBan;
    private DefaultTableModel dtmNhanVien;
    private DefaultTableModel dtmChamCong;
    private SimpleDateFormat dinhDangNgay;
    private List<PhongBan> phongBans;
    private List<NhanVienHanhChanh> nhanVienHanhChanhs;
    private List<ChamCongNhanVien> chamCongNhanViens;
    private NhanVienHanhChanh_Dao nhanVienHanhChanh_Dao;
    private PhongBan_Dao phongBan_Dao;
    private ChamCongHanhChanh_Dao chamCongHanhChanh_Dao;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnLoc;
    private javax.swing.JButton btnTao;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXuat;
    private javax.swing.JCheckBox chkLamViec;
    private javax.swing.JCheckBox chkToanBo;
    private javax.swing.JCheckBox chkTu;
    private com.toedter.calendar.JDateChooser dchDenNgay;
    private com.toedter.calendar.JDateChooser dchNgayChamCong;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblMa;
    private javax.swing.JLabel lblPhongBan;
    private javax.swing.JLabel lblTen;
    private javax.swing.JSpinner spnGioTangCa;
    private javax.swing.JTable tblChamCong;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTable tblPhongBan;
    // End of variables declaration//GEN-END:variables
}
