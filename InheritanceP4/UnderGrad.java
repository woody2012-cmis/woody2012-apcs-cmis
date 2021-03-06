public class UnderGrad extends Student
{
    private String name;
    private String major;
    private int units;

    public UnderGrad(String name, String major, int units)
    {
        super(name, major, units);
    }

    public int calculateTuition(int units) 
    {
        return units * 250; 
    }

    public String toString()
    {
        return super.toString() + calculateTuition(getUnits());
    }
}

