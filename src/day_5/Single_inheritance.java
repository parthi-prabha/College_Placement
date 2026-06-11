package day_5;

public class Single_inheritance {
    public static void main(String[] args) {
        Play2 s = new Play2();
        s.display();
        s.display2();
    }
}

class Play{
    void display(){
        System.out.println("Play executed");
    }
}

class Play2 extends Play{
    void display2(){
        System.out.println("Play2 executed");
    }
}