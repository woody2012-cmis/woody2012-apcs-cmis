import javax.swing.JOptionPane;
public class StudentDriver
{
    public static void main (String[] args)
    {
        Student Senior001 = new Student();
        Student Junior001= new Student("Emi", "Hayakawa"); 
        
        JOptionPane.showMessageDialog(null,Senior001, "Senior", JOptionPane.PLAIN_MESSAGE);
        System.out.println(Junior001);
    }
}