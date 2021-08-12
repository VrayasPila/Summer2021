package Challenges.Challenge1_VariablesCommentsDatatypes;

/**
 * Level 1: Write a program that accepts 2 numbers from the user and calculates
 * the sum, difference, product and quotient and remainder of these numbers.
 * 
 * I want you to use camelCase
 * I want atleast 2 comments
 */
import java.util.Scanner;

public class C1_Rithwick
{
    // USE THIS SYNTAX TO ACCEPT INPUT FROM THE USER
    // Scanner sc new Scanner(System.in);
    // int i = sc.nextInt();
    // double d = sc.nextDouble();

    
    
    /**
     * sa2d2l k4fjaslkdf
     * '2' != 2
     * Integer.parseInt(sa2d2l) => characters=> numbers
     */
    public static void main(String args[])
    {  
        //Get ready for first input
        Scanner first = new Scanner(System.in);
        // Asks what operator is desired
        System.out.println("Enter 1 for Addition, 2 for Substraction, 3 for Multiplication, 4 for Disvison, or 5 for Remainder");
        int operator = first.nextInt();
        //Checks what operator is selected
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
        }else {
            System.out.println("Try again but only enter 1,2,3,4,or 5 next time");
        }

    }
}