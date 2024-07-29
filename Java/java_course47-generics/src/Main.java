import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();

        System.out.print("How many values: ");
        int amount = sc.nextInt();

        for(int i = 0; i < amount; i++){
            int value = sc.nextInt();
            ps.addValeu(value);
        }

        ps.print();
        System.out.println("First: " + ps.first());

        sc.close();
    }
}