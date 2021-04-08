class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            } else map.put(c, 1);
        }
        for(int i=0; i<t.length(); i++) {
            char c = t.charAt(i);
            if(map.containsKey(c)) {
                map.put(c, map.get(c)-1);
                if(map.get(c) == 0) {
                    map.remove(c);
                }
            } else return false;
        }
        if(map.size() == 0) return true;
        else return false;
    }
}
