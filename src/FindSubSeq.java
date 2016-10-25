import java.io.*;

public class FindSubSeq {
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

            for (int j=0;j<myArray.length;j++) {
                String sq="";
                int count =0;
                int n=j;
                for (int k=0;k<args.length;k++) {
                    sq +=" " + args[k];
                    if (myArray[n] != Integer.parseInt(args[k])) {
                        break;
                    }
                    n++;
                    count++;
                }
                if (count == args.length) {
                    System.out.println("Found at " + j + " Sequence: " + sq);
                }
            }
        } catch (IOException e) {
        }
    }
}
