package Challenges.Challenge1_VariablesCommentsDatatypes;

/**
 * Level 1: Write a program that accepts 2 numbers from the user and calculates
 * the sum, difference, product and quotient and remainder of these numbers.
 *
 * I want you to use camelCase
 * I want atleast 2 comments
 */
public class C1_Rohan
{
    // USE THIS SYNTAX TO ACCEPT INPUT FROM THE USER
    // Scanner sc new Scanner(System.in);
    // int i = sc.nextInt();
    // double d = sc.nextDouble();
    public static void main(String args[])
    {
        
        // INITIALIZING two variables that I will perform all actions on
       int x = 14;
       int y = 2 ;
       
       // DECLARATIONS
       int sum;
       int difference;
       int product;
       int remainder;
       
       //PROCESSING
       sum = x + y;
       difference = x - y;
       product = x * y;
       
       System.out.println("The sum of these 2 numbers is " + sum );
       System.out.println("The difference between the numbers is " + difference);
       System.out.println("The product of these numbers is" + product);
    }
}