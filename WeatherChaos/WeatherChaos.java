import javax.swing.JOptionPane;
public class WeatherChaos
{
    public static void main( String[] args )
    { 
        String input = JOptionPane.showInputDialog ( "Give me an integer." );
        int num = Integer.parseInt (input); //number put in is integer. num is same as randomNumbers.length 
        int [] randomNumbers = new int [num]; //randomNumbers is the length of the input (ex. 50)
        int [] count = new int [10]; //count for each random numbers
        int sum = 0;
        int max = 0;
        int min = 99;
        int mode = 0;
        int most = 0;
        
        if(num = 0;num > 32)
                {
                System.out.println( "Log in successful" );
                }//end if
         else
                {
                System.out.println( "Login unsuccessful... please try again" );
                }//end if
        
        for(int index = 0; index < randomNumbers.length; index++) //loop
        {
            randomNumbers [index] = (int)(Math.random()*100); //possibility that an index can be from 0-99
        } //end while
 
        for (int index = 0; index < randomNumbers.length; index++)
        {
            int counter = randomNumbers[index];
            count[counter]++; //count how many times a random number occur
        }
        
        for (int index = 0; index <= 99; index++) 
        {
            System.out.print(index + ":"); //print 0-99 
            for (int index1 = 0; index1 < count[index]; index1++)
            {
                System.out.print("#"); //print hashtags DON'T UNDERSTAND THIS
            }
            System.out.println(""); //print vertically
        }
        //end histogram generation
        for (int i : randomNumbers)
        {
            sum += i;
        }
        
        for ( int index = 0; index < randomNumbers.length; index++)
        {
            if (randomNumbers [index] >= max)
            {
                max = randomNumbers [index]; //the random numbers (0-99) in the index (ex. index 1 might be 52)           
            }
            if (randomNumbers [index] <= min)
            {
                min = randomNumbers [index]; //the random numbers (0-99) in the index (ex. index 1 might be 52)
            }
        }
        
        for (int index = 0; index < count.length; index++)
        {
            if (count [index] >= most) //greatest count = most
            {
                most = count [index]; //the amount of count in that index
                mode = index; //print that index out
            }
        }
        System.out.println("MIN:" + min);
        System.out.println("MAX:" + max);
        System.out.println("SUM:" + sum);
        System.out.println("AVG:" + (double) sum/num);
        System.out.println("MST:" + mode);
    } //end method main 
}//end class
