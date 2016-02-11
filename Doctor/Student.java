public class Student extends Person
{
    String schoolName;
    
    public Student(String name, String birthDate, String schoolName)
    {
        super(name, birthDate);
        this.schoolName = schoolName;
    }
    
        
    public String toString()
    {
        return super.toString() + String.format("\nSchool: %s", schoolName);
    }
}
    