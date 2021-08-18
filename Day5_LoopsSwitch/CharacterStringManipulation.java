package Day5_LoopsSwitch;
import java.util.Scanner;

/**
 * Write a description of class CharacterStringManipulation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CharacterStringManipulation
{    
    public static void main(String ars[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a String ");
       System.out.print("Enter a String");
       String inputString = sc.nextLine();
       
       char optionC = 'a';
       String optionS = "f";
       String optionS2 = "a";
       
       if(optionC == 'a')
       {
           System.out.println(optionC);
       }
       
       if(optionS == "a")
       {
           System.out.println(optionS + " == a");
       }
    }
}
