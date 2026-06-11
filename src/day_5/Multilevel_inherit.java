package day_5;

public class Multilevel_inherit {
    public static void main(String[] args) {
//        Child s1 = new Child();
//        s1.diplay2();
//        s1.display1();
//        s1.display();

//        Maths s = new Maths();
//        System.out.println(s.a);
//        System.out.println(s.add());
//        s.a = 100;
//        System.out.println(s.a);
//        System.out.println(s.add());
//        System.out.println(s.b);
//        s.b = s.sub();
//        System.out.println(s.b);

//        Play4 s = new Play4();
//        s.display();

        Play7 s = new Play7("hello");
        s.display();
    }
}
// Example for multiple inheritance
class Child extends Parent{
    void diplay2(){
        System.out.println("child class executed");
    }
}
class Parent extends Grandparent{
    void display1(){
        System.out.println("Parent class executed");
    }
}
class Grandparent{
    void display(){
        System.out.println("Grandparent class executed");
    }
}

// example for variable
class Variables{
    int a = 10 , b = 2;
}
class Maths extends Variables{
    int a = 1000;

    int add(){
        System.out.println(a);
        System.out.println(super.a);
        return super.a + b;
    }

    int sub(){
        return a - b;
    }
}

// example for method using super
class Play3{
    void print(){
        System.out.println("Parent method");
    }
}
class Play4 extends Play3{
    void print(){
        System.out.println("Child method");
    }

    void display(){
        super.print();
        print();
    }
}

// example for calling the parent class constructor using super() and value passing
class Play5{
    String name;
    Play5(String name){
        this.name = name;
        System.out.println("Play5 constructor executed");

//        void add(){
//            System.out.println(10 + 2);
//        }                                       this method gives me wrong
    }
}
class Play6 extends Play5{
    Play6(String name){
        super(name);
        System.out.println("Play6 constructor executed");
    }
}
class Play7 extends Play6{
    Play7(String name){
        super(name);

    }
    void display(){
//        System.out.println(name);
        System.out.println(name + " play7 executed");
    }
}

