import javax.swing.JOptionPane;
public class WeatherChaos
{
     public static void main( String[] args )
     { 
    String input = JOptionPane.showInputDialog ( "Give me an integer." );
    int num = Integer.parseInt (input); //number put in is integer. num is same as temp.length 
    int [] temp = new int [num]; //temp is the length of the input (ex. 10)
    int [] count = new int [num]; //count for each random numbers
    int sum = 1;
    int max = 1;
    int min = 99;
    //index = day
    //randomNumbers = temp
        
     if( num < 1  && num > 31 )
        {
          System.out.println( "That's not a valid number of days" );
        }//end if
        else
        {
                
        for(int day = 1; day < temp.length; day++) //loop
        {
            temp [day] = (int) (Math.random() * 200) - 100; //possibility that an index can be from -100 to 99
        } //end while
        
        for (int day = 0; day < temp.length; day++)
          {
            int counter = temp[day];
            count[counter]++; //count how many times a random number occur
          }
        
        if(temp [num] < (int) 0 )
                {
                System.out.println( "freezing" );
                }//end if
        if(temp [num] > (int) 0 && temp [num] < (int) 15)
                {
                System.out.println( "chilly" );
                }//end if
        if(temp [num] > (int) 15 && temp [num] < (int) 30)
                {
                System.out.println( "comfortable" );
                }//end if
        if(temp [num] > (int) 31 && temp [num] < (int) 40)
                {
                System.out.println( "hot" );
                }//end if
        if(temp [num] > (int) 40)
                {
                System.out.println( "AAAAAAUUUUGGGHHH!" );
                }//end if
                
        for (int day = 1; day <= 99; day++) 
        {
            System.out.print(day + ":"); //print -100 to 99 
            for (int day1 = 0; day1 < count[day]; day1++)
            {
                System.out.print(temp); //print temp 
            }
            System.out.println(""); //print vertically
        }
        //end histogram generation
        for (int i : temp)
        {
            sum += i;
        }
        
        for ( int day = 1; day < temp.length; day++)
        {
            if (temp [day] >= max)
            {
                max = temp [day]; //the random numbers (-100 to 99) in the index (ex. index 1 might be 52)           
            }
            if (temp [day] <= min)
            {
                min = temp [day]; //the random numbers (-100 to 99) in the index (ex. index 1 might be 52)
            }
        }
        
        System.out.println("The minimum temperature was: " + min + " on day " + num + ".");
        System.out.println("The maximum temperature was: " + max + " on day " + num + ".");
        System.out.println("The average temperature was: " + sum/num + " on day " + num + ".");
        System.out.println("The biggest temperature swing was" + temp + " on day " + num + ".");
     } //end else
  } //end method main
} //end class