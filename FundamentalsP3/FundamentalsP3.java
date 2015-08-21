import javax.swing.JOptionPane;
public class FundamentalsP3
    {
     public static void main( String[] args )
        { 
          
           
           String input = JOptionPane.showInputDialog ( "What's your number ?" );
           Double x = Double.parseDouble (input);
            
            
     
           double r = x%2;
           
           
               
           if( r == 1 )
                {
                System.out.println( "The value of " + input +  "is an even number." );
                }
           else
                {
                System.out.println( "The value of " + input + " is an odd number." );
                }
            
                

                
            
            } 
        }
   