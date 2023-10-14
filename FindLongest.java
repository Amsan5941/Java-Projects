import java.util.List;
import java.util.ArrayList;

/*
 * 
 *  This program loops through an array list of strings and finds the longest string
 */
public class FindLongest
{
	/*
	 * Given the array list of strings, return the longest string
	 */
	public static String findLongest(ArrayList<String> list)
	{
		//-----------Start below here. To do: approximate lines of code = 8
		String longest="";
		for(int i=0; i<list.size();i++){
			if(list.get(i).length()>longest.length()){
				longest=list.get(i);
			}

		}
		return longest;
	
		
		
		
		
		
		
		
		
		
		
		
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	}

	public static void main(String[] args)
	{
		ArrayList<String> elems = new ArrayList<String>();
		String[] words = {"singapore", "cattle", "metropolitan", "turnstile", "city", "deviation"};
		for (int i = 0; i < words.length; i ++)
		{
			elems.add(words[i]);
		}
		System.out.println(findLongest(elems));
		System.out.println("Expected:\nmetropolitan");
		elems.clear();
		System.out.println(findLongest(elems));
		System.out.println("Expected:\n");
	}
}
