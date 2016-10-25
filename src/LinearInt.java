import java.io.*;

public class LinearInt {

    public static void Match(int myArray[],int target) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == target) {
                System.out.println("Found["+i+"]: "+myArray[i]);
            }
        }
    }
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int myArray[];

        try {
            myArray = new int[10];
            System.out.print("Input 10 data: ");


            for (int j=0;j<myArray.length;j++) {
                String snum = br.readLine();
                myArray[j] = Integer.parseInt(snum);
            }

            System.out.print("Input key: ");
            String starget = br.readLine();
            int target = Integer.parseInt(starget);

            Match(myArray, target);
        } catch (IOException e) {
        }
    }
}
