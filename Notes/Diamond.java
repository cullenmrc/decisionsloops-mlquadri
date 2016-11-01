import java.util.Scanner;
/**
 * Write a program that reads an integer and displays, using asterisks, a filled diamond
of the given side length. For example, if the side length is 4, the program should
display
   *
  ***
 *****
*******
 *****
  ***
   *
 */
public class Diamond
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the side length: ");
        int sidelength = s.nextInt();
        int maxstar = (sidelength - 1)*2 + 1 ;
        for(int line = 0; line < (sidelength*2); line++) {
            if(line < sidelength) {
              int starinline = (line-1)*2 + 1;
              int spacing = sidelength-line;
              for(int spaces = 0; spaces<spacing; spaces++) System.out.print(" ");
        
              for(int i = 0; i<starinline; i++) System.out.print("*");
              System.out.println("");
            } else  {
              int starinline = (sidelength-(line-sidelength)-1)*2 + 1;
              int spacing = (sidelength-line) * -1;
              for(int spaces = 0; spaces<spacing; spaces++) System.out.print(" ");
              
              for(int i = 0; i<starinline; i++) System.out.print("*");
              System.out.println("");
            }
        }
    }
}