import javax.swing.JOptionPane;
public class TestOnePartner
    {
     public static void main( String[] args )
     {
        String input = JOptionPane.showInputDialog ( "Give me an integer." );
        int num = Integer.parseInt (input);
           
         
           
        double [] myArray = new double [num]; 
   
        for(int index=0;index<num;index++) 
           {
               myArray [index] = (Math.random()*51);
               System.out.println(index + ": " + myArray[index]);
           } //end while
           
         int index = myArray.length-1;
         while (index>=0)
          {
           int index1 = (int) myArray[index];
            if(index%2==0)
            {
                 String even = ("E");
                 for (int i = 1;i<index1;i--)
                 {
                     even += "E";
                 }
                 System.out.println(index + ": " + even + myArray[index]);
            }
            else
            {
                 String odd = ("O");
                 int i = 1;
                 while (i<index1)
                 {
                     odd += "O";
                     i--;
                 }
                 System.out.println(index + ": " + odd + myArray[index]); 
                 }
            }
          }//end method main    
    }//end class   
