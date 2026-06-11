package ExceptionHandling;

public class EXception {
    public static void main(String[] args) {
        try{
//            System.out.println(10/0000);
            String s = null;
            System.out.println(s.length());
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

