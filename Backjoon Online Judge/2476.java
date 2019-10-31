import java.util.*;

public class 주사위게임_2476 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();
		int[] num = new int[3];
		int[] price = new int[N];
		for(int i=0;i<N;i++) {
			num[0]=sc.nextInt();
			num[1]=sc.nextInt();
			num[2]=sc.nextInt();
			if(num[0]==num[1]) {
				if(num[0]==num[2]) price[i]=10000+num[0]*1000; //3 same eyes on dice
				else price[i]=1000+num[0]*100; //2 same eyes on dice
			}
			else if(num[1]==num[2]) price[i]=1000+num[1]*100; //2 same eyes on dice
			else if(num[0]==num[2]) price[i]=1000+num[0]*100; //2 same eyes on dice
			else {
				Arrays.sort(num);
				price[i]=num[2]*100;
			}
		}
		Arrays.sort(price);
		System.out.println(price[N-1]);
		sc.close();
	}

}
