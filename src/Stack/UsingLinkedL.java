package Stack;

class Singlell{
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head;

    /*Push the Node at the Beginning*/
    void push(int data){
        Node nn = new Node(data);
        if(head == null){
            head = nn;
            return;
        }
        nn.next = head;
        head = nn;
    }

    /*Pop the Node at the Beginning*/
    void pop(){
        if(head == null){
            System.out.println("Stack underflow");
            return;
        }
        System.out.println("Popped node : " + head.data);
        head = head.next;
    }

    /*Returns the top element*/
    void peek(){
        System.out.println(head.data);
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class UsingLinkedL {
    public static void main(String[] args) {
        Singlell s1 = new Singlell();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.display();
        s1.peek();
    }
}
