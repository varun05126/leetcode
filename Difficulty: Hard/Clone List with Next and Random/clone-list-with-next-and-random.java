/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node random;

    Node(int x) {
        data = x;
        next = null;
        random = null;
    }
}*/

class Solution {
    public Node cloneLinkedList(Node head) {
        if (head == null) return null;

        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            Node copy = new Node(curr.data);
            curr.next = copy;
            copy.next = next;
            curr = next;
        }

        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
        
        curr = head;
        Node clonedHead = head.next;
        Node cloneCurr = clonedHead;

        while (curr != null) {
            curr.next = cloneCurr.next;
            curr = curr.next;
            if (curr != null) {
                cloneCurr.next = curr.next;
                cloneCurr = cloneCurr.next;
            }
        }

        return clonedHead;
    }
}