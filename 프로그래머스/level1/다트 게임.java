class Solution {
    public static int answer;
    public static int solution(String dartResult) {
        answer = 0;
        int[] score = new int[4];
        int turn = 1;
        for (int i = 0; i < dartResult.length(); i++) {
            char dartChar = dartResult.charAt(i);
            int dartInt = Character.getNumericValue(dartChar);
            if (dartInt >= 0 && dartInt < 10) {
                if (dartInt == 1 && Character.getNumericValue(dartResult.charAt(i + 1)) == 0) {
                    dartInt = 10;
                    i++;
                }
                score[turn] = dartInt;
            } else {
                switch (dartChar) {
                    case 'D':
                        score[turn] *= score[turn];
                        break;
                    case 'T':
                        score[turn] *= (score[turn] * score[turn]);
                        break;
                    case '*':
                        score[--turn] *= 2;
                        score[turn - 1] *= 2;
                        break;
                    case '#':
                        score[--turn] *= (-1);
                        break;
                }
                turn++;
            }
        }
        for (int i = 1; i <= 3; i++) {
            answer += score[i];
        }
        return answer;
    }
}
