import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type 3 numbers: ");

        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();

        double triangleArea = ((double) 1/2) * n1 * n3;
        double circleArea = 3.14159 * Math.pow(n3, 2);
        double trapezoidArea = (n1 + n2) * n3 / 2;
        double squareArea = Math.pow(n2, 2);
        double rectangleArea = n1 * n2;

        System.out.printf("TRIANGLE: %.3f %n", triangleArea);
        System.out.printf("CIRCLE: %.3f %n", circleArea);
        System.out.printf("TRAPEZOID: %.3f %n", trapezoidArea);
        System.out.printf("SQUARE: %.3f %n", squareArea);
        System.out.printf("RECTANGLE: %.3f %n", rectangleArea);





        scanner.close();
    }
}