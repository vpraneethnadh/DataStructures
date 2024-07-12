import java.util.Arrays;

public class Merge_Sort {

    public static void merge(int[] array, int[] new_array_1, int[] new_array_2, int left, int right) {
        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            if (new_array_1[i] <= new_array_2[j]) {
                array[k++] = new_array_1[i++];
            } else {
                array[k++] = new_array_2[j++];
            }
        }

        while (i < left) {
            array[k++] = new_array_1[i++];
        }

        while (j < right) {
            array[k++] = new_array_2[j++];
        }
    }

    public static void mergeSort(int[] array, int length) {
        if (length < 2) {
            return;
        }

        int middle = length / 2;
        int[] new_array_1 = new int[middle];
        int[] new_array_2 = new int[length - middle];

        for (int i = 0; i < middle; i++) {
            new_array_1[i] = array[i];
        }

        for (int i = middle; i < length; i++) {
            new_array_2[i - middle] = array[i];
        }

        mergeSort(new_array_1, middle);
        mergeSort(new_array_2, length - middle);

        merge(array, new_array_1, new_array_2, middle, length - middle);
    }

    public static void main(String[] args) {
        int[] testScores = {6, 9, 8, 2, 4, 1};
        int size = testScores.length;

        System.out.println("Original Array " + Arrays.toString(testScores) + "\n");

        mergeSort(testScores, size);

        System.out.println("After Merge Sort " + Arrays.toString(testScores) + "\n");
    }
}
