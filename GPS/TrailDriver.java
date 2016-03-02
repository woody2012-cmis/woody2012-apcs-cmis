import java.util.ArrayList;
public class TrailDriver
{
    public static void main( String[] args )
    {
        Trail normalTrail = new Trail();
        
        System.out.println("Normal Trail: \n" + normalTrail);
        System.out.println("Distance: " + normalTrail.getLength() + " km");
        System.out.println("Difficult: " + normalTrail.isDifficult(0, normalTrail.markers.size()-1));
        System.out.println("Difficultness between marker number 5 to 9: " + normalTrail.isDifficult(5, 9));
        System.out.println("Level: " + normalTrail.isLevelTrailSegment(0, normalTrail.markers.size()-1));        
        System.out.println("Level between marker number 3 to 7: " + normalTrail.isLevelTrailSegment(3, 7)+ "\n");

        ArrayList<Integer> MarkersX = new ArrayList<Integer>();
        MarkersX.add(10);
        MarkersX.add(90);
        MarkersX.add(60);
        MarkersX.add(60);
        MarkersX.add(90);
        MarkersX.add(20);
        MarkersX.add(50);
        MarkersX.add(10);
        MarkersX.add(20);
        MarkersX.add(30);
        MarkersX.add(30);
        MarkersX.add(50);
        MarkersX.add(60);
        Trail gardenTrail = new Trail(MarkersX);
        System.out.println("Garden Trail: \n" + gardenTrail);
        System.out.println("Distance: " + gardenTrail.getLength() + " km");
        System.out.println("Difficult: "+ gardenTrail.isDifficult(0, MarkersX.size()-1));
        System.out.println("Difficultness between marker number 3 to 5: "+ gardenTrail.isDifficult(3, 5));
        System.out.println("Level: " + gardenTrail.isLevelTrailSegment(0, MarkersX.size()-1));
        System.out.println("Levenl between marker number 6 to 10: " + gardenTrail.isLevelTrailSegment(6, 10) + "\n");

        ArrayList<Integer> MarkersY = new ArrayList<Integer>();
        MarkersY.add(10);
        MarkersY.add(10);
        MarkersY.add(15);
        MarkersY.add(10);
        MarkersY.add(20);
        MarkersY.add(25);
        MarkersY.add(25);
        MarkersY.add(20);
        MarkersY.add(15);
        MarkersY.add(15);
        MarkersY.add(25);
        MarkersY.add(10);
        MarkersY.add(25);
        Trail riverTrail = new Trail( MarkersY);
        System.out.println("River Trail: \n" + riverTrail);
        System.out.println("Distance: " + riverTrail.getLength() + " km");
        System.out.println("Difficult: "+ riverTrail.isDifficult(0, MarkersY.size()-1));
        System.out.println("Difficultness between marker number 4 to 6: "+ riverTrail.isDifficult(4, 6));
        System.out.println("Level: " + riverTrail.isLevelTrailSegment(0, MarkersY.size()-1));
        System.out.println("Level between marker number 7 to 9: " + riverTrail.isLevelTrailSegment(7, 9));

    }
}
