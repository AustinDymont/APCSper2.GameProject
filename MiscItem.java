
/**
 * Write a description of class MiscItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiscItem extends Item
{
    private int health;
    private String bonus;
    /**
     * Constructor for MiscItem
     * @param String n is the name, String d is the discripttion, 
     *  int h is the health, String b is the bonus that the item gives.
     */
    public MiscItem(String n, String d, int h, String b)
    {
        super(n,d,h);
        bonus = b; 
    }
    
    public void useItem(/*enter in param of entity*/)
    {
        //check what type, and then add it to the total score or whatever.
    }
}