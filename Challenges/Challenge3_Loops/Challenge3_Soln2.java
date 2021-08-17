package Challenges.Challenge3_Loops;

import java.util.Scanner;
/**
 * C3.1: Write a program that prints out a square with side length 5 and #.
 *                  Something like this #####
 *                                      #####
 *                                      #####
 *                                      #####
 *                                      #####
 *                                      
 *                                            using a for loop. Then rewrite your code using a while loop.
 *        
 *        
 * C3.2: Build upon yesterday's calculator but this time, instead of numbers for operators have symbols. Use switch statments.
 * So the input should be like 
 * 
 * OUTPUT: ASK FOR NUMBER  
 * INPUT
 * OUTPUT: ASK FOR SYMBOL
 * INPUT
 * OUTPUT: ASK FOR NUMBER
 * INPUT
 * OUTPUT: NUMBER SYMBOL NUMBER = ANSWER 
 * INPUT
 * OUTPUT: Do you want to continue?
 * 
 * 5
 * +
 * 10
 * 5 + 10 = 15
 * Do you want to continue?
 * 
 * Keep asking the user for input until they stop. Handle errors like entering something other than a symbol.
 *
 *       
 * (Optional) C3.3: Do challenge 3.1 but this time, you are only allowed these types of statements any number of times
 *                      - System.out.print(); 
 *                      - System.out.println();
 *                      - for( ; ; ){}
 *  
 *  (Optional) C3.4 Print this using loops
 *                                          *
 *                                          **
 *                                          ***
 *                                          ****
 *                                          *****
 *  
 *   Rules
1. Have variable names that make sense
2. Follow one convention systematically. If your brackets start on the next line as mine do, Do not change that
3. Try to make the code as concise as possible. Not the least line numbers but logically, as simple as it can be
4. Make the program funny or sarcastic bc why not. 
 */
public class Challenge3_Soln2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

         String option = "yes";
        do
        {
            System.out.println("Enter a number");
            System.out.println("Enter an operator");
            int num1 = 5, num2 = 10;
            char c = sc.nextLine().charAt(0); 
            System.out.println("Enter another number");
           
                switch(c)
                {
                    case '+': System.out.println(num1+num2);
                        break;
                    case '-': System.out.println(num1-num2);
                        break;
                    default: System.out.println("WRONG");
                        break;
                }
            System.out.println("Enter yes to continue");
            option = sc.nextLine();
        }while(option.equalsIgnoreCase("YES"));
    }
}
