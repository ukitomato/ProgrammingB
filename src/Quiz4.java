class Car4 {
    private static int sumCar;
    private int id;
    private double gas;

    Car4() {
        id = 0;
        gas = 0.0;
        sumCar += 1;
    }

    public static void showSumCar()
    {
        System.out.println("SumCar: " + sumCar);
    }
}

class Quiz4 {
    public static void main(String[] args) {
        int max = 100;
        Car4[] cars = new Car4[max];
        for (int i = 0; i < max; i++) {
            cars[i] = new Car4();
        }
        Car4.showSumCar();
    }
}
