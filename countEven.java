//Problem 6
package BasicProblem;

public class countEven {
	public int countEven(int[] nums) {
		if(nums==null || nums.length==0) {
			return 0;
		}
		int count=0;
		for(int i =0; i <nums.length; i++) {
			if(nums[i] %2==0) {
				count++;
			}
		}
		return count;
	}
}
