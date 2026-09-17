package day_7;
class Play extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            try{
                Thread.sleep(2000);
            }catch (Exception e){}
            System.out.println(i + " ");
        }
    }
}

class Play1 extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i + "i");
        }
    }
}
public class MultiThread {
    public static void main(String[] args) {
       Play s1 = new Play();
       Play1 s2 = new Play1();
       s1.start();
       s2.start();
       if(s1.isAlive()){
           System.out.println("s1 is Alive");
       }else{
           System.out.println("dead");
       }
       try {
            s1.join();
       }catch (Exception e){}
       if(s1.isAlive()){
           System.out.println("s1 is Alive");
           System.out.println(s1.isAlive());
       }else{
           System.out.println("Dead");
       }
        System.out.println("hello");



    }
}
