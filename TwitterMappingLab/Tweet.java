import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import twitter4j.*;
/**
 * Write a description of class Tweet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tweet
{
    /** description of instance variable x (add comment for each instance variable) */
    String user;
    String text;
    twitter4j.GeoLocation location;
    Date date;
    double sentiment;
    Scanner s = new Scanner(System.in);
    /**
     * Default constructor for objects of class Tweet
     */
    public Tweet(String user, String text, twitter4j.GeoLocation location, Date date)
    {
        this.user=user;
        this.location=location;
        this.date=date;
        this.text=s.next();
        calculateSentiment();
    }
    
    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public void calculateSentiment()
    {
        SentimentDictionary duct = SentimentDictionary.getSingleton();
        Scanner s = new Scanner(text);
        while(s.hasNext())
        {
            textword=s.next();
            sentiment+=duct.getSentiment(textword);
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public String toString ()
    {
       String str="";
       return str;
    }
}
