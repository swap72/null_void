
package practice7.LinkedList_ChatGPT_Implementation;

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

    // Delete a node by value
    public void delete(int value) {
        if (head == null) { // If the list is empty
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        // If the head node holds the value to be deleted
        if (head.data == value) {
            head = head.next; // Move the head pointer to the next node
            return;
        }

        // Traverse to find the node to delete
        Node tmp = head;
        while (tmp.next != null && tmp.next.data != value) {
            tmp = tmp.next;
        }

        // If the value is found, skip the node
        if (tmp.next != null) {
            tmp.next = tmp.next.next;
        } else {
            System.out.println("Value " + value + " not found in the list.");
        }
    }

    // Search for a value in the linked list
    public boolean search(int value) {
        Node tmp = head;
        while (tmp != null) {
            if (tmp.data == value) {
                return true; // Value found
            }
            tmp = tmp.next;
        }
        return false; // Value not found
    }

    // Display the linked list
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

