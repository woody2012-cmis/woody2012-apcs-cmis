import javax.swing.JOptionPane;
public class Test1
    {
     public static void main( String[] args )
     { 
           String input = JOptionPane.showInputDialog ( "Give me an integer." );
           int num = Integer.parseInt (input);
           
           int r = num%2;
           
           double [] myArray = new double [num]; 
   
           for(int index=0;index<num;index++) 
           {
               myArray [index] = (Math.random()*51);
               System.out.println(index + ": " + myArray[index]);
           } //end while
           
           int index1 = myArray.length-1;
           while (index1>=0)
           {
              System.out.println(index1 + ": " + myArray[index1]);
              index1--;
           }//end while
           } //end method main
           
     } //class
      
        
