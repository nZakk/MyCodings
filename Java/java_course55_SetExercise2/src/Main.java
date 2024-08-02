import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> courseA = new HashSet<>();
        Set<Integer> courseB = new HashSet<>();
        Set<Integer> courseC = new HashSet<>();

        System.out.print("How many students for course A? ");
        int qtdStudents = sc.nextInt();
        for (int i = 0; i < qtdStudents; i++){
            courseA.add(sc.nextInt());
        }

        System.out.print("How many students for course B? ");
        qtdStudents = sc.nextInt();
        for (int i = 0; i < qtdStudents; i++){
            courseB.add(sc.nextInt());
        }

        System.out.print("How many students for course C? ");
        qtdStudents = sc.nextInt();
        for (int i = 0; i < qtdStudents; i++){
            courseC.add(sc.nextInt());
        }

        Set<Integer> students = new HashSet<>();
        students.addAll(courseA);
        students.addAll(courseB);
        students.addAll(courseC);

        System.out.println("Total students: " + students.size());
    }
}