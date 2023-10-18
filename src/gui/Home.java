package gui;

import java.awt.Component;
import java.awt.Toolkit;

/**
 *
 * @author ADMIN
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/image/ava.jpg")));
        initComponents();
        taoMenu();
        jPanel1.add(new Home_GUI());
        menu1.setEvent((int index, int subIndex) -> {
        //    System.out.println(index + "  " + subIndex);
            kiemTraNhanMenu(index, subIndex);
        });
    }

//    public Home(String pass) {
//        setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/image/ava.jpg")));
//        initComponents();
//        initLayouts();
//        checkPermiss(pass);
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        scrollPaneWin111 = new handle.scrollwin11.ScrollPaneWin11();
        menu1 = new handle.menu.Menu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phần mềm tính lương");
        setLocation(new java.awt.Point(-5, 25));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(62, 83, 99));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1315, 741));
        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 0, 1315, 780));

        jPanel2.setBackground(new java.awt.Color(62, 83, 99));
        jPanel2.setPreferredSize(new java.awt.Dimension(230, 780));

        scrollPaneWin111.setViewportView(menu1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneWin111, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneWin111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 235, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kiemTraNhanMenu(int index, int subIndex) {
        switch (index) {
            case 0 -> hienThiTrang(new Home_GUI());
            case 1 -> {
                switch (subIndex) {
                    case 1 ->
                        hienThiTrang(new NhanVienHanhChinh_GUI());
                    case 2 ->
                        hienThiTrang(new NhanVienSanXuat_GUI());
                    case 3 ->
                        hienThiTrang(new PhongBan_GUI());
                    case 4 ->
                        hienThiTrang(new PhanXuong_GUI());
                    default ->
                        hienThiTrang(new PhuCap_GUI());
                }
            }
            case 2 -> {
                switch (subIndex) {
                    case 1 ->
                        hienThiTrang(new HopDong_GUI());
                    case 2 ->
                        hienThiTrang(new SanPham_GUI());
                    default ->
                        hienThiTrang(new CongDoan_GUI());
                }
            }
            case 3 -> {
                switch (subIndex) {
                    case 1 ->
                        hienThiTrang(new CapNhatPhuCap_GUI());
                }
            }
            case 4 -> {
                switch (subIndex) {
                    case 1 ->
                        hienThiTrang(new PhanCongSanXuat_GUI());
                    case 2 ->
                        hienThiTrang(new ChamCongHanhChinh_GUI());
                    case 3 ->
                        hienThiTrang(new ChamCongSanPham_GUI());
                    case 4 ->
                        hienThiTrang(new TinhLuongHanhChinh_GUI());
                    default ->
                        hienThiTrang(new TinhLuongSanXuat_GUI());
                }
            }
            case 5 -> {
                switch (subIndex) {
                    case 1 ->
                        hienThiTrang(new TimKiemNhanVien_GUI());
                    case 2 ->
                        hienThiTrang(new TimKiemPhanCong_GUI());
                    case 3 ->
                        hienThiTrang(new TimKiemChamCong_GUI());
                    default ->
                        hienThiTrang(new TimKiemBangLuong_GUI());
                }
            }
            case 6 -> {
                switch (subIndex) {
                    case 1 ->
                        hienThiTrang(new BaoCaoLuong_GUI());
                }
            }
            default -> {
            }
        }
    }

    private void hienThiTrang(Component com) {
        jPanel1.removeAll();
        jPanel1.add(com);
        jPanel1.repaint();
        jPanel1.revalidate();
    }

    private void taoMenu() {
        String[][] menuItems = new String[][]{
            {"Trang Chủ"},
            {"Danh Mục", "Nhân Viên Hành Chính", "Nhân Viên Sản Xuất", "Phòng Ban", "Phân Xưởng", "Phụ Cấp Nhân Viên"},
            {"Danh Mục", "Hợp Đồng", "Sản Phẩm", "Công Đoạn"},
            {"Cập Nhật", "Cập Nhật Phụ Cấp Nhân Viên"},
            {"Xử Lý", "Phân Công Nhân Viên", "Chấm Công Hành Chính", "Chấm Công Sản Phẩm", "Tính Lương Hành Chính", "Tính Lương Sản Xuất"},
            {"Tìm Kiếm", "Tìm Kiếm Nhân Viên", "Tìm Kiếm Phân Công", "Tìm Kiếm Chấm Công", "Tìm Kiếm Bảng Lương"},
            {"Báo Cáo Thống Kê", "Báo Cáo Khoản Chi Lương"}, // {"Tìm Kiếm", "Tìm Kiếm Hợp Đồng", "Tìm Kiếm Sản Phẩm","Tìm Kiếm Công Đoạn"},
        };
        menu1.setMenu(menuItems);
    }

    private void kiemTraMatKhau(String pass) {
        if (pass.equalsIgnoreCase("123")) {

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private handle.menu.Menu menu1;
    private handle.scrollwin11.ScrollPaneWin11 scrollPaneWin111;
    // End of variables declaration//GEN-END:variables
}
