/*

class Node {
    public int data;
    public Node next;

    public Node(int x) {
        data = x;
        next = null;
    }

}
*/
class Solution {
    public Node makeUnion(Node head1, Node head2) {
        // code here
        HashSet<Integer> seen = new HashSet<>();
        
        Node result = null;
        Node tail = null;
        
        while (head1 != null) 
        {
            if (!seen.contains(head1.data)) {
                seen.add(head1.data);

                Node newNode = new Node(head1.data);

                if (result == null)
                    result = tail = newNode;
                else {
                    tail.next = newNode;
                    tail = newNode;
                }
            }
            head1 = head1.next;
        }
        
        
        while (head2 != null) {
            if (!seen.contains(head2.data)) {
                seen.add(head2.data);

                Node newNode = new Node(head2.data);

                if (result == null)
                    result = tail = newNode;
                else {
                    tail.next = newNode;
                    tail = newNode;
                }
            }
            head2 = head2.next;
        }

        return result;
    }
}