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


public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        
        System.out.println("Original List:");
        ll.printList();

        ReverseLL reverser = new ReverseLL();
        reverser.reverse(ll);

        System.out.println("Reversed List:");
        ll.printList();
    }
}
