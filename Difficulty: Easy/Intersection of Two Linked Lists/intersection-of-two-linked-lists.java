/* structure of list node:
class Node {
    int data;
    Node next;
    Node(int val) {
        data = val;
        next = null;
    }
}
*/

class Solution {
    public Node findIntersection(Node head1, Node head2) {
        HashSet<Integer> set = new HashSet<>();
        
        Node curr2 = head2;
        while (curr2 != null) {
            set.add(curr2.data);
            curr2 = curr2.next;
        }
        
        Node dummy = new Node(0);
        Node tail = dummy;
        
        Node curr1 = head1;
        while (curr1 != null) {
            if (set.contains(curr1.data)) {
                tail.next = new Node(curr1.data);
                tail = tail.next;
            }
            curr1 = curr1.next;
        }
        
        return dummy.next;
    }
}