package Stack;

class Stacky{
    int arr[];
    int top;
    int size;

    public Stacky(int size) {
        this.size = size;
        top = -1;
        arr = new int[size];
    }

    /*Push the value in the stack*/
    void push(int data){
        if(top == size - 1){
            System.out.println("Stack overflow");
            return;
        }
        arr[++top] = data;
    }

    /*Pop the element from the stack*/
    void pop(){
        if(top == -1){
            System.out.println("Stack underflow");
            return;
        }
        System.out.println("Popped : " + arr[top--]);
    }

    /*Peek Function : returns the top element*/
    void peek(){
        System.out.println("peek element : " + arr[top]);
    }

    /*Display function*/
    void display(){
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
public class StackUseArr {
    public static void main(String[] args) {
        Stacky s1 = new Stacky(5);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.display();
        s1.pop();
        s1.peek();
        s1.display();
    }
}
