package gui;

import connect.ConnectDB;
import dao.CongDoan_Dao;
import dao.HopDong_Dao;
import dao.SanPham_Dao;
import entity.HopDongSanXuat;
import entity.SanPham;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class SanPham_GUI extends javax.swing.JPanel {

    /**
     * Creates new form ChamCongHanhChinh
     */
    public SanPham_GUI() throws SQLException {
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
        btnThem = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnChiTiet = new javax.swing.JButton();
        txtSoLuong = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtHopDong = new javax.swing.JTextField();
        txtMaSanPham = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        txtTenSanPham = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtDonViTinh = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
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
        tblHopDong.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblHopDong.setSelectionBackground(new java.awt.Color(144, 237, 144));
        tblHopDong.setSelectionForeground(new java.awt.Color(51, 51, 51));
        tblHopDong.getTableHeader().setReorderingAllowed(false);
        tblHopDong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHopDongMouseClicked(evt);
            }
        });
        tblHopDong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblHopDongKeyReleased(evt);
            }
        });
        jScrollPane6.setViewportView(tblHopDong);

        jDesktopPane1.add(jScrollPane6);
        jScrollPane6.setBounds(0, 0, 180, 272);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 130, 30));

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
        jPanel1.add(btnCapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 180, 130, 30));

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
        jPanel1.add(btnLamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 180, 120, 30));

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
        jPanel1.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 180, 90, 30));

        btnChiTiet.setBackground(new java.awt.Color(152, 249, 152));
        btnChiTiet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnChiTiet.setText("Xem Chi Tiết Sản Phẩm");
        btnChiTiet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiTietActionPerformed(evt);
            }
        });
        jPanel1.add(btnChiTiet, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 140, 180, 30));

        txtSoLuong.setEditable(false);
        txtSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSoLuong.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(txtSoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 70, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Hợp Đồng:");
        jLabel14.setToolTipText("");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 120, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Tên Sản Phẩm:");
        jLabel17.setToolTipText("");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 110, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Đơn Giá:");
        jLabel19.setToolTipText("");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 120, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Đơn Vị Tính:");
        jLabel20.setToolTipText("");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 110, -1));

        txtHopDong.setEditable(false);
        txtHopDong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtHopDong.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(txtHopDong, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 210, -1));

        txtMaSanPham.setEditable(false);
        txtMaSanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaSanPham.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(txtMaSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 210, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Mã Sản Phẩm:");
        jLabel21.setToolTipText("");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 120, -1));

        txtDonGia.setEditable(false);
        txtDonGia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDonGia.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(txtDonGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 210, -1));

        txtTenSanPham.setEditable(false);
        txtTenSanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTenSanPham.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(txtTenSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 210, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Số Lượng:");
        jLabel16.setToolTipText("");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 120, -1));

        txtDonViTinh.setEditable(false);
        txtDonViTinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDonViTinh.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(txtDonViTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 210, -1));

        jDesktopPane1.add(jPanel1);
        jPanel1.setBounds(180, 52, 1114, 220);

        jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 96, 59), 2), "Danh Sách Sản Phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 99, 0))); // NOI18N
        jScrollPane4.setPreferredSize(new java.awt.Dimension(462, 430));

        tblSanPham.setBackground(new java.awt.Color(184, 206, 224));
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
        jScrollPane4.setViewportView(tblSanPham);

        jDesktopPane1.add(jScrollPane4);
        jScrollPane4.setBounds(0, 278, 1300, 463);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Thông Tin Sản Phẩm");
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

    private void btnChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiTietActionPerformed
        xuLyXemChiTiet();
    }//GEN-LAST:event_btnChiTietActionPerformed

    private void tblHopDongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHopDongMouseClicked
        xuLyThayDoiTblHopDong();
    }//GEN-LAST:event_tblHopDongMouseClicked

    private void tblHopDongKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblHopDongKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            xuLyThayDoiTblHopDong();
        }
    }//GEN-LAST:event_tblHopDongKeyReleased

    private void tblSanPhamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblSanPhamKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            layDuLieuLenText();
        }
    }//GEN-LAST:event_tblSanPhamKeyReleased

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        layDuLieuLenText();
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        xuLyThem();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        xuLyCapNhat();
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        xuLyXoa();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        if (lamMoiBtn()) {
            lamMoiDong();
            lamMoiBang();
            doDuLieuHopDong(hopDong_Dao.getDanhSachHopDong());
            doDuLieuSanPham(sanPham_Dao.getDanhSachSanPham());
            dongNhapDuLieu();
        }
    }//GEN-LAST:event_btnLamMoiActionPerformed
    private void initCommon() throws SQLException {
        ConnectDB.getInstance();
        ConnectDB.connect();
        df = new DecimalFormat("#,##0"); // Số lẻ số # để hiển thị đủ chữ số thập phân
        hopDong_Dao = new HopDong_Dao();
        sanPham_Dao = new SanPham_Dao();
        doDuLieuHopDong(hopDong_Dao.getDanhSachHopDong());
        doDuLieuSanPham(sanPham_Dao.getDanhSachSanPham());
    }

    private void doDuLieuHopDong(List<HopDongSanXuat> hopDongSanXuats) {
        int i = 0;
        for (HopDongSanXuat hopDongSanXuat : hopDongSanXuats) {
            hopDongSanXuats.get(i).setSanPham(sanPham_Dao.getDanhSachSanPhamTheoMaHd(hopDongSanXuat.getMaHopDong()));
            Object[] objects = {hopDongSanXuat.getMaHopDong(), hopDongSanXuat.getTenHopDong()};
            dtmHopDong.addRow(objects);
            i++;
        }
        this.hopDongSanXuats = hopDongSanXuats;
    }

    private void doDuLieuSanPham(List<SanPham> sanPhams) {
        int i = 1;
        for (SanPham sanPham : sanPhams) {
            Object[] objects = {i, sanPham.getTenSanPham(), sanPham.getMaSanPham(),
                sanPham.getSoLuong(), df.format(sanPham.getDonGia()) + "VND", sanPham.getDonViTinh()};
            dtmSanPham.addRow(objects);
            i++;
        }
        this.sanPhams = sanPhams;
    }

    private void xuLyThayDoiTblHopDong() {
        int hang = tblHopDong.getSelectedRow();
        if (hang != -1) {
            dtmSanPham.setRowCount(0);
            txtHopDong.setText(hopDongSanXuats.get(hang).getTenHopDong());
            doDuLieuSanPham(hopDongSanXuats.get(hang).getSanPham());
        }
    }

    private void layDuLieuLenText() {
        int hang = tblSanPham.getSelectedRow();
        if (hang != -1 && btnThem.getText().equalsIgnoreCase("Thêm") && btnCapNhat.getText().equalsIgnoreCase("Cập Nhật")) {
            txtMaSanPham.setText((String) tblSanPham.getValueAt(hang, 2));
            txtTenSanPham.setText((String) tblSanPham.getValueAt(hang, 1));
            txtSoLuong.setText(String.valueOf(tblSanPham.getValueAt(hang, 3)));
            txtDonViTinh.setText((String) tblSanPham.getValueAt(hang, 5));
            txtDonGia.setText((String) tblSanPham.getValueAt(hang, 4));
        }
    }

    private void setTable() {
        //setTable ở đây
        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        dtmHopDong = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Mã", "Hợp đồng"
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
        tblHopDong.setModel(dtmHopDong);
        tblHopDong.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblHopDong.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblHopDong.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));
        //table chấm công
        dtmSanPham = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "STT", "Tên sản phẩm", "Mã sản phẩm", "Số lượng", "Đơn giá", "Đơn vị tính"}
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,};
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
        tblSanPham.setModel(dtmSanPham);
        tblSanPham.getColumnModel().getColumn(0).setPreferredWidth(40);
        tblSanPham.getColumnModel().getColumn(1).setPreferredWidth(130);
        tblSanPham.getColumnModel().getColumn(2).setPreferredWidth(150);
        tblSanPham.getColumnModel().getColumn(3).setPreferredWidth(130);
        tblSanPham.getColumnModel().getColumn(4).setPreferredWidth(60);
        tblSanPham.getColumnModel().getColumn(5).setPreferredWidth(130);
        tblSanPham.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));

    }

    private void xuLyThem() {
        int hang = tblHopDong.getSelectedRow();
        if (btnThem.getText().equalsIgnoreCase("Thêm")) {
            if (hang != -1) {
                moNhapDuLieu();
                lamMoiThem();
                btnChiTiet.setEnabled(false);
                btnCapNhat.setEnabled(false);
                btnXoa.setEnabled(false);
                tblHopDong.setEnabled(false);
                btnThem.setText("Xác Nhận");
            } else {
                JOptionPane.showMessageDialog(this, "Chưa chọn hợp đồng để thêm!");
            }
        } else {
            //chưa bắt lỗi rông txt tên pb
            if (JOptionPane.showConfirmDialog(this, "Xác Nhận Thêm Sản Phẩm", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                SanPham sanPham = new SanPham(sanPham_Dao.layMaTuDongSanPham(), txtTenSanPham.getText(),
                        Float.parseFloat(txtDonGia.getText()), Integer.parseInt(txtSoLuong.getText()),
                        txtDonViTinh.getText());
                if (sanPham_Dao.themSanPham(sanPham, hopDongSanXuats.get(hang).getMaHopDong())) {
                    JOptionPane.showMessageDialog(this, "Thêm sản phẩm thành công!");
                    dtmSanPham.setRowCount(0);
                    doDuLieuSanPham(sanPham_Dao.getDanhSachSanPhamTheoMaHd(hopDongSanXuats.get(hang).getMaHopDong()));
                    hopDongSanXuats.get(hang).getSanPham().add(sanPham);
                } else {
                    JOptionPane.showMessageDialog(this, "Thêm sản phẩm thất bại!");

                }
                dongNhapDuLieu();
                btnChiTiet.setEnabled(true);
                btnCapNhat.setEnabled(true);
                btnXoa.setEnabled(true);
                tblHopDong.setEnabled(true);
                btnThem.setText("Thêm");
            }
        }
    }

    private void xuLyCapNhat() {
        int[] hangSp = tblSanPham.getSelectedRows();
        int hangHd = tblHopDong.getSelectedRow();
        if (btnCapNhat.getText().equalsIgnoreCase("Cập Nhật")) {
            if (hangHd != -1) {
                if (hangSp.length == 1) {
                    moNhapDuLieu();
                    btnChiTiet.setEnabled(false);
                    btnThem.setEnabled(false);
                    btnXoa.setEnabled(false);
                    tblHopDong.setEnabled(false);
                    btnCapNhat.setText("Xác Nhận");
                } else {
                    JOptionPane.showMessageDialog(this, "Chọn một sản phẩm cần cập nhật!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Chọn hợp đồng cần cập nhật!");
            }
        } else {
            if (JOptionPane.showConfirmDialog(this, "Xác Nhận Cập Nhật Sản Phẩm", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                SanPham sanPham = new SanPham(txtMaSanPham.getText(), txtTenSanPham.getText(),
                        Float.parseFloat(txtDonGia.getText()), Integer.parseInt(txtSoLuong.getText()),
                        txtDonViTinh.getText());
                if (sanPham_Dao.capNhatSanPham(sanPham)) {
                    JOptionPane.showMessageDialog(this, "Cập nhật sản phẩm thành công!");
                    dtmSanPham.setRowCount(0);
                    doDuLieuSanPham(sanPham_Dao.getDanhSachSanPhamTheoMaHd(hopDongSanXuats.get(hangHd).getMaHopDong()));
                    hopDongSanXuats.get(hangHd).getSanPham().set(hangSp[0], sanPham);
                } else {
                    JOptionPane.showMessageDialog(this, "Cập nhật sản phẩm thất bại!");

                }
                dongNhapDuLieu();
                btnChiTiet.setEnabled(true);
                btnThem.setEnabled(true);
                btnXoa.setEnabled(true);
                tblHopDong.setEnabled(true);
                btnCapNhat.setText("Cập Nhật");
            }
        }
    }

    private void xuLyXoa() {
        int[] hangSp = tblSanPham.getSelectedRows();
        int hangHd = tblHopDong.getSelectedRow();
        if (hangHd != -1) {
            if (hangSp.length == 1) {
                if (JOptionPane.showConfirmDialog(this, "Xác Nhận Xóa Sản Phẩm", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    if (sanPham_Dao.xoaSanPham(sanPhams.get(hangSp[0]).getMaSanPham())) {
                        JOptionPane.showMessageDialog(this, "Xóa sản phẩm thành công!");
                        dtmSanPham.setRowCount(0);
                        doDuLieuSanPham(sanPham_Dao.getDanhSachSanPhamTheoMaHd(hopDongSanXuats.get(hangHd).getMaHopDong()));
                    } else {
                        JOptionPane.showMessageDialog(this, "Xóa sản phẩm thất bại,sản phẩm đang được sản xuất!");
                    }
                }
            } else if (hangSp.length == 0) {
                JOptionPane.showMessageDialog(this, "Chưa chọn sản phẩm cần xóa!");
            } else {
                JOptionPane.showMessageDialog(this, "Một lần chỉ xóa được một sản phẩm!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Chọn hợp đồng cần xóa sản phẩm!");
        }
    }

    private void xuLyXemChiTiet() {
        int hang = tblSanPham.getSelectedRow();
        if (hang != -1) {
            CongDoan_Dao congDoan_Dao = new CongDoan_Dao();
            sanPhams.get(hang).setCongDoanThucHien(congDoan_Dao.getDanhSachCongDoanTheoSanPham(sanPhams.get(hang).getMaSanPham()));
            ChiTietSanPham_GUI chiTietSanPham_GUI = new ChiTietSanPham_GUI( sanPhams.get(hang));
            jDesktopPane1.add(chiTietSanPham_GUI).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn sản phẩm muốn xem");
        }
    }

    public boolean lamMoiBtn() {
        if (btnCapNhat.getText().equalsIgnoreCase("Xác Nhận") || btnThem.getText().equalsIgnoreCase("Xác Nhận")) {
            int i = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát khỏi chỉnh sửa không", "Xác nhận", JOptionPane.YES_NO_OPTION);
            if (i == JOptionPane.YES_OPTION) {
                btnThem.setEnabled(true);
                btnCapNhat.setEnabled(true);
                btnXoa.setEnabled(true);
                btnChiTiet.setEnabled(true);
                tblHopDong.setEnabled(true);
                btnThem.setText("Thêm");
                btnCapNhat.setText("Cập Nhật");
                return true;
            }
            return false;
        }
        return true;
    }

    private void lamMoiDong() {
        txtMaSanPham.setText("");
        txtTenSanPham.setText("");
        txtDonGia.setText("");
        txtSoLuong.setText("");
        txtDonViTinh.setText("");
        txtHopDong.setText("");
    }

    private void lamMoiThem() {
        txtMaSanPham.setText("");
        txtTenSanPham.setText("");
        txtDonGia.setText("");
        txtSoLuong.setText("");
        txtDonViTinh.setText("");
    }

    private void lamMoiBang() {
        dtmHopDong.setRowCount(0);
        dtmSanPham.setRowCount(0);
    }

    private void moNhapDuLieu() {
        txtTenSanPham.setEditable(true);
        txtDonGia.setEditable(true);
        txtSoLuong.setEditable(true);
        txtDonViTinh.setEditable(true);
    }

    private void dongNhapDuLieu() {
        txtTenSanPham.setEditable(false);
        txtDonGia.setEditable(false);
        txtSoLuong.setEditable(false);
        txtDonViTinh.setEditable(false);
    }
    private DefaultTableModel dtmSanPham;
    private DefaultTableModel dtmHopDong;
    private DecimalFormat df;
    private List<HopDongSanXuat> hopDongSanXuats;
    private List<SanPham> sanPhams;
    private HopDong_Dao hopDong_Dao;
    private SanPham_Dao sanPham_Dao;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnChiTiet;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
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
    private javax.swing.JTable tblHopDong;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtDonViTinh;
    private javax.swing.JTextField txtHopDong;
    private javax.swing.JTextField txtMaSanPham;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenSanPham;
    // End of variables declaration//GEN-END:variables
}
