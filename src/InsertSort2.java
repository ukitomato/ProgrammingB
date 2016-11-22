import java.io.*;

public class InsertSort2 {
    public static int findPosAndShift(int[] a,int p,int key) {
        while (p > 0 && a[p - 1] > key) {
            p--;
            a[p+1]=a[p];
        }
        return p;
    }

    public static void insertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int d = a[i];
            int p = findPosAndShift(a, i, d);
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

