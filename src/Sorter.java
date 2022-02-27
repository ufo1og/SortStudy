public class Sorter {
    private static int[] createCopyOfArray (int[] array) {
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

    public static int[] bubbleSort (int[] array) {
        int[] result = createCopyOfArray(array);
        int iterations = 0;

        boolean needIteraion = true;
        while (needIteraion) {
            needIteraion = false;
            for (int i = 1; i < result.length; i++) {
                if (result[i] < result[i - 1]) {
                    needIteraion = true;
                    swapElements(result, i, i - 1);
                    iterations++;
                }
            }
        }
        System.out.println(iterations + " iterations");
        return result;
    }

    public static int[] selectionSort (int[] array) {
        int[] result = createCopyOfArray(array);
        int iteractions = 0;
        for (int left = 0; left < result.length; left++) {
            int minInd = left;
            for (int i = minInd; i < result.length; i++) {
                if (result[i] < result[minInd]) {
                    minInd = i;
                }
                iteractions++;
            }
            swapElements(result, left, minInd);
        }
        System.out.println(iteractions + " iterations");
        return result;
    }
}
