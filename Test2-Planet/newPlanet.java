import javax.swing.JOptionPane;
public class newPlanet
{
    private String [] name = {"Beta", "Alpha", "Gamma", "Delta"};
    private String [] relationship = {"friendly", "ally", "hostile", "at war"};
    private double radius;
    private int maxPopulation;
    private double percentSpaceMarines;
    private int SM;
    private int SD;
    private double maxSpaceMarinesPerStarDestroyer;

    public newPlanet()
    {
        this.name = name;
        this.relationship = relationship;
        radius = 1.00;
        maxPopulation = 1;
        percentSpaceMarines = 1.00;
        SM = 1;
        SD = 1;
        maxSpaceMarinesPerStarDestroyer = 1.00;
    }

    public newPlanet(int maxPopulation, double percentSpaceMarines, double maxSpaceMarinesPerStarDestroyer)
    {
       this.name = name;
       this.relationship = relationship;
       radius = 1.00;
       this.maxPopulation = maxPopulation;
       this.percentSpaceMarines = percentSpaceMarines;
       SM = 1;
       SD = 1;
       maxSpaceMarinesPerStarDestroyer = 1.00;
    }

    public String toString()
    {
        String result = String.format ("Name: %s \n" + 
                "Relationship: %s \n" +
                "Radius: %.2f \n" +
                "Population: %.2f \n" +
                "percentSpaceMarines: %.2f \n" +
                "Space Marines: %d \n" +
                "Star Destroyers: %d \n" +
                "Space Marines per star destroyer: %.2f \n", name, relationship, radius, maxPopulation, percentSpaceMarines, SM, SD, maxSpaceMarinesPerStarDestroyer);
        return result;
    }
}