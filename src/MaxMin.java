import java.io.*;

public class MaxMin {

    public static void compare(int myArray[]) {
        //最大値配列,最大値、最小値配列、最小値を以下のように置く。
        int max=0, maxnum=0, min=0, minnum=2147483647;
        for (int i = 0; i <myArray.length ; i++) {
            if (maxnum<myArray[i]) {
                max = i;
                maxnum = myArray[i];
            }
            if (minnum>myArray[i]) {
                min = i;
                minnum = myArray[i];
            }
        }
        System.out.println("myArray["+max+"] "+myArray[max]);
        System.out.println("myArray["+min+"] "+myArray[min]);

    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] myArray;

        try {
            myArray = new int[10];
            System.out.println("Input 10 values");
            for (int i = 0; i < myArray.length; i++) {
                String line = br.readLine();
                myArray[i] = Integer.parseInt(line);
            }
            compare(myArray);
        } catch (IOException e) {
        }
    }
}
