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
    public static void printStudentClass(int gradeNumber)
    {
        /*
         * switch statment
         *      conditional
         *          like if statment
         *      perfers evaluating discret values
         *      flow of exacution jumps to the branch matching the expresion
         *      can only be used for
         *          Byte
         *          Short
         *          Char
         *          Int int primitive types
         *          Emumerations
         *          String class
         */
        switch(gradeNumber)
        {
            /*
             * it chechs the peramiter value for a class that matches it
             */
            case 6:
            case 7:
            case 8:
            {
                System.out.println("6, 7, 8");
                /*
                 * brack causes the fkow of exacution to leave the breack
                 *      without it the flow just runs into the next case
                 */
                break;
            }
            case 9:
            {
                System.out.println("9");
                break;
            }
            case 10:
            {
                System.out.println("10");
                break;
            }
            case 11:
            {
                System.out.println("11");
                break;
            }
            case 12:
            {
                System.out.println("12");
                break;
            }
            /*
             * defalt = if there is no case that maches the switch
             */
            default:
            {
                System.out.println("IDK");
                break;
            }
        }
    }
    /*
     * inumeration
     *      set of objects that represents a set of objects
     *      compared to == operater
     *      enumerations are Capitulised like classes
     *      enumeration values are Capitulised like constence
     */
    public enum FilingStatus{SINGLE, MARRIED, HEAD_OF_HOUSEHOLD};
    /*
     * filling status      standerd deduction
     * single               6300
     * married joint        12600
     * head of house        9250
     */
    public static double calculateStanderedDeduction(FilingStatus status)
    {
        double deduction = 0;
        switch(status)
        {
            case SINGLE:
            {
                deduction=6300;
                break;
            }
            case MARRIED:
            {
                deduction=12600;
                break;
            }
            case HEAD_OF_HOUSEHOLD:
            {
                deduction=9250;
                break;
            }
        }
        if (status == FilingStatus.MARRIED)
        {
            System.out.println("IDK");
        }
        return deduction;
    }
    public static void incermentEx()
    {
        /*
         * post incerment/detcement operators
         *  equivalent to adding or subtracting 1
         *  returns the curent value and thatn incerments or decrements
         */
        int b=7;
        int a=b++;
        System.out.println("a="+a+" b="+b);//a=7 b=8
        
        /*
         * pre incerment/detcement operators
         *  equivalent to adding or subtracting 1
         *  returns the value after incerments or decrements
         */
        int c=7;
        int d=++c;
        System.out.println("c="+c+" d="+d);//c=8 d=8
        
        /*
         * assiment operators
         *      same as python
         *          +=
         *          -=
         *          *=
         *          /=
         *          %=
         *     does operationb than returns result
         */
        int x=7;
        int y=7;
        int z=7;
        
        x=x+1;
        y++;
        z+=1;
        System.out.println("x="+x+" y="+y+" z="+z);//x=8 y=8 =z=8
    }
}
