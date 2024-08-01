import java.util.Arrays;
import java.util.HashSet;
import  java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Tablet");
        set.add("Notebook");
        set.add("Tv");
        set.add("Tv2");

        set.remove("Tv2");
        set.removeIf(x -> x.length() < 3);


        System.out.println(set.contains("Notebook"));

        for(String p : set){
            System.out.println(p);
        }

        System.out.println();

        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        //Union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //Intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //Difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);
    }
}