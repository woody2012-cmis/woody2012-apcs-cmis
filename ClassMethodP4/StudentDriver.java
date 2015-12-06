public class StudentDriver
{
    public static void main(String[] args)
    {

        Student student = new Student();

        student.CalcGPA();
        student.GPA();
        System.out.println(student);

        student.setGPA(3.0,2.0,3.0,3.0,3.0);
        student.CalcGPA();
        student.GPA();
        System.out.println(student);
    }//end method main
}//end class MyStudentDriver
