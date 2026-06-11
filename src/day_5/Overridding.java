package day_5;

public class Overridding {
    public static void main(String[] args) {
        Son ob = new Son();
        ob.display(2, 3);
    }
}

class Father{
    void display(int a, int b){
        System.out.println("Parent");
    }
}
class Son extends Father{
    void display(int a, int b){
        super.display(a, b);
        System.out.println("Child");
    }
}
