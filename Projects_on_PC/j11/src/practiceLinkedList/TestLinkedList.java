package practiceLinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert elements into the linked list
        list.insert(10);
        list.insert(20);
        list.insert(30);

        // Display the list
        System.out.println("Linked List:");
        list.display(); // Output: 10 -> 20 -> 30 -> null
    }
}
