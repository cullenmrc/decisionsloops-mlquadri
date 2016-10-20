/**
 * A year with 366 days is called a leap year. Leap years are necessary to keep the cal-
 * endar synchronized with the sun because the earth revolves around the sun once
 * every 365.25 days. Actually, that figure is not entirely precise, and for all dates after
 * 1582 the Gregorian correction applies. Usually years that are divisible by 4 are leap
 * years, for example 1996. However, years that are divisible by 100 (for example, 1900)
 * are not leap years, but years that are divisible by 400 are leap years (for example,
 * 2000). Write a program that asks the user for a year and computes whether that year
 * is a leap year. Provide a class Year with a method isLeapYear. Use a single if statement
 * and Boolean operators.
 * 
 * @author (Muhammed) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class LeapYear
{
    boolean leapyear=false;
    final int FOUR=4;
     /**
     * Default constructor for objects of class LeapYear
     */
    public LeapYear()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year=s.nextInt();
        isLeapYear(year);
        System.out.println("year "+year+" is a leap year: "+leapyear);
    }
    public void isLeapYear(int year)
    {
        if ( (((year%FOUR)==0 )&&((year%100)>0))||((year%400)==0) )
        {
            leapyear=true;
        }
    }
}
