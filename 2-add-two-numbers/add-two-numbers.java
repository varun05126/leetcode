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
    ListNode addTwoNumbers(ListNode l1, ListNode l2) //l1 and l2 are 2 single linked lists 
    {
        ListNode dummy = new ListNode(0); // Dummy node to build the answer list

        ListNode curr = dummy; // Pointer used to add new nodes

        int carry = 0; // Stores carry after addition

        while (l1 != null || l2 != null || carry != 0)  // Continue while either list has nodes or carry is left
        {
        {
            int sum = carry;  // Start with previous carry

            if(l1 != null)  // If l1 has a node, add its value
            {
                sum = sum + l1.val;
                l1 = l1.next;

            }

            if(l2 != null) // If l2 has a node, add its value
            {
                sum = sum + l2.val;
                l2 = l2.next;
            }

            carry = sum / 10; // Store carry for the next addition
            curr.next = new ListNode(sum % 10); // Create a node with the last digit of sum
            curr = curr.next; // Move current pointer to the new node
        } 
    }
    return dummy.next; // Skip dummy node and return actual answer
}
}