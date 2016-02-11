public class Doctor extends Person
{
    int salary;
    String experience;
    public Doctor(String name, String birthDate, int salary, String experience)
    {
        super(name, birthDate);
        this.salary = 300000;
        this.experience = "High";
    }
    
    public String toString()
    {
        return super.toString() + String.format("\nSalary: %s\nExperience: %s", salary, experience);
    }
}