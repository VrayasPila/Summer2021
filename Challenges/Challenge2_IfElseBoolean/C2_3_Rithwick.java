package Challenges.Challenge2_IfElseBoolean;

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
public class C2_3_Rithwick
{
    public static void main(String args[])
    {
        //Get ready for number to divide
        Scanner first = new Scanner(System.in);
        System.out.println("Enter your first number to divide");
        int operator = first.nextInt();
        Scanner first2 = new Scanner(System.in);
        System.out.println("Enter how many numbers from 1 you want divide");
        System.out.println("Like if you chose 10 it will do your first number/1, first number/2,and etc untill 10");
        int operator2 = first2.nextInt() + 1;
        int operator3 = operator2 - 1;
        int operator4 = 1;
        while (operator2 != operator4) {
             if (operator % operator4 == 0) {
  System.out.println(operator + " is divisible by " + operator4);
} else {
  System.out.println(operator + " is not divisible by " + operator4);
}
operator4 = operator4 + 1;
        }
        System.out.println("Program is finished");
    }
}
