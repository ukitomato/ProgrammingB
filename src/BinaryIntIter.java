
import java.io.*;

public class BinaryIntIter
{
    public static int binarySearch(int[] a, int left, int right, int x) {
        boolean get=true;
        int match=-1;
        while (get) {
            if (left == right) {
                get=false;
                match = left;
            }else if (left > right) {// 区間「left以上right未満」は空
                get=false;
                return -1;
            } else {
                int mid = (left + right) / 2;
                if (a[mid] == x) {
                    get=false;
                    match= mid;
                } else if (a[mid] > x) {
                    right=mid;
                } else {
                    left=mid + 1;
                }
            }

        }
        return match;
    }

    public static void main(String args[]) {
        int[] myArray;

        myArray = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;

        try {
            System.out.print("Input " + myArray.length + " data: ");
            for (int i = 0; i < myArray.length; i++) {
                line = reader.readLine();
                myArray[i] = Integer.parseInt(line);
            }
            System.out.print("Input key: ");
            line = reader.readLine();
            int key = Integer.parseInt(line);

            int p; // position
            p = binarySearch(myArray, 0, myArray.length, key); // -1は無いのが正しい．
            if (p == -1) {
                System.out.println("Not Found");
            }
            else {
                System.out.println("Found at myArray[" + p + "] " + myArray[p]);
            }
        } catch (IOException e) {
        }
    }
}