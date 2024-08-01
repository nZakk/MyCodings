import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main2 {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(10);

        List<? extends Number> list = integerList;

        Number x = list.get(0);

        //list.add(1);

        List<Object> objectList = new ArrayList<>();
        objectList.add("Maria");
        objectList.add("bob");

        List<? super Number> list1 = objectList;

        objectList.add(10);
        objectList.add(20);

        //Number y = list1.get(3);

        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 5.28);
        List<Object> myObjs = new ArrayList<>();

        copy(myInts, myObjs);
        printList(myObjs);
        copy(myDoubles, myObjs);
        printList(myObjs);

    }

    private static void printList(List<?> list) {
        for(Object obj : list){
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    private static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for(Number number: source){
            destiny.add(number);
        }
    }
}