public class Main {
    public static void main(String[] args) {

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.println("SquareRoot of " + x + " = " + A);
        System.out.println("SquareRoot of " + y + " = " + B);
        System.out.println("SquareRoot of 25 = " + C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);

        System.out.println(x + " power " + y + " = " + A);
        System.out.println(x + " power 2 = " + B);
        System.out.println("5 power 2 = " + C);

        A = Math.abs(y);
        B = Math.abs(z);

        System.out.println("The absolute value of " + y + " = " + A);
        System.out.println("The absolute value of " + z + " = " + B);
    }
}