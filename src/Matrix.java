public class Matrix {
    public static void main(String[] args) {
        double[][] a = {{1.0, 2.0}, {3.0, 4.0}};
        double[][] b = {{1.5, 0.0}, {0.0, 1.5}};
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                double ip=0;
                for (int k = 0; k < b.length; k++) {
                    ip += a[i][k] * b[k][j];
                }
                System.out.print("\t"+ip);
            }
            System.out.println("");
        }
    }
}
