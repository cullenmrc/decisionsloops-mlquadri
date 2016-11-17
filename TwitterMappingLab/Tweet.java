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
    /***/
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
     * finds the sentement of the text
     *
     * @return  void
     */
    public void calculateSentiment()
    {
        SentimentDictionary duct = SentimentDictionary.getSingleton();
        Scanner s = new Scanner(text);
        String textword="";
        while(s.hasNext())
        {
            textword=s.next();
            sentiment+=duct.getSentiment(textword);
        }
    }
    
    /**
     * A accessors for instance variable user
     *
     * @return  user as a String
     */
    public String getUser()
    {
        return user;
    }

    /**
     * A accessors for instance variable text
     *
     * @return  text as a String
     */
    public String getText()
    {
        return text;
    }

    /**
     * A accessors for instance variable location
     *
     * @return  location as a twitter4j.GeoLocation
     */
    public twitter4j.GeoLocation getLocation()
    {
        return location;
    }

    /**
     * A accessors for instance variable date
     *
     * @return  date as a Date
     */
    public Date getDate()
    {
        return date;
    }

    /**
     * A accessors for instance variable sentiment
     *
     * @return  sentiment as a double
     */
    public double getSentiment()
    {
        return sentiment;
    }

    /**
     * returns a string of all instence varables
     *
     * @return  all instence varables in string form
     */
    public String toString ()
    {
       String str="User: "+user+", Text: "+text+", Location: "+location+", Date: "+date+", Sentiment: "+sentiment;
       return str;
    }
}
