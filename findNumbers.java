//Problem 19
/**
 * return how many of them contains even number of digits
 */
package BasicProblem;
public class findNumbers {
	public int findNumbers(int[] nums) {
		int even_counter=0;
		for(int i=0; i<nums.length; i++) {
			int count=0;
			if(nums[i] !=0) {
				nums[i]/=10;
				count++;
			}
			if(count%2==0)
				even_counter++;
		}
		return even_counter;
	}
}
