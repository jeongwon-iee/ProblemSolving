package PracticeRound;
import java.util.Scanner;

public class Mural {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		for(int testcase=1;testcase<=T;testcase++) {
			int N=sc.nextInt();
			String wall=sc.next(); 
			int[] walls = new int[N+1];
			for(int i=1;i<=wall.length();i++) 
				walls[i]=walls[i-1]+wall.charAt(i-1)-'0';

			int k=(N+1)/2;
			int max=-1;
			for(int i=k;i<=N;i++) {
				int tmp=walls[i]-walls[i-k];
				max= max<tmp? tmp: max;
			}
			System.out.println("Case #"+testcase+": "+max);
		}
		sc.close();
	}
}
