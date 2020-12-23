class Solution {
    public void twoSum(List<List<Integer>> sets, int i, int[] nums) {
        int target = nums[i];
        int lo=i+1, hi=nums.length-1;
        while(lo < hi) {            
            int complement = (nums[lo]+nums[hi])*(-1);
            if(complement == target) {
                sets.add(Arrays.asList(nums[i], nums[lo++], nums[hi--]));
                while(lo<hi && nums[lo] == nums[lo-1]) lo++;
            }
            else if(complement < target) hi--;
            else lo++;
        }  
    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> sets = new ArrayList<>();  
        Arrays.sort(nums);
        for(int i=0; i<nums.length && nums[i] <= 0; i++) {
           if(i==0 || nums[i]!=nums[i-1]) {
                twoSum(sets, i, nums); 
           }
        }
        return sets;
    }
}
