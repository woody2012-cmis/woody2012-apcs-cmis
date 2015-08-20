import javax.swing.JOptionPane;
public class FundamentalsP2
    {
     public static void main( String[] args )
        { 
          
           
            String input = JOptionPane.showInputDialog ( "What's your number A?" );
            Double numberA = Double.parseDouble (input);
            
            String inputB = JOptionPane.showInputDialog ( "What's your number B?" );
            Double numberB = Double.parseDouble (inputB);
            
            if( numberA < numberB )
                {
                System.out.println( "The value of A is " +numberA + " and it is less than B whose value is " +numberB + "." );
                }
            if( numberA > numberB )
                {
                System.out.println( "The value of A is " +numberA + " and it is more than B whose value is " +numberB + "." );
                }
            else
                {
                System.out.println( "The value of A is " +numberA + " and it is equal B whose value is " +numberB + "." );
                }
            
            } 
        }
   