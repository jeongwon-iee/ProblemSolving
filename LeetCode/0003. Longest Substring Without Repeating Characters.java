class Solution {
    Set<Character> set = new HashSet<>();
    public int lengthOfLongestSubstring(String s) { 
        if(s.length() <= 1) return s.length();
        
        int maxLength=0;
        for(int i=0; i<s.length()-1; i++) {
            set.add(s.charAt(i));
            for(int j=i; j<s.length(); j++) {
                if(j!=i && set.contains(s.charAt(j))) break;
                maxLength = Math.max(maxLength, j-i+1);
                set.add(s.charAt(j));
            }
            set.clear();
        }
        return maxLength;
    }
}
