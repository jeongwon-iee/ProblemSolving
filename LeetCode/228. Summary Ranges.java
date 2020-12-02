class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> summaryOfTheRange = new ArrayList<String>();
        if(nums.length == 0) return summaryOfTheRange;
        String subRange = new Integer(nums[0]).toString();
        for(int i=1;i<nums.length;i++) {
            if(nums[i-1]+1 != nums[i]) { //subRange끊고 마무리
                if(Integer.parseInt(subRange) != nums[i-1]) subRange+=("->"+nums[i-1]);
                summaryOfTheRange.add(subRange);
                subRange = new Integer(nums[i]).toString();
            }
            else if(i==nums.length-1) {
                subRange+=("->"+nums[i]);
            }
        }
        summaryOfTheRange.add(subRange);
        return summaryOfTheRange;
    }
}
