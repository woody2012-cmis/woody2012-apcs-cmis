
public class FundamentalsP7
    {
     public static void main( String[] args )
        {
        int [] numbers = {-100, -56, -3, -21, 0, 5, 18, 21, 98, 100};
        int [] randomnumbers = new int[100];
            
       for(int index = 0;index<randomnumbers.length;index++)
        {
            randomnumbers[index] =  (int) ( Math.random()*100);
        } 
        
       for(int index = 0;index<randomnumbers.length;index++ + index*-1)
        {
            System.out.println( randomnumbers[ index] );
        } 
}
}
    
    