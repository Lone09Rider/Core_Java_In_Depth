class MyException extends Exception {
    public MyException(String s)
    {
        
    }
}
 
public class App {
    public static void main(String args[])
    {
        try {
            throw new MyException("Fool");
        }
        catch (MyException ex) {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}