package queue;

import java.util.Queue;

class Queuell{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    Node head = null;

    /*Inserting the node at the end*/
    void enqueue(int data){
        Node nn = new Node(data);
        if(head == null){
            head = nn;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = nn;
    }

    void dequeue(){
        if(head == null){
            System.out.println("Underflow");
            return;
        }
        head = head.next;
    }

    void peek(){
        if (head == null){
            System.out.println("underflow");
            return;
        }
        System.out.println(head.data);
    }

    void display(){
        if(head == null){
            System.out.println("Underflow");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
public class UsingLinkedList {
    public static void main(String[] args) {
        Queuell q1 = new Queuell();
        q1.enqueue(10);
        q1.enqueue(70);
        q1.enqueue(30);
        q1.enqueue(50);
        q1.peek();
        q1.display();
        q1.dequeue();
        System.out.println();
        q1.display();
    }
}
