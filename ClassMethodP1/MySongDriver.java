public class MySongDriver
    {
    public static void main (String[] args)
        {
        MySong song1 = new MySong();
        
       
        
        System.out.println(song1 + "\n" + "The song was realeased in " + song1.getyearReleased() + "." + "\n" + "\n" );
        
        song1.setYearReleased(2015);
        System.out.println("The song was realeased in " + song1.getyearReleased() + "." );
        
        }
    }
