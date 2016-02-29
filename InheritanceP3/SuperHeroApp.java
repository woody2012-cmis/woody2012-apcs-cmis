import java.util.ArrayList;
public class SuperHeroApp
{
    public static void main(String[] args)
    {
        AsteriodMan asteriodman = new AsteriodMan();
        asteriodman.isCaped();
        asteriodman.setCape(false);
        asteriodman.setSuitColor("Purple");

        FriedEggMan friedeggman = new FriedEggMan();
        asteriodman.isCaped();
        asteriodman.setCape(true);
        friedeggman.setSuitColor("Yellow");

        PacMan pacman = new PacMan();
        asteriodman.isCaped();
        asteriodman.setCape(false);
        pacman.setSuitColor("Blue");

        ArrayList<SuperHero> heroes = new ArrayList<SuperHero>();
        heroes.add(asteriodman);
        heroes.add(friedeggman);
        heroes.add(pacman);
        for ( SuperHero superhero : heroes )
        {
            System.out.println(superhero + "\n");
        }
        
        for( int row = 0; row < SuperHero.length; row++ )
        {
            for(int col = 0; col < SuperHero[0].length; col++ )
            {
                if( SuperHero[row][col].rating == rating )
                {
                    songs.add(SuperHero[row][col]);
                }
            }
        }
        
    }
}