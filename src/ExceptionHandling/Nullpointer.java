package ExceptionHandling;

public class Nullpointer {
    public static void main(String[] args) {
        String s = null;
        try{
//            System.out.println(s.length());
            System.out.println(Integer.parseInt("abc"));
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
            System.out.println(e);
            System.out.println("Initialize the String");
            System.err.println("Initialize the String");
        }
        finally {
            System.out.println("Hello");
        }
    }
}
