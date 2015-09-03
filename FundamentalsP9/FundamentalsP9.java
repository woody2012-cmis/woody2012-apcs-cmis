import javax.swing.JOptionPane;
public class FundamentalsP9
    {
     public static void main( String[] args )
     { 
         String username = JOptionPane.showInputDialog ( "Username" );
         String password1 = JOptionPane.showInputDialog ( "Password" );
         
         int password=Integer.parseInt(password1);
           
         if(username.equals("woodysone") && password == 123 )
                {
                System.out.println( "Log in successful" );
                }//end if
         else
                {
                System.out.println( "Login unsuccessful... please try again" );
                }//end if
     } //end main
        } //end class
  
 
   