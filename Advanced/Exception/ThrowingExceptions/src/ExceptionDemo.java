import java.io.IOException;

public class ExceptionDemo {
    public static void show() {
        var account = new Accounts();
        try {
            account.deposit(-1);
        } catch (IOException e) {
            System.out.println("Logging");
        }
    }
}
