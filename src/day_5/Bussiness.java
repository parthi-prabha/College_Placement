package day_5;

public class Bussiness {
    public static void main(String[] args) {
       Manager s1 = new Manager("Kim", 8, 66);
       s1.manager();
       Developer s2 = new Developer("Parthiban", 6, 8);
       s2.developer();
       Tester s3 = new Tester("Parthiban", 18, 8);
       s3.tester();
    }
}
class Employee{
    int id;
    String name;
    Employee(String name, int id){
        this.id = id;
        this.name = name;
    }
}

class Manager extends Employee{
    int no_employees;
    Manager(String name, int no_employees, int id){
       super(name, id);
       this.no_employees = no_employees;
    }
    int base_salary = 50000;
    int employee_bonus = 1000;
    void manager(){
        System.out.println("Manager id : "  + id);
        System.out.println("Manager Name : " + name);
        System.out.println("Total Salary : " + (base_salary + (no_employees * employee_bonus)));
        System.out.println();
    }
}

class Developer extends Employee{
    int no_projects;
    Developer(String name, int no_projects, int id){
        super(name, id);
        this.no_projects = no_projects;
    }
    int base_salary = 60000;
    int project_bonus = 3000;
    void developer(){
        System.out.println("Developer id : " + id);
        System.out.println("Developer Name : " + name);
        System.out.println("Total Salary : " + (base_salary + (project_bonus * no_projects)));
        System.out.println();
    }
}

class Tester extends Employee{
    int no_bugs;
    Tester(String name, int no_bugs, int id){
        super(name, id);
        this.no_bugs = no_bugs;
    }
    int base_salary = 70000;
    int bugs_bonus = 5000;
    void tester(){
        System.out.println("Tester id : " + id);
        System.out.println("Developer Name : " + name);
        System.out.println("Total Salary : " + (base_salary + (bugs_bonus * no_bugs)));
        System.out.println();
    }
}