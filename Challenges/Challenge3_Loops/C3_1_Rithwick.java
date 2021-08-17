package Challenges.Challenge3_Loops;

import java.util.Scanner;

/**
 * C3.1: Write a challenge that prints out a square with side length 5 and #.
 *                  Something like this #####
 *                                      #####
 *                                      #####
 *                                      #####
 *                                      #####
 *                                      #####
 *                                            using a for loop, then a while loop
 *        
 *        
 * C3.2: Build upon yesterday's calculator but this time, instead of numbers for operators have symbols. Use switch statments.
 * So the input should be like 
 * ASK FOR NUMBER           
 * ASK FOR SYMBOL
 * ASK FOR NUMBER
 * OUPUT: NUMBER SYMBOL NUMBER = ANSWER 
 * Keep asking the user for input until they stop. Handle errors like entering something other than a symbol.
 *
 * Rules
       1. Have variable names that make sense
       2. Follow one convention systematically. If your brackets start on the next line as mine do, Do not change that
       3. Try to make the code as concise as possible. Not the least line numbers but logically, as simple as it can be
       4. Make the program funny or sarcastic bc why not. 
       
 * (Optional) C3.3: TBA
 */
public class C3_1_Rithwick
{
    public static void main(String args[])
    {
        //Get ready for number to divide
        Scanner first = new Scanner(System.in);
        System.out.println("Enter how big you want your square");
        int operator = first.nextInt();
        int operator2 = operator + 1;
        int operator3 = 1;
        while (operator2 != operator3) {
            System.out.println("#");
            operator3 = operator3 + 1;
        }
        System.out.println("Square complete");
    }
}
