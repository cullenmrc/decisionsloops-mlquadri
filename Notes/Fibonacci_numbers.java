import java.util.Scanner
public class Fibonacci_numbers
{
    public static void main(String[] Args)
    {
        int f1 = 1;
        int f2 = 1;
        int f3 = f1+f2;
        Scanner s = new Scanner(System.in)
        
        while(true)
        {
            f1 = f3;
            f2 = f3;
            f3 = f1+f2;
            System.out.println(f3);
        }
    }
}
