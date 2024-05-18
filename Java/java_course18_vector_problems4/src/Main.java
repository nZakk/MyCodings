import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Students[] rooms = new Students[10];

        System.out.print("How many rooms will be rented? ");
        int numTenants = sc.nextInt();

        for(int curr = 0; curr < numTenants; curr++){
           System.out.printf("Rent #%d:%n", curr);
           sc.nextLine();

           System.out.print("Name: ");
           String studentName = sc.nextLine();

           System.out.print("Email: ");
           String studentEmail = sc.nextLine();

            System.out.print("Room: ");
            int studentRoom = sc.nextInt();

            rooms[studentRoom] = new Students(studentName, studentEmail);
        }

        System.out.println("Busy rooms");
        for(int curr = 0; curr < rooms.length; curr++) {

            if (rooms[curr] != null) {
                System.out.printf("%d: " + rooms[curr], curr);
            }

        }

        sc.close();
    }
}