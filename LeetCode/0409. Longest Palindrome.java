class Solution {
    public int longestPalindrome(String s) {
        int length = 0;
        char[] ascii = new char[128];
        for(char c : s.toCharArray()) {
            ascii[c]++;
        }
        
        for(int v : ascii) {
            length += (v/2)*2;
            if(length % 2 == 0 && v % 2 == 1) length++;
        }
        return length;
    }
}
