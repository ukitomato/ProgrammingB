import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Binary {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = reader.readLine();
            int num = Integer.parseInt(line);
            printBinary(num);
        } catch (IOException e) {
    }
    }
    public static void printBinary(int n) {
        if (n != 0) {
            printBinary(n/2);
            System.out.print(n % 2);


        }
    }

}


