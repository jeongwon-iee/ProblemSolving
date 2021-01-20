import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        List<String> answer = new ArrayList<>();
        TreeMap<Character, List<String>> map = new TreeMap<>();
        for(String str : strings) {
            char c = str.charAt(n);
            if(map.containsKey(c)) {
                List<String> list = map.get(c);
                list.add(str);
                map.put(c, list);
            }
            else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(c, list);
            }
        }
        
        Iterator<Character> iterator = map.keySet().iterator();
        while(iterator.hasNext()) {
            Character ch = iterator.next();
            List<String> list = map.get(ch);
            Collections.sort(list);
            for(String s : list) {
                answer.add(s);
            }
        }
        
        return answer.toArray(new String[0]);
    }
}
