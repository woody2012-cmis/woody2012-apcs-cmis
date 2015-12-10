public class Student 
{
    //instances 
    private String first;
    private String last;
    private double[] stdGrades;
    private double English;
    private double Math;
    private double Science;
    private double FineArts;
    private double SocialScience;
    
    //zero argument
    public Student()
    {
        first = new String("Woody");
        last = new String("Omaree");
        stdGrades = new double[5];
    }
    
    //multi arguments
    public Student(String first, String last,double English, double Math, double Science, double FineArts, double SocialScience)
    {
        this.first=new String(first);
        this.last=new String(last);
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
            
            total += stdGrades[index];//short form
        }
        total/= stdGrades.length;
        
        return total; 
        
    }//end method CalcGPA
    
    //set the GPA
    public void setGPA(double English, double Math, double Science, double FineArts, double SocialScience)
    {
        this.stdGrades[0]=English;
        this.stdGrades[1]=Math;
        this.stdGrades[2]=Science;
        this.stdGrades[3]=FineArts;
        this.stdGrades[4]=SocialScience;
    }
    
    public String toString()
    {
        String output = new String();
        output = "First name: " + first+"\n"+"Last name: "+last+"\n"+"Student's average GPA "+ CalcGPA();
        return output;
    }
    
}
