public class SuperHeroApp
{
    public static void main(String[] args)
    {
        SuperHero[] Hero = new SuperHero[3];
        Hero[0] = new AsteriodMan("Green", true, "FLY INTO THE UNIVERSE");
        Hero[1] = new FriedEggMan(32, "Velvet Gold", true);
        Hero[2] = new YourHero(32, "Velvet Gold", true, "LED");
        for ( SuperHero superhero : Hero )
        {
            System.out.println(superhero + "\n");
        }     
    }
}