package gui;

import chart.BieuDoCot;
import chart.BieuDoTron;
import connect.ConnectDB;
import dao.PhanXuong_Dao;
import dao.PhongBan_Dao;
import dao.TinhLuongCongNhan_Dao;
import dao.TinhLuongHanhChanh_Dao;
import entity.LuongCongNhan;
import entity.LuongHanhChanh;
import entity.PhanXuong;
import entity.PhongBan;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class ThongKeLuongNhanVien_GUI extends javax.swing.JPanel {

    /**
     * Creates new form ChamCongHanhChinh
     */
    public ThongKeLuongNhanVien_GUI() throws SQLException {
        initComponents();
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

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        cmbThang = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        ychNam = new com.toedter.calendar.JYearChooser();
        jLabel8 = new javax.swing.JLabel();
        cmbPhongBan = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cmbPhanXuong = new javax.swing.JComboBox<>();
        chkToanCongTy = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();

        setMinimumSize(new java.awt.Dimension(1366, 741));
        setPreferredSize(new java.awt.Dimension(1366, 741));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Báo Cáo Khoản Chi LươngTheo Đơn Vị");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1304, 40));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(56, 91, 56)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Tháng:");
        jLabel18.setToolTipText("");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        cmbThang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cmbThang.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbThangItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbThang, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 60, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Năm:");
        jLabel15.setToolTipText("");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 60, 20));

        ychNam.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ychNamPropertyChange(evt);
            }
        });
        jPanel1.add(ychNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 65, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Phòng Ban:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 120, -1));

        cmbPhongBan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbPhongBan.setForeground(new java.awt.Color(0, 99, 0));
        cmbPhongBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPhongBanActionPerformed(evt);
            }
        });
        jPanel1.add(cmbPhongBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 190, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Phân Xưởng:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 120, -1));

        cmbPhanXuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbPhanXuong.setForeground(new java.awt.Color(0, 99, 0));
        cmbPhanXuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPhanXuongActionPerformed(evt);
            }
        });
        jPanel1.add(cmbPhanXuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 190, -1));

        chkToanCongTy.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chkToanCongTy.setForeground(new java.awt.Color(0, 96, 0));
        chkToanCongTy.setText("Toàn công ty");
        chkToanCongTy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkToanCongTyActionPerformed(evt);
            }
        });
        jPanel1.add(chkToanCongTy, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 160, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 50, 420, 690));
        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 395, 880, 340));
        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 880, 340));
    }// </editor-fold>//GEN-END:initComponents

    private void cmbThangItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbThangItemStateChanged
        xuLyThayDoiNgayThang();
    }//GEN-LAST:event_cmbThangItemStateChanged

    private void ychNamPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ychNamPropertyChange
        xuLyThayDoiNgayThang();
    }//GEN-LAST:event_ychNamPropertyChange

    private void cmbPhongBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPhongBanActionPerformed
        xuLyCmbPhongBan();
    }//GEN-LAST:event_cmbPhongBanActionPerformed

    private void cmbPhanXuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPhanXuongActionPerformed
        xuLyCmbPhanXuong();
    }//GEN-LAST:event_cmbPhanXuongActionPerformed

    private void chkToanCongTyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkToanCongTyActionPerformed
        xuLyChkToanCongTy();
    }//GEN-LAST:event_chkToanCongTyActionPerformed
    private void initCommon() throws SQLException {
        ConnectDB.getInstance();
        ConnectDB.connect();
        tinhLuongCongNhan_Dao = new TinhLuongCongNhan_Dao();
        tinhLuongHanhChanh_Dao = new TinhLuongHanhChanh_Dao();
        phongBans = new PhongBan_Dao().getDanhSachPhongBan();
        phanXuongs = new PhanXuong_Dao().getDanhSachPhanXuong();
        bieuDoCotPb = new BieuDoCot();
        bieuDoCotPx = new BieuDoCot();
        jScrollPane2.setViewportView(bieuDoCotPb.createDemoPanel("Phòng ban"));
        jScrollPane1.setViewportView(bieuDoCotPx.createDemoPanel("Phân xưởng"));
        doDuLieuPhongBan();
        doDuLieuPhanXuong();
    }

    public void doDuLieuPhongBan() {
        for (PhongBan pBan : phongBans) {
            String tenPhongBan = pBan.getTenPhongBan();
            cmbPhongBan.addItem(tenPhongBan);
        }
        cmbPhongBan.setSelectedIndex(-1);
    }

    public void doDuLieuPhanXuong() {
        for (PhanXuong pXuong : phanXuongs) {
            String tenPhanXuong = pXuong.getTenPhanXuong();
            cmbPhanXuong.addItem(tenPhanXuong);
        }
        cmbPhanXuong.setSelectedIndex(-1);
    }

    private void taoBieuDoPb(List<LuongHanhChanh> luongHanhChanhs) {
        bieuDoCotPb.clearData();
        for (LuongHanhChanh lhc : luongHanhChanhs) {
            bieuDoCotPb.addData((double) lhc.getTongLuong(), "Lương", lhc.getNhanVienHanhChanh().getHoVaTen());
        }
    }

    private void taoBieuDoPx(List<LuongCongNhan> luongCongNhans) {
        bieuDoCotPx.clearData();
        for (LuongCongNhan lcn : luongCongNhans) {
            bieuDoCotPx.addData((double) lcn.getTongLuong(), "Lương", lcn.getNhanVienSanXuat().getHoVaTen());
        }
    }

    private void xuLyThayDoiNgayThang() {
        int chonPb = cmbPhongBan.getSelectedIndex();
        int chonPx = cmbPhanXuong.getSelectedIndex();
        String thang = (String) cmbThang.getSelectedItem();
        int nam = ychNam.getValue();
        chkToanCongTy.setSelected(false);
        if (chonPb != -1) {
            taoBieuDoPb(tinhLuongHanhChanh_Dao.getDanhSangLuongTheoPhongBanVaThang(phongBans.get(chonPb).getMaPhongBan(), thang + "-" + nam));
        }
        if (chonPx != -1) {
            taoBieuDoPx(tinhLuongCongNhan_Dao.getDanhSachLuongTheoPhanXuongVaThang(phanXuongs.get(chonPx).getMaPhanXuong(), thang + "-" + nam));
        }
    }

    private void xuLyCmbPhongBan() {
        int chonPb = cmbPhongBan.getSelectedIndex();
        String thang = (String) cmbThang.getSelectedItem();
        int nam = ychNam.getValue();
        chkToanCongTy.setSelected(false);
        if (chonPb != -1) {
            taoBieuDoPb(tinhLuongHanhChanh_Dao.getDanhSangLuongTheoPhongBanVaThang(phongBans.get(chonPb).getMaPhongBan(), thang + "-" + nam));
        }
    }

    private void xuLyCmbPhanXuong() {
        int chonPx = cmbPhanXuong.getSelectedIndex();
        String thang = (String) cmbThang.getSelectedItem();
        int nam = ychNam.getValue();
        chkToanCongTy.setSelected(false);
        if (chonPx != -1) {
            taoBieuDoPx(tinhLuongCongNhan_Dao.getDanhSachLuongTheoPhanXuongVaThang(phanXuongs.get(chonPx).getMaPhanXuong(), thang + "-" + nam));
        }
    }

    private void xuLyChkToanCongTy() {
        taoBieuDoPb(tinhLuongHanhChanh_Dao.getDanhSachLuong());
        taoBieuDoPx(tinhLuongCongNhan_Dao.getDanhSachLuong());
    }
    private BieuDoCot bieuDoCotPb;
    private BieuDoCot bieuDoCotPx;
    private LuongHanhChanh luongHanhChanh;
    private List<PhongBan> phongBans;
    private List<PhanXuong> phanXuongs;
    private TinhLuongHanhChanh_Dao tinhLuongHanhChanh_Dao;
    private TinhLuongCongNhan_Dao tinhLuongCongNhan_Dao;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkToanCongTy;
    private javax.swing.JComboBox<String> cmbPhanXuong;
    private javax.swing.JComboBox<String> cmbPhongBan;
    private javax.swing.JComboBox<String> cmbThang;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JYearChooser ychNam;
    // End of variables declaration//GEN-END:variables
}
