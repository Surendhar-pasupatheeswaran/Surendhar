package array;
import java.util.*;


public class WordBreak
{

	private static Set<String> dictionary = new HashSet<>();
	
	public static void main(String []args)
	{
		String temp_dictionary[] = {"mobile","samsung","sam","sung",
							"man","mango","icecream","and",
							"go","i","like","ice","cream"};
		for (String temp :temp_dictionary)
		{
			dictionary.add(temp);
		}
		wordBreak("ilikesamsung");
		 	
		
		
	}
	
	public static boolean wordBreak(String word)
	{
		int size = word.length();
		if (size == 0)
	    return true;
		for (int i = 1; i <= size; i++)
		{
		
			if (dictionary.contains(word.substring(0,i)) &&
					wordBreak(word.substring(i,size)))
			
				System.out.print(word.substring(i)+" "+word.substring(i,size));
		}
		return false;
		
	}
}

