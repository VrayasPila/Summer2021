package Summer2021.Day4_GithubLoops;


/**
 * Write a description of class Nesting here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nesting
{
    public static void main(String args[])
    {
        //check if a number is divisible by 6
        
        int x = 1896;
        
        if( x%2 == 0 )
        {
            if( x%3 == 0)
            {
                System.out.println("Divisible by 6");
            }
            
            if( x%5 == 0)
            {
                System.out.println("Divisible by 10");
            }
            
             if( x%7 == 0)
            {
                System.out.println("Divisible by 14");
            }
        }
        else if(x%100 == 0)
        {
            System.out.println("Divisible by 100");
        }
        
        // AND && OR || 
        
        if(x%2==0 && x%3==0)
        {
            System.out.println("Divisible by 6");
        }
        
        if(x%2==0 && x%5==0)
        {
            System.out.println("Divisible by 10");
        }
        
        boolean b = false;
        b = !b;
        System.out.println(b);
    }
}
