public class Senior extends Student
{
    String university;
    boolean gapYear;
    public Senior(String name, String birthDate, String schoolName, String university, boolean gapYear)
    {
        super(name, birthDate, schoolName);
        this.university = university;
        this.gapYear = gapYear;
    }
    
    public String toString()
    {
        return super.toString() + String.format("\nUniversity: %s\nGap Year: %s", university, gapYear);
    }
}