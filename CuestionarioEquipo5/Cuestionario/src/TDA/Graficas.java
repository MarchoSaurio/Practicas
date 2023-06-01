package TDA;

import java.awt.Dimension;
import java.util.Locale;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class Graficas {

    public CategoryDataset grafEval(int contB, int contM) {
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        datos.setValue(contB, "Correctas", "Correctas");
        datos.setValue(contM, "Incorrectas", "Incorrectas");
        return datos;
    }

    public void panel(JFreeChart grafica) {
        ChartPanel panel = new ChartPanel(grafica);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(300, 300));

        JFrame ventana = new JFrame("Grafica");
        ventana.setVisible(true);
        ventana.setSize(600, 600);

        ventana.add(panel);
    }

    public void graficaBarras3D(CategoryDataset datos) {
        JFreeChart grafico;

        grafico = ChartFactory.createBarChart("Evaluacion", "Aciertos", "Evaluacion",
                datos, PlotOrientation.HORIZONTAL, true, true, false);
        panel(grafico);
        
        
    }


    }

