package practice7;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    public static void main(String[] args) {
        Node newNode=new Node(4);
        Node bingo;
        System.out.println(newNode.data+" "+newNode.next);
        
    }
}

