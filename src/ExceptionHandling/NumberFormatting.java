package ExceptionHandling;

public class NumberFormatting {
    public static void main(String[] args) {
        try{
            System.out.println(Integer.parseInt("123"));
//            System.out.printf("Hi " + .2f);
            System.out.println(("hi"));
//            System.out.println(Integer.parseInt("abc"));
            
        }catch (NumberFormatException e){
            System.out.println("Nigga why u r doing like this");
            System.err.println("hehehehhee");
        }
    }
}
