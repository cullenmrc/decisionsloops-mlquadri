import java.util.Scanner;
/**
 * Write a description of class Chapter_6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chapter_6
{
    public static void main(String[] arg)
    {
        /*
         * while loops
         *      evauats boolean condotion
         *          if true exicutes statments
         *          re-evaluats condition
         */
        final int LIMIT=50;
        //inisalisaton
        int count = 1;
        
        while(count<=LIMIT)//condition inside perentisis
        {
            //body
            System.out.println(count);
            count+=1;//updates condition
        }
        System.out.println("Done");
        
        /*
         * comon mistake
         *      infinet mistake
         */
        count = 1;
        //while(count != limit) creats an infinet loop
        while(count >= LIMIT)// use greater than and less than if posible
        {
            System.out.println(count);
            count+=2;
        }
        System.out.println("Done");
        
        /*
         * For loop
         *      3 main parts
         *          inisalisation-exicuted once
         *          condition-tested at each interation
         *          incerment- exicuted at the end of each iterisaton before the condition
         *          
         */
        for(int count2 = 1;
                count2 <= LIMIT;
                count2++)
        {  
            System.out.println(count2);
        }
        System.out.println("Done");
        
        /*
         * comon mistake
         *      off-by-one error
         *          does the inital calue start at 0 or 1
         *          should the condition be < or <=
         *      think dont compile and try at random
         */
        for(int i = 0;
                i <= 10;
                i++)
        {  
            System.out.println(i);
        }
        }
    public static void doExample()
    {
            /*
         * do loop
         *      exacutes the body of the loop
         *      evaluats the boolean condition(like an if statment)
         *          if true
         *              continues loop
         *          if false
         *              continues after the loop
         */
        int count=1;
        do
        {
            System.out.println(count);//body
            
            count +=1;//update
        }
        while (count <=5);//conditin
    }
    public static void sentinelExample()
    {
         /*
         * sentinel Values
         *      valess to termanate a while/do loop
         *      entered by the user
         */
        
        int sum=1;
        Scanner s = new Scanner(System.in);
        int value = 0;
        do
        {
            System.out.println("enter an int(0 to quit)");//0 is the sentanal value
            value = s.nextInt();
            sum +=value;
        }
        while (value != 0);
        System.out.println("sum"+sum);
    }
    public static void sentinelExample2()
    {
        int sum=1;
        Scanner s = new Scanner(System.in);
        int value = 0;
        while(true)
        {
            System.out.println("enter an int(0 to quit)");//-1 is the sentanal value
            value = s.nextInt();
            if (value ==-1)
            {
                // only works on while and switches
                break;
            }
            sum +=value;
        }
        System.out.println("sum"+sum);
    }
    public static void sentinelExample3()
    {
        int sum=1;
        Scanner s = new Scanner(System.in);
        int value = 0;
        while(value!=-1)
        {
            System.out.println("enter an int(0 to quit)");//-1 is the sentanal value
            value = s.nextInt();
            if (value ==-1)
            {
                /*
                 * skips to the end of the inter most loop
                 * re evaluates condition
                 */
                continue;
            }
            sum +=value;
        }
        System.out.println("sum"+sum);
    }
}
