
class Solution {
    int minJump;
    public int jump(int[] nums) {
        minJump = nums.length;
        doJump(nums, 0, 0);
        return minJump;
    }
    
    public void doJump(int[] nums, int position, int jumped) {
        if(position > nums.length-1) return;
        if(position == nums.length-1) {
            minJump = Math.min(minJump, jumped);
            return;
        }
        
        int farthestJump = Math.min(nums[position], nums.length-1);
        for(int i=farthestJump; i>0; i--) {
            doJump(nums, position+i, jumped+1);
        }
    }
}
