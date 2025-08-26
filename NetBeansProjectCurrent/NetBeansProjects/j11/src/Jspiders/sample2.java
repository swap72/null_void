package Jspiders;

public class sample2 {
  Node head;
  class Node{
    int data;
    Node next;
    
    Node(int d){
      data=d;
      next=null;
    }
  }
  
  
  //implementation
  
  public void insertAtEnd(int newData) {
    Node newNode =new Node(newData);
    
    if(head==null) {
      head=new Node(newData);
      return;
    }
    newNode.next=null;
    Node temp=head;
    while(temp.next!=null) {
      temp=temp.next;
    }
    temp.next=newNode;
    return;
  }
  
  void display() {
    Node temp=head;
    while(temp!=null) {
      System.out.println(temp.data+" ");
      temp=temp.next;
    }
  }
  
  public static void main(String[] args) {
    sample2 obj=new sample2();
    obj.insertAtEnd(23);
    obj.insertAtEnd(34);
    obj.insertAtEnd(43);
    
    System.out.println("before insertion");
    obj.display();
    System.out.println();
    
    obj.insertAtEnd(10);
    
    System.out.println("After insertion");
    obj.display();
    System.out.println();
    
    
    
  }
  
}
