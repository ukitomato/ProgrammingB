import java.io.*;

public class InsertSort1 {
    public static int binarySearch(int[] a, int left, int right, int x) {
        if (left >= right) {   // 区間「left以上right未満」は空
            return left;
        } else {
            int mid = (left + right) / 2;
            if (a[mid] == x) {
                return mid;
            } else if (a[mid] > x) {
                return binarySearch(a, left, mid, x);
            } else {
                return binarySearch(a, mid + 1, right, x);
            }
        }
    }
    public static int findPos(int[] a,int p,int key) {
        return binarySearch(a,0,p,key);
    }
    public static void shiftPos(int[] a, int p, int j) {
        while (j >= p) {
            a[j + 1] = a[j];
            j--;
        }
    }
    public static void insertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int d = a[i];
            int p = findPos(a, i, d);
            shiftPos(a, p, i - 1);
            a[p] = d;
        }
    }
    public static void main(String args[]) {
        int[] myArray;
        int nData = 10;
        if (args.length > 0) {
            nData = Integer.parseInt(args[0]);
        }
        myArray = new int[nData];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        try {
            System.out.println("Input " + myArray.length + " data:");
            for (int i = 0; i < myArray.length; i++) {
                line = reader.readLine();
                myArray[i] = Integer.parseInt(line);
            }
            /* ここでmyArrayをソートする．*/
            insertSort(myArray);
            System.out.println("Result:");
            for (int x : myArray) {
                System.out.println(x);
            }
        } catch (IOException e) {
        }
    }
}
