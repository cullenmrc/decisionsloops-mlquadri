import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * Write a description of test class StateTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StateTest
{
    /**
     * Default constructor for objects of class StateTest
     */
    public StateTest()
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
    public int sampleMethod()
    {
        String abbreviation="1";
        GeoLocation center=1;
        double area=1;
        State s = new State(abbreviation, center, area);
        double sentiment=s.setSentiment
        double radius=s.getRadius
        String abbreviation=s.getAbbreviation
        GeoLocation center=s.
        double area=s.getArea
        double sentiment=s.getSentiment()
        String toString=s.toString
    }
}
