package Day8_Functions.Folder1;


/**
 * Write a description of class Class1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Class1
{
    // instance variables - replace the example below with your own
    private int x;
    
    // instance variables - replace the example below with your own
    private static int class1private = 0;
    protected static int class1protected = 1;
             static int class1default = 2;
    public static int class1public = 3;


    /**
     * Constructor for objects of class Class1
     */
    public Class1()
    {
       System.out.println(Folder1_1.Class1.class1public);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
