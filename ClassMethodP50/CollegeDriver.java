public class CollegeDriver
{
    public static void main(String[] args)
    {
        String college1 = new String ( "University of California Irvine"); 
        String college2 = new String ( "Chulalongkorn University" ); 
        String college3 = new String ( "Fordham University" ); 

        
        System.out.println(college1.compareTo(college2));
        System.out.println(college2.compareTo(college3));
        System.out.println(college3.compareTo(college1));
    }
}

//a. What is the output of the compareTo() method telling us? 
// whether StringA.compareTo(StringB)
//how many letters that String B comes after or before String A, based on the first letter.
//b. Compare to colleges that have the same first letter and a different second letter. What does compareTo() do in this case?
//compareTo() will ignore the first letter that are similar and then compare the second letters that are different. 