package day_5;

public class Overloading {

    public static void main(String[] args) {
//        XX ob = new XX();
//        float a = ob.display(3.0f,3.0f);
        // when passing the float value put 'f' along with the digit becuz java see as double even when you give flaot value

//       new Max(2, 3);
//       new Max(2,3.2);
//       new Max(2, 8, 7);

        Reverse ob = new Reverse(1018);
        System.out.println(ob.reverse("hello"));
    }
}

class XX{
    void display(int a, int b){
        System.out.println(a + b);
    }

    float display(float a, float b){
        return a + b;
    }
    void display(int a, int b, int c){
        System.out.println(a + b);
    }
    void display(int a, int b, String c){
        System.out.println((a + b) + " " + c);
    }
}

class Max{
    Max(int a, int b){
        if(a > b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
    Max(int a, int b, int c){
        if(a > b && a > c){
            System.out.println(a);
        } else if (b > c) {
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
    Max(double a, double b){
        if(a > b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}

class Reverse{
    String reverse(String s){
        StringBuffer name = new StringBuffer(s);
        return name.reverse().toString();

    }

    public Reverse() {
    }

    Reverse(int num){
        int rev = 0;
        while (num > 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println(rev);
    }
}