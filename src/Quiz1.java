class Car {
    private int id;
    private double gas;


    void show(){
        System.out.println("id: " + id);
        System.out.println("gas: " + gas);
    }

    void set(int id, double gas) {
        this.id = id;
        this.gas = gas;
    }
}

class Quiz1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.set(1, 10.0);
        car1.show();
    }
}
