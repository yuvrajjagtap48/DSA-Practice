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


public class LinkedList {
    Node head;
    Node tail;
    int size;

    public LinkedList() {
        this.size = 0;
    }

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private int helper(Node head, int key){
        if(head == null){
            return 0;
        }
        int count = helper(head.next, key) + 1;
        if(count == key){
            head.next = head.next.next;
        }
        return count;
    }

    public void removeNthFromEnd(int n){
        helper(head, n);
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        System.out.println("Original List:");
        ll.printList();

        int n = 2;
        ll.removeNthFromEnd(n);
        System.out.println("List after removing " + n + "th node from the end:");
        ll.printList();
    }
}