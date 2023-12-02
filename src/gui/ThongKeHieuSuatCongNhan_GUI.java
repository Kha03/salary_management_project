package gui;

import chart.BieuDoDuong;
import chart.BieuDoTron;
import connect.ConnectDB;
import dao.ChamCongSanPham_Dao;
import dao.CongDoan_Dao;
import dao.HopDong_Dao;
import dao.SanPham_Dao;
import entity.ChamCongSanPham;
import entity.CongDoan;
import entity.HopDongSanXuat;
import entity.SanPham;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import org.apache.commons.math3.dfp.Dfp;

/**
 *
 * @author ADMIN
 */
public class ThongKeHieuSuatCongNhan_GUI extends javax.swing.JPanel {

    /**
     * Creates new form ChamCongHanhChinh
     */
    public ThongKeHieuSuatCongNhan_GUI() throws SQLException {
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
        jLabel20 = new javax.swing.JLabel();
        cmbHopDong = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        cmbCongDoan = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        cmbSanPham = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(1366, 741));
        setPreferredSize(new java.awt.Dimension(1366, 741));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Báo Cáo Khoản Chi LươngTheo Đơn Vị");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1304, 40));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(56, 91, 56)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Hợp Đồng:");
        jLabel20.setToolTipText("");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        cmbHopDong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbHopDong.setForeground(new java.awt.Color(0, 99, 0));
        cmbHopDong.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbHopDongItemStateChanged(evt);
            }
        });
        cmbHopDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHopDongActionPerformed(evt);
            }
        });
        jPanel1.add(cmbHopDong, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 210, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Công Đoạn:");
        jLabel22.setToolTipText("");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        cmbCongDoan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbCongDoan.setForeground(new java.awt.Color(0, 99, 0));
        cmbCongDoan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCongDoanItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbCongDoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 210, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("Sản Phẩm:");
        jLabel23.setToolTipText("");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        cmbSanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbSanPham.setForeground(new java.awt.Color(0, 99, 0));
        cmbSanPham.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSanPhamItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 210, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 50, 420, 690));
        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 880, 680));
    }// </editor-fold>//GEN-END:initComponents

    private void cmbHopDongItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbHopDongItemStateChanged
        xuLyThayDoiCmbHopDong();
    }//GEN-LAST:event_cmbHopDongItemStateChanged

    private void cmbHopDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHopDongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbHopDongActionPerformed

    private void cmbCongDoanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCongDoanItemStateChanged
        xuLyThayDoiCmbCongDoan();
    }//GEN-LAST:event_cmbCongDoanItemStateChanged

    private void cmbSanPhamItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSanPhamItemStateChanged
        xuLyThayDoiCmbSanPham();
    }//GEN-LAST:event_cmbSanPhamItemStateChanged
    private void initCommon() throws SQLException {
        ConnectDB.getInstance();
        ConnectDB.connect();
        dinhDangNgay = new SimpleDateFormat("dd/MM/yyyy");
        chamCongSanPham_Dao = new ChamCongSanPham_Dao();
        hopDong_Dao = new HopDong_Dao();
        congDoan_Dao = new CongDoan_Dao();
        sanPham_Dao = new SanPham_Dao();
        bieuDoDuong = new BieuDoDuong();
        jPanel2.add(bieuDoDuong.createDemoPanel("Hiệu suất nhân viên"));
        doDuLieuHopDong(hopDong_Dao.getDanhSachHopDong());
    }

    private void doDuLieuSanPham(List<SanPham> sanPhams) {
        this.sanPhams = sanPhams;
        for (SanPham sanPham : sanPhams) {
            cmbSanPham.addItem(sanPham.getTenSanPham());
        }
    }

    private void doDuLieuHopDong(List<HopDongSanXuat> hopDongSanXuats) {
        this.hopDongs = hopDongSanXuats;
        int soLuong = hopDongSanXuats.size();
        for (int i = soLuong - 1; i >= 0; i--) {
            cmbHopDong.addItem(hopDongSanXuats.get(i).getTenHopDong());
        }
    }

    private void doDuLieuCongDoan(List<CongDoan> congDoans) {
        this.congDoans = congDoans;
        for (CongDoan congDoan : congDoans) {
            cmbCongDoan.addItem(congDoan.getTenCongDoan());
        }
    }

    private void xuLyThayDoiCmbSanPham() {
        int hang = cmbSanPham.getSelectedIndex();
        if (hang != -1) {
            cmbCongDoan.removeAllItems();
            doDuLieuCongDoan(congDoan_Dao.getDanhSachCongDoanTheoSanPham(sanPhams.get(hang).getMaSanPham()));
        }
    }

    private void xuLyThayDoiCmbHopDong() {
        int i = cmbHopDong.getSelectedIndex();
        if (i != -1) {
            int soLuong = hopDongs.size();
            int viTri = soLuong - i - 1;
            cmbSanPham.removeAllItems();
            doDuLieuSanPham(sanPham_Dao.getDanhSachSanPhamTheoMaHd(hopDongs.get(viTri).getMaHopDong()));
        }
    }

    private void xuLyThayDoiCmbCongDoan() {
        int i = cmbCongDoan.getSelectedIndex();
        if (i != -1) {
            taoBieuDo(chamCongSanPham_Dao.getChamCongSanPhamTheoMaCongDoan(congDoans.get(i).getMaCongDoan()));
        }
    }

    private void taoBieuDo(List<ChamCongSanPham> chamCongSanPhams) {
        bieuDoDuong.clearData();
        for (ChamCongSanPham chamCong : chamCongSanPhams) {
            bieuDoDuong.addData(chamCong.getSoLuong(), chamCong.getNhanVienSanXuat().getHoVaTen(), dinhDangNgay.format(chamCong.getNgayLamViec()));
        }
    }

    private List<HopDongSanXuat> hopDongs;
    private List<CongDoan> congDoans;
    private List<SanPham> sanPhams;
    private CongDoan_Dao congDoan_Dao;
    private SanPham_Dao sanPham_Dao;
    private HopDong_Dao hopDong_Dao;
    private SimpleDateFormat dinhDangNgay;
    private ChamCongSanPham_Dao chamCongSanPham_Dao;
    private BieuDoDuong bieuDoDuong;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbCongDoan;
    private javax.swing.JComboBox<String> cmbHopDong;
    private javax.swing.JComboBox<String> cmbSanPham;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}