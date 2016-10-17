/**
 * Complete the following code to test whether two circles, each having a user-defined radius and 
 * a fixed center point lying along the same horizontal line, are disjoint, overlapping, or 
 * mutually contained.
 */
import java.util.Scanner;
public class CircleOverlap
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Input the radius of the first circle: ");
      double radius1 = in.nextDouble(); 
      double xcenter1 = 0;
      double ycenter1 = 0;
      System.out.print("Input the radius of the second circle: ");
      double radius2 = in.nextDouble(); 
      double xcenter2 = 40;
      double ycenter2 = 0;

      double maxX1 = xcenter1 + radius1;
      double maxY1 = ycenter1 + radius1;
      double maxX2 = xcenter2 + radius2;
      double maxY2 = ycenter2 + radius2;
      
      double minX1 = xcenter1 - radius1;
      double minY1 = ycenter1 - radius1;
      double minX2 = xcenter2 - radius2;
      double minY2 = ycenter2 - radius2;
      
      if ()
   }
}