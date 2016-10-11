import java.io.*;

public class NoDoWhile {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line;
            int check=0;
            while (check==0) {
                line = reader.readLine();
                System.out.println("You said: " + line);
                if (line.equals("bye")) {
                    check+=1;
                }
            }
        } catch (IOException e) {
        }
    }
}