import java.io.*;

public class Palindrome1 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = reader.readLine();
            boolean check = false;
            for (int i = 0; i < line.length()/2; i++) {
                int k = line.length()-i;
                if (line.charAt(i) == line.charAt(k - 1)) {
                    check = true;
                } else {
                    break;
                }
            }

            if (check) {
                System.out.println("'"+line+"'"+"は回文です．");
            } else {
                System.out.println("'"+line+"'"+"は回文ではありません．");
            }
        } catch (IOException e) {
        }
    }
}
