package 신입선발;
import java.util.*;

public class X보다작은수_10871 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int X=sc.nextInt();
		
		for(int i=0;i<N;i++) {
			int num=sc.nextInt();
			if(num<X) System.out.print(num+" ");
		}
		System.out.println();
		sc.close();
	}

}
