package CircularLinkedList;

class CircularDoublell{
    class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

    /*Insert the Node at end*/
    void insertend(int data){
        Node nn = new Node(data);
        if(head == null){
            head = tail = nn;
            head.next = head;
            tail.prev = head;
            return;
        }
        tail.next = nn;
        nn.prev = tail;
        tail = nn;
        tail.next = head;
        head.prev = tail;
    }

    /*Insert the Node at Begin*/
    void insertBeg(int data){
        Node nn = new Node(data);
        if(head == null){
            head = tail = nn;
            head.next = head;
            head.prev = head;
            return;
        }
        nn.next = head;
        head.prev = nn;
        head = nn;
        tail.next = head;
        head.prev = tail;
    }

    /*Delete at end*/
    void deleteEnd(){
        head.prev = tail.prev;
        tail.prev.next = head;
        tail = tail.prev;
    }

    /*Delete at begin*/
    void deleteBeg(){
        head.next.prev = tail;
        tail.next = head.next;
        head = head.next;
    }

    /*Display the Nodes*/
    void display(){
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }while(temp != head);

        System.out.print("null");
    }
}
public class CircularDouble {
    public static void main(String[] args) {
        CircularDoublell s1 = new CircularDoublell();
        s1.insertend(10);
        s1.insertend(20);
        s1.insertBeg(30);
        s1.display();
//        s1.deleteEnd();
        s1.deleteBeg();
        System.out.println();
        s1.display();
    }
}
