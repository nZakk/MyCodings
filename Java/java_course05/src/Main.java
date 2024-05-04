import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int tempNum = sc.nextInt();

        while (tempNum != 0) {
            tempNum = sc.nextInt();
            total += tempNum;
        }

        System.out.print(total);

        sc.close();
    }
}