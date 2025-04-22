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

public class LineChart6 extends ApplicationFrame {

   public LineChart6( String applicationTitle , String chartTitle ) {
      super(applicationTitle);
      JFreeChart lineChart = ChartFactory.createLineChart(
         chartTitle,
         "Data Size(kb)","Memory Usage (kb)",
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
      String c2 = "16";
      String c3 = "32";
      String c4 = "48";
      String c5 = "64";
      String c6 = "96";
      String c7 = "128";
      String c8 = "160";
      String c9 = "192";
      String c10 = "224";
      String c11 = "256";
      String c12 = "288";
      String c13 = "320";
      
      String series1 = "CASE Text Stegnography";
      String series2 = "ISET Text Stegnography";
      String series3 = "Backtrack+ECC+ASCII Cryptography";
       
            
     // dataset.addValue( 0 , series1 , c1 );
      dataset.addValue(  1812 , series1 , c2 );
      dataset.addValue(  2058 , series1 , c3 );
      dataset.addValue(  2401 , series1 , c4 );
      dataset.addValue(  2647 , series1 , c5 );
      dataset.addValue(  3518 , series1 , c6 );
      dataset.addValue(  4689 , series1 , c7 );
      dataset.addValue( 5732 , series1 , c8 );
      dataset.addValue( 7654 , series1 , c9 );
      dataset.addValue( 9156 , series1 , c10 );
      dataset.addValue( 10875 , series1 , c11 );
      dataset.addValue( 12124 , series1 , c12 );
      dataset.addValue( 13356, series1 , c13 );
      
      
     // dataset.addValue( 0 , series2 , c1 );
      dataset.addValue(  1625 , series2 , c2 );
      dataset.addValue(  1878 , series2 , c3 );
      dataset.addValue(  2165 , series2 , c4 );
      dataset.addValue(  2412 , series2 , c5 );
      dataset.addValue(  3185 , series2 , c6 );
      dataset.addValue(  3934 , series2 , c7 );
      dataset.addValue( 4968 , series2 , c8 );
      dataset.addValue( 6598 , series2 , c9 );
      dataset.addValue( 7853 , series2 , c10 );
      dataset.addValue( 9172 , series2 , c11 );
      dataset.addValue( 10386 , series2 , c12 );
      dataset.addValue( 11821 , series2 , c13 );
      
      dataset.addValue(  1425 , series3 , c2 );
      dataset.addValue(  1652 , series3 , c3 );
      dataset.addValue(  1928 , series3 , c4 );
      dataset.addValue(  2257 , series3 , c5 );
      dataset.addValue(  2961 , series3 , c6 );
      dataset.addValue(  3729 , series3 , c7 );
      dataset.addValue( 4737 , series3 , c8 );
      dataset.addValue( 6317  , series3 , c9 );
      dataset.addValue( 7639 , series3 , c10 );
      dataset.addValue( 8943 , series3 , c11 );
      dataset.addValue( 10124 , series3 , c12 );
      dataset.addValue( 10985 , series3 , c13 );
      
      
      
      return dataset;
   }
   
   public static void main( String[ ] args ) {
      
      
   }
}
