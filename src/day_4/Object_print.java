package day_4;

public class Object_print {
    public static void main(String[] args) {
        Object_call ob = new Object_call(29);
        int arr = ob.print();
        System.out.println(arr);
    }
}

class Object_call{
    int x;
    Object_call(int x){
        this.x = x;
    }
    int print(){
        return x;
    }
}
