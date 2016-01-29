
public class Roster
{
    private Student[] studentslist;

    public Roster()
    {
        studentslist = new Student [3];
        studentslist[0] = new Student("Kim", "Taeyeon", 3.0, 3.5, 3.3, 3.8, 3.6, "A");
        studentslist[1] = new Student("Glass", "Alisha", 3.9, 3.4, 3.0, 2.8, 3.4, "B");
        studentslist[2] = new Student("Kongyou", "Ajcharaporn", 2.8, 2.3, 2.8, 3.9, 3.8, "C");
    }

    public String findStudentWithMaxGPA()
    {
        Student maxGPA = new Student();
        for(int i = 0; i < studentslist.length; i ++)
        {
            if(studentslist[i].CalcGPA() > maxGPA.CalcGPA())
            {
                maxGPA = studentslist[i];
            }
        }
        return maxGPA.first;
    }

    public String toString()
    {
        String output = new String();
        output = "The Student with the highest GPA is " + findStudentWithMaxGPA();
        return output;
    }
}


