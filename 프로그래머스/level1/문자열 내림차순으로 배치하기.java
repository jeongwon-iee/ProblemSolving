import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        char[] arr = new char[s.length()];
        for(int i=0; i<s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        Arrays.sort(arr);
        for(int i = arr.length-1; i>=0; i--) {
            answer.append(arr[i]);
        }
        return answer.toString();
    }
}
