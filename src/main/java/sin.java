import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.RectangleEdge;
import org.jfree.ui.VerticalAlignment;

import javax.swing.*;
import java.awt.*;

public class sin {

        public static void main(String[] args) {
            XYSeries series = new XYSeries("sin(a)");

            for(float i = 0; i < Math.PI; i+=0.1){
                series.add(i, Math.sin(i));
            }

            XYDataset xyDataset = new XYSeriesCollection(series);
            JFreeChart chart = ChartFactory
                    .createXYLineChart("y = cos(x)", "x", "y",
                            xyDataset,
                            PlotOrientation.VERTICAL,
                            true, true, true);
            JFrame frame =
                    new JFrame("MinimalStaticChart");
            // Помещаем график на фрейм
            frame.getContentPane()
                    .add(new ChartPanel(chart));
            frame.setSize(400,300);
            frame.show();
            DateAxis domainAxis = new DateAxis("Year");
            domainAxis.setPositiveArrowVisible(true);

            chart.getLegend().setPosition(RectangleEdge.TOP);
            chart.getLegend().setVerticalAlignment(VerticalAlignment.TOP);

        }
        }


