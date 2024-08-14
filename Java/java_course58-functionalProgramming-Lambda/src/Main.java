import java.util.Arrays;

public class Main {
//Transparent function : class who the output is predictable, has the same output for the same input
    //This is a non-transparent function because the output change if the external data even with same input

    public static int globalValue = 3;

    public static void main(String[] args) {
        int[] vect = new int[] {3, 4, 5};
        changeOddValues(vect);
        System.out.println(Arrays.toString(vect));
    }
    public static void changeOddValues(int[] numbers){
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 != 0){
                numbers[i] += globalValue;
            }
        }
    }
}