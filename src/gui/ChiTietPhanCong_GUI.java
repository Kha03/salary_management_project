package gui;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import entity.NhanVienSanXuat;
import entity.PhanCongSanXuat;
import java.beans.PropertyVetoException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class ChiTietPhanCong_GUI extends javax.swing.JInternalFrame {

    private SimpleDateFormat dinhDangNgay;

    /**
     * Creates new form demo
     *
     * @param phanCongSanXuat
     */
    public ChiTietPhanCong_GUI(PhanCongSanXuat phanCongSanXuat) {
        initComponents();
        setTable();
        initCommon(phanCongSanXuat);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton13 = new javax.swing.JButton();
        lblPhanXuong = new javax.swing.JLabel();
        lblMaPhanCong = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        jButton14 = new javax.swing.JButton();
        lblNgay = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblTenSanPham = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lblCongDoan = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lblSoNhanVien = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        lblMaSanPham = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Chi Tiết Phân Công");
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setPreferredSize(new java.awt.Dimension(1200, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton13.setBackground(new java.awt.Color(152, 249, 152));
        jButton13.setText("Đóng");
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 40, -1, 30));

        lblPhanXuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPhanXuong.setForeground(new java.awt.Color(0, 99, 0));
        lblPhanXuong.setToolTipText("");
        getContentPane().add(lblPhanXuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 150, 20));

        lblMaPhanCong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMaPhanCong.setForeground(new java.awt.Color(0, 99, 0));
        lblMaPhanCong.setToolTipText("");
        getContentPane().add(lblMaPhanCong, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 140, 20));

        jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 96, 59), 2), "Danh Sách Phân Công", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 99, 0))); // NOI18N
        jScrollPane4.setMinimumSize(new java.awt.Dimension(1200, 600));
        jScrollPane4.setPreferredSize(new java.awt.Dimension(1200, 600));

        tblNhanVien.setBackground(new java.awt.Color(184, 206, 224));
        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblNhanVien.setToolTipText("");
        tblNhanVien.setSelectionBackground(new java.awt.Color(144, 237, 144));
        tblNhanVien.setSelectionForeground(new java.awt.Color(51, 51, 51));
        tblNhanVien.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tblNhanVien);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1190, 490));

        jButton14.setBackground(new java.awt.Color(152, 249, 152));
        jButton14.setText("Xuất Pdf");
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 40, -1, 30));

        lblNgay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNgay.setForeground(new java.awt.Color(0, 99, 0));
        lblNgay.setToolTipText("");
        getContentPane().add(lblNgay, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 140, 20));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Ngày:");
        jLabel16.setToolTipText("");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, 60, -1));
        jLabel16.getAccessibleContext().setAccessibleName("Tổng Lương:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Mã Phân Công:");
        jLabel17.setToolTipText("");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Phân Xưởng:");
        jLabel20.setToolTipText("");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 120, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Sản Phẩm:");
        jLabel21.setToolTipText("");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 80, -1));

        lblTenSanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTenSanPham.setForeground(new java.awt.Color(0, 99, 0));
        lblTenSanPham.setToolTipText("");
        getContentPane().add(lblTenSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 140, 20));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Công Đoạn:");
        jLabel22.setToolTipText("");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 90, -1));

        lblCongDoan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCongDoan.setForeground(new java.awt.Color(0, 99, 0));
        lblCongDoan.setToolTipText("");
        getContentPane().add(lblCongDoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 10, 200, 20));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setText("Số Nhân Viên:");
        jLabel31.setToolTipText("");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 110, -1));

        lblSoNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSoNhanVien.setForeground(new java.awt.Color(0, 99, 0));
        lblSoNhanVien.setToolTipText("");
        getContentPane().add(lblSoNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 40, 140, 20));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setText("Mã Sản Phẩm:");
        jLabel33.setToolTipText("");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 100, -1));

        lblMaSanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMaSanPham.setForeground(new java.awt.Color(0, 99, 0));
        lblMaSanPham.setToolTipText("");
        getContentPane().add(lblMaSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 10, 140, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        try {
            this.setClosed(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ChiTietPhanCong_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        xuLyXuatPdf();
    }//GEN-LAST:event_jButton14ActionPerformed
    private void initCommon(PhanCongSanXuat phanCongSanXuat) {
        dinhDangNgay = new SimpleDateFormat("dd/MM/yyyy");
        doDuLieuLbl(phanCongSanXuat);
        doDuLieuNhanVien(phanCongSanXuat.getNhanVienSanXuat());
    }

    private void setTable() {
        dtmNhanVien = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "STT", "Tên nhân viên", "Mã nhân viên"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,};
            boolean[] canEdit = new boolean[]{
                false,
                false,
                false,};

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        tblNhanVien.setModel(dtmNhanVien);
        tblNhanVien.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));
    }

    private void doDuLieuLbl(PhanCongSanXuat phanCongSanXuat) {
        lblMaPhanCong.setText(phanCongSanXuat.getMaPhanCong());
        lblPhanXuong.setText(phanCongSanXuat.getPhanXuong().getTenPhanXuong());
        lblMaSanPham.setText(phanCongSanXuat.getSanPham().getMaSanPham());
        lblTenSanPham.setText(phanCongSanXuat.getSanPham().getTenSanPham());
        lblCongDoan.setText(phanCongSanXuat.getCongDoan().getTenCongDoan());
        lblSoNhanVien.setText(String.valueOf(phanCongSanXuat.getNhanVienSanXuat().size()));
        lblNgay.setText(dinhDangNgay.format(phanCongSanXuat.getNgayPhanCong()));
    }

    private void doDuLieuNhanVien(List<NhanVienSanXuat> nhanVienSanXuats) {
        int i = 1;
        for (NhanVienSanXuat nhanVienSanXuat : nhanVienSanXuats) {
            Object[] object = {i, nhanVienSanXuat.getHoVaTen(), nhanVienSanXuat.getMaNhanVienSanXuat()};
            i++;
            dtmNhanVien.addRow(object);
        }
    }

    private void xuLyXuatPdf() {
        String ngay = lblNgay.getText().replace('/', '_');
        String tenPhanCong = lblMaPhanCong.getText() + "-" + lblPhanXuong.getText() + ngay;
        String tenFile = tenPhanCong + ".pdf";
        // Tạo hộp thoại chọn tệp
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Chọn nơi lưu");
        // Đặt tên mặc định cho tệp
        fileChooser.setSelectedFile(new File(tenFile));
        // Đặt bộ lọc cho chỉ chọn file có đuôi .pdf
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Pdf Files (*.pdf)", "pdf");
        fileChooser.setFileFilter(filter);
        //Đường dẫn mặc định
        fileChooser.setCurrentDirectory(new File("D:\\"));
        // Hiển thị hộp thoại chọn tệp và kiểm tra xem người dùng đã chọn đường dẫn hay chưa
        int userSelection = fileChooser.showSaveDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            // Lấy đường dẫn đã chọn
            String filePath = fileChooser.getSelectedFile().getAbsolutePath();
            // Thêm đuôi .xlsx nếu người dùng không nhập
            if (!filePath.toLowerCase().endsWith(".pdf")) {
                filePath += ".pdf";
            }
            // In đường dẫn để kiểm tra
            xuatFilePdf(filePath, tenFile);
        }
    }

    private void xuatFilePdf(String filePath, String tenFile) {
        Document document = new Document(PageSize.A3.rotate());
        tenFile = tenFile.substring(0, tenFile.lastIndexOf('.'));
        try {
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();
            float[] columnWidths = {5f, 15f, 15f};
            // Sử dụng font Arial
//            InputStream fontStream = TinhLuongHanhChinh_GUI.class.getResourceAsStream("/font/arial.ttf");
            BaseFont baseFont = BaseFont.createFont("src/font/arial.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Font font = new Font(baseFont, 12);
            PdfPTable pdfTable = new PdfPTable(columnWidths);
            pdfTable.setWidthPercentage(100); // Thiết lập độ rộng theo phần trăm của trang
            // Tiêu đề
            Font titleFont = new Font(baseFont, 28, Font.BOLD);
            Paragraph titleParagraph = new Paragraph(tenFile, titleFont);
            titleParagraph.setAlignment(Element.ALIGN_CENTER);
            titleParagraph.setSpacingAfter(25f); // Khoảng cách dưới tiêu đề
            document.add(titleParagraph);
            //thông tin phân công
            String maPhanCong = String.format("Mã phân công: %-40s", lblMaPhanCong.getText());
            String maSanPham = String.format("Mã sản phẩm: %-40s", lblMaSanPham.getText());
            String congDoan = String.format("Công đoạn: %-40s", lblCongDoan.getText());
            String phanXuong = String.format("Phân xưởng: %-40s", lblPhanXuong.getText());
            String tenSanPham = String.format("Sản phẩm: %-40s", lblTenSanPham.getText());
            String soNhanVien = String.format("Số nhân viên: %-35s", lblSoNhanVien.getText());
            String ngay = String.format("Ngày phân công: %-35s", lblNgay.getText());

            String thongTinSanPham = maPhanCong + maSanPham + congDoan + "\n\n" + phanXuong + tenSanPham + soNhanVien + ngay;

            Paragraph thongTinSanPhamPr = new Paragraph(thongTinSanPham, font);
            thongTinSanPhamPr.setSpacingAfter(18f); // Khoảng cách dưới tiêu đề
            document.add(thongTinSanPhamPr);
            // Thêm cột
            for (int i = 0; i < tblNhanVien.getColumnCount(); i++) {
                PdfPCell cell = new PdfPCell(new Phrase((String) tblNhanVien.getColumnName(i), font));
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                pdfTable.addCell(cell);
            }
            // Thêm dữ liệu
            for (int i = 0; i < tblNhanVien.getRowCount(); i++) {
                for (int j = 0; j < tblNhanVien.getColumnCount(); j++) {
                    PdfPCell cell = new PdfPCell(new Phrase(tblNhanVien.getValueAt(i, j).toString(), font));
                    // cell.setHorizontalAlignment(Element.ALIGN_LEFT);
                    pdfTable.addCell(cell);
                }
            }
            document.add(pdfTable);
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(TinhLuongHanhChinh_GUI.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            document.close();
            JOptionPane.showMessageDialog(this, "Xuất thành công");
        }
    }
    private DefaultTableModel dtmNhanVien;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblCongDoan;
    private javax.swing.JLabel lblMaPhanCong;
    private javax.swing.JLabel lblMaSanPham;
    private javax.swing.JLabel lblNgay;
    private javax.swing.JLabel lblPhanXuong;
    private javax.swing.JLabel lblSoNhanVien;
    private javax.swing.JLabel lblTenSanPham;
    private javax.swing.JTable tblNhanVien;
    // End of variables declaration//GEN-END:variables
}
