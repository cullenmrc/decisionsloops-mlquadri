import java.util.Scanner;

/**
 * Write a program that reads a word and prints all substrings, sorted by length. For
 * example, if the user provides the input "rum", the program prints
 * r
 * u
 * m
 * ru
 * um
 * rum
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Substrings
{
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        System.out.print("Enter String: ");
        String inp = s.next();
        
        for( int run = 1;
                 run < inp.length();
                 run++ ) {
           for( int i = 0;
                    i < inp.length();
                    i++ ) {
               System.out.println(inp.substring(i,(i+run)));
            }
           if ()
        }
    }
}
