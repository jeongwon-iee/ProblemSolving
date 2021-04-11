class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder addedString = new StringBuilder();
        int p1 = num1.length()-1, p2 = num2.length()-1;
        
        int sum = 0, carry = 0;
        while(p1 >= 0 || p2 >= 0) {
            int a = (p1>=0)? num1.charAt(p1)-'0': 0;
            int b = (p2>=0)? num2.charAt(p2)-'0': 0;
            sum = a + b + carry;
            addedString.append(sum%10);
            carry = sum/10;
            p1--;
            p2--;
        }
        if(carry > 0) addedString.append(carry);
        return addedString.reverse().toString();
    }
}
