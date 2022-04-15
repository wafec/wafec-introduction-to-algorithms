#include<stdio.h>

int* selectionSort(int *input, int length)
{
    for (int i = 0; i < length - 1; i++)
    {
        int j = i + 1;
        int minIndex = j - 1;
        while (j < length)
        {
            if (*(input + j) < *(input + minIndex)) 
            {
                minIndex = j;
            }
            j++;
        }
        int aux = *(input + i);
        *(input + i) = *(input + minIndex);
        *(input + minIndex) = aux;
    }
    return input;
}

void printArray(int* input, int length)
{
    printf("[");
    for (int i = 0; i < length - 1; i++)
    {
        printf("%d, ", *(input + i));
    }
    if (length > 0)
        printf("%d]\n", *(input + length - 1));
    else
        printf("]\n");
}

int main(int argv, char* argc[]) 
{
    int worstCase[] = { 4, 3, 2, 1 };

    selectionSort(worstCase, 4);
    printArray(worstCase, 4);

    int bestCase[] = { 1, 2, 3, 4 };

    selectionSort(bestCase, 4);
    printArray(bestCase, 4);

    return 0;
}