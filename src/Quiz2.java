class Car2 {
    private int id;
    private double gas;

    void show() {
        System.out.println("id: " + id);
        System.out.println("gas: " + gas);
    }

    void set(int id) {
        this.id = id;
    }

    void set(double gas) {
        this.gas = gas;
    }

    void set(int id, double gas) {
        this.id = id;
        this.gas = gas;
    }
}

class Quiz2 {
    public static void main(String[] args) {
        Car2 car1 = new Car2();
        car1.set(1, 10.0);
        car1.show();
        car1.set(2);
        car1.show();
        car1.set(20.0);
        car1.show();
    }
}