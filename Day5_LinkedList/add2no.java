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
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Create a dummy node to start the resulting linked list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        
        // Traverse both lists
        while (l1 != null || l2 != null) {
            // Get values from current nodes, if they exist
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            
            // Calculate sum and carry
            int sum = x + y + carry;
            carry = sum / 10;
            sum = sum % 10;
            
            // Create a new node with the sum and attach it to the result list
            current.next = new ListNode(sum);
            current = current.next;
            
            // Move to the next nodes in the input lists
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        // If there's a remaining carry, add a new node with the carry value
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        
        // Return the result list, starting from the next of dummy node
        return dummy.next;
    }
}
