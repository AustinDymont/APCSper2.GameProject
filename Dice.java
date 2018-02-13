
/**
 * Dice class to represent a dice roller
 * 
 * @author Austin Dymont
 * @version 1.2
 */
public class Dice
{
    /**
     * method to roll a D x
     */
    public static int roll(int x){

        return((int)(Math.random()*x)+1);

    }

    /**
     * method to roll a D 20
     */
    public static void d20(){
        for(int i = 0 ; i <10; i++){
            System.out.println("\f" + ((int)(Math.random()*20)+1));
            /*
            found on stack overflow tm
             */
            try{
                Thread.sleep(50);
            } 
            catch(InterruptedException ex) 
            {
                Thread.currentThread().interrupt();
            }           
        }
    }

    /**
     * method to roll a D 4
     */
    public static void d4(){
        for(int i = 0 ; i <10; i++){
            System.out.println("\f" + ((int)(Math.random()*4)+1));
            /*
            found on stack overflow tm
             */
            try{
                Thread.sleep(50);
            } 
            catch(InterruptedException ex) 
            {
                Thread.currentThread().interrupt();
            }           
        }
    }

    /**
     * method to roll a D 6
     */
    public static void d6(){
        for(int i = 0 ; i <10; i++){
            System.out.println("\f" + ((int)(Math.random()*6)+1));
            /*
            found on stack overflow tm
             */
            try{
                Thread.sleep(50);
            } 
            catch(InterruptedException ex) 
            {
                Thread.currentThread().interrupt();
            }           
        }
    }

    /**
     * method to roll a D 8
     */
    public static void d8(){
        for(int i = 0 ; i <10; i++){
            System.out.println("\f" + ((int)(Math.random()*8)+1));
            /*
            found on stack overflow tm
             */
            try{
                Thread.sleep(50);
            } 
            catch(InterruptedException ex) 
            {
                Thread.currentThread().interrupt();
            }           
        }
    }

    /**
     * method to roll a D 10
     */
    public static void d10(){
        for(int i = 0 ; i <10; i++){
            System.out.println("\f" + ((int)(Math.random()*10)+1));
            /*
            found on stack overflow tm
             */
            try{
                Thread.sleep(50);
            } 
            catch(InterruptedException ex) 
            {
                Thread.currentThread().interrupt();
            }           
        }
    }

    /**
     * method to roll a D 12
     */
    public static void d12(){
        for(int i = 0 ; i <10; i++){
            System.out.println("\f" + ((int)(Math.random()*12)+1));
            /*
            found on stack overflow tm
             */
            try{
                Thread.sleep(50);
            } 
            catch(InterruptedException ex) 
            {
                Thread.currentThread().interrupt();
            }           
        }
    }
}
