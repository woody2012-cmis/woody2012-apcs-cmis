import javax.swing.JOptionPane;
public class TestOnePartner
    {
     public static void main( String[] args )
     {
           String input = JOptionPane.showInputDialog ( "Give me an integer." );
           int num = Integer.parseInt (input);
           
           int r = num%2;
           
           double [] randomNumbers = new double [num]; 
   
           int index = 0;
           while(index<num) // while loop
           {
               randomNumbers [index] = (Math.random()*51);
               System.out.println(index + ": " + randomNumbers [index]);//print E for even
               index++;
           } //end while
           
           int index1 = randomNumbers.length-1;
           while (index1>=0)
           {
               System.out.println(index1 + ": " + randomNumbers [index]);
               index1--;
           }
      
 
        }//end method main    
    }//end class   
