package ����ȭto��������;
import java.util.Scanner;
import java.util.Arrays;

public class ���˹���_3020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int H = sc.nextInt();
		
		int[][] cave = new int[H][N];
		for(int i=0;i<N;i++) {
			int b = sc.nextInt();
			if(i%2==1) {//Ȧ������ ��� ����������
				for(int j=H-1;j>H-b-1;j--) {
					cave[j][i]=1;
				}
			}
			else {//¦������ ��� �ؿ�������
				for(int j=0;j<b;j++) {
					cave[j][i]=1;
				}
			}
		}

		int[] num = new int[H];
		for(int i=0;i<H;i++) {
			for(int j=0;j<N;j++) {
				if(cave[i][j]==1)
					num[H-i-1]++;
			}
		}
		Arrays.sort(num);
		int cnt=1;
		
		for(int i=1;i<H;i++) {
			if(num[i]==num[0])
				{cnt++;}
			else
				break;
		}
		System.out.println(num[0]+" "+cnt);
	
		// TODO Auto-generated method stub
		sc.close();
	}

}
