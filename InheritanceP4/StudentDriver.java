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

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(postGrad1);
        students.add(postGrad2);
        students.add(graduate1);
        students.add(graduate2);
        students.add(underGrad1);
        students.add(underGrad2);

        Student[][] studentList = new Student[3][2];
        int i = 0;

        for(int row = 0; row < studentList.length; row++)
        {
            for(int col = 0; col < studentList[0].length; col++)
            {
                studentList[row][col] = students.get(i);
                i++;
            }
        }

        for(int row = 0; row < studentList.length; row++)
        {
            for(int col = 0; col < studentList[0].length; col++)
            {
                System.out.print(studentList[row][col] + "\t\t" );
            }
            System.out.println();
        }
    }
}

