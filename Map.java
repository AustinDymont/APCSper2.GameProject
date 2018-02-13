
/**
 * I'M THE MAPPPP!!!!!
 * 
 * @author Austin Dymont
 * @version 1.0
 */
public class Map
{
    private Place[][] map;

    /**
     * Constructor for objects of class Map
     */
    public Map()
    {
       map = new Place[8][5];
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param String n is the name
     * @param String d is the discription 
     * @param int r is the row
     * @param int c is the column
     */
    public void add(String n, String d, int r, int c)
    {
        map[r][c] = new Place(n,d,r,c);
    }
    
    public Place getPlace(int mr,int mc)
    {
        return map[mr][mc];
    }
    
    public Place getPlace(Entity e)
    {
        int mr = e.getMapRow();
        int mc = e.getMapColumn();
        
        return map[mr][mc];
    }
}
