package 최적화to결정문제;
import java.util.Scanner;

public class 달팽이는올라가고싶다_2869 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long A = sc.nextInt();
		long B = sc.nextInt();
		long V = sc.nextInt();
		
		long length = V-A;
		long days;
		if (length%(A-B)==0) 
			days=length/(A-B)+1;
		else 
			days=length/(A-B)+2;
		
		System.out.println(days);
		sc.close();
		// TODO Auto-generated method stub

	}
 
}
