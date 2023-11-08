package gui;

import connect.ConnectDB;
import dao.ChamCongSanPham_Dao;
import dao.CongDoan_Dao;
import dao.PhanXuong_Dao;
import dao.SanPham_Dao;
import entity.ChamCongSanPham;
import entity.PhanXuong;
import entity.SanPham;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class ChamCongSanPham_GUI extends javax.swing.JPanel {

    /**
     * Creates new form ChamCongHanhChinh
     */
    public ChamCongSanPham_GUI() throws SQLException {
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
        tblPhanXuong = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblChamCong = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        dchNgayChamCong = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblMaNhanVien = new javax.swing.JLabel();
        lblPhanXuong = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblSanPham = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lblCongDoan = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lblTienLuong = new javax.swing.JLabel();
        lblDonGia = new javax.swing.JLabel();
        btnXoa = new javax.swing.JButton();
        btnCham = new javax.swing.JButton();
        btnXuat = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        lblTongLuongPx = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblTenNhanVien = new javax.swing.JLabel();
        lblThongBao = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1200, 674));
        setPreferredSize(new java.awt.Dimension(1200, 674));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 96, 59)));

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
        jScrollPane3.setViewportView(tblPhanXuong);

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

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 1090, 480));

        jScrollPane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 96, 59)));

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblSanPham.setToolTipText("");
        tblSanPham.setSelectionBackground(new java.awt.Color(144, 237, 144));
        tblSanPham.setSelectionForeground(new java.awt.Color(51, 51, 51));
        tblSanPham.getTableHeader().setReorderingAllowed(false);
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        tblSanPham.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblSanPhamKeyReleased(evt);
            }
        });
        jScrollPane5.setViewportView(tblSanPham);

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 397));

        dchNgayChamCong.setBackground(new java.awt.Color(255, 255, 255));
        dchNgayChamCong.setForeground(new java.awt.Color(0, 96, 0));
        dchNgayChamCong.setDateFormatString("dd/MM/yyyy");
        dchNgayChamCong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dchNgayChamCong.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dchNgayChamCongPropertyChange(evt);
            }
        });
        add(dchNgayChamCong, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 170, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Chấm Công Sản Phẩm");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 1300, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Tiền Lương:");
        jLabel15.setToolTipText("");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 100, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Phân Xưởng:");
        jLabel17.setToolTipText("");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 110, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Ngày Làm Việc:");
        jLabel18.setToolTipText("");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 130, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Tên Nhân Viên:");
        jLabel19.setToolTipText("");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 130, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Mã Nhân Viên:");
        jLabel20.setToolTipText("");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 130, -1));

        lblMaNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMaNhanVien.setForeground(new java.awt.Color(0, 99, 0));
        lblMaNhanVien.setToolTipText("");
        add(lblMaNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 170, 20));

        lblPhanXuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPhanXuong.setForeground(new java.awt.Color(0, 99, 0));
        lblPhanXuong.setToolTipText("");
        add(lblPhanXuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 170, 20));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Sản Phẩm:");
        jLabel21.setToolTipText("");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 90, -1));

        lblSanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSanPham.setForeground(new java.awt.Color(0, 99, 0));
        lblSanPham.setToolTipText("");
        add(lblSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, 170, 20));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Công Đoạn:");
        jLabel22.setToolTipText("");
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 90, -1));

        lblCongDoan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCongDoan.setForeground(new java.awt.Color(0, 99, 0));
        lblCongDoan.setToolTipText("");
        add(lblCongDoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 170, 20));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setText("Số Lượng:");
        jLabel27.setToolTipText("");
        add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 90, -1));

        lblTienLuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTienLuong.setForeground(new java.awt.Color(0, 99, 0));
        lblTienLuong.setToolTipText("");
        add(lblTienLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 130, 20));

        lblDonGia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDonGia.setForeground(new java.awt.Color(0, 99, 0));
        lblDonGia.setToolTipText("");
        add(lblDonGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, 130, 20));

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
        add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 220, 90, 30));

        btnCham.setBackground(new java.awt.Color(152, 249, 152));
        btnCham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/plus.png"))); // NOI18N
        btnCham.setText("Chấm Công");
        btnCham.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCham.setDisabledIcon(null);
        btnCham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChamActionPerformed(evt);
            }
        });
        add(btnCham, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 220, 140, 30));

        btnXuat.setBackground(new java.awt.Color(152, 249, 152));
        btnXuat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXuat.setText("Xuất Bảng Chấm Công");
        btnXuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatActionPerformed(evt);
            }
        });
        add(btnXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 180, 180, 30));

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
        add(btnLamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(1025, 220, 120, 30));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setText("Đơn Giá:");
        jLabel30.setToolTipText("");
        add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 90, -1));

        txtSoLuong.setEditable(false);
        txtSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSoLuong.setForeground(new java.awt.Color(0, 96, 0));
        txtSoLuong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSoLuongKeyPressed(evt);
            }
        });
        add(txtSoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, 80, -1));

        lblTongLuongPx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTongLuongPx.setForeground(new java.awt.Color(0, 99, 0));
        lblTongLuongPx.setToolTipText("");
        add(lblTongLuongPx, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, 140, 20));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Tổng Lương Phân Xưởng:");
        jLabel16.setToolTipText("");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 180, -1));

        lblTenNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTenNhanVien.setForeground(new java.awt.Color(0, 99, 0));
        lblTenNhanVien.setToolTipText("");
        add(lblTenNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 170, 20));

        lblThongBao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblThongBao.setForeground(new java.awt.Color(255, 0, 0));
        lblThongBao.setToolTipText("");
        add(lblThongBao, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 140, 350, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXuatActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        if (lamMoiBtn()) {
            lamMoiDong();
            lamMoiBang();
            doDuLieu();
        }
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        xuLyThayDoiTblPxSp();
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void tblPhanXuongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhanXuongMouseClicked
        xuLyThayDoiTblPxSp();
    }//GEN-LAST:event_tblPhanXuongMouseClicked

    private void dchNgayChamCongPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dchNgayChamCongPropertyChange
        xuLyThayDoiNgayCham();
    }//GEN-LAST:event_dchNgayChamCongPropertyChange

    private void tblChamCongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChamCongMouseClicked
        layDuLieuLenText();
    }//GEN-LAST:event_tblChamCongMouseClicked

    private void tblChamCongKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblChamCongKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            layDuLieuLenText();
        }
    }//GEN-LAST:event_tblChamCongKeyReleased

    private void tblSanPhamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblSanPhamKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            xuLyThayDoiTblPxSp();
        }
    }//GEN-LAST:event_tblSanPhamKeyReleased

    private void tblPhanXuongKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPhanXuongKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            xuLyThayDoiTblPxSp();
        }
    }//GEN-LAST:event_tblPhanXuongKeyReleased

    private void btnChamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChamActionPerformed
        xuLyChamCong();
    }//GEN-LAST:event_btnChamActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        xuLyXoa();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void txtSoLuongKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoLuongKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnCham.doClick();
        }
    }//GEN-LAST:event_txtSoLuongKeyPressed
    private void initCommon() throws SQLException {
        ConnectDB.getInstance();
        ConnectDB.connect();
        df = new DecimalFormat("#,##0"); // Số lẻ số # để hiển thị đủ chữ số thập phân
        dinhDangNgay = new SimpleDateFormat("dd/MM/yyyy");
        chamCongSanPham_Dao = new ChamCongSanPham_Dao();
        sanPham_Dao = new SanPham_Dao();
        phanXuong_Dao = new PhanXuong_Dao();
        layNgayHienTai();
        doDuLieu();
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

    private void doDuLieuSanPham(List<SanPham> sanPhams) {
        int i = 1;
        for (SanPham sanPham : sanPhams) {
            Object[] object = {i, sanPham.getTenSanPham()};
            i++;
            dtmSanPham.addRow(object);
        }
        this.sanPhams = sanPhams;
    }

    private void doDuLieuChamCong(List<ChamCongSanPham> chamCongSanPhams) {
        int i = 1;
        for (ChamCongSanPham chamCongSanPham : chamCongSanPhams) {
            Object[] object = {i, chamCongSanPham.getNhanVienSanXuat().getPhanXuong().getTenPhanXuong(),
                chamCongSanPham.getNhanVienSanXuat().getHoVaTen(),
                chamCongSanPham.getNhanVienSanXuat().getMaNhanVienSanXuat(),
                dinhDangNgay.format(chamCongSanPham.getNgayLamViec()),
                chamCongSanPham.getSanPham().getTenSanPham(),
                chamCongSanPham.getCongDoan().getTenCongDoan(),
                df.format(chamCongSanPham.getDonGia()) + "VND",
                chamCongSanPham.getSoLuong(),
                df.format(chamCongSanPham.getTongTien()) + "VND"
            };
            i++;
            dtmChamCong.addRow(object);
        }
        this.chamCongSanPhams = chamCongSanPhams;
    }

    private void doDuLieu() {
        doDuLieuPhanXuong(phanXuong_Dao.getDanhSachPhanXuong());
        doDuLieuSanPham(sanPham_Dao.getDanhSachSanPham());
        doDuLieuChamCong(chamCongSanPham_Dao.getChamCongSanPhamTheoNgay(dchNgayChamCong.getDate()));
    }

    public void layDuLieuLenText() {
        // Lấy vị trí hàng được chọn trong bảng và cho dữ liệu lên textfield
        int hang = tblChamCong.getSelectedRow();
        if (hang != -1) {
            lblPhanXuong.setText((String) tblChamCong.getValueAt(hang, 1));
            lblTenNhanVien.setText((String) tblChamCong.getValueAt(hang, 2));
            lblMaNhanVien.setText((String) tblChamCong.getValueAt(hang, 3));
            lblSanPham.setText((String) tblChamCong.getValueAt(hang, 5));
            lblCongDoan.setText((String) tblChamCong.getValueAt(hang, 6));
            lblDonGia.setText((String)tblChamCong.getValueAt(hang, 7));
            txtSoLuong.setText(String.valueOf(tblChamCong.getValueAt(hang, 8)));
            lblTienLuong.setText((String)tblChamCong.getValueAt(hang, 9));
        }
    }

    private void setTable() {
        //setTable ở đây
        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        dtmSanPham = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "STT", "Sản phẩm"
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
        tblSanPham.setModel(dtmSanPham);
        tblSanPham.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblSanPham.getColumnModel().getColumn(1).setPreferredWidth(174);
        tblSanPham.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));
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
        dtmChamCong = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "STT", "Phân xưởng", "Họ và tên", "Mã nhân viên", "Ngày làm", "Sản phẩm", "Công đoạn", "Đơn giá", "Số lượng", "Tiền lương"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class

            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false, false, false
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
        tblChamCong.getColumnModel().getColumn(0).setPreferredWidth(40);
        tblChamCong.getColumnModel().getColumn(1).setPreferredWidth(110);
        tblChamCong.getColumnModel().getColumn(2).setPreferredWidth(130);
        tblChamCong.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblChamCong.getColumnModel().getColumn(4).setPreferredWidth(100);
        tblChamCong.getColumnModel().getColumn(5).setPreferredWidth(130);
        tblChamCong.getColumnModel().getColumn(6).setPreferredWidth(130);
        tblChamCong.getColumnModel().getColumn(7).setPreferredWidth(100);
        tblChamCong.getColumnModel().getColumn(8).setPreferredWidth(60);
        tblChamCong.getColumnModel().getColumn(9).setPreferredWidth(100);

        tblChamCong.getColumnModel().getColumn(3).setCellRenderer(center);
        tblChamCong.getColumnModel().getColumn(4).setCellRenderer(center);
        tblChamCong.getColumnModel().getColumn(8).setCellRenderer(center);
        tblChamCong.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));
    }

    private boolean chamCongSanPham() {
        int i = JOptionPane.showConfirmDialog(this, "Xác Nhận Chấm Công", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (i == JOptionPane.YES_OPTION) {
            int[] soNhanVienChams = tblChamCong.getSelectedRows();
            int soNhanVien = soNhanVienChams.length;
            int soLuongDuocCham = soNhanVienChams.length;
            float tinhLuong;
            int soLuong = Integer.parseInt(txtSoLuong.getText());
            for (int j = 0; j < soNhanVien; j++) {
                tinhLuong = soLuong * chamCongSanPhams.get(soNhanVienChams[j]).getDonGia();
                if (!chamCongSanPham_Dao.chamCongSanPham(chamCongSanPhams.get(soNhanVienChams[j]).getMaCongSanPham(),
                        soLuong, tinhLuong)) {
                    soLuongDuocCham--;
                }
                capNhatTienDo(soNhanVienChams[j], soLuong);
            }
            JOptionPane.showMessageDialog(this, soLuongDuocCham + " Nhân viên được chấm công");
            return true;
        }
        return false;
    }

    private void capNhatTienDo(int viTri, int soLuong) {
        CongDoan_Dao congDoan_Dao = new CongDoan_Dao();
        String maCongDoan = chamCongSanPhams.get(viTri).getCongDoan().getMaCongDoan();
        int tienDoHienTai = congDoan_Dao.layTienDo(maCongDoan);
        int tienDoCham = soLuong;
        int tienDoNhanVien = chamCongSanPhams.get(viTri).getSoLuong();
        if (tienDoCham <= tienDoNhanVien) {
            int tienDoMoi = tienDoNhanVien - tienDoCham;
            congDoan_Dao.capNhatTienDo(maCongDoan, tienDoHienTai - tienDoMoi);
        } else {
            int tienDoMoi = tienDoCham - tienDoNhanVien;
            congDoan_Dao.capNhatTienDo(maCongDoan, tienDoHienTai + tienDoMoi);
        }
    }

    private boolean xoaChamCong(int[] hang) {
        int soNhanVien = hang.length;
        for (int i = 0; i < soNhanVien; i++) {
            String maChamCong = chamCongSanPhams.get(hang[i]).getMaCongSanPham();
            if (!chamCongSanPham_Dao.xoaChamCong(maChamCong)) {
                JOptionPane.showConfirmDialog(this, "Xóa chấm công thất bại số " + hang[i]);
                return false;
            }
        }
        return true;
    }

    private void xuLyChamCong() {
        if (btnCham.getText().equalsIgnoreCase("Chấm Công")) {
            btnCham.setText("Xác Nhận");
            btnXoa.setEnabled(false);
            btnXuat.setEnabled(false);
            txtSoLuong.setEditable(true);
            lamMoiDong();
        } else {
            if (kiemTraNgay()) {
                if (chamCongSanPham()) {
                    dtmChamCong.setRowCount(0);
                    doDuLieuChamCong(chamCongSanPham_Dao.getChamCongSanPhamTheoNgay(dchNgayChamCong.getDate()));
                    txtSoLuong.setEditable(false);
                    btnXoa.setEnabled(true);
                    btnXuat.setEnabled(true);
                    btnCham.setText("Chấm Công");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Sai định dạng");
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
                doDuLieuChamCong(chamCongSanPham_Dao.getChamCongSanPhamTheoNgay(dchNgayChamCong.getDate()));
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn dòng cần xóa!");
        }
    }

    private void xuLyThayDoiTblPxSp() {
        int hangPx = tblPhanXuong.getSelectedRow();
        int hangSp = tblSanPham.getSelectedRow();
        dtmChamCong.setRowCount(0);
        if (kiemTraNgay()) {
            if (hangPx != -1 && hangSp != -1) {
                doDuLieuChamCong(chamCongSanPham_Dao.getChamCongSanPhamTheoPxSp(sanPhams.get(hangSp).getMaSanPham(),
                        phanXuongs.get(hangPx).getMaPhanXuong(), dchNgayChamCong.getDate()));
            } else if (hangPx != -1) {
                doDuLieuChamCong(chamCongSanPham_Dao.getChamCongSanPhamTheoPhanXuong(phanXuongs.get(hangPx).getMaPhanXuong(), dchNgayChamCong.getDate()));
            } else if (hangSp != -1) {
                doDuLieuChamCong(chamCongSanPham_Dao.getChamCongSanPhamTheoSanPham(sanPhams.get(hangSp).getMaSanPham(), dchNgayChamCong.getDate()));
            }
        }
    }

    private boolean kiemTraNgay() {
        if (!KiemTraChuoi.ktDateFormat(dinhDangNgay.format(dchNgayChamCong.getDate()))) {
            lblThongBao.setText("* Sai định dạng ngày dd/mm/yyyy");
            return false;
        } else if (!KiemTraChuoi.ktTruocHoacBangNgayHT(dinhDangNgay.format(dchNgayChamCong.getDate()))) {
            lblThongBao.setText("* Ngày chấm không được sau ngày hiện tại");
            return false;
        }
        lblThongBao.setText("");
        return true;
    }

    private void xuLyThayDoiNgayCham() {
        if (kiemTraNgay()) {
            dtmChamCong.setRowCount(0);
            doDuLieuChamCong(chamCongSanPham_Dao.getChamCongSanPhamTheoNgay(dchNgayChamCong.getDate()));
        }
    }

    private void layNgayHienTai() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        dchNgayChamCong.setDate(calendar.getTime());
    }

    private void lamMoiDong() {
        layNgayHienTai();
        lblPhanXuong.setText("");
        lblSanPham.setText("");
        lblMaNhanVien.setText("");
        lblTenNhanVien.setText("");
        lblTienLuong.setText("");
        lblCongDoan.setText("");
        lblDonGia.setText("");
        txtSoLuong.setText("");
    }

    private void lamMoiBang() {
        dtmSanPham.setRowCount(0);
        dtmPhanXuong.setRowCount(0);
        dtmChamCong.setRowCount(0);
    }

    public boolean lamMoiBtn() {
        if (btnCham.getText().equalsIgnoreCase("Xác Nhận")) {
            int i = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát khỏi chỉnh sửa không", "Xác nhận", JOptionPane.YES_NO_OPTION);
            if (i == JOptionPane.YES_OPTION) {
                btnCham.setEnabled(true);
                btnXuat.setEnabled(true);
                btnXoa.setEnabled(true);
                btnCham.setText("Chấm Công");
                txtSoLuong.setEditable(false);
                return true;
            }
            return false;
        }
        return true;
    }

    private DefaultTableModel dtmPhanXuong;
    private DefaultTableModel dtmSanPham;
    private DefaultTableModel dtmChamCong;
    private SimpleDateFormat dinhDangNgay;
    private DecimalFormat df;
    private List<ChamCongSanPham> chamCongSanPhams;
    private List<SanPham> sanPhams;
    private List<PhanXuong> phanXuongs;
    private ChamCongSanPham_Dao chamCongSanPham_Dao;
    private SanPham_Dao sanPham_Dao;
    private PhanXuong_Dao phanXuong_Dao;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCham;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXuat;
    private com.toedter.calendar.JDateChooser dchNgayChamCong;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblCongDoan;
    private javax.swing.JLabel lblDonGia;
    private javax.swing.JLabel lblMaNhanVien;
    private javax.swing.JLabel lblPhanXuong;
    private javax.swing.JLabel lblSanPham;
    private javax.swing.JLabel lblTenNhanVien;
    private javax.swing.JLabel lblThongBao;
    private javax.swing.JLabel lblTienLuong;
    private javax.swing.JLabel lblTongLuongPx;
    private javax.swing.JTable tblChamCong;
    private javax.swing.JTable tblPhanXuong;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtSoLuong;
    // End of variables declaration//GEN-END:variables
}
