/**
 * Write a description of class State here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    public void setSentiment(double sentiment)
    {
        this.sentiment=sentiment;
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
    public double getRadius()
    {
        double radius;
        
        return radius;
    }
    


    public String getAbbreviation()
    {
        return abbreviation;
    }


    public twitter4j.GeoLocation getCenter()
    {
        return center;
    }

    public double getArea()
    {
        return area;
    }


    public double getSentiment()
    {
        return sentiment;
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
    public String toString()
    {
        String str="abbreviation: "+abbreviation+", center: "+center+", area: "+area+", sentiment: "+sentiment;
        return str;
    }
}
