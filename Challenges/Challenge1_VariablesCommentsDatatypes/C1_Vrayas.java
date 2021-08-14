package Summer2021.Challenges.Challenge1_VariablesCommentsDatatypes;


/**
 * Level 1: Write a program that accepts 2 numbers from the user and calculates
 * the sum, difference, product and quotient and remainder of these numbers.
 *
 * I want you to use camelCase
 * I want atleast 2 comments
 */
public class C1_Vrayas 
{
    // USE THIS SYNTAX TO ACCEPT INPUT FROM THE USER
    // Scanner sc new Scanner(System.in);
    // int i = sc.nextInt();
    // double d = sc.nextDouble();
   
    public static void main(String args[])
    {
       //Input
        int v = 13;
       int p = 7;
       
       //Operations
       int sum = v+p;
       int diff = v-p;
       int prod = v*p;
       int quot = v/p;
       int remain = v%p;
       
       //Output
       System.out.println("Sum: "+ sum);
       System.out.println("Differnce: "+ diff);
       System.out.println("Product: "+ prod);
       System.out.println("Quotient: "+ quot);
       System.out.println("Remainder: "+ remain);
       
       
    }
}