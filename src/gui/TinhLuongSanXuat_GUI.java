package gui;

import connect.ConnectDB;
import dao.ChamCongSanPham_Dao;
import dao.NhanVienSanXuat_Dao;
import dao.PhanXuong_Dao;
import dao.PhuCap_Dao;
import dao.TinhLuongCongNhan_Dao;
import entity.ChamCongSanPham;
import entity.LuongCongNhan;
import entity.NhanVienSanXuat;
import entity.PhanXuong;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JOptionPane;
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
    public TinhLuongSanXuat_GUI() throws SQLException {
        initComponents();
        setTable();
        initCommon();;
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
        btnLamMoi = new javax.swing.JButton();
        lblPhanXuong = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnXuatExcell = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnXoa = new javax.swing.JButton();
        btnChiTiet = new javax.swing.JButton();
        btnTao = new javax.swing.JButton();
        btnXuatPdf = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblPhanXuong = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblLuong = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblTenNhanVien = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblTienPhuCap = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblLuongSanPham = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lblLuongThucLanh = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        cmbThang = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        ychNam = new com.toedter.calendar.JYearChooser();
        lblMaNhanVien = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1200, 674));
        setPreferredSize(new java.awt.Dimension(1366, 741));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setBackground(new java.awt.Color(242, 242, 242));
        jDesktopPane1.setOpaque(false);

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

        lblPhanXuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPhanXuong.setForeground(new java.awt.Color(0, 99, 0));
        lblPhanXuong.setToolTipText("");
        jDesktopPane1.add(lblPhanXuong);
        lblPhanXuong.setBounds(340, 90, 170, 20);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Mã Nhân Viên:");
        jLabel17.setToolTipText("");
        jDesktopPane1.add(jLabel17);
        jLabel17.setBounds(220, 130, 120, 20);

        btnXuatExcell.setBackground(new java.awt.Color(152, 249, 152));
        btnXuatExcell.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXuatExcell.setText("Xuất Excell");
        btnXuatExcell.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXuatExcell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatExcellActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnXuatExcell);
        btnXuatExcell.setBounds(1180, 170, 110, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Bảng Lương Nhân Viên Sản Xuất");
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(4, 0, 1300, 40);

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

        btnXuatPdf.setBackground(new java.awt.Color(152, 249, 152));
        btnXuatPdf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXuatPdf.setText("Xuất Pdf");
        btnXuatPdf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXuatPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatPdfActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnXuatPdf);
        btnXuatPdf.setBounds(1070, 170, 100, 30);

        jScrollPane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 96, 59)));

        tblPhanXuong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblPhanXuong.setToolTipText("");
        tblPhanXuong.setSelectionBackground(new java.awt.Color(144, 237, 144));
        tblPhanXuong.setSelectionForeground(new java.awt.Color(51, 51, 51));
        tblPhanXuong.getTableHeader().setReorderingAllowed(false);
        tblPhanXuong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhanXuongMouseClicked(evt);
            }
        });
        tblPhanXuong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblPhanXuongKeyReleased(evt);
            }
        });
        jScrollPane5.setViewportView(tblPhanXuong);

        jDesktopPane1.add(jScrollPane5);
        jScrollPane5.setBounds(0, 0, 190, 240);

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

        lblTenNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTenNhanVien.setForeground(new java.awt.Color(0, 99, 0));
        lblTenNhanVien.setToolTipText("");
        jDesktopPane1.add(lblTenNhanVien);
        lblTenNhanVien.setBounds(340, 170, 170, 20);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Tiền Phụ Cấp:");
        jLabel20.setToolTipText("");
        jDesktopPane1.add(jLabel20);
        jLabel20.setBounds(550, 170, 120, 20);

        lblTienPhuCap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTienPhuCap.setForeground(new java.awt.Color(0, 99, 0));
        lblTienPhuCap.setToolTipText("");
        jDesktopPane1.add(lblTienPhuCap);
        lblTienPhuCap.setBounds(680, 170, 170, 20);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Lương Sản Phẩm:");
        jLabel21.setToolTipText("");
        jDesktopPane1.add(jLabel21);
        jLabel21.setBounds(550, 130, 120, 20);

        lblLuongSanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLuongSanPham.setForeground(new java.awt.Color(0, 99, 0));
        lblLuongSanPham.setToolTipText("");
        jDesktopPane1.add(lblLuongSanPham);
        lblLuongSanPham.setBounds(680, 130, 170, 20);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Lương Thực Lãnh:");
        jLabel22.setToolTipText("");
        jDesktopPane1.add(jLabel22);
        jLabel22.setBounds(220, 210, 130, 20);

        lblLuongThucLanh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLuongThucLanh.setForeground(new java.awt.Color(0, 99, 0));
        lblLuongThucLanh.setToolTipText("");
        jDesktopPane1.add(lblLuongThucLanh);
        lblLuongThucLanh.setBounds(350, 210, 180, 20);

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setText("Tháng:");
        jLabel28.setToolTipText("");
        jDesktopPane1.add(jLabel28);
        jLabel28.setBounds(220, 50, 60, 20);

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

        lblMaNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMaNhanVien.setForeground(new java.awt.Color(0, 99, 0));
        lblMaNhanVien.setToolTipText("");
        jDesktopPane1.add(lblMaNhanVien);
        lblMaNhanVien.setBounds(340, 130, 170, 20);

        add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 741));
    }// </editor-fold>//GEN-END:initComponents

    private void btnXuatPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatPdfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXuatPdfActionPerformed

    private void btnXuatExcellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatExcellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXuatExcellActionPerformed

    private void btnChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiTietActionPerformed
        xuLyXemChiTiet();
    }//GEN-LAST:event_btnChiTietActionPerformed

    private void btnTaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoActionPerformed
        xuLyTao();
    }//GEN-LAST:event_btnTaoActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        xuLyXoa();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        lamMoiBang();
        lamMoiDong();
        doDuLieu();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void cmbThangItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbThangItemStateChanged
        xuLyThayDoiTblPhanXuongVaNgay();
    }//GEN-LAST:event_cmbThangItemStateChanged

    private void ychNamPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ychNamPropertyChange
        xuLyThayDoiTblPhanXuongVaNgay();
    }//GEN-LAST:event_ychNamPropertyChange

    private void tblPhanXuongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhanXuongMouseClicked
        xuLyThayDoiTblPhanXuongVaNgay();
    }//GEN-LAST:event_tblPhanXuongMouseClicked

    private void tblPhanXuongKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPhanXuongKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            xuLyThayDoiTblPhanXuongVaNgay();
        }
    }//GEN-LAST:event_tblPhanXuongKeyReleased

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
        phanXuong_Dao = new PhanXuong_Dao();
        nhanVienSanXuat_Dao = new NhanVienSanXuat_Dao();
        chamCongSanPham_Dao = new ChamCongSanPham_Dao();
        tinhLuongCongNhan_Dao = new TinhLuongCongNhan_Dao();
        doDuLieu();
    }

    private void doDuLieuLuong(List<LuongCongNhan> luongCongNhans) {
        int i = 1;
        for (LuongCongNhan lcn : luongCongNhans) {
            Object[] object = {i, lcn.getNhanVienSanXuat().getMaNhanVienSanXuat(),
                lcn.getNhanVienSanXuat().getHoVaTen(),
                df.format(lcn.getTongLuongSanPham()) + "VND",
                df.format(lcn.getTienPhuCap()) + "VND",
                df.format(lcn.getTongLuong()) + "VND"};
            i++;
            dtmLuong.addRow(object);
        }
        this.luongCongNhans = luongCongNhans;
    }

    private void doDuLieuPhanXuong(List<PhanXuong> phanXuongs) {
        int i = 1;
        for (PhanXuong phanXuong : phanXuongs) {
            Object[] object = {i, phanXuong.getTenPhanXuong()};
            i++;
            dtmPhanXuong.addRow(object);
        }
        this.phanXuongs = phanXuongs;
    }

    private void doDuLieu() {
        doDuLieuPhanXuong(phanXuong_Dao.getDanhSachPhanXuong());
        doDuLieuLuong(tinhLuongCongNhan_Dao.getDanhSachLuong());
    }

    public void layDuLieuLenText() {
        // Lấy vị trí hàng được chọn trong bảng và cho dữ liệu lên textfield
        int hang = tblLuong.getSelectedRow();
        if (hang != -1) {
            lblMaNhanVien.setText((String) tblLuong.getValueAt(hang, 1));
            lblTenNhanVien.setText((String) tblLuong.getValueAt(hang, 2));
            lblLuongSanPham.setText((String) tblLuong.getValueAt(hang, 3));
            lblTienPhuCap.setText((String) tblLuong.getValueAt(hang, 4));
            lblLuongThucLanh.setText((String) tblLuong.getValueAt(hang, 5));
        }
    }

    private void setTable() {
        //setTable ở đây
        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        //set table don vi
        dtmPhanXuong = new DefaultTableModel(
                new Object[][]{},
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
        tblPhanXuong.setModel(dtmPhanXuong);
        tblPhanXuong.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblPhanXuong.getColumnModel().getColumn(1).setPreferredWidth(174);
        tblPhanXuong.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));
        //table chấm công
        dtmLuong = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "STT", "Mã nhân viên", "Họ và tên", "Tổng lương theo sản phẩm",
                    "Phụ cấp",
                    "Lương thực lãnh"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,};
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false,};

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
        tblLuong.getColumnModel().getColumn(0).setPreferredWidth(5);
        tblLuong.getColumnModel().getColumn(1).setPreferredWidth(40);
        tblLuong.getColumnModel().getColumn(2).setPreferredWidth(130);
        tblLuong.getColumnModel().getColumn(3).setPreferredWidth(130);
        tblLuong.getColumnModel().getColumn(4).setPreferredWidth(130);
        tblLuong.getColumnModel().getColumn(5).setPreferredWidth(130);

        tblLuong.getColumnModel().getColumn(0).setCellRenderer(center);
        tblLuong.getColumnModel().getColumn(1).setCellRenderer(center);
        tblLuong.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));
    }

    private void xuLyThayDoiTblPhanXuongVaNgay() {
        int hang = tblPhanXuong.getSelectedRow();
        if (hang != -1) {
            lblPhanXuong.setText(phanXuongs.get(hang).getTenPhanXuong());
            String maPhanXuong = phanXuongs.get(hang).getMaPhanXuong();
            int thang = Integer.parseInt((String) cmbThang.getSelectedItem());
            int nam = ychNam.getValue();
            this.nhanVienSanXuats = nhanVienSanXuat_Dao.getDanhSachNhanVienSanXuatTheoPhanXuong(maPhanXuong);
            dtmLuong.setRowCount(0);
            lamMoiDong();
            doDuLieuLuong(tinhLuongCongNhan_Dao.getDanhSachLuongTheoPhanXuongVaThang(maPhanXuong, thang + "-" + nam));
        }
    }

    private void xuLyXemChiTiet() {
        int hang = tblLuong.getSelectedRow();
        if (hang != -1) {
            ChiTietLuongCongNhan_GUI chiTietLuongCongNhan_GUI = new ChiTietLuongCongNhan_GUI(luongCongNhans.get(hang));
            jDesktopPane1.add(chiTietLuongCongNhan_GUI).setVisible(true);// TODO add your handling code here:
        } else {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn nhân viên cần xem!");
        }
    }

    private void xuLyTao() {
        int hang = tblPhanXuong.getSelectedRow();
        if (hang != -1) {
            int chon = JOptionPane.showConfirmDialog(this, "Xác Nhận Tạo Bảng Lương", "Xác nhận", JOptionPane.YES_NO_OPTION);
            if (chon == JOptionPane.YES_OPTION) {
                tinhLuongNhanVien();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn phân xưởng cần lập bảng lương!");
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

    private void xoaLuong(int[] hang) {
        int soLuong = hang.length;
        int soDaXoa = hang.length;
        for (int i = 0; i < soLuong; i++) {
            String maLuong = luongCongNhans.get(hang[i]).getMaLuong();
            if (chamCongSanPham_Dao.capNhatChamCongXoaMaLuong(maLuong)) {
                tinhLuongCongNhan_Dao.xoaBangLuong(maLuong);
            } else {
                JOptionPane.showMessageDialog(this, "Xóa lương mã " + maLuong + " thất bại!");
                soDaXoa--;
            }
        }
        dtmLuong.setRowCount(0);
        xuLyThayDoiTblPhanXuongVaNgay();
        JOptionPane.showMessageDialog(this, "Xóa " + soDaXoa + " lương nhân viên thành công!");
    }

    private void xoaLuong(int hang) {
        String maLuong = luongCongNhans.get(hang).getMaLuong();
        if (chamCongSanPham_Dao.capNhatChamCongXoaMaLuong(maLuong)) {
            tinhLuongCongNhan_Dao.xoaBangLuong(maLuong);
        }
    }

    private void tinhLuongNhanVien() {
        int thang = Integer.parseInt((String) cmbThang.getSelectedItem());
        int nam = ychNam.getValue();
        float tienLuongSanPham = 0;
        float tienPhuCap = 0;
        String maLuong;
        float tongLuong = 0;
        int soNhanVien = 0;
        PhuCap_Dao phuCap_Dao = new PhuCap_Dao();
        if (kiemTraLuongTonTai()) {
            for (NhanVienSanXuat nvsx : nhanVienSanXuats) {
                chamCongSanPhams = chamCongSanPham_Dao.getChamCongSanPhamTheoThang(thang + "-" + nam, nvsx.getMaNhanVienSanXuat());
                tienLuongSanPham = tinhLuongSanPham();
                tienPhuCap = phuCap_Dao.layTienPhuCapSx(nvsx.getMaNhanVienSanXuat(), thang + "-" + nam);
                tongLuong = tinhTongLuong(tienPhuCap, tienLuongSanPham);
                maLuong = taoMaLuong(nvsx.getMaNhanVienSanXuat());
                LuongCongNhan luongCongNhan = new LuongCongNhan(maLuong, nvsx, thang + "-" + nam, null, tienLuongSanPham, tienPhuCap, tongLuong);
                if (tinhLuongCongNhan_Dao.taoBangLuong(luongCongNhan)) {
                    chamCongSanPham_Dao.capNhatChamCongMaLuong(maLuong, thang + "-" + nam, nvsx.getMaNhanVienSanXuat());
                    soNhanVien++;
                }
            }
            dtmLuong.setRowCount(0);
            xuLyThayDoiTblPhanXuongVaNgay();
            JOptionPane.showMessageDialog(this, soNhanVien + " Nhân viên được lập bảng lương!");
        }
    }

    private boolean kiemTraLuongTonTai() {
        if (dtmLuong.getRowCount() > 0) {
            if (JOptionPane.showConfirmDialog(this, "Đã có bảng lương cho phân xưởng này, bạn có muốn tạo lại bảng lương không?", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
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

    private float tinhLuongSanPham() {
        float tienLuong = 0;
        for (ChamCongSanPham ccsp : chamCongSanPhams) {
            tienLuong += ccsp.getTongTien();
        }
        return tienLuong;
    }

    private float tinhTongLuong(float tienPhuCap, float tienLuongSanPham) {
        return tienPhuCap + tienLuongSanPham;
    }

    private void lamMoiDong() {
        if (tblPhanXuong.getSelectedRow() == -1) {
            lblPhanXuong.setText("");
        }
        lblMaNhanVien.setText("");
        lblTenNhanVien.setText("");
        lblTienPhuCap.setText("");
        lblLuongThucLanh.setText("");
        lblLuongSanPham.setText("");
    }

    private void lamMoiBang() {
        dtmPhanXuong.setRowCount(0);
        dtmLuong.setRowCount(0);
    }
    private DefaultTableModel dtmPhanXuong;
    private DefaultTableModel dtmLuong;
    private DecimalFormat df;
    private List<PhanXuong> phanXuongs;
    private List<NhanVienSanXuat> nhanVienSanXuats;
    private List<ChamCongSanPham> chamCongSanPhams;
    private NhanVienSanXuat_Dao nhanVienSanXuat_Dao;
    private List<LuongCongNhan> luongCongNhans;
    private PhanXuong_Dao phanXuong_Dao;
    private ChamCongSanPham_Dao chamCongSanPham_Dao;
    private TinhLuongCongNhan_Dao tinhLuongCongNhan_Dao;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChiTiet;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnTao;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXuatExcell;
    private javax.swing.JButton btnXuatPdf;
    private javax.swing.JComboBox<String> cmbThang;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblLuongSanPham;
    private javax.swing.JLabel lblLuongThucLanh;
    private javax.swing.JLabel lblMaNhanVien;
    private javax.swing.JLabel lblPhanXuong;
    private javax.swing.JLabel lblTenNhanVien;
    private javax.swing.JLabel lblTienPhuCap;
    private javax.swing.JTable tblLuong;
    private javax.swing.JTable tblPhanXuong;
    private com.toedter.calendar.JYearChooser ychNam;
    // End of variables declaration//GEN-END:variables
}
