package day_5;

public class Hybrid {
    public static void main(String[] args) {
        Childe1 s = new Childe1();
        Childe2 s2 = new Childe2();
    }
}
class GrandParent{
    GrandParent(){
        System.out.println("GrandParent executed");
    }
}
class Parent2 extends GrandParent{
    Parent2(){
        super();
        System.out.println("Parent executed");
    }
}
class Childe1 extends Parent2{
    Childe1(){
        super();
        System.out.println("Childe1 executed");
    }
}
class Childe2 extends Parent2{
    Childe2(){
        super();
        System.out.println("Childe2 executed");
    }
}