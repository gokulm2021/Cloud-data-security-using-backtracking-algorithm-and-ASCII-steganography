
import org.jfree.ui.RefineryUtilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class PerformanceEvaluation {
    
    public static void main( String[ ] args ) {
      
       LineChart4 chart = new LineChart4("Performance Evaluation" , "");
      chart.pack( );
      RefineryUtilities.centerFrameOnScreen( chart );
      chart.setVisible( true );
      
       LineChart6 chart6 = new LineChart6 ("Performance Evaluation" , "");
      chart6.pack( );
      RefineryUtilities.centerFrameOnScreen( chart6 );
      chart6.setVisible( true );
      
       LineChart9 chart9 = new LineChart9 ("Performance Evaluation" , "");
      chart9.pack( );
      RefineryUtilities.centerFrameOnScreen( chart9 );
      chart9.setVisible( true );
      
      
   }
    
}
