import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many values each vector will have? ");
        int numOfValues = scanner.nextInt();

        int[] vectA = new int[numOfValues];
        int[] vectB = new int[numOfValues];
        int[] vectC = new int[numOfValues];

        System.out.println("Vector A values:");

        for (int i = 0; i < numOfValues; i++) {
            vectA[i] = scanner.nextInt();
        }


        System.out.println("Vector B values:");
        for (int i = 0; i < numOfValues; i++) {
            vectB[i] = scanner.nextInt();
        }

        for (int i = 0; i < numOfValues; i++) {
            vectC[i] = vectA[i] + vectB[i];
        }

        System.out.println("Vector C values:");
        for (int i = 0; i < numOfValues; i++) {
            System.out.println(vectC[i]);
        }



        scanner.close();
    }
}