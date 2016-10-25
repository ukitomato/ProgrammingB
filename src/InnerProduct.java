public class InnerProduct {
    public static void main(String[] args) {
        try {
            double[][] a = {
                    {1.0, 1.5, 2.0, 2.5},
                    {3.1, 2.1, 1.1, 0.1}
            };
            double product=0;
            for (int i=0;i<a[0].length;i++){
                product+=a[0][i]*a[1][i];
            }
            System.out.println("内積は"+product+"です。");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
