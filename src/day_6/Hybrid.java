package day_6;

public class Hybrid {
    public static void main(String[] args) {
        Childe in = new Childe();
        in.grand();
        in.parent1();
        in.parent2();
    }
}

interface GrandParent{
    void grand();
}

interface Parent1 extends GrandParent{
    void parent1();
}

interface Parent2 extends GrandParent{
    void parent2();
}

class Childe implements Parent1, Parent2{
    public void grand(){
        System.out.println("Grandparent");
    }

    public void parent1(){
        System.out.println("Parent1");
    }

    public void parent2(){
        System.out.println("Parent2");
    }
}