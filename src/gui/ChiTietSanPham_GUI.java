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
import entity.CongDoan;
import entity.SanPham;
import java.beans.PropertyVetoException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
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
public class ChiTietSanPham_GUI extends javax.swing.JInternalFrame {

    /**
     * Creates new form demo
     */
    public ChiTietSanPham_GUI(SanPham sanPham) {
        initComponents();
        setTable();
        initCommon(sanPham);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDong = new javax.swing.JButton();
        lblTenSanPham = new javax.swing.JLabel();
        lblMaSanPham = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCongDoan = new javax.swing.JTable();
        btnXuatPdf = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblDonGia = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lblSoLuong = new javax.swing.JLabel();
        lblSoCongDoan = new javax.swing.JLabel();
        lblDonViTinh = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Chi Tiết Sản Phẩm");
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setPreferredSize(new java.awt.Dimension(1200, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDong.setBackground(new java.awt.Color(152, 249, 152));
        btnDong.setText("Đóng");
        btnDong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });
        getContentPane().add(btnDong, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 40, -1, 30));

        lblTenSanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTenSanPham.setForeground(new java.awt.Color(0, 99, 0));
        lblTenSanPham.setToolTipText("");
        getContentPane().add(lblTenSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 190, 20));

        lblMaSanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMaSanPham.setForeground(new java.awt.Color(0, 99, 0));
        lblMaSanPham.setToolTipText("");
        getContentPane().add(lblMaSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 110, 20));

        jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 96, 59), 2), "Các Công Đoạn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 99, 0))); // NOI18N
        jScrollPane4.setMinimumSize(new java.awt.Dimension(1200, 600));
        jScrollPane4.setPreferredSize(new java.awt.Dimension(1200, 600));

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
        jScrollPane4.setViewportView(tblCongDoan);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1190, 490));

        btnXuatPdf.setBackground(new java.awt.Color(152, 249, 152));
        btnXuatPdf.setText("Xuất Pdf");
        btnXuatPdf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXuatPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatPdfActionPerformed(evt);
            }
        });
        getContentPane().add(btnXuatPdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 40, -1, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Mã Sản Phẩm:");
        jLabel17.setToolTipText("");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Tên Sản Phẩm:");
        jLabel20.setToolTipText("");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 110, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Số Công Đoạn:");
        jLabel21.setToolTipText("");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 100, -1));

        lblDonGia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDonGia.setForeground(new java.awt.Color(0, 99, 0));
        lblDonGia.setToolTipText("");
        getContentPane().add(lblDonGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 100, 20));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Số Lượng:");
        jLabel22.setToolTipText("");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 120, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setText("Đơn Vị Tính:");
        jLabel30.setToolTipText("");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 110, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setText("Đơn Giá:");
        jLabel31.setToolTipText("");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 90, -1));

        lblSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSoLuong.setForeground(new java.awt.Color(0, 99, 0));
        lblSoLuong.setToolTipText("");
        getContentPane().add(lblSoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 90, 20));

        lblSoCongDoan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSoCongDoan.setForeground(new java.awt.Color(0, 99, 0));
        lblSoCongDoan.setToolTipText("");
        getContentPane().add(lblSoCongDoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 100, 20));

        lblDonViTinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDonViTinh.setForeground(new java.awt.Color(0, 99, 0));
        lblDonViTinh.setToolTipText("");
        getContentPane().add(lblDonViTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 90, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        try {
            this.setClosed(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ChiTietSanPham_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDongActionPerformed

    private void btnXuatPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatPdfActionPerformed
        xuLyXuatPdf();
    }//GEN-LAST:event_btnXuatPdfActionPerformed
    private void initCommon(SanPham sanPham) {
        df = new DecimalFormat("#,##0"); // Số lẻ số # để hiển thị đủ chữ số thập phân
        doDuLieuCongDoan(sanPham.getCongDoanThucHien());
        doDuLieuLbl(sanPham);
    }

    private void doDuLieuCongDoan(List<CongDoan> congDoans) {
        int i = 1;
        for (CongDoan congDoan : congDoans) {
            Object[] objects = {i, congDoan.getTenCongDoan(), congDoan.getMaCongDoan(), df.format(congDoan.getGiaTien()) + "VND", congDoan.getTienDo()};
            dtmCongDoan.addRow(objects);
            i++;
        }
    }

    private void doDuLieuLbl(SanPham sanPham) {
        lblMaSanPham.setText(sanPham.getMaSanPham());
        lblTenSanPham.setText(sanPham.getTenSanPham());
        lblSoLuong.setText(sanPham.getSoLuong() + "");
        lblSoCongDoan.setText(sanPham.getCongDoanThucHien().size() + "");
        lblDonGia.setText(df.format(sanPham.getDonGia()) + "VND");
        lblDonViTinh.setText(sanPham.getDonViTinh());
    }

    private void setTable() {
        dtmCongDoan = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "STT", "Công đoạn", "Mã công đoạn", "Đơn giá", "Tiến độ"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,};
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
        tblCongDoan.setModel(dtmCongDoan);
        tblCongDoan.getTableHeader().setBackground(new java.awt.Color(50, 205, 50));
    }

    private void xuLyXuatPdf() {
        String tenSanPham = lblTenSanPham.getText() + "-" + lblMaSanPham.getText();
        String tenFile = tenSanPham + ".pdf";
        // Tạo hộp thoại chọn tệp
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Chọn nơi lưu");
        // Đặt tên mặc định cho tệp
        fileChooser.setSelectedFile(new File(tenFile));
        // Đặt bộ lọc cho chỉ chọn file có đuôi .xlsx
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
            float[] columnWidths = {5f, 15f, 15f, 10f, 10f};
            // Sử dụng font Arial
//            InputStream fontStream = TinhLuongHanhChinh_GUI.class.getResourceAsStream("/font/arial.ttf");
            BaseFont baseFont = BaseFont.createFont("D://arial.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Font font = new Font(baseFont, 12);
            PdfPTable pdfTable = new PdfPTable(columnWidths);
            pdfTable.setWidthPercentage(100); // Thiết lập độ rộng theo phần trăm của trang
            // Tiêu đề
            Font titleFont = new Font(baseFont, 28, Font.BOLD);
            Paragraph titleParagraph = new Paragraph(tenFile, titleFont);
            titleParagraph.setAlignment(Element.ALIGN_CENTER);
            titleParagraph.setSpacingAfter(25f); // Khoảng cách dưới tiêu đề
            document.add(titleParagraph);
            //thông tin sản phẩm
            String maSanPham = String.format("Mã sản phẩm: %-40s", lblMaSanPham.getText());
            String soLuong = String.format("Số lượng: %-40s", lblSoLuong.getText());
            String donViTinh = String.format("Đơn vị tính: %-40s", lblDonViTinh.getText());
            String tenSanPham = String.format("Tên sản phẩm: %-40s", lblTenSanPham.getText());
            String soCongDoan = String.format("Số công đoạn: %-35s", lblSoCongDoan.getText());
            String donGia = String.format("Đơn giá: %-35s", lblDonGia.getText());

            String thongTinSanPham = maSanPham + soLuong + donViTinh + "\n\n" + tenSanPham + soCongDoan + donGia;

            Paragraph thongTinSanPhamPr = new Paragraph(thongTinSanPham, font);
            thongTinSanPhamPr.setSpacingAfter(18f); // Khoảng cách dưới tiêu đề
            document.add(thongTinSanPhamPr);
            // Thêm cột
            for (int i = 0; i < tblCongDoan.getColumnCount(); i++) {
                PdfPCell cell = new PdfPCell(new Phrase((String) tblCongDoan.getColumnName(i), font));
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                pdfTable.addCell(cell);
            }
            // Thêm dữ liệu
            for (int i = 0; i < tblCongDoan.getRowCount(); i++) {
                for (int j = 0; j < tblCongDoan.getColumnCount(); j++) {
                    PdfPCell cell = new PdfPCell(new Phrase(tblCongDoan.getValueAt(i, j).toString(), font));
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
    private DefaultTableModel dtmCongDoan;
    private DecimalFormat df;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnXuatPdf;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblDonGia;
    private javax.swing.JLabel lblDonViTinh;
    private javax.swing.JLabel lblMaSanPham;
    private javax.swing.JLabel lblSoCongDoan;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblTenSanPham;
    private javax.swing.JTable tblCongDoan;
    // End of variables declaration//GEN-END:variables
}
