import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberReader {
    /**
     * Reads the user number from the keyboard
     * @return the input number
     */
    public int read() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int result;

        while (true) {
            try {
                System.out.println("Please, enter the number:");
                result = Integer.parseInt(reader.readLine());
                return result;
            } catch (IOException ioe) {
                System.out.println("Reading error");
            }
            catch (NumberFormatException nfe) {
                System.out.println("Input value is not a number");
            }
        }
    }
}
