import java.util.Scanner;
/*
 * This program contains a static method to find the number
 * of target strings occur in a given input string. It returns this number.
 * Difficulty: Easy
 */
public class GradesStats
{
	public static void main (String[] args)
	{
		 String courseGrades = "B- C+ A+ A B B+ F D+ C- A- B A+";
		 
		 System.out.println("Number of A+ grades is " + countGrades(courseGrades, "A+"));
		 System.out.println("Expected:\nNumber of A+ grades is 2");
		 
		 int numAGrades = 0;
		 //-----------Start below here. To do: approximate lines of code = 1
		 // Use the countGrades() method and compute the total number of A grades where an A grade is one of A- A A+
		 // store the number of A grades in the variable numAGrades
		 numAGrades=countGrades(courseGrades,"A+ A A-");

		 
		 
		 //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
		 System.out.println("Number of A- A A+ grades is " + numAGrades);
		 System.out.println("Expected:\nNumber of A- A A+ grades is 4");
	}
	
	static int countGrades(String grades, String targetGrade)
	{
		//-----------Start below here. To do: approximate lines of code = 8
		int count=0;
		String[] g=grades.split(" ");
		for(int i=0;i<g.length;i++){
			String[] target= targetGrade.split(" ");
			for(int j=0;j<target.length;j++){
				if(g[i].equals(target[j])){
					count++;
				}

			}

		}
		return count;


		
		
		
		
		
		
		
		
		
		
		
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	}
	
	
}