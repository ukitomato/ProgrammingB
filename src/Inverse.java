import java.io.*;

public class Inverse {

    public static void print(int myArray[]) {
        System.out.println("Result: ");
        for (int i = 9; i >=0 ; i--) {
            System.out.println(myArray[i]);
        }
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
            print(myArray);
        } catch (IOException e) {
        }
    }
}
