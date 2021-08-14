package Summer2021.Challenges.Challenge2_IfElseBoolean;

import java.util.Scanner;


/**
 * Since this challenge has multiple level, you can submit multiple files or the same file with clearly labeled parts for what code does what
 * 
 * C2.1: Write A Program that will input 2 numbers from the user and tell you iif the first number is divisible by the second number. 
 * Use what we did in class today. To input numbers impor the Scanner class, and use Scanner.nextInt() to input numbers. Refer to challenge 1 for syntax
 * 
 * C2.2: Write a simple calculator that accepts a number from the user and based on this number decides wether to add, subtract, mult, divide or give
 * the remainder. Then accept 2 number from the user and perform the requested operation
 * 
 * (Opional) C2.3: Write a program that tells me what numbers from 1 to 7 divide a certain number. 
 *
 * 
 * 
 */
public class C2_1_Rithwick
{
    public static void main(String args[])
    {
        Scanner num1 = new Scanner(System.in);
        // Asks what first number is desired
        System.out.println("Enter your first number");
        int operator2 = num1.nextInt();
        // Asks what second number is desired
        Scanner num2 = new Scanner(System.in);
        System.out.println("Enter your second number");
        int operator3 = num2.nextInt();
        // does the operration
        double operator4 = operator2 % operator3;
        if (operator4 == 0) {
            System.out.println(operator2 + " is divisible by " + operator3);
        } else {
            System.out.println(operator2 + " is not divisible by " + operator3);
        }

    }
}
