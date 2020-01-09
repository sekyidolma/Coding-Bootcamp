//Problem 17
/**
 * return the indices of the two numbers such 
 * that they add up to specific target
 */

package BasicProblem;
public class twoSum {
	public int[] twoSum(int[]nums, int target) {
		if(nums==null)
			return nums;
		
		int x=0;
		int y=0;
		for(int i =0; i < nums.length; i++) {
			for(int j=0; j< nums.length; j++) {
				if(nums[i]+nums[j]==target)
					x=i;
					y=j;
			}
		}
		int out[]= new int[2];
		out[0]=x;
		out[1]=y;
	
	return out;
	
}
}