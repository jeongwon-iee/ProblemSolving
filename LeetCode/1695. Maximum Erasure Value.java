class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxSum = 0;
        int[] prefixSum = new int[nums.length+1];
        int start = 0, end = 0;
        for(end = 0; end < nums.length; end++) {
            int num = nums[end];
            prefixSum[end+1] = prefixSum[end] + nums[end];
            if(map.containsKey(num)) {
                start = Math.max(start, map.get(num)+1);
                map.remove(num);
            }
            map.put(num, end);
            maxSum = Math.max(maxSum, prefixSum[end+1]-prefixSum[start]);
        }
        return maxSum;
    }
}
