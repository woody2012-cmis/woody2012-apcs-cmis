
public class FundamentalsP6
    {
     public static void main( String[] args )
        {
        int [] numbers = {0, 5, 18, 21, 59, 80, 98, 100};
        int [] randomnumbers = new int[100];
            
       for(int index = 0;index<randomnumbers.length;index++)
        {
            randomnumbers[index] =  (int) ( Math.random()*100);
        } 
        
       for(int index = 0;index<randomnumbers.length;index++)
        {
            System.out.println( randomnumbers[ index] );
        } 
}
}
    
    