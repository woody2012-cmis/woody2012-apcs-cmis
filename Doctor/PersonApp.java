public class PersonApp
{
    public static void main(String[] args)
    {
        Person[] people = new Person[4];
        people[0] = new Person("Nathan Kieffer", "May");
        people[1] = new Student("Bradley Shank", "June", "CMIS");
        people[2] = new Senior("Tadpole Kajornpredanon", "November", "CMIS", "Harvard", true);
        people[3] = new Doctor("Woody Omaree", "March", 300000, "High");
        for ( Person person : people )
        {
            System.out.println(person + "\n");
        }     
    }
}