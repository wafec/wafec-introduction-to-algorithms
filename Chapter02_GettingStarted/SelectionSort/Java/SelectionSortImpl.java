import java.util.Arrays;

public class SelectionSortImpl implements SelectionSort {
    @Override
    public int[] sort(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[minIndex]) {
                    minIndex = j;
                }
            }
            int aux = input[minIndex];
            input[minIndex] = input[i];
            input[i] = aux;
        }
        return input;
    }

    public static void main(String[] args) {
        int[] input = new int[] { 4, 3, 2, 1 };
        SelectionSort alg = new SelectionSortImpl();
        alg.sort(input);
        System.out.println(Arrays.toString(input));
    }
}