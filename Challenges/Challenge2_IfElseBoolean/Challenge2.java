package Challenges.Challenge2_IfElseBoolean;
import java.util.Scanner;


/**
 * Since this challenge has multiple level, you can submit multiple files or the same file with clearly labeled parts for what code does what
 * 
 * C2.1: Write A Program that will input 2 numbers from the user and tell you if the first number is divisible by the second number. 
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
public class Challenge2
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
