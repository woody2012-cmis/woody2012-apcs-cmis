import java.util.ArrayList;
public class SuperHeroApp
{
    public static void main(String[] args)
    {

        AsteriodMan asteriodman = new AsteriodMan();
        FriedEggMan friedeggman = new FriedEggMan();
        PacMan pacman = new PacMan();

        ArrayList<SuperHero> heroes = new ArrayList<SuperHero>();
        heroes.add(asteriodman);
        heroes.add(friedeggman);
        heroes.add(pacman);
        for ( SuperHero superhero : heroes )
        {
            System.out.println(superhero + "\n");
        }     
    }
}