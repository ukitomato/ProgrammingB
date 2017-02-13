public class Rectangle1 {
    int width;
    int height;

    Rectangle1() {
        setSize(10, 20);
    }

    void setSize(int w, int h) {
        width = w;
        height = h;
    }

    int getArea() {
        return width * height;
    }

    boolean areSame(Rectangle1 a) {
        if (a == null || this == null) {
            return false;
        }
        else if (a.width == this.width && a.height == this.height) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Rectangle1 r1 = new Rectangle1();
        Rectangle1 r2 = new Rectangle1();
        System.out.println(r1.areSame(r2));
    }
}