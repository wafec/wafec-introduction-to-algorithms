import sys


def selection_sort(input):
    for i in range(len(input) - 1):
        min_index = i
        for j in range(i + 1, len(input)):
            if input[j] < input[min_index]:
                min_index = j
        aux = input[i]
        input[i] = input[min_index]
        input[min_index] = aux
    return input


if __name__ == "__main__":
    input = [int(x) for x in sys.argv[1:]]
    selection_sort(input)
    print(input)