

def insertion_sort(target: list) -> list:
    for i in range(1, len(target)):
        key = target[i]
        j = i - 1
        while j > -1 and target[j] > key:
            target[j + 1] = target[j]
            j = j - 1
        target[j + 1] = key
    return target

if __name__ == '__main__':
    print(insertion_sort([1, 2, 3, 4]))
    print(insertion_sort([4, 3, 2, 1]))
