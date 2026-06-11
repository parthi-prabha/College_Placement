package day_5;

public class ValuePassing {
    public static void main(String[] args) {
//      Name s = new Name(8, "Parthiban", 19);
//      s.display();
        Incentive s = new Incentive(5000,20000,3500);
        s.display();
    }
}

class Name extends Age{
    int id;
    String name;
    Name(int id, String name, int age){
        super(age);
        this.id = id;
        this.name = name;

    }
   void display(){
       System.out.println(id + " " + name + " " + age);
   }
}
class Age{
    int age;
    Age(int age){
        this.age = age;
    }
}

class Salary{
    int salary;
    Salary(int salary){
        this.salary = salary;
    }
}
class Bonus extends Salary{
    int bonus;
    Bonus(int bonus, int salary){
        super(salary);
        this.bonus = bonus;
    }
}
class Incentive extends Bonus{
    int incentive;
    Incentive(int bonus, int salary, int incentive){
        super(bonus, salary);
        this.incentive = incentive;
    }
    void display(){
        System.out.println(bonus + salary + incentive);
    }
}