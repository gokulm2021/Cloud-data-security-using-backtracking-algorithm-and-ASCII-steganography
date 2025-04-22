/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Selva
 */
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class LineChart4 extends ApplicationFrame {

   public LineChart4( String applicationTitle , String chartTitle ) {
      super(applicationTitle);
      JFreeChart lineChart = ChartFactory.createLineChart(
         chartTitle,
         "Number of data","Security Probability",
         createDataset(),
         PlotOrientation.VERTICAL,
         true,true,false);
         
      ChartPanel chartPanel = new ChartPanel( lineChart );
      chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
      setContentPane( chartPanel );
   }

   private DefaultCategoryDataset createDataset( ) {
      DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
      
      String c1 = "10";
     // String c2 = "10";
      String c3 = "20";
     // String c4 = "30";
      String c5 = "40";
     // String c6 = "50";
      String c7 = "60";
    //  String c8 = "70";
      String c9 = "80";
      String c10 = "100";
      
    
      String series2 = "CASE Text Stegnography";
      String series3 = "ISET Text Stegnography";
      String series4 = "Backtrack+ECC+ASCII Cryptography";
            
     
      
      dataset.addValue( 60 , series2 , c1 );
     // dataset.addValue( 30 , series2 , c2 );
      dataset.addValue( 61 , series2 , c3 );
     // dataset.addValue( 54 , series2 , c4 );
      dataset.addValue( 62 , series2 , c5 );
     // dataset.addValue( 74 , series2 , c6 );
      dataset.addValue( 63 , series2 , c7 );
     // dataset.addValue( 81 , series2 , c8 );
      dataset.addValue( 65 , series2 , c9 );
      dataset.addValue( 70 , series2 , c10 );
      
      dataset.addValue( 71 , series3 , c1 );
     // dataset.addValue( 34 , series3 , c2 );
      dataset.addValue( 72 , series3 , c3 );
     // dataset.addValue( 60 , series3 , c4 );
      dataset.addValue( 73 , series3 , c5 );
     // dataset.addValue( 80 , series3 , c6 );
      dataset.addValue( 75 , series3 , c7 );
    //  dataset.addValue( 84 , series3 , c8 );
      dataset.addValue( 77 , series3 , c9 );
      dataset.addValue( 80 , series3 , c10 );
      
      dataset.addValue( 85 , series4 , c1 );
     // dataset.addValue( 40 , series4 , c2 );
      dataset.addValue( 86 , series4 , c3 );
     // dataset.addValue( 70 , series4 , c4 );
      dataset.addValue( 87 , series4 , c5 );
     // dataset.addValue( 90 , series4 , c6 );
      dataset.addValue( 89 , series4 , c7 );
     // dataset.addValue( 92 , series4 , c8 );
      dataset.addValue( 92 , series4 , c9 );
      dataset.addValue( 95 , series4 , c10 );
      
      return dataset;
   }
   
   public static void main( String[ ] args ) {
      
     
   }
}
