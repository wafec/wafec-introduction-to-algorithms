import java.util.Arrays;


public class InsertionSortReverseImpl implements InsertionSortReverse {
    @Override
    public int[] sort(int[] input) {
        for (int j = 0; j < input.length; j++) {
            int key = input[j];
            int i = j - 1;
            while (i >= 0 && key > input[i]) {
                input[i + 1] = input[i];
                i--;
            }
            input[i + 1] = key;
        }

        return input;
    }

    public static void main(String[] args) {
        int[] worstCase = new int[] { 1, 2, 3, 4 };
        int[] bestCase = new int[] { 4, 3, 2, 1 };

        InsertionSortReverse alg = new InsertionSortReverseImpl();

        alg.sort(worstCase);
        alg.sort(bestCase);

        System.out.println(Arrays.toString(worstCase));
        System.out.println(Arrays.toString(bestCase));
    }
}