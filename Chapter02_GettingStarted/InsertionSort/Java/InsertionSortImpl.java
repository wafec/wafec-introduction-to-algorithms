import java.util.Arrays;


public class InsertionSortImpl implements InsertionSort {
    @Override
    public Integer[] sort(Integer[] input) {
        for( int j = 1; j < input.length; j++ ) {
            int i = j - 1;
            Integer key = input[ j ];

            while ( i >= 0 && key < input[ i ] ) {
                input[ i + 1 ] = input[ i ];
                i--;
            }
            input[ i + 1 ] = key;
        }
        return input;
    }

    public static void main(String[] args) {
        String[] subArray = Arrays.copyOfRange( args, 0, args.length );
        Integer[] input = new Integer[ subArray.length ];
        for ( int i = 0; i < subArray.length; i++ ) {
            input[ i ] = Integer.valueOf( subArray[ i ] );
        }
        InsertionSort insertionSortAlg = new InsertionSortImpl();

        insertionSortAlg.sort(input);
        System.out.println( Arrays.toString( input ) );
    }
}