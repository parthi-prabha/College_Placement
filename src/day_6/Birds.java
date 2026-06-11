package day_6;

public class Birds {
    public static void main(String[] args) {
        Bird s1 = new Fly();
        s1.speed("High");
        s1.eat();
    }
}

abstract class Bird{
    abstract void speed(String name);
    void eat(){
        System.out.println("Bird eating");
    }
}

class Fly extends Bird{
    void speed(String name){
        System.out.println("Flying : " + name);
    }
}