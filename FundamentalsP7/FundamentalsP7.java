
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
            
    i = (int)(100*Math.random());
    if (i % 2 == 0)
    {
     randomNumbers[index] = ((int)(100*(-1)*Math.random()));
     negative++;
    }//end if
    else
    {
     randomNumbers[index] = ((int)(100*Math.random()));
     positive++;
    }//end else
 
}//end for

int index = 0;
while (index < randomNumbers.length)
{
    System.out.print("There are " + positive + " numbers" + "." + "There are " + negative + " numbers" + ".");
}
}
}
    