import java.util.ArrayList;
public class Trail
{
    ArrayList<Integer> markers = new ArrayList<Integer>();
    public Trail()
    {
        markers.add(15);
        markers.add(20);
        markers.add(15);
        markers.add(45);
        markers.add(50);
        markers.add(65);
        markers.add(50);
        markers.add(45);
        markers.add(55);
        markers.add(85);
        markers.add(70);
        markers.add(95);
        markers.add(100);
    }

    public Trail(ArrayList<Integer> markers)
    {
        this.markers = markers;
    }

    public int getLength()
    {
        int length = 0;
        for(int i = 0; i < markers.size(); i++)
        {
            length += markers.get(i);
        }
        return length;
    }

    public void addMarker(int add)
    {
        markers.add(add);
    }

    public boolean isLevelTrailSegment(int start, int terminate)
    {
        boolean sameleveltrail = true;
        for( int i = start; i < terminate; i++)
        {
            if( i > start && Math.abs(markers.get(i) - markers.get(i-1)) > 10)
            {
                sameleveltrail = false;
            }                   
        }

        if( markers.get(start) == markers.get(terminate) && sameleveltrail == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isDifficult(int start, int terminate)
    {
        int upHill = 0;
        for(int i = start; i < terminate; i++)
        {
            if(i > 0 && markers.get(i) - markers.get(i-1) > 0)
            {
                upHill += (markers.get(i) - markers.get(i-1));
            }
        }

        if(upHill > 100 && !isLevelTrailSegment(start, terminate))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String toString()
    {
        String output = new String();
        for(int i = 0; i < markers.size(); i++)
        {
            output += i + " " + markers.get(i) + "\n";
        }
        return output;
    }
}
