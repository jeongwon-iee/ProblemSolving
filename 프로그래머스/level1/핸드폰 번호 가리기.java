class Solution {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();
        int index=0;
        for(index=0; index<phone_number.length()-4; index++) {
            answer.append("*");
        }
        answer.append(phone_number.substring(index));
        return answer.toString();
    }
}
