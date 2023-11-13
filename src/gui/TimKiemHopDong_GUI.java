package gui;

import connect.ConnectDB;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import dao.HopDong_Dao;
import entity.HopDongSanXuat;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
/**
 *
 * @author ADMIN
 */
public class TimKiemHopDong_GUI extends javax.swing.JPanel {

    private SimpleDateFormat dinhDangNgay;

    /**
     * Creates new form NhanVienHanhChinh
     */
    public TimKiemHopDong_GUI() throws SQLException{
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtGiaTien = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        dchNgayBatDau = new com.toedter.calendar.JDateChooser();
        dchNgayKetThuc = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 96, 59), 2), "Danh Sách Hợp Đồng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 99, 0))); // NOI18N

        jTable1.setBackground(new java.awt.Color(184, 206, 224));
        jTable1.setToolTipText("");
        jTable1.setSelectionBackground(new java.awt.Color(144, 237, 144));
        jTable1.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 277, 1300, 465));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMa.setForeground(new java.awt.Color(0, 96, 0));
        jPanel1.add(txtMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 190, -1));

        txtTen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTen.setForeground(new java.awt.Color(0, 96, 0));
        txtTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenActionPerformed(evt);
            }
        });
        jPanel1.add(txtTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 190, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Tên Hợp Đồng:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 120, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Ngày Bắt Đầu:");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 120, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Ngày Kết Thúc:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 120, 20));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Mã Hợp Đồng:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 120, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Giá Tiền:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 70, 20));

        txtGiaTien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtGiaTien.setForeground(new java.awt.Color(0, 96, 0));
        txtGiaTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaTienActionPerformed(evt);
            }
        });
        jPanel1.add(txtGiaTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 190, -1));

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
        jPanel1.add(btnTim, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 190, 130, 30));

        jButton10.setBackground(new java.awt.Color(152, 249, 152));
        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
        jButton10.setText("Làm Mới");
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 190, 120, 30));

        dchNgayBatDau.setDateFormatString("dd/MM/yyyy");
        jPanel1.add(dchNgayBatDau, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 190, -1));

        dchNgayKetThuc.setDateFormatString("dd/MM/yyyy");
        jPanel1.add(dchNgayKetThuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 140, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 1114, 230));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tìm Kiếm Hợp Đồng Sản Xuất");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 50));
    }// </editor-fold>//GEN-END:initComponents
    private void setTable() {
        //setTable ở đây
        modelHopDong = new DefaultTableModel(
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
        jTable1.setModel(modelHopDong);

        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        jTable1.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));
        jTable1.getColumnModel().getColumn(0).setCellRenderer(center);
        jTable1.getColumnModel().getColumn(1).setCellRenderer(center);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(center);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(center);
        jTable1.getColumnModel().getColumn(4).setCellRenderer(center);
    }
    private void txtTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenActionPerformed

    private void txtGiaTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaTienActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
        timkiemHopDong();
    }//GEN-LAST:event_btnTimActionPerformed
    private void initCommon() throws SQLException{
        ConnectDB.getInstance();
        ConnectDB.connect();
        hopDong_Dao = new HopDong_Dao();
        dinhDangNgay = new SimpleDateFormat("dd/MM/yyyy");
        //  border_Selected = new Border_Selected();
        doDuLieu();
    }
    
    private void timkiemHopDong(){
        modelHopDong.setRowCount(0); // Xóa dữ liệu hiện tại trong bảng để hiển thị kết quả tìm kiếm mới
        int i=1;
        for(HopDongSanXuat hp : hopDong_Dao.getDanhSachHopDong()){
            boolean thoaMan = false; 
            if (!txtMa.getText().isEmpty()) {
                if (hp.getMaHopDong().equalsIgnoreCase(txtMa.getText())) {
                    thoaMan = true;
                }
            }
            if (!txtTen.getText().isEmpty()) {
                if (hp.getTenHopDong().equalsIgnoreCase(txtTen.getText())) {
                    thoaMan = true;
                }
            }
            if (!txtGiaTien.getText().isEmpty()) {
                if (String.valueOf(hp.getGiaTien()).equalsIgnoreCase(txtGiaTien.getText())) {
                    thoaMan = true;
                }
            }
            if (dchNgayBatDau.getDate() != null) {
                if(dinhDangNgay.format(hp.getNgayBatDau()).equalsIgnoreCase(dinhDangNgay.format(dchNgayBatDau.getDate()))) {
                    thoaMan = true;
                }
            }
            if (dchNgayKetThuc.getDate() != null) {
                if(dinhDangNgay.format(hp.getNgayKetThuc()).equalsIgnoreCase(dinhDangNgay.format(dchNgayKetThuc.getDate()))) {
                    thoaMan = true;
                }
            }
            
            if (thoaMan) {
                Object[] rowData = {
                    hp.getMaHopDong(),
                    hp.getTenHopDong(),
                    dinhDangNgay.format(hp.getNgayBatDau()),
                    dinhDangNgay.format(hp.getNgayKetThuc()),
                    hp.getGiaTien()
                };
                modelHopDong.addRow(rowData);
            }
            
        }
    }
    
    
    private void doDuLieu() {
        doDuLieuHopDong();
    }
    
    private void doDuLieuHopDong() {
        for(HopDongSanXuat hp : hopDong_Dao.getDanhSachHopDong()){
             Object[] objects = {
                hp.getMaHopDong(),
                hp.getTenHopDong(),
                dinhDangNgay.format(hp.getNgayBatDau()),
                dinhDangNgay.format(hp.getNgayKetThuc()),
                hp.getGiaTien()
             };
            modelHopDong.addRow(objects);        
        }
    }
    
    
    
    // private Border_Selected border;
    private HopDong_Dao hopDong_Dao;
    private DefaultTableModel modelHopDong;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTim;
    private com.toedter.calendar.JDateChooser dchNgayBatDau;
    private com.toedter.calendar.JDateChooser dchNgayKetThuc;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtGiaTien;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables

    
}
