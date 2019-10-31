/* Dynamic Programming Practice */
import java.util.Scanner;
import java.util.Arrays;
public class Á¤¼ö»ï°¢Çü_1932 {
	public static int Max(int a, int b) {
	return (a>b)? a:b;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] p = new int[n][];
		for(int i=0;i<p.length;i++) {
			p[i]=new int[i+1];
		}
		for(int i=0;i<p.length;i++) {
			for(int j=0;j<p[i].length;j++) {
				p[i][j]=sc.nextInt();
			}
		}
		sc.close();
		int[][] dp = p;
		for(int i=1;i<dp.length;i++) {
			for(int j=0;j<dp[i].length;j++) {
				if(j==0)
					dp[i][j]+=dp[i-1][j];
				else if(j==dp[i].length-1)
					dp[i][j]+=dp[i-1][dp[i-1].length-1];
				else
					dp[i][j]+=Max(dp[i-1][j-1],dp[i-1][j]);
			}
		}
		Arrays.sort(dp[n-1]);
		System.out.println(dp[n-1][n-1]);
	}

}
