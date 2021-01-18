import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int answerIndex=0;
        int i,j,k;
        for(int commend=0; commend<commands.length; commend++) {
            i = commands[commend][0];
            j = commands[commend][1];
            k = commands[commend][2];
            
            int[] cut = new int[j-i+1];
            for(int index = i-1; index < j; index++) {
                cut[index-i+1] = array[index];
            }
            Arrays.sort(cut);
            answer[answerIndex++] = cut[k-1];
        }
        return answer;
    }
}
