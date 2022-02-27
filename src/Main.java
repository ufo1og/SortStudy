import java.util.Arrays;

public class Main {
    public static final int[] arrayToSort = {18, 6, 3, 13, 99, 123, 12, 95, 64, 42, 55, 17, 36};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayToSort));
        System.out.println(Arrays.toString(Sorter.bubbleSort(arrayToSort)));
        System.out.println(Arrays.toString(arrayToSort));
        System.out.println(Arrays.toString(Sorter.selectionSort(arrayToSort)));

    }

}
