class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }
    
    long sumAtoB(long a, long b) {
        return (b-a+1)*(a+b)/2;
    }
}
