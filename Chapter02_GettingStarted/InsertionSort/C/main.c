#include <stdio.h>

void insertionSort( int target[], int len ) {
    for ( int i = 1; i < len; i++ ) {
        int key = target[ i ];
        int j = i - 1;
        while ( j > -1 && target[ j ] > key ) {
            target[ j + 1] = target[ j ];
            j = j - 1;
        }
        target[ j + 1 ] = key;
    }
}

void printArray( int target[], int len ) {
    printf( "[" );
    for ( int i = 0; i < len - 1; i++ ) {
        printf( "%d, ", target[ i ] );
    }
    printf( "%d]\n", target[ len - 1 ] );
}

int main(int argc, char* argv[]) {
    int allSorted[] = { 1, 2, 3, 4 };
    insertionSort( allSorted, 4 );
    printArray( allSorted, 4 );
    int allInverse[] = { 4, 3, 2, 1 };
    insertionSort( allInverse, 4 );
    printArray( allInverse, 4 );
    return 0;
}