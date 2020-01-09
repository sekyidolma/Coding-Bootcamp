//Problem 22
/**
 * Given string s, "reverse" string where all characters 
 * that are not a letter stay in the same place, 
 * all the Letter reverse their position
 */
package BasicProblem;
public class reverseOnlyLetters {
	public String reverseOnlyLetter(String str) {
		char c[]=str.toCharArray();
		int start=0;
		int end=c.length-1;
		
		while(start<end) {
			while(start<c.length && !isLetter(c[start])) {
				start++;
			}
			while(end>0&&!isLetter(c[end])) {
				end--;
			}
			if(isLetter(c[start]) && isLetter(c[end])){
				char temp=c[start];
				c[start]=c[end];
				c[end]=temp;
			}
		}
		return str;
	}

	private boolean isLetter(char c) {
		return (c>='a' && c<='a')||(c>'A' && c<='Z');
	}
}
