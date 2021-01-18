import java.util.*;
class Solution {
    Set<Integer> set = new HashSet<>();
    public int[] solution(int[] numbers) {
        getAllPossibleSumInArray(numbers);
        int[] answer = new int[set.size()];
        
        int index=0;
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()) {
            answer[index++] = iterator.next();
        }
        Arrays.sort(answer);
        return answer;
    }
    void getAllPossibleSumInArray(int[] numbers) {
        for(int i=0; i<numbers.length-1; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i]+numbers[j]);
            }
        }
    }
}
