package LinkedList;

public class ReverseLL {
    public void reverse(LinkedList ll){
        Node prev = null;
        Node curr = ll.head;
        Node next;

        while(curr != null){
            next = curr.next; // store next node
            curr.next = prev; // reverse the link
            prev = curr; // move prev to current
            curr = next; // move to next node
        }
        ll.head = prev; // update head to new first node
    }
}

