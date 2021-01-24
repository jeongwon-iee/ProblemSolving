class Solution {
    public long solution(long n) {
        double target = Math.sqrt(n);
        if(target - (int)target == 0) return (long)(target+1)*(long)(target+1);
        return -1;
    }
}
