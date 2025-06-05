public class LinkedList1 {
    // Node class
    public static class Node {
        int data;
        Node next; // Should be of type Node, not int

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // LinkedList class logic
    Node head = null;
    Node tail = null;

    // Insert at head method
    public void insertAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head; // Insert at beginning
            head = temp;
        }
    }

    // Display method
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // Main method
    public static void main(String[] args) {
        LinkedList1 l = new LinkedList1();
        l.insertAtHead(10);
        l.insertAtHead(20);
        l.insertAtHead(30);
        l.insertAtHead(40);
        l.display();
    }
}
