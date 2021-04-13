class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for(int len = 1; len <= arr.length; len++) {
            if(len%2 == 1) {
                for(int i=0; i<=arr.length-len; i++) {
                    for(int j=i; j<i+len; j++) {
                        sum += arr[j];
                    }
                }
            }
        }
        return sum;
    }
}
