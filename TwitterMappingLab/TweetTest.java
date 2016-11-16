import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
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
        Date date= 1;
        GeoLocation location= 1;
        double Sentiment= 1;
        String Text= "1";
        String User= "1";
        String toString= "1";
        Tweet t = new Tweet(user, text, location, date);
        Date date= t.getDate();
        GeoLocation location= t.getLocation();
        double Sentiment= t.getSentiment();
        String Text= t.getText();
        String User= t.getUser();
        String toString= t.toString();
    }
}
