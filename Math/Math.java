import javax.swing.JOptionPane;
public class Math
    {
     public static void main( String[] args )
        {
            double sum1 = 0;
            double sum2 = 0;
            double sub1 = 0;
            double sub2 = 0;
            double mul1 = 0;
            double mul2 = 0;
            double div1 = 0;
            double div2 = 0;
            double per1 = 0;
            double per2 = 0;
            
            String input = JOptionPane.showInputDialog ( "Give me a number" ); 
            String input2 = JOptionPane.showInputDialog ( "Give me a second number" );
                  
            Double no1 = Double.parseDouble (input);
            Double no2 = Double.parseDouble (input2);
            
            sum1 = no1 + no2;
          
            System.out.println( no1 + "+" + no2 + "=" + sum1 );
            
            sum2 = no1 + no1;
            
            System.out.println( no1 + "+" + no1 + "=" + sum2);
            
            sub1 = no1 - no2;
            
            System.out.println( no1 + "-" + no2 + "=" + sub1);
            
            sub2 = no2 - no1;
            
            System.out.println( no2 + "-" + no1 + "=" + sub2);
            
            mul1 = no1 * no2;
            
            System.out.println( no1 + "*" + no2 + "=" + mul1);
            
            mul2 = no2 * no1;
            
            System.out.println( no2 + "*" + no1 + "=" + mul2);
            
            div1 = no1 / no2;
            
            System.out.println( no1 + "/" + no2 + "=" + div1);
            
            div2 = no2 / no1;
            
            System.out.println( no2 + "/" + no1 + "=" + div2);
            
            per1 = no1 % no2;
            
            System.out.println( no1 + "%" + no2 + "=" + per1);
            
            per2 = no2 % no1;
            
            System.out.println( no2 + "%" + no1 + "=" + per2);
            
            
         
            
        } // end method main
        
    } // end class Math