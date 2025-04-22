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

public class LineChart9 extends ApplicationFrame {

   public LineChart9( String applicationTitle , String chartTitle ) {
      super(applicationTitle);
      JFreeChart lineChart = ChartFactory.createLineChart(
         chartTitle,
         "Data Size(kb)","Encoding Time (ms)",
         createDataset(),
         PlotOrientation.VERTICAL,
         true,true,false);
         
      ChartPanel chartPanel = new ChartPanel( lineChart );
      chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
      setContentPane( chartPanel );
   }

   private DefaultCategoryDataset createDataset( ) {
      DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
      
      //String c1 = "0";
      String c2 = "20";
      String c3 = "68";
      String c4 = "363";
      String c5 = "495";
      String c6 = "858";
      String c7 = "1088";
      String c8 = "2325";
      
      
       String series1 = "CASE Text Stegnography";
      String series2 = "ISET Text Stegnography";
      String series3 = "Backtrack+ECC+ASCII Cryptography";
       
            
         // dataset.addValue( 0 , series1 , c1 );
      dataset.addValue( 4 , series1 , c2 );
      dataset.addValue( 6 , series1 , c3 );
      dataset.addValue( 7.3 , series1 , c4 );
      dataset.addValue( 11 , series1 , c5 );
      dataset.addValue( 13 , series1 , c6 );
      dataset.addValue( 23 , series1 , c7 );
      dataset.addValue( 38 , series1 , c8 );
     
      
     // dataset.addValue( 0 , series2 , c1 );
      dataset.addValue( 3 , series2 , c2 );
      dataset.addValue( 4.5 , series2 , c3 );
      dataset.addValue( 5 , series2 , c4 );
      dataset.addValue( 9.5 , series2 , c5 );
      dataset.addValue( 12 , series2 , c6 );
      dataset.addValue( 19 , series2 , c7 );
      dataset.addValue( 35 , series2 , c8 );
      
      
      dataset.addValue( 1 , series3 , c2 );
      dataset.addValue( 2 , series3 , c3 );
      dataset.addValue( 4 , series3 , c4 );
      dataset.addValue( 8 , series3 , c5 );
      dataset.addValue( 11 , series3 , c6 );
      dataset.addValue( 17 , series3 , c7 );
      dataset.addValue( 31 , series3 , c8 );
     
      
      
      return dataset;
   }
   
   public static void main( String[ ] args ) {
      
      
   }
}
