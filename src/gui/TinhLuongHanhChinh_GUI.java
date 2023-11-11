package gui;

import connect.ConnectDB;
import dao.ChamCongHanhChanh_Dao;
import dao.NhanVienHanhChanh_Dao;
import dao.PhongBan_Dao;
import dao.PhuCap_Dao;
import dao.TinhLuongHanhChanh_Dao;
import entity.ChamCongNhanVien;
import entity.LuongHanhChanh;
import entity.NhanVienHanhChanh;
import entity.PhongBan;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.time.YearMonth;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class TinhLuongHanhChinh_GUI extends javax.swing.JPanel {

    /**
     * Creates new form ChamCongHanhChinh
     */
    public TinhLuongHanhChinh_GUI() throws SQLException {
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
        jScrollPane5 = new javax.swing.JScrollPane();
        tblPhongBan = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        cmbThang = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        ychNam = new com.toedter.calendar.JYearChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        lblChucVu = new javax.swing.JLabel();
        lblTenNhanVien = new javax.swing.JLabel();
        lblMaNhanVien = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lblHeSoLuong = new javax.swing.JLabel();
        lblNgayCongChuan = new javax.swing.JLabel();
        lblTienPhuCap = new javax.swing.JLabel();
        lblTienTangCa = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblLuongCoBan = new javax.swing.JLabel();
        lblLuongThucLanh = new javax.swing.JLabel();
        btnPdf = new javax.swing.JButton();
        btnExcell = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        btnTao = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblLuong = new javax.swing.JTable();
        btnChiTiet = new javax.swing.JButton();
        lblNgayCongThucTe = new javax.swing.JLabel();
        lblPhongBan = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1200, 674));
        setPreferredSize(new java.awt.Dimension(1366, 741));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setOpaque(false);

        jScrollPane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 96, 59)));

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
        jScrollPane5.setViewportView(tblPhongBan);

        jDesktopPane1.add(jScrollPane5);
        jScrollPane5.setBounds(0, 0, 190, 240);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Tháng:");
        jLabel17.setToolTipText("");
        jDesktopPane1.add(jLabel17);
        jLabel17.setBounds(220, 50, 60, 20);

        cmbThang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cmbThang.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbThangItemStateChanged(evt);
            }
        });
        jDesktopPane1.add(cmbThang);
        cmbThang.setBounds(280, 50, 50, 22);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Năm:");
        jLabel14.setToolTipText("");
        jDesktopPane1.add(jLabel14);
        jLabel14.setBounds(340, 50, 60, 20);

        ychNam.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ychNamPropertyChange(evt);
            }
        });
        jDesktopPane1.add(ychNam);
        ychNam.setBounds(390, 50, 65, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Bảng Lương Nhân Viên Hành Chính");
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(4, 0, 1300, 40);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Phòng Ban:");
        jLabel19.setToolTipText("");
        jDesktopPane1.add(jLabel19);
        jLabel19.setBounds(220, 90, 110, 20);

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel39.setText("Mã Nhân Viên:");
        jLabel39.setToolTipText("");
        jDesktopPane1.add(jLabel39);
        jLabel39.setBounds(220, 130, 110, 20);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Tên Nhân Viên:");
        jLabel18.setToolTipText("");
        jDesktopPane1.add(jLabel18);
        jLabel18.setBounds(220, 170, 110, 20);

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setText("Chức Vụ:");
        jLabel37.setToolTipText("");
        jDesktopPane1.add(jLabel37);
        jLabel37.setBounds(220, 210, 70, 20);

        lblChucVu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblChucVu.setForeground(new java.awt.Color(0, 99, 0));
        lblChucVu.setText(" ");
        lblChucVu.setToolTipText("");
        jDesktopPane1.add(lblChucVu);
        lblChucVu.setBounds(340, 210, 340, 20);

        lblTenNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTenNhanVien.setForeground(new java.awt.Color(0, 99, 0));
        lblTenNhanVien.setText(" ");
        lblTenNhanVien.setToolTipText("");
        jDesktopPane1.add(lblTenNhanVien);
        lblTenNhanVien.setBounds(340, 170, 160, 20);

        lblMaNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMaNhanVien.setForeground(new java.awt.Color(0, 99, 0));
        lblMaNhanVien.setText(" ");
        lblMaNhanVien.setToolTipText("");
        jDesktopPane1.add(lblMaNhanVien);
        lblMaNhanVien.setBounds(340, 130, 160, 20);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Ngày Công Chuẩn:");
        jLabel22.setToolTipText("");
        jDesktopPane1.add(jLabel22);
        jLabel22.setBounds(550, 90, 140, 20);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setText("Ngày Công Thực Tế:");
        jLabel27.setToolTipText("");
        jDesktopPane1.add(jLabel27);
        jLabel27.setBounds(550, 130, 150, 20);

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setText("Hệ Số Lương:");
        jLabel29.setToolTipText("");
        jDesktopPane1.add(jLabel29);
        jLabel29.setBounds(550, 170, 100, 20);

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setText("Tiền Tăng Ca:");
        jLabel33.setToolTipText("");
        jDesktopPane1.add(jLabel33);
        jLabel33.setBounds(760, 130, 110, 20);

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setText("Tiền Phụ Cấp:");
        jLabel31.setToolTipText("");
        jDesktopPane1.add(jLabel31);
        jLabel31.setBounds(760, 90, 110, 20);

        lblHeSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblHeSoLuong.setForeground(new java.awt.Color(0, 99, 0));
        lblHeSoLuong.setText(" ");
        lblHeSoLuong.setToolTipText("");
        jDesktopPane1.add(lblHeSoLuong);
        lblHeSoLuong.setBounds(700, 170, 70, 20);

        lblNgayCongChuan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNgayCongChuan.setForeground(new java.awt.Color(0, 99, 0));
        lblNgayCongChuan.setText(" ");
        lblNgayCongChuan.setToolTipText("");
        jDesktopPane1.add(lblNgayCongChuan);
        lblNgayCongChuan.setBounds(700, 90, 40, 20);

        lblTienPhuCap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTienPhuCap.setForeground(new java.awt.Color(0, 99, 0));
        lblTienPhuCap.setText(" ");
        lblTienPhuCap.setToolTipText("");
        jDesktopPane1.add(lblTienPhuCap);
        lblTienPhuCap.setBounds(870, 90, 120, 20);

        lblTienTangCa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTienTangCa.setForeground(new java.awt.Color(0, 99, 0));
        lblTienTangCa.setText(" ");
        lblTienTangCa.setToolTipText("");
        jDesktopPane1.add(lblTienTangCa);
        lblTienTangCa.setBounds(870, 130, 120, 20);

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setText("Lương Thực Lãnh:");
        jLabel35.setToolTipText("");
        jDesktopPane1.add(jLabel35);
        jLabel35.setBounds(1000, 130, 130, 20);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Lương Cơ Bản:");
        jLabel21.setToolTipText("");
        jDesktopPane1.add(jLabel21);
        jLabel21.setBounds(1000, 90, 110, 20);

        lblLuongCoBan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLuongCoBan.setForeground(new java.awt.Color(0, 99, 0));
        lblLuongCoBan.setText(" ");
        lblLuongCoBan.setToolTipText("");
        jDesktopPane1.add(lblLuongCoBan);
        lblLuongCoBan.setBounds(1130, 90, 150, 20);

        lblLuongThucLanh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLuongThucLanh.setForeground(new java.awt.Color(0, 99, 0));
        lblLuongThucLanh.setText(" ");
        lblLuongThucLanh.setToolTipText("");
        jDesktopPane1.add(lblLuongThucLanh);
        lblLuongThucLanh.setBounds(1130, 130, 150, 20);

        btnPdf.setBackground(new java.awt.Color(152, 249, 152));
        btnPdf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPdf.setText("Xuất Pdf");
        btnPdf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPdfActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnPdf);
        btnPdf.setBounds(1070, 170, 100, 30);

        btnExcell.setBackground(new java.awt.Color(152, 249, 152));
        btnExcell.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExcell.setText("Xuất Excell");
        btnExcell.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcellActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnExcell);
        btnExcell.setBounds(1180, 170, 110, 30);

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
        jDesktopPane1.add(btnXoa);
        btnXoa.setBounds(1200, 210, 90, 30);

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
        btnLamMoi.setBounds(1070, 210, 120, 30);

        btnTao.setBackground(new java.awt.Color(152, 249, 152));
        btnTao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/plus.png"))); // NOI18N
        btnTao.setText("Tạo Bảng Lương");
        btnTao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTao.setDisabledIcon(null);
        btnTao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnTao);
        btnTao.setBounds(750, 210, 180, 30);

        jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 96, 59), 2), "Danh Sách Lương", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 99, 0))); // NOI18N

        tblLuong.setBackground(new java.awt.Color(184, 206, 224));
        tblLuong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblLuong.setToolTipText("");
        tblLuong.setSelectionBackground(new java.awt.Color(144, 237, 144));
        tblLuong.setSelectionForeground(new java.awt.Color(51, 51, 51));
        tblLuong.getTableHeader().setReorderingAllowed(false);
        tblLuong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLuongMouseClicked(evt);
            }
        });
        tblLuong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblLuongKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(tblLuong);

        jDesktopPane1.add(jScrollPane4);
        jScrollPane4.setBounds(0, 240, 1300, 500);

        btnChiTiet.setBackground(new java.awt.Color(152, 249, 152));
        btnChiTiet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnChiTiet.setText("Xem Chi Tiết");
        btnChiTiet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiTietActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnChiTiet);
        btnChiTiet.setBounds(940, 210, 120, 30);

        lblNgayCongThucTe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNgayCongThucTe.setForeground(new java.awt.Color(0, 99, 0));
        lblNgayCongThucTe.setText(" ");
        lblNgayCongThucTe.setToolTipText("");
        jDesktopPane1.add(lblNgayCongThucTe);
        lblNgayCongThucTe.setBounds(700, 130, 40, 20);

        lblPhongBan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPhongBan.setForeground(new java.awt.Color(0, 99, 0));
        lblPhongBan.setText(" ");
        lblPhongBan.setToolTipText("");
        jDesktopPane1.add(lblPhongBan);
        lblPhongBan.setBounds(340, 90, 160, 20);

        add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 741));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPdfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPdfActionPerformed

    private void btnExcellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcellActionPerformed

    private void btnChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiTietActionPerformed
        xuLyXemChiTiet();
    }//GEN-LAST:event_btnChiTietActionPerformed

    private void tblPhongBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhongBanMouseClicked
        xuLyThayDoiTblPhongBanVaNgay();
    }//GEN-LAST:event_tblPhongBanMouseClicked

    private void btnTaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoActionPerformed
        xuLyTao();
    }//GEN-LAST:event_btnTaoActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        lamMoiBang();
        lamMoiDong();
        doDuLieu();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        xuLyXoa();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void cmbThangItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbThangItemStateChanged
        xuLyThayDoiTblPhongBanVaNgay();
    }//GEN-LAST:event_cmbThangItemStateChanged

    private void ychNamPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ychNamPropertyChange
        xuLyThayDoiTblPhongBanVaNgay();
    }//GEN-LAST:event_ychNamPropertyChange

    private void tblPhongBanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPhongBanKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            xuLyThayDoiTblPhongBanVaNgay();
        }
    }//GEN-LAST:event_tblPhongBanKeyReleased

    private void tblLuongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLuongMouseClicked
        layDuLieuLenText();
    }//GEN-LAST:event_tblLuongMouseClicked

    private void tblLuongKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblLuongKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            layDuLieuLenText();
        }
    }//GEN-LAST:event_tblLuongKeyReleased
    private void initCommon() throws SQLException {
        ConnectDB.getInstance();
        ConnectDB.connect();
        df = new DecimalFormat("#,##0"); // Số lẻ số # để hiển thị đủ chữ số thập phân
        phongBan_Dao = new PhongBan_Dao();
        nhanVienHanhChanh_Dao = new NhanVienHanhChanh_Dao();
        chamCongHanhChanh_Dao = new ChamCongHanhChanh_Dao();
        tinhLuongHanhChanh_Dao = new TinhLuongHanhChanh_Dao();
        doDuLieu();
    }

    private void doDuLieuLuong(List<LuongHanhChanh> luongHanhChanhs) {
        int i = 1;
        for (LuongHanhChanh lhc : luongHanhChanhs) {
            Object[] object = {i, lhc.getNhanVienHanhChanh().getMaNhanVienHanhChanh(),
                lhc.getNhanVienHanhChanh().getHoVaTen(),
                lhc.getChucVu(),
                lhc.getHeSoLuong(),
                df.format(lhc.getLuongCoBan()) + "VND",
                lhc.getNgayCongThucTe(),
                lhc.getSoNgayCongChuan(),
                df.format(lhc.getTienPhuCap()) + "VND",
                df.format(lhc.getTienTangCa()) + "VND",
                df.format(lhc.getTongLuong()) + "VND"};
            i++;
            dtmLuong.addRow(object);
        }
        this.luongHanhChanhs = luongHanhChanhs;
    }

    private void doDuLieuPhongBan(List<PhongBan> phongBans) {
        int i = 1;
        for (PhongBan phongBan : phongBans) {
            Object[] object = {i, phongBan.getTenPhongBan()};
            i++;
            dtmPhongBan.addRow(object);
        }
        this.phongBans = phongBans;
    }

    private void doDuLieu() {
        doDuLieuPhongBan(phongBan_Dao.getDanhSachPhongBan());
        doDuLieuLuong(tinhLuongHanhChanh_Dao.getDanhSachLuong());
    }

    public void layDuLieuLenText() {
        // Lấy vị trí hàng được chọn trong bảng và cho dữ liệu lên textfield
        int hang = tblLuong.getSelectedRow();
        if (hang != -1) {
            lblMaNhanVien.setText((String) tblLuong.getValueAt(hang, 1));
            lblTenNhanVien.setText((String) tblLuong.getValueAt(hang, 2));
            lblChucVu.setText((String) tblLuong.getValueAt(hang, 3));
            lblHeSoLuong.setText(String.valueOf(tblLuong.getValueAt(hang, 4)));
            lblLuongCoBan.setText((String) tblLuong.getValueAt(hang, 5));
            lblNgayCongThucTe.setText(String.valueOf(tblLuong.getValueAt(hang, 6)));
            lblNgayCongChuan.setText(String.valueOf(tblLuong.getValueAt(hang, 7)));
            lblTienPhuCap.setText((String) tblLuong.getValueAt(hang, 8));
            lblTienTangCa.setText((String) tblLuong.getValueAt(hang, 9));
            lblLuongThucLanh.setText((String) tblLuong.getValueAt(hang, 10));
        }
    }

    private void setTable() {
        //setTable ở đây
        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
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
        dtmLuong = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "STT", "Mã nhân viên", "Họ và tên", "Chức vụ", "Hệ số lương", "Lương cơ bản", "Ngày công thực tế", "Số ngày công chuẩn", "Phụ cấp", "Tiền tăng ca", "Lương thực lãnh"
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
        tblLuong.setModel(dtmLuong);
        tblLuong.getColumnModel().getColumn(0).setPreferredWidth(30);
        tblLuong.getColumnModel().getColumn(1).setPreferredWidth(110);
        tblLuong.getColumnModel().getColumn(2).setPreferredWidth(130);
        tblLuong.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblLuong.getColumnModel().getColumn(4).setPreferredWidth(60);
        tblLuong.getColumnModel().getColumn(5).setPreferredWidth(100);
        tblLuong.getColumnModel().getColumn(6).setPreferredWidth(100);
        tblLuong.getColumnModel().getColumn(7).setPreferredWidth(100);
        tblLuong.getColumnModel().getColumn(8).setPreferredWidth(100);
        tblLuong.getColumnModel().getColumn(9).setPreferredWidth(80);
        tblLuong.getColumnModel().getColumn(10).setPreferredWidth(100);
        tblLuong.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));

    }

    private void xuLyThayDoiTblPhongBanVaNgay() {
        int hang = tblPhongBan.getSelectedRow();
        if (hang != -1) {
            lblPhongBan.setText(phongBans.get(hang).getTenPhongBan());
            String maPhongBan = phongBans.get(hang).getMaPhongBan();
            int thang = Integer.parseInt((String) cmbThang.getSelectedItem());
            int nam = ychNam.getValue();
            this.nhanVienHanhChanhs = nhanVienHanhChanh_Dao.getDanhSachNhanVienHanhChanhTheoPhongBan(maPhongBan);
            dtmLuong.setRowCount(0);
            lamMoiDong();
            doDuLieuLuong(tinhLuongHanhChanh_Dao.getDanhSangLuongTheoPhongBanVaThang(maPhongBan, thang + "-" + nam));
        }
    }

    private void xuLyTao() {
        int hang = tblPhongBan.getSelectedRow();
        if (hang != -1) {
            int chon = JOptionPane.showConfirmDialog(this, "Xác Nhận Tạo Bảng Lương", "Xác nhận", JOptionPane.YES_NO_OPTION);
            if (chon == JOptionPane.YES_OPTION) {
                tinhLuongNhanVien();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn phòng ban cần lập bảng lương!");
        }
    }

    private void xuLyXoa() {
        int[] chon = tblLuong.getSelectedRows();
        if (chon.length != 0) {
            if (JOptionPane.showConfirmDialog(this, "Xác Nhận Xóa Lương", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                xoaLuong(chon);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn chưa lương dòng cần xóa!");
        }
    }

    private void xuLyXemChiTiet() {
        int hang = tblLuong.getSelectedRow();
        if (hang != -1) {
            ChiTietLuongHanhChinh_GUI chiTietLuongHanhChinh_GUI = new ChiTietLuongHanhChinh_GUI(luongHanhChanhs.get(hang));
            jDesktopPane1.add(chiTietLuongHanhChinh_GUI).setVisible(true);// TODO add your handling code here:
        } else {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn nhân viên cần xem!");
        }
    }

    private void xoaLuong(int[] hang) {
        int soLuong = hang.length;
        int soDaXoa = hang.length;
        for (int i = 0; i < soLuong; i++) {
            String maLuong = luongHanhChanhs.get(hang[i]).getMaLuong();
            if (chamCongHanhChanh_Dao.capNhatChamCongXoaMaLuong(maLuong)) {
                tinhLuongHanhChanh_Dao.xoaBangLuong(maLuong);
            } else {
                JOptionPane.showMessageDialog(this, "Xóa lương mã " + maLuong + " thất bại!");
                soDaXoa--;
            }
        }
        dtmLuong.setRowCount(0);
        xuLyThayDoiTblPhongBanVaNgay();
        JOptionPane.showMessageDialog(this, "Xóa " + soDaXoa + " lương nhân viên thành công!");
    }

    private void xoaLuong(int hang) {
        String maLuong = luongHanhChanhs.get(hang).getMaLuong();
        if (chamCongHanhChanh_Dao.capNhatChamCongXoaMaLuong(maLuong)) {
            tinhLuongHanhChanh_Dao.xoaBangLuong(maLuong);
        }
    }

    private void tinhLuongNhanVien() {
        String thang = (String) cmbThang.getSelectedItem();
        int nam = ychNam.getValue();
        float tienTangCa = 0;
        int ngayCongThucTe = 0;
        float tongLuong = 0;
        int ngayCongChuan = 0;
        float tienPhuCap = 0;
        float luongCoBan = 0;
        int soNhanVien = 0;
        String maLuong;
        PhuCap_Dao phuCap_Dao = new PhuCap_Dao();
        if (kiemTraLuongTonTai()) {
            for (NhanVienHanhChanh nvhc : nhanVienHanhChanhs) {
                chamCongNhanViens = chamCongHanhChanh_Dao.getDanhSachChamCongNhanVienTheoThang(thang + "-" + nam, nvhc.getMaNhanVienHanhChanh());
                tienTangCa = tinhTienTangCa(nvhc);
                ngayCongThucTe = tinhNgayCongThucTe();
                tienPhuCap = phuCap_Dao.layTienPhuCapHc(nvhc.getMaNhanVienHanhChanh(), thang + "-" + nam);
                ngayCongChuan = tinhSoNgayThucTeTrongThang(Integer.parseInt(thang), nam);
                luongCoBan = nvhc.getLuongCoBan();
                tongLuong = tinhTongLuong(tienTangCa, luongCoBan, tienPhuCap, ngayCongChuan, ngayCongThucTe);
                maLuong = taoMaLuong(nvhc.getMaNhanVienHanhChanh());
                LuongHanhChanh luongHanhChanh = new LuongHanhChanh(maLuong, nvhc, null, thang + "-" + nam, nvhc.getChucVu(), nvhc.getHeSoLuong(), luongCoBan, ngayCongChuan, ngayCongThucTe, tienPhuCap, tienTangCa, tongLuong);
                if (tinhLuongHanhChanh_Dao.taoBangLuong(luongHanhChanh)) {
                    chamCongHanhChanh_Dao.capNhatChamCongMaLuong(maLuong, thang + "-" + nam, nvhc.getMaNhanVienHanhChanh());
                    soNhanVien++;
                }
            }
            dtmLuong.setRowCount(0);
            xuLyThayDoiTblPhongBanVaNgay();
            JOptionPane.showMessageDialog(this, soNhanVien + " Nhân viên được lập bảng lương!");
        }
    }

    private boolean kiemTraLuongTonTai() {
        if (dtmLuong.getRowCount() > 0) {
            if (JOptionPane.showConfirmDialog(this, "Đã có bảng lương cho phòng ban này, bạn có muốn tạo lại bảng lương không?", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                int soLuong = dtmLuong.getRowCount();
                for (int i = 0; i < soLuong; i++) {
                    xoaLuong(i);
                }
                return true;
            }
            return false;
        }
        return true;
    }

    private String taoMaLuong(String maNhanVien) {
        String maTam = maNhanVien.substring(maNhanVien.length() - 3);
        return maTam + (String) cmbThang.getSelectedItem() + ychNam.getValue();
    }

    int tinhSoNgayThucTeTrongThang(int thang, int nam) {
        YearMonth yearMonth = YearMonth.of(nam, thang);
        return yearMonth.lengthOfMonth();
    }

    private float tinhTienTangCa(NhanVienHanhChanh nvhc) {
        float tienLuongMotGio = nvhc.getLuongCoBan() / 24 / 8;
        float tienTangCa = 0;
        for (ChamCongNhanVien ccnv : chamCongNhanViens) {
            tienTangCa += tienLuongMotGio * 1.5 * ccnv.getGioTangCa();
        }
        return tienTangCa;
    }

    private int tinhNgayCongThucTe() {
        int ngayCong = 0;
        for (ChamCongNhanVien ccnv : chamCongNhanViens) {
            if (ccnv.getTrangThai()) {
                ngayCong++;
            }
        }
        return ngayCong;
    }

//    = (lương cơ bản + phụ cấp ( nếu có ))/số ngày công chuẩn  * số ngày công thực tế + tiền tăng ca
    private float tinhTongLuong(float tienTangCa, float luongCoBan, float tienPhuCap, int ngayCongChuan, int ngayCongThucTe) {
        return (luongCoBan + tienPhuCap) / ngayCongChuan * ngayCongThucTe + tienTangCa;
    }

    private void lamMoiDong() {
        if (tblPhongBan.getSelectedRow() == -1) {
            lblPhongBan.setText("");
        }
        lblMaNhanVien.setText("");
        lblTenNhanVien.setText("");
        lblChucVu.setText("");
        lblNgayCongChuan.setText("");
        lblNgayCongThucTe.setText("");
        lblHeSoLuong.setText("");
        lblTienPhuCap.setText("");
        lblTienTangCa.setText("");
        lblLuongCoBan.setText("");
        lblLuongThucLanh.setText("");
    }

    private void lamMoiBang() {
        dtmPhongBan.setRowCount(0);
        dtmLuong.setRowCount(0);
    }
    private DefaultTableModel dtmPhongBan;
    private DefaultTableModel dtmLuong;
    private DecimalFormat df;
    private List<PhongBan> phongBans;
    private List<NhanVienHanhChanh> nhanVienHanhChanhs;
    private List<ChamCongNhanVien> chamCongNhanViens;
    private NhanVienHanhChanh_Dao nhanVienHanhChanh_Dao;
    private List<LuongHanhChanh> luongHanhChanhs;
    private PhongBan_Dao phongBan_Dao;
    private ChamCongHanhChanh_Dao chamCongHanhChanh_Dao;
    private TinhLuongHanhChanh_Dao tinhLuongHanhChanh_Dao;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChiTiet;
    private javax.swing.JButton btnExcell;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnPdf;
    private javax.swing.JButton btnTao;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cmbThang;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblChucVu;
    private javax.swing.JLabel lblHeSoLuong;
    private javax.swing.JLabel lblLuongCoBan;
    private javax.swing.JLabel lblLuongThucLanh;
    private javax.swing.JLabel lblMaNhanVien;
    private javax.swing.JLabel lblNgayCongChuan;
    private javax.swing.JLabel lblNgayCongThucTe;
    private javax.swing.JLabel lblPhongBan;
    private javax.swing.JLabel lblTenNhanVien;
    private javax.swing.JLabel lblTienPhuCap;
    private javax.swing.JLabel lblTienTangCa;
    private javax.swing.JTable tblLuong;
    private javax.swing.JTable tblPhongBan;
    private com.toedter.calendar.JYearChooser ychNam;
    // End of variables declaration//GEN-END:variables
}
