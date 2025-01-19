def selectionSort(a,n):
    for i in range(n):
        min_idx = i
        for j in range(i+1,n):
            if a[min_idx] > a[j]:
                min_idx = j
        a[i],a[min_idx] = a[min_idx],a[i]
    return a
a=[67,33,12,76,22,11,1,34]
print(selectionSort(a,len(a)))
