public abstract class Student
{
    private String name;
    private String major;
    private int units;

    public Student(String name, String major, int units)
    {
        this.name = name;
        this.major = major;
        this.units = units;
    }

    public void setName(String name)
    {
        this.name = name;
    } // end method setSuitColor

    public String getName()
    {
        return name;	
    } // end method getSuitColor

    public void setMajor(String major)
    {
        this.major = major;
    } // end method setSuitColor

    public String getMajor()
    {
        return major;	
    } // end method getSuitColor

    public void setUnits(int units)
    {
        this.units = units;
    } // end method setSuitColor

    public int getUnits()
    {
        return units;
    } // end method getSuitColor

    public abstract int calculateTuition(int units);

    public String toString()
    {
        String output = new String("");
        output = "Name: " + name +
        " Major: " + major +
        " Units: " + units;
        return output;
    }
}

