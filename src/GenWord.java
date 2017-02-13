// GenWord.java
import java.util.Random;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class GenWord {
    public static void genWord(int max)
    {
        try{
            File file = new File("strings.txt");
            FileWriter filewriter = new FileWriter(file);

            for (int i = 0; i < max; i++) {
                String str = new String();
                for (int j = 0; j < 8; j++) {
                    Random rnd = new Random();
                    int ran = rnd.nextInt(25);
                    char newChar = 'a';
                    for (int k = 0; k < ran; k++) newChar++;
                    str += newChar;
                }
                //System.out.println(str);
                 filewriter.write(str + "\n");
            }
            filewriter.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args)
    {
        int max = Integer.parseInt(args[0]);
        //System.out.println(max);
        genWord(max);

    }
}