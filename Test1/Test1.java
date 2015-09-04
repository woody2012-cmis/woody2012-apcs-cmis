import javax.swing.JOptionPane;
public class Test1
    {
     public static void main( String[] args )
     { 
           String input = JOptionPane.showInputDialog ( "Give me an integer." );
           int num = Integer.parseInt (input);

           int r = num%2;
           String letters [] = {"E", "O"};
           int [] randomNumbers = new int [51]; 
           
           for (int index = 0; index<randomNumbers.length;index++) //for loop
           if( r == 1 )// show odd
                {
                randomNumbers[index] = (int)(Math.random() * 51 );
                } //end if
           else //show even 
                {
                randomNumbers[index] = (int)(Math.random() * 51 );
                } //end else
           
           
           int index = 0;
           while(index<randomNumbers.length) // while loop
           {
               System.out.println("E" + randomNumbers[index]);//print E for even
               index++;
           } //end while
     } //end method main
        } //end class
   
        
