//Problem 11
package BasicProblem;

public class isSameArrays {
	public boolean isSameArrays(int[] arr1, int[] arr2) {
		if(arr1==null &&arr2==null)
			return true;
		if(arr1==null|| arr2==null||arr1.length !=arr2.length)
			return false;
			
		for(int i =0; i< arr1.length; i++) {
			if(arr1[i]!=arr2[i])
				return false;
		}
	
	return true;
}
}
/**
 * Time Complexity: 0(n)
 * Space Complexity: 0(1)
 */