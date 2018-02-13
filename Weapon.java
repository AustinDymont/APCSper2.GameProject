
/**
 * Class to represent weapons in game 
 * 
 * @author Austin Dymont 
 * @version 1.0
 */
public class Weapon extends Item 
{
    private int damage; 
    /**
     * Constructor make a Weapon object
     * @param String n is the name , String d is the discription, 
     * int h is the health of the object, int dmg is the damage dice number.
     */
    public Weapon(String n, String d, int h, int dmg)
    {
        super(n,d,h);
        damage = dmg; 
    }
    
    /**
     * Method to roll for damage
     * @return an int for a random amount of damage
     */
    public int damage()
    {
        return Dice.roll(damage);
    }
}
