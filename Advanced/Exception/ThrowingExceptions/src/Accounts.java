import java.io.IOException;

public class Accounts {
    public void deposit(float value) throws IOException {
        if (value <= 0)
            throw new IOException();
    }
}
