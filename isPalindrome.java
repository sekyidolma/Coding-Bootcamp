//Problem 10
package BasicProblem;
public class isPalindrome {
	public boolean isPalindrome(int[] nums) {
		if(nums==null || nums.length<2)
			return true;
		
		for(int i =0; i <nums.length; i++) {
			if(nums[i]  != nums[nums.length-1]) {
				return false;
			}
		}
		return true;
	}

}
/**
 * Time Complexity: 0(n)
 * Space Complexity: 0(1)
 */