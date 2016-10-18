/**
 * Complete the following code to test whether two circles, each having a user-defined radius and 
 * a fixed center point lying along the same horizontal line, are disjoint, overlapping, or 
 * mutually contained.
 */
import java.util.Scanner;
public class CircleOverlap
{
    private double xcenter1 = 0;
    private double ycenter1 = 0;
    private double xcenter2 = 40;
    private double ycenter2 = 0;
    private double radius1 = 0;
    private double radius2 = 0;
    private double distance = 0;
    private String response1 = null;
    private String response2 = null;
    
    public static void main(String[] args)
    {
        CircleOverlap co = new CircleOverlap();
        co.getInput();
        co.doCalculations();
    }

    public void getInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the radius of the first circle: ");
        radius1 = in.nextDouble(); 
        System.out.print("Input the x and y coordinate of the first circle (x,y): ");
        response1 = in.next();
        System.out.print("Input the radius of the second circle: ");
        radius2 = in.nextDouble(); 
        System.out.print("Input the x and y coordinate of the second circle (x,y): ");
        response2 = in.next();
        getXY();
    }

    public void doCalculations() {
        calculateDistance();
        changeCenter();
        double maxX1 = xcenter1 + radius1;
        double maxY1 = ycenter1 + radius1;
        double maxX2 = xcenter2 + radius2;
        double maxY2 = ycenter2 + radius2;

        double minX1 = xcenter1 - radius1;
        double minY1 = ycenter1 - radius1;
        double minX2 = xcenter2 - radius2;
        double minY2 = ycenter2 - radius2;
        if(maxX1 < minX2) {
            System.out.println("The circles are disjoint!");
        } else if (((minX2 < minX1)&&(maxX1 < maxX2)) || ((minX1 < minX2)&&(maxX2 < maxX1))) {
            System.out.println("The circles are mutually contained!");
        } else {
            System.out.println("The circles are overlapping");
        }
    }
    
    private void getXY() {
        //String looks like (x,y)
        response1 = response1.substring(1,response1.length()-1);
        response2 = response2.substring(1,response2.length()-1);
        //String looks like x,y
        String stringX1 = response1.substring(0,response1.indexOf(","));
        String stringY1 = response1.substring(response1.indexOf(",")+1);
        
        String stringX2 = response2.substring(0,response2.indexOf(","));
        String stringY2 = response2.substring(response2.indexOf(",")+1);
        
        xcenter1 = Double.parseDouble(stringX1);
        ycenter1 = Double.parseDouble(stringY1);
        
        xcenter2 = Double.parseDouble(stringX2);
        ycenter2 = Double.parseDouble(stringY2);
        
    }
    
    private void calculateDistance() {
        distance = Math.sqrt(Math.pow((xcenter2-xcenter1),2) + Math.pow((ycenter2-ycenter1),2));
    }
    
    private void changeCenter() {
        xcenter1 = 0;
        xcenter2 = distance;
        ycenter1 = 0;
        ycenter2 = 0;
    }

}