package sortnsearch;

public class anagram {
	
	public static void main(String[] args) {
		
		String[] word = {"iceman","inema"};
		anagram obj = new anagram();
		obj.anagram(word);
	}
	
	public boolean anagram(String[] word) {
		
		String word1 = word[0];
		String word2 = word[1];
		String anagram ="";
			for(int j=0;j<word1.length();j++) {
				for(int k=0;k<word2.length();k++) {
					if(word1.charAt(j)==word2.charAt(k))
					{
						anagram = anagram+word1.charAt(j);
					}
				}
			}
			System.out.println(anagram);
		
	
 return true;
	}
}
