package DoubleLinkedList;

class Doublell{
    class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head;
    Node tail;

    /*insert the node at the end*/
    void insert(int data){
        Node nn = new Node(data);
        if(head == null){
            head = tail = nn;
            return;
        }else{
            tail.next = nn;
            nn.prev = tail;
            tail = nn;
        }
    }

    /*insert the node at the begin*/
    void insertBegin(int data){
        Node nn = new Node(data);
        if(head == null){
            head = tail = nn;
            return;
        }
        nn.next = head;
        head.prev = nn;
        head = nn;
    }

    /*display the list*/
    void display(){
        if(head == null) System.out.println("Empty");
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    /*Displays the list in the reverse order*/
    void displayRev(){
        if(head == null) {
            System.out.println("Empty");
            return;
        }
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.prev;
        }
        System.out.println("Null");
    }

    /*insert at a specific position*/
    void insertpos(int pos, int data){
        Node nn = new Node(data);
        if(head == null) {
            System.out.println("empty");
            return;
        }
        if(pos == 1){
            insertBegin(data);
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        nn.next = temp.next;
        temp.next.prev = nn;
        temp.next = nn;
        nn.prev = temp;
    }

    /*insert after the specific number*/
    void insertAfter(int key, int val){
        Node temp = head;
        Node nn = new Node(val);
        while(temp != null){
            if(temp == tail){
                temp.next = nn;
                nn.prev = temp;
                return;
            }
            if(temp.data == key){
                nn.next = temp.next;
                temp.next.prev = nn;
                temp.next = nn;
                nn.prev = temp;
            }
            temp = temp.next;
        }
    }

    /*insert before the specific number*/
    void insertBefore(int key, int val){
        Node nn = new Node(val);
        Node temp = head;
        while(temp != null){
            if(temp.data == key){
                nn.prev = temp.prev;
                temp.prev.next = nn;
                nn.next = temp;
                temp.prev = nn;
            }
            temp = temp.next;
        }
    }

    /*Delete the node at the beginning */
    void deleteBegin(){
        if(head == null) return;
        head = head.next;
        head.prev = null;
    }

    /*Delete the node at the end*/
    void deleteEnd(){
        if (head == null) return;
        tail = tail.prev;
        tail.next = null;
    }

    /*Delete the node using the data*/
    void deleteVal(int data){
        Node temp = head;
        if(head.data == data){
            deleteBegin();
            return;
        }
        while(temp != null){
            if(temp == tail && temp.data == data){
                temp.prev.next = null;
                tail = temp.prev;
                return;
            }
            if(temp.data == data){
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }

    /*find the nth node from beginning*/
    void findBeg(int pos){
        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    /*find the nth node from end*/
    void findEnd(int pos){
        Node temp = tail;
        for (int i = 1; i < pos; i++) {
            temp = temp.prev;
        }
        System.out.println(temp.data);
    }

    /*Search the node*/
    boolean search(int key){
        Node temp = head;
        while(temp != null){
            if(temp.data == key) return true;
            temp = temp.next;
        }
        return false;
    }

    /*Check for palindrome using two pointer method*/
    boolean palindrome(){
        Node first = head;
        Node last = tail;
        while(first != null && last != null && first != last && first.prev != last){
            if(first.data != last.data) return false;
            first = first.next;
            last = last.prev;
        }
        return true;
    }

    /*Copying the last position from the first position*/
    void findupdate(int pos){
        Node left = head;
        Node right = tail;
        for (int i = 1; i < pos; i++) {
            left = left.next;
            right = right.prev;
        }
        left.data = right.data;
        display();
    }

    /*Sorting the list*/
    void sort(){
        for (Node i = head; i != null ; i = i.next) {
            for (Node j = i.next; j != null; j = j.next){
                if(i.data > j.data){
                    i.data = i.data ^ j.data;
                    j.data = i.data ^ j.data;
                    i.data = i.data ^ j.data;
                }
            }
        }
    }

    /*remove the value*/
    void remove(int data) {
        Node temp = head;
        while(temp != null){
            if(temp.data == data && temp == head){
                head = head.next;
                head.prev = null;
            }
            else if(temp.data == data && temp == tail){
                tail = tail.prev;
                tail.next = null;
            }
            else if(temp.data == data){
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
            temp = temp.next;
        }

    }
}

public class Double {
    public static void main(String[] args) {
        Doublell d1 = new Doublell();
        d1.insert(12);
        d1.insert(23);
        d1.insert(43);
        d1.insert(3);
        d1.insert(12);

        d1.display();
//        System.out.println(d1.palindrome());
        d1.remove(12);
        d1.display();
    }

}
