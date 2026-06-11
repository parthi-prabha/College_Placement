package ExceptionHandling;

public class UserException {
    public static void main(String[] args) {
        try{
            age(10);
        }
        catch (UserE e){
            System.out.println(e.getMessage());
        }
    }

    static void age(int a) throws UserE{
        if(a < 18){
            throw new UserE("Under age");
        }
        System.out.println("Valid");
    }
}

class UserE extends Exception{
    UserE(String msg){
        super(msg);
    }
}
