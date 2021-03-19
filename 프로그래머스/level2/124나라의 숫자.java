class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        String[] world124 = new String[] {"4", "1", "2"};
        while(n>0) {
            int remainder = n%3;
            n/=3;
            answer.append(world124[remainder]);
            if(remainder%3 == 0) n--;
        }
        return answer.reverse().toString();
    }
}
