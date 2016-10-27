/**
 * 6.1) Use nested for loops to produce the following output
 * 1 1
 * 1 2
 * 1 3
 * 1 4
 * 2 1
 * 2 2
 * 2 3
 * 2 4
 * Let the outer loop determine the numbers in the left column, and the inner loop determine 
 * the numbers in the right column. In each iteration, print the loop control variables to 
 * produce the output.
 * 6.2) Repeat Lab 6.1 using nested while loops.
 * 6.3) Repeat Lab 6.1 using nested do loops.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nested_Loops
{
    public static void main(String[] args)
    {
        for (int i=1;
                    i<=2;
                    i++)
        {
            for (int x=1;
                        x<=4;
                        x++)
            {
                System.out.println(i + ": " + x);
            }
        }
    }
}
