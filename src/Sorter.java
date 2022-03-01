public class Sorter {
    public static int[] createCopyOfArray (int[] array) {
        int[] copyArray = new int[array.length];
        System.arraycopy(array, 0, copyArray, 0, copyArray.length);
        return copyArray;
    }

    private static void swapElements(int[] array, int firstIndex, int secondIndex) {
        int temp;
        temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
    // Пузырьковая сортировка
    public static void bubbleSort (int[] array) {
        boolean needIteraction = true;
        while (needIteraction) {
            needIteraction = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    needIteraction = true;
                    swapElements(array, i, i - 1);
                }
            }
        }
    }
    // Сортировка выбором
    public static void selectionSort (int[] array) {
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = minInd; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            swapElements(array, left, minInd);
        }
    }
    // Сортировка вставкой
    public static void insertionSort (int[] array) {
        for (int left = 1; left < array.length; left++) {
            int current = array[left];
            int j = left;
            while (j > 0 && array[j - 1] > current) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = current;
        }
    }
    // Сортировка двойной вставкой
    public static void doubleInsertionSort (int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int left = 0;
            int right = i - 1;

            while (left <= right) {
                int mid = left + ((right - left) >> 1);
                if (key < array[mid]) {
                    right = mid - 1;
                } else
                {
                    left = mid + 1;
                }
            }
            int end = i - 1;
            while (end >= left) {
                array[end + 1] = array[end];
                end--;
            }
            array[left] = key;
        }
    }
    // Быстрая сортировка
    public static void quickSort (int[] array, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = array[(leftMarker + rightMarker) / 2];

        do {
            while (array[leftMarker] < pivot) {
                leftMarker++;
            }
            while (array[rightMarker] > pivot) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    swapElements(array, leftMarker, rightMarker);
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            quickSort(array, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(array, leftBorder, rightMarker);
        }
    }
    // Сортировка подсчетом
    public static void countSort (int[] array, int maxValue) {
        int[] count = new int[maxValue + 1];
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                array[index] = i;
                index++;
            }
        }
    }


}
