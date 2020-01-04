//Problem 4
package BasicProblem;

public class sumOfArray {
public int sumOfArray(int[] nums) {
	if(nums==null || nums.length==0)
		return 0;
	int sum = 0;
	for(int i =0; i <nums.length; i++) {
		sum+= nums[i];
	}
	return sum;
  }
}
/**
 * Time Complexity: 0(n)
 * Space Complexity: 0(1)
 */
