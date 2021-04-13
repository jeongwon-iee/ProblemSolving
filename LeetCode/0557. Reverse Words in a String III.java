class Solution {
    public String reverseWords(String s) {
        StringBuilder reversed = new StringBuilder();
        String[] words = s.split(" ");
        for(int i=0; i<words.length; i++) {
            String word = words[i];
            for(int j=0; j<word.length(); j++) {
                char c = word.charAt(word.length()-j-1);
                reversed.append(c);
            }
            if(i!=words.length-1) reversed.append(" ");
        }
        return reversed.toString();
    }
}
