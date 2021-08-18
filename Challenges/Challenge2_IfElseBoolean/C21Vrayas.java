package Challenges.Challenge2_IfElseBoolean;

import java.util.Scanner;
/**
 * Write a description of class C21Vrayas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class C21Vrayas
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select a number");
        int Num1 = sc.nextInt();
        System.out.println("Select another number");
        int Num2 = sc.nextInt();
       
        if( Num1 % Num2 <= 0)
        {
            System.out.println(Num1 + " is divisible by " + Num2);
           
        }
        else
        {
            System.out.println(Num1 + " is not divisable by " + Num2);

        }
    }
}        