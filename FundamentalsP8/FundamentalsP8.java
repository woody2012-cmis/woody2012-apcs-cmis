public class FundamentalsP8
    {
     public static void main( String[] args )
        {
        String [] artists = {"Girls' Generation", "Leona Lewis", "Candy Mafia"};
            
        for(int index = 0;index<artists.length;index++)
        {
            System.out.println(artists[index] );
        } 
        
        
        String [] songs = {"Party", "Verge" , "Into the New World"};
        int index = 0;
        while(index<songs.length-1)
        {
           
             System.out.print(songs[index]+ ", ");
             index++;
             
            
        
        }
         System.out.print(songs[index=2]);
        }//end main
}//end class
    
    