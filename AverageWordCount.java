import java.util.Scanner;
/*
 * Write a program to find the average number of words in an array of sentence strings
 */
public class AverageWordCount
{
   public static void main (String[] args)
   {
      // array of sentences
      String sentences[] = {"Yeah, I'm gonna take my horse", "To the old town road", "I'm gonna ride til I can't no more",
                            "I'm gonna take my horse to the old town road", "I'm gonna ride til I can't no more"};
      int totalWords = 0;
      double averageWords = 0.0;
		 
      for (int i = 0; i < sentences.length; i++)
      {
         totalWords +=  wordCount(sentences[i]);
      }
      //-----------Start below here. To do: approximate lines of code = 2
      
      averageWords=(double)totalWords/sentences.length;
   
      
      
      //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
      System.out.println("Average number of words per sentence: " + averageWords);
      System.out.println("Expected:\nAverage number of words per sentence: 7.4");
   }
	
   // Calculate the number of words in the input String sentence. Return the number of words.
   static int wordCount(String sentence)
   {
      //-----------Start below here. To do: approximate lines of code = 7
      String []split=sentence.split(" ");
      int count=0;
      Scanner in= new Scanner(sentence);
      while (in.hasNext()){
         if (!"".equals(in.next())){
            count+=1;
         }
      }
      return count;
   
      
      
      
      
      
      
      
      
      
      
      //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
   }
}
