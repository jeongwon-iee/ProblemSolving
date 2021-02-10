import java.util.*;

public class CJIO2020_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        HashMap<Character, Integer> map;
        for(int testcase = 1; testcase <= T; testcase++) {
            String S = sc.next();
            int answer = 0;
            map = new HashMap<>();
            for(int i = 0; i < S.length(); i++) {
                char ch = S.charAt(i);
                if(ch =='O') {
                    if(map.containsKey('I')) {
                        int left = map.get('I');
                        if (left > 1) map.put('I', left - 1);
                        else map.remove('I');
                        answer++;
                    } else {
                        int left = map.get('i');
                        if (left > 1) map.put('i', left - 1);
                        else map.remove('i');
                    }
                } else if(ch == 'o') {
                    if(map.containsKey('i')) {
                        int left = map.get('i');
                        if (left > 1) map.put('i', left - 1);
                        else map.remove('i');
                    } else {
                        int left = map.get('I');
                        if (left > 1) map.put('I', left - 1);
                        else map.remove('I');
                    }
                } else {
                    if (map.containsKey(ch)) {
                        map.put(ch, map.get(ch)+1);
                    } else map.put(ch, 1);
                }
            }
            System.out.println("Case #"+testcase+": "+answer);
        }
    }
}
