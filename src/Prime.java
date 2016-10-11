import java.io.*;

public class Prime {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("整数を入力してください。");
            String str = reader.readLine();
            boolean check=true;
            int num = Integer.parseInt(str);
            if (num % 2 == 0) {
                check=true;
            } else {
                for(int i=3;i<num;i+=2) {
                    if (num % i == 0) {
                        check = false;
                        break;
                    }
                }
            }
            if (check) {
                System.out.println(num + "は素数です。");
            } else {
                System.out.println(num+"は素数ではありません");
            }
        } catch (IOException e) {

        }
    }
}