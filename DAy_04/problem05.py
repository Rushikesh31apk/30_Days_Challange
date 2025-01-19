def quickSort(a):
    if len(a) > 1:
        pivot = a[len(a) // 2]
        left = [x for x in a if x < pivot]
        middle = [x for x in a if x == pivot]
        right = [x for x in a if x > pivot]
        return quickSort(left) + middle + quickSort(right)
    return a

a = [54, 3, 12, 52, 32, 19, 2, 23]
print(quickSort(a))
