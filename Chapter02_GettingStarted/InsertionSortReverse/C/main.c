#include <stdio.h>


int* insertionSortReverse(int* input, int length)
{
    for ( int j = 1; j < length; j++ ) 
    {
        int key = *(input + j);
        int i = j - 1;
        while ( i >= 0 && key > *( input + i ) )
        {
            *( input + i + 1 ) = *( input + i );
            i--;
        }
        *(input + i + 1 ) = key;
    }
    return input;
}

void printArray(int* input, int length)
{
    printf("[ ");
    for ( int i = 0; i < length; i++ )
    {
        printf( "%d ", *( input + i ) );
    }
    printf( "]\n" );
}

int main(int argc, char* argv[])
{
    int worstCase[] = { 1, 2, 3, 4 };
    insertionSortReverse( worstCase, 4 );
    printArray( worstCase, 4 );
    int bestCase[] = { 4, 3, 2, 1 };
    insertionSortReverse( bestCase, 4 );
    printArray( bestCase, 4 );

    return 0;
}