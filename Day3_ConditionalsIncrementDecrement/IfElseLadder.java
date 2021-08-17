package Day3_ConditionalsIncrementDecrement;


/**
 * Write a description of class IfElseLAdder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IfElseLadder
{
    public static void main(String args[])
    {
        int num = 6;
        
        
        if( num % 2 == 0)
        {
            System.out.println("This number is a multiple of 2");
        }
        else
            if( num % 3 == 0)
            {
                System.out.println("This number is a multiple of 3");
            }
            else
                if( num % 4 == 0)
                {
                    System.out.println("This number is a multiple of 4");
                }
                else
                    if( num % 5 == 0)
                    {
                        System.out.println("This number is a multiple of 5");
                    }
    }
}
