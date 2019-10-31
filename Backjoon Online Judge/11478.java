package Default;
import java.util.*;

public class 서로다른문자열의개수_11478 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> subset = new HashMap<>();
		
		String S = sc.next();
		sc.close();
		
		/* length of substring k: 1~length */
		for(int k=1;k<=S.length();k++) {
			for(int i=0;i<S.length();i++) {
				if((i+k)>S.length()) break;
					subset.put(S.substring(i,i+k),1);
			}
		}
		/* Redundancy not considered -> count the number of keys */
		System.out.println(subset.size());
	}

}
