class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> summaryOfTheRange = new ArrayList<String>();
        if(nums.length == 0) return summaryOfTheRange;
        
        String subRange="";
        int start=nums[0];
        for(int i=1;i<nums.length;i++) {
            if(nums[i-1]+1 != nums[i]) { //subRange끊고 마무리
                subRange = getRange(start, nums[i-1]);
                summaryOfTheRange.add(subRange);
                start = nums[i];
            }
        }
        subRange = getRange(start, nums[nums.length-1]);
        summaryOfTheRange.add(subRange);
        return summaryOfTheRange;
    }
    
    public String getRange(int start, int end) {
        StringBuilder sb = new StringBuilder();
        sb.append(start);
        if(start != end) sb.append("->").append(end);
        return sb.toString();
    }
}
