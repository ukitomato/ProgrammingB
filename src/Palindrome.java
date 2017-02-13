import java.io.*;

public class Palindrome {
    static boolean check(String string) {
        if (string.length() == 1) {
            return true;
        } else {
            boolean result = true;
            for (int i = 0; i < string.length() / 2; i++) {
                if (string.charAt(i) != string.charAt(string.length()-i-1)) {
                    result = false;
                }
            }
            return result;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a string: ");
        String line = bufferedReader.readLine();
        if (check(line)) System.out.println(line + " is a palindrome");
        else System.out.println(line + " is not a palindrome");
    }
}
