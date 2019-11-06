package br.com.projuris;

public class MyFindChar implements FindCharachter {

	@Override
	public char findChar(String word) {
		char c;
		for(int i = 0; i < word.length();i++)
		{
			c = word.charAt(i);
			boolean test = true;
			for(int j = 0; j < word.length();j++)
			{
				if ( (c==word.charAt(j)) && (i!=j) ) {			       
					test = false;
				} 					
			}
			
			if (test == true) {
				return c;
			}
			
		}
		return ' ';	
	}

}
