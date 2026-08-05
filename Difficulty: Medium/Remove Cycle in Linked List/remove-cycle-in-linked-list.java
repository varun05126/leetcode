/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int val) {
        data = val;
        next = null;
    }
} */
class Solution {
    public static void removeLoop(Node head) {
        if (head == null || head.next == null) return;

        Node slow = head;
        Node fast = head;
        
        boolean hasLoop = false;
        
        while (fast != null && fast.next != null) 
        {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) 
            {
                hasLoop = true;
                break;
            }
        }
        
        if (!hasLoop) return;

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        Node ptr = slow;
        while (ptr.next != slow) {
            ptr = ptr.next;
        }
        ptr.next = null;
    }
}