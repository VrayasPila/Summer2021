package Day9_ClassesOOPs;

/**
 * @author ranais
 * 
 * This class defines a student. You have access to his name, SID, classes
 */
public class Student
{
   private int studID; //HAS NO VALUE void
   private String fName;
   private String lName;
   private int gradeMath;
   private int gradeScience;
   private int gradeEnglish;
   
   public Student( int studIDnum, String first, String last, int math, int sci, int eng )
   {
      studID = studIDnum;
      fName = first;
      lName = last;
      gradeMath = math;
      gradeScience = sci;
      gradeEnglish = eng;
    }
   
   // getters and setters
   public int getStudID()
   {
       return studID;
   }
   
   public String getStudLastName()
   {
       return lName;
   }
}
