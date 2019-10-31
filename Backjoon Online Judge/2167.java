/* Dynamic Programming Practice */
import java.util.Scanner;

public class 이차원배열의합_2167 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] p =new int[N+1][M+1];
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=M;j++) {
				p[i][j]=sc.nextInt();
			}
		}
			
		int k =sc.nextInt();
		for(int index=0;index<k;index++) {
			int i=sc.nextInt();
			int j=sc.nextInt();
			int x=sc.nextInt();
			int y=sc.nextInt();
			int sum=0;
			for(int a=i;a<=x;a++) {
				for(int b=j;b<=y;b++) {
					sum+=p[a][b];
				}
			}
			System.out.println(sum);
			}
		sc.close();
	}

}
