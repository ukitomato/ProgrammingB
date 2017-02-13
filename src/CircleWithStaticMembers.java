// CircleWithStaticMembers.java
public class CircleWithStaticMembers {
    double radius;
    static int numberOfObjects = 0;

    CircleWithStaticMembers() {
        // Write your code here.
        radius = 1.0;
        numberOfObjects += 1;
    }

    CircleWithStaticMembers(double newRadius) {
        // Write your code here.
        radius = newRadius;
        numberOfObjects += 1;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }
}