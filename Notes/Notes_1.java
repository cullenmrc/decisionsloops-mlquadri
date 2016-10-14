import java.util.Scanner;
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
         *      Operators:
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
        /*
         * when comparing strings the == returns true if the 2 varables refrence the same 
         *      obgect(memory space location)
         * if you dont want this use the equal methoud
         */
        Scanner s =new Scanner(System.in);
        String s1 =s.next();
        String s2 =s.next();
        if (s1==s2)//prints false
        {
             System.out.println("true");
        }else{
             System.out.println("false");
        }
        
        if (s1.equals(s2))//prints trur
        {
             System.out.println("true");
        }else{
             System.out.println("false");
        }
        
        /*
         * a than b
         * A than B
         * 0 than 1
         * B than a
         * Determans which string comes first lexographiclly
         *      compareTo method
         *          returns
         *               0: trings are the same lexographicly
         *              <0: S1<S2
         *              >0: S1>S2
         */
        int resualt=s1.compareTo(s2);
        String first=null;
        if (resualt<0)//prints trur
        {
             first=s1;
        }else if(resualt>0){
             first=s2;
        }
        if(first != null)
        {
            System.out.println("The first string is: "+first);
            //cant invoce a methoud on a varable thats value is null
            System.out.println("The first string's langth is: "+first.length());
        }else{
            System.out.println("The strins are equal");
        }
        
        /*
         * boolian logic
         *     Name        Java   Python   President
         *      NOT         !       not     Highest
         *      AND         &&      and     Middle
         *      OR          ||      or      Lowest
         */
        }
    public static boolean flootsAreEqual(double n1, double n2)
    {
        /*
         * if we use the == for doubles it will only return true if all the binary digets 
         *      match
         *Insted we wwant to try the epalon varable
         */
        final double EPSILON=1e-14;
        
        if (Math.abs(n1-n1)<EPSILON)
        {
            return true;
        }else{
            return false;
        }
        //return(if (Math.abs(n1-n1)<EPSILON)) also gives the same return value
    }
}
