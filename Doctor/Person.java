
public class Person
{
    private String name;
    private String birthDate;
    
    public Person(String name, String birthDate)
    {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String toString()
    {
        return String.format("Name: %s\nBirthday: %s", name, birthDate);
    }

}