class Solution {
    public int longestPalindrome(String s) {
        int length = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        Iterator<Character> iter = map.keySet().iterator();
        boolean hasOdd = false;
        while(iter.hasNext()){
            char key = iter.next();
            int value = map.get(key);
            if(value>=2) {
                length += (value/2)*2;
            }
            if(value%2==1) hasOdd = true;
        }
        if(hasOdd) length++;
        return length;
    }
}
