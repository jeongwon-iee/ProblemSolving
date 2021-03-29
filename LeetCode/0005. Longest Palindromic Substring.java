class Solution {
    public String longestPalindrome(String s) {
        if(s.length() <= 1) return s;
        
        String longestPalindrome = "";
        for(int i=0; i<s.length(); i++) {
            for(int j=i; j<s.length(); j++) {
                String substring = s.substring(i, j+1);
                if(isPalindromic(substring)) {
                    longestPalindrome = 
                        (longestPalindrome.length() < substring.length())? substring: longestPalindrome;
                }
            }
        }
        return longestPalindrome;
    }
    
    public boolean isPalindromic(String str) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length()/2; i++) {
            stack.push(str.charAt(i));
        }
        
        int mid;
        if(str.length()%2==1) mid = str.length()/2+1;
        else mid = str.length()/2;
        
        for(int i=mid; i<str.length(); i++) {
            char c = stack.pop();
            if(c != str.charAt(i)) return false;
        }
        return true;
    }
}
