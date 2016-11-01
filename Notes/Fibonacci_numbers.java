import java.util.Scanner;
public class Fibonacci_numbers
{
    public static void main(String[] Args)
    {
        int p1 = 0;
        int p2 = 0;
        int f = 1;
        int pos = -1;
        Scanner s = new Scanner(System.in);
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
            int r=1;
            while(r==2)
            {
                p1 = p2+0;
                p2 = f+0;
                f = p1+p2;
                System.out.println(f);
            }
        }else{
            for(int i=0;
                i<=pos;
                i++)
            {
                p1 = p2+0;
                p2 = f+0;
                f = p1+p2;
            }
            System.out.println(f);
        }
    }
}
