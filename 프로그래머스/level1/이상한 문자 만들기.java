class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int index=0;
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == ' ') {
                index = 0;
            }
            else {
                if(index%2 == 0) ch = Character.toUpperCase(ch);
                else ch = Character.toLowerCase(ch);
                index++;
            }
            answer.append(ch);
        }
        
        return answer.toString();
    }
}
