package 최적화to결정문제;
import java.util.*;
import java.io.*;

public class 수찾기_1920 {

	public static void main(String[] args) {
		
		try {
		
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		OutputStream out = new BufferedOutputStream(System.out);
		
		int N = Integer.parseInt(b.readLine());
		int[] num = new int[N];
		StringTokenizer st = new StringTokenizer(b.readLine());
		for(int i=0;i<N;i++) {
			num[i] = Integer.valueOf(st.nextToken());
		}
		Arrays.sort(num);
		
		
		int M = Integer.parseInt(b.readLine());
		st = new StringTokenizer(b.readLine());
		
		for(int i=0; i<M; i++)
		{
			int k = Integer.valueOf(st.nextToken());
			out.write(((Arrays.binarySearch(num, k) >= 0 ? 1 : 0) + "\n").getBytes());
		}
		out.flush(); //flush the buffer
		b.close(); out.close(); //close the stream
		}catch(IOException e) {
			
		}
		/*
		 *  for(int i=0;i<M;i++) {
			int mid=N/2;
			int low=0;
			int high=N-1;
			int a=sc.nextInt();
			while(high>=low) {
				if(a==num[mid]) {
					System.out.println(1);
					break;
				}
				else if(a<num[mid]) {
					if(a<num[low]) {
						break;
					}
					high=mid;
					if(high==mid) mid--;
					else mid=(high+low)/2;
				}
				else {
					if(a>num[high]) {
						break;
					}
					low=mid;
					if(low==mid) mid++;
					else mid=(high+low)/2;
				}
			}
				System.out.println(exist[i]);
			
		}
		*/
	
	}

}
