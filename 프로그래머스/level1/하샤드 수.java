class Solution {
    public boolean solution(int x) {
        return x % sumOfDigits(x) == 0? true: false;
    }
    
    int sumOfDigits(int n) {
        int sum = 0;
        while(n>0) {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
