import com.sun.tools.javac.comp.Check;

import java.io.*;

public class CharIntersection {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line1 = reader.readLine();
            String line2 = reader.readLine();
            //見つけた文字を変数alphabetに代入
            System.out.print("両方に含まれている文字は「");
            boolean found = false;
            String stock="";
            for (int i = 0; i < line1.length(); i++) {
                char alphabet =0;
                for(int k=0;k<line2.length();k++) {
                    if (line1.charAt(i) == line2.charAt(k)) {
                        found = true;
                        alphabet = line1.charAt(i);
                        break;
                    }
                }
                if (found) {
                    boolean check =true;
                    for(int k=0;k<stock.length();k++) {
                        if(alphabet==stock.charAt(k)) {
                            check=false;
                            break;
                        }
                    }
                    if (check) {
                        stock=stock+alphabet;
                    }

                }
            }
            System.out.println(stock+"」です。");
        } catch (IOException e) {
        }
    }
}