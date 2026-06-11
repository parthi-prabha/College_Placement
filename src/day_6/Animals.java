package day_6;

public class Animals {
    public static void main(String[] args) {
        Animal s1 = new Cat();
        s1.eat();
        s1.sound();
        Dog s2 = new Dog();
        s2.eat();
        s2.sound();
    }
}

abstract class Animal{
    abstract void sound();
    void eat(){
        System.out.println("Animal Eating");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Cat sound");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
