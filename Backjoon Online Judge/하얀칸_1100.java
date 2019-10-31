package Á¶ÇÕÅ½»ö;
import java.util.Scanner;
public class ÇÏ¾áÄ­_1100 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] chess = new char[8][8];
		int count=0;

		for(int i=0;i<chess.length;i++) {
			String str = sc.next();
			for(int j=0;j<chess[i].length;j++) {
				chess[i][j] = str.charAt(j);
				if(chess[i][j]=='F') { 
					if((i%2==0&&j%2==0)||(i%2==1&&j%2==1)) //all even numbers or odd numbers
						count++; 
				}
			}
		}
		System.out.println(count);
		sc.close();
	}

}
