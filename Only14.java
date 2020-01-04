//Problem 3
package BasicProblem;

public class Only14 {
public boolean only14(int[] nums) {
	//base case
	if(nums==null|| nums.length==0)
		return true;
	for (int i =0; i <nums.length;i++) {
		if(nums[i]!=1 || nums[i]!=4)
			return false;
		}
	return true;	
	}
}
/**
 * Time Complexity: 0(n)
 * Space Complexity :0(1)
 */
