public class MySongDriver
    {
    public static void main (String[] args)
        {
        MySong song1 = new MySong();
        MySong song2 = new MySong("I.", "rock ballad.", 3.27);
       
        
        System.out.println(song1 + "\n" + "The song was realeased in " + song1.getyearReleased() + "." + "\n" + "\n" + song2);
        
        song1.setyearReleased(2015);
        System.out.println("The song was realeased in " + song1.getyearReleased() + "." );
        
        }
    }
