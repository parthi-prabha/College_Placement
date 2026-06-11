package day_5;

public class Hierarchy {
    public static void main(String[] args) {
        Child2 s = new Child2();
        Child1 s1 = new Child1();
        s.dis();
        s1.display();
        s.display1();
        s1.dis();
    }
}

class Parent1{
    void dis(){
        System.out.println("Parent executed");
    }
}
class Child1 extends Parent1{
    void display(){
        System.out.println("Child 1 executed");
    }

}
class Child2 extends Parent1{
    void display1(){
        System.out.println("Child 2 executed");
    }
}
