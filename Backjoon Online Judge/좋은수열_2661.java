import java.util.*;

public class 좋은수열_2661 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		String sOld="1";
		String sNew="1";
		if(N==1) System.out.println(sNew);
		else {
			while(sNew.length()<N) {
				for(int i=1;i<=3;i++) {
					System.out.println(i+" A" +sNew);
					sNew=sNew.concat(new Integer(i).toString()); //일단 붙이기
					int cnt=0; //비교할 부분문자열 길이 (1~)
					boolean flag=false; //좋은 문자열인지
					for(cnt=0;cnt<N/2;cnt++) { 
						System.out.println(cnt+" B"+sNew);
						int m=sNew.length()-1;
						int m2=m-cnt-1;
						while(m>=N/2 && m2>=0) { 
							System.out.println(m+" C"+sNew);
						if(sNew.substring(m-cnt,m).equals(sNew.substring(m2-cnt,m2))) {
							sNew=sOld;
							flag=true;
							break;
						}
						m--; m2--;
						}
						if(flag==true) break; 
					}
					if(flag=true) continue;
					else {
						sOld=sNew; 
						if(sNew.length()==N) break;
					}
				}
				System.out.println("D");
			}
			System.out.println(sNew);
		}
		sc.close();
	}

}
