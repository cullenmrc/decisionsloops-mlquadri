import java.lang.Math;
/**
 * A program that creates the states classes, giving them a positon, sentiment and size.
 * 
 * @author (Muhammed Quadri) 
 * @version (1.0)
 */
public class State
{
    String abbreviation; 
    twitter4j.GeoLocation center;
    double area;
    double sentiment;
    /**
     * Default constructor for objects of class State
     */
    public State(String abbreviation, twitter4j.GeoLocation center, double area)
    {
        this.abbreviation=abbreviation; 
        this.center=center;
        this.area=area;
        this.sentiment=sentiment;
    }
    
    /**
     * Changes the states sentiment
     *
     * @param   sentiment   states sentiment
     * @return  void
     */
    public void setSentiment(double sentiment)
    {
        this.sentiment=sentiment;
    }

    /**
     * Calculates the radius of the circle that the state is baced off
     *
     * @return  the radius of the circle that the state is baced off as a double
     */
    public double getRadius()
    {
        double radius=area/(2*(Math.PI));
        return radius;
    }
    
    /**
     * A accessors for instance variable abbreviation
     *
     * @return  abbreviation
     */
    public String getAbbreviation()
    {
        return abbreviation;
    }

    /**
     * A accessors for instance variable center
     *
     * @return  center
     */
    public twitter4j.GeoLocation getCenter()
    {
        return center;
    }

    /**
     * A accessors for instance variable area
     *
     * @return  area
     */
    public double getArea()
    {
        return area;
    }

    /**
     * A accessors for instance variable sentiment
     *
     * @return  sentiment
     */
    public double getSentiment()
    {
        return sentiment;
    }
   
    /**
     * Returns all the instence vareables as a string
     *
     * @return  all instance variables as a string
     */
    public String toString()
    {
        String str="abbreviation: "+abbreviation+", center: "+center+", area: "+area+", sentiment: "+sentiment;
        return str;
    }
}