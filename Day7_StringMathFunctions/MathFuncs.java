package Day7_StringMathFunctions;


public class MathFuncs
{
    public static void main(String args[])
    {
        //MATH functions are part of the standard JAVA library and help you do math
        
        int a = 5;
        int b = 10;
        
        System.out.println("THis is the greater number " + Math.max(a, b) +" and this is the smaller number" + Math.min(a, b));
        
        if(a>b)
        {
            System.out.println("THis is the greater number" + a +" and this is the smaller number" + b);
        }
        else
        {
            System.out.println("THis is the greater number" + b +" and this is the smaller number" + a);
        }
        
        System.out.println(Math.pow(5,3));
        
        System.out.println(Math.floor(2.5));
        System.out.println(Math.ceil(2.5));
        System.out.println(Math.round(2.5)); // .00000000 - .4 V       .5-.999999 ^
        
        // How to convert from one compatible datatype to another? 
        //TYPECASTING
        
        //double > int
        double h = 5.515879087867987609869876;
        int h_ = (int) h;
        System.out.println(h_);
        
        // int > double
        // h_ > int
        int ha = h_; 
        
        // WHat is typecasting?
        // Coverting one datatype to another
        //<DATATYEPE YOU WANT TO CHANGE TO> identiier = (<DATATYPE YOU WANT TO CHANGE TO>) <variable in another datatype>
        
        
        
    }
}
