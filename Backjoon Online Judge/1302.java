package Á¶ÇÕÅ½»ö;
import java.util.*;

public class º£½ºÆ®¼¿·¯_1302 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		HashMap<String,Integer> book = new HashMap<>();
		String str;
		
		for(int i=0;i<N;i++) {
			str=sc.next();
			if(book.containsKey(str))
				book.replace(str, book.get(str)+1 );
			else
				book.put(str, 1);
		}
		int max=0;
		Set<String> title = book.keySet();
		Iterator<String> it = title.iterator();
		while(it.hasNext()) {
			String name = it.next();
			if(max<book.get(name))
				max=book.get(name);
		}
		ArrayList<String> ar = new ArrayList<>();
		Iterator<String> i = title.iterator();
		while(i.hasNext()) {
			String name = i.next();
			if(max==book.get(name))
				{ar.add(name);}
		}

		Collections.sort(ar);
		System.out.println(ar.get(0));
		sc.close();
	}

}
