package sortnsearch;

public class duplicate {
	
	public static void main(String[] args) {
		duplicate dup = new duplicate();
		char result[];
		result = dup.hasDuplicateChars("anaconda");
		if(result.length>0) {
		System.out.println("Result for anaconda is true. Repeated chars are");
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		}
		else System.out.println("Result for anaconda is false");
		result = dup.hasDuplicateChars("great");
		if(result.length>0) {
			System.out.println("Result for great is true. Repeated chars are");
			for(int i=0;i<result.length;i++) {
				System.out.println(result[i]);
			}
			}
		else System.out.println("Result for great is false");
	}
	
	public char[] hasDuplicateChars(String s) {
	   char result[]= new char[s.length()];
		 for(int i=0;i<=s.length()-1;i++) {
			 for(int j=i+1;j<=s.length()-1;j++) {
			 if(s.charAt(i)==s.charAt(j)) {
				 result[i] = s.charAt(i);
				 break;
			 }
		 }
		 }
		return result;
	}

}
