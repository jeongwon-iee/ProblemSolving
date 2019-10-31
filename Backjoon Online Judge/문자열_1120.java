import java.util.*;

public class ¹®ÀÚ¿­_1120 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		int lenA = A.length();
		int lenB = B.length();
		ArrayList<Integer> dif=new ArrayList<>();
		int difference=0;
		for(int j=0;j<=lenB-lenA;j++) { //moving A on B
			int index=j;
			difference=0;
			for(int i=0;i<lenA;i++) { //comparing A and B
				if(A.charAt(i)!=B.charAt(index))
					difference++;
				index++;
			}
			dif.add(difference);
		}
		Collections.sort(dif);
		System.out.println(dif.get(0));
		sc.close();
	}

}
