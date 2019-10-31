package 최적화to결정문제;
import java.util.Scanner;
public class 숫자카드_10815 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] card = new int[20000001];
		for(int i=0;i<N;i++) {
			int index=sc.nextInt();
			card[index+10000000]=1;
		}
		int M = sc.nextInt();
		for(int i=0;i<M;i++) {
			int index=sc.nextInt();
			if(card[index+10000000]==1)
				System.out.print(1+" ");
			else
				System.out.print(0+" ");
		}
		sc.close();
	}

}
