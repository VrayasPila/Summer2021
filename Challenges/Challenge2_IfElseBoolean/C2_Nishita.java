package Challenges.Challenge2_IfElseBoolean;
import java.util.Scanner;

/**
 * Write a description of class C2_Nishita here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class C2_Nishita
{
    public static void main(String args[])
    {
        //Code for Challenge 2.1
        Scanner sc = new Scanner(System.in);
        System.out.println("Select a number");
        int a = sc.nextInt();
        System.out.println("Select another number");
        int b = sc.nextInt();  
       
        if (a % b == 0)
        {
         System.out.println ("number is divisble by b");
        }
        else
        if (a % b != 0)
        {
           System.out.println ("number is not divisble by b");
        } 
	
    }
}
