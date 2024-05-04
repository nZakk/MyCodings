import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type four number: ");

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();

        double total = ((double)n1 * n2) - ((double)n3 * n4);

        System.out.println("Total = " + total);


        scanner.close();
    }
}