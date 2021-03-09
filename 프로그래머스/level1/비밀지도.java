class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int strIdx = 0;
        
        for(int i=0; i<n; i++) {
            StringBuilder row = new StringBuilder();
            String str1 = decimalToBinary(n, arr1[i]);
            String str2 = decimalToBinary(n, arr2[i]);
            for(int j=0; j<n; j++) {
                int a = str1.charAt(j)-'0';
                int b = str2.charAt(j)-'0';
                if((a|b) == 0) row.append(" ");
                else row.append("#");
            }
            answer[strIdx++] = row.toString();
        }
        return answer;
    }
    
    String decimalToBinary(int n, int num) {
        StringBuilder answer = new StringBuilder();
        while(num>0) {
            answer.append(num%2);
            num /= 2;
        }
        while (answer.length() < n) {
            answer.append(0);
        }
        return answer.reverse().toString();
    }
}
