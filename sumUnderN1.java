package BasicProblem;

public class sumUnderN1 {
	public int sumUnderN(int n) {
		int sum=0;
		for (int i = 0; i <n; i++)	
		sum+= i;
      return sum;
	}
}
//public class sumUnderN1 {
//return (n*(n+1)/2);