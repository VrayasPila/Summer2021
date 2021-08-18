package Challenges.Challenge4_Arrays;
import java.util.Scanner;

/**
 * You are the teacher in a class of 4 students. Each student has 5 classes Math, Science, English and 2 electives in a day and he gets a grade for all of them.
 * Your task is to automate the task of calculating the average grade for all the students and their rank. You know the grades for 2 students and you 
 * ask the user for input on the other two students. Then calculate their super score which is 
 *             English^2 + 2*(The greater betweeen Science and English) + SquareRoot of the minimum, between Science and English + 0.5(sum of electives)
 *             
 *             Rules:
 *                  1. Use sensible names
 *                  2. Use arrays, Scanner, Math class methods
 *                  3. Leave atleast 3 comments.
 */                  
public class C4_Vrayas
{
    //UGM: User Grade Math (The number is for the number of student)
    int gradeMathStud1;
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



