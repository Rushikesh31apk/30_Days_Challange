def insertionSort(a,n):
    for i in range(1,n):
        key = a[i]
        j = i-1
        while j>=0 and key<a[j] :
            a[j+1] = a[j]
            j -= 1
        a[j+1] = key
    return a
a=[54,3,12,52,32,19,2,23]
print(insertionSort(a,len(a)))
