class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode sortedList = new ListNode();
        ListNode currNode = head;
        
        while (currNode != null) { // iterate over the input list
            ListNode prevNode = sortedList;
            
            while (prevNode.next != null && prevNode.next.val < currNode.val) { 
                // find the position to insert the current node
                prevNode = prevNode.next;
            }
            ListNode nextNode = currNode.next;
            
            // insert the current node to the new list
            currNode.next = prevNode.next;
            prevNode.next = currNode;
            
            currNode = nextNode; // moving on to the next iteration
        }
        
        return sortedList.next;
    }
}
