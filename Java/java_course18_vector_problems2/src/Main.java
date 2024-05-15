import entities.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many persons will you input? ");
        int numOfPerson = sc.nextInt();

        Person[] vectPerson = new Person[numOfPerson];

        for(int curr = 0; curr < vectPerson.length; curr++){
            System.out.printf("%da person data: %n",curr + 1);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();

            vectPerson[curr] = new Person(name, age);
        }

        int older = 0;
        for(int curr = 0; curr < vectPerson.length; curr++){

            if (vectPerson[curr].age > vectPerson[older].age){
               older = curr;
            }
        }

        System.out.printf("Oldest person: %s%n", vectPerson[older].name);

        sc.close();
    }
}