package practiceLinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    private Node head;

    // Insert a new node at the end
    public void insert(int newData) {
        Node newNode = new Node(newData);

        if (head == null) { // If the list is empty, make the new node the head
            head = newNode;
        } else { // Traverse to the end and insert the new node
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }
    }
    
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " -> ");
            tmp = tmp.next;
        }
        System.out.println("null");
    }
}
