class Solution {
    public int addDigits(int num) {
        if(num < 10) return num;
        
        int sumOfDigits = 0;
        while(num > 0) {
            sumOfDigits += num%10;
            num /= 10;
        }
        return addDigits(sumOfDigits);
    }
}
