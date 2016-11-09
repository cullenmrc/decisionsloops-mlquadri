

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
    twitter4j.GeoLocation location= new twitter4j.GeoLocation();
    Date date;
    double sentiment;
    /**
     * Default constructor for objects of class Tweet
     */
    public Tweet(String user, String text, String location, String date)
    {
        this.user=user;
        this.text=text;
        this.location=location;
        this.date=date;
        calculateSentiment duct = new calculateSentiment.getSengleton();
        x = 0;
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
    public int sampleMethod(int y)
    {
        
    }

}
