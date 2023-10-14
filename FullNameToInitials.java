import java.util.Scanner;

/* 
 * Write a program that takes a full name string, converts it to initials and prints 
 * For example, if the full name is "John Jacob Schmidt" then the program outputs:
 * John Jacob Schmidt: J.J.S.
 */


public class FullNameToInitials
{
	public static void main (String[] args)
	{
		 String fullNames[] = {"Timothy John McInerney","Rick Valenzano","Inigo Montoya","Gaga","Doja Cat", "Lil Nas X"};
		 
		 for (String x:fullNames){
			 System.out.println(x+": " + initials(x));
		 }
		 
		 
		 
		 
		 //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
		 System.out.println("Expected:\nTimothy John McInerney: T.J.M.\n"
		 		+ "Rick Valenzano: R.V.\n"
		 		+ "Inigo Montoya: I.M.\n"
		 		+ "Gaga: G.\n"
		 		+ "Doja Cat: D.C.\n"
		 		+ "Lil Nas X: L.N.X.");
	}
	
	
	// Takes a full name string as input, extracts and returns the initials 
	// Each initial should be followed by a "."
	static String initials(String fullName)
	{
		//-----------Start below here. To do: approximate lines of code = 6
		String initals="";
		for (int i=0; i<fullName.length();i++){
			if(i==0){
				initals+=fullName.charAt(i);
				initals+=".";
			}
			if(fullName.charAt(i)==' '){
				initals+=fullName.charAt(i+1);
				initals+=".";
			}
		}
		return initals;


		
		
		
		
		
		
		
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	}
}
