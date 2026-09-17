package day_7;

public class Accounting {
    public static void main(String[] args) {
       Account x = new Account();
       Mem1 s1 = new Mem1(x, "Parthiban");
       Mem2 s2 = new Mem2(x, "Rohith");
       s1.start();
       s2.start();
    }
}

class Account{
    int bal = 1000;
    synchronized void withdraw(String name, int amount){
        if(amount <= bal){
            bal -= amount;
            System.out.println(name + " withdrawn amount : " + amount);
            System.out.println("Remaining balance : " + bal);
        }else{
            System.out.println("Amount can't be withdrawn. Insufficient balance");
        }
    }
}

class Mem1 extends Thread{
    Account x;
    String name;
    Mem1(Account x, String name){
        this.x = x;
        this.name = name;
    }

    public void run(){
        x.withdraw(name, 300);
    }
}

class Mem2 extends Thread{
    Account x;
    String name;
    Mem2(Account x, String name){
        this.x = x;
        this.name = name;
    }

    public void run(){
        x.withdraw(name, 700);
    }
}
