package Day5_LoopsSwitch;


/**
 * Write a description of class While here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WhileFor
{
    public static void main(String args[])
    {
        // How many times will this loop run
        // Whats gonna be the output?
        
        
        int count = 0;
        for(int i = 10; i>-10; i--)
        {
            count++;
            if(i%4==0)
            {
                System.out.println("MULTIPLE");
            }
        }
        System.out.println(count); //20
    }
}
