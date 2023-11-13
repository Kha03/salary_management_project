package gui;

import connect.ConnectDB;
import dao.CongDoan_Dao;
import dao.SanPham_Dao;
import entity.CongDoan;
import entity.SanPham;
import handle.borderselected.Border_Selected;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class TimKiemCongDoan_GUI extends javax.swing.JPanel {


    /**
     * Creates new form ChamCongHanhChinh
     * @throws java.sql.SQLException
     */
    public TimKiemCongDoan_GUI() throws SQLException {
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
        jTable4 = new javax.swing.JTable();
        txtMa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTenCongDoan = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtGiaTien = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnTim = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtTienDo = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(1200, 674));
        setPreferredSize(new java.awt.Dimension(1200, 674));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 96, 59), 2), "Danh Sách Công Đoạn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 99, 0))); // NOI18N
        jScrollPane4.setPreferredSize(new java.awt.Dimension(462, 430));

        jTable4.setBackground(new java.awt.Color(184, 206, 224));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable4.setToolTipText("");
        jTable4.setSelectionBackground(new java.awt.Color(144, 237, 144));
        jTable4.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jTable4.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jTable4);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 1300, 470));

        txtMa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMa.setForeground(new java.awt.Color(0, 96, 0));
        add(txtMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 180, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tìm Kiếm Công Đoạn Sản Phẩm");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 1300, 40));

        txtTenCongDoan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTenCongDoan.setForeground(new java.awt.Color(0, 96, 0));
        txtTenCongDoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenCongDoanActionPerformed(evt);
            }
        });
        add(txtTenCongDoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 180, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Tên Công Đoạn:");
        jLabel16.setToolTipText("");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 120, -1));

        txtGiaTien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtGiaTien.setForeground(new java.awt.Color(0, 96, 0));
        add(txtGiaTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 180, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Mã Công Đoạn:");
        jLabel18.setToolTipText("");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 120, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Giá Tiền:");
        jLabel20.setToolTipText("");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 120, -1));

        btnTim.setBackground(new java.awt.Color(152, 249, 152));
        btnTim.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        btnTim.setText("Tìm Kiếm");
        btnTim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });
        add(btnTim, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 230, 130, 30));

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
        add(btnLamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 230, 120, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Tiến Độ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, -1, -1));

        txtTienDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTienDoActionPerformed(evt);
            }
        });
        add(txtTienDo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 180, -1));
        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 230));

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
        jScrollPane6.setViewportView(tblSanPham);

        add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 260));
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenCongDoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenCongDoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenCongDoanActionPerformed

    private void txtTienDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTienDoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTienDoActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
        timkiemCongDoanSanPham();
    }//GEN-LAST:event_btnTimActionPerformed

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        // TODO add your handling code here:
        xuLyThayDoiTblSanPham(); 
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
        lamMoiBang();
        lamMoiDong();
        doDuLieuSanPham(sanPhams);
        doDuLieuCCSP();
    }//GEN-LAST:event_btnLamMoiActionPerformed
    private void setTable() {
        //setTable ở đây
        modelSanPham = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "STT", "Mã", "Sản Phẩm"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false
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
        tblSanPham.setModel(modelSanPham);
        tblSanPham.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblSanPham.getColumnModel().getColumn(1).setPreferredWidth(70);
        tblSanPham.getColumnModel().getColumn(2).setPreferredWidth(174);
        tblSanPham.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));
        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        //table chấm công
        modelChamCong = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "STT", "Tên Công đoạn", "Mã công đoạn", "Đơn giá", "Tiến độ"}
        ) {
            Class[] types = new Class[]{
                 java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                 false, false, false, false, false,};

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        jTable4.setModel(modelChamCong);
        jTable4.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTable4.getColumnModel().getColumn(1).setPreferredWidth(130);
        jTable4.getColumnModel().getColumn(2).setPreferredWidth(150);
        jTable4.getColumnModel().getColumn(3).setPreferredWidth(130);
        jTable4.getColumnModel().getColumn(4).setPreferredWidth(130);
//        jTable4.getColumnModel().getColumn(5).setPreferredWidth(130);
//        jTable4.getColumnModel().getColumn(6).setPreferredWidth(60);
        jTable4.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));
    }
    
    
    private void initCommon() throws SQLException {
        ConnectDB.getInstance();
        ConnectDB.connect();
        congDoan_Dao = new CongDoan_Dao();
        sanPham_Dao = new SanPham_Dao();
        border_Selected = new Border_Selected();
        df = new DecimalFormat("#,##0"); // Số lẻ số # để hiển thị đủ chữ số thập phân
        doDuLieuSanPham(sanPham_Dao.getDanhSachSanPham());
        doDuLieuCongDoan(congDoan_Dao.getDanhSachCongDoan());
    }
    public void lamMoiBang() {
        modelChamCong.setRowCount(0);
        modelSanPham.setRowCount(0);
    }
    public void lamMoiDong() {
        txtMa.setText("");
        txtTenCongDoan.setText("");
        txtTienDo.setText("");
        txtGiaTien.setText("");
    }
    private void doDuLieuCCSP(){
        int i =1;
        for(CongDoan ccsp: congDoan_Dao.getDanhSachCongDoan()){
            Object[] objects = {
                i++,
                ccsp.getTenCongDoan(),
                ccsp.getMaCongDoan(),
                df.format(ccsp.getGiaTien())+ "VND",
                ccsp.getTienDo()
            };    
            modelChamCong.addRow(objects);
                
        }
    }
    private void timkiemCongDoanSanPham(){
        modelChamCong.setRowCount(0); // Xóa dữ liệu hiện tại trong bảng để hiển thị kết quả tìm kiếm mới
        int i = 1;
        for(CongDoan cd : congDoan_Dao.getDanhSachCongDoan()){
            boolean thoaMan = false; 
            if (!txtMa.getText().isEmpty()) {
                if (cd.getMaCongDoan().equalsIgnoreCase(txtMa.getText())) {
                    thoaMan = true;
                }
            }
            if (!txtTenCongDoan.getText().isEmpty()) {
                if (cd.getTenCongDoan().equalsIgnoreCase(txtTenCongDoan.getText())) {
                    thoaMan = true;
                }
            }
            if (!txtTienDo.getText().isEmpty()) {
                if (String.valueOf(cd.getTienDo()).equalsIgnoreCase(txtTienDo.getText())) {
                    thoaMan = true;
                }
            }
            if (!txtGiaTien.getText().isEmpty()) {
                if (String.valueOf(cd.getGiaTien()).equalsIgnoreCase(txtGiaTien.getText())) {
                    thoaMan = true;
                }
            }
            if (thoaMan) {
                Object[] rowData = {
                    i++,
                    cd.getTenCongDoan(),
                    cd.getMaCongDoan(),
                    df.format(cd.getGiaTien())+ "VND",
                    cd.getTienDo(),
                };
                modelChamCong.addRow(rowData);
            }
        }
    }
    
     private void doDuLieuSanPham(List<SanPham> sanPhams) {
        int i = 0;
        for (SanPham sanPham : sanPhams) {
            sanPhams.get(i).setCongDoanThucHien(congDoan_Dao.getDanhSachCongDoanTheoSanPham(sanPham.getMaSanPham()));
            Object[] objects = {++i,sanPham.getMaSanPham() ,sanPham.getTenSanPham()};
            modelSanPham.addRow(objects);
        }
        this.sanPhams = sanPhams;
    }

    private void doDuLieuCongDoan(List<CongDoan> congDoans) {
        int i = 1;
        for (CongDoan congDoan : congDoans) {
            Object[] objects = {i, congDoan.getTenCongDoan(), congDoan.getMaCongDoan(), df.format(congDoan.getGiaTien()) + "VND", congDoan.getTienDo()};
            modelChamCong.addRow(objects);
            i++;
        }
        this.congDoans = congDoans;
    }
    private void xuLyThayDoiTblSanPham() {
        int hang = tblSanPham.getSelectedRow();
        if (hang != -1) {
            modelChamCong.setRowCount(0);
//            txtSanPham.setText(sanPhams.get(hang).getTenSanPham());
            doDuLieuCongDoan(sanPhams.get(hang).getCongDoanThucHien());
        }
    }
    
    private DecimalFormat df;
    private List<CongDoan> congDoans;
    private SanPham_Dao sanPham_Dao;
    private List<SanPham> sanPhams;
    private CongDoan_Dao congDoan_Dao;
    private Border_Selected border_Selected;
    private DefaultTableModel modelDonVi;
    private DefaultTableModel modelNhanVien;
    private DefaultTableModel modelSanPham;
    private DefaultTableModel modelChamCong;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnTim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtGiaTien;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtTenCongDoan;
    private javax.swing.JTextField txtTienDo;
    // End of variables declaration//GEN-END:variables

    
}
