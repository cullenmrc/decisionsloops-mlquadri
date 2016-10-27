import java.util.Scanner;

/**
 * Rewrite the following for loop into a while loop.
 * int s = 0;
 * for (int i = 1; i <= 10; i++)
 * {
 *      s = s + i;
 * }
 * 
 * Rewrite the following do loop into a while loop.
 * int n = in.nextInt();
 * double x = 0;
 * double s;
 * do
 * {
 *      s = 1.0 / (1 + n * n);
 *      n++;
 *      x = x + s;
 * }
 * while (s > 0.01);
 * 
 * @author (Muhammed Quadri) 
 * @version (10-26-16)
 */
public class Rewrite_Loops
{
    public static void main(String[] args)
    {
        int s = 0;
        int i = 1;
        while(i <= 10)
        {
            s = s + i;
            i++;
        }

    
        
    }
    public static void newMain() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double x = 0;
        double s;
        boolean t = true;
        while (t)
        {
            s = 1.0 / (1 + n * n);
            n++;
            x = x + s;
            t = s > 0.01;
        }
    }
}
