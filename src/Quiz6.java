import sun.tools.tree.SuperExpression;

class Car6 {
    private int id;
    public static int sumCar;

    Car6() {
        sumCar += 1;
    }

    public static void showSumCar()
    {
        System.out.println("sumCar: " + sumCar);
    }
}

class F16 extends Car6 {
    public static int sumF1;

    F16() {
        sumF1 += 1;
    }

    public static void showSumF1()
    {
        System.out.println("sumF1: " + sumF1);
    }
}

class Taxi6 extends Car6 {
    public static int sumTaxi;

    Taxi6() {
        sumTaxi += 1;
    }

    public static void showSumTaxi()
    {
        System.out.println("sumTaxi: " + sumTaxi);
    }
}

class Quiz6 {
    public static void main(String[] args) {
        int ntaxi = 1;
        int nf1 = 3;
        Car6[] cars = new Car6[ntaxi+nf1];

        for (int i = 0; i < nf1; i++) {
            cars[i] = new F16();
        }
        F16.showSumF1();
        for (int i = 0; i < ntaxi; i++) {
            cars[i] = new Taxi6();
        }
        Taxi6.showSumTaxi();

        Car6.showSumCar();
    }
}

