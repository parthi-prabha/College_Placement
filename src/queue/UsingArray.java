package queue;
/*Implemented the queue operations using array*/
class QueueArray{
    int size, arr[], front, rear;
    QueueArray(int data){
        size = data;
        arr = new int[size];
        front = 0;
        rear = -1;
    }

    void enqueue(int data){
        if(rear == size - 1){
            System.out.println("overflow");
            return;
        }
        arr[++rear] = data;
        System.out.println(data + " Pushed");
    }

    void dequeue(){
        if(rear == -1){
            System.out.println("underflow");
            return;
        }
        System.out.println(arr[front++] + " Popped");
    }

    void peek(){
        if(rear == -1){
            System.out.println("underflow");
            return;
        }
        System.out.println(arr[front]);
    }

    void display(){
        if (rear == -1){
            System.out.println("underflow");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
public class UsingArray {
    public static void main(String[] args) {
        QueueArray q1 = new QueueArray(5);
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.dequeue();
        q1.peek();
        q1.display();
    }
}
