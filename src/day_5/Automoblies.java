package day_5;

public class Automoblies {
    public static void main(String[] args) {
        Diesel s = new Diesel("Mustang", 35);
        s.dispaly();
        Petrol s1 = new Petrol("Alto", 34);
        s1.display();;
        PetrolBike s2 = new PetrolBike("Hero Honda", 5);
        s2.display();;
        EVBike s3 = new EVBike("Athena", 76);
        s3.display();
    }
}
class Vehicle{
    String name;
    Vehicle(String name){
        this.name = name;
    }
}

class Car extends Vehicle{
    Car(String name){
        super(name);
    }
}

class Bike extends Vehicle{
    Bike(String name){
        super(name);
    }
}

class Diesel extends Car{
    int diesel_quantity;
    Diesel(String name, int diesel_quantity){
        super(name);
        this.diesel_quantity = diesel_quantity;
    }
    void dispaly(){
        System.out.println("Diesel car can cover : " + diesel_quantity * 20);
    }
}

class Petrol extends Car{
    int petrol_quantity;
    Petrol(String name, int petrol_quantity){
        super(name);
        this.petrol_quantity = petrol_quantity;
    }
    void display(){
        System.out.println("Petrol car can cover : " + 18 * petrol_quantity);
    }
}

class PetrolBike extends Bike{
    int petrol_quantity;
    PetrolBike(String name, int petrol_quantity){
        super(name);
        this.petrol_quantity = petrol_quantity;
    }
    void display(){
        System.out.println("Petrol Bike can cover : " + 45 * petrol_quantity);
    }
}

class EVBike extends Bike{
    int charge;
    EVBike(String name, int charge){
        super(name);
        this.charge = charge;
    }
    void display(){
        System.out.println("EV Bike can cover : " + ((40 * charge)/100));
    }
}