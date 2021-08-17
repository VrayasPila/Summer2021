package Summer2021.Day5_LoopsSwitch;


/**
 * Write a description of class Switch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Switch
{
   public static void main(String args[])
   {
       // Enter a number
       // if a == 5 then do this else if a == 4 then do this yada yada IF ELSE LADDER
       System.out.println("ENter 1 for add and 2 for sub");
       int option = 1;
       if(option == 1)
       {
           //System.out.println(2+2);
       }
       else
           if(option == 2)
           {
               //System.out.println(2-2);
           }
            else
            {
                //System.out.println("if You DUMB");
            }
           
        
       switch(option)
       {
           case 1: System.out.println(2+2);
           
           
           case 2: System.out.println(2-2);
           break;
           
           default: System.out.println("You DUMB wich");
       }
   }
}
