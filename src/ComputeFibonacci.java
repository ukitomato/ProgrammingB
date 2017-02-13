// ComputeFibonacci.java
import java.util.Scanner;

public class ComputeFibonacci {
    static int fibcount=0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index for a Fibonacci number: ");
        int index = input.nextInt();
        System.out.println("The Fibonacci number at index " + index + " is " + fib(index));
        System.out.println("The number of invocations at index " + index + " is " + fibcount);
    }

    public static long fib(long index) {
        if (index == 0) {
            fibcount++;
            return 0;
        } else if (index == 1) {
            fibcount++;
            return 1;
        } else {
            // Please write your code here
            fibcount++;
            return fib(index - 2) + fib(index - 1);
        }
    }

}