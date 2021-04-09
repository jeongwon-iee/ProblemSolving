class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int lo = 0;
        int hi = chars.length-1;
        while(lo < hi) {
            while(lo<hi && !vowels.contains(chars[lo]+"")) {
                lo++;
            } 
            while(lo<hi && !vowels.contains(chars[hi]+"")) {
                hi--;
            }
            char tmp = chars[lo];
            chars[lo++] = chars[hi];
            chars[hi--] = tmp;
        }
        return new String(chars);
    }
}
