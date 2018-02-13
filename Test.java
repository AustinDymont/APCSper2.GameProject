
/**
 * Write a description of class DiceTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    public static void main(String[] args){
        System.out.print("\f");
        
        
        //Dice.roll test
        /*
        for(int i = 0; i <10; i ++){
        System.out.println(Dice.roll(30));
        }
         */
        
        
        //test for attack method
        /*
        Entity e1 = new Entity("e1","First entity",10,13,10,10,10,10,10,10,0);
        Entity e2 = new Entity("e2","Second entity",10,13,10,10,10,10,10,10,0);

        e1.attack(e2);

        System.out.println(e2.getHealth()); 
         */
        
        
        //initial map test.
        Map map = new Map();
        map.add("Tavern", "The Tavern is a old wooden rugged hall",7,1);
        map.add("Room", "The room you share with Geoff",7,0);
        map.add("Town", "Put discrip. of the town",6,1);
        map.add("Gate", "Gate",5,1);
        map.add("River", "River",5,2);
        map.add("Bridge","Bridge",4,1);
        map.add("Town Cross Roads","Cross Roads 1",3,1);
        map.add("Zombies","Graveyard first part",3,0);
        map.add("Mountain", "Mountian pass",3,2);
        map.add("Tower Entrance","Tower Entrance",3,3);
        map.add("Tim's Room","Messy",2,3);
        map.add("Laake", "Laaake",2,1);
        map.add("Graveyard","Nori' parents are dead",2,0);
        map.add("boss", "Big boss is here",1,0);
        map.add("Entrance", "Entrance of boss room",1,1);
        map.add("Flowers", "Geoff is also dead", 1,2);
        map.add("Cross Roads", "Crossroads",1,3);
        map.add("WaterFall", "wet",1,4);
        map.add("Cave","dank",0,2);
        map.add("Old lady's palce","SHes old",0,3); 
        
        Entity tester = new Entity("Tester","Fake",7,1);
        
        System.out.println(map.getPlace(tester));
        System.out.println(map.getPlace(7,0));
        
    }
}