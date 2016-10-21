
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
    public Spectrum()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a wave langth: ");
        double wave=s.nextDouble();
        String print="";
        if(wave < 1.0e-1){
            print="Radio Waves, < 3 × 109";
        }else if( (1e-3 > wave) && (wave < 1e-1) ) { 
            print="Microwaves, 3 × 109 to 3 × 1011";
        }else if( (7e-7>wave)&&(wave<1e-3) ){
            print="Infrared, 3 × 1011 to 4 × 1014";
        }else if( (4e-7>wave)&&(wave<7e-7) ){
            print="Visible light, 4 × 1014 to 7.5 × 1014";
        }else if( (1e-8>wave)&&(wave<4e-7) ){
            print="Ultraviolet, 7.5 × 1014 to 3 × 1016";
        }else if( (1e-11>wave)&&(wave<1e-8) ){
            print="X rays, 3 × 1016 to 3 × 1019";
        }else if(wave>10){
            print="Gamma rays, –11 > 3 × 1019";
        }else{
            print="IDK";
        }
        System.out.println(print);
    }
}
