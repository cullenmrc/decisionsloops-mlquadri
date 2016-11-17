import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Date;
import twitter4j.*;
/**
 * Write a description of test class TweetTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TweetTest
{
    /**
     * Default constructor for objects of class TweetTest
     */
    public TweetTest()
    {
        
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void test()
    {
        Date date;
        twitter4j.GeoLocation location;
        double Sentiment= 1;
        String text= "1";
        String user= "1";
        
        Tweet t = new Tweet(user, text, location, date);
        
        Date datet= t.getDate();
        GeoLocation locationt= t.getLocation();
        double sentimentt= t.getSentiment();
        String textt= t.getText();
        String usert= t.getUser();
        String toString= t.toString();
    }
}
