package day_6;

public class Abstract {
    public static void main(String[] args) {
        Krce in = new Krce();
        in.display();
        in.print();
    }
}

abstract class Play{
    abstract void display();
    void print(){
        System.out.println("Concrete method");
    }
}

class Krce extends Play{
    void display(){
        System.out.println("Abstract method");
    }
}
