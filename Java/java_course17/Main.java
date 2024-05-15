
package Java.java_course17;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfHeights = scanner.nextInt();
        double average = avgHeight(numOfHeights);

        System.out.printf("AVERAGE HEIGHT: %.2f%n",average);
        scanner.close();
    }

    static Double avgHeight(int numOfHeights) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        double[] avgHeight = new double[numOfHeights];
        for(int i = 0; i < numOfHeights; i++){
            avgHeight[i] = scanner.nextDouble();
            total += avgHeight[i];
        }

        scanner.close();
        return total / numOfHeights;
    }
}