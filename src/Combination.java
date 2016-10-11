import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Combination {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line1 = reader.readLine();
            String line2 = reader.readLine();

            int m = Integer.parseInt(line1);
            int n = Integer.parseInt(line2);

            System.out.println("comb("+m+","+n+") = " + comb(m,n)) ;
        } catch (IOException e) {
    }
    }
    public static int comb(int m, int n) {
        if (m == n || n == 0) {
            return 1;
        } else {
            return comb(m-1,n-1)+comb(m-1,n);
        }
    }
}
