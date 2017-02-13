import java.io.*;

public class ShowAllFile {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("使用法：java ListDir1 ディレクトリ");
            System.out.println("例：java ListDir1 doc");
            System.exit(0);
        }
        String dirname = args[0];
        File dir = new File(dirname);
        File[] dirlist = dir.listFiles();
        try {
            for (int i = 0; i < dirlist.length; i++) {
                System.out.println("File:"+dirlist[i]);
                BufferedReader bufferedReader = new BufferedReader(new FileReader(dirlist[i]));
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }
                bufferedReader.close();
            }
            } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
