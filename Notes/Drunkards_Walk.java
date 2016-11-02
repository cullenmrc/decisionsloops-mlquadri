import java.util.Random;
/**
A drunkard in a grid of streets randomly picks one of four
directions and stumbles to the next intersection, then again randomly picks one of
four directions, and so on. You might think that on average the drunkard doesn’t
move very far because the choices cancel each other out, but that is not the case.
Represent locations as integer pairs (x, y). Implement the drunkard’s walk over 100
intersections, starting at (0, 0), and print the ending location.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Drunkards_Walk
{
   public static void main(String[] Args)
   {
       Random r = new Random();
       int move=0;
       int X=0;
       int Y=0;
       for(int i=0; i<=100; i++)
       {
           move=r.nextInt(4)+1;
           if(move==1)
           {
               Y+=1;
           }else if(move==2)
           {
               Y-=1;
           }else if(move==3)
           {
               X+=1;
           }else{
               X-=1;
           }
       }
       System.out.print(X+","+Y);
   }
}
