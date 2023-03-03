public class Main {
    public static void main(String[] args) {
        try {
            ExceptionDemo.sayHello(null);
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception");
        }

    }
}