package Day3_ConditionalsIncrementDecrement;


/**
 * Write a description of class Boolean_If here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Boolean_If
{
    public static void main(String args[])
    {
        // hi 
        int i = 1;
        double d = 1;
        
        boolean b = true;
        boolean bo = false;
        
        
        //RELATIONAL OPERATORS
        // RElation between two things
        
        
        //<less than     >greater than          ==equal to     !=not equal to     <=         >=
        boolean lessThan = i < d;
        //System.out.println(lessThan);
        
        //math operations follow PEMDAS and the precedence is from left to right        
        //SYNTAX IF if(**CONDITION GOES HERE**) /n { **CODE GOES HERE**}    
        
        /** THIS CODE CHECKS IF A NUMBER IS A MULTIPLE OF 5 **/
        int ex = 4;
        if(ex % 5 == 0)
        {
            System.out.println("Ran after 4");
            System.out.println("Multiple of 5");
        }
        
        ex = 5;
        if( ex % 5 == 0)
        {
            System.out.println("Ran after 5");
            System.out.println("Multiple of 5");
        }
        
        ex = 6;
        if(ex % 5 == 0)
        {
            System.out.println("Ran after 6");
            System.out.println("Multiple of 5");
        }
        
        ex = 4;
        if(ex % 5 == 0)
        {
            System.out.println("Ran after 4");
            System.out.println("Multiple of 5");
        }
        else
        {
            System.out.println("Ran after 4");
            System.out.println("NOT a Multiple of 5");
        }
        
        ex = 5;
        if( ex % 5 == 0)
        {
            System.out.println("Ran after 5");
            System.out.println("Multiple of 5");
        }
        else
        {
            System.out.println("Ran after 5");
            System.out.println("IS a Multiple of 5");
        }
        
        ex = 6;
        if(ex % 5 == 0)
        {
            System.out.println("Ran after 6");
            System.out.println("Multiple of 5");
        }
        else
        {
            System.out.println("Ran after 6");
            System.out.println("NOT a Multiple of 5");
        }
        
        // SYNTAX OF IF_ELSE if(**DO THIS**){} else{**DO THIS**}
    }
}
