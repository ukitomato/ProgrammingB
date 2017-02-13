// TotalArea.java
public class TotalArea {
    public static void main(String[] args) {
        CircleWithPrivateDataFields[] circleArray;
        circleArray = createCircleArray();
        printCircleArray(circleArray);
    }

    public static CircleWithPrivateDataFields[] createCircleArray() {
        CircleWithPrivateDataFields[] circleArray =
                new CircleWithPrivateDataFields[10];

        for (int i = 0; i < circleArray.length /* Write your code here */; i++) {
            circleArray[i] = new CircleWithPrivateDataFields(i);
        }

        return circleArray;
    }

    public static void printCircleArray(CircleWithPrivateDataFields[] circleArray) {
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for (int i = 0; i < circleArray.length; i++) {
            System.out.printf("%-30s%-15s\n", circleArray[i].getRadius(),
                    circleArray[i].getArea());
        }

        System.out.println("========================================");

        System.out.printf("%-30s%-15s\n", "The total area of circles is", sum(circleArray));
    }

    public static double sum(CircleWithPrivateDataFields[] circleArray) {
        double sum = 0;
        for (int i = 0; i < circleArray.length; i++) {
            sum += circleArray[i].getArea()/* Write your code here */;
        }

        return sum;
    }
}

