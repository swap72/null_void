package practiceLinkedList;

class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class LinkedList{
private Node head;

    public void insert(int newData){
        Node newNode=new Node(newData);
        if(head==null){
            head=newNode;
        }
        else{
        Node tmp=head;
            while(tmp.next!=null){
                tmp=tmp.next;
            }
            tmp.next=newNode;
        }
    }
    
    public void display(){
        if(head==null){
            System.out.println("Your Liked_List is empty");
        }
        Node tmp=head;
        while(tmp!=null){
            System.out.print(tmp.data+"->");
            tmp=tmp.next;
        }
        System.out.println("Null");
    }
    
    public void delete(int inputdata){
        Node tmp=head;
        while(tmp.data!=inputdata){
            tmp=tmp.next;
        }
        
        
    }

}

public class PracticeLinkedList{
    public static void main(String[] args) {
        LinkedList lili=new LinkedList();
        lili.insert(2);
        lili.insert(3);
        lili.insert(5);
        lili.insert(7);
        lili.insert(172);
        
        lili.display();
    }
}