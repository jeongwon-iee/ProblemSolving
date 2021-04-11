class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums1);        
        Arrays.sort(nums2);
        for(int i=0; i<nums1.length; i++) {
            if(i!=0 && nums1[i]==nums1[i-1]) continue;
            int num = nums1[i];
            for(int j=0; j<nums2.length; j++) {
                if(num == nums2[j]) {
                    result.add(num);
                    break;
                }
                else if(num < nums2[j]) break;
            }
        }        
        return result.stream().mapToInt(i->i).toArray();
    }
}
