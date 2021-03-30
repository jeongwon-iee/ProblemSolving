public class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int start = 0, end = height.length - 1;
        
        while (start < end) {
            maxArea = Math.max(maxArea, Math.min(height[start], height[end]) * (end - start));
            if (height[start] < height[end])
                start++;
            else
                end--;
        }
        return maxArea;
    } 
}
