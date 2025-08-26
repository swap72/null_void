
package practice7.LinkedList_ChatGPT_Implementation;

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

        // Search for an element
        System.out.println("Search 20: " + list.search(20)); // true
        System.out.println("Search 40: " + list.search(40)); // false

        // Delete an element
        list.delete(20);
        System.out.println("After deleting 20:");
        list.display(); // Output: 10 -> 30 -> null

        // Attempt to delete a non-existent element
        list.delete(40); // Output: Value 40 not found in the list.
    }
}

