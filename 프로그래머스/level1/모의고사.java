import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] score = new int[3];
        int[] man1 = new int[]{1,2,3,4,5};
        int[] man2 = new int[]{2,1,2,3,2,4,2,5};
        int[] man3 = new int[]{3,3,1,1,2,2,4,4,5,5};
        
        for(int i=0; i<answers.length; i++) {
            int correct = answers[i];
            if(man1[i%5] == correct) score[0]++;
            if(man2[i%8] == correct) score[1]++;
            if(man3[i%10] == correct) score[2]++;
        }
        
        int maxScore = Math.max(Math.max(score[0],score[1]),score[2]);
        if(maxScore == score[0]) answer.add(1);
        if(maxScore == score[1]) answer.add(2);
        if(maxScore == score[2]) answer.add(3);
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}
