/* Dynamic Programming Practice */
import java.util.Scanner;

public class 파도반수열_9461 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		long[] arr = new long [1011];
		arr[1]=1;
		arr[2]=1;
		arr[3]=1;
		arr[4]=2;
		arr[5]=2;
		for(int testcase=0;testcase<T;testcase++) {
			int N = sc.nextInt();
			for(int i=6;i<=N;i++) {
				arr[i]=arr[i-5]+arr[i-1];
			}
			System.out.println(arr[N]);
		}
		sc.close();
	}

}
