import javax.swing.JOptionPane;
public class Student
{
    //1. Create instance variables
    private String name;
    private int age;
    private String gender;

    //2. Write constructor to initialize instance variables
    public Student()
    {
        name = "Woody Omaree";
        age = 17;
        gender = "Male";
    }//end contructor ClassDesignP1

    public Student(String name, int age, String gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }//end contructor ClassDesignP1

    public String toString()
    {
        String output = new String();
        output ="Name: " + this.name + "\n" +
                "Age: " + this.age + "\n" +
                "Gender: " + this.gender;
        return output;
    }//end method toString()
}