package linkedlist;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class addtwolist {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode dummy = new ListNode(0);  // dummy head for result list
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null) {
            // Get values from current nodes (or 0 if null)
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = x + y + carry;
            carry = sum / 10;  // update carry

            current.next = new ListNode(sum % 10);  // add node to result
            current = current.next;

            // Move to next nodes
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // Add remaining carry if any
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummy.next;  // skip dummy head
    
    }
}