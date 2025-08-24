package programmingclass;

public class StackImplementation {
    
    static int[] queue; static int front,rear;
    
    static void createQueue(int size){
        queue=new int[size];
        front=0; rear=0;
        System.out.println("Queue has been created with size "+size);
    }
    
    static void enqueue(int ele){
        if(rear==queue.length){
            System.out.println("Queue is full..!");
        }
        else{
          queue[rear]=ele;
          rear++;
            System.out.println(ele+" has been inserted");
        }
    }
        static void disp(){
            if(front==rear){
                System.out.println("Queue is empty");
            }
            else{
                for (int i = 0; i < rear; i++) {
                    System.out.print(queue[i]+" ");
                }
            }
        }
        
        static void dequeue(){
            if(rear==front){
                System.out.println("Queue is empty");
            }
            else{
                System.out.println(Queue[front]+"has been dequeued");
                for (int i =front; i < rear-1; i++) {
                    queue[i]=queue[i+1];
                }
                rear--;
            }
        }
    
    public static void main(String[] args) {
        createQueue(4);
        enqueue(79); enqueue(37); enqueue(171); enqueue(72); enqueue(17);
        disp();
    }
}
