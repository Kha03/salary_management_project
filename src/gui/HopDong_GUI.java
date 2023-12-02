package gui;

import com.toedter.calendar.JDateChooser;
import connect.ConnectDB;
import dao.HopDong_Dao;
import dao.SanPham_Dao;
import entity.HopDongSanXuat;
import entity.SanPham;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
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
public class HopDong_GUI extends javax.swing.JPanel {

    /**
     * Creates new form NhanVienHanhChinh
     */
    public HopDong_GUI() throws SQLException {
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
        lstSanPham = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHopDong = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        txtMaHopDong = new javax.swing.JTextField();
        txtTenHopDong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dchNgayKetThuc = new com.toedter.calendar.JDateChooser();
        dchNgayBatDau = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        txtGiaTien = new javax.swing.JTextField();
        lblThongBao = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 96, 59)));

        lstSanPham.setForeground(new java.awt.Color(51, 51, 51));
        lstSanPham.setSelectionBackground(new java.awt.Color(144, 237, 144));
        lstSanPham.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(lstSanPham);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 43, 180, 230));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 96, 59), 2), "Danh Sách Hợp Đồng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 99, 0))); // NOI18N

        tblHopDong.setBackground(new java.awt.Color(184, 206, 224));
        tblHopDong.setToolTipText("");
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
        jScrollPane2.setViewportView(tblHopDong);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 277, 1300, 465));

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
        jPanel1.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 130, 30));

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
        jPanel1.add(btnCapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, 130, 30));

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
        jPanel1.add(btnLamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 190, 120, 30));

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
        jPanel1.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 190, 90, 30));

        txtMaHopDong.setEditable(false);
        txtMaHopDong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaHopDong.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(txtMaHopDong, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 210, -1));

        txtTenHopDong.setEditable(false);
        txtTenHopDong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTenHopDong.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(txtTenHopDong, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 210, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Tên Hợp Đồng:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 120, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Ngày Bắt Đầu:");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 120, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Ngày Kết Thúc:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 120, 20));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Mã Hợp Đồng:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 120, 20));

        dchNgayKetThuc.setBackground(new java.awt.Color(255, 255, 255));
        dchNgayKetThuc.setForeground(new java.awt.Color(0, 96, 0));
        dchNgayKetThuc.setDateFormatString("dd/MM/yyyy");
        dchNgayKetThuc.setEnabled(false);
        dchNgayKetThuc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(dchNgayKetThuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 190, 25));

        dchNgayBatDau.setBackground(new java.awt.Color(255, 255, 255));
        dchNgayBatDau.setForeground(new java.awt.Color(0, 96, 0));
        dchNgayBatDau.setDateFormatString("dd/MM/yyyy");
        dchNgayBatDau.setEnabled(false);
        dchNgayBatDau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(dchNgayBatDau, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 190, 25));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Giá Tiền:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 70, 20));

        txtGiaTien.setEditable(false);
        txtGiaTien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtGiaTien.setForeground(new java.awt.Color(0, 96, 0));
        txtGiaTien.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGiaTienKeyTyped(evt);
            }
        });
        jPanel1.add(txtGiaTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 210, -1));

        lblThongBao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblThongBao.setForeground(new java.awt.Color(255, 0, 0));
        lblThongBao.setToolTipText("");
        jPanel1.add(lblThongBao, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 360, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 1114, 230));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Thông Tin Hợp Đồng Sản Xuất");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 1290, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 99, 0));
        jLabel1.setText("Sản Phẩm:");
        jLabel1.setToolTipText("");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 180, -1));
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        xuLyXoa();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblHopDongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHopDongMouseClicked
        xuLyThayDoiTblHopDong();
        layDuLieuLenText();
    }//GEN-LAST:event_tblHopDongMouseClicked

    private void tblHopDongKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblHopDongKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            xuLyThayDoiTblHopDong();
            layDuLieuLenText();
        }
    }//GEN-LAST:event_tblHopDongKeyReleased

    private void txtGiaTienKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGiaTienKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtGiaTienKeyTyped
    private void initCommon() throws SQLException {
        ConnectDB.getInstance();
        ConnectDB.connect();
        df = new DecimalFormat("#,##0"); // Số lẻ số # để hiển thị đủ chữ số thập phân
        dinhDangNgay = new SimpleDateFormat("dd/MM/yyyy");
        hopDong_Dao = new HopDong_Dao();
        sanPham_Dao = new SanPham_Dao();
        doDuLieuHopDong(hopDong_Dao.getDanhSachHopDong());
    }

    private void doDuLieuHopDong(List<HopDongSanXuat> hopDongSanXuats) {
        int i = 0;
        for (HopDongSanXuat hopDongSanXuat : hopDongSanXuats) {
            hopDongSanXuats.get(i).setSanPham(sanPham_Dao.getDanhSachSanPhamTheoMaHd(hopDongSanXuat.getMaHopDong()));
            Object[] objects = {hopDongSanXuat.getMaHopDong(), hopDongSanXuat.getTenHopDong(),
                dinhDangNgay.format(hopDongSanXuat.getNgayBatDau()), dinhDangNgay.format(hopDongSanXuat.getNgayKetThuc()),
                df.format(hopDongSanXuat.getGiaTien()) + "VND"};
            dtmHopDong.addRow(objects);
            i++;
        }
        this.hopDongSanXuats = hopDongSanXuats;
    }

    private void doDuLieuSanPham(List<SanPham> sanPhams) {
        for (SanPham sanPham : sanPhams) {
            dlmSanPham.addElement(sanPham.getTenSanPham());
        }
    }

    private void xuLyThayDoiTblHopDong() {
        int hang = tblHopDong.getSelectedRow();
        if (hang != -1) {
            dlmSanPham.setSize(0);
            doDuLieuSanPham(hopDongSanXuats.get(hang).getSanPham());
        }
    }

    private void layDuLieuLenText() {
        int hang = tblHopDong.getSelectedRow();
        if (hang != -1 && btnThem.getText().equalsIgnoreCase("Thêm") && btnCapNhat.getText().equalsIgnoreCase("Cập Nhật")) {
            try {
                txtMaHopDong.setText((String) tblHopDong.getValueAt(hang, 0));
                txtTenHopDong.setText((String) tblHopDong.getValueAt(hang, 1));
                dchNgayBatDau.setDate(dinhDangNgay.parse((String) tblHopDong.getValueAt(hang, 2)));
                dchNgayKetThuc.setDate(dinhDangNgay.parse((String) tblHopDong.getValueAt(hang, 3)));
                txtGiaTien.setText((String) tblHopDong.getValueAt(hang, 4));
            } catch (ParseException ex) {
                Logger.getLogger(HopDong_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void setTable() {
        //setTable ở đây
        dtmHopDong = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Mã hợp đồng", "Tên hợp đồng", "Ngày bắt đầu", "Ngày kết thúc", "Giá tiền"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
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

        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        tblHopDong.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));
        tblHopDong.getColumnModel().getColumn(0).setCellRenderer(center);
        tblHopDong.getColumnModel().getColumn(1).setCellRenderer(center);
        tblHopDong.getColumnModel().getColumn(2).setCellRenderer(center);
        tblHopDong.getColumnModel().getColumn(3).setCellRenderer(center);
        tblHopDong.getColumnModel().getColumn(4).setCellRenderer(center);
        //set Jlist
        dlmSanPham = new DefaultListModel();
        lstSanPham.setModel(dlmSanPham);
    }

    private void xuLyThem() {
        if (btnThem.getText().equalsIgnoreCase("Thêm")) {
            moNhapDuLieu();
            lamMoiDong();
            btnCapNhat.setEnabled(false);
            btnXoa.setEnabled(false);
            btnThem.setText("Xác Nhận");
        } else {
            if (kiemTraDuLieu()) {
                if (JOptionPane.showConfirmDialog(this, "Xác Nhận Thêm Hợp Đồng", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    HopDongSanXuat hopDongSanXuat = new HopDongSanXuat("", txtTenHopDong.getText(),
                            dchNgayBatDau.getDate(), dchNgayKetThuc.getDate(),
                            Float.parseFloat(txtGiaTien.getText()));
                    if (hopDong_Dao.themHopDong(hopDongSanXuat)) {
                        JOptionPane.showMessageDialog(this, "Thêm hợp đồng thành công!");
                        dtmHopDong.setRowCount(0);
                        doDuLieuHopDong(hopDong_Dao.getDanhSachHopDong());
                    } else {
                        JOptionPane.showMessageDialog(this, "Thêm hợp đồng thất bại!");

                    }
                    dongNhapDuLieu();
                    btnCapNhat.setEnabled(true);
                    btnXoa.setEnabled(true);
                    btnThem.setText("Thêm");
                }
            }
        }
    }

    private void xuLyCapNhat() {
        if (btnCapNhat.getText().equalsIgnoreCase("Cập Nhật")) {
            int[] hang = tblHopDong.getSelectedRows();
            if (hang.length == 1) {
                moNhapDuLieu();
                btnThem.setEnabled(false);
                btnXoa.setEnabled(false);
//                //xoát vnd khi cap nhật
//                txtGiaTien.setText(txtGiaTien.getText().substring(0, txtGiaTien.getText().length() - 3));
                btnCapNhat.setText("Xác Nhận");
            } else {
                JOptionPane.showMessageDialog(this, "Chọn một hợp đồng cần cập nhật!");
            }
        } else {
            if (kiemTraDuLieu()) {
                if (JOptionPane.showConfirmDialog(this, "Xác Nhận Cập Nhật Hợp Đồng", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    HopDongSanXuat hopDongSanXuat = new HopDongSanXuat(txtMaHopDong.getText(), txtTenHopDong.getText(),
                            dchNgayBatDau.getDate(), dchNgayKetThuc.getDate(),
                            Float.parseFloat(txtGiaTien.getText()));
                    if (hopDong_Dao.capNhatHopDong(hopDongSanXuat)) {
                        JOptionPane.showMessageDialog(this, "Cập nhật hợp đồng thành công!");
                        dtmHopDong.setRowCount(0);
                        doDuLieuHopDong(hopDong_Dao.getDanhSachHopDong());
                    } else {
                        JOptionPane.showMessageDialog(this, "Cập nhật hợp đồng thất bại!");

                    }
                    dongNhapDuLieu();
                    btnThem.setEnabled(true);
                    btnXoa.setEnabled(true);
                    btnCapNhat.setText("Cập Nhật");
                }
            }
        }
    }

    private void xuLyXoa() {
        int[] hang = tblHopDong.getSelectedRows();
        if (hang.length == 1) {
            if (JOptionPane.showConfirmDialog(this, "Xác Nhận Xóa Hợp Đồng", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                if (hopDong_Dao.xoaHopDong(hopDongSanXuats.get(hang[0]).getMaHopDong())) {
                    JOptionPane.showMessageDialog(this, "Xóa hợp đồng thành công!");
                    dtmHopDong.setRowCount(0);
                    doDuLieuHopDong(hopDong_Dao.getDanhSachHopDong());
                } else {
                    JOptionPane.showMessageDialog(this, "Xóa hợp đồng thất bại,hợp đồng đã được sản xuất!");
                }
            }
        } else if (hang.length == 0) {
            JOptionPane.showMessageDialog(this, "Chưa chọn hợp đồng cần xóa!");
        } else {
            JOptionPane.showMessageDialog(this, "Một lần chỉ xóa được một hợp đồng!");
        }
    }

    public boolean lamMoiBtn() {
        if (btnCapNhat.getText().equalsIgnoreCase("Xác Nhận") || btnThem.getText().equalsIgnoreCase("Xác Nhận")) {
            int i = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát khỏi chỉnh sửa không", "Xác nhận", JOptionPane.YES_NO_OPTION);
            if (i == JOptionPane.YES_OPTION) {
                btnThem.setEnabled(true);
                btnCapNhat.setEnabled(true);
                btnXoa.setEnabled(true);
                btnThem.setText("Thêm");
                btnCapNhat.setText("Cập Nhật");
                return true;
            }
            return false;
        }
        return true;
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
        if (kiemTraRong(dchNgayBatDau, "*Không được để dữ liệu trống!")
                || kiemTraRong(dchNgayKetThuc, "*Không được để dữ liệu trống!")
                || kiemTraRong(txtTenHopDong, "*Không được để dữ liệu trống!")) {
            return false;
        }
        lblThongBao.setText("");
        return true;
    }

    private boolean kiemTraDuLieu() {
        if (kiemTraDuLieuRong()) {
            if (!KiemTraChuoi.ktTen(txtTenHopDong.getText().trim())) {
                txtTenHopDong.requestFocus();
                lblThongBao.setText("*Tên sai định dạng");
                return false;
            } else if (!KiemTraChuoi.ktDateFormat(dinhDangNgay.format(dchNgayBatDau.getDate()))) {
                dchNgayBatDau.requestFocus();
                lblThongBao.setText("*Sai định dạng ngày");
                return false;
            } else if (!KiemTraChuoi.ktDateFormat(dinhDangNgay.format(dchNgayKetThuc.getDate()))) {
                dchNgayKetThuc.requestFocus();
                lblThongBao.setText("*Sai định dạng ngày");
                return false;
            }
            lblThongBao.setText("");
            return true;
        }
        return false;
    }

    private void lamMoiDong() {
        txtMaHopDong.setText("");
        txtTenHopDong.setText("");
        dchNgayBatDau.setDate(null);
        dchNgayKetThuc.setDate(null);
        txtGiaTien.setText("");
    }

    private void lamMoiBang() {
        dlmSanPham.setSize(0);
        dtmHopDong.setRowCount(0);
    }

    private void moNhapDuLieu() {
        txtTenHopDong.setEditable(true);
        dchNgayBatDau.setEnabled(true);
        dchNgayKetThuc.setEnabled(true);
        txtGiaTien.setEditable(true);
    }

    private void dongNhapDuLieu() {
        txtTenHopDong.setEditable(false);
        dchNgayBatDau.setEnabled(false);
        dchNgayKetThuc.setEnabled(false);
        txtGiaTien.setEditable(false);
    }
    private DefaultTableModel dtmHopDong;
    private DefaultListModel dlmSanPham;
    private DecimalFormat df;
    private SimpleDateFormat dinhDangNgay;
    private List<HopDongSanXuat> hopDongSanXuats;
    private HopDong_Dao hopDong_Dao;
    private SanPham_Dao sanPham_Dao;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private com.toedter.calendar.JDateChooser dchNgayBatDau;
    private com.toedter.calendar.JDateChooser dchNgayKetThuc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblThongBao;
    private javax.swing.JList<String> lstSanPham;
    private javax.swing.JTable tblHopDong;
    private javax.swing.JTextField txtGiaTien;
    private javax.swing.JTextField txtMaHopDong;
    private javax.swing.JTextField txtTenHopDong;
    // End of variables declaration//GEN-END:variables
}
