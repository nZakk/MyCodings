import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many pearson will be inserted? ");
        int numOfPearson = sc.nextInt();

        Pearson[] vectPearson = new Pearson[numOfPearson];

        for(int curr = 0; curr < vectPearson.length; curr++) {

            System.out.printf("%da pearson height: ",curr + 1);
            double height = sc.nextDouble();
            sc.nextLine();

            System.out.printf("%da pearson gender: ",curr + 1);
            String gender = sc.nextLine();

            vectPearson[curr] = new Pearson(gender, height);
        }


        int smallestId = 0;
        for(int curr = 0; curr < vectPearson.length; curr++) {

            if (vectPearson[smallestId].height > vectPearson[curr].height){
                smallestId = curr;
            }
        }

        int highestId = 0;
        for(int curr = 0; curr < vectPearson.length; curr++) {

            if (vectPearson[highestId].height < vectPearson[curr].height){
                highestId = curr;
            }
        }

        double sum = 0;
        int numOfFemale = 0;
        for (Pearson value : vectPearson) {
            if (value.gender.equalsIgnoreCase("f")) {
                sum += value.height;
                numOfFemale++;
            }
        }
        double avgFemaleHeight = sum / numOfFemale;

        int numOfMen = 0;
        for (Pearson pearson : vectPearson) {
            if (pearson.gender.equalsIgnoreCase("m")) {
                numOfMen++;
            }
        }

        System.out.printf("%nHighest: %.2f%n", vectPearson[smallestId].height);
        System.out.printf("Smallest: %.2f%n", vectPearson[highestId].height);
        System.out.printf("Average female height: %.2f%n", avgFemaleHeight);
        System.out.printf("Mens count: %d%n", numOfMen);

        sc.close();
    }
}