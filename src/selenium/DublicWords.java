package selenium;

import java.util.HashMap;
import java.util.Set;

public class DublicWords {

	public static void main(String[] args) {
	
		
		String s ="Today is my interview and my interview today went well today";
		
		String[] words = s.split(" ");
		
		for(String g: words)
		{
			System.out.println(g);
		}
		
		System.out.println("=============================");
		
		HashMap<String, Integer> wordCount = new HashMap<>();
		
		for(String word:words)
		{
			if(wordCount.containsKey(word.toUpperCase())) {
				
				wordCount.put(word.toUpperCase(), wordCount.get(word.toUpperCase())+1);
				
			}
			else
			{
			 wordCount.put(word.toUpperCase(), 1);
			}
			
		}
		
		Set<String> wordString = wordCount.keySet();
		
		for(String st: wordString)
		{
			if(wordCount.get(st.toUpperCase())>1)
			{
				System.out.println(st.toUpperCase()+" "+wordCount.get(st));
			}
		}
		
		

	}

}
