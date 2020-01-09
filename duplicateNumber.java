//Problem 15
package BasicProblem;

public class duplicateNumber {
public int duplicateNumber(int[] nums) {
	int sum=0;
	for(int i =0; i <nums.length;i++) {
		sum+=nums[i];
	}
	int n =nums.length;
	return sum - ((n-1)*n)/2;
}
}
