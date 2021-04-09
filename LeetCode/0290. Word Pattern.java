class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(words.length != pattern.length()) return false;
        
        Map<Character, String> patternForLetter = new HashMap<>();
        Map<String, Character> patternForWord = new HashMap<>();
        
        for(int i=0; i<pattern.length(); i++) {
            char letter = pattern.charAt(i);
            if(patternForLetter.containsKey(letter)) {
                if(!patternForLetter.get(letter).equals(words[i])) return false;
            }
            else if(patternForWord.containsKey(words[i])) {
                if(!patternForWord.get(words[i]).equals(letter)) return false;
            }
            else {
                patternForLetter.put(letter, words[i]);
                patternForWord.put(words[i], letter);
            }
        }
        return true;
    }
}
