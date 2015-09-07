import javax.swing.JOptionPane;
public class Test1
    {
     public static void main( String[] args )
     { 
           String input = JOptionPane.showInputDialog ( "Give me an integer." );
           int num = Integer.parseInt (input);

           int r = num%2;
           
           double [] randomNumbers = new double [num]; 
           
           for (int index = 0; index<5;index++) //for loop
           if( r == 1 )// show odd
                {
                randomNumbers[index] = (double)(Math.random() * 51 );
                } //end if
           else //show even 
                {
                randomNumbers[index] = (double)(Math.random() * 51 );
                } //end else
           
           
           int index = 0;
           while(index<num) // while loop
           {
               System.out.println(index + (double) (Math.random()));//print E for even
               index++;
           } //end while
           
           for (int index1 = 0; index1<5;index1--) //for loop
           if( r == 1 )// show odd
                {
                randomNumbers[index1] = (double)(Math.random() * 51 );
                } //end if
           else //show even 
                {
                randomNumbers[index1] = (double)(Math.random() * 51 );
                } //end else
           
           
           int index1 = 0;
           while(index<num) // while loop
           {
               System.out.println(index1 + (double) (Math.random()));//print E for even
               index1--;
           } //end while
           
   

     } //end method main
        } //end class
   
        
