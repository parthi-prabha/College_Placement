package day_6;

public class AccessPr {
    private int a = 10;
    protected void display(){
        System.out.println(a);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
//    public static void main(String[] args) {
//
//    }
}
