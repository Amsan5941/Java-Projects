/*
 *  This program adds up all the integer numbers stored in an array and calculates the average.
 *  The average is printed.
 *  For example, if the numbers are 1, 3, 5 then the average is (1+3+5)/3 = 4.5 
 *  Difficulty: Easy
 */
public class ArrayAverage
{
   public static void main(String[] args)
   {
      int[] data = {2, 34, 57, 31, 5, 79, 88, 62, 98, 53, 42};
      
      //-----------Start below here. To do: approximate lines of code = 4
      double sum=0;
      for (int i=0;i<data.length;i++){
         sum+=data[i];
      }
      double average=sum/data.length;
      
      //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
      System.out.printf("Average = %.2f\n", average) ;
      System.out.println("EXPECTED:") ;
      System.out.println("Average = 50.09") ;
   }
}
