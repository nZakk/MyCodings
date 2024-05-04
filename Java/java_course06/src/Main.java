import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        String check;

        check = x > y ? "X greater then Y" : "Y greater then X";

        System.out.print(check);
        sc.close();
    }
}