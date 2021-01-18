import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int[] people = new int[n];
        for(int l : lost) 
            people[l-1]--;
        for(int r : reserve)
            people[r-1]++;
        
        for(int i=0; i<n; i++) {
            if(people[i] == -1) {
                if(i-1>=0 && people[i-1] == 1) {
                    people[i]++;
                    people[i-1]--;
                }
                else if(i+1<n && people[i+1] == 1) {
                    people[i]++;
                    people[i+1]--;
                }
            }
        }
        
        for(int i=0; i<n; i++) {
            if(people[i] == -1) 
                answer--;
        }
        
        return answer;
    }
}
