import java.util.ArrayList;
public class Roster2
{
    ArrayList<Student> studentlist = new ArrayList<Student>();
    public Roster2()
    {
        Student a = new Student("Spirit", "TheEagle", 3.0, 3.5, 3.3, 3.8, 3.6, "A");
        Student b = new Student("Alisha", "Glass", 3.9, 3.4, 3.0, 2.8, 3.4, "B");
        Student c = new Student("Folk", "Omaree", 2.8, 2.3, 2.8, 3.9, 3.8, "C");
        studentlist.add(a);
        studentlist.add(b);
        studentlist.add(c);
    }

    public void addStudent( Student newStudent )
    {
        studentlist.add( newStudent );
    }

    public void dropStudent( String last )
    {
        for ( int i = 0; i < studentlist.size(); i++ )
        {
            if (studentlist.get(i).lastname().equals(last))
            {
                studentlist.remove(i);
                i--;
            }
        }
    }//end

    public String toString ( )
    {
        String x = "";
        for( Student y : studentlist )
        {
            x += y + "\n";
        }
        String output = x;
        return output;
    }
}

