
/**
 * Class representation of a object in The Dude program.
 * 
 * @author Ausitn Dymont 
 * @version 1.0
 */
public abstract class NamedThing
{
    private String name; 
    private String description; 
    /**
     * Constructor for objects of class NamedThing
     * 
     * @param String n is a name, String d is the discription 
     */
    public NamedThing(String n , String d)
    {
        name = n; 
        description = d; 
    }

    /**
     * method to return the name of a thing
     * 
     * @return name 
     */
    public String getName()
    {
        return name;
    }

    /**
     * method to String override 
     * 
     * @return discrioption 
     */
    public String toString()
    {
        return name + " " + description;
    }
}
