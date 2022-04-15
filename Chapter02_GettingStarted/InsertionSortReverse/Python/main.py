import sys


def insertion_sort_reverse(input):
    for j in range(1, len(input)):
        key = input[j]
        i = j - 1
        while i >= 0 and key > input[i]:
            input[i + 1] = input[i]
            i = i - 1
        input[i + 1] = key
    return input


if __name__ == '__main__':
    input = sys.argv[1:]
    if not input:
        input = [4, 3, 2, 1]
    result = insertion_sort_reverse([int(x) for x in input])
    print(result)

