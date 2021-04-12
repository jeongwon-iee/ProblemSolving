class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0) return 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            int currentSum = 0;
            for(int j=i; j<nums.length; j++) {
                currentSum += nums[j];
                maxSum = Math.max(currentSum, maxSum);
            }
        }
        return maxSum;
    }
}
/*
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0) return 0;
        
        int currentSum = nums[0];
        int maxSum = nums[0];
        for(int i=1; i<nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
*/
