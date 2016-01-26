
public class Roster
{
    private Student[] studentslist;

    public Roster()
    {
        studentslist = new Student [3];
        studentslist[0] = new Student("Kim", "Taeyeon", 11);
        studentslist[1] = new Student("Glass", "Alisha", 11);
        studentslist[2] = new Student("Kongyou", "Ajcharaporn", 12);
    }

    public String findStudentWithMaxGPA()
    {
        Student maxGPA = new Student();
        for(int i = 0; i < students.length; i ++)
        {
            if(students[i].calcGPA() > maxGPA.calcGPA())
            {
                maxGPA = students[i];
            }
        }
        return maxGPA.fname;
    }

    public String toString()
    {
        String output = new String();
        output = "The Student with the highest GPA is... " + findStudentWithMaxGPA();
        return output;
    }
}