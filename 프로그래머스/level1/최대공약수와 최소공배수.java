class Solution {
    public int[] solution(int n, int m) {
        if(n>m) {
            int tmp = n;
            n = m;
            m = tmp;
        }
        int GCD = 1;
        for(int i = 1; i <= n; i++) {
            if(m%i == 0 && n%i == 0) 
                GCD = i;
        }
        int LCM = m*n;
        for(int i = m*n; i >= m; i--) {
            if(i%m == 0 && i%n == 0)
                LCM = i;
        }
        int[] answer = new int[] {GCD, LCM};
        return answer;
    }
}
