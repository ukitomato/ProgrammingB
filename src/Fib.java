import java.io.*;

public class Fib {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = reader.readLine();
            int num = Integer.parseInt(str);
            System.out.println(num+"のフィボナッチ数は"+plus(num)+"です.");

        } catch (IOException e) {
        }
    }
    public static int plus(int n) {
        if (n == 0) {

            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return plus(n-1)+plus(n-2);
        }

    }

}