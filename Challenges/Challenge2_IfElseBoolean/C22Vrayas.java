package Challenges.Challenge2_IfElseBoolean;

import java.util.Scanner;

/**
 * Write a description of class C22Vrayas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class C22Vrayas
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
        System.out.println("Select a number");
        int Num1 = sc.nextInt();
        System.out.println("Select another number");
        int Num2 = sc.nextInt();
        System.out.println("Type A to Add S to Subtract, M to Multiply D to Divide");
        int A = Num1 + Num2;
        int S = Num1 - Num2;
        int M = Num1 * Num2;
        int D = Num1 / Num2;
        int R = Num1 % Num2;
        if ( A == sc.nextInt())
        {
           System.out.println(Num1 + Num2);
        }
        else if( S == sc.nextInt())
        {
           System.out.println(Num1 - Num2);
        }
        else if( M == sc.nextInt())
        {
           System.out.println(Num1 * Num2);
        }
        else if( S == sc.nextInt())
        {
           System.out.println(Num1 - Num2);
        }
        else if( D == sc.nextInt())
        {
        
           if( R >= 0)
           {
               System.out.println(Num1 / Num2 +( "Remainder of ")+ Num1 % Num2);
           }
           else
           {
             System.out.println(Num1 / Num2);  
            }
        }
        
    }
}
