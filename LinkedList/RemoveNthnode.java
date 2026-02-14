package LinkedList;

public class RemoveNthnode {
    
    public void removeNthFromEnd(LinkedList ll, int n) {
        Node dummy = new Node(0); // Create a dummy node
        dummy.next = ll.head; // Point dummy to head
        Node first = dummy;
        Node second = dummy;

        // Move first n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // Move both pointers until first reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Remove the nth node from the end
        second.next = second.next.next;

        // Update head in case the removed node was the head
        ll.head = dummy.next;
    }
}


