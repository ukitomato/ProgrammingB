class Car3 {
    private int id;
    private double gas;

    Car3() {
        id = 0;
        gas = 0.0;
    }

    void show() {
        System.out.println("id: " + id);
        System.out.println("gas: " + gas);
    }

    Car3(int id, double gas) {
        this.id = id;
        this.gas = gas;
    }
}

class Quiz3 {
    public static void main(String[] args) {
        Car3 car1 = new Car3();
        car1.show();
        Car3 car2 = new Car3(1, 10.0);
        car2.show();
    }
}
