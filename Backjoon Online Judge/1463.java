/* Dynamic Programming Practice */
import java.util.*;
public class 일로만들기_1463 {
	public static int choose(int N,int a,int b,int c) {
		ArrayList<Integer> list = new ArrayList<>();
		if(a<=N)
			list.add(a);
		if(b<=N)
			list.add(b);
		if(c<=N)
			list.add(c);
		Collections.sort(list);
		return list.get(list.size()-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		sc.close();
		int[] dp = new int[1000001];
		
		for(int i=2;i<=N;i++) {
			dp[i]=dp[i-1]+1;
			if(i%2==0)
				dp[i]=Math.min(dp[i/2]+1,dp[i]);
			if(i%3==0)
				dp[i]=Math.min(dp[i/3]+1,dp[i]);
		}
		
		System.out.println(dp[N]);
	}

}
