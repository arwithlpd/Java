import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionDemo {
    public static void show() {

        try (var reader = new FileReader("test.txt");
             var writer = new FileWriter("...");
        ) {
            var value = reader.read();
            System.out.println(value);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Could not read data.");
        }


    }
}
s