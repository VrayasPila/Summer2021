package Challenges.Challenge4_Arrays;
import java.util.Scanner; 

/**
 * Write a description of class C4_Vrayas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class C4_Vrayas
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int UGM1 = sc.nextInt();
        System.out.println("Choose a number between 0-100");
        int UGE1 = sc.nextInt();
        System.out.println("Choose a number between 0-100");
        int UGS1 = sc.nextInt();
        System.out.println("Choose a number between 0-100");
        int UGe01 = sc.nextInt();
        System.out.println("Choose a number between 0-100");
        int UGe11 = sc.nextInt();
        System.out.println("Choose a number between 0-100");
        
        int UGM2 = sc.nextInt();
        System.out.println("Choose a number between 0-100");
        int UGE2 = sc.nextInt();
        System.out.println("Choose a number between 0-100");
        int UGS2 = sc.nextInt();
        System.out.println("Choose a number between 0-100");
        int UGe02 = sc.nextInt();
        System.out.println("Choose a number between 0-100");
        int UGe12 = sc.nextInt();
        System.out.println("Choose a number between 0-100");
        
       
        int URes1 = (UGM1 + UGE1 + UGS1 + UGe01 + UGe11)/5;
        int URes2 = (UGM2 + UGE1 + UGS1 + UGe02 + UGe12)/5;
        int PRes1 = 89;
        int Pres2 = 76;
        
        int EngSup = (UGE1 + UGE1 + 81 + 58);
        int MatSup = (UGM1 + UGM2 + 97 + 76);
        int SciSup = (UGS1 + UGS2 + 75 + 98);
        int Elc1Sup = (UGe01 + UGe02 + 42 + 87);
        int Elc2Sup = (UGe11 + UGe12 + 69 + 66);
        
        int SupSco = ((EngSup * EngSup) + (2*SupSE1) + (SupSE2/2) + ((EngSup + MatSup + SciSup + Elc1Sup + Elc2Sup)*0.5));

        if( SciSup < EngSup)
        {
           int SupSE1 = EngSup;
        }
        else
        {
           int SupSE1 = SciSup;
        }
        
        if( SciSup < EngSup)
        {
           int SupSE2 = SciSup;
        }
        else
        {
           int SupSE2 = EngSup;
        }
    }
}

