import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class Main {
    public static final int arraySize = 100000;
    public static final int arrayMaxValue = 10;

    public static void main(String[] args) {
        int[] arrayToSort = generateArray(arraySize);
        Instant start;
        Instant end;
        int[] array = Sorter.createCopyOfArray(arrayToSort);
        start = Instant.now();
        Sorter.quickSort(array, 0, array.length - 1);
        end = Instant.now();
        System.out.println("Быстрая сортировка: " + Duration.between(start, end).toMillis() + " мс");

        array = Sorter.createCopyOfArray(arrayToSort);
        start = Instant.now();
        Sorter.bubbleSort(array);
        end = Instant.now();
        System.out.println("Сортировка пузырьком: " + Duration.between(start, end).toMillis() + " мс");

        array = Sorter.createCopyOfArray(arrayToSort);
        start = Instant.now();
        Sorter.selectionSort(array);
        end = Instant.now();
        System.out.println("Сортировка вставкой: " + Duration.between(start, end).toMillis() + " мс");

        array = Sorter.createCopyOfArray(arrayToSort);
        start = Instant.now();
        Sorter.doubleInsertionSort(array);
        end = Instant.now();
        System.out.println("Сортировка двойной вставкой: " + Duration.between(start, end).toMillis() + " мс");

        array = Sorter.createCopyOfArray(arrayToSort);
        start = Instant.now();
        Sorter.countSort(array, arrayMaxValue);
        end = Instant.now();
        System.out.println("Сортировка подсчетом: " + Duration.between(start, end).toMillis() + " мс");

    }

    public static int[] generateArray (int length) {
        int[] result = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            result[i] = random.nextInt(arrayMaxValue);
        }
        return result;
    }


}
