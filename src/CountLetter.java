import java.io.*;

public class CountLetter {
    public static int [] arrayMake(String string) {
        String stringsmall = string.toLowerCase();
        int counts[] = new int[26];
        for (int i = 0; i < stringsmall.length(); i++) {
            if (Character.isLetter(stringsmall.charAt(i))) {
                counts[stringsmall.charAt(i) - 'a'] += 1;
            }
        }
        return counts;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a string: ");
        String line = bufferedReader.readLine();
        int count[] = arrayMake(line);
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                System.out.println((char) ('a' + i) + " appear " + count[i] + ((count[i] == 1) ? " time" : " times"));
            }
        }
    }
}