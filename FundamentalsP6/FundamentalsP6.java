
public class FundamentalsP6
    {
     public static void main( String[] args )
        {
        String [] movies = {"Kingsman", "The Golden Compass", "Spirited Away"};
            
        for(int index = 0;index<movies.length;index++)
        {
            System.out.println(movies[index]+ "\n"+"\n" );
        } 
        
        System.out.println("\n"+"\n");
        
        String [] songs = {"Party", "Verge" , "Into the New World"};
        int index = 0;
        while(index<songs.length-1)
        {
           
             System.out.print(songs[index]+ ", ");
             index++;
             
            
        
        }
         System.out.print(songs[index=2]);
}
}
    
    