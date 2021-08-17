package Day7_StringMathFunctions;


public class Arrays
{
    // Arrays are collections of objects
    public static void main(String args[])
    {
        // SYNTAX
        // DATATYPE IDENTIFIER = "new" datatypeRepeated[size];
        // Comp Vision LIb that identifies all faces in a picture => faces
        
        String[] faces = {"HARRY", "JERRY", "MOUSE", "GRASS"};
        int[] array = new int[5]; // initialization to 0 
        int[] temp = new int[7];
        
        int[] initArray = {5,10,15,20,25};
        
        array[2] = 15;
        
        // The size of an array can be found out using <name>.length
        
        for(int i = 0; i <= faces.length; i++)
        {
            System.out.println(faces[i]);
        }
        
        //             0   1   2    3   4    5    6    available indices 0 to (length-1)
        int[] test = {14, 17, 324, 45, 23, 1235, 345};
        double[] other = new double[5];
        
        // what is the size of both of these?
        
        System.out.println(test[0]);  //7 //6,7 // How many elements can test arrray hold?
        System.out.println(other[0]); //5 //1235, 1 how many elements can other array hold?
        
        
    }
}
