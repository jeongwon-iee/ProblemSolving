class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        
        return kSum(nums, 0, 4, target);
    }
    
    public List<List<Integer>> kSum(int[] nums, int start, int k, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (start == nums.length || k*nums[start] > target || k*nums[nums.length-1] < target) 
            return res;
        if (k==2) {
            return twoSum(nums, start, target);
        }
        
        for (int i=start; i<nums.length; i++) {
            if (i!=start && nums[i-1]==nums[i]) continue;
            for (var set : kSum(nums, i+1, k-1, target-nums[i])) {
                res.add(new ArrayList<>(Arrays.asList(nums[i])));
                res.get(res.size()-1).addAll(set);
            }
        }
        return res;
    }
    
    public List<List<Integer>> twoSum(int[] nums, int start, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int lo = start;
        int hi = nums.length-1;
        while (lo<hi) {
            int sum = nums[lo]+nums[hi];
            if (target == sum) {
                res.add(Arrays.asList(nums[lo++], nums[hi--]));
                while (lo<hi && nums[lo-1]==nums[lo]) lo++;
            }
            else if (target < sum) hi--;
            else lo++;
        }
        return res;
    }
}
