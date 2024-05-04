import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String x = scanner.next(); scanning a single string
        //int x = scanner.nextInt(); scanning a int number
        //double x = scanner.nextDouble(); scanning a float point number
        //char x = scanner.next().charAt(0); scanning a single char

        String x;
        int y;
        double z;

        x = scanner.next();
        y = scanner.nextInt();
        z = scanner.nextDouble();
        // Scanning multiple types of data at once just separate them with a space at the terminal


        System.out.println("You wrote: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        scanner.close();
    }
}