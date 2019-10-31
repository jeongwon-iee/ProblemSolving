/* Dynamic Programming Practice */
import java.util.Scanner;
import java.util.Arrays;

public class 랜선자르기_1654 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt(); //already have
		int N = sc.nextInt(); //need
		
		int[] stk = new int[K];
		for(int i=0;i<K;i++) {
			stk[i]=sc.nextInt();
		}
		Arrays.sort(stk);
		int max = stk[K-1];
		int min = 1;
		int mid = 0;
		int cnt=0;
		while(min<=max) {
			cnt=0;
			mid=(max+min)/2;
			for(int i=0;i<K;i++) {
				cnt+=stk[i]/mid;
			}
			if(cnt==N) {
				System.out.println(mid);
				break;
			}
			else if(cnt<N) { 
				max=mid-1;
				
			}
			else { //길이 늘이기
				min=mid+1;
				
			}
		}
		sc.close();
	}

}
