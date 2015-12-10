public class MyStudent 
{
    //instances 
    private String first;
    private String last;
    private double[] ClassGrades;
    private double English;
    private double Math;
    private double Science;
    private double FineArts;
    private double SocialScience;
    
    //zero argument
    public MyStudent()
    {
        first = new String("Woody");
        last = new String("Omaree");
        ClassGrades = new double[5];
    }
    
    //multi arguments
    public MyStudent(String first, String last,double English, double Math, double Science, double FineArts, double SocialScience)
    {
        this.first=new String(first);
        this.last=new String(last);
        this.ClassGrades = new double[5]; 
        this.ClassGrades[0] = English;
        this.ClassGrades[1] = Math;
        this.ClassGrades[2] = Science;
        this.ClassGrades[3] = FineArts;
        this.ClassGrades[4] = SocialScience;
        
    }
    
    public double CalcGPA()
    {
        double total = 0.0;
        
        for(int index=0; index<ClassGrades.length;index++)
        {
            
            total += ClassGrades[index];//short form
        }
        total/= ClassGrades.length;
        
        return total; 
        
    }//end method CalcGPA
    
    //set the GPA
    public void setGPA(double English, double Math, double Science, double FineArts, double SocialScience)
    {
        this.ClassGrades[0]=English;
        this.ClassGrades[1]=Math;
        this.ClassGrades[2]=Science;
        this.ClassGrades[3]=FineArts;
        this.ClassGrades[4]=SocialScience;
    }
    
    public String toString()
    {
        String output = new String();
        output = "First name: " + first+"\n"+"Last name: "+last+"\n"+"Student's average GPA "+ CalcGPA();
        return output;
    }
    
}
