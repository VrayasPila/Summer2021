package Summer2021.Challenges.Challenge1_VariablesCommentsDatatypes;

import java.util.Scanner;


/** Level 1: Write a program that accepts 2 numbers from the user and calculates
 * the sum, difference, product and quotient and remainder of these numbers.
 *
 * I want you to use camelCase
 * I want at least 2 comments
 */
public class C1_Rithik
{
    // USE THIS SYNTAX TO ACCEPT INPUT FROM THE USER
    // Scanner sc new Scanner(System.in);
    // int i = sc.nextInt();
    // double d = sc.nextDouble();
   
    public static void main(String args[])
    {
        // Code for challenge 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Select a number");
        int i = sc.nextInt();
        System.out.println("Select another number");
        double d = sc.nextDouble();
        
        System.out.println("The sum is ");
        System.out.println(i+d);
        System.out.println("The difference is ");
        System.out.println(i-d);
        System.out.println("The product is ");
        System.out.println(i*d);
        System.out.println("The quotient is ");
        System.out.println(i/d);
        System.out.println("The remainder is ");
        System.out.println(i%d);
        
        // Enter two numbers for the code to work
       
       
   

       
    }
}