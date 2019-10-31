/* Dynamic Programming Practice */
import java.util.Scanner;
import java.util.Arrays;
public class 포도주시식_2156 {
	
	public static int Max(int a, int b, int c) {
		int[] A = new int[3];
		A[0]=a; A[1]=b; A[2]=c;
		Arrays.sort(A);
		return A[2];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] wine = new int[n];
		for(int i=0;i<wine.length;i++) {
			wine[i]=sc.nextInt();
		}
		sc.close();
		int[] dp = new int[n];
		dp[0]=wine[0];
		if(n>1) dp[1]=wine[0]+wine[1];
		for(int i=2;i<n;i++) {
			if(i==2)
				dp[i]=Max(dp[i-1],dp[i-2]+wine[i],wine[i-1]+wine[i]);
			else
				dp[i]=Max(dp[i-1],dp[i-2]+wine[i],dp[i-3]+wine[i-1]+wine[i]);
		}
		System.out.println(dp[n-1]);
	}

}
