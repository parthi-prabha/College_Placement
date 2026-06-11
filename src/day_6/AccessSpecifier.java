package day_6;

public class AccessSpecifier {
    public static void main(String[] args) {
        AccessPrivate in = new AccessPrivate();
//        in.display();

        System.out.println(in.getA());
        in.setA(12);
        System.out.println(in.getA());
    }
}

class AccessPrivate {
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
}

