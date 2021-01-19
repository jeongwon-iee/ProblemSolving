class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        if(s.length()%2==0) {
            answer.append(s.charAt(s.length()/2-1));
            answer.append(s.charAt(s.length()/2));
        } else {
            answer.append(s.charAt(s.length()/2));
        }
        return answer.toString();
    }
}
