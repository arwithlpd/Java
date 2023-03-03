import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo {
    public static void show() {
        FileReader render = null;
        // try catch block
        try {
            render = new FileReader("file.txt");
            var value = render.read();

            new SimpleDateFormat().parse("01/01/2020");
        } catch (IOException e) {
            System.out.println("Could not read data.");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        finally {
            if (render != null) {
                try {
                    render.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
