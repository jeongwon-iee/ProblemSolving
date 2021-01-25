import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length <= 1) return new int[]{-1};
        int[] copyArr = Arrays.copyOf(arr, arr.length);
        int[] answer = new int[arr.length-1];
        Arrays.sort(copyArr);
        
        int index=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != copyArr[0]) {
                answer[index++] = arr[i];
            }
        }
        return answer;
    }
}
