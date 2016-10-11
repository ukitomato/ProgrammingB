import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ack {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line1 = reader.readLine();
            String line2 = reader.readLine();

            int m = Integer.parseInt(line1);
            int n = Integer.parseInt(line2);

            System.out.println("ack(" + m + "," + n + ") = " + ack(m, n));
        } catch (IOException e) {
        }
    }

    public static int ack(int m, int n) {
        if (m == 0 || n == 0) {
            if (m > 0) {
                return ack(m - 1, 1);
            } else {
                return n+1;
            }
        } else {
            return ack(m-1,ack(m,n-1));
        }
    }
}