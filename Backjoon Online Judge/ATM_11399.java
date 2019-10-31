package 신입선발;
import java.util.*;

public class ATM_11399 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();
		int[] P = new int[N];
		
		for(int i=0;i<N;i++) {
			P[i]=sc.nextInt();
		}
		Arrays.sort(P);
		
		int total_time=P[0];
		
		for(int i=0;i<N;i++) {
			P[i+1]+=P[i];
			total_time+=P[i+1];
		}
		
		System.out.println(total_time);
		sc.close();
	}

}
