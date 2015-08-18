import javax.swing.JOptionPane;
public class Age
    {
     public static void main( String[] args )
        {
            String input = JOptionPane.showInputDialog ( "What's your name?" ); 
            System.out.println( "Hello, " +input + "." );
            
            String input2 = JOptionPane.showInputDialog ( "What's your age?" ); 
            System.out.println( "You are "+input2 + " years old." );
        } // end method main
        
    } // end class Age