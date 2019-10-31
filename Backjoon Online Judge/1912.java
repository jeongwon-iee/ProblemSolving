import java.util.*;
/* testcase
 * 5
 * 8 -3 1 -2 7
 */
public class ¿¬¼ÓÇÕ_1912 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] arr = new int[n];
		ArrayList<Integer> sum = new ArrayList<>();
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		/* like sliding window */
		for(int i=0;i<n;i++) { 
			int oldSum=0;
			int newSum=0;
			for(int j=i;j<n;j++) { 
				newSum+=arr[j]; 
				if(oldSum>newSum) { 
					if(j==i) oldSum=newSum;
					sum.add(oldSum);
				}
				oldSum=newSum;
			}
			sum.add(oldSum);
		}
		Collections.sort(sum);
		System.out.println(sum.get(sum.size()-1));
		sc.close();
		}
	}
