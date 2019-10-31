import java.util.*;

public class ÀÌÃµÄ¥³â_1924 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt(); //x:month y:date
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int date=0;
		for(int i=0;i<x-1;i++) {
			date+=month[i];
		}
		date+=y;
		switch(date%7) {
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;	
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("THU");
			break;			
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("SAT");
			break;
		case 0:
			System.out.println("SUN");
			break;
			
		}
		sc.close();
	}

}
