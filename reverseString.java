//Problem 21
/**
 * write a function to reverse a string. 
 * The input is given as a array of characters char[], str
 */
		
package BasicProblem;
public class reverseString {
	public char[] reverseString(char[] str) {
		
		for(int i=0; i<str.length; i++) {
			
			//swap
			char temp=str[i];
			str[i]=str[str.length-1-i];
			str[str.length-1-i]=temp;
		}
		return str;
	}
}
