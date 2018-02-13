import java.util.ArrayList;
/**
 * Object to represent specific locations in the map
 * @author Austin Dymont
 * @version 1.0
 */
public class Place extends NamedThing
{ 
    private ArrayList<Item> stuff; 
    private int positionRow;
    private int positionColumn;
    /**
     * Constructor for objects of class Place
     */
    public Place(String n, String d, int r, int c)
    {
       super(n,d);
       stuff = new ArrayList<Item>();
       positionRow = r;
       positionColumn = c; 
    }
    
    public void addItem(Item i)
    {
        stuff.add(i);
    }
}
