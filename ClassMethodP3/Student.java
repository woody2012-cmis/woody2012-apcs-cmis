import javax.swing.JOptionPane;
public class Student
{
    //1. Create instance variables
    private String name;
    private int age;
    private String gender;
    private double[] stdGrades= new double[5];

    private double Aplus = 4.0;
    private double Aminus = 3.7;
    private double Bplus = 3.3;
    private double B = 3.0;
    private double Bminus = 2.7;

    private double English = 0;
    private double Math = 0;
    private double Science = 0;
    private double FineArts = 0;
    private double Social = 0;

    private double GPA;
    private double avgGPA;

    //2. Write constructor to initialize instance variables
    public Student(double English, double Math, double Science, double FineArts, double Social)
    {
        this.English = English;
        this.Math = Math;
        this.Science = Science;
        this.FineArts = FineArts;
        this.Social = Social;
    }

    public Student()
    {
        name = "Woody Omaree";
        age = 17;
        gender = "Male";
        for (int i=0; i<stdGrades.length; i++)
        {
            stdGrades[i]=(int)(Math.random()*4);
        }
    }//end contructor

    public Student(String name, int age, String gender, double English, double Math, double Science, double FineArts, double Social)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        stdGrades[0] = English;
        stdGrades[1] = Math;
        stdGrades[2] = Science;
        stdGrades[3] = FineArts;
        stdGrades[4] = Social;
    }

    public double avgGPA()
    {
        double totalGPA=0;
        for (int i=0 ; i<stdGrades.length; i++)
        {
            totalGPA += stdGrades [i];
        }
        avgGPA = totalGPA / 5;
        return avgGPA;
    }

    public String toString()
    {
        String output = String.format(
                "Name:" %s + "\n" +
                 "Gender:" %s + "\n" +
                 "Age:" %d + "\n" +
                 "Average GPA: %.2f \n",     name, gender, age, avgGPA());
        return output;
    }
}//end class MySOng



    