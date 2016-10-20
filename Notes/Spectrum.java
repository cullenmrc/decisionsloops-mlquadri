

/**
 * Write a program that prompts the user for a wavelength value and prints a descrip-
 * tion of the corresponding part of the electromagnetic spectrum, as given in the fol-
 * lowing table.
 * 
 * Type             Wavelength (m)          Frequency (Hz)
 * Radio Waves      > 10–1                  < 3 × 109
 * Microwaves       10–3 to 10–1            3 × 109 to 3 × 1011
 * Infrared         7 × 10–7 to 10–3        3 × 1011 to 4 × 1014
 * Visible light    4 × 10–7 to 7 × 10–7    4 × 1014 to 7.5 × 1014
 * Ultraviolet      10–8 to 4 × 10–7        7.5 × 1014 to 3 × 1016
 * X-rays           10–11 to 10–8           3 × 1016 to 3 × 1019
 * Gamma rays       < 10                    –11 > 3 × 1019
 * 
 * @author (Muhammed Quadri) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Spectrum
{
    /**
     * Default constructor for objects of class Spectrum
     */
    public enum type{Radio_Waves, Microwaves, Infrared, Visible_light, 
                        Ultraviolet, X_rays, Gamma_rays}
    public Spectrum()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a wave type: ");
        int type=s.nextEnum();
        string print="";
        switch(type)
        {
            case Radio_Waves:
            {
                print="";
                break;
            }
            case Microwaves:
            {
                print="";
                break;
            }
            case Infrared:
            {
                print="";
                break;
            }
            case Visible_light:
            {
                print="";
                break;
            }
            case Ultraviolet:
            {
                print="";
                break;
            }
            case X_rays:
            {
                print="";
                break;
            }
            case Gamma_rays:
            {
                print="";
                break;
            }
            defult:
            {
                print="";
                break;
            }
        }
    }
}
