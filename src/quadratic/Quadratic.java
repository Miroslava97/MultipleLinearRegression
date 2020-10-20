/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadratic;
import jade.core.Agent;
import java.awt.BorderLayout;
import java.util.Arrays;
import javax.swing.JFrame;
import org.math.plot.Plot2DPanel;
import static thorwin.math.Math.polyfit;
/**
 *
 * @author oem
 */
public class Quadratic extends Agent {
    public void setup(){
    double[] x={-3.0,-2.0,-1.0,0.0,1.0,2.0,3.0};
    double[] y={7.5,3.0,0.5,1.0,3.0,6.0,14.0};
    
    double[] coefficients=polyfit(x,y,2);
    Arrays.stream(coefficients).forEach(System.out::println);
 
    
  //Graficar
    Plot2DPanel plot = new Plot2DPanel();
    plot.addLegend("south");
    plot.addScatterPlot("Datos", x,y);
    plot.addLinePlot("Quadratic",x, y);
    //  BaseLabel titulo = new BaseLabel ("Simple Linear Regression", Color.PINK,0.5,1.1);
     //  plot.addPlotable(titulo);
    JFrame frame = new JFrame("Quadratic Regression");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600,500);
    frame.add(plot,BorderLayout.CENTER);
    frame.setVisible(true);
    
    
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
