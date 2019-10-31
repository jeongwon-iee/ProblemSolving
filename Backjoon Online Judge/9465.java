/* Dynamic Programming Practice */
import java.util.Scanner;

public class ½ºÆ¼Ä¿_9465 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int testcase=0;testcase<T;testcase++) {
			int n =sc.nextInt();
			int[][] arr = new int[2][n+1];
			for(int i=0;i<2;i++) {
				for(int j=1;j<=n;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			int[][] dp = new int[2][n+1];
			dp[0][1] = arr[0][1];
			dp[1][1] = arr[1][1];
			for(int j=2;j<n+1;j++) {
				dp[0][j]=Math.max(dp[1][j-2]+arr[0][j],dp[1][j-1]+arr[0][j]);
				dp[1][j]=Math.max(dp[0][j-2]+arr[1][j],dp[0][j-1]+arr[1][j]);
			}
			System.out.println(Math.max(dp[0][n], dp[1][n]));
		}
		sc.close();

	}

}
