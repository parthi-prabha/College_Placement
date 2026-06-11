package day_6;

public class Transaction {
    public static void main(String[] args) {
        Payment s1 = new Upi();
        s1.upi();
        s1.payment();
        s1.credit();
        s1.payment();
    }
}

abstract class Payment{
    abstract void upi();
    abstract void credit();
    void payment(){
        System.out.println("Payment Successful");
    }
}

class Upi extends Payment{
    @Override
    void upi(){
        System.out.println("Paying using upi");
    }
    @Override
    void credit(){
        System.out.println("Paying using credit card");
    }
}
