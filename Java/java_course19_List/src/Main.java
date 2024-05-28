import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("mario");
        list.add("marcello");
        list.add("joao");
        list.add("joana");
        list.add("jose");
        list.add("juarez");
        list.add("leticia");


        list.add(2, "99");

        list.remove("leticia");
        list.remove(1);
        // if it's a string it can be compared to the elements inside de list just put ""
        //Lambda function to remove through a predicate
        list.removeIf(x -> x.charAt(0) == 'M');

        for ( String curr : list) {

            System.out.println(curr);

        }


        System.out.printf("List size %d%n", list.size());
        System.out.println("--------------------------------------------");
        System.out.printf("Index of 99 : %d%n", list.indexOf("99"));
        System.out.println("--------------------------------------------");
        System.out.println("new filtered list with only J names: ");

        List<String> filteredList = list.stream().filter(x -> x.charAt(0) == 'j').toList();

        for ( String curr : filteredList) {

            System.out.println(curr);

        }
        System.out.println("--------------------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'j').findFirst().orElse(null);
        System.out.println(name);

    }
}