class Solution {
    public String removeDuplicates(String S) {
        if(S.length() <= 1) return S;
        
        while(!hasNoAdjacentDuplicates(S)) {
            for(int i=1; i<S.length(); i++) { 
                if(S.charAt(i-1) == S.charAt(i)) {
                    S = S.substring(0, i-1) + S.substring(i+1, S.length());
                    i--;
                }
            }
        }
        
        return S;
    }
    
    boolean hasNoAdjacentDuplicates(String s) {
        if(s.length() <= 1) return true;
        
        for(int i=1; i<s.length(); i++) { 
            if(s.charAt(i-1) == s.charAt(i)) return false;
        }
        return true;
    }
}
