package PracticeRound;
import java.util.Scanner;
public class NumberGuessing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		
		for(int testcase=1;testcase<=T;testcase++) {
			int A=sc.nextInt(); //A 초과
			int B=sc.nextInt(); //B 이하
			int N=sc.nextInt(); //N번의 시도
			int low=A+1;
			int high=B;
			int mid;
			for(int tries=1;tries<=N;tries++) {
				String result;
				/* guess by binary search */
				mid=(low+high)/2;
				System.out.println(mid);
				result=sc.next();
				if(result.equals("CORRECT")) break;
				else if(result.equals("TOO_SMALL")) low=mid+1;
				else if(result.equals("TOO_BIG")) high=mid-1;
				if(tries==N) return;
			}
		}
		sc.close();
	}
}
