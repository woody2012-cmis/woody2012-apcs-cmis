import javax.swing.JOptionPane;
public class Histogram
    {
     public static void main( String[] args )
     { 
           String input = JOptionPane.showInputDialog ( "Give me an integer." );
           int num = Integer.parseInt (input);
           
           int [] randomNumbers = new int [num]; 
   
           for(int index=0;index<num;index++) 
           {
               randomNumbers [index] = (int)(Math.random()*98+1);
               System.out.println(index + ": " + randomNumbers[index]);
           } //end while
           
           
          for(int index=0;index<num;index++) 
           {
               randomNumbers [index] = (int)(Math.random()*98+1);
               System.out.println(index + ": " + randomNumbers[index]);
           } //end while
           } //end method main 
     }//emg class
