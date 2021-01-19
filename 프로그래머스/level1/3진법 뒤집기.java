class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder trivial = convertDecimalToReversedTrivial(n);
        answer = convertReversedTrivialToDecimal(trivial);
        return answer;
    }
    
    StringBuilder convertDecimalToReversedTrivial(int n) {
        StringBuilder trivial = new StringBuilder();
        while(n>0) {
            trivial.append(n%3);
            n/=3;
        }
        return trivial;
    }
    
    int convertReversedTrivialToDecimal(StringBuilder trivial) {
        int result = 0;
        int power=0;
        for(int i=trivial.length()-1; i>=0; i--) {
            result += (trivial.charAt(i)-'0')*Math.pow(3, power++);
        }
        return result;
    }
}
