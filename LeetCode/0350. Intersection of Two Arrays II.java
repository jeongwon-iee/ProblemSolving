class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> intersection = new ArrayList<>();
        Arrays.sort(nums1); 
        Arrays.sort(nums2); 
        
        int p1=0, p2=0;
        while(p1<nums1.length && p2<nums2.length) {
            if(nums1[p1] == nums2[p2]) {
                intersection.add(nums1[p1]);
                p1++;
                p2++;
                if(p1==nums1.length || p2==nums2.length) break;
            }
            while(p1 < nums1.length && nums1[p1] < nums2[p2]) {
                p1++;
            }
            if(p1==nums1.length || p2==nums2.length) break;
            while(p2 < nums2.length && nums2[p2] < nums1[p1]) {
                p2++;
            }
        }
        return intersection.stream().mapToInt(i->i).toArray();
    }
}
