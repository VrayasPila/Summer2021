package Day8_Functions;


public class Functions
{
    //<ACCESS MODIFER> <STATIC> <RETURN DATATYPE> <IDENTIFIER>( PARAMTERS )
    public static void main(String args[])
    {
        System.out.println("Before Print()");
        print();
        System.out.println("After print");
        
        System.out.println("Before calling add");
        int sum = add(5,6);
        System.out.println("After calling add" + sum);
    }
    
    static int add( int num1, int num2 )
    {
        System.out.println("Inside Add() Line 1");
        int sum = num1 + num2;
        System.out.println("Before returning from add");
        return sum;
    }
    
    static void print()
    {
        System.out.println("Ran print");
    }
}
