class Solution {
    public String addBinary(String a, String b) {
        int a_Idx = a.length()-1;
        int b_Idx = b.length()-1;
        StringBuilder answer = new StringBuilder();
        
        int sum = 0, carry = 0;
        while(a_Idx>=0 || b_Idx>=0) {
            int p = (a_Idx < 0)? 0: a.charAt(a_Idx)-'0';
            int q = (b_Idx < 0)? 0: b.charAt(b_Idx)-'0';
            
            sum = p + q + carry;
            answer.append(sum%2);
            carry = sum/2;
            
            a_Idx--;
            b_Idx--;
        }
        if(carry>0) answer.append(carry);
        
        return answer.reverse().toString();
    }
}
