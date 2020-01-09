//Problem 16
//return the two largest numbers in the array

package BasicProblem;
public class twoLargest {
	public int[] twoLargest(int[] nums) {
		if(nums==null|| nums.length<2) 
			return nums;
		
		int largest=nums[0]>nums[1]?nums[0]:nums[1];
		int secondLargest=nums[0]<nums[1]?nums[0]:nums[1];
		for(int i =0; i<nums.length; i++) {
			if(nums[i]>largest) {
				secondLargest=largest;
				largest=nums[i];
			}
			else if(nums[i]>secondLargest) 
				secondLargest=nums[i];
		}
	
	int out[] = new int[2];
		out[0]=largest;
		out[1]=secondLargest;
	
	return out;
	}
}
