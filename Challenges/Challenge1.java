package Challenges;

/**
 * Level 1: Write a program that accepts 2 numbers from the user and calculates
 * the sum, difference, product and quotient and remainder of these numbers.
 * 
 * I want you to use camelCase
 * I want atleast 2 comments
 */
public class Challenge1
{
    // USE THIS SYNTAX TO ACCEPT INPUT FROM THE USER
    // Scanner sc new Scanner(System.in);
    // int i = sc.nextInt();
    // double d = sc.nextDouble();
    
    public static void main(String args[])
    {
       int x = 4;
       int y = 12;
       
       double xd = 4.0;
       System.out.println("Addition");
       System.out.println(x+y);
       
       System.out.println("Subtraction");
       System.out.println(x-y);
       
       System.out.println("Product");
       System.out.println(x*y);
       
       System.out.println("Quotient");
       System.out.println(x/y);
       
       System.out.println("Quotient");
       System.out.println(xd/y);
       
       
    }
}