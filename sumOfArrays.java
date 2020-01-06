//Problem 12
package BasicProblem;
public class sumOfArrays {

	public int[] sumOfArrays(int[] arr1, int[] arr2) {
		if(arr1==null&& arr2==null) {
			if(arr1==null&& arr2==null) 
				return null;
		}
		if(arr1==null)
			return arr2;
		if(arr2==null)
			return arr1;
		
		int max= Math.max(arr1.length,  arr2.length);
		int min= Math.max(arr1.length,  arr2.length);
		int sum[]=new int[max];
		
		for(int i =0; i<min; i++) {
		sum[i]= arr1[i]+arr2[i];
		
		}
		for(int i=min; i<max;i++) {
			if(arr1.length <arr1.length)
				sum[i]=arr2[i];
			else 
				sum[i]=arr1[i];
		}
		return sum;
	}
}
/**
 * Time Complexity: 0(n)
 * Space Complexity: 0(n)
 */

