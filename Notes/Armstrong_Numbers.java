import java.lang.Math;
/**
 * Write a program to find Armstrong Numbers less than 1000.
 * Armstrong Numbers are numbers whose value is the same as the total of their digits cubed.
 * For example, 1^3 + 5^3 + 3^3 equals 1 + 125 + 27 which equals 153.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Armstrong_Numbers
{
    public static void main(String[] args)
    {
        int total=1;
        String str1=null;
        String str2=null;
        for(int n1=0; n1<=100; n1++)
        {
            for(int n2=0; n2<=100; n2++)
            {
                for(int n3=0; n3<=100; n3++)
                {
                    total=(int)(Math.pow(n1,3)+Math.pow(n2,3)+Math.pow(n3,3));
                    str1=total+"";
                    str2=""+n1+n2+n3;
                    if(str1.equals(str2))
                    {
                        System.out.println(n1+"+"+n2+"+"+n3+"="+str1);
                    }
                }
            }
        }
    }
}
