// doesnt work
import java.util.Scanner;
public class Fibonacci_numbers
{
    public static void main(String[] Args)
    {
        //p1,p2,p3
        //   p1,p2,p3
        int p1 = 1;
        int p2 = 1;
        int f = 0;
        int pos = -1;
        boolean run = true;
        String continueToRun = null;
        final String F = "F";
        Scanner s = new Scanner(System.in);
        while (run==true)
        {
            while(pos<0)
            {
                System.out.print("Enter the position of the Fibonacci Number(Enter 0 for the entire sequence): ");
                pos = s.nextInt();
                if (pos<0)
                {
                    System.out.println("That is not a valid number");
                }
            }
            if(pos==0)
            {
                f = p1 + p2;
                p1 = p2;
                p2 = f;
                System.out.println(f);
            }
            else if( (pos==1) || (pos==2) )
            {
                f=1;
            }else{
                for (int i = 0; i < pos; i++)
                {
                    f = p1 + p2;
                    p1 = p2;
                    p2 = f;
                }
            }
            System.out.println(f);
            System.out.print("Re-run(T/F): ");
            continueToRun = s.next();
            pos=-1;
            if (continueToRun.equals(F))
            {
                run=false;
            }
        }
    }
}