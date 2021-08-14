 
import java.util.*;
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
public class Challenge2_Rithik
{
    public static void main(String args[])
    {Scanner sc = new Scanner(System.in);
     Scanner keyboard = new Scanner(System.in);
     String answer;
     do {
         System.out.println("Select 1 - Addition, 2 - Subtraction, 3 - Multiplication, 4 - division, 5 - remainder");
     // Addition code
     int num1 = sc.nextInt();
     if (num1 == 1){
     System.out.println("Select a number to add");
     int add1 = sc.nextInt();
     System.out.println("Select another number to add");
     int add2 = sc.nextInt();
     System.out.println("Your sum is ");
     System.out.println(add1 + add2);
    }
    
    //subtraction code
    else if (num1 == 2){
    System.out.println("Select a number to subtract");
    int sub1 = sc.nextInt();
    System.out.println("Select another number to subtract");
    int sub2 = sc.nextInt();
    System.out.println("Your difference is ");
    System.out.println(sub1 - sub2);
    }
    
    //Multiplication code
    else if (num1 == 3){
    System.out.println("Select a number to multiply");
    int mult1 = sc.nextInt();
    System.out.println("Select another number to multiply");
    int mult2 = sc.nextInt();
    System.out.println("Your product is ");
    System.out.println(mult1 * mult2);
    }
    
    //Division code
    else if (num1 == 4){
    System.out.println("Select a number to divide");
    int div1 = sc.nextInt();
    System.out.println("Select another number to divide");
    int div2 = sc.nextInt();
    System.out.println("Your quotient is ");
    System.out.println(div1 / div2);
    }
    
    //Remainder code
    else if (num1 == 5){
    System.out.println("Select a number for remainder");
    int rem1 = sc.nextInt();
    System.out.println("Select another number for remainder");
    int rem2 = sc.nextInt();
    System.out.println("Your remainder is ");
    System.out.println(rem1 % rem2);
    }
    
    {System.out.println("Would you like to calculate again? Yes or No ");  
     answer = keyboard.next();
}
    if(answer.equalsIgnoreCase("No")){
    System.out.println("Thank You for using calculator");
    break;
}

}
    while (answer.equalsIgnoreCase("Yes"));

    }

    
    
    

}


