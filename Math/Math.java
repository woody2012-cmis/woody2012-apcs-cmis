import javax.swing.JOptionPane;
public class Math
    {
     public static void main( String[] args )
        {
            double sum1 = 0;
            double sum2 = 0;
            double sub3 = 0;
            double sub4 = 0;
            
            String input = JOptionPane.showInputDialog ( "Give me a number" ); 
            String input2 = JOptionPane.showInputDialog ( "Give me a second number" );
                  
            double no1 = Double.parseDouble (input);
            double no2 = Double.parseDouble (input2);
            
            sum1 = no1 + no2;
          
            System.out.println( no1 + "+" + no2 + "=" + sum1 );
            
            sum2 = no1 + no1;
            
            System.out.println( no1 + "+" + no1 + "=" + sum2);
            
            sub3 = no1 - no2;
            
            System.out.println( no1 + "-" + no2 + "=" + sub3);
            
            sub4 = no2 - no1;
            
            System.out.println( no2 + "-" + no1 + "=" + sub3);
            
         
            
        } // end method main
        
    } // end class Math