class Solution {
    public int solution(int n) {
        int answer = 1;
        boolean isPrime;
        
        for(int i=3; i<=n; i++) {
            isPrime = true;
            for(int j=2; j*j<=i; j++) {
                if(i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) answer++;
        }
        return answer;
    }
}
