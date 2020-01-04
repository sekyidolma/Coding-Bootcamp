//Problem 5
package BasicProblem;

public class countTarget {
public int countTarget(int[] nums, int Target){
	if(nums==null || nums.length==0)
		return 0;
	int count=0;
	for (int i =0; i < nums.length; i++){
		if(nums[i] == Target)
			count++;
	}
	return count;
  }
}
/**
 * Time Complexity: 0(n)
 * Space Complexity: 0(1)
 */

