import java.io.*;

public class CharInBoth {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line1 = reader.readLine();
            String line2 = reader.readLine();
            //見つけた文字を変数alphabetに代入
            char alphabet =0;
            boolean found = false;
            for (int i = 0; i < line1.length(); i++) {
                for(int k=0;k<line2.length();k++) {
                    if (line1.charAt(i) == line2.charAt(k)) {
                        found = true;
                        alphabet = line1.charAt(i);
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }

            if (found) {
                System.out.println(alphabet+"が見つかりました．");
            } else {
                System.out.println("同じ文字が見つかりませんでした．");
            }
        } catch (IOException e) {
        }
    }
}