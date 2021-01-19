class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] daysPerMonth = new int[] {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] daysInWeek = new String[] {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        
        int totalDays=0;
        for(int i=0; i<a-1; i++) {
            totalDays+=daysPerMonth[i];
        }
        totalDays+=b;
        answer = daysInWeek[totalDays%7];
        return answer;
    }
}
