package Challenges.Challenge2_IfElseBoolean;

import java.util.Scanner;



/**
 * Since this challenge has multiple level, you can submit multiple files or the same file with clearly labeled parts for what code does what
 * 
 * C2.1: Write A Program that will input 2 numbers from the user and tell you iif the first number is divisible by the second number. 
 * Use what we did in class today. To input numbers impor the Scanner class, and use Scanner.nextInt() to input numbers. Refer to challenge 1 for syntax
 * 
 * C2.2: Write a simple calculator that accepts a number from the user and based on this number decides wether to add, subtract, mult, divide or give
 * the remainder. Then accept 2 numbers from the user and perform the requested operation
 * 
 * (Opional) C2.3: Write a program that tells me what numbers from 1 to 7 divide a certain number. 
 *
 * 
 * 
 */
public class C2_2_Rithwick
{
    public static void main(String args[])
    {  
        //Get ready for first input
        Scanner first = new Scanner(System.in);
        // Asks what operator is desired
        System.out.println("Enter 1 for Addition, 2 for Substraction, 3 for Multiplication, 4 for Disvison, or 5 for Remainder");
        int operator = first.nextInt();
        //Checks what operator is selected
        //enter num 1 and 2
        //int num1 = first.nextInt();
        if (operator == 1) 
        {
            System.out.println("You have picked Addition");
            Scanner num1 = new Scanner(System.in);
            // Asks what first number is desired
            System.out.println("Enter your first number");
            int operator2 = num1.nextInt();
            // Asks what second number is desired
            Scanner num2 = new Scanner(System.in);
            System.out.println("Enter your second number");
            int operator3 = num2.nextInt();
            //Does operation
            int operator4 = operator2 + operator3;
            //Shows Output
            System.out.println("Your Sum is " + operator4);
        } else if (operator == 2) 
        {
            System.out.println("You have picked Substraction");
            Scanner num1 = new Scanner(System.in);
            // Asks what first number is desired
            System.out.println("Enter your first number");
            int operator2 = num1.nextInt();
            // Asks what second number is desired
            Scanner num2 = new Scanner(System.in);
            System.out.println("Enter your second number");
            int operator3 = num2.nextInt();
            //Does operation
            int operator4 = operator2 - operator3;
            //Shows Output
            System.out.println("Your Diffrence is " + operator4);
        }
        else if (operator == 3) 
        {
            System.out.println("You have picked Multiplication");
            Scanner num1 = new Scanner(System.in);
            // Asks what first number is desired
            System.out.println("Enter your first number");
            int operator2 = num1.nextInt();
            // Asks what second number is desired
            Scanner num2 = new Scanner(System.in);
            System.out.println("Enter your second number");
            int operator3 = num2.nextInt();
            //Does operation-
            int operator4 = operator2 * operator3;
            //Shows Output
            System.out.println("Your Product is " + operator4);
        }
        else if (operator == 4) 
        {
            System.out.println("You have picked Disvison");
            Scanner num1 = new Scanner(System.in);
            // Asks what first number is desired
            System.out.println("Enter your first number");
            double operator2 = num1.nextInt();
            // Asks what second number is desired
            Scanner num2 = new Scanner(System.in);
            System.out.println("Enter your second number");
            double operator3 = num2.nextInt();
            //Does operation
            double operator4 = operator2 / operator3;
            //Shows Output
            System.out.println("Your Quotient is " + operator4);
        }
        else if (operator == 5) {
            System.out.println("You have picked Remainder");
            Scanner num1 = new Scanner(System.in);
            // Asks what first number is desired
            System.out.println("Enter your first number");
            int operator2 = num1.nextInt();
            // Asks what second number is desired
            Scanner num2 = new Scanner(System.in);
            System.out.println("Enter your second number");
            int operator3 = num2.nextInt();
            //Does operation
            int operator4 = operator2 % operator3;
            //Shows Output
            System.out.println("Your Remainder is " + operator4);
        } else {
            System.out.println("Try again but only enter 1,2,3,4,or 5 next time");
        }

    }
}
