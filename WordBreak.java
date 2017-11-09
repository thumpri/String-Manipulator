package level1;
import java.util.HashSet;

public class WordBreak {

   public String s = "icareforyou";


	public int findUsingDP(String s, HashSet<String> dict,
			HashSet<String> memory, String answer) 
	{
		if (s.length() == 0) {
			//System.out.println(answer);
			return 1;
		} else if (memory.contains(s)) {
			return 0;
		} else {

			int index = 0;
			String word = "";
			while (index < s.length()) {
				word += s.charAt(index);// add one char at a time
				// check if word already being solved
				if (dict.contains(word)) {
					if (findUsingDP(s.substring(index + 1), dict, memory,
							answer + word + " ")==1) {
						return 1;
					} else {
						//System.out.println("backtrack");
						index++;
					}
				} 
				else {					
					index++;
				}
			}
			
			memory.add(s);// memoization for future;
			//System.out.println("Memory = "+memory);
			return 0;
		}
	}

	
	
		
		
		// create another HashSet so store the sub problems result
		
	

}

