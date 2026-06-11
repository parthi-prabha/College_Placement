package day_6;

public class Multiple {
    public static void main(String[] args) {
        Child ob = new Child();
        ob.p1();
        ob.p2();
    }
}

interface Parenet1{
    void p1();
}

interface Parenet2{
    void p2();
}

class Child implements Parenet1, Parenet2{
    public void p1(){
        System.out.println("PArent 1");
    }

    public void p2(){
        System.out.println("Parent 2");
    }
}