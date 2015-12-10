import javax.swing.JOptionPane;
public class MyStudentDriver
{
    public static void main(String[] args)
    {
        
        Student student = new Student("Joe","Senior",4.0,4.0,3.5,4.0,4.0);
        student.CalcGPA();
        System.out.println(student);
        
       
        student.setGPA(4.0,4.0,4.0,4.0,4.0);
        student.CalcGPA();
        System.out.println(student);
    }//end method main
}//end class MyStudentDriver
