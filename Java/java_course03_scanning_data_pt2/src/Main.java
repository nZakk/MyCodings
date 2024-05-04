import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x;
        String s1, s2,s3;

        x = scanner.nextInt();
        scanner.nextLine();
        s1 = scanner.nextLine();
        s2 = scanner.nextLine();
        s3 = scanner.nextLine();

        /*
        * Caution with the break line pending, when other type of .next before a
        * .nextLine() that enter at to scan the data become pending so the next .nextLine()
        * scan that line break ad become an empty string. To resolve that and clean the break line
        * before a .nextLine() simple do a plain .nextLine() before the .nextLane that you need
        * to scan.
        * */

        System.out.println("You wrote: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        scanner.close();
    }
}