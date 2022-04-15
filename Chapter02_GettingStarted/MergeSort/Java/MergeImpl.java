import java.util.Arrays;

public class MergeImpl implements Merge {
    private int[] copyOfRange(int[] input, int fromIndex, int toIndex) {
        int[] result = new int[toIndex - fromIndex + 1];
        for (int i = fromIndex; i < toIndex; i++) {
            result[i - fromIndex] = input[i];
        }
        result[result.length - 1] = Integer.MAX_VALUE;
        return result;
    }

    @Override
    public int[] merge(int[] input, int p, int q, int r) {
        int[] left = copyOfRange(input, p, q + 1);
        int[] right = copyOfRange(input, q, r);
        int i = 0;
        int j = 0;
        for (int k = p; k < r; k++) {
            if (left[i] < right[j]) {
                input[k] = left[i];
                i++;
            } else {
                input[k] = right[j];
                j++;
            }
        }
        return input;
    }

    public static void main(String[] args) {
        int[] input = new int[] { 4, 3, 2, 1 };
        Merge mergeAlg = new MergeImpl();
        mergeAlg.merge(input, 0, 1, 2);
        System.out.println(Arrays.toString(input));
    }
}