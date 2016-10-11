
public class Square {
    public static int sq(int n) {
        return n*n;
    }
    public static void main(String[] args) {
        for(int i=1;i<=11;i+=2) {
            int k=sq(i);
            System.out.println(i+"の2乗は"+k+"です.");
        }
    }
}
