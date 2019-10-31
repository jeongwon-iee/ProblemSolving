package 조합탐색;
import java.util.*;

public class 그룹단어체커_1316 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count=0;
		boolean flag=false;
		for(int i=0;i<N;i++) {
			int[] word = new int[123];
			boolean[] been = new boolean[123];
			String str=sc.next();
			for(int j=0;j<str.length();j++) {
				if((word[str.charAt(j)-'0']==0&&!been[str.charAt(j)-'0'])||been[str.charAt(j)-'0'])
				{
					word[str.charAt(j)-'0']++;
					been[str.charAt(j)-'0']=true;
					flag=true;
					if(j<str.length()-1) {
						if(str.charAt(j)!=str.charAt(j+1)) //그 다음꺼랑 다르면 바꿔놓기
						{
						been[str.charAt(j)-'0']=false;
						}
					}	
					continue;
				}
				else {
					flag=false;
					break;
				}
			}
			if(flag) count++;
			else continue;
		}
		sc.close();
		System.out.println(count);
		// TODO Auto-generated method stub

	}

}
