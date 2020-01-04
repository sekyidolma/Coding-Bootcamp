//Problem 2
package BasicProblem;

public class sumBetweenNandM {
	public int sumBetweenNandM(int a, int b) {
		return (b*(b-1)/2)-(a*(a-1))+a;	
		
	}
}

/*Alternative way:
	return (b*(b-1)/2+(a*(a-1)/2);
 */

/**
 * Time Complexity: 0(1)
 * Space Complexity: 0(1)
 */
