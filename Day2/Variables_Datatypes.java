package Day2;

// This code explains what datatypes are
/**
 * 
 */
public class Variables_Datatypes
{
    // <ACCESS MODIFIER *NOT IMP*> <DATATYPE> <IDENTIFIER> = <VALUE>
    // datatypes 
    // int: integers
    // double: decimal
    // boolean: true, false
    // char: character
    // String: word, sentence, phrase
    
    //Rules for Camelcase
    /**
     * names of variables should start with a small letter
     * names of classes start with a capital letter
     * every new word begins with a capital letter
     * CONSTANTS are written in ALL CAPS
     */
    
    public static void main(String args[])
    {
        int hello = 5;
        double hi = 3.0;

        int number_of_rotations_per_wheel_turn;
        int numberOfRotationsPerWheelTurn;
        final double PI = 3.1415;
        
        System.out.println("The value stored in Hello is" + hello);
        
        hello = 10;
        
        System.out.println("The value stored in Hello is" + hello); 
        
        System.out.println(5);
        System.out.println("5");
        
    }
}
