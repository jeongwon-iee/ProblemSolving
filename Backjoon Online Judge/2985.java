package ����Ž��;
import java.util.Scanner;
public class ����_2985 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		if(A==B&&B==C)
			System.out.println(A+"="+B+"="+C);
		else if(A+B==C){
			System.out.println(A+"+"+B+"="+C);
		}
		else if(A-B==C){
			System.out.println(A+"-"+B+"="+C);
		}
		else if(A*B==C){
			System.out.println(A+"*"+B+"="+C);
		}
		else if(A/B==C){
			System.out.println(A+"/"+B+"="+C);
		}
		else if(A==B+C){
			System.out.println(A+"="+B+"+"+C);
		}
		else if(A==B-C){
			System.out.println(A+"="+B+"-"+C);
		}
		else if(A==B*C){
			System.out.println(A+"="+B+"*"+C);
		}
		else if(A==B/C){
			System.out.println(A+"="+B+"/"+C);
		}

		sc.close();
	}

}
