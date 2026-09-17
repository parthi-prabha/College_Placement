package SingleLinkedList;

class Singlell{
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    void insert(int data){
        Node nn = new Node(data);
        if(head == null){
            head = nn;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = nn;
    }

    void display(){
        if(head == null){
            System.out.println("List is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
    }

    void findsum(){
        int even = 0, odd = 0;
        Node temp = head;
        while(temp != null){
            if((temp.data & 1) == 1){
                odd += temp.data;
            }else{
                even
                        += temp.data;
            }
            temp = temp.next;
        }
        System.out.println(odd + " " + even);
    }

    void insertBeg(int data){
        Node nn = new Node(data);
        nn.next = head;
        head = nn;
    }

    void insertpos(int data, int pos){
        if(pos == 1){
            insertBeg(data);
        }
        Node nn = new Node(data);
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("pos not valid");
            return;
        }
        nn.next = temp.next;
        temp.next = nn;
    }

    void minmax(){
        int min = head.data, max = head.data;
        Node temp = head;
        while(temp != null){
            if(temp.data > max) max = temp.data;
            if(temp.data < min) min = temp.data;
            temp = temp.next;
        }
        System.out.println(min + " " + max);
    }

    int count(){
        int count = 0;
        Node temp = head;
        if(temp == null){
            System.out.println("list is empty");
            return count;
        }
        while(temp != null){
            temp = temp.next;
            count++;
        }
        System.out.println(count);
        return count;
    }

    boolean search(int val){
        int pos = 1;
        if(head == null) {
            System.out.println("List is empty");
            return false;
        }
        Node temp = head;
        while(temp != null){
            if(temp.data == val) {
                System.out.println("Value at " + pos);
                return true;
            }
            pos++;
            temp = temp.next;
        }
        System.out.println("The value " + val +" is not present");
        return false;
    }

    void insertAfterValue(int data, int pos_val){
        Node temp = head;
        while (temp != null){
            if(temp.data == pos_val) {
                Node nn = new Node(data);
                nn.next = temp.next;
                temp.next = nn;
                return;
            }
            temp = temp.next;
        }
        System.out.println("That value is not present in list");
    }

    void delAtBegin(){
        head = head.next;
    }

    void delAtEnd(){
        Node temp = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        if(head.next == null) {
            head = null;
            return;
        }
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    void deletepos(int pos){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println("Position not found");
            return;
        }
        temp.next = temp.next.next;
    }

    void delval(int key){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        if (head.data == key){
            delAtBegin();
        }
        Node temp = head;
        while(temp.next != null) {
            if(temp.next.data == key){
                temp.next = temp.next.next;;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Value not found");
    }

    void update(int key, int data){
        Node temp = head;
        while(temp != null){
            if(temp.data == key){
                temp.data = data;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Value not found");
    }

    void midelement(){
        int len = count();
        int mid = len / 2 + 1;
        Node temp = head;
        for (int i = 0; i < mid; i++) {
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    /*to reduce the iteration for finding the midpoint the previous method takes more iteration.
    so to reduce that we use slow and fast method to reduce the itreation*/

    void mid(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }

    /*Reverse the Linked list*/
    void reverse(){
        Node prev = null;
        Node current = head;
        while (current != null){
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        head = prev;
        display();
    }

    /*find the position from nth position*/
    void findposHead(int pos){
        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    /*find the position node from the behind*/
    void findposback(int pos){
        Node first = head;
        Node second = head;
        for (int i = 1; i <= pos; i++) {
            first = first.next;
        }
        while(first != null){
            first = first.next;
            second = second.next;
        }
        System.out.println(second.data);
    }

    /*Delete the duplicate in the linked list*/
    void remove_duplicate(){
        Node temp = head;
        while(temp != null && temp.next != null){
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
    }

    /*Check whether the linked list is palindrome or not by creating the second ll then compare it. For that use the Floyd's algo and reversal*/
    boolean palindrome(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node first = head;
        Node second = reversal(slow);
        while(second != null){
            if(first.data != second.data) return false;
            first = first.next;
            second = second.next;
        }
        return true;
    }

    Node reversal(Node cse){
        Node prev = null;
        Node current = cse;
        while (current != null){
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    /*merge of lists*/
    Node merge(Node s1, Node s2){
        Node original = new Node(0);
        Node temp = original;
        while(s1 != null && s2 != null){
            if(s1.data <= s2.data){
                temp.next = s1;
                s1 = s1.next;
            }else {
                temp.next = s2;
                s2 = s2.next;
            }
            temp = temp.next;

        }
        if(s1 != null){
            temp.next = s1;
        }
        if(s2 != null){
            temp.next = s2;
        }

        return original.next;
    }
}



public class Single {
    public static void main(String[] args) {
        Singlell s1 = new Singlell();
        Singlell s2 = new Singlell();
        Singlell s3 = new Singlell();
        s1.insert(18);
        s1.insert(18);
        s1.insert(21);

        s1.display();
        System.out.println();
        s2.insert(1);
        s2.insert(5);
        s2.insert(8);
        s3.head = s1.merge(s1.head, s2.head);

        s3.display();

    }
}


