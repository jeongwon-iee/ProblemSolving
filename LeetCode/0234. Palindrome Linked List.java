class Solution {
    public boolean isPalindrome(ListNode head) {
        StringBuilder string = new StringBuilder();
        while(head != null) {
            string.append(head.val);
            head = head.next;
        }
        
        return string.toString().equals(string.reverse().toString());
    }
}
