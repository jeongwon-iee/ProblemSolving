class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode p = head;
        int result = 0;
        while(p != null) {
            result = result*2+p.val;
            p = p.next;
        }
        return result;
    }
}
