package chart;

import java.awt.Color;
import java.awt.Dimension;
import java.text.DecimalFormat;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

public class BieuDoTron {

    private DefaultPieDataset dataset;

    public BieuDoTron() {
    }

    private PieDataset createDataset() {
        this.dataset = new DefaultPieDataset();
        return dataset;
    }

    private JFreeChart createChart(PieDataset dataset, String tieuDe) {
        JFreeChart chart = ChartFactory.createPieChart(
                tieuDe, // chart title 
                dataset, // data    
                true, // include legend   
                true,
                false);
        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setBackgroundPaint(new Color(242, 242, 242));
        // Đặt màu nền cho nhãn (tùy chọn)
        plot.setLabelBackgroundPaint(new Color(48, 204, 48));
        plot.setLabelGenerator(new StandardPieSectionLabelGenerator("{0} = {1} ({2})", new DecimalFormat("#,##0"), new DecimalFormat("0%")
        ));
        return chart;
    }

    public JPanel createDemoPanel(String tieuDe) {
        JFreeChart chart = createChart(createDataset(), tieuDe);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(880, 340));
        // Đặt màu nền cho panel chứa biểu đồ (vùng xung quanh biểu đồ)
        chartPanel.setBackground(new Color(240, 240, 240));
        return chartPanel;
    }

    // Hàm xóa dữ liệu hiện tại
    public void clearData() {
        dataset.clear();
    }

    // Hàm thêm giá trị vào biểu đồ
    public void addData(String category, float value) {
        dataset.setValue(category, value);
    }
}
