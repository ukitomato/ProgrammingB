import java.io.*;

public class Intersection {

    public static void compare(int myArrayA[],int myArrayB[]) {
        //一致した値を以下のように置く。
        String match="";
        for (int i = 0; i <myArrayA.length ; i++) {
            for (int k = 0; k <myArrayB.length ; k++) {
            if (myArrayA[i]==myArrayB[k]) {
                match=match+myArrayA[i]+"\n";
            }
            }
        }
        System.out.println("Result:\n"+match);
    }



    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] myArrayA, myArrayB;

        try {
            myArrayA = new int[10];
            System.out.println("myArrayA:");
            for (int i = 0; i < myArrayA.length; i++) {
                String line = br.readLine();
                myArrayA[i] = Integer.parseInt(line);
            }
            myArrayB = new int[10];
            System.out.println("myArrayB:");
            for (int i = 0; i < myArrayB.length; i++) {
                String line = br.readLine();
                myArrayB[i] = Integer.parseInt(line);
            }
            compare(myArrayA,myArrayB);
        } catch (IOException e) {
        }
    }
}
