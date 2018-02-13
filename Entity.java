/**
 * Object representation of a item The Dude program 
 * @author Austin Dymont
 * @version 1.3
 */
public class Entity extends NamedThing
{
    private int health;
    private int armor;
    private Weapon weapon; 
    private int strength; 
    private int dexterity; 
    private int constitution; 
    private int intelligence ;
    private int wisdom;
    private int charisma;
    private double mapPosition;

    /**
     * Constructor for all manual inputs of variables of an object Entity 
     * @param String n is the name
     * @param String d is the discripttion
     * @param int h is the health
     * @param Weapon w is the weapon used
     * @param int st is the strength 
     * @param int de is the dexterity
     * @param int con is the constitution 
     * @param int in is the intelligence
     * @param int wi is the wisdom
     * @param int ch is charisma
     * @param int mp is their position on the map
     */
    public Entity(String n, String d, int h, int a, Weapon w, int st, int de, int co, int in, int wi, int ca, double mp)
    {
        super(n,d);
        health = h; 
        armor = a;
        weapon = w;
        strength = st;
        dexterity = de; 
        constitution = co; 
        intelligence = in; 
        wisdom = wi; 
        charisma = ca; 
        mapPosition = mp;
    }

    /**
     * Constructor for almost all manual inputs of variables of an Entity object 
     * @param String n is the name
     * @param String d is the discripttion
     * @param int h is the health
     * @param int st is the strength 
     * @param int de is the dexterity
     * @param int con is the constitution 
     * @param int in is the intelligence
     * @param int wi is the wisdom
     * @param int ch is charisma
     * @param double mp is their position on the map
     */
    public Entity(String n, String d, int h, int a, int st, int de, int co, int in, int wi, int ca, double mp)
    {
        super(n,d);
        health = h; 
        armor = a;
        weapon = new Weapon("Hands", "plain hands",0,1);
        strength = st;
        dexterity = de; 
        constitution = co; 
        intelligence = in; 
        wisdom = wi; 
        charisma = ca; 
        mapPosition = mp;

    }

    /**
     * Constructor for mostly automatic construction
     * @param String n is the name
     * @param String d is the discription
     * @param double mp is the map position 
     */
    public Entity(String n, String d, double mp)
    {
        super(n,d);
        health = 10; 
        armor = 10;
        weapon = new Weapon("Hands", "plain hands",0,1);
        strength = 10;
        dexterity = 10; 
        constitution = 10; 
        intelligence = 10; 
        wisdom = 10; 
        charisma = 10; 
        mapPosition = mp;

    }

    /**
     * Method to get the health
     * @return health variable 
     */
    public int getHealth()
    {
        return health; 
    }

    /**
     * Method to set the health
     * @param int h is the new health
     */
    public void setHealth(int h)
    {
        health = h; 
    }

    /**
     * Method to get the Armor class
     * @return armor variable 
     */
    public int getArmor()
    {
        return armor; 
    }

    /**
     * Method to set the Armor class
     * @param int a is the new armor
     */
    public void setArmor(int a)
    {
        armor = a; 
    }

    /**
     * Method to get the Strength variable 
     * @return strength variable
     */
    public int getStrength()
    {
        return strength;
    }

    /**
     * Method to set the Strength score
     * @param int st is the new Strength score
     */
    public void setStrength(int st)
    {
        strength = st;
    }

    /**
     * Method to get the Dexterity variable 
     * @return Dexterity variable
     */
    public int getDexterity()
    {
        return dexterity;
    }

    /**
     * Method to set the Dexterity score
     * @param int st is the new Dexterity score
     */
    public void setDexterity(int de)
    {
        dexterity = de;
    }

    /**
     * Method to get the Constitution variable 
     * @return Constitution variable
     */
    public int getConstitution()
    {
        return constitution; 
    }

    /**
     * Method to set the Constitution score
     * @param int st is the new Constitution score
     */
    public void setConstitution(int co)
    {
        constitution = co; 
    }

    /**
     * Method to get the Intelligence variable 
     * @return Intelligence variable
     */
    public int getIntelligence()
    {
        return intelligence; 
    }

    /**
     * Method to set the Intelligence score
     * @param int st is the new Intelligence score
     */
    public void setIntelligence(int in)
    {
        intelligence = in; 
    }

    /**
     * Method to get the Wisdom variable 
     * @return Wisdom variable
     */
    public int getWisdom()
    {
        return wisdom;
    }

    /**
     * Method to set the Wisdom score
     * @param int st is the new Wisdom score
     */
    public void setWisdom(int wi)
    {
        wisdom = wi;
    }

    /**
     * Method to get the Charisma variable 
     * @return Charisma variable
     */
    public int getCharisma()
    {
        return charisma;
    }

    /**
     * Method to set the Charisma  score
     * @param int st is the new Charisma score
     */
    public void setCharisma(int ch)
    {
        charisma = ch;
    }

    /**
     * Method to get the map position variable 
     * @return Map Position variable
     */
    public double getMapPosition()
    {
        return mapPosition;
    }

    /**
     * Method to set the Map poisiton
     * @param int st is the new Map position
     */
    public void setMapPosition(int mp)
    {
        mapPosition = mp;
    }

    /**
     * Method to attack and damage another entity
     * @param Entity e is the entity to attack
     */
    public void attack(Entity e)
    {
        e.setHealth((e.getHealth()-weapon.damage())+e.getStrength());
    }

    /**
     * Method to remove health for easy rememberence
     */
    public void lostHealth(int h)
    {
        this.setHealth(this.getHealth()-h);
    }
}
