
public class FundamentalsP6
    {
     public static void main( String[] args )
        {
        
        int [] randomnumbers = new int[50];
            
       for(int index = 0;index<randomnumbers.length;index++)
        {
            randomnumbers[index] =  (int) ( Math.random()*100);
        } 
        
       for(int index = 0;index<randomnumbers.length;index++)
        {
            System.out.print( randomnumbers[index] + " " );
        } 
}
}
    
    