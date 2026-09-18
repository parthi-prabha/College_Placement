package CircularLinkedList;

class CircularSinglell{
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head;

    /*Insert the node at the end*/
    void insert(int data){
        Node nn = new Node(data);
        if(head == null){
            head = nn;
            nn.next = head;
            return;
        }
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = nn;
        nn.next = head;
    }

    /*Insert at Beginning*/
    void insertBeg(int data){
        Node nn = new Node(data);
        if(head == null) insert(data);
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = nn;
        nn.next = head;
        head = nn;
    }

    /*Delete at the Begin*/
    void deleteBeg(){
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        head = head.next;
        temp.next = head;
    }

    /*Delete the node at the End*/
    void deleteEnd(){
        Node temp = head;
        while(temp.next.next != head){
            temp = temp.next;
        }
        temp.next = head;
    }

    /*Delete the Node based on value*/
    void deleteVal(int key){
        Node temp = head;
        if(head.data == key){
            deleteBeg();
            return;
        }
        Node find = head;
        while (find.next != head){
            find = find.next;
        }
        while (temp.next != head){
            if(temp.next.data == key && temp.next != find){
                temp.next = temp.next.next;
                return;
            }
            if(temp.next.data == key && temp.next == find){
                temp.next = temp.next.next;
                temp.next = head;
                return;
            }
            temp = temp.next;
        }
    }

    /*Display the node using exit control loop*/
    void display(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }while(temp != head);
        System.out.print("Null");
    }
}

public class Circular {
    public static void main(String[] args) {
        CircularSinglell s1 = new CircularSinglell();
        s1.insert(10);
        s1.insert(20);
        s1.insert(30);
        s1.insert(40);
        s1.display();
        System.out.println();
        s1.display();
    }
}
