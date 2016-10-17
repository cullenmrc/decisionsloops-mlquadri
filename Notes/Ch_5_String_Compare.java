/**
 * Write a description of class Ch_5_String_Compare here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ch_5_String_Compare
{
    final static String word1 = "catalog";
    final static String word2 = "cat";
    public static void main(String[] arg)
    {
       /*
        * 1) word1 is lexicographically greater than "aaa"
        * 2) word1 is lexicographically equal to word2
        * 3) word1 is lexicographically less than word2 
        * 4) word1 and word2 have the same three-letter prefix
        */
       
       if (word1.compareTo("aaa")>0)
       {
           System.out.println("1");
       }
       if (word1.compareTo(word2)==0)
       {
           System.out.println("2");
       }
       if (word1.compareTo(word2)<0)
       {
           System.out.println("3");
       }
       
       if (word1.substring(0,3).equals(word2.substring(0,3)))
       {
           System.out.println("4");
       }
    }
}
