public class Student 
{
    //instances 
    public String first;
    public String last;
    private double[] stdGrades = new double[5];
    private double English;
    private double Math;
    private double Science;
    private double FineArts;
    private double SocialScience;
    private String avgGPA;

    //zero argument
    public Student()
    {
        first = new String("John");
        last = new String("Doe");
 
        stdGrades = new double[5];
        stdGrades[0] = 0.0;
        stdGrades[1] = 0.0;
        stdGrades[2] = 0.0;
        stdGrades[3] = 0.0;
        stdGrades[4] = 0.0;
    }

    //multi arguments
    public Student(String first, String last,double English, double Math, double Science, double FineArts, double SocialScience, String LetterGPA)
    {
        this.first = new String(first);
        this.last = new String(last);
        this.stdGrades = new double[5]; 
        this.stdGrades[0] = English;
        this.stdGrades[1] = Math;
        this.stdGrades[2] = Science;
        this.stdGrades[3] = FineArts;
        this.stdGrades[4] = SocialScience;
    }

    public double CalcGPA()
    {
        double total = 0.0;
        for(int index=0; index<stdGrades.length;index++)
        {
            total += stdGrades[index];
        }
        total /= stdGrades.length;

        return total; 

    }//end method CalcGPA

    public void setGPA(double English, double Math, double Science, double FineArts, double SocialScience)
    {
        this.stdGrades[0]=English;
        this.stdGrades[1]=Math;
        this.stdGrades[2]=Science;
        this.stdGrades[3]=FineArts;
        this.stdGrades[4]=SocialScience;
    }

    public String GPA()
    {
        if (CalcGPA() >= 4.0)
        {
            avgGPA="A";
        }
        else if (CalcGPA() >= 3.0 && CalcGPA() < 4.0)
        {
            avgGPA="B";
        }
        else if (CalcGPA() >= 2.0 && CalcGPA() < 3.0)
        {
            avgGPA="C";
        }
        else if (CalcGPA() >= 1.0 && CalcGPA() < 2.0)
        {
            avgGPA="D";
        }
        else
        {
            avgGPA="F";
        }
        return avgGPA;
    }

    public String toString()
    {
        String output = new String();
        output = "First Name: " + first + "\n" + 
                 "Last name: " + last + "\n" +
                 "Avg GPA: " + CalcGPA()+ "\n" +
                 "John's Grade " + avgGPA + "\n" + stdGrades[0] + " " + stdGrades[1] + " " + stdGrades[2] + " " + stdGrades[3] + " " + stdGrades[4];

        return output;

    }

}
