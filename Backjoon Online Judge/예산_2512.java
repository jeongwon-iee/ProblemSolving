package 최적화to결정문제;
import java.util.*;
public class 예산_2512 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt(); 
			
			int want[] = new int[N];
			int tot=0; //budjet needed
			int subtot=0;
			
			for(int i=0;i<want.length;i++) {
				want[i]=sc.nextInt();
				tot+=want[i];
			}
			subtot=tot;
			int M = sc.nextInt(); //total budjet
			int max=M/N; //upper limit
			Arrays.sort(want); 
			while(true) {
				if(tot<=M) {
					System.out.println(want[N-1]);
					break;
				}
				else if(subtot<=M) {
					System.out.println(max);
					break;
				}
				else {
					max=M/N;
					for(int i=0;i<want.length;i++) {
						if(want[i]<=max&&want[i]!=0) {
							M-=want[i];
							want[i]=0;
							N--;							
						}
						else
							subtot+=want[i];
					}
					continue;
				}	
			}
			sc.close();
	}

}
