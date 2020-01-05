//Problem 7
package BasicProblem;

public class maxNumber {
	public int maxNumber(int[] nums) {
	if(nums ==null || nums.length ==0)
		return Integer.MIN_VALUE;
	
		int max=nums[0];
	for(int i =0; i <nums.length; i++) {
		if(nums[i]>max) {
			max=nums[i];
		}
	}
	return max;	
	}
}
/**
 * Time Complexity: 0(n)
 * Space Complexity: 0(1)
 */
