import java.util.*;
class Solution {
    static int[] nums;
    static List<Integer> list = new ArrayList<>();
    static int answer = 0;
    
    public int solution(int[] nums) {
        this.nums = nums;
        pickThreeNumbers(0);

        return answer;
    }
    
    void pickThreeNumbers(int index) {
        if(list.size() == 3) {
            int threeSum = list.get(0) + list.get(1) + list.get(2);
            if(isPrime(threeSum)) answer++;
            return;
        }
        
        for(int i=index; i<nums.length; i++) {
            list.add(nums[i]);
            pickThreeNumbers(i+1);
            list.remove(new Integer(nums[i]));
        }
    }
    
    boolean isPrime(int num) {
        for(int i=2; i<num; i++) {
            if(num%i == 0) return false;
        }
        return true;
    }
}
