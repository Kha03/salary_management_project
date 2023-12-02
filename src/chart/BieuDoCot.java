package chart;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class BieuDoCot {

    private DefaultCategoryDataset dataset;

    public BieuDoCot() {
    }

    private JFreeChart createChart(String tieuDe) {
        JFreeChart barChart = ChartFactory.createBarChart(
                tieuDe,
                "Nhân viên",
                "Lương lãnh",
                createDataset(),
                PlotOrientation.VERTICAL,
                false, true, false);
        CategoryPlot plot = (CategoryPlot) barChart.getPlot();
        plot.setBackgroundPaint(new Color(242, 242, 242));
        plot.getRenderer().setSeriesPaint(0, new Color(0, 100, 0));
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setMaximumBarWidth(0.13); // Adjust this value to set the maximum width of the bars
        return barChart;
    }

    public JPanel createDemoPanel(String tieuDe) {
        JFreeChart chart = createChart(tieuDe);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(1500, 322));
        // Đặt màu nền cho panel chứa biểu đồ (vùng xung quanh biểu đồ)
        chartPanel.setBackground(new Color(240, 240, 240));
        return chartPanel;
    }

    private CategoryDataset createDataset() {
        dataset = new DefaultCategoryDataset();
        return dataset;
    }

    // Hàm xóa dữ liệu hiện tại
    public void clearData() {
        dataset.clear();
    }

    // Hàm thêm giá trị vào biểu đồ
    public void addData(double value, String giaTriHang, String giaTriCot) {
        dataset.addValue(value, giaTriHang, giaTriCot);
    }
}
