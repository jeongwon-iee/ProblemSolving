class Solution {
    public int[] sortArrayByParity(int[] A) {
        int slow = 0;
        int fast = A.length-1;
        while(slow < fast) {
            if(A[slow]%2 > A[fast]%2) {
                int tmp = A[slow];
                A[slow] = A[fast];
                A[fast] = tmp;
            }
            
            if(A[slow]%2==0) slow++;
            if(A[fast]%2==1) fast--;
        }
        return A;
    }
}
