
/**
 * Objects to represent a specific item 
 * 
 * @author Austin Dymont 
 * @version 1.0
 */
public abstract class Item extends NamedThing
{
    private int health; 

    public Item(String n, String d, int h){
        super(n,d);
        health = h; 
    }
}
