import javax.swing.JOptionPane;
public class Histogram
{
    public static void main( String[] args )
    { 
        String input = JOptionPane.showInputDialog ( "Give me an integer." );
        int num = Integer.parseInt (input);

        int [] randomNumbers = new int [num]; 

        for(int index = 0; index < randomNumbers.length; index++) 
        {
            randomNumbers [index] = (int)(Math.random()*98+1);
            System.out.println(index + ": " + randomNumbers[index]);
        } //end while

        int [] counts = new int [100];
        for (int index = 0; index <= 99; index++)
        {
            int counter = int randomNumbers[index];
            count[counter]++;

        }

    } //end method main 
}//end class
