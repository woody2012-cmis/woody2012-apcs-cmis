
public class FundamentalsP7
    {
     public static void main( String[] args )
        {
       int [] randomNumbers = new int[10];
       int positive = 0;
       int negative = 0;
            
       for(int index = 0;index<randomNumbers.length;index++)
       {
    int i = 0;
            
    i = (int)(101*Math.random());
    if (i % 2 == 0)
    {
     randomNumbers[index] = ((int)(101*(-1)*Math.random()));
     negative++;
    }//end if
    else
    {
     randomNumbers[index] = ((int)(101*Math.random()));
     positive++;
    }//end else
 
   }//end for

   int index = 0;
while (index < randomNumbers.length)
{
    System.out.println(randomNumbers[index] + "\t" );
    index++;
}//end while
   System.out.println("There are " + positive + " positive" + " numbers" + ".");
for (int i = 0; i < randomNumbers.length; i++)
{
    if (randomNumbers [i] > 0)
    {
     System.out.println(randomNumbers[i]);
    }
}

    }//end main
}//end class
    