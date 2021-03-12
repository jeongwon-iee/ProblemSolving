import java.util.*;
class Solution {
    public String solution(String number, int k) {
        StringBuilder subNum = new StringBuilder();
        int totalLength = number.length()-k;
        int start = 0;
        int end = number.length()-totalLength;
        while(subNum.length() < totalLength) {
            int MAX = Integer.MIN_VALUE;
            for(int i=start; i<=end; i++) {
                int n = number.charAt(i)-'0';
                if(MAX < n) {
                    MAX = n;
                    start = i+1;
                }
            }
            subNum.append(MAX);
            end++;
        }
        return subNum.toString();
    }
}
