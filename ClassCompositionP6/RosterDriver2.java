public class RosterDriver2
{
    public static void main( String[] args )
    {
        Roster2 x = new Roster2();
        System.out.println( "The class has 3 students: " );
        System.out.println( x );
        Student a = new Student( "Woody", "Omaree", 0.1, 0.2, 0.3, 4.0, 4.0, "D");
        x.addStudent( a );
        System.out.println( "Woody joined: ");
        System.out.println( x );
        x.dropStudent( "Omaree" );
        System.out.println( "Then tha Omarees dropped: ");
        System.out.println( x );
    }
}