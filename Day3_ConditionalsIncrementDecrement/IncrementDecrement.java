package Summer2021.Day3_ConditionalsIncrementDecrement;


/**
 * Write a description of class IncrementDecrement here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IncrementDecrement
{
    public static void main(String args[])
    {
        int a = 0;
        int b = 1;
        // DECLARARION
        int j; // DECLARING
        
        // System.out.println(j);  //ERRORS OUT BECAUSE NOT INIT. Uncomment to see the error
        j = 5; // ASSIGNING
        
        // INITIALIZATION
        int i = 5;
        System.out.println(i);
        
        
        
        //SHORTHAND
        int q = 5;
        int w = 10;
        int e = 15;
        int r = 20;
        
        int sum1 = 0;
        sum1 += q;
        sum1 += w;
        sum1 += e;
        sum1 += r;
        System.out.println(sum1);
        
        int sum = 0;
        sum = sum + q;
        sum = sum + w;
        sum = sum + e;
        sum = sum + r;
        System.out.println(sum);
        
        
        int hi = 0;
        hi = hi + 1;
        hi += 1;
        hi++;      // increment by 1
        System.out.println(hi); // 3
        
        // +=addition    -=sub    *=mult    /=div   %=remainder
        // <VARIABLE>++; <VARIABLE>--;
        
    }   
}
