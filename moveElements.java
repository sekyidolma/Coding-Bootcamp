//Problem 13
package BasicProblem;
public class moveElements {
	public int[] moveElements(int[] nums) {
		if(nums==null ||nums.length<2)
			return nums;
		int index=0;
		int out[]=new int[nums.length];
		for(int i=0; i<nums.length; i++) {
			if(nums[i]%2==1) {
				out[index]=nums[i];
				index++;
			}
		}
		for(int i =0; i <nums.length; i++) {
			if(nums[i]%2==0)
				out[index++]=nums[i];
			
		}
		return out;
	}
}
/**
 * Time Complexity: 0(n)
 * Space Complexity :0(n)
 */
