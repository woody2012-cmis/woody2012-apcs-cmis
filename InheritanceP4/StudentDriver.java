import java.util.ArrayList;
public class StudentDriver
{
    public static void main(String[] args)
    {
        UnderGrad underGrad1 = new UnderGrad("Woody Aomori", "Business", 6);
        UnderGrad underGrad2 = new UnderGrad("Oo Teriyaki", "Culinary", 5);
        Graduate graduate1 = new Graduate("Tadpole Hay", "Engineering", 8);
        Graduate graduate2 = new Graduate("Savannah Tannings", "Astronomy", 7);
        PostGraduate postGrad1 = new PostGraduate("Dj SingingGate", "Computer Science", 9);
        PostGraduate postGrad2 = new PostGraduate("Nam Avocatong", "Agriculture", 10);
        
        ArrayList<Student> allStudents = new ArrayList<Student>();
        allStudents.add(postGrad1);
        allStudents.add(postGrad2);
        allStudents.add(graduate1);
        allStudents.add(graduate2);
        allStudents.add(underGrad1);
        allStudents.add(underGrad2);

        Student[][] studentBody = new Student[3][2];
        int i = 0;
        
        for(int row = 0; row < studentBody.length; row++)
        {
            for(int col = 0; col < studentBody[0].length; col++)
            {
                studentBody[row][col] = allStudents.get(i);
                i++;
            }
        }

        for(int row = 0; row < studentBody.length; row++)
        {
            for(int col = 0; col < studentBody[0].length; col++)
            {
                System.out.print(studentBody[row][col] + "\t\t" );
            }
            System.out.println();
        }
    }
}


