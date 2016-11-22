import java.io.*;

public class StringSort {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line;
            String[] myArray;
            int i = 0;
            myArray=new String[1000];
            while ((line = reader.readLine()) != null) {
                myArray[i] = line;
                i++;
            }
            insertSort(myArray);
            for (int j=0;myArray[j]!=null;j++) {
                System.out.println(myArray[j]);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public static int findPosAndShift(String[] a,int p,String key) {
        while (p > 0 && key != null && a[p - 1].compareTo(key) > 0) {
            p--;
            a[p + 1] = a[p];
        }
        return p;
    }

    public static void insertSort(String[] a) {
        for (int i = 1; i < a.length; i++) {
            String d = a[i];
            int p = findPosAndShift(a, i, d);
            a[p] = d;
        }
    }
}
