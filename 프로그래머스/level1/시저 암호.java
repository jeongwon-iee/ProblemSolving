class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        char[] upperAlphabet = new char[26];
        char[] lowerAlphabet = new char[26];
        
        for(int i=0; i<26; i++) {
            upperAlphabet[i] = (char)('A'+i);
            lowerAlphabet[i] = (char)('a'+i);
        }
        
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ' ') {
                answer.append(" ");
                continue;
            }
            char c = s.charAt(i);
            if(Character.isUpperCase(c)) {
                answer.append(upperAlphabet[(c-'A'+n)%26]);
            } else if(Character.isLowerCase(c)) {
                answer.append(lowerAlphabet[(c-'a'+n)%26]);
            }
        }
        return answer.toString();
    }
}
