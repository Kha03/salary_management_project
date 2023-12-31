package gui;

import com.toedter.calendar.JDateChooser;
import connect.ConnectDB;
import dao.CongDoan_Dao;
import dao.HopDong_Dao;
import dao.SanPham_Dao;
import entity.CongDoan;
import entity.HopDongSanXuat;
import entity.SanPham;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class CongDoan_GUI extends javax.swing.JPanel {

    /**
     * Creates new form ChamCongHanhChinh
     */
    public CongDoan_GUI() throws SQLException {
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

        jScrollPane4 = new javax.swing.JScrollPane();
        tblCongDoan = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtMaCongDoan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTenCongDoan = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtSanPham = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cmbHopDong = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        txtGiaTien = new javax.swing.JTextField();
        txtTienDo = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        cmbCongDoanTruoc = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        lblGiaSanPham = new javax.swing.JLabel();
        lblThongBao = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1200, 674));
        setPreferredSize(new java.awt.Dimension(1200, 674));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 96, 59), 2), "Danh Sách Công Đoạn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 99, 0))); // NOI18N
        jScrollPane4.setPreferredSize(new java.awt.Dimension(462, 430));

        tblCongDoan.setBackground(new java.awt.Color(184, 206, 224));
        tblCongDoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblCongDoan.setToolTipText("");
        tblCongDoan.setSelectionBackground(new java.awt.Color(144, 237, 144));
        tblCongDoan.setSelectionForeground(new java.awt.Color(51, 51, 51));
        tblCongDoan.getTableHeader().setReorderingAllowed(false);
        tblCongDoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCongDoanMouseClicked(evt);
            }
        });
        tblCongDoan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblCongDoanKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(tblCongDoan);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 1300, 430));

        jScrollPane6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 96, 59)));

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
        jScrollPane6.setViewportView(tblSanPham);

        add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 310));

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
        add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 270, 130, 30));

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
        add(btnCapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 270, 130, 30));

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
        add(btnLamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 270, 120, 30));

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
        add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 270, 90, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Sản Phẩm:");
        jLabel14.setToolTipText("");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 120, -1));

        txtMaCongDoan.setEditable(false);
        txtMaCongDoan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaCongDoan.setForeground(new java.awt.Color(0, 96, 0));
        add(txtMaCongDoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 180, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Công Đoạn Sản Phẩm");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 1300, 40));

        txtTenCongDoan.setEditable(false);
        txtTenCongDoan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTenCongDoan.setForeground(new java.awt.Color(0, 96, 0));
        add(txtTenCongDoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 180, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Tên Công Đoạn:");
        jLabel16.setToolTipText("");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 120, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Số Lượng:");
        jLabel17.setToolTipText("");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 110, -1));

        txtSanPham.setEditable(false);
        txtSanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSanPham.setForeground(new java.awt.Color(0, 96, 0));
        add(txtSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 160, 210, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Mã Công Đoạn:");
        jLabel18.setToolTipText("");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 120, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Hợp Đồng:");
        jLabel19.setToolTipText("");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, 120, -1));

        cmbHopDong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbHopDong.setForeground(new java.awt.Color(0, 99, 0));
        cmbHopDong.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbHopDongItemStateChanged(evt);
            }
        });
        add(cmbHopDong, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 60, 210, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Giá Tiền:");
        jLabel20.setToolTipText("");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 120, -1));

        txtGiaTien.setEditable(false);
        txtGiaTien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtGiaTien.setForeground(new java.awt.Color(0, 96, 0));
        txtGiaTien.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGiaTienKeyTyped(evt);
            }
        });
        add(txtGiaTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 180, -1));

        txtTienDo.setEditable(false);
        txtTienDo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTienDo.setForeground(new java.awt.Color(0, 96, 0));
        txtTienDo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTienDoKeyTyped(evt);
            }
        });
        add(txtTienDo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 80, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Giá Sản Phẩm:");
        jLabel21.setToolTipText("");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 210, 120, -1));

        cmbCongDoanTruoc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbCongDoanTruoc.setForeground(new java.awt.Color(0, 99, 0));
        cmbCongDoanTruoc.setEnabled(false);
        cmbCongDoanTruoc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCongDoanTruocItemStateChanged(evt);
            }
        });
        add(cmbCongDoanTruoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 110, 210, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Công Đoạn Trước:");
        jLabel22.setToolTipText("");
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 140, -1));

        lblGiaSanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblGiaSanPham.setForeground(new java.awt.Color(0, 99, 0));
        lblGiaSanPham.setText(" ");
        add(lblGiaSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 210, 180, 20));

        lblThongBao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblThongBao.setForeground(new java.awt.Color(255, 0, 0));
        lblThongBao.setToolTipText("");
        add(lblThongBao, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 360, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void cmbHopDongItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbHopDongItemStateChanged
        xuLyThayDoiCmbHopDong();
    }//GEN-LAST:event_cmbHopDongItemStateChanged

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        xuLyThayDoiTblSanPham();
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void tblCongDoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCongDoanMouseClicked
        layDuLieuLenText();
    }//GEN-LAST:event_tblCongDoanMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        xuLyThem();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        xuLyCapNhat();
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        if (lamMoiBtn()) {
            lamMoiDong();
            lamMoiBang();
            doDuLieuHopDong(hopDong_Dao.getDanhSachHopDong());
            dongNhapDuLieu();
        }
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void tblSanPhamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblSanPhamKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            xuLyThayDoiTblSanPham();
        }
    }//GEN-LAST:event_tblSanPhamKeyReleased

    private void tblCongDoanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCongDoanKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            layDuLieuLenText();
        }
    }//GEN-LAST:event_tblCongDoanKeyReleased

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        xuLyXoa();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void cmbCongDoanTruocItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCongDoanTruocItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCongDoanTruocItemStateChanged

    private void txtTienDoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTienDoKeyTyped
        kiemTraNhapSo(evt);
    }//GEN-LAST:event_txtTienDoKeyTyped

    private void txtGiaTienKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGiaTienKeyTyped
        kiemTraNhapSo(evt);
    }//GEN-LAST:event_txtGiaTienKeyTyped
    private void initCommon() throws SQLException {
        ConnectDB.getInstance();
        ConnectDB.connect();
        df = new DecimalFormat("#,##0"); // Số lẻ số # để hiển thị đủ chữ số thập phân
        hopDong_Dao = new HopDong_Dao();
        sanPham_Dao = new SanPham_Dao();
        congDoan_Dao = new CongDoan_Dao();
        doDuLieuHopDong(hopDong_Dao.getDanhSachHopDong());
    }

    private void doDuLieuHopDong(List<HopDongSanXuat> hopDongSanXuats) {
        this.hopDongSanXuats = hopDongSanXuats;
        int soLuong = hopDongSanXuats.size() - 1;
        for (int i = soLuong; i >= 0; i--) {
            hopDongSanXuats.get(i).setSanPham(sanPham_Dao.getDanhSachSanPhamTheoMaHd(hopDongSanXuats.get(i).getMaHopDong()));
            cmbHopDong.addItem(hopDongSanXuats.get(i).getTenHopDong());
        }
    }

    private void doDuLieuSanPham(List<SanPham> sanPhams) {
        int i = 0;
        for (SanPham sanPham : sanPhams) {
            sanPhams.get(i).setCongDoanThucHien(congDoan_Dao.getDanhSachCongDoanTheoSanPham(sanPham.getMaSanPham()));
            Object[] objects = {i + 1, sanPham.getTenSanPham()};
            dtmSanPham.addRow(objects);
            i++;
        }
        this.sanPhams = sanPhams;
    }

    private void doDuLieuCongDoan(List<CongDoan> congDoans) {
        int i = 1;
        cmbCongDoanTruoc.removeAllItems();
        for (CongDoan congDoan : congDoans) {
            Object[] objects = {i, congDoan.getTenCongDoan(), congDoan.getMaCongDoan(), df.format(congDoan.getGiaTien()) + "VND", congDoan.getTienDo(),
                congDoan.getCongDoanTruoc().getTenCongDoan()};
            dtmCongDoan.addRow(objects);
            cmbCongDoanTruoc.addItem(congDoan.getTenCongDoan());
            i++;
        }
        this.congDoans = congDoans;
    }

    private void xuLyThayDoiTblSanPham() {
        int hang = tblSanPham.getSelectedRow();
        if (hang != -1) {
            dtmCongDoan.setRowCount(0);
            txtSanPham.setText(sanPhams.get(hang).getTenSanPham());
            lblGiaSanPham.setText(df.format(sanPhams.get(hang).getDonGia()) + "VND");
            doDuLieuCongDoan(sanPhams.get(hang).getCongDoanThucHien());
        }
    }

    private void layDuLieuLenText() {
        int hang = tblCongDoan.getSelectedRow();
        if (hang != -1 && btnThem.getText().equalsIgnoreCase("Thêm") && btnCapNhat.getText().equalsIgnoreCase("Cập Nhật")) {
            txtMaCongDoan.setText((String) tblCongDoan.getValueAt(hang, 2));
            txtTenCongDoan.setText((String) tblCongDoan.getValueAt(hang, 1));
            txtGiaTien.setText((String) tblCongDoan.getValueAt(hang, 3));
            txtTienDo.setText(String.valueOf(tblCongDoan.getValueAt(hang, 4)));
            cmbCongDoanTruoc.setSelectedItem((String) tblCongDoan.getValueAt(hang, 5));
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

        dtmCongDoan = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "STT", "Tên Công đoạn", "Mã công đoạn", "Đơn giá", "Số lượng", "Công đoạn trước"}
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false};

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        tblCongDoan.setModel(dtmCongDoan);
        tblCongDoan.getColumnModel().getColumn(0).setPreferredWidth(40);
        tblCongDoan.getColumnModel().getColumn(1).setPreferredWidth(130);
        tblCongDoan.getColumnModel().getColumn(2).setPreferredWidth(150);
        tblCongDoan.getColumnModel().getColumn(3).setPreferredWidth(130);
        tblCongDoan.getColumnModel().getColumn(4).setPreferredWidth(100);
        tblCongDoan.getColumnModel().getColumn(5).setPreferredWidth(130);
        tblCongDoan.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));
    }

    private void xuLyThem() {
        int hang = tblSanPham.getSelectedRow();
        if (btnThem.getText().equalsIgnoreCase("Thêm")) {
            if (hang != -1) {
                moNhapDuLieu();
                lamMoiThem();
                cmbHopDong.setEnabled(false);
                btnCapNhat.setEnabled(false);
                btnXoa.setEnabled(false);
                tblSanPham.setEnabled(false);
                cmbCongDoanTruoc.setEnabled(true);
                btnThem.setText("Xác Nhận");
            } else {
                JOptionPane.showMessageDialog(this, "Chưa chọn sản phẩm để thêm!");
            }
        } else {
            if (kiemTraDuLieu()) {
                if (JOptionPane.showConfirmDialog(this, "Xác Nhận Thêm Công Đoạn", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    if (kiemTraGia()) {
                        CongDoan congDoan = new CongDoan(congDoan_Dao.layMaTuDongCongDoan(), txtTenCongDoan.getText(),
                                Float.parseFloat(txtGiaTien.getText()), 0, congDoans.size() > 0 ? new CongDoan(congDoans.get(cmbCongDoanTruoc.getSelectedIndex()).getMaCongDoan(), "") : new CongDoan("", ""));
                        if (congDoan_Dao.themCongDoan(congDoan, sanPhams.get(hang).getMaSanPham())) {
                            JOptionPane.showMessageDialog(this, "Thêm công đoạn thành công!");
                            dtmCongDoan.setRowCount(0);
                            doDuLieuCongDoan(congDoan_Dao.getDanhSachCongDoanTheoSanPham(sanPhams.get(hang).getMaSanPham()));
                            sanPhams.get(hang).getCongDoanThucHien().add(congDoan);
                        } else {
                            JOptionPane.showMessageDialog(this, "Thêm công đoạn thất bại!");
                        }
                        dongNhapDuLieu();
                        cmbCongDoanTruoc.setEnabled(false);
                        cmbHopDong.setEnabled(true);
                        btnCapNhat.setEnabled(true);
                        btnXoa.setEnabled(true);
                        tblSanPham.setEnabled(true);
                        btnThem.setText("Thêm");
                    }
                }
            }
        }
    }

    private void xuLyCapNhat() {
        int[] hangCd = tblCongDoan.getSelectedRows();
        int hangSp = tblSanPham.getSelectedRow();
        if (btnCapNhat.getText().equalsIgnoreCase("Cập Nhật")) {
            if (hangSp != -1) {
                if (hangCd.length == 1) {
                    moNhapDuLieu();
                    cmbHopDong.setEnabled(false);
                    btnThem.setEnabled(false);
                    btnXoa.setEnabled(false);
                    txtTienDo.setEditable(true);
                    tblSanPham.setEnabled(false);
                    cmbCongDoanTruoc.setEnabled(true);
                    doiStringTienSangSo();
                    btnCapNhat.setText("Xác Nhận");
                } else {
                    JOptionPane.showMessageDialog(this, "Chọn một công đoạn cần cập nhật!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Chọn sản phẩm cần cập nhật!");
            }
        } else {
            if (kiemTraDuLieu()) {
                if (JOptionPane.showConfirmDialog(this, "Xác Nhận Cập Nhật Công Đoạn", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    if (kiemTraGia()) {
                        CongDoan congDoan = new CongDoan(txtMaCongDoan.getText(), txtTenCongDoan.getText(),
                                Float.parseFloat(txtGiaTien.getText()), Integer.parseInt(txtTienDo.getText()), congDoans.size() > 0 ? new CongDoan(congDoans.get(cmbCongDoanTruoc.getSelectedIndex()).getMaCongDoan(), "") : new CongDoan("", ""));
                        if (congDoan_Dao.capNhatCongDoan(congDoan)) {
                            JOptionPane.showMessageDialog(this, "Cập nhật công đoạn thành công!");
                            dtmCongDoan.setRowCount(0);
                            doDuLieuCongDoan(congDoan_Dao.getDanhSachCongDoanTheoSanPham(sanPhams.get(hangSp).getMaSanPham()));
                            sanPhams.get(hangSp).getCongDoanThucHien().set(hangCd[0], congDoan);
                        } else {
                            JOptionPane.showMessageDialog(this, "Cập nhật công đoạn thất bại!");

                        }
                        dongNhapDuLieu();
                        cmbCongDoanTruoc.setEnabled(false);
                        cmbHopDong.setEnabled(true);
                        btnThem.setEnabled(true);
                        btnXoa.setEnabled(true);
                        txtTienDo.setEditable(false);
                        tblSanPham.setEnabled(true);
                        btnCapNhat.setText("Cập Nhật");
                    }
                }
            }
        }
    }

    private void xuLyXoa() {
        int[] hangCd = tblCongDoan.getSelectedRows();
        int hangSp = tblSanPham.getSelectedRow();
        if (hangSp != -1) {
            if (hangCd.length == 1) {
                if (JOptionPane.showConfirmDialog(this, "Xác Nhận Xóa Công đoạn", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    if (congDoan_Dao.xoaCongDoan(congDoans.get(hangCd[0]).getMaCongDoan())) {
                        JOptionPane.showMessageDialog(this, "Xóa công đoạn thành công!");
                        dtmCongDoan.setRowCount(0);
                        doDuLieuCongDoan(congDoan_Dao.getDanhSachCongDoanTheoSanPham(sanPhams.get(hangSp).getMaSanPham()));
                    } else {
                        JOptionPane.showMessageDialog(this, "Xóa công đoạn thất bại,công đoạn đang được sản xuất!");
                    }
                }
            } else if (hangCd.length == 0) {
                JOptionPane.showMessageDialog(this, "Chưa chọn công đoạn cần xóa!");
            } else {
                JOptionPane.showMessageDialog(this, "Một lần chỉ xóa được một công đoạn!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Chọn sản phẩm cần xóa công đoạn!");
        }
    }

    private void xuLyThayDoiCmbHopDong() {
        int i = cmbHopDong.getSelectedIndex();
        if (i != -1) {
            int soLuong = hopDongSanXuats.size();
            int viTri = soLuong - i - 1;
            txtSanPham.setText("");
            dtmSanPham.setRowCount(0);
            doDuLieuSanPham(hopDongSanXuats.get(viTri).getSanPham());
        }
    }

    private void doiStringTienSangSo() {
        // Loại bỏ dấu phân cách hàng nghìn và ký tự đơn vị
        String cleanedStr = txtGiaTien.getText().replaceAll("[^\\d.]", "");
        // Chuyển đổi chuỗi thành số nguyên
        txtGiaTien.setText(cleanedStr);
    }

    private boolean kiemTraGia() {
        String maCongDoan = txtMaCongDoan.getText();
        float giaSanPham = sanPhams.get(tblSanPham.getSelectedRow()).getDonGia();
        int soLuongCongDoan = dtmCongDoan.getRowCount();
        float giaCongDoan = Float.parseFloat(txtGiaTien.getText());
        for (int i = 0; i < soLuongCongDoan; i++) {
            if (congDoans.get(i).getMaCongDoan().equalsIgnoreCase(maCongDoan)) {
                continue;
            }
            giaCongDoan += congDoans.get(i).getGiaTien();
        }
        if (giaCongDoan > giaSanPham) {
            JOptionPane.showMessageDialog(this, "Tổng giá các công đoạn không được hơn giá một sản phẩm!");
            return false;
        }
        return true;
    }

    private void kiemTraNhapSo(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }

    private boolean kiemTraRong(JComponent component, String thongBao) {
        if (component instanceof JTextField) {
            JTextField textField = (JTextField) component;
            if (KiemTraChuoi.isNotEmpty(textField.getText())) {
                textField.requestFocus();
                lblThongBao.setText(thongBao);
                return true;
            }
        } else if (component instanceof JComboBox) {
            JComboBox<?> comboBox = (JComboBox<?>) component;
            if (comboBox.getSelectedIndex() == -1) {
                comboBox.requestFocus();
                lblThongBao.setText(thongBao);
                return true;
            }
        } else if (component instanceof JDateChooser dateChooser) {
            if (dateChooser.getDate() == null) {
                dateChooser.requestFocus();
                lblThongBao.setText(thongBao);
                return true;
            }
        }
        return false;
    }

    private boolean kiemTraDuLieuRong() {
        if (kiemTraRong(txtTenCongDoan, "*Không được để dữ liệu trống!")
                || kiemTraRong(txtGiaTien, "*Không được để dữ liệu trống!")
                || kiemTraRong(txtTienDo, "*Không được để dữ liệu trống!")) {
            return false;
        }
        lblThongBao.setText("");
        return true;
    }

    private boolean kiemTraDuLieu() {
        if (kiemTraDuLieuRong()) {
            if (!KiemTraChuoi.ktTen(txtTenCongDoan.getText().trim())) {
                txtTenCongDoan.requestFocus();
                lblThongBao.setText("*Tên sai định dạng");
                return false;
            }
            lblThongBao.setText("");
            return true;
        }
        return false;
    }

    public boolean lamMoiBtn() {
        if (btnCapNhat.getText().equalsIgnoreCase("Xác Nhận") || btnThem.getText().equalsIgnoreCase("Xác Nhận")) {
            int i = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát khỏi chỉnh sửa không", "Xác nhận", JOptionPane.YES_NO_OPTION);
            if (i == JOptionPane.YES_OPTION) {
                btnThem.setEnabled(true);
                btnCapNhat.setEnabled(true);
                btnXoa.setEnabled(true);
                tblSanPham.setEnabled(true);
                cmbHopDong.setEnabled(true);
                cmbCongDoanTruoc.setEnabled(false);
                btnThem.setText("Thêm");
                btnCapNhat.setText("Cập Nhật");
                return true;
            }
            return false;
        }
        return true;
    }

    private void lamMoiDong() {
        txtMaCongDoan.setText("");
        txtTenCongDoan.setText("");
        txtGiaTien.setText("");
        txtSanPham.setText("");
        cmbHopDong.setSelectedIndex(0);
        txtTienDo.setText("");
        lblGiaSanPham.setText("");
    }

    private void lamMoiThem() {
        txtMaCongDoan.setText("");
        txtTenCongDoan.setText("");
        txtGiaTien.setText("");
        txtTienDo.setText("0");
    }

    private void lamMoiBang() {
        dtmCongDoan.setRowCount(0);
        dtmSanPham.setRowCount(0);
        cmbHopDong.removeAllItems();
        cmbCongDoanTruoc.removeAllItems();
    }

    private void moNhapDuLieu() {
        txtTenCongDoan.setEditable(true);
        txtGiaTien.setEditable(true);
    }

    private void dongNhapDuLieu() {
        txtTenCongDoan.setEditable(false);
        txtGiaTien.setEditable(false);
    }
    private DefaultTableModel dtmSanPham;
    private DefaultTableModel dtmCongDoan;
    private DecimalFormat df;
    private List<HopDongSanXuat> hopDongSanXuats;
    private List<SanPham> sanPhams;
    private List<CongDoan> congDoans;
    private CongDoan_Dao congDoan_Dao;
    private HopDong_Dao hopDong_Dao;
    private SanPham_Dao sanPham_Dao;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cmbCongDoanTruoc;
    private javax.swing.JComboBox<String> cmbHopDong;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblGiaSanPham;
    private javax.swing.JLabel lblThongBao;
    private javax.swing.JTable tblCongDoan;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtGiaTien;
    private javax.swing.JTextField txtMaCongDoan;
    private javax.swing.JTextField txtSanPham;
    private javax.swing.JTextField txtTenCongDoan;
    private javax.swing.JTextField txtTienDo;
    // End of variables declaration//GEN-END:variables
}
