// Join.java
import java.io.*;
import java.util.*;

public class Join {
    public static void main(String[] args) throws IOException {
        int value, count = 0;

        DataInputStream disR = new DataInputStream(new FileInputStream("R"));
        DataInputStream disS = new DataInputStream(new FileInputStream("S"));
        List<Integer> listR = new LinkedList<Integer>();
        // Declare listS
        List<Integer> listS = new LinkedList<Integer>();

        while (disR.available() > 0) {
            value = disR.readInt();
            // Add new data to listR
            listR.add(value);
        }
        // Read data from S and add them to listS
        while (disS.available() > 0) {
            value = disS.readInt();
            // Add new data to listS
            listS.add(value);
        }

        disR.close();
        // close disS
        disS.close();

        for (Iterator<Integer> iterR = listR.iterator();
        iterR.hasNext();) {
            int rval = iterR.next();
            // Increment the counter
            // if iterS matches iterR
            for(Iterator<Integer> iterS = listS.iterator();iterS.hasNext();) {
                int sval = iterS.next();
                if (rval == sval) {
                    count++;
                }
            }
        }
        System.out.println("Number of Matches: " + count);
    }
}