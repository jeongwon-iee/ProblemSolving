class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        String[] 수박 = new String[]{"수","박"};
        
        for(int i=0; i<n; i++) {
            answer.append(수박[i%2]);
        }
        return answer.toString();
    }
}
