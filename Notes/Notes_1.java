/**
 * Write a description of class Nates_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Notes_1
{
    
    public static void main( String[] arg)
    {
        /*
         * Math.random
         *      genrats a random int between 0.0 and 1.0
         *      
         *      to ganate a 
         *      
         * 1=heads 0=tales
         */
        int coin =(int)(Math.random()*2);
        
        /*
         * if statments:
         *      congitional expretion alwas has to go into perenthisis
         *      statments are grouped by blocks
         *          you only need {} if there is multipul lines of code, if you dont only
         *              the first line is considerd the block
         *      
         *      Expresions:
         *                    ==
         *                    !=
         *                    >
         *                    <
         *                    >=
         *                    <=
         *      
         */
        if(coin==1)
        {
            System.out.println("coin is heads");
            System.out.println("you win");
        }
        if (coin ==0)
            System.out.println("coin is tales");
        System.out.println("play again");
        
        if(coin==1)
        {
            System.out.println("coin is heads");
        } else{
            System.out.println("coin is tales");
        }
        
        //simulating a 6 sided die
        int dieRoll =(int)(Math.random()*6)+1;
        
        /*
         * if-else statment
         *      else if is used
         */
        if (dieRoll == 1)
        {
            System.out.println("You rolled a 1");
        }
        else if(dieRoll == 2)
        {
            System.out.println("You rolled a 2");
        }
        else if(dieRoll == 3)
        {
            System.out.println("You rolled a 3");
        }
        else if(dieRoll == 4)
        {
            System.out.println("You rolled a 4");
        }
        else if(dieRoll == 5)
        {
            System.out.println("You rolled a 5");
        }
        else if(dieRoll == 6)
        {
            System.out.println("You rolled a 6");
        }
        }
   }
}
