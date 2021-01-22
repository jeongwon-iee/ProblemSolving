class Solution {
    public int solution(String s) {
        int result = 0;
        int start = 0;
        boolean signed = false;
        if(s.charAt(0) == '-') {
            signed = true;
            start = 1;
        }
        else if(s.charAt(0) == '+') {
            start = 1;
        }
        
        for(int i=start; i<s.length(); i++) {
            result = result*10 + s.charAt(i)-'0';
        }
        
        return signed ? result*(-1) : result;
    }
}
