public class Parabola {
    public static void main(String[] args) {
        for (int k = 8; k >= -8; k = k - 1) {
            printGraph(sq(k));
            }
    }
    public static void printGraph(int x) {
        for (int i = 0; i < x; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    public static int sq(int n) {
        return n*n;
    }
}
