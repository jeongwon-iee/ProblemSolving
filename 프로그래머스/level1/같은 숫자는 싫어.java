import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        int current = 10;
        for(int i=0; i<arr.length; i++) {
            if(current != arr[i]) {
                list.add(arr[i]);
                current = arr[i];
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}
