import java.io.*;

public class Factor {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("整数を入力してください。");
            String str = reader.readLine();
            System.out.print(str + "=");
            int num=Integer.parseInt(str);
            for(int i=2;i<num;i++) {
                int count=0;
                boolean check1=true;
                //iの素数判定
                for(int k=2;k<i;k++) {
                    if (i % k == 0) {
                        check1=false;
                        //iが素数じゃない
                        break;
                    }
                }
                if (check1) {
                    while(num % i == 0) {
                        num /= i;
                        count+=1;
                    }
                    if (count > 0) {
                        System.out.print(i+"^"+count+"*");
                    }
                }
            }
            if (num != 1) {
                System.out.print(num+"^"+1);
            }
        } catch (IOException e) {

        }
    }
}